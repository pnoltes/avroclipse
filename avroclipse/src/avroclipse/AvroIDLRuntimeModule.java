/*
 * generated by Xtext
 */
package avroclipse;

import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper;

import avroclipse.validation.AvroIDLNamesAreUniqueValidationHelper;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class AvroIDLRuntimeModule extends avroclipse.AbstractAvroIDLRuntimeModule {

	public Class<? extends NamesAreUniqueValidationHelper> bindNamesAreUniqueValidationHelper() {
		return AvroIDLNamesAreUniqueValidationHelper.class;
	}

}