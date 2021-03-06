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
package org.adichatz.engine.widgets;

import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.common.LogBroker;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;

// TODO: Auto-generated Javadoc
/**
 * The Class AdiControlDecoration.
 * 
 * @author Yves Drumbonnet
 * 
 */
public class AdiControlDecoration extends ControlDecoration {

	/** The required decorator image. */
	private static Image requiredDecImage;

	/** The content proposal decorator image. */
	private static Image contentProposalDecImage;

	/** The info decorator image. */
	private static Image infoDecImage;

	/** The warning decorator image. */
	private static Image warningDecImage;

	/** The error decorator image. */
	private static Image errorDecImage;

	/** The error qf decorator image. */
	private static Image errorQfDecImage;

	/** The widget open image. */
	private static Image widgetWidgetOpen;

	/** The Constant REQUIRED_DECORATOR_IMAGE. */
	public static final int REQUIRED_DECORATOR_IMAGE = 0;

	/** The Constant CONTENT_PROPOSSAL_DECORATOR_IMAGE. */
	public static final int CONTENT_PROPOSSAL_DECORATOR_IMAGE = 1;

	/** The Constant INFO_DECORATOR_IMAGE. */
	public static final int INFO_DECORATOR_IMAGE = 2;

	/** The Constant WARNING_DECORATOR_IMAGE. */
	public static final int WARNING_DECORATOR_IMAGE = 3;

	/** The Constant ERROR_DECORATOR_IMAGE. */
	public static final int ERROR_DECORATOR_IMAGE = 4;

	/** The Constant ERRORQF_DECORATOR_IMAGE. */
	public static final int ERRORQF_DECORATOR_IMAGE = 5;

	/** The Constant WIDGET_OPEN_IMAGE. */
	public static final int WIDGET_WIDGET_OPEN = 6;

	/**
	 * Instantiates a new adi control decoration.
	 * 
	 * @param control
	 *            the control
	 * @param position
	 *            the position
	 * @param image
	 *            the image
	 */
	public AdiControlDecoration(Control control, int position, int image) {
		super(control, position);
		switch (image) {
		case REQUIRED_DECORATOR_IMAGE:
			if (null == requiredDecImage)
				requiredDecImage = ImageDescriptor
						.createFromFile(FieldDecorationRegistry.class, "images/required_field_cue.png").createImage();
			setImage(requiredDecImage);
			break;
		case CONTENT_PROPOSSAL_DECORATOR_IMAGE:
			if (null == contentProposalDecImage)
				contentProposalDecImage = ImageDescriptor
						.createFromFile(FieldDecorationRegistry.class, "images/contassist_ovr.png").createImage();
			setImage(contentProposalDecImage);
			break;
		case INFO_DECORATOR_IMAGE:
			if (null == infoDecImage)
				infoDecImage = ImageDescriptor.createFromFile(FieldDecorationRegistry.class, "images/info_ovr.png")
						.createImage();
			setImage(infoDecImage);
			break;
		case WARNING_DECORATOR_IMAGE:
			if (null == warningDecImage)
				warningDecImage = ImageDescriptor.createFromFile(FieldDecorationRegistry.class, "images/warn_ovr.png")
						.createImage();
			setImage(warningDecImage);
			break;
		case ERROR_DECORATOR_IMAGE:
			if (null == errorDecImage)
				errorDecImage = ImageDescriptor.createFromFile(FieldDecorationRegistry.class, "images/error_ovr.png")
						.createImage();
			setImage(errorDecImage);
			break;
		case ERRORQF_DECORATOR_IMAGE:
			if (null == errorQfDecImage)
				errorQfDecImage = ImageDescriptor
						.createFromFile(FieldDecorationRegistry.class, "images/errorqf_ovr.png").createImage();
			setImage(errorQfDecImage);
			break;
		case WIDGET_WIDGET_OPEN:
			if (null == widgetWidgetOpen)
				widgetWidgetOpen = AdichatzApplication.getInstance().getFormToolkit()
						.getRegisteredImage("IMG_WIDGET_OPEN");
			setImage(widgetWidgetOpen);
			break;
		default:
			LogBroker.logError("Invalid image choice!");
			break;
		}
	}
}
