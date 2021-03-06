/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:34 CET 2019
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
import org.adichatz.generator.xjc.ValidatorType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/ValidatorMM")
public class ValidatorMM extends AXjcEntityMetaModel<ValidatorType> {
	/**
	 * Creates the MetaModel class for ValidatorMM.
	 *
	 */
	public ValidatorMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel ValidatorMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field errorWhen
		 */
		new PropertyField(this, "errorWhen");
		
		/**
		 *  add a property field for field warningWhen
		 */
		new PropertyField(this, "warningWhen");
		
		/**
		 *  add a property field for field key
		 */
		new PropertyField(this, "key");
		
		/**
		 *  add a property field for field validatorClassName
		 */
		new PropertyField(this, "validatorClassName");
		
		/**
		 *  add a property field for field hostingControllerIds
		 */
		new PropertyField(this, "hostingControllerIds");
		
		/**
		 *  add a property field for field errorMessage
		 */
		new PropertyField(this, "errorMessage");
		
		/**
		 *  add a property field for field warningMessage
		 */
		new PropertyField(this, "warningMessage");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<ValidatorType> getBeanClass() {
		return ValidatorType.class;
	}
}