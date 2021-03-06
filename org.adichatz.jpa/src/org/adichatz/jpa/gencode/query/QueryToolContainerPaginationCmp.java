/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 14:35:33 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.query;

import java.math.BigDecimal;
import java.util.function.BooleanSupplier;
import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.AWidgetController;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.action.HelpButtonController;
import org.adichatz.engine.controller.collection.CompositeController;
import org.adichatz.engine.controller.field.LabelController;
import org.adichatz.engine.controller.field.NumericTextController;
import org.adichatz.engine.controller.utils.ElementaryAccessibility;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.listener.AEntityListener;
import org.adichatz.engine.listener.AdiEntityEvent;
import org.adichatz.engine.listener.IEventType;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.validation.AValidator;
import org.adichatz.engine.validation.EntityInjection;
import org.adichatz.jpa.query.QueryToolInput;
import org.adichatz.jpa.wrapper.QueryPaginationWrapper;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerPaginationCmp extends EntityManagerCore {
	// the LabelController totalQueryCountLBLLBL.
	private LabelController totalQueryCountLBLLBL;
	// the NumericTextController totalQueryCountNTXT.
	private NumericTextController totalQueryCountNTXT;
	// the LabelController maxResults$1LBL.
	private LabelController maxResults$1LBL;
	// the NumericTextController maxResultsNTXT.
	private NumericTextController maxResultsNTXT;
	// the HelpButtonController maxResultsHlpHB.
	private HelpButtonController maxResultsHlpHB;
	/**
	 * Creates QueryToolContainerPaginationCmp.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerPaginationCmp(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new CompositeController("paginationCmp", parentController, this) {
				@Override
				public void afterInstantiateController() {
					breakInjection = true;
					super.afterInstantiateController();
				}
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getComposite().setLayout(new MigLayout("wrap 3","[right]15[][]",null));
						addValidator(new AValidator(this, "positiveValue") {
							private boolean hasError() {
								return null != ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults() && 0  >= ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults().intValue();
							}
							public int validate() {
								if (hasError()) {
									return setLevel(IMessageProvider.ERROR, AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "positiveValue", ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults()));
								} else {
									return setLevel(IMessageProvider.NONE, null);
								}
							};
						});
						addValidator(new AValidator(this, "greaterThan10") {
							private boolean hasWarning() {
								return null != ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults() && 10 > ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults().intValue();
							}
							public int validate() {
								if (hasWarning()) {
									return setLevel(IMessageProvider.WARNING, AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "greaterThan10", ((QueryPaginationWrapper) getEntity().getBean()).getMaxResults()));
								} else {
									return setLevel(IMessageProvider.NONE, null);
								}
							};
						});
					}
				}
				@Override
				public void synchronize() {
					super.synchronize();
					if (isValid()) {
						AEntityListener paginationCmpLSTN$0 = new AEntityListener(coreController, IEventType.AFTER_PROPERTY_CHANGE) {
							@Override
							public void handleEntityEvent(AdiEntityEvent event) {
								((QueryToolInput) ((AWidgetController) getFromRegister("queryTool")).getEntity().getBean()).setChanged(true);
							}
						};
					}
				}
				@Override
				public EntityInjection getEntityInjection() {
					if (null == entityInjection)
						entityInjection = new EntityInjection(this, getDataAccess().getDataCache().fetchEntity(((QueryToolInput) ((AWidgetController) getFromRegister("queryTool")).getEntity().getBean()).getQueryPreference().getPagination()));
					return entityInjection;
				}
			};
			createContents();
		} else
			coreController = parentController;
	}

	/**
	 * creates contents for controller
	 */
	public void createContents(){
		// Creates control for LabelController totalQueryCountLBLLBL
		totalQueryCountLBLLBL = new LabelController("totalQueryCountLBL", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "totalQueryCount"));
				}
			}
		};
		createTotalQueryCount(this);
		// Creates control for LabelController maxResults$1LBL
		maxResults$1LBL = new LabelController("maxResults$1", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "adichatzJpa", "queryPreference.maxResults"));
					getControl().setLayoutData("skip 1");
				}
			}
		};
		createMaxResults(this);
		// Creates control for HelpButtonController maxResultsHlpHB
		maxResultsHlpHB = new HelpButtonController("maxResultsHlp", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setImage(AdichatzApplication.getInstance().getFormToolkit().getRegisteredImage("IMG_HELP"));
					setHelpLabel(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "maxResults.specify"));
					setHelpSpecify(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "maxResults.specify"));
					setHelpMessage(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "pagination", "maxResults.message"));
				}
			}
		};
	}
	public NumericTextController createTotalQueryCount(ControllerCore genCode) {
		// Creates control for NumericTextController totalQueryCountNTXT
		totalQueryCountNTXT = new NumericTextController("totalQueryCount", getParentController(coreController), genCode) {
			@Override
			public void initialize() {
				BooleanSupplier evaluatorENABLED;
				evaluatorENABLED = new BooleanSupplier() {
					public boolean getAsBoolean() {
						return false;
					}
				};
				addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.ENABLED, evaluatorENABLED));
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setLayoutData("sg pgGroup");
				}
			}
			@Override
			public void synchronize() {
				super.synchronize();
				if (isValid()) {
					getNumericText().setNullOk(false);
				}
			}
			@Override
			public Object convertTargetToModel(Object fromObject) {
				if (fromObject instanceof Number)
					return ((BigDecimal) fromObject).intValue();
				return 0;
			}
		};
		return totalQueryCountNTXT;
	}
	public NumericTextController createMaxResults(ControllerCore genCode) {
		// Creates control for NumericTextController maxResultsNTXT
		maxResultsNTXT = new NumericTextController("maxResults", getParentController(coreController), genCode) {
			@Override
			public void initialize() {
				setLinkedController(maxResults$1LBL);
				setProperty("maxResults");
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					setStyle(SWT.BORDER | SWT.SINGLE | SWT.RIGHT);
					getControl().setLayoutData("sg pgGroup");
				}
			}
			@Override
			public Object convertTargetToModel(Object fromObject) {
				if (fromObject instanceof Number)
					return ((BigDecimal) fromObject).intValue();
				return null;
			}
		};
		return maxResultsNTXT;
	}
}