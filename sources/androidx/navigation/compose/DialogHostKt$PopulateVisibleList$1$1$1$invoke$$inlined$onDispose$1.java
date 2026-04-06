package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;

@Metadata
public final class DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22475a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleEventObserver f22476b;

    public DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1(NavBackStackEntry navBackStackEntry, LifecycleEventObserver lifecycleEventObserver) {
        this.f22475a = navBackStackEntry;
        this.f22476b = lifecycleEventObserver;
    }

    public void d() {
        this.f22475a.a().d(this.f22476b);
    }
}
