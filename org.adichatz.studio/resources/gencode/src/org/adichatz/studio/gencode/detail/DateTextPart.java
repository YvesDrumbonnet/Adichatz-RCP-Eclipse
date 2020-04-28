/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Tue Apr 28 15:52:25 CEST 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.detail;

import org.adichatz.engine.common.AdiPluginResources;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.ContainerController;
import org.adichatz.engine.controller.nebula.PShelfController;
import org.adichatz.engine.core.AContainerCore;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.plugin.ParamMap;
import org.adichatz.engine.plugin.RegisterEntry;

@AdiResourceURI(URI="adi://org.adichatz.studio/detail/DateTextPart")
public class DateTextPart extends AContainerCore {
	// the PShelfController detailPShelfPS.
	protected PShelfController detailPShelfPS;
	protected ControllerCore dateTextPartBasicItem;
	protected ControllerCore dateTextPartLifeCycleItem;
	protected ControllerCore dateTextPartControlItem;
	/**
	 * Instantiates a new DateTextPart.
	 * 
	 * This constructor could be used by dynamic controller.
	 * 
	 * @param parentContext
	 *            the parent context
	 * @param parentController
	 *            the parent controller
	 */
	public DateTextPart(AdiContext parentContext, IContainerController parentController) {
		super(null, parentController, null);
		coreController = parentController;
	}

	/**
	 * Creates the part DateTextPart.
	 *
	 * @param pluginResources
	 *            the plugin resources
	 * @param coreController
	 *            the parent controller
	 * @param paramMap
	 *            the param map
	*/
	public DateTextPart(AdiPluginResources pluginResources, IContainerController coreController, ParamMap paramMap) {
		super(pluginResources, coreController, paramMap);
		ContainerController containerController = (ContainerController) coreController;
		getRegister().put("detailPart", new RegisterEntry<ContainerController>(containerController, ContainerController.class));
		createContents();
	}

	/**
	 * creates contents
	 */
	public void createContents(){
		// Creates control for PShelfController detailPShelfPS
		detailPShelfPS = new PShelfController("detailPShelf", coreController, this) {
			@Override
			public void synchronize() {
				super.synchronize();
				if (isValid()) {
					setSelection(0);
				}
			}
		};
		detailPShelfPS.setDelayed(true);
		
		// loads and instantiates the class DateTextPartBasicItem.
		dateTextPartBasicItem  = new DateTextPartBasicItem(context, detailPShelfPS);
		
		// loads and instantiates the class DateTextPartLifeCycleItem.
		dateTextPartLifeCycleItem  = new DateTextPartLifeCycleItem(context, detailPShelfPS);
		
		// loads and instantiates the class DateTextPartControlItem.
		dateTextPartControlItem  = new DateTextPartControlItem(context, detailPShelfPS);
	}
}