/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 07 15:54:06 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.editor;

import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.field.TableColumnController;
import org.adichatz.engine.core.ATabularCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.extra.ColumnViewerSorter;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.tabular.ATabularContentProvider;
import org.adichatz.engine.viewer.NativeContentProvider;
import org.adichatz.generator.xjc.GeneratorType;
import org.adichatz.studio.xjc.controller.FeaturesTableController;

@AdiResourceURI(URI="adi://org.adichatz.studio/editor/ScenarioEditor")
public class ScenarioEditorGeneratorsTable extends ATabularCore<GeneratorType> {
	// the TableColumnController treeClassNameTCTC.
	private TableColumnController treeClassNameTCTC;
	// the TableColumnController generatorClassNameTCTC.
	private TableColumnController generatorClassNameTCTC;
	public ScenarioEditorGeneratorsTable(final AdiContext context, IContainerController parentController) {
		super(context);
		tabularController = new FeaturesTableController<GeneratorType>("generatorsTable", parentController, this) {
			@Override
			public void createControl() {
				if (isValid()) {
					beanClass = GeneratorType.class;
				}
				super.createControl();
				if (isValid()) {
					ATabularContentProvider contentProvider$1 = new NativeContentProvider("generator");
					contentProvider$1.setTabularController(tabularController);
					getControl().setLayoutData("h 0:n:n, w 0:n:n");
				}
			}
		};
		tabularController.setPluginResources(AdichatzApplication.getPluginResources("org.adichatz.studio"));
		coreController = tabularController;
		
		// Creates control for TableColumnController treeClassNameTCTC
		treeClassNameTCTC = new TableColumnController<GeneratorType>("treeClassNameTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setImage(AdichatzApplication.getInstance().getImage("org.adichatz.studio", "IMG_GENERATE_JAVA.png"));
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "generator", "treeClassName"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(GeneratorType row) {
				return row.getTreeClassName();
			}
			@Override
			public String getColumnText(GeneratorType row) {
				return row.getTreeClassName();
			}
		};
		// Creates control for TableColumnController generatorClassNameTCTC
		generatorClassNameTCTC = new TableColumnController<GeneratorType>("generatorClassNameTC", tabularController) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().getColumn().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "generator", "generatorClassName"));
					setColumnViewerSorter(ColumnViewerSorter.ASC);
				}
			}
			@Override
			public String getValue(GeneratorType row) {
				return row.getGeneratorClassName();
			}
			@Override
			public String getColumnText(GeneratorType row) {
				return row.getGeneratorClassName();
			}
		};
	}
	
	@Override
	public Object getId(Object element) {
		return null;
	}
}