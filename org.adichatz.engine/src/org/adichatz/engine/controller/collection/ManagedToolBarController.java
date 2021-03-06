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
package org.adichatz.engine.controller.collection;

import static org.adichatz.engine.common.EngineTools.getFromEngineBundle;
import static org.adichatz.engine.common.LogBroker.logError;

import org.adichatz.engine.cache.IEntity;
import org.adichatz.engine.controller.ACollectionController;
import org.adichatz.engine.controller.APageController;
import org.adichatz.engine.controller.ICollectionController;
import org.adichatz.engine.core.ControllerCore;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;

// TODO: Auto-generated Javadoc
/**
 * The Class ToolBarController.
 */
public class ManagedToolBarController extends ACollectionController {

	/** The tool bar. */
	private ToolBar toolBar;

	/** The tool bar manager. */
	private IToolBarManager toolBarManager;

	/**
	 * Instantiates a new tool bar controller. With a toolBarManager (for SectionControlle or FormPageController)
	 * 
	 * @param id
	 *            the id
	 * @param parentController
	 *            the parent controller
	 * @param genCode
	 *            the generated code
	 */
	public ManagedToolBarController(String id, ICollectionController parentController, ControllerCore genCode) {
		super(id, parentController, genCode);
	}

	private ICollectionController getToolBarContainer(ICollectionController parentController) {
		if (parentController instanceof IncludeController)
			return getToolBarContainer(parentController.getParentController());
		return parentController;
	}

	/**
	 * Creates the tool bar manager (which is not a control for SWT).
	 */
	public void createControl() {
		ACollectionController toolBarContainer = (ACollectionController) getToolBarContainer(parentController);
		if (toolBarContainer instanceof SectionController) {
			toolBarManager = new ToolBarManager(SWT.FLAT);
			SectionController sectionController = (SectionController) toolBarContainer;
			toolBar = ((ToolBarManager) toolBarManager).createControl(sectionController.getControl());
			sectionController.setToolBar(toolBar);

			final Cursor cursor = new Cursor(Display.getCurrent(), SWT.CURSOR_HAND);
			toolBar.setCursor(cursor);
			// Cursor needs to be explicitly disposed
			toolBar.addDisposeListener((e) -> {
				if ((cursor != null) && (cursor.isDisposed() == false))
					cursor.dispose();
			});
			sectionController.getControl().setTextClient(toolBar);
		} else {
			if (toolBarContainer instanceof APageController) {
				toolBarManager = ((APageController) toolBarContainer).getControl().getToolBarManager();
			} else if (toolBarContainer instanceof ScrolledFormController) {
				toolBarManager = ((ScrolledFormController) toolBarContainer).getControl().getToolBarManager();
			} else if (toolBarContainer instanceof ContainerController) {
				toolBarManager = ((ContainerController) toolBarContainer).getToolBarManager();
			} else
				logError(getFromEngineBundle("invalid.toolbar.container", toolBarContainer.getRegisterId()));
			toolBar = ((ToolBarManager) toolBarManager).getControl();
		}
	}

	/**
	 * Gets the tool bar manager.
	 * 
	 * @return the tool bar manager
	 */
	public IToolBarManager getToolBarManager() {
		return toolBarManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.ICollectionController#getEntity()
	 */
	@Override
	public IEntity<?> getEntity() {
		return parentController.getEntity();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.AController#getControl()
	 */
	public ToolBar getControl() {
		return toolBar;
	}

	@Override
	public void endLifeCycle() {
		super.endLifeCycle();
		toolBarManager.update(true);
	}

	@Override
	public Composite getComposite() {
		return getControl();
	}
}
