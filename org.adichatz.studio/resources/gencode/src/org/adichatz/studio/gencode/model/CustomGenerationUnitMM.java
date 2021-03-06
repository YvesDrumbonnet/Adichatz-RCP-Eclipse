/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:12 CET 2019
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
import org.adichatz.generator.xjc.CustomGenerationUnitType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/CustomGenerationUnitMM")
public class CustomGenerationUnitMM extends AXjcEntityMetaModel<CustomGenerationUnitType> {
	/**
	 * Creates the MetaModel class for CustomGenerationUnitMM.
	 *
	 */
	public CustomGenerationUnitMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/GenerationUnitMM");
		create();
	}

	/**
	 * Create contents for MetaModel CustomGenerationUnitMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field entityRegex
		 */
		new PropertyField(this, "entityRegex");
		
		/**
		 *  add a property field for field propertyRegex
		 */
		new PropertyField(this, "propertyRegex");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<CustomGenerationUnitType> getBeanClass() {
		return CustomGenerationUnitType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/GenerationUnitMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}