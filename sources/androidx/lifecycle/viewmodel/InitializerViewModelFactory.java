package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: b  reason: collision with root package name */
    public final ViewModelInitializer[] f22065b;

    public ViewModel c(Class cls, CreationExtras creationExtras) {
        Intrinsics.i(cls, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.f22086a;
        KClass c2 = JvmClassMappingKt.c(cls);
        ViewModelInitializer[] viewModelInitializerArr = this.f22065b;
        return viewModelProviders.a(c2, creationExtras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
