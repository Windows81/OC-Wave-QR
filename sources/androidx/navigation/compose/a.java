package androidx.navigation.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;

public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f22582A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22583B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f22584z;

    public /* synthetic */ a(boolean z2, List list, NavBackStackEntry navBackStackEntry) {
        this.f22584z = z2;
        this.f22582A = list;
        this.f22583B = navBackStackEntry;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        DialogHostKt$PopulateVisibleList$1$1$1.e(this.f22584z, this.f22582A, this.f22583B, lifecycleOwner, event);
    }
}
