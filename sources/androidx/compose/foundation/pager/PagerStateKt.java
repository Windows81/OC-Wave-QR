package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class PagerStateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5386a = Dp.m((float) 56);

    /* renamed from: b  reason: collision with root package name */
    public static final PagerMeasureResult f5387b;

    /* renamed from: c  reason: collision with root package name */
    public static final PagerStateKt$UnitDensity$1 f5388c = new PagerStateKt$UnitDensity$1();

    static {
        List m2 = CollectionsKt.m();
        Orientation orientation = Orientation.Horizontal;
        SnapPosition.Start start = SnapPosition.Start.f3677a;
        PagerStateKt$EmptyLayoutInfo$1 pagerStateKt$EmptyLayoutInfo$1 = r0;
        PagerStateKt$EmptyLayoutInfo$1 pagerStateKt$EmptyLayoutInfo$12 = new PagerStateKt$EmptyLayoutInfo$1();
        f5387b = new PagerMeasureResult(m2, 0, 0, 0, orientation, 0, 0, false, 0, (MeasuredPage) null, (MeasuredPage) null, 0.0f, 0, false, start, pagerStateKt$EmptyLayoutInfo$1, false, (List) null, (List) null, CoroutineScopeKt.a(EmptyCoroutineContext.f40721z), 393216, (DefaultConstructorMarker) null);
    }

    public static final Object d(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, float f2, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        function2.m(lazyLayoutScrollScope, Boxing.c(i2));
        boolean z2 = i2 > lazyLayoutScrollScope.h();
        int c2 = (lazyLayoutScrollScope.c() - lazyLayoutScrollScope.h()) + 1;
        if (((z2 && i2 > lazyLayoutScrollScope.c()) || (!z2 && i2 < lazyLayoutScrollScope.h())) && Math.abs(i2 - lazyLayoutScrollScope.h()) >= 3) {
            lazyLayoutScrollScope.e(z2 ? RangesKt.e(i2 - c2, lazyLayoutScrollScope.h()) : RangesKt.j(c2 + i2, lazyLayoutScrollScope.h()), 0);
        }
        Object e2 = SuspendAnimationKt.e(0.0f, ((float) LazyLayoutScrollScope.a(lazyLayoutScrollScope, i2, 0, 2, (Object) null)) + f2, 0.0f, animationSpec, new PagerStateKt$animateScrollToPage$4(new Ref.FloatRef(), lazyLayoutScrollScope), continuation, 4, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public static final Object e(PagerState pagerState, Continuation continuation) {
        if (pagerState.v() + 1 >= pagerState.H()) {
            return Unit.f40552a;
        }
        Object n2 = PagerState.n(pagerState, pagerState.v() + 1, 0.0f, (AnimationSpec) null, continuation, 6, (Object) null);
        return n2 == IntrinsicsKt.f() ? n2 : Unit.f40552a;
    }

    public static final Object f(PagerState pagerState, Continuation continuation) {
        if (pagerState.v() - 1 < 0) {
            return Unit.f40552a;
        }
        Object n2 = PagerState.n(pagerState, pagerState.v() - 1, 0.0f, (AnimationSpec) null, continuation, 6, (Object) null);
        return n2 == IntrinsicsKt.f() ? n2 : Unit.f40552a;
    }

    public static final long g(PagerLayoutInfo pagerLayoutInfo, int i2) {
        long l2 = (((((long) i2) * ((long) (pagerLayoutInfo.l() + pagerLayoutInfo.k()))) + ((long) pagerLayoutInfo.f())) + ((long) pagerLayoutInfo.d())) - ((long) pagerLayoutInfo.l());
        int c2 = (int) (pagerLayoutInfo.e() == Orientation.Horizontal ? pagerLayoutInfo.c() >> 32 : pagerLayoutInfo.c() & 4294967295L);
        return RangesKt.f(l2 - ((long) (c2 - RangesKt.o(pagerLayoutInfo.n().a(c2, pagerLayoutInfo.k(), pagerLayoutInfo.f(), pagerLayoutInfo.d(), i2 - 1, i2), 0, c2))), 0);
    }

    public static final long h(PagerMeasureResult pagerMeasureResult, int i2) {
        int c2 = (int) (pagerMeasureResult.e() == Orientation.Horizontal ? pagerMeasureResult.c() >> 32 : pagerMeasureResult.c() & 4294967295L);
        return (long) RangesKt.o(pagerMeasureResult.n().a(c2, pagerMeasureResult.k(), pagerMeasureResult.f(), pagerMeasureResult.d(), 0, i2), 0, c2);
    }

    public static final float i() {
        return f5386a;
    }

    public static final PagerMeasureResult j() {
        return f5387b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.PagerState k(int r10, float r11, kotlin.jvm.functions.Function0 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r10 = r1
        L_0x0006:
            r15 = r15 & 2
            if (r15 == 0) goto L_0x000b
            r11 = 0
        L_0x000b:
            boolean r15 = androidx.compose.runtime.ComposerKt.P()
            if (r15 == 0) goto L_0x001a
            r15 = -1
            java.lang.String r0 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)"
            r2 = -1210768637(0xffffffffb7d52303, float:-2.5407882E-5)
            androidx.compose.runtime.ComposerKt.Y(r2, r14, r15, r0)
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            androidx.compose.foundation.pager.DefaultPagerState$Companion r15 = androidx.compose.foundation.pager.DefaultPagerState.M
            androidx.compose.runtime.saveable.Saver r4 = r15.a()
            r15 = r14 & 14
            r15 = r15 ^ 6
            r0 = 4
            r2 = 1
            if (r15 <= r0) goto L_0x0030
            boolean r15 = r13.i(r10)
            if (r15 != 0) goto L_0x0034
        L_0x0030:
            r15 = r14 & 6
            if (r15 != r0) goto L_0x0036
        L_0x0034:
            r15 = r2
            goto L_0x0037
        L_0x0036:
            r15 = r1
        L_0x0037:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r5 = 32
            if (r0 <= r5) goto L_0x0045
            boolean r0 = r13.h(r11)
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r0 = r14 & 48
            if (r0 != r5) goto L_0x004b
        L_0x0049:
            r0 = r2
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            r15 = r15 | r0
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 <= r5) goto L_0x005b
            boolean r0 = r13.W(r12)
            if (r0 != 0) goto L_0x005f
        L_0x005b:
            r14 = r14 & 384(0x180, float:5.38E-43)
            if (r14 != r5) goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            r14 = r15 | r1
            java.lang.Object r15 = r13.g()
            if (r14 != 0) goto L_0x0070
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r15 != r14) goto L_0x0078
        L_0x0070:
            androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1 r15 = new androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
            r15.<init>(r10, r11, r12)
            r13.N(r15)
        L_0x0078:
            r6 = r15
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8 = 0
            r9 = 4
            r5 = 0
            r7 = r13
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.pager.DefaultPagerState r10 = (androidx.compose.foundation.pager.DefaultPagerState) r10
            androidx.compose.runtime.MutableState r11 = r10.q0()
            r11.setValue(r12)
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0095
            androidx.compose.runtime.ComposerKt.X()
        L_0x0095:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt.k(int, float, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.pager.PagerState");
    }
}
