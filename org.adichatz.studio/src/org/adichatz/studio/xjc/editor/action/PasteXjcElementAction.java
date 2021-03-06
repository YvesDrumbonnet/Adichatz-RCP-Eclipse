/*******************************************************************************
 * Copyright � Adichatz (2007-2020) - www.adichatz.org
 *
 * yves@adichatz.org
 *
 * This software is a computer program whose purpose is to build easily
 * Eclipse RCP applications using JPA in a JEE or JSE context.
 *
 * This software is governed by the CeCILL-C license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 *
 *
 ********************************************************************************
 *
 * Copyright � Adichatz (2007-2020) - www.adichatz.org
 *
 * yves@adichatz.org
 *
 * Ce logiciel est un programme informatique servant � construire rapidement des
 * applications Eclipse RCP en utilisant JPA dans un contexte JSE ou JEE.
 *
 * Ce logiciel est r�gi par la licence CeCILL-C soumise au droit fran�ais et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffus�e par le CEA, le CNRS et l'INRIA
 * sur le site "http://www.cecill.info".
 *
 * En contrepartie de l'accessibilit� au code source et des droits de copie,
 * de modification et de redistribution accord�s par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limit�e.  Pour les m�mes raisons,
 * seule une responsabilit� restreinte p�se sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les conc�dants successifs.
 *
 * A cet �gard  l'attention de l'utilisateur est attir�e sur les risques
 * associ�s au chargement,  � l'utilisation,  � la modification et/ou au
 * d�veloppement et � la reproduction du logiciel par l'utilisateur �tant
 * donn� sa sp�cificit� de logiciel libre, qui peut le rendre complexe �
 * manipuler et qui le r�serve donc � des d�veloppeurs et des professionnels
 * avertis poss�dant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invit�s � charger  et  tester  l'ad�quation  du
 * logiciel � leurs besoins dans des conditions permettant d'assurer la
 * s�curit� de leurs syst�mes et ou de leurs donn�es et, plus g�n�ralement,
 * � l'utiliser et l'exploiter dans les m�mes conditions de s�curit�.
 *
 * Le fait que vous puissiez acc�der � cet en-t�te signifie que vous avez
 * pris connaissance de la licence CeCILL, et que vous en avez accept� les
 * termes.
 *******************************************************************************/
package org.adichatz.studio.xjc.editor.action;

import static org.adichatz.studio.util.StudioUtil.getFromStudioBundle;

import java.lang.reflect.Method;
import java.util.Collection;

import org.adichatz.common.ejb.util.IEntityConstants;
import org.adichatz.engine.common.AdichatzApplication;
import org.adichatz.engine.common.EngineTools;
import org.adichatz.engine.common.FieldTools;
import org.adichatz.engine.common.ReflectionTools;
import org.adichatz.generator.common.GeneratorConstants;
import org.adichatz.studio.xjc.controller.XjcTreeController;
import org.adichatz.studio.xjc.data.XjcDataAccess;
import org.adichatz.studio.xjc.data.XjcDataCache;
import org.adichatz.studio.xjc.data.XjcEntity;
import org.adichatz.studio.xjc.data.XjcTreeElement;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.Clipboard;

// TODO: Auto-generated Javadoc
/**
 * The Class PasteXjcElementAction.
 */
public class PasteXjcElementAction extends AEditAction {

	/** The clipboard selection. */
	ITreeSelection clipboardSelection;

