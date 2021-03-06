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
package org.adichatz.engine.indigo.controller;

import org.adichatz.engine.cache.IEntity;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.APageController;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.IDirtyableForm;
import org.adichatz.engine.controller.IToolBarContainerController;
import org.adichatz.engine.controller.collection.ManagedToolBarController;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.extra.FormMessageManager;
import org.adichatz.engine.validation.ABindingService;

// TODO: Auto-generated Javadoc
/**
 * The Class FormPageController.
 */
public class LegacyFormPageController extends APageController implements IToolBarContainerController, IDirtyableForm {

	/** The binding service. */
	private ABindingService bindingService;

	/** dirty (true means that an entity data has been updated). */
	protected boolean dirty = false;

	/** The form message manager. */
	private FormMessageManager formMessageManager;

	/** The managed tool bar controller. */
	private ManagedToolBarController mToolBarCtler;

	/** true if manage form message. */
	private boolean manageFormMessage = true;

	/**
	 * Instantiates a new a form page controller.
	 * 
	 * @param id
	 *            the id
	 * @param parentController
	 *            the parent controller
	 * @param genCode
	 *            the generated code
	 * @param pluginResources
	 *            the plugin resources
	 */
	public LegacyFormPageController(String id, IContainerController parentController, ControllerCore genCode) {
		super(id, parentController, genCode);
		bindingService = parentController.getBindingService();
	}

	/**
	 * Creates the control.
	 */
	public void createControl() {
		composite = scrolledForm.getBody();
		// gives head grandient color even when there is no FormMesageManager (validator)
		AdichatzApplication.getInstance().getFormToolkit().decorateFormHeading(scrolledForm.getForm());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.IDirtyableForm#getFormMessageManager()
	 */
	public FormMessageManager getFormMessageManager() {
		if (null == formMessageManager)
			formMessageManager = new FormMessageManager(scrolledForm.getForm());
		return formMessageManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.IDirtyableForm#hasFormMessageManager()
	 */
	@Override
	public boolean isFormMessageManager() {
		return manageFormMessage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.IDirtyableForm#setFormMessageManager(boolean)
	 */
	public void setMessageManager(boolean manageFormMessage) {
		this.manageFormMessage = manageFormMessage;
	}

	/**
	 * Gets the tool bar controller.
	 * 
	 * @return the tool bar controller
	 */
	public ManagedToolBarController getMToolBarCtler() {
		if (null == mToolBarCtler) {
			mToolBarCtler = new ManagedToolBarController("Internal$$FormToolBarController", this, genCode);
			mToolBarCtler.createControl();
		}
		return mToolBarCtler;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.AWidgetController#getBindingService()
	 */
	@Override
	public ABindingService getBindingService() {
		return bindingService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.IDirtyableForm#initBindingService()
	 */
	@Override
	public void setBindingService(ABindingService bindingService) {
		this.bindingService = bindingService;
	}

	/**
	 * Gets the initial entity.
	 * 
	 * CAUTION! this method is intended to be overriden when Form Page controller receives a different entity.
	 * 
	 * @return the initial entity
	 */
	public IEntity<?> getInitialEntity() {
		return parentController.getEntity();
	}

}
