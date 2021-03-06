/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:40 CET 2019
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
import org.adichatz.generator.xjc.ApplicationServersType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/ApplicationServersMM")
public class ApplicationServersMM extends AXjcEntityMetaModel<ApplicationServersType> {
	/**
	 * Creates the MetaModel class for ApplicationServersMM.
	 *
	 */
	public ApplicationServersMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel ApplicationServersMM.
	 */
	public void create(){
		
		// add one to many for field 'applicationServer' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "applicationServer", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ApplicationServerMM");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<ApplicationServersType> getBeanClass() {
		return ApplicationServersType.class;
	}
}