/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Tue Apr 28 15:53:43 CEST 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.detail;

import java.util.function.BooleanSupplier;
import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdiPluginResources;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.ContainerController;
import org.adichatz.engine.controller.collection.ScrolledCompositeController;
import org.adichatz.engine.controller.field.LabelController;
import org.adichatz.engine.controller.field.TextController;
import org.adichatz.engine.controller.utils.DataReferenceManager;
import org.adichatz.engine.controller.utils.ElementaryAccessibility;
import org.adichatz.engine.core.AContainerCore;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.plugin.ParamMap;
import org.adichatz.engine.plugin.RegisterEntry;
import org.adichatz.engine.validation.MandatoryValidator;
import org.adichatz.generator.xjc.RefFieldType;
import org.adichatz.studio.xjc.controller.AdiResourceUriTextController;
import org.adichatz.studio.xjc.controller.BooleanRadioGroupController;
import org.adichatz.studio.xjc.controller.OutlineHyperlinkController;
import org.adichatz.studio.xjc.controller.XjcFocusListener;
import org.adichatz.studio.xjc.data.XjcFieldBindingManager;
import org.adichatz.studio.xjc.editor.runnable.OpenResourceURIRunnable;
import org.eclipse.ui.forms.IFormColors;

@AdiResourceURI(URI="adi://org.adichatz.studio/detail/RefFieldPart")
public class RefFieldPart extends AContainerCore {
	// the ScrolledCompositeController itemCompositeSCLC.
	protected ScrolledCompositeController itemCompositeSCLC;
	// the LabelController id$1LBL.
	private LabelController id$1LBL;
	// the TextController idTXT.
	private TextController idTXT;
	// the OutlineHyperlinkController entityURIRefFieldPART$1HL.
	private OutlineHyperlinkController entityURIRefFieldPART$1HL;
	// the AdiResourceUriTextController entityURITXT.
	private AdiResourceUriTextController entityURITXT;
	// the LabelController lazyFetchMember$1LBL.
	private LabelController lazyFetchMember$1LBL;
	// the TextController lazyFetchMemberTXT.
	private TextController lazyFetchMemberTXT;
	// the LabelController mandatory$1LBL.
	private LabelController mandatory$1LBL;
	// the BooleanRadioGroupController mandatoryRG.
	private BooleanRadioGroupController mandatoryRG;
	// the LabelController parentMappedBy$1LBL.
	private LabelController parentMappedBy$1LBL;
	// the TextController parentMappedByTXT.
	private TextController parentMappedByTXT;
	// the LabelController pojoType$1LBL.
	private LabelController pojoType$1LBL;
	// the TextController pojoTypeTXT.
	private TextController pojoTypeTXT;
	/**
	 * Instantiates a new RefFieldPart.
	 * 
	 * This constructor could be used by dynamic controller.
	 * 
	 * @param parentContext
	 *            the parent context
	 * @param parentController
	 *            the parent controller
	 */
	public RefFieldPart(AdiContext parentContext, IContainerController parentController) {
		super(null, parentController, null);
		coreController = parentController;
	}

	/**
	 * Creates the part RefFieldPart.
	 *
	 * @param pluginResources
	 *            the plugin resources
	 * @param coreController
	 *            the parent controller
	 * @param paramMap
	 *            the param map
	*/
	public RefFieldPart(AdiPluginResources pluginResources, IContainerController coreController, ParamMap paramMap) {
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
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "field", "id").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createId(this);
		createEntityURIRefFieldPART$1(this);
		createEntityURI(this);
		// Creates control for LabelController lazyFetchMember$1LBL
		lazyFetchMember$1LBL = new LabelController("lazyFetchMember$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "refField", "lazyFetchMember").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createLazyFetchMember(this);
		// Creates control for LabelController mandatory$1LBL
		mandatory$1LBL = new LabelController("mandatory$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "propertyField", "mandatory").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createMandatory(this);
		// Creates control for LabelController parentMappedBy$1LBL
		parentMappedBy$1LBL = new LabelController("parentMappedBy$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "refField", "parentMappedBy").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createParentMappedBy(this);
		// Creates control for LabelController pojoType$1LBL
		pojoType$1LBL = new LabelController("pojoType$1", itemCompositeSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "propertyField", "pojoType").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createPojoType(this);
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
					addValidator(new MandatoryValidator(this, "mandatoryField"));
					if (null != fieldBindManager)
						fieldBindManager = new XjcFieldBindingManager(this);
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return idTXT;
	}
	public OutlineHyperlinkController createEntityURIRefFieldPART$1(ControllerCore genCode) {
		// Creates control for OutlineHyperlinkController entityURIRefFieldPART$1HL
		entityURIRefFieldPART$1HL = new OutlineHyperlinkController("entityURIRefFieldPART$1", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				BooleanSupplier evaluatorENABLED;
				evaluatorENABLED = new BooleanSupplier() {
					public boolean getAsBoolean() {
						return null != ((RefFieldType) parentController.getEntity().getBean()).getEntityURI();
					}
				};
				addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.ENABLED, evaluatorENABLED));
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					runnable = new OpenResourceURIRunnable(this);
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "refField", "entityURI").concat(":"));
					getControl().addFocusListener(new XjcFocusListener(this));
				}
			}
		};
		return entityURIRefFieldPART$1HL;
	}
	public AdiResourceUriTextController createEntityURI(ControllerCore genCode) {
		// Creates control for AdiResourceUriTextController entityURITXT
		entityURITXT = new AdiResourceUriTextController("entityURI", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(entityURIRefFieldPART$1HL);
				setProperty("entityURI");
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
		return entityURITXT;
	}
	public TextController createLazyFetchMember(ControllerCore genCode) {
		// Creates control for TextController lazyFetchMemberTXT
		lazyFetchMemberTXT = new TextController("lazyFetchMember", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(lazyFetchMember$1LBL);
				setProperty("lazyFetchMember");
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
		return lazyFetchMemberTXT;
	}
	public BooleanRadioGroupController createMandatory(ControllerCore genCode) {
		// Creates control for BooleanRadioGroupController mandatoryRG
		mandatoryRG = new BooleanRadioGroupController("mandatory", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(mandatory$1LBL);
				setProperty("mandatory");
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
		return mandatoryRG;
	}
	public TextController createParentMappedBy(ControllerCore genCode) {
		// Creates control for TextController parentMappedByTXT
		parentMappedByTXT = new TextController("parentMappedBy", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(parentMappedBy$1LBL);
				setProperty("parentMappedBy");
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
		return parentMappedByTXT;
	}
	public TextController createPojoType(ControllerCore genCode) {
		// Creates control for TextController pojoTypeTXT
		pojoTypeTXT = new TextController("pojoType", getParentController(itemCompositeSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(pojoType$1LBL);
				setProperty("pojoType");
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
		return pojoTypeTXT;
	}
}