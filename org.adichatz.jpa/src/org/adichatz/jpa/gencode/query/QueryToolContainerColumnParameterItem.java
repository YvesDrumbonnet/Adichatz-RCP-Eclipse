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

import java.util.function.BooleanSupplier;
import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.nebula.PShelfController;
import org.adichatz.engine.controller.nebula.PShelfItemController;
import org.adichatz.engine.controller.utils.ElementaryAccessibility;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.jpa.query.QueryToolInput;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerColumnParameterItem extends EntityManagerCore {
	protected EntityManagerCore queryToolContainerColumnParameterCmp;
	/**
	 * Creates QueryToolContainerColumnParameterItem.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerColumnParameterItem(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new PShelfItemController("columnParameterItem", parentController, this) {
				@Override
				public void initialize() {
					BooleanSupplier evaluatorVALID;
					evaluatorVALID = new BooleanSupplier() {
						public boolean getAsBoolean() {
							return !((QueryToolInput) getEntity().getBean()).getQueryPreference().getParameter().isEmpty();
						}
					};
					addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.VALID, evaluatorVALID));
					super.initialize();
				}
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getItem().setImage(AdichatzApplication.getInstance().getImage("org.adichatz.jpa", "IMG_PARAMETER.png"));
						getItem().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "adichatzJpa", "query.parameters"));
						getComposite().setLayout(new MigLayout("wrap 1, ins 0","[grow, fill]","[grow, fill]"));
					}
				}
			};
			if (!((PShelfController) parentController).isDelayed())
				createContents();
		} else
			coreController = parentController;
	}

	/**
	 * creates contents for controller
	 */
	public void createContents(){
		
		// loads and instantiates the class QueryToolContainerColumnParameterCmp.
		queryToolContainerColumnParameterCmp  = new QueryToolContainerColumnParameterCmp(context, coreController);
	}
}