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
package org.adichatz.studio.xjc.controller;

import static org.adichatz.studio.util.StudioUtil.getFromStudioBundle;

import java.util.ArrayList;
import java.util.List;

import org.adichatz.engine.common.AdiPluginResources;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.engine.validation.AValidator;
import org.adichatz.generator.wrapper.PluginEntityWrapper;
import org.adichatz.scenario.ScenarioResources;
import org.adichatz.studio.StudioRcpPlugin;
import org.adichatz.studio.util.IStudioConstants;
import org.adichatz.studio.xjc.data.XjcBindingService;
import org.adichatz.studio.xjc.editor.InternalTreeFormEditor;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.preference.IPreferenceStore;

// TODO: Auto-generated Javadoc
/**
 * The Class BeanClassTextController.
 *
 * @author Yves Arpheuil
 */
public class BeanClassTextController extends ProposalTextController {

	/** The store. */
	protected static IPreferenceStore store = StudioRcpPlugin.getDefault().getPreferenceStore();

	/** The plugin resources. */
	private AdiPluginResources pluginResources;

	/**
	 * Instantiates a new bean class text controller.
	 *
	 * @param id the id
	 * @param parentController the parent controller
	 * @param genCode the gen code
	 */
	public BeanClassTextController(String id, IContainerController parentController, ControllerCore genCode) {
		super(id, parentController, genCode);
	}

	/**
	 * Creates the control.
	 */
	@Override
	public void createControl() {
		super.createControl();
		addValidator(new AValidator(this, "studio.bean.class") {
			@Override
			public int validate() {
				String className = control.getText();
				if ("" != className) {
					Class<?> clazz = getPluginResources().getGencodePath().getClazz(className, true);
					if (null == clazz)
						return setLevel(Integer.parseInt(store.getString(IStudioConstants.LEVEL_CONTROLLER_CLASS)),
								getFromStudioBundle("studio.invalid.class", className, pluginResources.getPluginName()));
					else
						return setLevel(IMessageProvider.NONE, null);
				} else
					return setLevel(IMessageProvider.NONE, null);
			}
		});

	}

	/**
	 * Gets the plugin resources.
	 *
	 * @return the plugin resources
	 */
	private AdiPluginResources getPluginResources() {
		if (null == pluginResources) {
			String pluginKey = ((PluginEntityWrapper) getEntity().getBean()).getEntityKeys()[0];
			pluginResources = ScenarioResources.getInstance(pluginKey, null).getPluginResources();
		}
		return pluginResources;
	}

	/**
	 * Gets the proposals.
	 *
	 * @return the proposals
	 */
	protected List<?> getProposals() {
		List<String> list = new ArrayList<String>();
		if (!(((XjcBindingService) getBindingService()).getEditor() instanceof InternalTreeFormEditor)) {
			PluginEntityWrapper pluginEntityWrapper = (PluginEntityWrapper) getEntity().getBean();
			PluginEntity pluginEntity = getPluginResources().getPluginEntity(pluginEntityWrapper.getEntityURI());
			if (null != pluginEntity)
				list.add(pluginEntityWrapper.getBeanClass().getName());
		}
		return list;
	}
}
