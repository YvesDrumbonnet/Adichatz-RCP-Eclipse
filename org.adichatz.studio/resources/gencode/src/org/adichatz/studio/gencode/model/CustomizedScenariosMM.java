/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:14 CET 2019
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.model;

import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.CustomizedScenariosType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/CustomizedScenariosMM")
public class CustomizedScenariosMM extends AXjcEntityMetaModel<CustomizedScenariosType> {
	/**
	 * Creates the MetaModel class for CustomizedScenariosMM.
	 *
	 */
	public CustomizedScenariosMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel CustomizedScenariosMM.
	 */
	public void create(){
		
		// add one to many for field 'customizedScenario' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "customizedScenario", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CustomizedScenarioMM");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<CustomizedScenariosType> getBeanClass() {
		return CustomizedScenariosType.class;
	}
}