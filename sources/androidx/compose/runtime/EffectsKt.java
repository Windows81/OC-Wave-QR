package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@Metadata
public final class EffectsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final DisposableEffectScope f14660a = new DisposableEffectScope();

    public static final void a(Object obj, Object obj2, Object obj3, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1239538271, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:228)");
        }
        boolean W = composer.W(obj) | composer.W(obj2) | composer.W(obj3);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new DisposableEffectImpl(function1);
            composer.N(g2);
        }
        DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void b(Object obj, Object obj2, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1429097729, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean W = composer.W(obj) | composer.W(obj2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new DisposableEffectImpl(function1);
            composer.N(g2);
        }
        DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void c(Object obj, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1371986847, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean W = composer.W(obj);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new DisposableEffectImpl(function1);
            composer.N(g2);
        }
        DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void d(Object[] objArr, Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1307627122, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean z2 = false;
        for (Object W : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= composer.W(W);
        }
        Object g2 = composer.g();
        if (z2 || g2 == Composer.f14567a.a()) {
            composer.N(new DisposableEffectImpl(function1));
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-54093371, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext G = composer.G();
        boolean W = composer.W(obj) | composer.W(obj2) | composer.W(obj3);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new LaunchedEffectImpl(G, function2);
            composer.N(g2);
        }
        LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(590241125, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext G = composer.G();
        boolean W = composer.W(obj) | composer.W(obj2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new LaunchedEffectImpl(G, function2);
            composer.N(g2);
        }
        LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void g(Object obj, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1179185413, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        CoroutineContext G = composer.G();
        boolean W = composer.W(obj);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new LaunchedEffectImpl(G, function2);
            composer.N(g2);
        }
        LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final void h(Function0 function0, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1288466761, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        composer.Y(function0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final CoroutineScope j(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.d(Job.f41415x) == null) {
            return new RememberedCoroutineScope(composer.G(), coroutineContext);
        }
        CompletableJob b2 = JobKt__JobKt.b((Job) null, 1, (Object) null);
        b2.j(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.a(b2);
    }
}
