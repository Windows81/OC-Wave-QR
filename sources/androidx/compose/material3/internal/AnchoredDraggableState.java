package androidx.compose.material3.internal;

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
    public static final Companion f12118p = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f12119a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f12120b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f12121c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f12122d;

    /* renamed from: e  reason: collision with root package name */
    public final InternalMutatorMutex f12123e = new InternalMutatorMutex();

    /* renamed from: f  reason: collision with root package name */
    public final DraggableState f12124f = new AnchoredDraggableState$draggableState$1(this);

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f12125g;

    /* renamed from: h  reason: collision with root package name */
    public final State f12126h;

    /* renamed from: i  reason: collision with root package name */
    public final State f12127i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableFloatState f12128j;

    /* renamed from: k  reason: collision with root package name */
    public final State f12129k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableFloatState f12130l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f12131m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f12132n;

    /* renamed from: o  reason: collision with root package name */
    public final AnchoredDragScope f12133o;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, Function0 function02, Function1 function12) {
        this.f12119a = function1;
        this.f12120b = function0;
        this.f12121c = function02;
        this.f12122d = function12;
        this.f12125g = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f12126h = SnapshotStateKt.e(new C0143p(this));
        this.f12127i = SnapshotStateKt.e(new C0144q(this));
        this.f12128j = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.f12129k = SnapshotStateKt.d(SnapshotStateKt.r(), new r(this));
        this.f12130l = PrimitiveSnapshotStateKt.a(0.0f);
        this.f12131m = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f12132n = SnapshotStateKt__SnapshotStateKt.e(AnchoredDraggableKt.h(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f12133o = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static final float B(AnchoredDraggableState anchoredDraggableState) {
        float c2 = anchoredDraggableState.p().c(anchoredDraggableState.t());
        float c3 = anchoredDraggableState.p().c(anchoredDraggableState.r()) - c2;
        float abs = Math.abs(c3);
        if (Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float C = (anchoredDraggableState.C() - c2) / c3;
        if (C < 1.0E-6f) {
            return 0.0f;
        }
        if (C > 0.999999f) {
            return 1.0f;
        }
        return C;
    }

    public static final Object J(AnchoredDraggableState anchoredDraggableState) {
        Object u2 = anchoredDraggableState.u();
        if (u2 != null) {
            return u2;
        }
        float x2 = anchoredDraggableState.x();
        return !Float.isNaN(x2) ? anchoredDraggableState.m(x2, anchoredDraggableState.t(), 0.0f) : anchoredDraggableState.t();
    }

    public static final Unit L(AnchoredDraggableState anchoredDraggableState, Object obj) {
        AnchoredDragScope anchoredDragScope = anchoredDraggableState.f12133o;
        float c2 = anchoredDraggableState.p().c(obj);
        if (!Float.isNaN(c2)) {
            AnchoredDragScope.b(anchoredDragScope, c2, 0.0f, 2, (Object) null);
            anchoredDraggableState.F((Object) null);
        }
        anchoredDraggableState.E(obj);
        return Unit.f40552a;
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(obj, mutatePriority, function4, continuation);
    }

    public static final Object l(AnchoredDraggableState anchoredDraggableState) {
        Object u2 = anchoredDraggableState.u();
        if (u2 != null) {
            return u2;
        }
        float x2 = anchoredDraggableState.x();
        return !Float.isNaN(x2) ? anchoredDraggableState.n(x2, anchoredDraggableState.t()) : anchoredDraggableState.t();
    }

    public final float A(float f2) {
        return RangesKt.n((Float.isNaN(x()) ? 0.0f : x()) + f2, p().d(), p().g());
    }

    public final float C() {
        if (!Float.isNaN(x())) {
            return x();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final void D(DraggableAnchors draggableAnchors) {
        this.f12132n.setValue(draggableAnchors);
    }

    public final void E(Object obj) {
        this.f12125g.setValue(obj);
    }

    public final void F(Object obj) {
        this.f12131m.setValue(obj);
    }

    public final void G(float f2) {
        this.f12130l.j(f2);
    }

    public final void H(float f2) {
        this.f12128j.j(f2);
    }

    public final Object I(float f2, Continuation continuation) {
        Object t2 = t();
        Object m2 = m(C(), t2, f2);
        if (((Boolean) this.f12122d.invoke(m2)).booleanValue()) {
            Object f3 = AnchoredDraggableKt.f(this, m2, f2, continuation);
            return f3 == IntrinsicsKt.f() ? f3 : Unit.f40552a;
        }
        Object f4 = AnchoredDraggableKt.f(this, t2, f2, continuation);
        return f4 == IntrinsicsKt.f() ? f4 : Unit.f40552a;
    }

    public final boolean K(Object obj) {
        return this.f12123e.e(new C0142o(this, obj));
    }

    public final void M(DraggableAnchors draggableAnchors, Object obj) {
        if (!Intrinsics.d(p(), draggableAnchors)) {
            D(draggableAnchors);
            if (!K(obj)) {
                F(obj);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function3 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            kotlin.ResultKt.b(r9)     // Catch:{ all -> 0x002b }
            goto L_0x0049
        L_0x002b:
            r7 = move-exception
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.b(r9)
            androidx.compose.material3.internal.InternalMutatorMutex r9 = r6.f12123e     // Catch:{ all -> 0x002b }
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch:{ all -> 0x002b }
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x002b }
            r0.E = r4     // Catch:{ all -> 0x002b }
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch:{ all -> 0x002b }
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            androidx.compose.material3.internal.DraggableAnchors r7 = r6.p()
            float r8 = r6.x()
            java.lang.Object r7 = r7.b(r8)
            if (r7 == 0) goto L_0x007d
            float r8 = r6.x()
            androidx.compose.material3.internal.DraggableAnchors r9 = r6.p()
            float r9 = r9.c(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x007d
            kotlin.jvm.functions.Function1 r8 = r6.f12122d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007d
            r6.E(r7)
        L_0x007d:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0080:
            androidx.compose.material3.internal.DraggableAnchors r8 = r6.p()
            float r9 = r6.x()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x00b4
            float r9 = r6.x()
            androidx.compose.material3.internal.DraggableAnchors r0 = r6.p()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00b4
            kotlin.jvm.functions.Function1 r9 = r6.f12122d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b4
            r6.E(r8)
        L_0x00b4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.i(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Object r7, androidx.compose.foundation.MutatePriority r8, kotlin.jvm.functions.Function4 r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x002c }
            goto L_0x0053
        L_0x002c:
            r7 = move-exception
            goto L_0x008b
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.ResultKt.b(r10)
            androidx.compose.material3.internal.DraggableAnchors r10 = r6.p()
            boolean r10 = r10.f(r7)
            if (r10 == 0) goto L_0x00c3
            androidx.compose.material3.internal.InternalMutatorMutex r10 = r6.f12123e     // Catch:{ all -> 0x002c }
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4     // Catch:{ all -> 0x002c }
            r2.<init>(r6, r7, r9, r5)     // Catch:{ all -> 0x002c }
            r0.E = r4     // Catch:{ all -> 0x002c }
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch:{ all -> 0x002c }
            if (r7 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r6.F(r5)
            androidx.compose.material3.internal.DraggableAnchors r7 = r6.p()
            float r8 = r6.x()
            java.lang.Object r7 = r7.b(r8)
            if (r7 == 0) goto L_0x00c6
            float r8 = r6.x()
            androidx.compose.material3.internal.DraggableAnchors r9 = r6.p()
            float r9 = r9.c(r7)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x00c6
            kotlin.jvm.functions.Function1 r8 = r6.f12122d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00c6
            r6.E(r7)
            goto L_0x00c6
        L_0x008b:
            r6.F(r5)
            androidx.compose.material3.internal.DraggableAnchors r8 = r6.p()
            float r9 = r6.x()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L_0x00c2
            float r9 = r6.x()
            androidx.compose.material3.internal.DraggableAnchors r10 = r6.p()
            float r10 = r10.c(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x00c2
            kotlin.jvm.functions.Function1 r9 = r6.f12122d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00c2
            r6.E(r8)
        L_0x00c2:
            throw r7
        L_0x00c3:
            r6.E(r7)
        L_0x00c6:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.j(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object m(float f2, Object obj, float f3) {
        Object a2;
        DraggableAnchors p2 = p();
        float c2 = p2.c(obj);
        float floatValue = ((Number) this.f12120b.invoke()).floatValue();
        int i2 = (c2 > f2 ? 1 : (c2 == f2 ? 0 : -1));
        if (i2 == 0 || Float.isNaN(c2)) {
            return obj;
        }
        if (i2 < 0) {
            if (f3 >= floatValue) {
                Object a3 = p2.a(f2, true);
                Intrinsics.f(a3);
                return a3;
            }
            a2 = p2.a(f2, true);
            Intrinsics.f(a2);
            if (f2 < Math.abs(c2 + Math.abs(((Number) this.f12119a.invoke(Float.valueOf(Math.abs(p2.c(a2) - c2)))).floatValue()))) {
                return obj;
            }
        } else if (f3 <= (-floatValue)) {
            Object a4 = p2.a(f2, false);
            Intrinsics.f(a4);
            return a4;
        } else {
            a2 = p2.a(f2, false);
            Intrinsics.f(a2);
            float abs = Math.abs(c2 - Math.abs(((Number) this.f12119a.invoke(Float.valueOf(Math.abs(c2 - p2.c(a2))))).floatValue()));
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

    public final Object n(float f2, Object obj) {
        Object a2;
        DraggableAnchors p2 = p();
        float c2 = p2.c(obj);
        int i2 = (c2 > f2 ? 1 : (c2 == f2 ? 0 : -1));
        if (i2 == 0 || Float.isNaN(c2)) {
            return obj;
        }
        if (i2 < 0) {
            a2 = p2.a(f2, true);
            if (a2 == null) {
                return obj;
            }
        } else {
            a2 = p2.a(f2, false);
            if (a2 == null) {
                return obj;
            }
        }
        return a2;
    }

    public final float o(float f2) {
        float A2 = A(f2);
        float x2 = Float.isNaN(x()) ? 0.0f : x();
        H(A2);
        return A2 - x2;
    }

    public final DraggableAnchors p() {
        return (DraggableAnchors) this.f12132n.getValue();
    }

    public final Function0 q() {
        return this.f12121c;
    }

    public final Object r() {
        return this.f12127i.getValue();
    }

    public final Function1 s() {
        return this.f12122d;
    }

    public final Object t() {
        return this.f12125g.getValue();
    }

    public final Object u() {
        return this.f12131m.getValue();
    }

    public final DraggableState v() {
        return this.f12124f;
    }

    public final float w() {
        return this.f12130l.c();
    }

    public final float x() {
        return this.f12128j.c();
    }

    public final Object y() {
        return this.f12126h.getValue();
    }

    public final boolean z() {
        return u() != null;
    }
}
