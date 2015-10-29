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

	public static final String GENERATORS_POINT_ID = "avroclipse.generator";
	
	public Class<? extends NamesAreUniqueValidationHelper> bindNamesAreUniqueValidationHelper() {
		return AvroIDLNamesAreUniqueValidationHelper.class;
	}

	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return avroclipse.scoping.AvroIDLScopeProvider.class;
	}

	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(com.google.inject.name.Names
						.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
	}

	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider.class;
	}

	public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
	}

}
