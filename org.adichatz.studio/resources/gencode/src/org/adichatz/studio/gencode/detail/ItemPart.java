/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Tue Apr 28 15:53:09 CEST 2020
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
import org.adichatz.engine.core.AContainerCore;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.plugin.ParamMap;
import org.adichatz.engine.plugin.RegisterEntry;
import org.adichatz.engine.validation.MandatoryValidator;
import org.adichatz.studio.xjc.controller.ClassTextController;
import org.adichatz.studio.xjc.controller.IdTextController;
import org.adichatz.studio.xjc.controller.OutlineHyperlinkController;
import org.adichatz.studio.xjc.controller.XjcFocusListener;
import org.adichatz.studio.xjc.controller.XjcTextController;
import org.adichatz.studio.xjc.data.XjcFieldBindingManager;
import org.adichatz.studio.xjc.editor.runnable.OpenClassEditorRunnable;
import org.eclipse.ui.forms.IFormColors;

@AdiResourceURI(URI="adi://org.adichatz.studio/detail/ItemPart")
public class ItemPart extends AContainerCore {
	// the ScrolledCompositeController itemCompositeSCLC.
	protected ScrolledCompositeController itemCompositeSCLC;
	// the LabelController id$1LBL.
	private LabelController id$1LBL;
	// the IdTextController idTXT.
	private IdTextController idTXT;
	// the OutlineHyperlinkController controllerClassNameItemPART$1HL.
	private OutlineHyperlinkController controllerClassNameItemPART$1HL;
	// the ClassTextController controllerClassNameTXT.
	private ClassTextController controllerClassNameTXT;
	// the LabelController image$1LBL.
	private LabelController image$1LBL;
	// the TextController imageTXT.
	private TextController imageTXT;
	// the LabelController label$1LBL.
	private LabelController label$1LBL;
	// the TextController labelTXT.
	private TextController labelTXT;
	// the LabelController toolTipText$1LBL.
	private LabelController toolTipText$1LBL;
	// the TextController toolTipTextTXT.
	private TextController toolTipTextTXT;
	// the LabelController type$1LBL.
	private LabelController type$1LBL;
	// the TextController typeTXT.
	private TextController typeTXT;
	// the LabelController valid$1LBL.
	private LabelController valid$1LBL;
	// the XjcTextController validTXT.
	private XjcTextController validTXT;
	/**
	 * Instantiates a new ItemPart.
	 * 
	 * This constructor could be used by dynamic controller.
	 * 
	 * @param parentContext
	 *            the parent context
	 * @param parentController
	 *            the parent controller
	 */
	public ItemPart(AdiContext parentContext, IContainerController parentController) {
		super(null, parentController, null);
		coreController = parentController;
	}

	/**
	 * Creates the part ItemPart.
	 *
	 * @param pluginResources
	 *            the plugin resources
	 * @param coreController
	 *            the parent controller
	 * @param paramMap
	 *            the param map
	*/
	public ItemPart(AdiPluginResources pluginResources, IContainerController coreController, ParamMap paramMap) {
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
		createControllerClassNameItemPART$1(this);
		createControllerClassName(this);
		// Creates control for LabelController image$1LBL
		image$1LBL = new LabelController("image$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "node", "image").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createImage(this);
		// Creates control for LabelController label$1LBL
		label$1LBL = new LabelController("label$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "node", "label").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createLabel(this);
		// Creates control for LabelController toolTipText$1LBL
		toolTipText$1LBL = new LabelController("toolTipText$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "node", "toolTipText").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createToolTipText(this);
		// Creates control for LabelController type$1LBL
		type$1LBL = new LabelController("type$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "item", "type").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createType(this);
		// Creates control for LabelController valid$1LBL
		valid$1LBL = new LabelController("valid$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "node", "valid").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createValid(this);
	}
	public IdTextController createId(ControllerCore genCode) {
		// Creates control for IdTextController idTXT
		idTXT = new IdTextController("id", getParentController(itemCompositeSCLC), genCode) {
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
	public OutlineHyperlinkController createControllerClassNameItemPART$1(ControllerCore genCode) {
		// Creates control for OutlineHyperlinkController controllerClassNameItemPART$1HL
		controllerClassNameItemPART$1HL = new OutlineHyperlinkController("controllerClassNameItemPART$1", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					runnable = new OpenClassEditorRunnable(this);
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "node", "controllerClassName").concat(":"));
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return controllerClassNameItemPART$1HL;
	}
	public ClassTextController createControllerClassName(ControllerCore genCode) {
		// Creates control for ClassTextController controllerClassNameTXT
		controllerClassNameTXT = new ClassTextController("controllerClassName", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(controllerClassNameItemPART$1HL);
				setProperty("controllerClassName");
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
		return controllerClassNameTXT;
	}
	public TextController createImage(ControllerCore genCode) {
		// Creates control for TextController imageTXT
		imageTXT = new TextController("image", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(image$1LBL);
				setProperty("image");
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
		return imageTXT;
	}
	public TextController createLabel(ControllerCore genCode) {
		// Creates control for TextController labelTXT
		labelTXT = new TextController("label", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(label$1LBL);
				setProperty("label");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					addValidator(new MandatoryValidator(this, "mandatoryField"));
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return labelTXT;
	}
	public TextController createToolTipText(ControllerCore genCode) {
		// Creates control for TextController toolTipTextTXT
		toolTipTextTXT = new TextController("toolTipText", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(toolTipText$1LBL);
				setProperty("toolTipText");
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
		return toolTipTextTXT;
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
	public XjcTextController createValid(ControllerCore genCode) {
		// Creates control for XjcTextController validTXT
		validTXT = new XjcTextController("valid", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(valid$1LBL);
				setProperty("valid");
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
		return validTXT;
	}
}