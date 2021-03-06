/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:15:46 CET 2019
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
import org.adichatz.generator.xjc.GridColumnType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/GridColumnMM")
public class GridColumnMM extends AXjcEntityMetaModel<GridColumnType> {
	/**
	 * Creates the MetaModel class for GridColumnMM.
	 *
	 */
	public GridColumnMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/ColumnFieldMM");
		create();
	}

	/**
	 * Create contents for MetaModel GridColumnMM.
	 */
	public void create(){
		
		/**
		 *  add a property field for field controllerClassName
		 */
		new PropertyField(this, "controllerClassName");
		
		/**
		 *  add a property field for field minimumWidth
		 */
		new PropertyField(this, "minimumWidth");
		
		/**
		 *  add a property field for field cellSelectionEnabled
		 */
		new PropertyField(this, "cellSelectionEnabled");
		
		/**
		 *  add a property field for field summary
		 */
		new PropertyField(this, "summary");
		
		/**
		 *  add a property field for field wordWrap
		 */
		new PropertyField(this, "wordWrap");
		
		/**
		 *  add a property field for field headerFont
		 */
		new PropertyField(this, "headerFont");
		
		/**
		 *  add a property field for field headerWordWrap
		 */
		new PropertyField(this, "headerWordWrap");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<GridColumnType> getBeanClass() {
		return GridColumnType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/ColumnFieldMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}