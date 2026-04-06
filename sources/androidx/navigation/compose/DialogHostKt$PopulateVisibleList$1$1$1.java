package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DialogHostKt$PopulateVisibleList$1$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f22489A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f22490B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22491z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1$1(NavBackStackEntry navBackStackEntry, boolean z2, List list) {
        super(1);
        this.f22491z = navBackStackEntry;
        this.f22489A = z2;
        this.f22490B = list;
    }

    public static final void e(boolean z2, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z2 && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    /* renamed from: c */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        a aVar = new a(this.f22489A, this.f22490B, this.f22491z);
        this.f22491z.a().a(aVar);
        return new DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1(this.f22491z, aVar);
    }
}
