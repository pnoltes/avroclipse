/**
 */
package avroclipse.avdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link avroclipse.avdl.ErrorType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see avroclipse.avdl.AvdlPackage#getErrorType()
 * @model
 * @generated
 */
public interface ErrorType extends Type
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link avroclipse.avdl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see avroclipse.avdl.AvdlPackage#getErrorType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // ErrorType
