package androidx.lifecycle;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class i implements Function0 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewModelStoreOwner f22046z;

    public /* synthetic */ i(ViewModelStoreOwner viewModelStoreOwner) {
        this.f22046z = viewModelStoreOwner;
    }

    public final Object invoke() {
        return SavedStateHandlesProvider.f(this.f22046z);
    }
}
