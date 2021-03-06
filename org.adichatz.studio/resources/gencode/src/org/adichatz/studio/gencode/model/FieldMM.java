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
import org.adichatz.engine.model.PropertyField;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.FieldType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/FieldMM")
public class FieldMM extends AXjcEntityMetaModel<FieldType> {
	/**
	 * Creates the MetaModel class for FieldMM.
	 *
	 */
	public FieldMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel FieldMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field id
		 */
		new PropertyField(this, "id");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<FieldType> getBeanClass() {
		return FieldType.class;
	}
}