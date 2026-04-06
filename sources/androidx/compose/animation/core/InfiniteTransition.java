package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class InfiniteTransition {

    /* renamed from: f  reason: collision with root package name */
    public static final int f2584f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f2585a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableVector f2586b = new MutableVector(new TransitionAnimationState[16], 0);

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f2587c = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public long f2588d = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f2589e = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);

    @Metadata
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: A  reason: collision with root package name */
        public Object f2590A;

        /* renamed from: B  reason: collision with root package name */
        public final TwoWayConverter f2591B;
        public final String C;
        public final MutableState D;
        public AnimationSpec E;
        public TargetBasedAnimation F;
        public boolean G;
        public boolean H;
        public long I;

        /* renamed from: z  reason: collision with root package name */
        public Object f2592z;

        public TransitionAnimationState(Object obj, Object obj2, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, String str) {
            this.f2592z = obj;
            this.f2590A = obj2;
            this.f2591B = twoWayConverter;
            this.C = str;
            this.D = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.E = animationSpec;
            this.F = new TargetBasedAnimation(this.E, twoWayConverter, this.f2592z, this.f2590A, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        public final Object g() {
            return this.f2592z;
        }

        public Object getValue() {
            return this.D.getValue();
        }

        public final Object h() {
            return this.f2590A;
        }

        public final boolean i() {
            return this.G;
        }

        public final void m(long j2) {
            InfiniteTransition.this.l(false);
            if (this.H) {
                this.H = false;
                this.I = j2;
            }
            long j3 = j2 - this.I;
            u(this.F.f(j3));
            this.G = this.F.e(j3);
        }

        public final void t() {
            this.H = true;
        }

        public void u(Object obj) {
            this.D.setValue(obj);
        }

        public final void v() {
            u(this.F.g());
            this.H = true;
        }

        public final void w(Object obj, Object obj2, AnimationSpec animationSpec) {
            this.f2592z = obj;
            this.f2590A = obj2;
            this.E = animationSpec;
            this.F = new TargetBasedAnimation(animationSpec, this.f2591B, obj, obj2, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            InfiniteTransition.this.l(true);
            this.G = false;
            this.H = true;
        }
    }

    public InfiniteTransition(String str) {
        this.f2585a = str;
    }

    public final void f(TransitionAnimationState transitionAnimationState) {
        this.f2586b.d(transitionAnimationState);
        l(true);
    }

    public final boolean g() {
        return ((Boolean) this.f2587c.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.f2589e.getValue()).booleanValue();
    }

    public final void i(long j2) {
        MutableVector mutableVector = this.f2586b;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        boolean z2 = true;
        for (int i2 = 0; i2 < p2; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) objArr[i2];
            if (!transitionAnimationState.i()) {
                transitionAnimationState.m(j2);
            }
            if (!transitionAnimationState.i()) {
                z2 = false;
            }
        }
        m(!z2);
    }

    public final void j(TransitionAnimationState transitionAnimationState) {
        this.f2586b.v(transitionAnimationState);
    }

    public final void k(Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-318043801);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-318043801, i3, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            if (h() || g()) {
                q2.X(1719883733);
                boolean l2 = q2.l(this);
                Object g3 = q2.g();
                if (l2 || g3 == companion.a()) {
                    g3 = new InfiniteTransition$run$1$1(mutableState, this, (Continuation) null);
                    q2.N(g3);
                }
                EffectsKt.g(this, (Function2) g3, q2, i3 & 14);
                q2.M();
            } else {
                q2.X(1721270456);
                q2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new InfiniteTransition$run$2(this, i2));
        }
    }

    public final void l(boolean z2) {
        this.f2587c.setValue(Boolean.valueOf(z2));
    }

    public final void m(boolean z2) {
        this.f2589e.setValue(Boolean.valueOf(z2));
    }
}
