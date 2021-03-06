/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 14:35:33 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.query;

import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.controller.AWidgetController;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.CompositeController;
import org.adichatz.engine.core.ATabularCore;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.validation.EntityInjection;
import org.adichatz.jpa.query.QueryToolInput;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerColumnParameterCmp extends EntityManagerCore {
	protected ATabularCore queryToolContainerParameterTable;
	protected EntityManagerCore queryToolContainerColumnParameterGroup;
	/**
	 * Creates QueryToolContainerColumnParameterCmp.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerColumnParameterCmp(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new CompositeController("columnParameterCmp", parentController, this) {
				@Override
				public void afterInstantiateController() {
					breakInjection = true;
					super.afterInstantiateController();
				}
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getComposite().setLayout(new MigLayout("wrap 1, ins 0","grow, fill","[grow, fill][]"));
					}
				}
				@Override
				public EntityInjection getEntityInjection() {
					if (null == entityInjection)
						entityInjection = new EntityInjection(this, getDataAccess().getDataCache().fetchEntity(((QueryToolInput) ((AWidgetController) getFromRegister("queryTool")).getEntity().getBean()).getQueryPreference()));
					return entityInjection;
				}
			};
			createContents();
		} else
			coreController = parentController;
	}

	/**
	 * creates contents for controller
	 */
	public void createContents(){
		
		// loads and instantiates the class QueryToolContainerParameterTable.
		queryToolContainerParameterTable  = new QueryToolContainerParameterTable(context, coreController);
		
		// loads and instantiates the class QueryToolContainerColumnParameterGroup.
		queryToolContainerColumnParameterGroup  = new QueryToolContainerColumnParameterGroup(context, coreController);
	}
}