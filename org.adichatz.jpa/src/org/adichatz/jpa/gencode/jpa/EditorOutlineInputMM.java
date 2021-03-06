/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 12:39:59 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.jpa;

import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.model.AEntityMetaModel;
import org.adichatz.engine.model.EntitySet;
import org.adichatz.engine.plugin.PluginEntity;
import org.adichatz.jpa.editor.EditorOutlineInput;

@AdiResourceURI(URI="adi://org.adichatz.jpa/jpa/EditorOutlineInputMM")
public class EditorOutlineInputMM extends AEntityMetaModel<EditorOutlineInput> {
	/**
	 * Creates the MetaModel class for EditorOutlineInputMM.
	 *
	 */
	public EditorOutlineInputMM(PluginEntity<?> pluginEntity) {
		super(pluginEntity);
		create();
	}

	/**
	 * Create contents for MetaModel EditorOutlineInputMM.
	 */
	public void create(){
		
		// add one to many for field 'entities' (parent clause='null')
		new EntitySet(this, "entities", null);
		
		// add one to many for field 'errorPaths' (parent clause='null')
		new EntitySet(this, "errorPaths", null);
		
		// add one to many for field 'viewerFilters' (parent clause='null')
		new EntitySet(this, "viewerFilters", null);
	}
	
	/* (non-Javadoc)
	 * @see org.adichatz.engine.model.AEntityMetaModel#getBeanClass()
	 */
	@Override
	public Class<EditorOutlineInput> getBeanClass() {
		return EditorOutlineInput.class;
	}
}