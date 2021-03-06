/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:42 CET 2019
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
import org.adichatz.generator.xjc.MenuManagerType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/MenuManagerMM")
public class MenuManagerMM extends AXjcEntityMetaModel<MenuManagerType> {
	/**
	 * Creates the MetaModel class for MenuManagerMM.
	 *
	 */
	public MenuManagerMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/CollectionMM");
		create();
	}

	/**
	 * Create contents for MetaModel MenuManagerMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field rank
		 */
		new PropertyField(this, "rank");
		
		/**
		 *  add a property field for field imageDescriptor
		 */
		new PropertyField(this, "imageDescriptor");
		
		/**
		 *  add a property field for field text
		 */
		new PropertyField(this, "text");
		
		// add one to many for field 'actionOrMenuOrSeparator' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "actionOrMenuOrSeparator", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ActionMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/MenuManagerMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/SeparatorMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ContributionItemMM");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<MenuManagerType> getBeanClass() {
		return MenuManagerType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/CollectionMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}