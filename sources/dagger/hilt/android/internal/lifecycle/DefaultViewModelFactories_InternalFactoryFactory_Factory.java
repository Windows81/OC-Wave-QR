package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Map;

public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements Factory<DefaultViewModelFactories.InternalFactoryFactory> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39714a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f39715b;

    public static DefaultViewModelFactories.InternalFactoryFactory b(Map map, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(map, viewModelComponentBuilder);
    }

    /* renamed from: a */
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return b((Map) this.f39714a.get(), (ViewModelComponentBuilder) this.f39715b.get());
    }
}
