package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f15230z;

    public /* synthetic */ i(SaveableStateHolderImpl saveableStateHolderImpl) {
        this.f15230z = saveableStateHolderImpl;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(SaveableStateHolderImpl.p(this.f15230z, obj));
    }
}
