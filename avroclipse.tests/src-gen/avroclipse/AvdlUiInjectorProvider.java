/*
 * generated by Xtext
 */
package avroclipse;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AvdlUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return avroclipse.ui.internal.AvdlActivator.getInstance().getInjector("avroclipse.Avdl");
	}
	
}
