/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:27 CET 2019
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
import org.adichatz.engine.model.RefField;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.generator.xjc.PluginEntityType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/PluginEntityMM")
public class PluginEntityMM extends AXjcEntityMetaModel<PluginEntityType> {
	/**
	 * Creates the MetaModel class for PluginEntityMM.
	 *
	 */
	public PluginEntityMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel PluginEntityMM.
	 */
	public void create(){
		
		/**
		 *  add a join column (ManyToOne) for field icons
		 */
		RefField<?> refField;
		refField = new RefField(this, "icons", null, "adi://org.adichatz.studio/model/IconsMM");
		
		/**
		 *  add a join column (ManyToOne) for field messages
		 */
		refField = new RefField(this, "messages", null, "adi://org.adichatz.studio/model/MessagesMM");
		
		/**
		 *  add a join column (ManyToOne) for field params
		 */
		refField = new RefField(this, "params", null, "adi://org.adichatz.studio/model/ParamsMM");
		
		/**
		 *  add a join column (ManyToOne) for field pojoRewriters
		 */
		refField = new RefField(this, "pojoRewriters", null, "adi://org.adichatz.studio/model/PojoRewritersMM");
		
		/**
		 *  add a join column (ManyToOne) for field queryBuilder
		 */
		refField = new RefField(this, "queryBuilder", null, "adi://org.adichatz.studio/model/QueryBuilderMM");
		
		/**
		 *  add a property field for field beanClassName
		 */
		new PropertyField(this, "beanClassName");
		
		/**
		 *  add a property field for field uiBeanClassName
		 */
		new PropertyField(this, "uiBeanClassName");
		
		/**
		 *  add a property field for field entityURI
		 */
		new PropertyField(this, "entityURI");
		
		/**
		 *  add a property field for field protectPojo
		 */
		new PropertyField(this, "protectPojo");
		
		/**
		 *  add a property field for field retrieveRoles
		 */
		new PropertyField(this, "retrieveRoles");
		
		/**
		 *  add a property field for field mergeRoles
		 */
		new PropertyField(this, "mergeRoles");
		
		/**
		 *  add a property field for field persistRoles
		 */
		new PropertyField(this, "persistRoles");
		
		/**
		 *  add a property field for field removeRoles
		 */
		new PropertyField(this, "removeRoles");
		
		// add one to many for field 'generationUnit' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "generationUnit", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/GenerationUnitMM");
		
		// add one to many for field 'propertyField' (parent clause='null')
		oneToMany = new XjcEntitySet(this, "propertyField", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/PropertyFieldMM");
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<PluginEntityType> getBeanClass() {
		return PluginEntityType.class;
	}
}