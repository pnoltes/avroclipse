/**
 */
package avroclipse.avroIDL.impl;

import avroclipse.avroIDL.AvroIDLFile;
import avroclipse.avroIDL.AvroIDLPackage;
import avroclipse.avroIDL.Import;
import avroclipse.avroIDL.Protocol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avroIDL.impl.AvroIDLFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link avroclipse.avroIDL.impl.AvroIDLFileImpl#getProtocols <em>Protocols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvroIDLFileImpl extends MinimalEObjectImpl.Container implements AvroIDLFile
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocols()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvroIDLFileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AvroIDLPackage.Literals.AVRO_IDL_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AvroIDLPackage.AVRO_IDL_FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Protocol> getProtocols()
  {
    if (protocols == null)
    {
      protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS);
    }
    return protocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AvroIDLPackage.AVRO_IDL_FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS:
        return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AvroIDLPackage.AVRO_IDL_FILE__IMPORTS:
        return getImports();
      case AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS:
        return getProtocols();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AvroIDLPackage.AVRO_IDL_FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS:
        getProtocols().clear();
        getProtocols().addAll((Collection<? extends Protocol>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AvroIDLPackage.AVRO_IDL_FILE__IMPORTS:
        getImports().clear();
        return;
      case AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS:
        getProtocols().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AvroIDLPackage.AVRO_IDL_FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AvroIDLPackage.AVRO_IDL_FILE__PROTOCOLS:
        return protocols != null && !protocols.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AvroIDLFileImpl