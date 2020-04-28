/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Tue Apr 28 15:53:20 CEST 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.detail;

import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdiPluginResources;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.ContainerController;
import org.adichatz.engine.controller.collection.ScrolledCompositeController;
import org.adichatz.engine.controller.field.LabelController;
import org.adichatz.engine.controller.field.TextController;
import org.adichatz.engine.controller.utils.DataReferenceManager;
import org.adichatz.engine.core.AContainerCore;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.plugin.ParamMap;
import org.adichatz.engine.plugin.RegisterEntry;
import org.adichatz.studio.xjc.controller.BooleanRadioGroupController;
import org.adichatz.studio.xjc.controller.XjcFocusListener;
import org.adichatz.studio.xjc.data.XjcFieldBindingManager;
import org.eclipse.ui.forms.IFormColors;

@AdiResourceURI(URI="adi://org.adichatz.studio/detail/NativeContentProviderPart")
public class NativeContentProviderPart extends AContainerCore {
	// the ScrolledCompositeController itemCompositeSCLC.
	protected ScrolledCompositeController itemCompositeSCLC;
	// the LabelController id$1LBL.
	private LabelController id$1LBL;
	// the TextController idTXT.
	private TextController idTXT;
	// the LabelController fieldName$1LBL.
	private LabelController fieldName$1LBL;
	// the TextController fieldNameTXT.
	private TextController fieldNameTXT;
	// the LabelController optional$1LBL.
	private LabelController optional$1LBL;
	// the BooleanRadioGroupController optionalRG.
	private BooleanRadioGroupController optionalRG;
	// the LabelController type$1LBL.
	private LabelController type$1LBL;
	// the TextController typeTXT.
	private TextController typeTXT;
	// the LabelController value$1LBL.
	private LabelController value$1LBL;
	// the TextController valueTXT.
	private TextController valueTXT;
	/**
	 * Instantiates a new NativeContentProviderPart.
	 * 
	 * This constructor could be used by dynamic controller.
	 * 
	 * @param parentContext
	 *            the parent context
	 * @param parentController
	 *            the parent controller
	 */
	public NativeContentProviderPart(AdiContext parentContext, IContainerController parentController) {
		super(null, parentController, null);
		coreController = parentController;
	}

	/**
	 * Creates the part NativeContentProviderPart.
	 *
	 * @param pluginResources
	 *            the plugin resources
	 * @param coreController
	 *            the parent controller
	 * @param paramMap
	 *            the param map
	*/
	public NativeContentProviderPart(AdiPluginResources pluginResources, IContainerController coreController, ParamMap paramMap) {
		super(pluginResources, coreController, paramMap);
		ContainerController containerController = (ContainerController) coreController;
		getRegister().put("detailPart", new RegisterEntry<ContainerController>(containerController, ContainerController.class));
		createContents();
	}

	/**
	 * creates contents
	 */
	public void createContents(){
		// Creates control for ScrolledCompositeController itemCompositeSCLC
		itemCompositeSCLC = new ScrolledCompositeController("itemComposite", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					setDirtyManagement(false);
					getComposite().setLayout(new MigLayout("wrap 2","[align right]10[fill,grow]","[]"));
				}
			}
		};
		// Creates control for LabelController id$1LBL
		id$1LBL = new LabelController("id$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "element", "id").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createId(this);
		// Creates control for LabelController fieldName$1LBL
		fieldName$1LBL = new LabelController("fieldName$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "nativeContentProvider", "fieldName").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createFieldName(this);
		// Creates control for LabelController optional$1LBL
		optional$1LBL = new LabelController("optional$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "param", "optional").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createOptional(this);
		// Creates control for LabelController type$1LBL
		type$1LBL = new LabelController("type$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "param", "type").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createType(this);
		// Creates control for LabelController value$1LBL
		value$1LBL = new LabelController("value$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "param", "value").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createValue(this);
	}
	public TextController createId(ControllerCore genCode) {
		// Creates control for TextController idTXT
		idTXT = new TextController("id", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(id$1LBL);
				setProperty("id");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return idTXT;
	}
	public TextController createFieldName(ControllerCore genCode) {
		// Creates control for TextController fieldNameTXT
		fieldNameTXT = new TextController("fieldName", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(fieldName$1LBL);
				setProperty("fieldName");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return fieldNameTXT;
	}
	public BooleanRadioGroupController createOptional(ControllerCore genCode) {
		// Creates control for BooleanRadioGroupController optionalRG
		optionalRG = new BooleanRadioGroupController("optional", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(optional$1LBL);
				setProperty("optional");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					dataReferenceManager = new DataReferenceManager(this);
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return optionalRG;
	}
	public TextController createType(ControllerCore genCode) {
		// Creates control for TextController typeTXT
		typeTXT = new TextController("type", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(type$1LBL);
				setProperty("type");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return typeTXT;
	}
	public TextController createValue(ControllerCore genCode) {
		// Creates control for TextController valueTXT
		valueTXT = new TextController("value", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(value$1LBL);
				setProperty("value");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return valueTXT;
	}
}