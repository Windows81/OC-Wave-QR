package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15224A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistryWrapper f15225B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f15226z;

    public /* synthetic */ e(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        this.f15226z = saveableStateHolderImpl;
        this.f15224A = obj;
        this.f15225B = saveableStateRegistryWrapper;
    }

    public final Object invoke(Object obj) {
        return SaveableStateHolderImpl.h(this.f15226z, this.f15224A, this.f15225B, (DisposableEffectScope) obj);
    }
}
