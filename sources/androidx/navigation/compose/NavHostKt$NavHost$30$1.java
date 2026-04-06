package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavHostKt$NavHost$30$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f22550A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f22551B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ State E;
    public final /* synthetic */ MutableState F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Map f22552z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$30$1(Map map, ComposeNavigator composeNavigator, Function1 function1, Function1 function12, Function1 function13, State state, MutableState mutableState) {
        super(1);
        this.f22552z = map;
        this.f22550A = composeNavigator;
        this.f22551B = function1;
        this.C = function12;
        this.D = function13;
        this.E = state;
        this.F = mutableState;
    }

    /* renamed from: b */
    public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
        float f2;
        if (!NavHostKt.l(this.E).contains(animatedContentTransitionScope.b())) {
            return AnimatedContentKt.f(EnterTransition.f2274a.a(), ExitTransition.f2277a.a());
        }
        Float f3 = (Float) this.f22552z.get(((NavBackStackEntry) animatedContentTransitionScope.b()).h());
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            this.f22552z.put(((NavBackStackEntry) animatedContentTransitionScope.b()).h(), Float.valueOf(0.0f));
            f2 = 0.0f;
        }
        if (!Intrinsics.d(((NavBackStackEntry) animatedContentTransitionScope.d()).h(), ((NavBackStackEntry) animatedContentTransitionScope.b()).h())) {
            f2 = (((Boolean) this.f22550A.n().getValue()).booleanValue() || NavHostKt.i(this.F)) ? f2 - 1.0f : f2 + 1.0f;
        }
        this.f22552z.put(((NavBackStackEntry) animatedContentTransitionScope.d()).h(), Float.valueOf(f2));
        return new ContentTransform((EnterTransition) this.f22551B.invoke(animatedContentTransitionScope), (ExitTransition) this.C.invoke(animatedContentTransitionScope), f2, (SizeTransform) this.D.invoke(animatedContentTransitionScope));
    }
}
