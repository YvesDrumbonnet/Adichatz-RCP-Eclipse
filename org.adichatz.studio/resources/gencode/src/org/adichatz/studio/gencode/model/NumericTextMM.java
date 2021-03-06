/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:57 CET 2019
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.model;

import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.model.AEntityMetaModel;
import org.adichatz.engine.model.PropertyField;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.NumericTextType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/NumericTextMM")
public class NumericTextMM extends AXjcEntityMetaModel<NumericTextType> {
	/**
	 * Creates the MetaModel class for NumericTextMM.
	 *
	 */
	public NumericTextMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/ControlFieldMM");
		create();
	}

	/**
	 * Create contents for MetaModel NumericTextMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field editable
		 */
		new PropertyField(this, "editable");
		
		/**
		 *  add a property field for field locale
		 */
		new PropertyField(this, "locale");
		
		/**
		 *  add a property field for field pattern
		 */
		new PropertyField(this, "pattern");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<NumericTextType> getBeanClass() {
		return NumericTextType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/ControlFieldMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}