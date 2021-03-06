/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:20 CET 2019
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
import org.adichatz.generator.xjc.IconsType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/IconsMM")
public class IconsMM extends AXjcEntityMetaModel<IconsType> {
	/**
	 * Creates the MetaModel class for IconsMM.
	 *
	 */
	public IconsMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel IconsMM.
	 */
	public void create(){
		
		// add one to many for field 'icon' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "icon", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/IconMM");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<IconsType> getBeanClass() {
		return IconsType.class;
	}
}