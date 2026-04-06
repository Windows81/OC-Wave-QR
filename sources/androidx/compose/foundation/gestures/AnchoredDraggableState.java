package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class AnchoredDraggableState<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final Companion f3355p = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public Function1 f3356a;

    /* renamed from: b  reason: collision with root package name */
    public Function1 f3357b;

    /* renamed from: c  reason: collision with root package name */
    public Function0 f3358c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationSpec f3359d;

    /* renamed from: e  reason: collision with root package name */
    public DecayAnimationSpec f3360e;

    /* renamed from: f  reason: collision with root package name */
    public final MutatorMutex f3361f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f3362g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableState f3363h;

    /* renamed from: i  reason: collision with root package name */
    public final State f3364i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableFloatState f3365j;

    /* renamed from: k  reason: collision with root package name */
    public final State f3366k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableFloatState f3367l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f3368m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f3369n;

    /* renamed from: o  reason: collision with root package name */
    public final AnchoredDraggableState$anchoredDragScope$1 f3370o;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AnchoredDraggableState(Object obj) {
        this.f3356a = AnchoredDraggableState$confirmValueChange$1.f3388z;
        this.f3361f = new MutatorMutex();
        this.f3362g = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3363h = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3364i = SnapshotStateKt.e(new AnchoredDraggableState$targetValue$2(this));
        this.f3365j = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.f3366k = SnapshotStateKt.d(SnapshotStateKt.r(), new AnchoredDraggableState$progress$2(this));
        this.f3367l = PrimitiveSnapshotStateKt.a(0.0f);
        this.f3368m = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3369n = SnapshotStateKt__SnapshotStateKt.e(AnchoredDraggableKt.q(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3370o = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static /* synthetic */ void O(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            if (!Float.isNaN(anchoredDraggableState.r())) {
                obj = draggableAnchors.b(anchoredDraggableState.r());
                if (obj == null) {
                    obj = anchoredDraggableState.v();
                }
            } else {
                obj = anchoredDraggableState.v();
            }
        }
        anchoredDraggableState.N(draggableAnchors, obj);
    }

    public static /* synthetic */ Object j(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.h(mutatePriority, function3, continuation);
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.i(obj, mutatePriority, function4, continuation);
    }

    public final float A() {
        if (Float.isNaN(r())) {
            InlineClassHelperKt.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return r();
    }

    public final void B(DraggableAnchors draggableAnchors) {
        this.f3369n.setValue(draggableAnchors);
    }

    public final void C(Object obj) {
        this.f3362g.setValue(obj);
    }

    public final void D(DecayAnimationSpec decayAnimationSpec) {
        this.f3360e = decayAnimationSpec;
    }

    public final void E(Object obj) {
        this.f3368m.setValue(obj);
    }

    public final void F(float f2) {
        this.f3367l.j(f2);
    }

    public final void G(float f2) {
        this.f3365j.j(f2);
    }

    public final void H(Function1 function1) {
        this.f3357b = function1;
    }

    public final void I(Object obj) {
        this.f3363h.setValue(obj);
    }

    public final void J(AnimationSpec animationSpec) {
        this.f3359d = animationSpec;
    }

    public final void K(Function0 function0) {
        this.f3358c = function0;
    }

    public final Object L(float f2, Continuation continuation) {
        if (!w()) {
            InlineClassHelperKt.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object n2 = n();
        Object f3 = AnchoredDraggableKt.p(l(), A(), f2, s(), x());
        return ((Boolean) this.f3356a.invoke(f3)).booleanValue() ? AnchoredDraggableKt.n(this, f3, f2, (AnimationSpec) null, (DecayAnimationSpec) null, continuation, 12, (Object) null) : AnchoredDraggableKt.n(this, n2, f2, (AnimationSpec) null, (DecayAnimationSpec) null, continuation, 12, (Object) null);
    }

    public final boolean M(Object obj) {
        MutatorMutex mutatorMutex = this.f3361f;
        boolean g2 = mutatorMutex.g();
        if (g2) {
            try {
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.f3370o;
                float c2 = l().c(obj);
                if (!Float.isNaN(c2)) {
                    AnchoredDragScope.b(anchoredDraggableState$anchoredDragScope$1, c2, 0.0f, 2, (Object) null);
                    E((Object) null);
                }
                C(obj);
                I(obj);
                mutatorMutex.i();
            } catch (Throwable th) {
                mutatorMutex.i();
                throw th;
            }
        }
        return g2;
    }

    public final void N(DraggableAnchors draggableAnchors, Object obj) {
        if (!Intrinsics.d(l(), draggableAnchors)) {
            B(draggableAnchors);
            if (!M(obj)) {
                E(obj);
            }
        }
    }

    public final Object h(MutatePriority mutatePriority, Function3 function3, Continuation continuation) {
        Object d2 = this.f3361f.d(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, function3, (Continuation) null), continuation);
        return d2 == IntrinsicsKt.f() ? d2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r6, androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function4 r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.C
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r6
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x002e }
            goto L_0x0058
        L_0x002e:
            r7 = move-exception
            goto L_0x005e
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.b(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.l()
            boolean r9 = r9.d(r6)
            if (r9 == 0) goto L_0x0062
            androidx.compose.foundation.MutatorMutex r9 = r5.f3361f     // Catch:{ all -> 0x005c }
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch:{ all -> 0x005c }
            r2.<init>(r5, r6, r8, r4)     // Catch:{ all -> 0x005c }
            r0.C = r5     // Catch:{ all -> 0x005c }
            r0.F = r3     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x005c }
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r5
        L_0x0058:
            r6.E(r4)
            goto L_0x0076
        L_0x005c:
            r7 = move-exception
            r6 = r5
        L_0x005e:
            r6.E(r4)
            throw r7
        L_0x0062:
            kotlin.jvm.functions.Function1 r7 = r5.f3356a
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0076
            r5.I(r6)
            r5.C(r6)
        L_0x0076:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.i(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final DraggableAnchors l() {
        return (DraggableAnchors) this.f3369n.getValue();
    }

    public final Function1 m() {
        return this.f3356a;
    }

    public final Object n() {
        return this.f3362g.getValue();
    }

    public final DecayAnimationSpec o() {
        DecayAnimationSpec decayAnimationSpec = this.f3360e;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        Intrinsics.y("decayAnimationSpec");
        return null;
    }

    public final Object p() {
        return this.f3368m.getValue();
    }

    public final float q() {
        return this.f3367l.c();
    }

    public final float r() {
        return this.f3365j.c();
    }

    public final Function1 s() {
        Function1 function1 = this.f3357b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.y("positionalThreshold");
        return null;
    }

    public final Object t() {
        return this.f3363h.getValue();
    }

    public final AnimationSpec u() {
        AnimationSpec animationSpec = this.f3359d;
        if (animationSpec != null) {
            return animationSpec;
        }
        Intrinsics.y("snapAnimationSpec");
        return null;
    }

    public final Object v() {
        return this.f3364i.getValue();
    }

    public final boolean w() {
        return (this.f3357b == null || this.f3358c == null || this.f3359d == null || this.f3360e == null) ? false : true;
    }

    public final Function0 x() {
        Function0 function0 = this.f3358c;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.y("velocityThreshold");
        return null;
    }

    public final boolean y() {
        return p() != null;
    }

    public final float z(float f2) {
        return RangesKt.n((Float.isNaN(r()) ? 0.0f : r()) + f2, l().e(), l().f());
    }

    public AnchoredDraggableState(Object obj, Function1 function1) {
        this(obj);
        this.f3356a = function1;
    }
}
