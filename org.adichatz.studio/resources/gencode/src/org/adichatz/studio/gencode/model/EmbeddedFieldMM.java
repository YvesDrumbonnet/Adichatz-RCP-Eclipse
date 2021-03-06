/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:15 CET 2019
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
import org.adichatz.generator.xjc.EmbeddedFieldType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/EmbeddedFieldMM")
public class EmbeddedFieldMM extends AXjcEntityMetaModel<EmbeddedFieldType> {
	/**
	 * Creates the MetaModel class for EmbeddedFieldMM.
	 *
	 */
	public EmbeddedFieldMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/PropertyFieldMM");
		create();
	}

	/**
	 * Create contents for MetaModel EmbeddedFieldMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field property
		 */
		new PropertyField(this, "property");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<EmbeddedFieldType> getBeanClass() {
		return EmbeddedFieldType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/PropertyFieldMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}