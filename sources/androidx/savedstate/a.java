package androidx.savedstate;

import androidx.savedstate.SavedStateRegistryController;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistryOwner f22830z;

    public /* synthetic */ a(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f22830z = savedStateRegistryOwner;
    }

    public final Object invoke() {
        return SavedStateRegistryController.Companion.c(this.f22830z);
    }
}
