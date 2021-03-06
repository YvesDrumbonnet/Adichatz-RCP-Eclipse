/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 14:35:35 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.query;

import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.CompositeController;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.validation.EntityInjection;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerOpenParameterCMP extends EntityManagerCore {
	protected EntityManagerCore queryToolContainerOpenParameterDetail;
	/**
	 * Creates QueryToolContainerOpenParameterCMP.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerOpenParameterCMP(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new CompositeController("openParameterCMP", parentController, this) {
				@Override
				public void afterInstantiateController() {
					breakInjection = true;
					super.afterInstantiateController();
				}
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getComposite().setLayout(new MigLayout("wrap 1, ins 5","grow, fill","align top"));
						getControl().setLayoutData("h 40!");
					}
				}
				@Override
				public EntityInjection getEntityInjection() {
					if (null == entityInjection)
						entityInjection = new EntityInjection(this, null);
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
		
		// loads and instantiates the class QueryToolContainerOpenParameterDetail.
		queryToolContainerOpenParameterDetail  = new QueryToolContainerOpenParameterDetail(context, coreController);
	}
}