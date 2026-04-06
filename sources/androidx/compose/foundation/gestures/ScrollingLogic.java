package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ScrollingLogic {

    /* renamed from: a  reason: collision with root package name */
    public ScrollableState f3580a;

    /* renamed from: b  reason: collision with root package name */
    public OverscrollEffect f3581b;

    /* renamed from: c  reason: collision with root package name */
    public FlingBehavior f3582c;

    /* renamed from: d  reason: collision with root package name */
    public Orientation f3583d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3584e;

    /* renamed from: f  reason: collision with root package name */
    public NestedScrollDispatcher f3585f;

    /* renamed from: g  reason: collision with root package name */
    public final Function0 f3586g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3587h;

    /* renamed from: i  reason: collision with root package name */
    public int f3588i = NestedScrollSource.f16795b.b();

    /* renamed from: j  reason: collision with root package name */
    public ScrollScope f3589j = ScrollableKt.f3564b;

    /* renamed from: k  reason: collision with root package name */
    public final ScrollingLogic$nestedScrollScope$1 f3590k = new ScrollingLogic$nestedScrollScope$1(this);

    /* renamed from: l  reason: collision with root package name */
    public final Function1 f3591l = new ScrollingLogic$performScrollForOverscroll$1(this);

    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z2, NestedScrollDispatcher nestedScrollDispatcher, Function0 function0) {
        this.f3580a = scrollableState;
        this.f3581b = overscrollEffect;
        this.f3582c = flingBehavior;
        this.f3583d = orientation;
        this.f3584e = z2;
        this.f3585f = nestedScrollDispatcher;
        this.f3586g = function0;
    }

    public final boolean A(float f2) {
        return (f2 > 0.0f && !this.f3580a.f()) || (f2 < 0.0f && !this.f3580a.d()) || !((Boolean) this.f3586g.invoke()).booleanValue();
    }

    public final boolean B() {
        if (!this.f3580a.a()) {
            OverscrollEffect overscrollEffect = this.f3581b;
            return overscrollEffect != null ? overscrollEffect.P() : false;
        }
    }

    public final long C(long j2) {
        return this.f3583d == Orientation.Horizontal ? Offset.g(j2, 0.0f, 0.0f, 1, (Object) null) : Offset.g(j2, 0.0f, 0.0f, 2, (Object) null);
    }

    public final long D(long j2) {
        return this.f3583d == Orientation.Horizontal ? Velocity.e(j2, 0.0f, 0.0f, 1, (Object) null) : Velocity.e(j2, 0.0f, 0.0f, 2, (Object) null);
    }

    public final float E(long j2) {
        return this.f3583d == Orientation.Horizontal ? Velocity.h(j2) : Velocity.i(j2);
    }

    public final float F(long j2) {
        return Float.intBitsToFloat((int) (this.f3583d == Orientation.Horizontal ? j2 >> 32 : j2 & 4294967295L));
    }

    public final long G(float f2) {
        if (f2 == 0.0f) {
            return Offset.f15855b.c();
        }
        if (this.f3583d != Orientation.Horizontal) {
            return Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        }
        return Offset.e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public final long H(float f2) {
        return f2 == 0.0f ? Velocity.f19186b.a() : this.f3583d == Orientation.Horizontal ? VelocityKt.a(f2, 0.0f) : VelocityKt.a(0.0f, f2);
    }

    public final boolean I(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z3;
        boolean z4 = true;
        if (!Intrinsics.d(this.f3580a, scrollableState)) {
            this.f3580a = scrollableState;
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3581b = overscrollEffect;
        if (this.f3583d != orientation) {
            this.f3583d = orientation;
            z3 = true;
        }
        if (this.f3584e != z2) {
            this.f3584e = z2;
        } else {
            z4 = z3;
        }
        this.f3582c = flingBehavior;
        this.f3585f = nestedScrollDispatcher;
        return z4;
    }

    public final long J(long j2, float f2) {
        return this.f3583d == Orientation.Horizontal ? Velocity.e(j2, f2, 0.0f, 2, (Object) null) : Velocity.e(j2, 0.0f, f2, 1, (Object) null);
    }

    public final long o(long j2) {
        return G(x(this.f3580a.b(x(F(j2)))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(long r12, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.D
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            java.lang.Object r13 = r0.C
            androidx.compose.foundation.gestures.ScrollingLogic r13 = (androidx.compose.foundation.gestures.ScrollingLogic) r13
            kotlin.ResultKt.b(r14)
            goto L_0x0060
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            kotlin.ResultKt.b(r14)
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r14.f40907z = r12
            r11.f3587h = r3
            androidx.compose.foundation.MutatePriority r2 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r10 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.C = r11
            r0.D = r14
            r0.G = r3
            java.lang.Object r12 = r11.z(r2, r10, r0)
            if (r12 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r13 = r11
            r12 = r14
        L_0x0060:
            r14 = 0
            r13.f3587h = r14
            long r12 = r12.f40907z
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.p(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ScrollableState q() {
        return this.f3580a;
    }

    public final boolean r() {
        return this.f3580a.f() || this.f3580a.d();
    }

    public final boolean s() {
        return this.f3587h;
    }

    public final boolean t() {
        return this.f3583d == Orientation.Vertical;
    }

    public final Object u(long j2, boolean z2, Continuation continuation) {
        if (z2 && !ScrollableKt.g(this.f3582c)) {
            return Unit.f40552a;
        }
        long D = D(j2);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, (Continuation) null);
        OverscrollEffect overscrollEffect = this.f3581b;
        if (overscrollEffect == null || !r()) {
            Object m2 = scrollingLogic$onScrollStopped$performFling$1.m(Velocity.b(D), continuation);
            return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
        }
        Object O = overscrollEffect.O(D, scrollingLogic$onScrollStopped$performFling$1, continuation);
        return O == IntrinsicsKt.f() ? O : Unit.f40552a;
    }

    public final long v(long j2) {
        return this.f3580a.a() ? Offset.f15855b.c() : o(j2);
    }

    public final long w(ScrollScope scrollScope, long j2, int i2) {
        long d2 = this.f3585f.d(j2, i2);
        long p2 = Offset.p(j2, d2);
        long y2 = y(G(scrollScope.g(F(y(C(p2))))));
        return Offset.q(Offset.q(d2, y2), this.f3585f.b(y2, Offset.p(p2, y2), i2));
    }

    public final float x(float f2) {
        return this.f3584e ? f2 * ((float) -1) : f2;
    }

    public final long y(long j2) {
        return this.f3584e ? Offset.r(j2, -1.0f) : j2;
    }

    public final Object z(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object e2 = this.f3580a.e(mutatePriority, new ScrollingLogic$scroll$2(this, function2, (Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
