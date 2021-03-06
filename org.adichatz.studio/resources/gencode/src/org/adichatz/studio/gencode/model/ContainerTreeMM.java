/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:10 CET 2019
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
import org.adichatz.generator.xjc.ContainerTree;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/ContainerTreeMM")
public class ContainerTreeMM extends AXjcEntityMetaModel<ContainerTree> {
	/**
	 * Creates the MetaModel class for ContainerTreeMM.
	 *
	 */
	public ContainerTreeMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/ContainerMM");
		create();
	}

	/**
	 * Create contents for MetaModel ContainerTreeMM.
	 */
	public void create(){
		
		/**
		 *  add a join column (ManyToOne) for field layout
		 */
		RefField<?> refField;
		refField = new RefField(this, "layout", null, "adi://org.adichatz.studio/model/LayoutMM");
		
		/**
		 *  add a join column (ManyToOne) for field managedToolBar
		 */
		refField = new RefField(this, "managedToolBar", null, "adi://org.adichatz.studio/model/ManagedToolBarMM");
		
		/**
		 *  add a property field for field bindingServiceClassName
		 */
		new PropertyField(this, "bindingServiceClassName");
		
		/**
		 *  add a property field for field dirtyManagement
		 */
		new PropertyField(this, "dirtyManagement");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<ContainerTree> getBeanClass() {
		return ContainerTree.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/ContainerMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}