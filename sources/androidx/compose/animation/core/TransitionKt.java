package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TransitionKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f2744a = TransitionKt$SeekableTransitionStateTotalDurationChanged$1.f2756z;

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f2745b = LazyKt.a(LazyThreadSafetyMode.NONE, TransitionKt$SeekableStateObserver$2.f2754z);

    public static final void a(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(867041821);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(transition) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(transitionAnimationState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? q2.W(obj) : q2.l(obj) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? q2.W(obj2) : q2.l(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? q2.W(finiteAnimationSpec) : q2.l(finiteAnimationSpec) ? 16384 : 8192;
        }
        if (q2.E((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(867041821, i3, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.v()) {
                transitionAnimationState.L(obj, obj2, finiteAnimationSpec);
            } else {
                transitionAnimationState.N(obj2, finiteAnimationSpec);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new TransitionKt$UpdateInitialAndTargetValues$1(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, i2));
        }
    }

    public static final Transition d(Transition transition, Object obj, Object obj2, String str, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-198307638, i2, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && composer.W(transition)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z3 || g2 == Composer.f14567a.a()) {
            g2 = new Transition(new MutableTransitionState(obj), transition, transition.k() + " > " + str);
            composer.N(g2);
        }
        Transition transition2 = (Transition) g2;
        if ((i3 <= 4 || !composer.W(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean W = composer.W(transition2) | z2;
        Object g3 = composer.g();
        if (W || g3 == Composer.f14567a.a()) {
            g3 = new TransitionKt$createChildTransitionInternal$1$1(transition, transition2);
            composer.N(g3);
        }
        EffectsKt.c(transition2, (Function1) g3, composer, 0);
        if (transition.v()) {
            transition2.G(obj, obj2, transition.l());
        } else {
            transition2.R(obj2);
            transition2.K(false);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return transition2;
    }

    public static final Transition.DeferredAnimation e(Transition transition, TwoWayConverter twoWayConverter, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-1714122528, i2, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && composer.W(transition)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z3 || g2 == Composer.f14567a.a()) {
            g2 = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.N(g2);
        }
        Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) g2;
        if ((i4 <= 4 || !composer.W(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean l2 = composer.l(deferredAnimation) | z2;
        Object g3 = composer.g();
        if (l2 || g3 == Composer.f14567a.a()) {
            g3 = new TransitionKt$createDeferredAnimation$1$1(transition, deferredAnimation);
            composer.N(g3);
        }
        EffectsKt.c(deferredAnimation, (Function1) g3, composer, 0);
        if (transition.v()) {
            deferredAnimation.d();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return deferredAnimation;
    }

    public static final State f(Transition transition, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, TwoWayConverter twoWayConverter, String str, Composer composer, int i2) {
        Transition transition2 = transition;
        Composer composer2 = composer;
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-304821198, i3, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z2 = true;
        boolean z3 = (i5 > 4 && composer2.W(transition2)) || (i3 & 6) == 4;
        Object g2 = composer.g();
        if (z3 || g2 == Composer.f14567a.a()) {
            TwoWayConverter twoWayConverter2 = twoWayConverter;
            Transition.TransitionAnimationState transitionAnimationState = new Transition.TransitionAnimationState(obj, AnimationStateKt.i(twoWayConverter2, obj2), twoWayConverter2, str);
            composer2.N(transitionAnimationState);
            g2 = transitionAnimationState;
        } else {
            Object obj3 = obj2;
        }
        Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) g2;
        int i6 = (i3 >> 3) & 8;
        int i7 = i3 << 3;
        a(transition, transitionAnimationState2, obj, obj2, finiteAnimationSpec, composer, (i6 << 9) | (i6 << 6) | i4 | (i7 & 896) | (i7 & 7168) | (57344 & i7));
        if ((i5 <= 4 || !composer2.W(transition2)) && (i3 & 6) != 4) {
            z2 = false;
        }
        boolean W = composer2.W(transitionAnimationState2) | z2;
        Object g3 = composer.g();
        if (W || g3 == Composer.f14567a.a()) {
            g3 = new TransitionKt$createTransitionAnimation$1$1(transition2, transitionAnimationState2);
            composer2.N(g3);
        }
        EffectsKt.c(transitionAnimationState2, (Function1) g3, composer2, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return transitionAnimationState2;
    }

    public static final SnapshotStateObserver g() {
        return (SnapshotStateObserver) f2745b.getValue();
    }

    public static final Transition h(TransitionState transitionState, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1643203617, i2, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && composer.W(transitionState)) || (i2 & 6) == 4;
        Object g2 = composer.g();
        if (z3 || g2 == Composer.f14567a.a()) {
            g2 = new Transition(transitionState, str);
            composer.N(g2);
        }
        Transition transition = (Transition) g2;
        if (transitionState instanceof SeekableTransitionState) {
            composer.X(1030829284);
            Object a2 = transitionState.a();
            Object b2 = transitionState.b();
            if ((i4 <= 4 || !composer.W(transitionState)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object g3 = composer.g();
            if (z2 || g3 == Composer.f14567a.a()) {
                g3 = new TransitionKt$rememberTransition$1$1(transitionState, (Continuation) null);
                composer.N(g3);
            }
            EffectsKt.f(a2, b2, (Function2) g3, composer, 0);
            composer.M();
        } else {
            composer.X(1031290843);
            transition.e(transitionState.b(), composer, 0);
            composer.M();
        }
        boolean W = composer.W(transition);
        Object g4 = composer.g();
        if (W || g4 == Composer.f14567a.a()) {
            g4 = new TransitionKt$rememberTransition$2$1(transition);
            composer.N(g4);
        }
        EffectsKt.c(transition, (Function1) g4, composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return transition;
    }

    public static final Transition i(MutableTransitionState mutableTransitionState, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(882913843, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        Transition h2 = h(mutableTransitionState, str, composer, i2 & 126, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return h2;
    }

    public static final Transition j(Object obj, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(2029166765, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = new Transition(obj, str);
            composer.N(g2);
        }
        Transition transition = (Transition) g2;
        transition.e(obj, composer, (i2 & 8) | 48 | (i2 & 14));
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new TransitionKt$updateTransition$1$1(transition);
            composer.N(g3);
        }
        EffectsKt.c(transition, (Function1) g3, composer, 54);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return transition;
    }
}
