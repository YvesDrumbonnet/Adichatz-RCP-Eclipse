/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:58 CET 2019
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
import org.adichatz.engine.model.RefField;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.RefTextType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/RefTextMM")
public class RefTextMM extends AXjcEntityMetaModel<RefTextType> {
	/**
	 * Creates the MetaModel class for RefTextMM.
	 *
	 */
	public RefTextMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/RefControlMM");
		create();
	}

	/**
	 * Create contents for MetaModel RefTextMM.
	 */
	public void create(){
		
		/**
		 *  add a join column (ManyToOne) for field params
		 */
		RefField<?> refField;
		refField = new RefField(this, "params", null, "adi://org.adichatz.studio/model/ParamsMM");
		
		/**
		 *  add a property field for field orientation
		 */
		new PropertyField(this, "orientation");
		
		/**
		 *  add a property field for field textLayoutData
		 */
		new PropertyField(this, "textLayoutData");
		
		/**
		 *  add a property field for field tabs
		 */
		new PropertyField(this, "tabs");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<RefTextType> getBeanClass() {
		return RefTextType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/RefControlMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}