	/**
	 * Instantiates a new paste xjc element action.
	 */
	public PasteXjcElementAction() {
		String text = getFromStudioBundle("studio.editor.paste");
		setText(text);
		setToolTipText(text);
		setImageDescriptor(AdichatzApplication.getInstance().getFormToolkit().getRegisteredImageDescriptor("IMG_PASTE"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.action.AAction#runAction()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void runAction() {
		final XjcDataAccess dataAccess = (XjcDataAccess) treeController.getPluginResources().getDataAccess();
		final XjcDataCache dataCache = (XjcDataCache) dataAccess.getDataCache();
		TreePath parentPath = ((ITreeSelection) treeController.getViewer().getSelection()).getPaths()[0];
		XjcTreeElement parentElement = (XjcTreeElement) parentPath.getLastSegment();
		Method method = null;
		Collection collection = null;
		boolean refFieldEligible = treeController.isRefFieldEligible(parentElement, clipboardSelection);
		boolean isEntitySetEligible = true;
		if (refFieldEligible)
			method = ReflectionTools.getMethod(parentElement.getElement().getClass(),
					"s".concat(treeController.getElectedRefMethod().getName().substring(1)),
					treeController.getElectedRefMethod().getReturnType());
		else {
			isEntitySetEligible = treeController.isEntitySetEligible(parentElement, clipboardSelection);
			if (isEntitySetEligible) {
				method = FieldTools.getGetMethod(parentElement.getElement().getClass(),
						treeController.getElectedEntitySet().getFieldName(), true);
				collection = (Collection) ReflectionTools.invokeMethod(method, parentElement.getElement());
			}
		}
		// Stores Entity and not XjcTreeElement or TreePath because XjcTreeElement is redifined after refresh
		XjcEntity[] childEntities = new XjcEntity[clipboardSelection.size()];
		int pathIndex = 0;
		for (Object copiedObject : clipboardSelection.toArray()) {
			Object clone = EngineTools.cloneSerializable(((XjcTreeElement) copiedObject).getElement());
			boolean refField = false;
			if (refFieldEligible) {
				ReflectionTools.invokeMethod(method, parentElement.getElement(), new Object[] { clone });
				refField = true;
			} else if (isEntitySetEligible) {
				collection.add(clone);
			}
			XjcEntity<?> entity = dataCache.fetchEntity(clone, dataAccess.getCacheKey(clone));
			XjcTreeElement childElement = new XjcTreeElement(treeController.getTreeManager(), parentElement, clone, method,
					refField);
			entity.setTreeElement(childElement);
			entity.putStatus(IEntityConstants.PERSIST, true);
			parentElement.getChildElements().add(entity.getTreeElement());
			childEntities[pathIndex++] = entity;
		}
		treeController.refresh(parentElement);
		parentElement.getEntity().putStatus(IEntityConstants.MERGE, true);
		((TreeViewer) treeController.getViewer()).expandToLevel(parentElement, 1);
		for (XjcEntity childEntity : childEntities)
			treeController.getViewer().setSelection(new TreeSelection(parentPath.createChildPath(childEntity.getTreeElement())));
		XjcSelectionTransfer.getTransfer().setCutSelectionIsCopied(true);
		setDirty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adichatz.engine.action.AAction#postCreate()
	 */
	@Override
	public void postCreate() {
		treeController = (XjcTreeController) actionController.getGenCode().getFromRegister("xjcTree");
		ITreeSelection treeSelection = (ITreeSelection) treeController.getViewer().getSelection();
		if (1 != treeSelection.size())
			setEnabled(false);
		else {
			Clipboard clipboard = new Clipboard(treeController.getControl().getDisplay());
			clipboardSelection = (ITreeSelection) clipboard.getContents(XjcSelectionTransfer.getTransfer());
			clipboard.dispose();

			if (null == clipboardSelection || clipboardSelection.isEmpty())
				setEnabled(false);
			else if (treeController.isRefFieldEligible((XjcTreeElement) treeSelection.getFirstElement(), clipboardSelection)) {
				String entityURI = treeController.getPluginResources().getPluginEntityTree()
						.getPluginEntity(treeController.getElectedRefMethod().getReturnType()).getEntityURI();
				String[] entityKeys = EngineTools.getInstanceKeys(entityURI);
				String entityText = xjcElementRB.getString(entityKeys[2]);
				String text = getFromStudioBundle("studio.editor.replace", entityText);
				setText(text);
				setToolTipText(text);
				setImageDescriptor(
						AdichatzApplication.getInstance().getImageDescriptor(GeneratorConstants.STUDIO_BUNDLE, "IMG_REPLACE.gif"));
				setEnabled(true);
			} else
				setEnabled(
						treeController.isEntitySetEligible((XjcTreeElement) treeSelection.getFirstElement(), clipboardSelection));
		}
	}
}
