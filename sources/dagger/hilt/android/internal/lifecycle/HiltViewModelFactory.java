package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.Module;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: e  reason: collision with root package name */
    public static final CreationExtras.Key f39716e = new CreationExtras.Key<Function1<Object, ViewModel>>() {
    };

    /* renamed from: b  reason: collision with root package name */
    public final Map f39717b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewModelProvider.Factory f39718c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewModelProvider.Factory f39719d;

    public interface ActivityCreatorEntryPoint {
        Map c();

        ViewModelComponentBuilder e();
    }

    public interface ViewModelFactoriesEntryPoint {
        Map a();

        Map b();
    }

    @Module
    public interface ViewModelModule {
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.f39717b = map;
        this.f39718c = factory;
        this.f39719d = new ViewModelProvider.Factory() {
            public ViewModel c(Class cls, CreationExtras creationExtras) {
                RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                ViewModel d2 = d(viewModelComponentBuilder.b(SavedStateHandleSupport.a(creationExtras)).a(retainedLifecycleImpl).d(), cls, creationExtras);
                d2.b(new a(retainedLifecycleImpl));
                return d2;
            }

            public final ViewModel d(ViewModelComponent viewModelComponent, Class cls, CreationExtras creationExtras) {
                Class<ViewModelFactoriesEntryPoint> cls2 = ViewModelFactoriesEntryPoint.class;
                Provider provider = (Provider) ((ViewModelFactoriesEntryPoint) EntryPoints.a(viewModelComponent, cls2)).a().get(cls);
                Function1 function1 = (Function1) creationExtras.a(HiltViewModelFactory.f39716e);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.a(viewModelComponent, cls2)).b().get(cls);
                if (obj == null) {
                    if (function1 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    } else if (provider != null) {
                        return (ViewModel) provider.get();
                    } else {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                } else if (provider != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                } else if (function1 != null) {
                    return (ViewModel) function1.invoke(obj);
                } else {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
            }
        };
    }

    public static ViewModelProvider.Factory d(Activity activity, ViewModelProvider.Factory factory) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.a(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.c(), factory, activityCreatorEntryPoint.e());
    }

    public ViewModel b(Class cls) {
        return this.f39717b.containsKey(cls) ? this.f39719d.b(cls) : this.f39718c.b(cls);
    }

    public ViewModel c(Class cls, CreationExtras creationExtras) {
        return this.f39717b.containsKey(cls) ? this.f39719d.c(cls, creationExtras) : this.f39718c.c(cls, creationExtras);
    }
}
