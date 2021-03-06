/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 14:35:36 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.query;

import java.util.function.BooleanSupplier;
import org.adichatz.engine.controller.ASetController;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.action.ActionController;
import org.adichatz.engine.controller.collection.MenuManagerController;
import org.adichatz.engine.controller.utils.ElementaryAccessibility;
import org.adichatz.engine.core.ATreeCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.jpa.query.action.CopyTextAction;
import org.adichatz.jpa.query.custom.AdditionalClausesTreeController;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerParameterTree extends ATreeCore {
	// the MenuManagerController additionalClauseContextMenuMM.
	protected MenuManagerController additionalClauseContextMenuMM;
	// the ActionController copyTextNameACT.
	private ActionController copyTextNameACT;
	public QueryToolContainerParameterTree(final AdiContext context, IContainerController parentController) {
		super(context);
		treeController = new AdditionalClausesTreeController("parameterTree", parentController, this) {
			@Override
			public void createControl() {
				if (isValid()) {
					levelToExpand = -1;
				}
				super.createControl();
				if (isValid()) {
					getControl().setHeaderVisible(false);
					getControl().setLayoutData("h 100:n:n");
				}
			}
		};
		coreController = treeController;
		
		
		// Add context menu
		// Creates control for MenuManagerController additionalClauseContextMenuMM
		additionalClauseContextMenuMM = new MenuManagerController("additionalClauseContextMenu", treeController, this) {
			@Override
			public void startLifeCycle() {
				super.startLifeCycle();
					// Creates control for ActionController copyTextNameACT
					copyTextNameACT = new ActionController("copyTextName", additionalClauseContextMenuMM, QueryToolContainerParameterTree.this) {
						@Override
						public void initialize() {
							super.initialize();
							BooleanSupplier evaluatorENABLED;
							evaluatorENABLED = new BooleanSupplier() {
								public boolean getAsBoolean() {
									return null != ((ASetController) getMenuContainer()).getSelectedObject();
								}
							};
							addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.ENABLED, evaluatorENABLED));
						}
						@Override
						public void createControl() {
							if (isValid()) {
								action = new CopyTextAction();
								action.setActionController(this);
							}
							super.createControl();
						}
					};
			}
		};
	}
}