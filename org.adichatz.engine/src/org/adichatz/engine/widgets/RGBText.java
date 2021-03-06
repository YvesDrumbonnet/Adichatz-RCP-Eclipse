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

import static org.adichatz.engine.common.EngineTools.getFromEngineBundle;

import java.util.Locale;

import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.common.Utilities;
import org.adichatz.engine.controller.utils.AdiSWT;
import org.adichatz.engine.renderer.AdiFormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TypedListener;

// TODO: Auto-generated Javadoc
/**
 * The Class RGBText.
 * 
 * @author Yves Drumbonnet
 * 
 */
public class RGBText extends Composite {

	/** The delete button. */
	protected Button deleteButton;

	/** The color chooser button. */
	protected Button colorChoosertButton;

	/** The color text. */
	private Text text;

	/** The value. */
	private RGB value;

	/**
	 * Instantiates a new RGB text.
	 * 
	 * @param parent
	 *            the parent
	 * @param style
	 *            the style
	 */
	public RGBText(Composite parent, final int style) {
		super(parent, SWT.BORDER | SWT.TRAIL);

		GridLayout layout = new GridLayout();
		layout.marginBottom = layout.marginTop = layout.marginWidth = layout.marginHeight = layout.verticalSpacing = layout.horizontalSpacing = 0;
		setLayout(layout);

		text = new Text(this, SWT.NONE);
		text.setLayoutData(new GridData(SWT.RIGHT));
		text.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				colorChoosertButton.setFocus();
			}
		});

		colorChoosertButton = new Button(this, SWT.ICON);
		colorChoosertButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				Shell shell = new Shell(getDisplay());
				Locale.setDefault(Locale.US);
				ColorDialog colorDialog = new ColorDialog(shell);

				Point pt = getDisplay().getCursorLocation();
				shell.setLocation(pt.x, pt.y);
				colorDialog.setRGB(value);
				RGB newRGB = colorDialog.open();
				if (null != newRGB && !Utilities.equals(value, newRGB)) {
					setValue(newRGB);
					notifyListeners(SWT.Modify, null);
				}
			}
		});

		if (0 == (style & AdiSWT.DELETE_BUTTON)) {
			deleteButton = null;
			layout.numColumns = 2;
		} else {
			layout.numColumns = 3;
			deleteButton = new Button(this, SWT.IMAGE_GIF);
			deleteButton.setToolTipText(getFromEngineBundle("field.clearValueToolTip"));
			deleteButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					setValue(null);
					notifyListeners(SWT.Modify, null);
				}
			});
		}
		setImages();

		pack();
	}

	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public Text getText() {
		return text;
	}

	public Button getColorChoosertButton() {
		return colorChoosertButton;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.widgets.Composite#setFocus()
	 */
	@Override
	public boolean setFocus() {
		return colorChoosertButton.setFocus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.widgets.Control#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		text.setEnabled(enabled);
		if (null != deleteButton)
			deleteButton.setEnabled(enabled);
		colorChoosertButton.setEnabled(enabled);
		setImages();
	}

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public RGB getValue() {
		return value;
	}

	/**
	 * Sets the images.
	 */
	protected void setImages() {
		AdiFormToolkit toolkit = AdichatzApplication.getInstance().getFormToolkit();
		GridData buttonLayout = new GridData();
		if ("win32".equals(SWT.getPlatform())) {
			ImageData id = toolkit.getRegisteredImage("IMG_DELETE").getImageData();
			buttonLayout.widthHint = id.width + 4;
			buttonLayout.heightHint = id.height + 4;
		}
		buttonLayout.grabExcessVerticalSpace = true;
		if (null != deleteButton) {
			deleteButton.setImage(toolkit.getRegisteredImage("IMG_DELETE"));
			deleteButton.setLayoutData(buttonLayout);
		}
		colorChoosertButton.setLayoutData(buttonLayout);
		Display display = getDisplay();
		text.setText((null == value) ? "" : getStringValue());
		if (null == value)
			colorChoosertButton.setImage(AdichatzApplication.getInstance().getFormToolkit().getRegisteredImage("IMG_COLOR"));
		else {
			Image colorImage = new Image(display, 16, 16);
			GC gc = new GC(colorImage);
			gc.setBackground(new Color(display, value));
			gc.fillRectangle(0, 0, 16, 16);
			gc.dispose();
			colorChoosertButton.setImage(colorImage);
		}
		pack();
	}

	public String getStringValue() {
		if (null == value)
			return null;
		return String.format("#%02X%02X%02X", value.red, value.green, value.blue);
	}

	/**
	 * Sets a new <code>RGB</code> value.
	 * 
	 * @param value
	 *            new RGB value
	 */
	public void setValue(RGB value) {
		this.value = value;
		setImages();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.widgets.Control#pack()
	 */
	@Override
	public void pack() {
		text.pack();
		super.pack();
	}

	/**
	 * Adds the listener to the collection of listeners who will be notified when the receiver's text is modified, by sending it one
	 * of the messages defined in the <code>ModifyListener</code> interface.
	 * 
	 * @param listener
	 *            the listener
	 * 
	 * @see ModifyListener
	 * @see #removeModifyListener
	 */
	public void addModifyListener(ModifyListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener(listener);
		addListener(SWT.Modify, typedListener);
	}

	/**
	 * Removes the modify listener.
	 * 
	 * @param listener
	 *            the listener
	 */
	public void removeModifyListener(ModifyListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.Modify, listener);
	}
}
