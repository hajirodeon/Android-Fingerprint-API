// Code generated by dagger-compiler.  Do not edit.
package com.example.android.fingerprintdialog;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class FingerprintModule$$ModuleAdapter extends ModuleAdapter<FingerprintModule> {
  private static final String[] INJECTS = { "members/com.example.android.fingerprintdialog.MainActivity", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public FingerprintModule$$ModuleAdapter() {
    super(com.example.android.fingerprintdialog.FingerprintModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, FingerprintModule module) {
    bindings.contributeProvidesBinding("android.content.Context", new ProvidesContextProvidesAdapter(module));
    bindings.contributeProvidesBinding("android.support.v4.hardware.fingerprint.FingerprintManagerCompat", new ProvidesFingerprintManagerProvidesAdapter(module));
    bindings.contributeProvidesBinding("android.view.inputmethod.InputMethodManager", new ProvidesInputMethodManagerProvidesAdapter(module));
    bindings.contributeProvidesBinding("android.content.SharedPreferences", new ProvidesSharedPreferencesProvidesAdapter(module));
  }

  /**
   * A {@code Binding<android.content.Context>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<android.content.Context>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesContextProvidesAdapter extends ProvidesBinding<android.content.Context>
      implements Provider<android.content.Context> {
    private final FingerprintModule module;

    public ProvidesContextProvidesAdapter(FingerprintModule module) {
      super("android.content.Context", NOT_SINGLETON, "com.example.android.fingerprintdialog.FingerprintModule", "providesContext");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.Context>}.
     */
    @Override
    public android.content.Context get() {
      return module.providesContext();
    }
  }

  /**
   * A {@code Binding<android.support.v4.hardware.fingerprint.FingerprintManagerCompat>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code android.support.v4.hardware.fingerprint.FingerprintManagerCompat} and its
   * dependencies.
   *
   * Being a {@code Provider<android.support.v4.hardware.fingerprint.FingerprintManagerCompat>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesFingerprintManagerProvidesAdapter extends ProvidesBinding<android.support.v4.hardware.fingerprint.FingerprintManagerCompat>
      implements Provider<android.support.v4.hardware.fingerprint.FingerprintManagerCompat> {
    private final FingerprintModule module;
    private Binding<android.content.Context> context;

    public ProvidesFingerprintManagerProvidesAdapter(FingerprintModule module) {
      super("android.support.v4.hardware.fingerprint.FingerprintManagerCompat", NOT_SINGLETON, "com.example.android.fingerprintdialog.FingerprintModule", "providesFingerprintManager");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", FingerprintModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.support.v4.hardware.fingerprint.FingerprintManagerCompat>}.
     */
    @Override
    public android.support.v4.hardware.fingerprint.FingerprintManagerCompat get() {
      return module.providesFingerprintManager(context.get());
    }
  }

  /**
   * A {@code Binding<android.view.inputmethod.InputMethodManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code android.view.inputmethod.InputMethodManager} and its
   * dependencies.
   *
   * Being a {@code Provider<android.view.inputmethod.InputMethodManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesInputMethodManagerProvidesAdapter extends ProvidesBinding<android.view.inputmethod.InputMethodManager>
      implements Provider<android.view.inputmethod.InputMethodManager> {
    private final FingerprintModule module;
    private Binding<android.content.Context> context;

    public ProvidesInputMethodManagerProvidesAdapter(FingerprintModule module) {
      super("android.view.inputmethod.InputMethodManager", NOT_SINGLETON, "com.example.android.fingerprintdialog.FingerprintModule", "providesInputMethodManager");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", FingerprintModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.view.inputmethod.InputMethodManager>}.
     */
    @Override
    public android.view.inputmethod.InputMethodManager get() {
      return module.providesInputMethodManager(context.get());
    }
  }

  /**
   * A {@code Binding<android.content.SharedPreferences>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Owning the dependency links between {@code android.content.SharedPreferences} and its
   * dependencies.
   *
   * Being a {@code Provider<android.content.SharedPreferences>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidesSharedPreferencesProvidesAdapter extends ProvidesBinding<android.content.SharedPreferences>
      implements Provider<android.content.SharedPreferences> {
    private final FingerprintModule module;
    private Binding<android.content.Context> context;

    public ProvidesSharedPreferencesProvidesAdapter(FingerprintModule module) {
      super("android.content.SharedPreferences", NOT_SINGLETON, "com.example.android.fingerprintdialog.FingerprintModule", "providesSharedPreferences");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", FingerprintModule.class, getClass().getClassLoader());
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.SharedPreferences>}.
     */
    @Override
    public android.content.SharedPreferences get() {
      return module.providesSharedPreferences(context.get());
    }
  }
}
