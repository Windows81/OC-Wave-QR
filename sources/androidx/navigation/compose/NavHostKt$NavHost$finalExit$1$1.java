package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ExitTransition;
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
public final class NavHostKt$NavHost$finalExit$1$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f22577A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f22578B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f22579z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalExit$1$1(ComposeNavigator composeNavigator, Function1 function1, Function1 function12, MutableState mutableState) {
        super(1);
        this.f22579z = composeNavigator;
        this.f22577A = function1;
        this.f22578B = function12;
        this.C = mutableState;
    }

    /* renamed from: b */
    public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        NavDestination g2 = ((NavBackStackEntry) animatedContentTransitionScope.b()).g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) g2;
        ExitTransition exitTransition = null;
        if (((Boolean) this.f22579z.n().getValue()).booleanValue() || NavHostKt.i(this.C)) {
            Iterator it = NavDestination.J.c(destination).iterator();
            while (true) {
                if (it.hasNext()) {
                    ExitTransition z2 = NavHostKt.E((NavDestination) it.next(), animatedContentTransitionScope);
                    if (z2 != null) {
                        exitTransition = z2;
                        break;
                    }
                } else {
                    break;
                }
            }
            return exitTransition == null ? (ExitTransition) this.f22577A.invoke(animatedContentTransitionScope) : exitTransition;
        }
        Iterator it2 = NavDestination.J.c(destination).iterator();
        while (true) {
            if (it2.hasNext()) {
                ExitTransition x2 = NavHostKt.C((NavDestination) it2.next(), animatedContentTransitionScope);
                if (x2 != null) {
                    exitTransition = x2;
                    break;
                }
            } else {
                break;
            }
        }
        return exitTransition == null ? (ExitTransition) this.f22578B.invoke(animatedContentTransitionScope) : exitTransition;
    }
}
