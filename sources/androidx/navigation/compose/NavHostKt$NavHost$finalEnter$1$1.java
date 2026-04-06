package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$finalEnter$1$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f22574A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f22575B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f22576z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalEnter$1$1(ComposeNavigator composeNavigator, Function1 function1, Function1 function12, MutableState mutableState) {
        super(1);
        this.f22576z = composeNavigator;
        this.f22574A = function1;
        this.f22575B = function12;
        this.C = mutableState;
    }

    /* renamed from: b */
    public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination g2 = ((NavBackStackEntry) animatedContentTransitionScope.d()).g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) g2;
        EnterTransition enterTransition = null;
        if (((Boolean) this.f22576z.n().getValue()).booleanValue() || NavHostKt.i(this.C)) {
            Iterator it = NavDestination.J.c(destination).iterator();
            while (true) {
                if (it.hasNext()) {
                    EnterTransition y2 = NavHostKt.D((NavDestination) it.next(), animatedContentTransitionScope);
                    if (y2 != null) {
                        enterTransition = y2;
                        break;
                    }
                } else {
                    break;
                }
            }
            return enterTransition == null ? (EnterTransition) this.f22574A.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator it2 = NavDestination.J.c(destination).iterator();
        while (true) {
            if (it2.hasNext()) {
                EnterTransition w2 = NavHostKt.B((NavDestination) it2.next(), animatedContentTransitionScope);
                if (w2 != null) {
                    enterTransition = w2;
                    break;
                }
            } else {
                break;
            }
        }
        return enterTransition == null ? (EnterTransition) this.f22575B.invoke(animatedContentTransitionScope) : enterTransition;
    }
}
