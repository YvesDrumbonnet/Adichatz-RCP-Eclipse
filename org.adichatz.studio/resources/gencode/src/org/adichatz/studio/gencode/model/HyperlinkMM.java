/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:56 CET 2019
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
import org.adichatz.generator.xjc.HyperlinkType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/HyperlinkMM")
public class HyperlinkMM extends AXjcEntityMetaModel<HyperlinkType> {
	/**
	 * Creates the MetaModel class for HyperlinkMM.
	 *
	 */
	public HyperlinkMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/ControlFieldMM");
		create();
	}

	/**
	 * Create contents for MetaModel HyperlinkMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field runnableCode
		 */
		new PropertyField(this, "runnableCode");
		
		/**
		 *  add a property field for field text
		 */
		new PropertyField(this, "text");
		
		/**
		 *  add a property field for field runnableClassName
		 */
		new PropertyField(this, "runnableClassName");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<HyperlinkType> getBeanClass() {
		return HyperlinkType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/ControlFieldMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}