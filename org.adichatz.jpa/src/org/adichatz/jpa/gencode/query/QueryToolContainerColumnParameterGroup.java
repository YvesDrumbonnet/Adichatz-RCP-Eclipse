/**********************************************************************************************
 * This class was automatically generated by Adichatz tools on Fri Feb 21 14:35:34 CET 2020
 *
 * 				+----------------------------------------+
 * 				| BE CAREFUL BEFORE UPDATING THIS CLASS! |
 * 				+----------------------------------------+
 *
 * Changes will be transient up to next generation process.
 * **********************************************************************************************/
package org.adichatz.jpa.gencode.query;

import java.util.List;
import java.util.function.BooleanSupplier;
import net.miginfocom.swt.MigLayout;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.controller.IContainerController;
import org.adichatz.engine.controller.collection.CompositeController;
import org.adichatz.engine.controller.field.ComboController;
import org.adichatz.engine.controller.field.LabelController;
import org.adichatz.engine.controller.nebula.PGroupController;
import org.adichatz.engine.controller.nebula.ScrolledPGroupController;
import org.adichatz.engine.controller.utils.DataReferenceManager;
import org.adichatz.engine.controller.utils.ElementaryAccessibility;
import org.adichatz.engine.core.ControllerCore;
import org.adichatz.engine.core.EntityManagerCore;
import org.adichatz.engine.extra.AdiResourceURI;
import org.adichatz.engine.plugin.AdiContext;
import org.adichatz.engine.validation.EntityInjection;
import org.adichatz.jpa.query.action.DeleteParameterItemController;
import org.adichatz.jpa.query.action.RefreshParameterItemController;
import org.adichatz.jpa.query.action.ValidateParameterItemController;
import org.adichatz.jpa.query.custom.ColumnParameterTableController;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;

