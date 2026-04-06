package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class ViewModelProviders {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewModelProviders f22086a = new ViewModelProviders();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.lifecycle.ViewModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.ViewModel a(kotlin.reflect.KClass r6, androidx.lifecycle.viewmodel.CreationExtras r7, androidx.lifecycle.viewmodel.ViewModelInitializer... r8) {
        /*
            r5 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "initializers"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            int r0 = r8.length
            r1 = 0
        L_0x0011:
            r2 = 0
            if (r1 >= r0) goto L_0x0024
            r3 = r8[r1]
            kotlin.reflect.KClass r4 = r3.a()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0024:
            r3 = r2
        L_0x0025:
            if (r3 == 0) goto L_0x0034
            kotlin.jvm.functions.Function1 r8 = r3.b()
            if (r8 == 0) goto L_0x0034
            java.lang.Object r7 = r8.invoke(r7)
            r2 = r7
            androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "No initializer set for given class "
            r7.append(r8)
            java.lang.String r6 = androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt.a(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.viewmodel.internal.ViewModelProviders.a(kotlin.reflect.KClass, androidx.lifecycle.viewmodel.CreationExtras, androidx.lifecycle.viewmodel.ViewModelInitializer[]):androidx.lifecycle.ViewModel");
    }

    public final CreationExtras b(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.i(viewModelStoreOwner, "owner");
        return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).n() : CreationExtras.Empty.f22064c;
    }

    public final ViewModelProvider.Factory c(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.i(viewModelStoreOwner, "owner");
        return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).m() : DefaultViewModelProviderFactory.f22080b;
    }

    public final String d(KClass kClass) {
        Intrinsics.i(kClass, "modelClass");
        String a2 = ViewModelProviders_jvmKt.a(kClass);
        if (a2 != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final ViewModel e() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
