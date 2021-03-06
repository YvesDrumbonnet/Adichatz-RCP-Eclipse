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
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.nebula.PShelfController;
import org.adichatz.engine.controller.nebula.PShelfItemController;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerPaginationItem extends EntityManagerCore {
	protected EntityManagerCore queryToolContainerPaginationCmp;
	protected EntityManagerCore queryToolContainerStatusCmp;
	/**
	 * Creates QueryToolContainerPaginationItem.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerPaginationItem(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new PShelfItemController("paginationItem", parentController, this) {
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getItem().setImage(AdichatzApplication.getInstance().getImage("org.adichatz.jpa", "IMG_PAGINATION.png"));
						getItem().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "adichatzJpa", "query.pagination"));
						getComposite().setLayout(new MigLayout("wrap 1, ins 0","[grow,fill]",null));
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
		
		// loads and instantiates the class QueryToolContainerPaginationCmp.
		queryToolContainerPaginationCmp  = new QueryToolContainerPaginationCmp(context, coreController);
		
		// loads and instantiates the class QueryToolContainerStatusCmp.
		queryToolContainerStatusCmp  = new QueryToolContainerStatusCmp(context, coreController);
	}
}