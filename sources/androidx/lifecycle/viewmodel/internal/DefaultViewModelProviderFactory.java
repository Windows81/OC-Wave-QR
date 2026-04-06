package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {

    /* renamed from: b  reason: collision with root package name */
    public static final DefaultViewModelProviderFactory f22080b = new DefaultViewModelProviderFactory();

    public ViewModel a(KClass kClass, CreationExtras creationExtras) {
        Intrinsics.i(kClass, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        return JvmViewModelProviders.f22081a.a(JvmClassMappingKt.a(kClass));
    }
}
