package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class Transition<S> {

    /* renamed from: a  reason: collision with root package name */
    public final TransitionState f2711a;

    /* renamed from: b  reason: collision with root package name */
    public final Transition f2712b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2713c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f2714d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f2715e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableLongState f2716f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableLongState f2717g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableState f2718h;

    /* renamed from: i  reason: collision with root package name */
    public final SnapshotStateList f2719i;

    /* renamed from: j  reason: collision with root package name */
    public final SnapshotStateList f2720j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableState f2721k;

    /* renamed from: l  reason: collision with root package name */
    public long f2722l;

    /* renamed from: m  reason: collision with root package name */
    public final State f2723m;

    @Metadata
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* renamed from: a  reason: collision with root package name */
        public final TwoWayConverter f2724a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2725b;

        /* renamed from: c  reason: collision with root package name */
        public final MutableState f2726c = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

        @Metadata
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            /* renamed from: A  reason: collision with root package name */
            public Function1 f2728A;

            /* renamed from: B  reason: collision with root package name */
            public Function1 f2729B;

            /* renamed from: z  reason: collision with root package name */
            public final TransitionAnimationState f2730z;

            public DeferredAnimationData(TransitionAnimationState transitionAnimationState, Function1 function1, Function1 function12) {
                this.f2730z = transitionAnimationState;
                this.f2728A = function1;
                this.f2729B = function12;
            }

            public final TransitionAnimationState g() {
                return this.f2730z;
            }

            public Object getValue() {
                u(Transition.this.o());
                return this.f2730z.getValue();
            }

            public final Function1 h() {
                return this.f2729B;
            }

            public final Function1 i() {
                return this.f2728A;
            }

            public final void m(Function1 function1) {
                this.f2729B = function1;
            }

            public final void t(Function1 function1) {
                this.f2728A = function1;
            }

            public final void u(Segment segment) {
                Object invoke = this.f2729B.invoke(segment.d());
                if (Transition.this.v()) {
                    this.f2730z.L(this.f2729B.invoke(segment.b()), invoke, (FiniteAnimationSpec) this.f2728A.invoke(segment));
                    return;
                }
                this.f2730z.N(invoke, (FiniteAnimationSpec) this.f2728A.invoke(segment));
            }
        }

        public DeferredAnimation(TwoWayConverter twoWayConverter, String str) {
            this.f2724a = twoWayConverter;
            this.f2725b = str;
        }

        public final State a(Function1 function1, Function1 function12) {
            DeferredAnimationData b2 = b();
            if (b2 == null) {
                Transition transition = Transition.this;
                b2 = new DeferredAnimationData(new TransitionAnimationState(function12.invoke(transition.i()), AnimationStateKt.i(this.f2724a, function12.invoke(Transition.this.i())), this.f2724a, this.f2725b), function1, function12);
                Transition transition2 = Transition.this;
                c(b2);
                transition2.c(b2.g());
            }
            Transition transition3 = Transition.this;
            b2.m(function12);
            b2.t(function1);
            b2.u(transition3.o());
            return b2;
        }

        public final DeferredAnimationData b() {
            return (DeferredAnimationData) this.f2726c.getValue();
        }

        public final void c(DeferredAnimationData deferredAnimationData) {
            this.f2726c.setValue(deferredAnimationData);
        }

        public final void d() {
            DeferredAnimationData b2 = b();
            if (b2 != null) {
                Transition transition = Transition.this;
                b2.g().L(b2.h().invoke(transition.o().b()), b2.h().invoke(transition.o().d()), (FiniteAnimationSpec) b2.i().invoke(transition.o()));
            }
        }
    }

    @Metadata
    public interface Segment<S> {

        @Metadata
        public static final class DefaultImpls {
        }

        Object b();

        boolean c(Object obj, Object obj2) {
            return Intrinsics.d(obj, b()) && Intrinsics.d(obj2, d());
        }

        Object d();
    }

    @Metadata
    public static final class SegmentImpl<S> implements Segment<S> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2731a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f2732b;

        public SegmentImpl(Object obj, Object obj2) {
            this.f2731a = obj;
            this.f2732b = obj2;
        }

        public Object b() {
            return this.f2731a;
        }

        public Object d() {
            return this.f2732b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                return Intrinsics.d(b(), segment.b()) && Intrinsics.d(d(), segment.d());
            }
        }

        public int hashCode() {
            Object b2 = b();
            int i2 = 0;
            int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
            Object d2 = d();
            if (d2 != null) {
                i2 = d2.hashCode();
            }
            return hashCode + i2;
        }
    }

    @Metadata
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: A  reason: collision with root package name */
        public final String f2733A;

        /* renamed from: B  reason: collision with root package name */
        public final MutableState f2734B;
        public final SpringSpec C;
        public final MutableState D;
        public final MutableState E;
        public SeekableTransitionState.SeekingAnimationState F;
        public TargetBasedAnimation G;
        public final MutableState H = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        public final MutableFloatState I = PrimitiveSnapshotStateKt.a(-1.0f);
        public boolean J;
        public final MutableState K;
        public AnimationVector L;
        public final MutableLongState M;
        public boolean N;
        public final FiniteAnimationSpec O;

        /* renamed from: z  reason: collision with root package name */
        public final TwoWayConverter f2735z;

        public TransitionAnimationState(Object obj, AnimationVector animationVector, TwoWayConverter twoWayConverter, String str) {
            Object obj2;
            this.f2735z = twoWayConverter;
            this.f2733A = str;
            this.f2734B = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
            this.C = l2;
            this.D = SnapshotStateKt__SnapshotStateKt.e(l2, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.E = SnapshotStateKt__SnapshotStateKt.e(new TargetBasedAnimation((AnimationSpec) i(), twoWayConverter, obj, v(), animationVector), (SnapshotMutationPolicy) null, 2, (Object) null);
            this.K = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
            this.L = animationVector;
            this.M = SnapshotLongStateKt.a(h().b());
            Float f2 = (Float) VisibilityThresholdsKt.h().get(twoWayConverter);
            if (f2 != null) {
                float floatValue = f2.floatValue();
                AnimationVector animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
                int b2 = animationVector2.b();
                for (int i2 = 0; i2 < b2; i2++) {
                    animationVector2.e(i2, floatValue);
                }
                obj2 = this.f2735z.b().invoke(animationVector2);
            } else {
                obj2 = null;
            }
            this.O = AnimationSpecKt.l(0.0f, 0.0f, obj2, 3, (Object) null);
        }

        private final void C(FiniteAnimationSpec finiteAnimationSpec) {
            this.D.setValue(finiteAnimationSpec);
        }

        public static /* synthetic */ void K(TransitionAnimationState transitionAnimationState, Object obj, boolean z2, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            transitionAnimationState.J(obj, z2);
        }

        public final void A(long j2) {
            if (u() == -1.0f) {
                this.N = true;
                if (Intrinsics.d(h().g(), h().i())) {
                    I(h().g());
                    return;
                }
                I(h().f(j2));
                this.L = h().d(j2);
            }
        }

        public final void B(TargetBasedAnimation targetBasedAnimation) {
            this.E.setValue(targetBasedAnimation);
        }

        public final void D(long j2) {
            this.M.l(j2);
        }

        public final void E(boolean z2) {
            this.H.setValue(Boolean.valueOf(z2));
        }

        public final void F(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!Intrinsics.d(h().g(), h().i())) {
                this.G = h();
                this.F = seekingAnimationState;
            }
            B(new TargetBasedAnimation((AnimationSpec) this.O, this.f2735z, getValue(), getValue(), AnimationVectorsKt.g(this.L)));
            D(h().b());
            this.J = true;
        }

        public final void G(float f2) {
            this.I.j(f2);
        }

        public final void H(Object obj) {
            this.f2734B.setValue(obj);
        }

        public void I(Object obj) {
            this.K.setValue(obj);
        }

        public final void J(Object obj, boolean z2) {
            TargetBasedAnimation targetBasedAnimation = this.G;
            if (Intrinsics.d(targetBasedAnimation != null ? targetBasedAnimation.g() : null, v())) {
                B(new TargetBasedAnimation((AnimationSpec) this.O, this.f2735z, obj, obj, AnimationVectorsKt.g(this.L)));
                this.J = true;
                D(h().b());
                return;
            }
            AnimationSpec i2 = (!z2 || this.N) ? i() : i() instanceof SpringSpec ? i() : this.O;
            if (Transition.this.n() > 0) {
                i2 = AnimationSpecKt.c(i2, Transition.this.n());
            }
            B(new TargetBasedAnimation(i2, this.f2735z, obj, v(), this.L));
            D(h().b());
            this.J = false;
            Transition.this.w();
        }

        public final void L(Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec) {
            H(obj2);
            C(finiteAnimationSpec);
            if (!Intrinsics.d(h().i(), obj) || !Intrinsics.d(h().g(), obj2)) {
                K(this, obj, false, 2, (Object) null);
            }
        }

        public final void M() {
            TargetBasedAnimation targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.F;
            if (seekingAnimationState != null && (targetBasedAnimation = this.G) != null) {
                long e2 = MathKt.e(((double) seekingAnimationState.c()) * ((double) seekingAnimationState.g()));
                Object f2 = targetBasedAnimation.f(e2);
                if (this.J) {
                    h().k(f2);
                }
                h().j(f2);
                D(h().b());
                if (u() != -2.0f && !this.J) {
                    A(Transition.this.n());
                } else {
                    I(f2);
                }
                if (e2 >= seekingAnimationState.c()) {
                    this.F = null;
                    this.G = null;
                    return;
                }
                seekingAnimationState.k(false);
            }
        }

        public final void N(Object obj, FiniteAnimationSpec finiteAnimationSpec) {
            if (this.J) {
                TargetBasedAnimation targetBasedAnimation = this.G;
                if (Intrinsics.d(obj, targetBasedAnimation != null ? targetBasedAnimation.g() : null)) {
                    return;
                }
            }
            if (!Intrinsics.d(v(), obj) || u() != -1.0f) {
                H(obj);
                C(finiteAnimationSpec);
                boolean z2 = true;
                J(u() == -3.0f ? obj : getValue(), !w());
                if (u() != -3.0f) {
                    z2 = false;
                }
                E(z2);
                if (u() >= 0.0f) {
                    I(h().f((long) (((float) h().b()) * u())));
                } else if (u() == -3.0f) {
                    I(obj);
                }
                this.J = false;
                G(-1.0f);
            }
        }

        public final void g() {
            this.G = null;
            this.F = null;
            this.J = false;
        }

        public Object getValue() {
            return this.K.getValue();
        }

        public final TargetBasedAnimation h() {
            return (TargetBasedAnimation) this.E.getValue();
        }

        public final FiniteAnimationSpec i() {
            return (FiniteAnimationSpec) this.D.getValue();
        }

        public final long m() {
            return this.M.a();
        }

        public final SeekableTransitionState.SeekingAnimationState t() {
            return this.F;
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + v() + ", spec: " + i();
        }

        public final float u() {
            return this.I.c();
        }

        public final Object v() {
            return this.f2734B.getValue();
        }

        public final boolean w() {
            return ((Boolean) this.H.getValue()).booleanValue();
        }

        public final void x(long j2, boolean z2) {
            if (z2) {
                j2 = h().b();
            }
            I(h().f(j2));
            this.L = h().d(j2);
            if (h().e(j2)) {
                E(true);
            }
        }

        public final void y() {
            G(-2.0f);
        }

        public final void z(float f2) {
            int i2 = (f2 > -4.0f ? 1 : (f2 == -4.0f ? 0 : -1));
            if (i2 == 0 || f2 == -5.0f) {
                TargetBasedAnimation targetBasedAnimation = this.G;
                if (targetBasedAnimation != null) {
                    h().j(targetBasedAnimation.g());
                    this.F = null;
                    this.G = null;
                }
                Object i3 = i2 == 0 ? h().i() : h().g();
                h().j(i3);
                h().k(i3);
                I(i3);
                D(h().b());
                return;
            }
            G(f2);
        }
    }

    public Transition(TransitionState transitionState, Transition transition, String str) {
        this.f2711a = transitionState;
        this.f2712b = transition;
        this.f2713c = str;
        this.f2714d = SnapshotStateKt__SnapshotStateKt.e(i(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2715e = SnapshotStateKt__SnapshotStateKt.e(new SegmentImpl(i(), i()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2716f = SnapshotLongStateKt.a(0);
        this.f2717g = SnapshotLongStateKt.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f2718h = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2719i = SnapshotStateKt.f();
        this.f2720j = SnapshotStateKt.f();
        this.f2721k = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2723m = SnapshotStateKt.e(new Transition$totalDurationNanos$2(this));
        transitionState.f(this);
    }

    public final void A() {
        M(Long.MIN_VALUE);
        TransitionState transitionState = this.f2711a;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.d(q());
        }
        J(0);
        this.f2711a.e(false);
        SnapshotStateList snapshotStateList = this.f2720j;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Transition) snapshotStateList.get(i2)).A();
        }
    }

    public final void B(long j2) {
        M(j2);
        this.f2711a.e(true);
    }

    public final void C(DeferredAnimation deferredAnimation) {
        TransitionAnimationState g2;
        DeferredAnimation.DeferredAnimationData b2 = deferredAnimation.b();
        if (b2 != null && (g2 = b2.g()) != null) {
            D(g2);
        }
    }

    public final void D(TransitionAnimationState transitionAnimationState) {
        this.f2719i.remove((Object) transitionAnimationState);
    }

    public final boolean E(Transition transition) {
        return this.f2720j.remove((Object) transition);
    }

    public final void F(float f2) {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).z(f2);
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).F(f2);
        }
    }

    public final void G(Object obj, Object obj2, long j2) {
        M(Long.MIN_VALUE);
        this.f2711a.e(false);
        if (!v() || !Intrinsics.d(i(), obj) || !Intrinsics.d(q(), obj2)) {
            if (!Intrinsics.d(i(), obj)) {
                TransitionState transitionState = this.f2711a;
                if (transitionState instanceof MutableTransitionState) {
                    transitionState.d(obj);
                }
            }
            N(obj2);
            K(true);
            L(new SegmentImpl(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f2720j;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) snapshotStateList.get(i2);
            Intrinsics.g(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.v()) {
                transition.G(transition.i(), transition.q(), j2);
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2719i;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((TransitionAnimationState) snapshotStateList2.get(i3)).A(j2);
        }
        this.f2722l = j2;
    }

    public final void H(long j2) {
        if (p() == Long.MIN_VALUE) {
            M(j2);
        }
        J(j2);
        O(false);
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).A(j2);
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            if (!Intrinsics.d(transition.q(), transition.i())) {
                transition.H(j2);
            }
        }
    }

    public final void I(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).F(seekingAnimationState);
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).I(seekingAnimationState);
        }
    }

    public final void J(long j2) {
        if (this.f2712b == null) {
            P(j2);
        }
    }

    public final void K(boolean z2) {
        this.f2721k.setValue(Boolean.valueOf(z2));
    }

    public final void L(Segment segment) {
        this.f2715e.setValue(segment);
    }

    public final void M(long j2) {
        this.f2717g.l(j2);
    }

    public final void N(Object obj) {
        this.f2714d.setValue(obj);
    }

    public final void O(boolean z2) {
        this.f2718h.setValue(Boolean.valueOf(z2));
    }

    public final void P(long j2) {
        this.f2716f.l(j2);
    }

    public final void Q() {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).M();
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).Q();
        }
    }

    public final void R(Object obj) {
        if (!Intrinsics.d(q(), obj)) {
            L(new SegmentImpl(q(), obj));
            if (!Intrinsics.d(i(), q())) {
                this.f2711a.d(q());
            }
            N(obj);
            if (!u()) {
                O(true);
            }
            SnapshotStateList snapshotStateList = this.f2719i;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TransitionAnimationState) snapshotStateList.get(i2)).y();
            }
        }
    }

    public final boolean c(TransitionAnimationState transitionAnimationState) {
        return this.f2719i.add(transitionAnimationState);
    }

    public final boolean d(Transition transition) {
        return this.f2720j.add(transition);
    }

    public final void e(Object obj, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1493585151);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? q2.W(obj) : q2.l(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(this) ? 32 : 16;
        }
        boolean z2 = false;
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1493585151, i3, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1176)");
            }
            if (!v()) {
                q2.X(1822801203);
                R(obj);
                if (!Intrinsics.d(obj, i()) || u() || s()) {
                    q2.X(1823032494);
                    Object g2 = q2.g();
                    Composer.Companion companion = Composer.f14567a;
                    if (g2 == companion.a()) {
                        g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                        q2.N(g2);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) g2;
                    boolean l2 = q2.l(coroutineScope);
                    int i4 = i3 & 112;
                    if (i4 == 32) {
                        z2 = true;
                    }
                    boolean z3 = l2 | z2;
                    Object g3 = q2.g();
                    if (z3 || g3 == companion.a()) {
                        g3 = new Transition$animateTo$1$1(coroutineScope, this);
                        q2.N(g3);
                    }
                    EffectsKt.b(coroutineScope, this, (Function1) g3, q2, i4);
                    q2.M();
                } else {
                    q2.X(1824275067);
                    q2.M();
                }
                q2.M();
            } else {
                q2.X(1824284987);
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
            x2.a(new Transition$animateTo$2(this, obj, i2));
        }
    }

    public final long f() {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, ((TransitionAnimationState) snapshotStateList.get(i2)).m());
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j2 = Math.max(j2, ((Transition) snapshotStateList2.get(i3)).f());
        }
        return j2;
    }

    public final void g() {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((TransitionAnimationState) snapshotStateList.get(i2)).g();
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Transition) snapshotStateList2.get(i3)).g();
        }
    }

    public final List h() {
        return this.f2719i;
    }

    public final Object i() {
        return this.f2711a.a();
    }

    public final boolean j() {
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                SnapshotStateList snapshotStateList2 = this.f2720j;
                int size2 = snapshotStateList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    if (!((Transition) snapshotStateList2.get(i3)).j()) {
                        i3++;
                    }
                }
                return false;
            } else if (((TransitionAnimationState) snapshotStateList.get(i2)).t() != null) {
                break;
            } else {
                i2++;
            }
        }
        return true;
    }

    public final String k() {
        return this.f2713c;
    }

    public final long l() {
        return this.f2722l;
    }

    public final Transition m() {
        return this.f2712b;
    }

    public final long n() {
        Transition transition = this.f2712b;
        return transition != null ? transition.n() : t();
    }

    public final Segment o() {
        return (Segment) this.f2715e.getValue();
    }

    public final long p() {
        return this.f2717g.a();
    }

    public final Object q() {
        return this.f2714d.getValue();
    }

    public final long r() {
        return ((Number) this.f2723m.getValue()).longValue();
    }

    public final boolean s() {
        return ((Boolean) this.f2718h.getValue()).booleanValue();
    }

    public final long t() {
        return this.f2716f.a();
    }

    public String toString() {
        List h2 = h();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < h2.size(); i2++) {
            str = str + ((TransitionAnimationState) h2.get(i2)) + ", ";
        }
        return str;
    }

    public final boolean u() {
        return p() != Long.MIN_VALUE;
    }

    public final boolean v() {
        return ((Boolean) this.f2721k.getValue()).booleanValue();
    }

    public final void w() {
        O(true);
        if (v()) {
            SnapshotStateList snapshotStateList = this.f2719i;
            int size = snapshotStateList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
                j2 = Math.max(j2, transitionAnimationState.m());
                transitionAnimationState.A(this.f2722l);
            }
            O(false);
        }
    }

    public final void x() {
        A();
        this.f2711a.g();
    }

    public final void y(long j2, float f2) {
        if (p() == Long.MIN_VALUE) {
            B(j2);
        }
        long p2 = j2 - p();
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            p2 = MathKt.e(((double) p2) / ((double) f2));
        }
        J(p2);
        z(p2, i2 == 0);
    }

    public final void z(long j2, boolean z2) {
        boolean z3 = true;
        if (p() == Long.MIN_VALUE) {
            B(j2);
        } else if (!this.f2711a.c()) {
            this.f2711a.e(true);
        }
        O(false);
        SnapshotStateList snapshotStateList = this.f2719i;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i2);
            if (!transitionAnimationState.w()) {
                transitionAnimationState.x(j2, z2);
            }
            if (!transitionAnimationState.w()) {
                z3 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f2720j;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition transition = (Transition) snapshotStateList2.get(i3);
            if (!Intrinsics.d(transition.q(), transition.i())) {
                transition.z(j2, z2);
            }
            if (!Intrinsics.d(transition.q(), transition.i())) {
                z3 = false;
            }
        }
        if (z3) {
            A();
        }
    }

    public Transition(TransitionState transitionState, String str) {
        this(transitionState, (Transition) null, str);
    }

    public Transition(Object obj, String str) {
        this(new MutableTransitionState(obj), (Transition) null, str);
    }
}
