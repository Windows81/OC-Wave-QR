package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class Animatable<T, V extends AnimationVector> {

    /* renamed from: m  reason: collision with root package name */
    public static final int f2421m = 8;

    /* renamed from: a  reason: collision with root package name */
    public final TwoWayConverter f2422a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2424c;

    /* renamed from: d  reason: collision with root package name */
    public final AnimationState f2425d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f2426e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f2427f;

    /* renamed from: g  reason: collision with root package name */
    public final MutatorMutex f2428g;

    /* renamed from: h  reason: collision with root package name */
    public final SpringSpec f2429h;

    /* renamed from: i  reason: collision with root package name */
    public final AnimationVector f2430i;

    /* renamed from: j  reason: collision with root package name */
    public final AnimationVector f2431j;

    /* renamed from: k  reason: collision with root package name */
    public AnimationVector f2432k;

    /* renamed from: l  reason: collision with root package name */
    public AnimationVector f2433l;

    public Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str) {
        AnimationVector animationVector;
        AnimationVector animationVector2;
        this.f2422a = twoWayConverter;
        this.f2423b = obj2;
        this.f2424c = str;
        this.f2425d = new AnimationState(twoWayConverter, obj, (AnimationVector) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
        this.f2426e = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2427f = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f2428g = new MutatorMutex();
        this.f2429h = new SpringSpec(0.0f, 0.0f, obj2, 3, (DefaultConstructorMarker) null);
        AnimationVector o2 = o();
        if (o2 instanceof AnimationVector1D) {
            animationVector = AnimatableKt.f2441e;
        } else if (o2 instanceof AnimationVector2D) {
            animationVector = AnimatableKt.f2442f;
        } else if (o2 instanceof AnimationVector3D) {
            animationVector = AnimatableKt.f2443g;
        } else {
            animationVector = AnimatableKt.f2444h;
        }
        Intrinsics.g(animationVector, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f2430i = animationVector;
        AnimationVector o3 = o();
        if (o3 instanceof AnimationVector1D) {
            animationVector2 = AnimatableKt.f2437a;
        } else if (o3 instanceof AnimationVector2D) {
            animationVector2 = AnimatableKt.f2438b;
        } else if (o3 instanceof AnimationVector3D) {
            animationVector2 = AnimatableKt.f2439c;
        } else {
            animationVector2 = AnimatableKt.f2440d;
        }
        Intrinsics.g(animationVector2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f2431j = animationVector2;
        this.f2432k = animationVector;
        this.f2433l = animationVector2;
    }

    public static /* synthetic */ Object f(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i2, Object obj3) {
        if ((i2 & 2) != 0) {
            animationSpec = animatable.f2429h;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            obj2 = animatable.n();
        }
        Object obj4 = obj2;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return animatable.e(obj, animationSpec2, obj4, function1, continuation);
    }

    public final Object e(Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation) {
        return q(AnimationKt.b(animationSpec, this.f2422a, m(), obj, obj2), obj2, function1, continuation);
    }

    public final State g() {
        return this.f2425d;
    }

    public final Object h(Object obj) {
        if (Intrinsics.d(this.f2432k, this.f2430i) && Intrinsics.d(this.f2433l, this.f2431j)) {
            return obj;
        }
        AnimationVector animationVector = (AnimationVector) this.f2422a.a().invoke(obj);
        int b2 = animationVector.b();
        boolean z2 = false;
        for (int i2 = 0; i2 < b2; i2++) {
            if (animationVector.a(i2) < this.f2432k.a(i2) || animationVector.a(i2) > this.f2433l.a(i2)) {
                animationVector.e(i2, RangesKt.n(animationVector.a(i2), this.f2432k.a(i2), this.f2433l.a(i2)));
                z2 = true;
            }
        }
        return z2 ? this.f2422a.b().invoke(animationVector) : obj;
    }

    public final void i() {
        AnimationState animationState = this.f2425d;
        animationState.t().d();
        animationState.w(Long.MIN_VALUE);
        r(false);
    }

    public final AnimationState j() {
        return this.f2425d;
    }

    public final Object k() {
        return this.f2427f.getValue();
    }

    public final TwoWayConverter l() {
        return this.f2422a;
    }

    public final Object m() {
        return this.f2425d.getValue();
    }

    public final Object n() {
        return this.f2422a.b().invoke(o());
    }

    public final AnimationVector o() {
        return this.f2425d.t();
    }

    public final boolean p() {
        return ((Boolean) this.f2426e.getValue()).booleanValue();
    }

    public final Object q(Animation animation, Object obj, Function1 function1, Continuation continuation) {
        return MutatorMutex.e(this.f2428g, (MutatePriority) null, new Animatable$runAnimation$2(this, obj, animation, this.f2425d.h(), function1, (Continuation) null), continuation, 1, (Object) null);
    }

    public final void r(boolean z2) {
        this.f2426e.setValue(Boolean.valueOf(z2));
    }

    public final void s(Object obj) {
        this.f2427f.setValue(obj);
    }

    public final Object t(Object obj, Continuation continuation) {
        Object e2 = MutatorMutex.e(this.f2428g, (MutatePriority) null, new Animatable$snapTo$2(this, obj, (Continuation) null), continuation, 1, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final Object u(Continuation continuation) {
        Object e2 = MutatorMutex.e(this.f2428g, (MutatePriority) null, new Animatable$stop$2(this, (Continuation) null), continuation, 1, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2, (i2 & 8) != 0 ? "Animatable" : str);
    }
}
