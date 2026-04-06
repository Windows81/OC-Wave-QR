package androidx.navigation;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class NavHostController extends NavController {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        Intrinsics.i(context, "context");
    }

    public final void t0(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
        super.t0(lifecycleOwner);
    }

    public final void u0(ViewModelStore viewModelStore) {
        Intrinsics.i(viewModelStore, "viewModelStore");
        super.u0(viewModelStore);
    }
}
