/*******************************************************************************
 * Copyright � Adichatz (2007-2020) - www.adichatz.org
 * 
 * yves@adichatz.org
 * 
 * This software is a computer program whose purpose is to build easily
 * Eclipse RCP applications using JPA in a JEE or JSE context.
 * 
 * This software is governed by the CeCILL-C license under French law and
 * abiding by the rules of distribution of free software.  You can  use, 
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info". 
 * 
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability. 
 * 
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or 
 * data to be ensured and,  more generally, to use and operate it in the 
 * same conditions as regards security. 
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 *
 * 
 ********************************************************************************
 * 
 * Copyright � Adichatz (2007-2020) - www.adichatz.org
 * 
 * yves@adichatz.org
 * 
 * Ce logiciel est un programme informatique servant � construire rapidement des
 * applications Eclipse RCP en utilisant JPA dans un contexte JSE ou JEE. 
 * 
 * Ce logiciel est r�gi par la licence CeCILL-C soumise au droit fran�ais et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffus�e par le CEA, le CNRS et l'INRIA 
 * sur le site "http://www.cecill.info".
 * 
 * En contrepartie de l'accessibilit� au code source et des droits de copie,
 * de modification et de redistribution accord�s par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limit�e.  Pour les m�mes raisons,
 * seule une responsabilit� restreinte p�se sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les conc�dants successifs.
 * 
 * A cet �gard  l'attention de l'utilisateur est attir�e sur les risques
 * associ�s au chargement,  � l'utilisation,  � la modification et/ou au
 * d�veloppement et � la reproduction du logiciel par l'utilisateur �tant 
 * donn� sa sp�cificit� de logiciel libre, qui peut le rendre complexe � 
 * manipuler et qui le r�serve donc � des d�veloppeurs et des professionnels
 * avertis poss�dant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invit�s � charger  et  tester  l'ad�quation  du
 * logiciel � leurs besoins dans des conditions permettant d'assurer la
 * s�curit� de leurs syst�mes et ou de leurs donn�es et, plus g�n�ralement, 
 * � l'utiliser et l'exploiter dans les m�mes conditions de s�curit�. 
 * 
 * Le fait que vous puissiez acc�der � cet en-t�te signifie que vous avez 
 * pris connaissance de la licence CeCILL, et que vous en avez accept� les
 * termes.
 *******************************************************************************/
package org.adichatz.jpa.action;

import static org.adichatz.engine.common.EngineTools.getFromEngineBundle;
import static org.adichatz.jpa.extra.JPAUtil.getFromJpaBundle;

import org.adichatz.common.ejb.util.IEntityConstants;
import org.adichatz.engine.action.ADetailAction;
import org.adichatz.engine.cache.IEntity;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.common.ApplicationEvent;
import org.adichatz.engine.common.ApplicationEvent.EVENT_TYPE;
import org.adichatz.engine.common.EngineTools;
import org.adichatz.engine.common.MessageUtility;
import org.adichatz.engine.common.Utilities;
import org.adichatz.engine.listener.IEventType;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.engine.validation.ABindingService;
import org.eclipse.jface.dialogs.MessageDialog;

// TODO: Auto-generated Javadoc
/**
 * The Class RefreshEntityAction.
 * 
 * @author Yves Drumbonnet
 * 
 */
public class RefreshEntityAction extends ADetailAction {

	/** The is refreshing root entity. */
	private boolean isRefreshingRootEntity;

	/**
	 * Instantiates a new refresh entity action.
	 */
	public void init() {
		String text = getFromJpaBundle("detail.refreshEntity");
		setText(text);
		setToolTipText(text);
		setImageDescriptor(AdichatzApplication.getInstance().getFormToolkit().getRegisteredImageDescriptor("IMG_ENTITY_REFRESH"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void runAction() {
		IEntity<?> entity = entityManagerController.getEntity();

		if (entity.getLockingBindingService() != null
				&& !entity.getLockingBindingService().equals(entityManagerController.getBindingService())) {

			// Send message <<Entity was locked in another editor>>
			// User can continue skipping the current entity or cancel the refresh process.
			MessageUtility.displayEntityMessage(entity, getFromEngineBundle("detail.entityLockedInOtherEnvironment"),
					getFromJpaBundle("detail.entityCannotBeRefreshedInEnvironment"), true);
			return;
		}
		if (IEntityConstants.RETRIEVE == entity.getStatus() || EngineTools.openDialog(MessageDialog.CONFIRM,
				getFromJpaBundle("detail.refreshingRecord"), getFromJpaBundle("detail.confirmRefreshingRecord"))) {

			entityManagerController.getBindingService().refreshEntities(entity);

			ABindingService.setForceRefreshing(false);

			if (IEntityConstants.PERSIST != entity.getStatus()) {
				entityManagerController.validateFields();
			} else if (isRefreshingRootEntity) { // Recreate a new entity for editor
				PluginEntity<?> pluginEntity = entity.getEntityMM().getPluginEntity();
				IEntity<?> newEntity = pluginEntity.getEntityMetaModel().getDataAccess().getDataCache()
						.putNewEntity(pluginEntity.getUIBeanClass());
				entityManagerController.getEntityInjection().initialize(newEntity);
				newEntity.lock(true, entityManagerController.getBindingService());
				entityManagerController.endLifeCycleAndSync();
				entityManagerController.validateFields();
				AdichatzApplication.fireListener(new ApplicationEvent(EVENT_TYPE.POST_CYCLE, entityManagerController));
			} else { // Refresh a new entity (delete)
				entityManagerController.disposeEntityInjections();
				entityManagerController.getBindingService().fireListener(IEventType.DIRTY_VALIDATION);
			}
		}
	}

	/**
	 * Enable.
	 * 
	 * @param entity
	 *            the entity
	 * 
	 * @return true, if successful
	 */
	protected boolean enable(IEntity<?> entity) {
		if (null == entity)
			return false;
		switch (entity.getStatus()) {
		case IEntityConstants.RETRIEVE:
			return true;
		case IEntityConstants.MERGE:
		case IEntityConstants.PERSIST:
			return null != entity.getLockingBindingService()
					&& entity.getLockingBindingService().equals(entityManagerController.getBindingService());
		default:
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.action.ADetailAction#postCreate()
	 */
	@Override
	public void postCreate() {
		super.postCreate();
		if (!isRefreshingRootEntity) {
			isRefreshingRootEntity = null != entityManagerController.getRootCore().getController() // (When using popup window)
					&& Utilities.equals(entityManagerController.getEntity(),
							entityManagerController.getRootCore().getController().getEntity());
		}
	}
}
