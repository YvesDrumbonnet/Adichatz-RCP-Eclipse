/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Tue Apr 28 15:54:09 CEST 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.studio.gencode.detail;

import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.ScrolledCompositeController;
import org.adichatz.engine.controller.field.LabelController;
import org.adichatz.engine.controller.field.TextController;
import org.adichatz.engine.controller.nebula.PShelfController;
import org.adichatz.engine.controller.nebula.PShelfItemController;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.studio.xjc.controller.ColorController;
import org.adichatz.studio.xjc.controller.FontController;
import org.adichatz.studio.xjc.controller.XjcFocusListener;
import org.adichatz.studio.xjc.controller.XjcTextController;
import org.adichatz.studio.xjc.data.XjcFieldBindingManager;
import org.eclipse.ui.forms.IFormColors;

@AdiResourceURI(URI="adi://org.adichatz.studio/detail/TabularPart")
public class TabularPartControlItem extends EntityManagerCore {
	// the ScrolledCompositeController controlItemSCSCLC.
	protected ScrolledCompositeController controlItemSCSCLC;
	// the LabelController background$1LBL.
	private LabelController background$1LBL;
	// the ColorController backgroundTXT.
	private ColorController backgroundTXT;
	// the LabelController columnOrder$1LBL.
	private LabelController columnOrder$1LBL;
	// the TextController columnOrderTXT.
	private TextController columnOrderTXT;
	// the LabelController containerBackground$1LBL.
	private LabelController containerBackground$1LBL;
	// the ColorController containerBackgroundTXT.
	private ColorController containerBackgroundTXT;
	// the LabelController containerBackgroundImage$1LBL.
	private LabelController containerBackgroundImage$1LBL;
	// the TextController containerBackgroundImageTXT.
	private TextController containerBackgroundImageTXT;
	// the LabelController containerBounds$1LBL.
	private LabelController containerBounds$1LBL;
	// the TextController containerBoundsTXT.
	private TextController containerBoundsTXT;
	// the LabelController containerCapture$1LBL.
	private LabelController containerCapture$1LBL;
	// the TextController containerCaptureTXT.
	private TextController containerCaptureTXT;
	// the LabelController containerFocus$1LBL.
	private LabelController containerFocus$1LBL;
	// the TextController containerFocusTXT.
	private TextController containerFocusTXT;
	// the LabelController containerFont$1LBL.
	private LabelController containerFont$1LBL;
	// the FontController containerFontTXT.
	private FontController containerFontTXT;
	// the LabelController containerForeground$1LBL.
	private LabelController containerForeground$1LBL;
	// the ColorController containerForegroundTXT.
	private ColorController containerForegroundTXT;
	// the LabelController containerLayoutData$1LBL.
	private LabelController containerLayoutData$1LBL;
	// the TextController containerLayoutDataTXT.
	private TextController containerLayoutDataTXT;
	// the LabelController containerLocation$1LBL.
	private LabelController containerLocation$1LBL;
	// the TextController containerLocationTXT.
	private TextController containerLocationTXT;
	// the LabelController containerMenu$1LBL.
	private LabelController containerMenu$1LBL;
	// the TextController containerMenuTXT.
	private TextController containerMenuTXT;
	// the LabelController containerRedraw$1LBL.
	private LabelController containerRedraw$1LBL;
	// the TextController containerRedrawTXT.
	private TextController containerRedrawTXT;
	// the LabelController containerSize$1LBL.
	private LabelController containerSize$1LBL;
	// the TextController containerSizeTXT.
	private TextController containerSizeTXT;
	// the LabelController containerStyle$1LBL.
	private LabelController containerStyle$1LBL;
	// the TextController containerStyleTXT.
	private TextController containerStyleTXT;
	// the LabelController enabled$1LBL.
	private LabelController enabled$1LBL;
	// the XjcTextController enabledTXT.
	private XjcTextController enabledTXT;
	// the LabelController foreground$1LBL.
	private LabelController foreground$1LBL;
	// the ColorController foregroundTXT.
	private ColorController foregroundTXT;
	// the LabelController headerVisible$1LBL.
	private LabelController headerVisible$1LBL;
	// the TextController headerVisibleTXT.
	private TextController headerVisibleTXT;
	// the LabelController layoutData$1LBL.
	private LabelController layoutData$1LBL;
	// the XjcTextController layoutDataTXT.
	private XjcTextController layoutDataTXT;
	// the LabelController linesVisible$1LBL.
	private LabelController linesVisible$1LBL;
	// the TextController linesVisibleTXT.
	private TextController linesVisibleTXT;
	// the LabelController style$1LBL.
	private LabelController style$1LBL;
	// the TextController styleTXT.
	private TextController styleTXT;
	// the LabelController visible$1LBL.
	private LabelController visible$1LBL;
	// the XjcTextController visibleTXT.
	private XjcTextController visibleTXT;
	/**
	 * Creates TabularPartControlItem.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public TabularPartControlItem(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new PShelfItemController("controlItem", parentController, this) {
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getItem().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "adichatzStudio", "studio.xjcEditor.controlItem"));
					}
				}
			};
			if (!((PShelfController) parentController).isDelayed())
				createContents();
		} else
			coreController = parentController;
	}

	/**
	 * creates contents for controller
	 */
	public void createContents(){
		// Creates control for ScrolledCompositeController controlItemSCSCLC
		controlItemSCSCLC = new ScrolledCompositeController("controlItemSC", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					setDirtyManagement(false);
					getComposite().setLayout(new MigLayout("wrap 2","[align right]10[fill,grow]","[]"));
				}
			}
		};
		// Creates control for LabelController background$1LBL
		background$1LBL = new LabelController("background$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "collection", "background").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createBackground(this);
		// Creates control for LabelController columnOrder$1LBL
		columnOrder$1LBL = new LabelController("columnOrder$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "tabular", "columnOrder").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createColumnOrder(this);
		// Creates control for LabelController containerBackground$1LBL
		containerBackground$1LBL = new LabelController("containerBackground$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerBackground").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerBackground(this);
		// Creates control for LabelController containerBackgroundImage$1LBL
		containerBackgroundImage$1LBL = new LabelController("containerBackgroundImage$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerBackgroundImage").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerBackgroundImage(this);
		// Creates control for LabelController containerBounds$1LBL
		containerBounds$1LBL = new LabelController("containerBounds$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerBounds").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerBounds(this);
		// Creates control for LabelController containerCapture$1LBL
		containerCapture$1LBL = new LabelController("containerCapture$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerCapture").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerCapture(this);
		// Creates control for LabelController containerFocus$1LBL
		containerFocus$1LBL = new LabelController("containerFocus$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerFocus").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerFocus(this);
		// Creates control for LabelController containerFont$1LBL
		containerFont$1LBL = new LabelController("containerFont$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerFont").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerFont(this);
		// Creates control for LabelController containerForeground$1LBL
		containerForeground$1LBL = new LabelController("containerForeground$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerForeground").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerForeground(this);
		// Creates control for LabelController containerLayoutData$1LBL
		containerLayoutData$1LBL = new LabelController("containerLayoutData$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerLayoutData").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerLayoutData(this);
		// Creates control for LabelController containerLocation$1LBL
		containerLocation$1LBL = new LabelController("containerLocation$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerLocation").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerLocation(this);
		// Creates control for LabelController containerMenu$1LBL
		containerMenu$1LBL = new LabelController("containerMenu$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerMenu").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerMenu(this);
		// Creates control for LabelController containerRedraw$1LBL
		containerRedraw$1LBL = new LabelController("containerRedraw$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerRedraw").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerRedraw(this);
		// Creates control for LabelController containerSize$1LBL
		containerSize$1LBL = new LabelController("containerSize$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerSize").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerSize(this);
		// Creates control for LabelController containerStyle$1LBL
		containerStyle$1LBL = new LabelController("containerStyle$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "containerStyle").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createContainerStyle(this);
		// Creates control for LabelController enabled$1LBL
		enabled$1LBL = new LabelController("enabled$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "collection", "enabled").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createEnabled(this);
		// Creates control for LabelController foreground$1LBL
		foreground$1LBL = new LabelController("foreground$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "collection", "foreground").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createForeground(this);
		// Creates control for LabelController headerVisible$1LBL
		headerVisible$1LBL = new LabelController("headerVisible$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "headerVisible").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createHeaderVisible(this);
		// Creates control for LabelController layoutData$1LBL
		layoutData$1LBL = new LabelController("layoutData$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "lazyFetchContainer", "layoutData").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createLayoutData(this);
		// Creates control for LabelController linesVisible$1LBL
		linesVisible$1LBL = new LabelController("linesVisible$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "set", "linesVisible").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createLinesVisible(this);
		// Creates control for LabelController style$1LBL
		style$1LBL = new LabelController("style$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "collection", "style").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createStyle(this);
		// Creates control for LabelController visible$1LBL
		visible$1LBL = new LabelController("visible$1", controlItemSCSCLC, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.studio", "collection", "visible").concat(":"));
					setForeground(AdichatzApplication.getInstance().getFormToolkit().getColors().getColor(IFormColors.TITLE));
				}
			}
		};
		createVisible(this);
	}
	public ColorController createBackground(ControllerCore genCode) {
		// Creates control for ColorController backgroundTXT
		backgroundTXT = new ColorController("background", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(background$1LBL);
				setProperty("background");
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
		return backgroundTXT;
	}
	public TextController createColumnOrder(ControllerCore genCode) {
		// Creates control for TextController columnOrderTXT
		columnOrderTXT = new TextController("columnOrder", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(columnOrder$1LBL);
				setProperty("columnOrder");
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
		return columnOrderTXT;
	}
	public ColorController createContainerBackground(ControllerCore genCode) {
		// Creates control for ColorController containerBackgroundTXT
		containerBackgroundTXT = new ColorController("containerBackground", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerBackground$1LBL);
				setProperty("containerBackground");
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
		return containerBackgroundTXT;
	}
	public TextController createContainerBackgroundImage(ControllerCore genCode) {
		// Creates control for TextController containerBackgroundImageTXT
		containerBackgroundImageTXT = new TextController("containerBackgroundImage", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerBackgroundImage$1LBL);
				setProperty("containerBackgroundImage");
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
		return containerBackgroundImageTXT;
	}
	public TextController createContainerBounds(ControllerCore genCode) {
		// Creates control for TextController containerBoundsTXT
		containerBoundsTXT = new TextController("containerBounds", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerBounds$1LBL);
				setProperty("containerBounds");
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
		return containerBoundsTXT;
	}
	public TextController createContainerCapture(ControllerCore genCode) {
		// Creates control for TextController containerCaptureTXT
		containerCaptureTXT = new TextController("containerCapture", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerCapture$1LBL);
				setProperty("containerCapture");
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
		return containerCaptureTXT;
	}
	public TextController createContainerFocus(ControllerCore genCode) {
		// Creates control for TextController containerFocusTXT
		containerFocusTXT = new TextController("containerFocus", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerFocus$1LBL);
				setProperty("containerFocus");
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
		return containerFocusTXT;
	}
	public FontController createContainerFont(ControllerCore genCode) {
		// Creates control for FontController containerFontTXT
		containerFontTXT = new FontController("containerFont", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerFont$1LBL);
				setProperty("containerFont");
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
		return containerFontTXT;
	}
	public ColorController createContainerForeground(ControllerCore genCode) {
		// Creates control for ColorController containerForegroundTXT
		containerForegroundTXT = new ColorController("containerForeground", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerForeground$1LBL);
				setProperty("containerForeground");
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
		return containerForegroundTXT;
	}
	public TextController createContainerLayoutData(ControllerCore genCode) {
		// Creates control for TextController containerLayoutDataTXT
		containerLayoutDataTXT = new TextController("containerLayoutData", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerLayoutData$1LBL);
				setProperty("containerLayoutData");
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
		return containerLayoutDataTXT;
	}
	public TextController createContainerLocation(ControllerCore genCode) {
		// Creates control for TextController containerLocationTXT
		containerLocationTXT = new TextController("containerLocation", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerLocation$1LBL);
				setProperty("containerLocation");
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
		return containerLocationTXT;
	}
	public TextController createContainerMenu(ControllerCore genCode) {
		// Creates control for TextController containerMenuTXT
		containerMenuTXT = new TextController("containerMenu", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerMenu$1LBL);
				setProperty("containerMenu");
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
		return containerMenuTXT;
	}
	public TextController createContainerRedraw(ControllerCore genCode) {
		// Creates control for TextController containerRedrawTXT
		containerRedrawTXT = new TextController("containerRedraw", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerRedraw$1LBL);
				setProperty("containerRedraw");
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
		return containerRedrawTXT;
	}
	public TextController createContainerSize(ControllerCore genCode) {
		// Creates control for TextController containerSizeTXT
		containerSizeTXT = new TextController("containerSize", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerSize$1LBL);
				setProperty("containerSize");
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
		return containerSizeTXT;
	}
	public TextController createContainerStyle(ControllerCore genCode) {
		// Creates control for TextController containerStyleTXT
		containerStyleTXT = new TextController("containerStyle", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(containerStyle$1LBL);
				setProperty("containerStyle");
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
		return containerStyleTXT;
	}
	public XjcTextController createEnabled(ControllerCore genCode) {
		// Creates control for XjcTextController enabledTXT
		enabledTXT = new XjcTextController("enabled", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(enabled$1LBL);
				setProperty("enabled");
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
		return enabledTXT;
	}
	public ColorController createForeground(ControllerCore genCode) {
		// Creates control for ColorController foregroundTXT
		foregroundTXT = new ColorController("foreground", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(foreground$1LBL);
				setProperty("foreground");
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
		return foregroundTXT;
	}
	public TextController createHeaderVisible(ControllerCore genCode) {
		// Creates control for TextController headerVisibleTXT
		headerVisibleTXT = new TextController("headerVisible", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(headerVisible$1LBL);
				setProperty("headerVisible");
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
		return headerVisibleTXT;
	}
	public XjcTextController createLayoutData(ControllerCore genCode) {
		// Creates control for XjcTextController layoutDataTXT
		layoutDataTXT = new XjcTextController("layoutData", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(layoutData$1LBL);
				setProperty("layoutData");
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
		return layoutDataTXT;
	}
	public TextController createLinesVisible(ControllerCore genCode) {
		// Creates control for TextController linesVisibleTXT
		linesVisibleTXT = new TextController("linesVisible", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(linesVisible$1LBL);
				setProperty("linesVisible");
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
		return linesVisibleTXT;
	}
	public TextController createStyle(ControllerCore genCode) {
		// Creates control for TextController styleTXT
		styleTXT = new TextController("style", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(style$1LBL);
				setProperty("style");
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
		return styleTXT;
	}
	public XjcTextController createVisible(ControllerCore genCode) {
		// Creates control for XjcTextController visibleTXT
		visibleTXT = new XjcTextController("visible", getParentController(controlItemSCSCLC), genCode) {
			@Override
			public void initialize() {
				setLinkedController(visible$1LBL);
				setProperty("visible");
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
		return visibleTXT;
	}
}