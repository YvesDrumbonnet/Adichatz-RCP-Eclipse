/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 12:39:59 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.jpa;

import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.AWidgetController;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.TableController;
import org.adichatz.engine.controller.field.TableColumnController;
import org.adichatz.engine.core.ATabularCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.extra.ColumnViewerSorter;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.tabular.ATabularContentProvider;
import org.adichatz.engine.validation.ErrorPath;
import org.adichatz.engine.viewer.NativeContentProvider;
import org.adichatz.jpa.editor.EditorOutlineInput;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;

@AdiResourceURI(URI="adi://org.adichatz.jpa/jpa/EditorToolContainer")
public class EditorToolContainerErrorPathsTable extends ATabularCore<ErrorPath> {
	// the TableColumnController pageTCTC.
	private TableColumnController pageTCTC;
	// the TableColumnController entityIdTCTC.
	private TableColumnController entityIdTCTC;
	// the TableColumnController entityBeanIdTCTC.
	private TableColumnController entityBeanIdTCTC;
	// the TableColumnController fieldTCTC.
	private TableColumnController fieldTCTC;
	// the TableColumnController messageTCTC.
	private TableColumnController messageTCTC;
	public EditorToolContainerErrorPathsTable(final AdiContext context, IContainerController parentController) {
		super(context);
		tabularController = new TableController<ErrorPath>("errorPathsTable", parentController, this) {
			@Override
			public void createControl() {
				if (isValid()) {
					beanClass = ErrorPath.class;
				}
				super.createControl();
				if (isValid()) {
					ATabularContentProvider contentProvider$1 = new NativeContentProvider("errorPaths");
					contentProvider$1.setTabularController(tabularController);
					getControl().setLayoutData("height 0:n:n, w 0:n:n");
				}
			}
			@Override
			public void synchronize() {
				super.synchronize();
				if (isValid()) {
					IDoubleClickListener errorPathsTableLSTN$0 = new IDoubleClickListener() {
						@Override
						public void doubleClick(DoubleClickEvent event) {
							((EditorOutlineInput) ((AWidgetController) getFromRegister("editorOutline")).getEntity().getBean()).activateControllers(getSelectedObject());
						}
					};
					getViewer().addDoubleClickListener(errorPathsTableLSTN$0);
				}
			}
		};
		tabularController.setPluginResources(AdichatzApplication.getPluginResources("org.adichatz.jpa"));
		coreController = tabularController;
		
		// Creates control for TableColumnController pageTCTC
		pageTCTC = new TableColumnController<ErrorPath>("pageTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "editorOutline", "page"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(ErrorPath row) {
				return row.getPage();
			}
			@Override
			public String getColumnText(ErrorPath row) {
				return row.getPage();
			}
		};
		// Creates control for TableColumnController entityIdTCTC
		entityIdTCTC = new TableColumnController<ErrorPath>("entityIdTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "editorOutline", "entity"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(ErrorPath row) {
				return row.getEntityId();
			}
			@Override
			public String getColumnText(ErrorPath row) {
				return row.getEntityId();
			}
		};
		// Creates control for TableColumnController entityBeanIdTCTC
		entityBeanIdTCTC = new TableColumnController<ErrorPath>("entityBeanIdTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "editorOutline", "identifier"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(ErrorPath row) {
				return row.getEntityBeanId();
			}
			@Override
			public String getColumnText(ErrorPath row) {
				return row.getEntityBeanId();
			}
		};
		// Creates control for TableColumnController fieldTCTC
		fieldTCTC = new TableColumnController<ErrorPath>("fieldTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "editorOutline", "field"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(ErrorPath row) {
				return row.getField();
			}
			@Override
			public String getColumnText(ErrorPath row) {
				return row.getField();
			}
		};
		// Creates control for TableColumnController messageTCTC
		messageTCTC = new TableColumnController<ErrorPath>("messageTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "editorOutline", "message"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(ErrorPath row) {
				return getColumnText(row);
			}
			@Override
			public String getColumnText(ErrorPath row) {
				return String.valueOf(row.getErrorMessage().getMessageStr());
			}
		};
	}
	
	@Override
	public Object getId(Object element) {
		return null;
	}
}