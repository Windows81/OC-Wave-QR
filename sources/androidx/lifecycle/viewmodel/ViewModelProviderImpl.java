package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class ViewModelProviderImpl {

    /* renamed from: a  reason: collision with root package name */
    public final ViewModelStore f22069a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewModelProvider.Factory f22070b;

    /* renamed from: c  reason: collision with root package name */
    public final CreationExtras f22071c;

    /* renamed from: d  reason: collision with root package name */
    public final SynchronizedObject f22072d = new SynchronizedObject();

    public ViewModelProviderImpl(ViewModelStore viewModelStore, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        Intrinsics.i(viewModelStore, "store");
        Intrinsics.i(factory, "factory");
        Intrinsics.i(creationExtras, "defaultExtras");
        this.f22069a = viewModelStore;
        this.f22070b = factory;
        this.f22071c = creationExtras;
    }

    public static /* synthetic */ ViewModel e(ViewModelProviderImpl viewModelProviderImpl, KClass kClass, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = ViewModelProviders.f22086a.d(kClass);
        }
        return viewModelProviderImpl.d(kClass, str);
    }

    public final ViewModel d(KClass kClass, String str) {
        ViewModel b2;
        Intrinsics.i(kClass, "modelClass");
        Intrinsics.i(str, "key");
        synchronized (this.f22072d) {
            try {
                b2 = this.f22069a.b(str);
                if (kClass.h(b2)) {
                    if (this.f22070b instanceof ViewModelProvider.OnRequeryFactory) {
                        Intrinsics.f(b2);
                        ((ViewModelProvider.OnRequeryFactory) this.f22070b).d(b2);
                    }
                    Intrinsics.g(b2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f22071c);
                    mutableCreationExtras.c(ViewModelProvider.f21995c, str);
                    b2 = ViewModelProviderImpl_androidKt.a(this.f22070b, kClass, mutableCreationExtras);
                    this.f22069a.d(str, b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }
}
