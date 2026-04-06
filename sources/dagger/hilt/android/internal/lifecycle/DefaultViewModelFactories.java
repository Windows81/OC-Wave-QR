package dagger.hilt.android.internal.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.Module;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.internal.Preconditions;
import java.util.Map;

public final class DefaultViewModelFactories {

    public interface ActivityEntryPoint {
        InternalFactoryFactory a();
    }

    @Module
    public interface ActivityModule {
    }

    public interface FragmentEntryPoint {
    }

    public static final class InternalFactoryFactory {

        /* renamed from: a  reason: collision with root package name */
        public final Map f39712a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewModelComponentBuilder f39713b;

        public InternalFactoryFactory(Map map, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.f39712a = map;
            this.f39713b = viewModelComponentBuilder;
        }

        public ViewModelProvider.Factory a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return b(factory);
        }

        public final ViewModelProvider.Factory b(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.f39712a, (ViewModelProvider.Factory) Preconditions.a(factory), this.f39713b);
        }
    }

    public static ViewModelProvider.Factory a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((ActivityEntryPoint) EntryPoints.a(componentActivity, ActivityEntryPoint.class)).a().a(componentActivity, factory);
    }
}
