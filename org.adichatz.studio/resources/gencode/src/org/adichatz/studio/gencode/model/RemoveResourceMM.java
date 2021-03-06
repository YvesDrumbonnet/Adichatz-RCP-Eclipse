/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:11 CET 2019
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
import org.adichatz.generator.xjc.RemoveResourceType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/RemoveResourceMM")
public class RemoveResourceMM extends AXjcEntityMetaModel<RemoveResourceType> {
	/**
	 * Creates the MetaModel class for RemoveResourceMM.
	 *
	 */
	public RemoveResourceMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel RemoveResourceMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field condition
		 */
		new PropertyField(this, "condition");
		
		/**
		 *  add a property field for field targetURI
		 */
		new PropertyField(this, "targetURI");
		
		/**
		 *  add a property field for field actionWhen
		 */
		new PropertyField(this, "actionWhen");
		
		/**
		 *  add a property field for field relative
		 */
		new PropertyField(this, "relative");
		
		/**
		 *  add a property field for field throwError
		 */
		new PropertyField(this, "throwError");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<RemoveResourceType> getBeanClass() {
		return RemoveResourceType.class;
	}
}