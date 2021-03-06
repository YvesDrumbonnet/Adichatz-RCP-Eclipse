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
package org.adichatz.engine.controller.nebula;

import static org.adichatz.engine.common.EngineTools.getFromEngineBundle;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.ATabularController;
import org.adichatz.engine.controller.field.AColumnController;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.renderer.AdiFormToolkit;
import org.adichatz.engine.widgets.LimitedComposite;
import org.eclipse.nebula.jface.gridviewer.GridTableViewer;
import org.eclipse.nebula.jface.gridviewer.GridViewerColumn;
import org.eclipse.nebula.widgets.grid.Grid;
import org.eclipse.nebula.widgets.grid.GridColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Item;

// TODO: Auto-generated Javadoc
/**
 * The Class TableController.
 * 
 * @param <T>
 *            the
 * @author Yves Drumbonnet
 *
 */
public class GridController<T> extends ATabularController<T> {

	/** The grid. */
	protected Grid grid;

	/**
	 * Instantiates a new grid controller.
	 * 
	 * @param id
	 *            the id
	 * @param parentController
	 *            the parent controller
	 * @param genCode
	 *            the gen code
	 * @param pluginResources
	 *            the plugin resources
	 */
	public GridController(String id, IContainerController parentController, ControllerCore genCode) {
		super(id, parentController, genCode);
		style = SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL;
	}

	/**
	 * Creates the control.
	 */
	@Override
	public void internalCreateControl() {
		composite = new LimitedComposite(parentController.getComposite(), containerStyle);
		grid = new Grid(composite, style);
		grid.setHeaderVisible(true);

		grid.setLayoutData("h 0:n:n, w 0:n:n");
		viewer = new GridTableViewer(grid);
	}

	@Override
	public Grid getControl() {
		return grid;
	}

	@Override
	public Item getSelectedItem() {
		if (null == grid.getSelection())
			return null;
		return grid.getSelection()[0];
	}

	@Override
	public void processRightClickMouseEvent(Point point) {
		rightClickColumnController = null;
		GridColumn gridColumn = grid.getColumn(point);
		if (null != gridColumn)
			for (AColumnController<T> columnController : getColumnMap().values()) {
				GridViewerColumn gridViewerColumn = (GridViewerColumn) columnController.getControl();
				if (null != gridViewerColumn && gridViewerColumn.getColumn().equals(gridColumn)) {
					rightClickColumnController = columnController;
					break;
				}
			}
	}

	@Override
	public Object invokeControlMethod(METHOD_NAME methodName, Object... params) {
		switch (methodName) {
		case getColumnCount:
			return grid.getColumnCount();
		case getColumnOrder:
			return grid.getColumnOrder();
		case getHeaderHeight:
			return grid.getHeaderHeight();
		case setColumnOrder:
			int[] columnOrder = (int[]) params[0];
			if (null != columnOrder)
				grid.setColumnOrder(columnOrder);
			return null;
		case getItems:
			return grid.getItems();
		case getItemCount:
			return grid.getItemCount();
		case getSelectionIndex:
			return grid.getSelectionIndex();
		case setTopIndex:
			grid.setTopIndex(grid.getSelectionIndex());
			return null;
		case setRedraw:
			grid.setRedraw((boolean) params[0]);
			return null;
		case addSelectionListener:
			grid.addSelectionListener((SelectionListener) params[0]);
			return null;
		case copyToClipBoard:
			AdiFormToolkit tookit = AdichatzApplication.getInstance().getFormToolkit();
			Image checkedImage = tookit.getRegisteredImage("IMG_CHECKED");
			Image uncheckedImage = tookit.getRegisteredImage("IMG_UNCHECKED");

			// Define a writer
			StringWriter buf = new StringWriter();
			PrintWriter writer = new PrintWriter(buf);

			// writes the header
			writer.print(getFromEngineBundle("lineNumber"));
			for (int columnIndex : grid.getColumnOrder()) {
				GridColumn gridColumn = grid.getColumns()[columnIndex];
				if (0 < gridColumn.getWidth())
					writer.print("\t" + grid.getColumns()[columnIndex].getText());
			}

			int lineNumber = 1;
			// writes the rows
			for (int rowIndex = 0; rowIndex < grid.getItems().length; rowIndex++) {
				writer.println();
				writer.print(lineNumber++);
				for (int columnIndex : grid.getColumnOrder()) {
					if (0 < grid.getColumns()[columnIndex].getWidth()) {
						String text = grid.getItems()[rowIndex].getText(columnIndex);
						if ("".equals(text)) {
							Image image = grid.getItems()[rowIndex].getImage(columnIndex);
							if (null != image)
								if (image.equals(checkedImage))
									text = "true";
								else if (image.equals(uncheckedImage))
									text = "false";
						}
						writer.print("\t" + text);
					}
				}
			}

			writer.close();

			Clipboard clipboard = new Clipboard(composite.getDisplay());
			Object[] o = new Object[] { buf.toString() };
			Transfer[] t = new Transfer[] { TextTransfer.getInstance() };
			clipboard.setContents(o, t);
			clipboard.dispose();
			return null;
		default:
			throw new RuntimeException("Method " + methodName.name() + " is not implemented in Tabular controller!");
		}
	}
}
