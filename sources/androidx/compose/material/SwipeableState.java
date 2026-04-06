package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
@Deprecated
public class SwipeableState<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final Companion f8580q = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f8581a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f8582b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f8583c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f8584d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableFloatState f8585e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableFloatState f8586f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableFloatState f8587g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableState f8588h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f8589i;

    /* renamed from: j  reason: collision with root package name */
    public final Flow f8590j;

    /* renamed from: k  reason: collision with root package name */
    public float f8591k;

    /* renamed from: l  reason: collision with root package name */
    public float f8592l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableState f8593m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableFloatState f8594n;

    /* renamed from: o  reason: collision with root package name */
    public final MutableState f8595o;

    /* renamed from: p  reason: collision with root package name */
    public final DraggableState f8596p;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1) {
        this.f8581a = animationSpec;
        this.f8582b = function1;
        this.f8583c = SnapshotStateKt__SnapshotStateKt.e(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8584d = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8585e = PrimitiveSnapshotStateKt.a(0.0f);
        this.f8586f = PrimitiveSnapshotStateKt.a(0.0f);
        this.f8587g = PrimitiveSnapshotStateKt.a(0.0f);
        this.f8588h = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8589i = SnapshotStateKt__SnapshotStateKt.e(MapsKt.h(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8590j = FlowKt.e0(new SwipeableState$special$$inlined$filter$1(SnapshotStateKt.q(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.f8591k = Float.NEGATIVE_INFINITY;
        this.f8592l = Float.POSITIVE_INFINITY;
        this.f8593m = SnapshotStateKt__SnapshotStateKt.e(SwipeableState$thresholds$2.f8614z, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8594n = PrimitiveSnapshotStateKt.a(0.0f);
        this.f8595o = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f8596p = DraggableKt.a(new SwipeableState$draggableState$1(this));
    }

    public static /* synthetic */ Object k(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                animationSpec = swipeableState.f8581a;
            }
            return swipeableState.j(obj, animationSpec, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|79|80|(1:82)(4:83|84|87|88)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0208 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(java.util.Map r10, java.util.Map r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material.SwipeableState$processNewAnchors$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            float r10 = r0.E
            java.lang.Object r11 = r0.D
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.C
            androidx.compose.material.SwipeableState r0 = (androidx.compose.material.SwipeableState) r0
            kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0218
        L_0x003a:
            r12 = move-exception
            goto L_0x024a
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            float r10 = r0.E
            java.lang.Object r11 = r0.D
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r2 = r0.C
            androidx.compose.material.SwipeableState r2 = (androidx.compose.material.SwipeableState) r2
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x0208 }
            goto L_0x01d1
        L_0x0054:
            r12 = move-exception
            r0 = r2
            goto L_0x024a
        L_0x0058:
            kotlin.ResultKt.b(r12)
            goto L_0x00a2
        L_0x005c:
            kotlin.ResultKt.b(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00ad
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.u0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r9.f8591k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.s0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r9.f8592l = r10
            java.lang.Object r10 = r9.p()
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 == 0) goto L_0x00a5
            float r10 = r10.floatValue()
            r0.H = r5
            java.lang.Object r10 = r9.H(r10, r0)
            if (r10 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x00a5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The initial value must have an associated anchor."
            r10.<init>(r11)
            throw r10
        L_0x00ad:
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r11, r10)
            if (r12 != 0) goto L_0x027c
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9.f8591k = r12
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.f8592l = r12
            androidx.compose.runtime.MutableState r12 = r9.f8588h
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x012f
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 == 0) goto L_0x00d6
            float r10 = r10.floatValue()
            goto L_0x01bf
        L_0x00d6:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00e7
            goto L_0x0124
        L_0x00e7:
            java.lang.Object r2 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00f2
            goto L_0x0124
        L_0x00f2:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r6 = r12.floatValue()
            float r10 = r10 - r6
            float r10 = java.lang.Math.abs(r10)
        L_0x0102:
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r8 = r12.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r10, r7)
            if (r8 <= 0) goto L_0x011e
            r2 = r6
            r10 = r7
        L_0x011e:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0102
        L_0x0124:
            kotlin.jvm.internal.Intrinsics.f(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01bf
        L_0x012f:
            androidx.compose.runtime.State r12 = r9.t()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.p()
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r10, r12)
            if (r12 == 0) goto L_0x0149
            java.lang.Object r10 = r9.p()
        L_0x0149:
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 == 0) goto L_0x0154
            float r10 = r10.floatValue()
            goto L_0x01bf
        L_0x0154:
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0165
            goto L_0x01b6
        L_0x0165:
            java.lang.Object r2 = r10.next()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0170
            goto L_0x01b6
        L_0x0170:
            r12 = r2
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.runtime.State r5 = r9.t()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
        L_0x018a:
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            androidx.compose.runtime.State r7 = r9.t()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Float.compare(r12, r6)
            if (r7 <= 0) goto L_0x01b0
            r2 = r5
            r12 = r6
        L_0x01b0:
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x018a
        L_0x01b6:
            kotlin.jvm.internal.Intrinsics.f(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
        L_0x01bf:
            androidx.compose.animation.core.AnimationSpec r12 = r9.f8581a     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.C = r9     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.D = r11     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.E = r10     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.H = r4     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            java.lang.Object r12 = r9.i(r10, r12, r0)     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            if (r12 != r1) goto L_0x01d0
            return r1
        L_0x01d0:
            r2 = r9
        L_0x01d1:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.b(r10)
            java.lang.Object r10 = kotlin.collections.MapsKt.i(r11, r10)
            r2.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.u0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r2.f8591k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.s0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r2.f8592l = r10
            goto L_0x027c
        L_0x0204:
            r12 = move-exception
            r0 = r9
            goto L_0x024a
        L_0x0207:
            r2 = r9
        L_0x0208:
            r0.C = r2     // Catch:{ all -> 0x0054 }
            r0.D = r11     // Catch:{ all -> 0x0054 }
            r0.E = r10     // Catch:{ all -> 0x0054 }
            r0.H = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r2.H(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x0217
            return r1
        L_0x0217:
            r0 = r2
        L_0x0218:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.b(r10)
            java.lang.Object r10 = kotlin.collections.MapsKt.i(r11, r10)
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.u0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r0.f8591k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.s0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r0.f8592l = r10
            goto L_0x027c
        L_0x024a:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.b(r10)
            java.lang.Object r10 = kotlin.collections.MapsKt.i(r11, r10)
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.u0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r0.f8591k = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Float r10 = kotlin.collections.CollectionsKt.s0(r10)
            kotlin.jvm.internal.Intrinsics.f(r10)
            float r10 = r10.floatValue()
            r0.f8592l = r10
            throw r12
        L_0x027c:
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.A(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void B(Map map) {
        this.f8589i.setValue(map);
    }

    public final void C(boolean z2) {
        this.f8584d.setValue(Boolean.valueOf(z2));
    }

    public final void D(Object obj) {
        this.f8583c.setValue(obj);
    }

    public final void E(ResistanceConfig resistanceConfig) {
        this.f8595o.setValue(resistanceConfig);
    }

    public final void F(Function2 function2) {
        this.f8593m.setValue(function2);
    }

    public final void G(float f2) {
        this.f8594n.j(f2);
    }

    public final Object H(float f2, Continuation continuation) {
        Object c2 = DraggableState.c(this.f8596p, (MutatePriority) null, new SwipeableState$snapInternalToOffset$2(f2, this, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final Object i(float f2, AnimationSpec animationSpec, Continuation continuation) {
        Object c2 = DraggableState.c(this.f8596p, (MutatePriority) null, new SwipeableState$animateInternalToOffset$2(this, f2, animationSpec, (Continuation) null), continuation, 1, (Object) null);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }

    public final Object j(Object obj, AnimationSpec animationSpec, Continuation continuation) {
        Object a2 = this.f8590j.a(new SwipeableState$animateTo$2(obj, this, animationSpec), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final void l(Map map) {
        if (m().isEmpty()) {
            Float b2 = SwipeableKt.e(map, p());
            if (b2 != null) {
                this.f8585e.j(b2.floatValue());
                this.f8587g.j(b2.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.");
        }
    }

    public final Map m() {
        return (Map) this.f8589i.getValue();
    }

    public final AnimationSpec n() {
        return this.f8581a;
    }

    public final Function1 o() {
        return this.f8582b;
    }

    public final Object p() {
        return this.f8583c.getValue();
    }

    public final DraggableState q() {
        return this.f8596p;
    }

    public final float r() {
        return this.f8592l;
    }

    public final float s() {
        return this.f8591k;
    }

    public final State t() {
        return this.f8585e;
    }

    public final ResistanceConfig u() {
        return (ResistanceConfig) this.f8595o.getValue();
    }

    public final Function2 v() {
        return (Function2) this.f8593m.getValue();
    }

    public final float w() {
        return this.f8594n.c();
    }

    public final boolean x() {
        return ((Boolean) this.f8584d.getValue()).booleanValue();
    }

    public final float y(float f2) {
        float n2 = RangesKt.n(this.f8587g.c() + f2, this.f8591k, this.f8592l) - this.f8587g.c();
        if (Math.abs(n2) > 0.0f) {
            this.f8596p.b(n2);
        }
        return n2;
    }

    public final Object z(float f2, Continuation continuation) {
        Object a2 = this.f8590j.a(new SwipeableState$performFling$2(this, f2), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? SwipeableDefaults.f8558a.a() : animationSpec, (i2 & 4) != 0 ? AnonymousClass1.f8599z : function1);
    }
}
