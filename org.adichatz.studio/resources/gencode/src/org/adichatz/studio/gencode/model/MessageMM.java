/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:24 CET 2019
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
import org.adichatz.generator.xjc.MessageType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/MessageMM")
public class MessageMM extends AXjcEntityMetaModel<MessageType> {
	/**
	 * Creates the MetaModel class for MessageMM.
	 *
	 */
	public MessageMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel MessageMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field key
		 */
		new PropertyField(this, "key");
		
		/**
		 *  add a property field for field value
		 */
		new PropertyField(this, "value");
		
		/**
		 *  add a property field for field language
		 */
		new PropertyField(this, "language");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<MessageType> getBeanClass() {
		return MessageType.class;
	}
}