@AdiResourceURI(URI="adi://org.adichatz.jpa/query/QueryToolContainer")
public class QueryToolContainerColumnParameterGroup extends EntityManagerCore {
	// the RefreshParameterItemController refreshParameterItemPGTI.
	private RefreshParameterItemController refreshParameterItemPGTI;
	// the DeleteParameterItemController deleteParameterItemPGTI.
	private DeleteParameterItemController deleteParameterItemPGTI;
	// the ValidateParameterItemController validateParameterItemPGTI.
	private ValidateParameterItemController validateParameterItemPGTI;
	// the CompositeController bufferCompositeCMPS.
	protected CompositeController bufferCompositeCMPS;
	// the CompositeController columnParameterDetailCMPS.
	protected CompositeController columnParameterDetailCMPS;
	// the CompositeController columnAndOperatorCMPS.
	protected CompositeController columnAndOperatorCMPS;
	// the ComboController operatorCMB.
	private ComboController operatorCMB;
	// the LabelController andLBL.
	private LabelController andLBL;
	// the CompositeController columnDynamicExpressionsCMPS.
	protected CompositeController columnDynamicExpressionsCMPS;
	/**
	 * Creates QueryToolContainerColumnParameterGroup.
	 *
	 * @param context
	 *            The context of the root controller
	 * @param core controller
	 *            The collection controller linked to the class
	 */
	public QueryToolContainerColumnParameterGroup(final AdiContext context, IContainerController parentController) {
		super(context);
		// do not create contents when context is null because that means that class is invoked from dynamic part
		if (null != context) {
			coreController = new ScrolledPGroupController("columnParameterGroup", parentController, this) {
				@Override
				public void afterInstantiateController() {
					breakInjection = true;
					super.afterInstantiateController();
				}
				@Override
				public void initialize() {
					BooleanSupplier evaluatorVALID;
					evaluatorVALID = new BooleanSupplier() {
						public boolean getAsBoolean() {
							return null != ((ColumnParameterTableController) getFromRegister("parameterTable")).getSelectedObject();
						}
					};
					addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.VALID, evaluatorVALID));
					BooleanSupplier evaluatorVISIBLE;
					evaluatorVISIBLE = new BooleanSupplier() {
						public boolean getAsBoolean() {
							return null != ((ColumnParameterTableController) getFromRegister("parameterTable")).getSelectedObject();
						}
					};
					addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.VISIBLE, evaluatorVISIBLE));
					super.initialize();
				}
				@Override
				public void createControl() {
					super.createControl();
					if (isValid()) {
						getControl().setText(AdichatzApplication.getInstance().getMessage("org.adichatz.jpa", "adichatzJpa", "query.column.parameter.detailGroup"));
						getComposite().setLayout(new MigLayout("wrap 1","[grow, fill]","align top"));
					}
				}
				@Override
				public EntityInjection getEntityInjection() {
					if (null == entityInjection)
						entityInjection = new EntityInjection(this, null);
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
		// Creates control for RefreshParameterItemController refreshParameterItemPGTI
		refreshParameterItemPGTI = new RefreshParameterItemController("refreshParameterItem", (PGroupController) coreController, this);
		// Creates control for DeleteParameterItemController deleteParameterItemPGTI
		deleteParameterItemPGTI = new DeleteParameterItemController("deleteParameterItem", (PGroupController) coreController, this);
		// Creates control for ValidateParameterItemController validateParameterItemPGTI
		validateParameterItemPGTI = new ValidateParameterItemController("validateParameterItem", (PGroupController) coreController, this);
		// Creates control for CompositeController bufferCompositeCMPS
		bufferCompositeCMPS = new CompositeController("bufferComposite", coreController, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getComposite().setLayout(new MigLayout("wrap 1, ins 0","grow, fill","grow, fill"));
					getControl().setLayoutData("h 45!");
				}
			}
		};
		// Creates control for CompositeController columnParameterDetailCMPS
		columnParameterDetailCMPS = new CompositeController("columnParameterDetail", bufferCompositeCMPS, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getComposite().setLayout(new MigLayout("wrap 2, ins 0","[]10[grow, fill]","[grow, fill, align top][]"));
				}
			}
		};
		// Creates control for CompositeController columnAndOperatorCMPS
		columnAndOperatorCMPS = new CompositeController("columnAndOperator", columnParameterDetailCMPS, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getComposite().setLayout(new MigLayout("wrap 1, ins 0","[]","[][]"));
				}
			}
		};
		createOperator(this);
		// Creates control for LabelController andLBL
		andLBL = new LabelController("and", columnAndOperatorCMPS, this) {
			@Override
			public void initialize() {
				BooleanSupplier evaluatorVISIBLE;
				evaluatorVISIBLE = new BooleanSupplier() {
					public boolean getAsBoolean() {
						return false;
					}
				};
				addAccessibility(new ElementaryAccessibility(ElementaryAccessibility.ACCESS_ATTRIBUTE.VISIBLE, evaluatorVISIBLE));
				super.initialize();
			}
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getControl().setText("and");
					getControl().setLayoutData("right");
				}
			}
		};
		// Creates control for CompositeController columnDynamicExpressionsCMPS
		columnDynamicExpressionsCMPS = new CompositeController("columnDynamicExpressions", columnParameterDetailCMPS, this) {
			@Override
			public void createControl() {
				super.createControl();
				if (isValid()) {
					getComposite().setLayout(new MigLayout("wrap 1, ins 0","[grow,fill]","[align top][align top]"));
				}
			}
		};
	}
	public ComboController createOperator(ControllerCore genCode) {
		// Creates control for ComboController operatorCMB
		operatorCMB = new ComboController("operator", getParentController(columnAndOperatorCMPS), genCode) {
			@Override
			public void initialize() {
				setProperty("operator");
				super.initialize();
			}
			@Override
			public void createControl() {
				if (isValid()) {
					setStyle(SWT.BORDER | SWT.READ_ONLY);
					labelProvider = new LabelProvider() {
						public String getText(Object element) {
							return null == element ? "" : String.valueOf(element);
						}
					};
				}
				super.createControl();
				if (isValid()) {
					dataReferenceManager = new DataReferenceManager(this);
				}
			}
			@Override
			public List getValues() {
				return (List) getViewer().getInput();
			}
		};
		return operatorCMB;
	}
}