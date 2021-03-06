/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Sat Dec 07 15:16:09 CET 2019
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
import org.adichatz.generator.xjc.ContainerType;
import org.adichatz.studio.xjc.scenario.AXjcEntityMetaModel;
import org.adichatz.studio.xjc.scenario.XjcEntitySet;

@AdiResourceURI(URI="adi://org.adichatz.studio/model/ContainerMM")
public class ContainerMM extends AXjcEntityMetaModel<ContainerType> {
	/**
	 * Creates the MetaModel class for ContainerMM.
	 *
	 */
	public ContainerMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		pluginEntity.setSuperEntityURI("adi://org.adichatz.studio/model/ElementMM");
		create();
	}

	/**
	 * Create contents for MetaModel ContainerMM.
	 */
	public void create(){
		
		/**
		 *  add a join column (ManyToOne) for field config
		 */
		RefField<?> refField;
		refField = new RefField(this, "config", null, "adi://org.adichatz.studio/model/ConfigMM");
		
		/**
		 *  add a property field for field additionalCode
		 */
		new PropertyField(this, "additionalCode");
		
		/**
		 *  add a property field for field coreClassName
		 */
		new PropertyField(this, "coreClassName");
		
		/**
		 *  add a property field for field entityURI
		 */
		new PropertyField(this, "entityURI");
		
		// add one to many for field 'formPageOrScrolledFormOrSection' (parent clause='null')
		XjcEntitySet oneToMany;
		oneToMany = new XjcEntitySet(this, "formPageOrScrolledFormOrSection", null);
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/FormPageMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ScrolledFormMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/SectionMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CompositeMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CompositeBagMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/GroupMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/PGroupMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/SashFormMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ScrolledCompositeMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/TableMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/GridMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CTabFolderMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ArgTabFolderMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/PShelfMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ArgPShelfMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/IncludeMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/HeaderMenuManagerMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/MenuManagerMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ManagedToolBarMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ControlFieldMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/GenericFieldMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/LabelMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ButtonMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CComboMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CheckBoxMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ComboMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/CompositeSeparatorMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/DateTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/DateTimeMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/EncryptedTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/EditableFormTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ExtraTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/FileTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/FontTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/FormattedTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/GMapMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/HyperlinkMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/HelpButtonMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/ImageViewerMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/MultiChoiceMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/NumericTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/RadioGroupMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/RefTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/RgbTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/RichTextMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/StarRatingMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/TableColumnMM");
		oneToMany.addElementEntity("adi://org.adichatz.studio/model/TextMM");
		addSuperFields();
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<ContainerType> getBeanClass() {
		return ContainerType.class;
	}
	@Override
	protected void addSuperFields(){
		AEntityMetaModel<?> superEntityMM = pluginEntity.getPluginEntityTree().getEntityMM("adi://org.adichatz.studio/model/ElementMM");
		fieldMap.putAll(superEntityMM.getFieldMap());
		super.addSuperFields();
	}
}