package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;

@Metadata
public final class NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ State f22511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f22512b;

    public NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1(State state, ComposeNavigator composeNavigator) {
        this.f22511a = state;
        this.f22512b = composeNavigator;
    }

    public void d() {
        for (NavBackStackEntry o2 : NavHostKt.l(this.f22511a)) {
            this.f22512b.o(o2);
        }
    }
}
