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

import java.util.ArrayList;
import java.util.List;

import net.miginfocom.swt.MigLayout;

import org.adichatz.engine.cache.IEntity;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.ACollectionController;
import org.adichatz.engine.controller.ICollectionController;
import org.adichatz.engine.controller.action.ActionController;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.renderer.AdiFormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonBarController.
 */
public class ButtonBarController extends ACollectionController {

	/** The actions. */
	private final List<ActionController> actions = new ArrayList<ActionController>();

	/** The bar composite. */
	private Composite barComposite;

	/**
	 * Instantiates a new button bar controller.
	 * 
	 * @param id
	 *            the id
	 * @param parentController
	 *            the parent controller
	 * @param genCode
	 *            the generated code
	 */
	public ButtonBarController(String id, ICollectionController parentController, ControllerCore genCode) {
		super(id, parentController, genCode);
	}

	/**
	 * Creates the tool bar manager (which is not a control for SWT).
	 */
	public void createControl() {
		AdiFormToolkit toolkit = AdichatzApplication.getInstance().getFormToolkit();
		// new Shell() ==> parent composite is specified later
		// @see org.adichatz.engine.controller.collection.ButtonBarController#setParent(org.eclipse.swt.widgets.Composite)
		barComposite = toolkit.createComposite(parentController.getComposite());
		// addCompositeSeparator(true);
		composite = toolkit.createComposite(barComposite);
		if (0 != (getStyle() & SWT.HORIZONTAL)) {
			composite.setLayout(new MigLayout("ins 0"));
			composite.setLayoutData("grow, width n:100:n");
			barComposite.setLayout(new MigLayout("inset 0, wrap", "grow", "grow"));
		} else {
			composite.setLayout(new MigLayout("wrap 1, ins 0", "grow,fill"));
			composite.setLayoutData("grow, width n:100:n, ay top");
			barComposite.setLayout(new MigLayout("inset 0", "grow", "grow"));
		}
		barComposite.setLayoutData("grow");
	}

	/**
	 * Add a separator amongst actions.
	 * 
	 * @param layoutData
	 *            the layout data
	 */
	public void addSeparator(String layoutData) {
		new Label(composite, SWT.SEPARATOR | (0 != (getStyle() & SWT.VERTICAL) ? SWT.HORIZONTAL : SWT.VERTICAL))
				.setLayoutData(layoutData);
	}

	/**
	 * Gets the actions.
	 * 
	 * @return the actions
	 */
	public List<ActionController> getActions() {
		return actions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.controller.AController#getControl()
	 */
	@Override
	public Composite getControl() {
		return composite;
	}

	/**
	 * Sets the parent.
	 * 
	 * @param composite
	 *            the new parent
	 */
	public void setParent(Composite composite) {
		barComposite.setParent(composite);
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

}
