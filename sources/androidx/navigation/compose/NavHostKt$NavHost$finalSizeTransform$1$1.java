package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.SizeTransform;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$finalSizeTransform$1$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f22580z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalSizeTransform$1$1(Function1 function1) {
        super(1);
        this.f22580z = function1;
    }

    /* renamed from: b */
    public final SizeTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        SizeTransform sizeTransform;
        NavDestination g2 = ((NavBackStackEntry) animatedContentTransitionScope.d()).g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        Iterator it = NavDestination.J.c((ComposeNavigator.Destination) g2).iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeTransform = null;
                break;
            }
            sizeTransform = NavHostKt.F((NavDestination) it.next(), animatedContentTransitionScope);
            if (sizeTransform != null) {
                break;
            }
        }
        if (sizeTransform != null) {
            return sizeTransform;
        }
        Function1 function1 = this.f22580z;
        if (function1 != null) {
            return (SizeTransform) function1.invoke(animatedContentTransitionScope);
        }
        return null;
    }
}
