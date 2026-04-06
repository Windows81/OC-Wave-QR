package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class AnchoredDraggableState<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final Companion f7085p = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f7086a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f7087b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimationSpec f7088c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f7089d;

    /* renamed from: e  reason: collision with root package name */
    public final InternalMutatorMutex f7090e;

    /* renamed from: f  reason: collision with root package name */
    public final DraggableState f7091f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f7092g;

    /* renamed from: h  reason: collision with root package name */
    public final State f7093h;

    /* renamed from: i  reason: collision with root package name */
    public final State f7094i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableFloatState f7095j;

    /* renamed from: k  reason: collision with root package name */
    public final State f7096k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableFloatState f7097l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f7098m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f7099n;

    /* renamed from: o  reason: collision with root package name */
    public final AnchoredDragScope f7100o;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this.f7086a = function1;
        this.f7087b = function0;
        this.f7088c = animationSpec;
        this.f7089d = function12;
        this.f7090e = new InternalMutatorMutex();
        this.f7091f = new AnchoredDraggableState$draggableState$1(this);
        this.f7092g = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f7093h = SnapshotStateKt.e(new AnchoredDraggableState$targetValue$2(this));
        this.f7094i = SnapshotStateKt.e(new AnchoredDraggableState$closestValue$2(this));
        this.f7095j = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.f7096k = SnapshotStateKt.d(SnapshotStateKt.r(), new AnchoredDraggableState$progress$2(this));
        this.f7097l = PrimitiveSnapshotStateKt.a(0.0f);
        this.f7098m = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f7099n = SnapshotStateKt__SnapshotStateKt.e(AnchoredDraggableKt.i(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f7100o = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static /* synthetic */ void J(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            if (!Float.isNaN(anchoredDraggableState.w())) {
                obj = draggableAnchors.b(anchoredDraggableState.w());
                if (obj == null) {
                    obj = anchoredDraggableState.x();
                }
            } else {
                obj = anchoredDraggableState.x();
            }
        }
        anchoredDraggableState.I(draggableAnchors, obj);
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(obj, mutatePriority, function4, continuation);
    }

    public final float A() {
        if (!Float.isNaN(w())) {
            return w();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final void B(DraggableAnchors draggableAnchors) {
        this.f7099n.setValue(draggableAnchors);
    }

    public final void C(Object obj) {
        this.f7092g.setValue(obj);
    }

    public final void D(Object obj) {
        this.f7098m.setValue(obj);
    }

    public final void E(float f2) {
        this.f7097l.j(f2);
    }

    public final void F(float f2) {
        this.f7095j.j(f2);
    }

    public final Object G(float f2, Continuation continuation) {
        Object s2 = s();
        Object l2 = l(A(), s2, f2);
        if (((Boolean) this.f7089d.invoke(l2)).booleanValue()) {
            Object f3 = AnchoredDraggableKt.f(this, l2, f2, continuation);
            return f3 == IntrinsicsKt.f() ? f3 : Unit.f40552a;
        }
        Object f4 = AnchoredDraggableKt.f(this, s2, f2, continuation);
        return f4 == IntrinsicsKt.f() ? f4 : Unit.f40552a;
    }

    public final boolean H(Object obj) {
        return this.f7090e.e(new AnchoredDraggableState$trySnapTo$1(this, obj));
    }

    public final void I(DraggableAnchors draggableAnchors, Object obj) {
        if (!Intrinsics.d(o(), draggableAnchors)) {
            B(draggableAnchors);
            if (!H(obj)) {
                D(obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function3 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.C
            androidx.compose.material.AnchoredDraggableState r7 = (androidx.compose.material.AnchoredDraggableState) r7
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r8 = move-exception
            goto L_0x0089
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.ResultKt.b(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.f7090e     // Catch:{ all -> 0x0087 }
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch:{ all -> 0x0087 }
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x0087 }
            r0.C = r6     // Catch:{ all -> 0x0087 }
            r0.F = r4     // Catch:{ all -> 0x0087 }
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x0087 }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r7 = r6
        L_0x0050:
            androidx.compose.material.DraggableAnchors r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x0084
            float r9 = r7.w()
            androidx.compose.material.DraggableAnchors r0 = r7.o()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0084
            kotlin.jvm.functions.Function1 r9 = r7.f7089d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0084
            r7.C(r8)
        L_0x0084:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0087:
            r8 = move-exception
            r7 = r6
        L_0x0089:
            androidx.compose.material.DraggableAnchors r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto L_0x00bd
            float r0 = r7.w()
            androidx.compose.material.DraggableAnchors r1 = r7.o()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00bd
            kotlin.jvm.functions.Function1 r0 = r7.f7089d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bd
            r7.C(r9)
        L_0x00bd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.i(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r7, androidx.compose.foundation.MutatePriority r8, kotlin.jvm.functions.Function4 r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.C
            androidx.compose.material.AnchoredDraggableState r7 = (androidx.compose.material.AnchoredDraggableState) r7
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x005a
        L_0x0030:
            r8 = move-exception
            goto L_0x0094
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            kotlin.ResultKt.b(r10)
            androidx.compose.material.DraggableAnchors r10 = r6.o()
            boolean r10 = r10.f(r7)
            if (r10 == 0) goto L_0x00cc
            androidx.compose.material.InternalMutatorMutex r10 = r6.f7090e     // Catch:{ all -> 0x0092 }
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$4     // Catch:{ all -> 0x0092 }
            r2.<init>(r6, r7, r9, r5)     // Catch:{ all -> 0x0092 }
            r0.C = r6     // Catch:{ all -> 0x0092 }
            r0.F = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch:{ all -> 0x0092 }
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r7 = r6
        L_0x005a:
            r7.D(r5)
            androidx.compose.material.DraggableAnchors r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x00cf
            float r9 = r7.w()
            androidx.compose.material.DraggableAnchors r10 = r7.o()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00cf
            kotlin.jvm.functions.Function1 r9 = r7.f7089d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00cf
            r7.C(r8)
            goto L_0x00cf
        L_0x0092:
            r8 = move-exception
            r7 = r6
        L_0x0094:
            r7.D(r5)
            androidx.compose.material.DraggableAnchors r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto L_0x00cb
            float r10 = r7.w()
            androidx.compose.material.DraggableAnchors r0 = r7.o()
            float r0 = r0.c(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x00cb
            kotlin.jvm.functions.Function1 r10 = r7.f7089d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00cb
            r7.C(r9)
        L_0x00cb:
            throw r8
        L_0x00cc:
            r6.C(r7)
        L_0x00cf:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.j(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object l(float f2, Object obj, float f3) {
        Object a2;
        DraggableAnchors o2 = o();
        float c2 = o2.c(obj);
        float floatValue = ((Number) this.f7087b.invoke()).floatValue();
        int i2 = (c2 > f2 ? 1 : (c2 == f2 ? 0 : -1));
        if (i2 == 0 || Float.isNaN(c2)) {
            return obj;
        }
        if (i2 < 0) {
            if (f3 >= floatValue) {
                Object a3 = o2.a(f2, true);
                Intrinsics.f(a3);
                return a3;
            }
            a2 = o2.a(f2, true);
            Intrinsics.f(a2);
            if (f2 < Math.abs(c2 + Math.abs(((Number) this.f7086a.invoke(Float.valueOf(Math.abs(o2.c(a2) - c2)))).floatValue()))) {
                return obj;
            }
        } else if (f3 <= (-floatValue)) {
            Object a4 = o2.a(f2, false);
            Intrinsics.f(a4);
            return a4;
        } else {
            a2 = o2.a(f2, false);
            Intrinsics.f(a2);
            float abs = Math.abs(c2 - Math.abs(((Number) this.f7086a.invoke(Float.valueOf(Math.abs(c2 - o2.c(a2))))).floatValue()));
            if (f2 < 0.0f) {
                if (Math.abs(f2) < abs) {
                    return obj;
                }
            } else if (f2 > abs) {
                return obj;
            }
        }
        return a2;
    }

    public final Object m(float f2, Object obj) {
        Object a2;
        DraggableAnchors o2 = o();
        float c2 = o2.c(obj);
        int i2 = (c2 > f2 ? 1 : (c2 == f2 ? 0 : -1));
        if (i2 == 0 || Float.isNaN(c2)) {
            return obj;
        }
        if (i2 < 0) {
            a2 = o2.a(f2, true);
            if (a2 == null) {
                return obj;
            }
        } else {
            a2 = o2.a(f2, false);
            if (a2 == null) {
                return obj;
            }
        }
        return a2;
    }

    public final float n(float f2) {
        float z2 = z(f2);
        float w2 = Float.isNaN(w()) ? 0.0f : w();
        F(z2);
        return z2 - w2;
    }

    public final DraggableAnchors o() {
        return (DraggableAnchors) this.f7099n.getValue();
    }

    public final AnimationSpec p() {
        return this.f7088c;
    }

    public final Object q() {
        return this.f7094i.getValue();
    }

    public final Function1 r() {
        return this.f7089d;
    }

    public final Object s() {
        return this.f7092g.getValue();
    }

    public final Object t() {
        return this.f7098m.getValue();
    }

    public final DraggableState u() {
        return this.f7091f;
    }

    public final float v() {
        return this.f7097l.c();
    }

    public final float w() {
        return this.f7095j.c();
    }

    public final Object x() {
        return this.f7093h.getValue();
    }

    public final boolean y() {
        return t() != null;
    }

    public final float z(float f2) {
        return RangesKt.n((Float.isNaN(w()) ? 0.0f : w()) + f2, o().d(), o().g());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i2 & 32) != 0 ? AnonymousClass2.f7102z : function12);
    }

    public AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this(obj, function1, function0, animationSpec, function12);
        B(draggableAnchors);
        H(obj);
    }
}
