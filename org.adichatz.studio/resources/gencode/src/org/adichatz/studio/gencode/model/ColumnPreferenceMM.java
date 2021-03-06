/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:08 CET 2019
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.model;

import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.model.PropertyField;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.ColumnPreferenceType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/ColumnPreferenceMM")
public class ColumnPreferenceMM extends AXjcEntityMetaModel<ColumnPreferenceType> {
	/**
	 * Creates the MetaModel class for ColumnPreferenceMM.
	 *
	 */
	public ColumnPreferenceMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel ColumnPreferenceMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field id
		 */
		new PropertyField(this, "id");
		
		/**
		 *  add a property field for field visible
		 */
		new PropertyField(this, "visible");
		
		/**
		 *  add a property field for field width
		 */
		new PropertyField(this, "width");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<ColumnPreferenceType> getBeanClass() {
		return ColumnPreferenceType.class;
	}
}