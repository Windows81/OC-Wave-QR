package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$7 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavHostKt$NavHost$7 f22566z = new NavHostKt$NavHost$7();

    public NavHostKt$NavHost$7() {
        super(1);
    }

    /* renamed from: b */
    public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        return EnterExitTransitionKt.o(AnimationSpecKt.n(700, 0, (Easing) null, 6, (Object) null), 0.0f, 2, (Object) null);
    }
}
