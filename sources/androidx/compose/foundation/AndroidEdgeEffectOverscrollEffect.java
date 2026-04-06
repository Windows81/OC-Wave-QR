package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;

@Metadata
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* renamed from: a  reason: collision with root package name */
    public final Density f2876a;

    /* renamed from: b  reason: collision with root package name */
    public long f2877b;

    /* renamed from: c  reason: collision with root package name */
    public final EdgeEffectWrapper f2878c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f2879d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2880e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2881f;

    /* renamed from: g  reason: collision with root package name */
    public long f2882g;

    /* renamed from: h  reason: collision with root package name */
    public long f2883h;

    /* renamed from: i  reason: collision with root package name */
    public final SuspendingPointerInputModifierNode f2884i;

    /* renamed from: j  reason: collision with root package name */
    public final DelegatableNode f2885j;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j2, paddingValues);
    }

    public DelegatableNode M() {
        return this.f2885j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long N(long r18, int r20, kotlin.jvm.functions.Function1 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r21
            long r4 = r0.f2882g
            boolean r4 = androidx.compose.ui.geometry.Size.k(r4)
            if (r4 == 0) goto L_0x001d
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r18)
            java.lang.Object r1 = r3.invoke(r1)
            androidx.compose.ui.geometry.Offset r1 = (androidx.compose.ui.geometry.Offset) r1
            long r1 = r1.t()
            return r1
        L_0x001d:
            boolean r4 = r0.f2881f
            r5 = 1
            if (r4 != 0) goto L_0x0068
            androidx.compose.foundation.EdgeEffectWrapper r4 = r0.f2878c
            boolean r4 = r4.u()
            if (r4 == 0) goto L_0x0033
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r6 = r4.c()
            r0.i(r6)
        L_0x0033:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r0.f2878c
            boolean r4 = r4.x()
            if (r4 == 0) goto L_0x0044
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r6 = r4.c()
            r0.j(r6)
        L_0x0044:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r0.f2878c
            boolean r4 = r4.B()
            if (r4 == 0) goto L_0x0055
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r6 = r4.c()
            r0.k(r6)
        L_0x0055:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r0.f2878c
            boolean r4 = r4.r()
            if (r4 == 0) goto L_0x0066
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r6 = r4.c()
            r0.h(r6)
        L_0x0066:
            r0.f2881f = r5
        L_0x0068:
            float r4 = androidx.compose.foundation.AndroidOverscroll_androidKt.c(r20)
            long r6 = androidx.compose.ui.geometry.Offset.r(r1, r4)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r1 & r8
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0083
        L_0x0081:
            r10 = r12
            goto L_0x00ef
        L_0x0083:
            androidx.compose.foundation.EdgeEffectWrapper r11 = r0.f2878c
            boolean r11 = r11.B()
            if (r11 == 0) goto L_0x00bb
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00bb
            float r11 = r0.k(r6)
            androidx.compose.foundation.EdgeEffectWrapper r13 = r0.f2878c
            boolean r13 = r13.B()
            if (r13 != 0) goto L_0x00a8
            androidx.compose.foundation.EdgeEffectWrapper r13 = r0.f2878c
            android.widget.EdgeEffect r13 = r13.m()
            r13.finish()
        L_0x00a8:
            long r13 = r6 & r8
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00b8
            float r10 = java.lang.Float.intBitsToFloat(r10)
            goto L_0x00ef
        L_0x00b8:
            float r10 = r11 / r4
            goto L_0x00ef
        L_0x00bb:
            androidx.compose.foundation.EdgeEffectWrapper r11 = r0.f2878c
            boolean r11 = r11.r()
            if (r11 == 0) goto L_0x0081
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0081
            float r11 = r0.h(r6)
            androidx.compose.foundation.EdgeEffectWrapper r13 = r0.f2878c
            boolean r13 = r13.r()
            if (r13 != 0) goto L_0x00e0
            androidx.compose.foundation.EdgeEffectWrapper r13 = r0.f2878c
            android.widget.EdgeEffect r13 = r13.g()
            r13.finish()
        L_0x00e0:
            long r13 = r6 & r8
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00b8
            float r10 = java.lang.Float.intBitsToFloat(r10)
        L_0x00ef:
            r11 = 32
            long r13 = r1 >> r11
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00fe
        L_0x00fc:
            r4 = r12
            goto L_0x0168
        L_0x00fe:
            androidx.compose.foundation.EdgeEffectWrapper r14 = r0.f2878c
            boolean r14 = r14.u()
            if (r14 == 0) goto L_0x0135
            float r14 = java.lang.Float.intBitsToFloat(r13)
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0135
            float r14 = r0.i(r6)
            androidx.compose.foundation.EdgeEffectWrapper r15 = r0.f2878c
            boolean r15 = r15.u()
            if (r15 != 0) goto L_0x0123
            androidx.compose.foundation.EdgeEffectWrapper r15 = r0.f2878c
            android.widget.EdgeEffect r15 = r15.i()
            r15.finish()
        L_0x0123:
            long r6 = r6 >> r11
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0132
            float r4 = java.lang.Float.intBitsToFloat(r13)
            goto L_0x0168
        L_0x0132:
            float r4 = r14 / r4
            goto L_0x0168
        L_0x0135:
            androidx.compose.foundation.EdgeEffectWrapper r14 = r0.f2878c
            boolean r14 = r14.x()
            if (r14 == 0) goto L_0x00fc
            float r14 = java.lang.Float.intBitsToFloat(r13)
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00fc
            float r14 = r0.j(r6)
            androidx.compose.foundation.EdgeEffectWrapper r15 = r0.f2878c
            boolean r15 = r15.x()
            if (r15 != 0) goto L_0x015a
            androidx.compose.foundation.EdgeEffectWrapper r15 = r0.f2878c
            android.widget.EdgeEffect r15 = r15.k()
            r15.finish()
        L_0x015a:
            long r6 = r6 >> r11
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0132
            float r4 = java.lang.Float.intBitsToFloat(r13)
        L_0x0168:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r6 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r10)
            long r13 = (long) r4
            long r6 = r6 << r11
            long r13 = r13 & r8
            long r6 = r6 | r13
            long r6 = androidx.compose.ui.geometry.Offset.e(r6)
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.f15855b
            long r13 = r4.c()
            boolean r10 = androidx.compose.ui.geometry.Offset.j(r6, r13)
            if (r10 != 0) goto L_0x0188
            r17.g()
        L_0x0188:
            long r13 = androidx.compose.ui.geometry.Offset.p(r1, r6)
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.d(r13)
            java.lang.Object r3 = r3.invoke(r10)
            androidx.compose.ui.geometry.Offset r3 = (androidx.compose.ui.geometry.Offset) r3
            r15 = r6
            long r5 = r3.t()
            long r8 = androidx.compose.ui.geometry.Offset.p(r13, r5)
            long r1 = r13 >> r11
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x01be
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r13 & r1
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x01bb
            goto L_0x01f8
        L_0x01bb:
            r1 = 32
            goto L_0x01bf
        L_0x01be:
            r1 = r11
        L_0x01bf:
            long r10 = r5 >> r1
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x01db
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r5 & r1
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x01db
            goto L_0x01f8
        L_0x01db:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r0.f2878c
            boolean r2 = r1.u()
            if (r2 != 0) goto L_0x01f5
            boolean r2 = r1.B()
            if (r2 != 0) goto L_0x01f5
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x01f5
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x01f8
        L_0x01f5:
            r17.d()
        L_0x01f8:
            androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion r1 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.f16795b
            int r1 = r1.b()
            r2 = r20
            boolean r1 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.e(r2, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0252
            r1 = 32
            long r10 = r8 >> r1
            int r1 = (int) r10
            float r3 = java.lang.Float.intBitsToFloat(r1)
            r7 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r10 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r3 <= 0) goto L_0x0222
            r0.i(r8)
        L_0x021b:
            r1 = 1
        L_0x021c:
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x0230
        L_0x0222:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x022e
            r0.j(r8)
            goto L_0x021b
        L_0x022e:
            r1 = r2
            goto L_0x021c
        L_0x0230:
            long r11 = r11 & r8
            int r3 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r3)
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x023f
            r0.k(r8)
        L_0x023d:
            r3 = 1
            goto L_0x024c
        L_0x023f:
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x024b
            r0.h(r8)
            goto L_0x023d
        L_0x024b:
            r3 = r2
        L_0x024c:
            if (r1 != 0) goto L_0x0250
            if (r3 == 0) goto L_0x0252
        L_0x0250:
            r1 = 1
            goto L_0x0253
        L_0x0252:
            r1 = r2
        L_0x0253:
            long r3 = r4.c()
            boolean r3 = androidx.compose.ui.geometry.Offset.j(r13, r3)
            if (r3 != 0) goto L_0x0267
            boolean r3 = r17.l(r18)
            if (r3 != 0) goto L_0x0265
            if (r1 == 0) goto L_0x0266
        L_0x0265:
            r2 = 1
        L_0x0266:
            r1 = r2
        L_0x0267:
            if (r1 == 0) goto L_0x026c
            r17.g()
        L_0x026c:
            r1 = r15
            long r1 = androidx.compose.ui.geometry.Offset.q(r1, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.N(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object O(long r12, kotlin.jvm.functions.Function2 r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r12 = r0.D
            java.lang.Object r14 = r0.C
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r14
            kotlin.ResultKt.b(r15)
            goto L_0x013d
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            kotlin.ResultKt.b(r15)
            goto L_0x0058
        L_0x0040:
            kotlin.ResultKt.b(r15)
            long r6 = r11.f2882g
            boolean r15 = androidx.compose.ui.geometry.Size.k(r6)
            if (r15 == 0) goto L_0x005b
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.b(r12)
            r0.G = r4
            java.lang.Object r12 = r14.m(r12, r0)
            if (r12 != r1) goto L_0x0058
            return r1
        L_0x0058:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x005b:
            androidx.compose.foundation.EdgeEffectWrapper r15 = r11.f2878c
            boolean r15 = r15.u()
            r2 = 32
            if (r15 == 0) goto L_0x0088
            float r15 = androidx.compose.ui.unit.Velocity.h(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x0088
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r4 = r11.f2878c
            android.widget.EdgeEffect r4 = r4.i()
            float r6 = androidx.compose.ui.unit.Velocity.h(r12)
            long r7 = r11.f2882g
            long r7 = r7 >> r2
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            androidx.compose.ui.unit.Density r7 = r11.f2876a
            float r15 = r15.a(r4, r6, r2, r7)
            goto L_0x00b6
        L_0x0088:
            androidx.compose.foundation.EdgeEffectWrapper r15 = r11.f2878c
            boolean r15 = r15.x()
            if (r15 == 0) goto L_0x00b5
            float r15 = androidx.compose.ui.unit.Velocity.h(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b5
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r4 = r11.f2878c
            android.widget.EdgeEffect r4 = r4.k()
            float r6 = androidx.compose.ui.unit.Velocity.h(r12)
            float r6 = -r6
            long r7 = r11.f2882g
            long r7 = r7 >> r2
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            androidx.compose.ui.unit.Density r7 = r11.f2876a
            float r15 = r15.a(r4, r6, r2, r7)
            float r15 = -r15
            goto L_0x00b6
        L_0x00b5:
            r15 = r5
        L_0x00b6:
            androidx.compose.foundation.EdgeEffectWrapper r2 = r11.f2878c
            boolean r2 = r2.B()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r2 == 0) goto L_0x00e6
            float r2 = androidx.compose.ui.unit.Velocity.i(r12)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e6
            androidx.compose.foundation.EdgeEffectCompat r2 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r4 = r11.f2878c
            android.widget.EdgeEffect r4 = r4.m()
            float r8 = androidx.compose.ui.unit.Velocity.i(r12)
            long r9 = r11.f2882g
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            androidx.compose.ui.unit.Density r7 = r11.f2876a
            float r2 = r2.a(r4, r8, r6, r7)
            goto L_0x0114
        L_0x00e6:
            androidx.compose.foundation.EdgeEffectWrapper r2 = r11.f2878c
            boolean r2 = r2.r()
            if (r2 == 0) goto L_0x0113
            float r2 = androidx.compose.ui.unit.Velocity.i(r12)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0113
            androidx.compose.foundation.EdgeEffectCompat r2 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r4 = r11.f2878c
            android.widget.EdgeEffect r4 = r4.g()
            float r8 = androidx.compose.ui.unit.Velocity.i(r12)
            float r8 = -r8
            long r9 = r11.f2882g
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            androidx.compose.ui.unit.Density r7 = r11.f2876a
            float r2 = r2.a(r4, r8, r6, r7)
            float r2 = -r2
            goto L_0x0114
        L_0x0113:
            r2 = r5
        L_0x0114:
            long r6 = androidx.compose.ui.unit.VelocityKt.a(r15, r2)
            androidx.compose.ui.unit.Velocity$Companion r15 = androidx.compose.ui.unit.Velocity.f19186b
            long r8 = r15.a()
            boolean r15 = androidx.compose.ui.unit.Velocity.g(r6, r8)
            if (r15 != 0) goto L_0x0127
            r11.g()
        L_0x0127:
            long r12 = androidx.compose.ui.unit.Velocity.k(r12, r6)
            androidx.compose.ui.unit.Velocity r15 = androidx.compose.ui.unit.Velocity.b(r12)
            r0.C = r11
            r0.D = r12
            r0.G = r3
            java.lang.Object r15 = r14.m(r15, r0)
            if (r15 != r1) goto L_0x013c
            return r1
        L_0x013c:
            r14 = r11
        L_0x013d:
            androidx.compose.ui.unit.Velocity r15 = (androidx.compose.ui.unit.Velocity) r15
            long r0 = r15.o()
            long r12 = androidx.compose.ui.unit.Velocity.k(r12, r0)
            r15 = 0
            r14.f2881f = r15
            float r15 = androidx.compose.ui.unit.Velocity.h(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x0166
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r0 = r14.f2878c
            android.widget.EdgeEffect r0 = r0.i()
            float r1 = androidx.compose.ui.unit.Velocity.h(r12)
            int r1 = kotlin.math.MathKt.d(r1)
            r15.d(r0, r1)
            goto L_0x0182
        L_0x0166:
            float r15 = androidx.compose.ui.unit.Velocity.h(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x0182
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r0 = r14.f2878c
            android.widget.EdgeEffect r0 = r0.k()
            float r1 = androidx.compose.ui.unit.Velocity.h(r12)
            int r1 = kotlin.math.MathKt.d(r1)
            int r1 = -r1
            r15.d(r0, r1)
        L_0x0182:
            float r15 = androidx.compose.ui.unit.Velocity.i(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x019e
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r0 = r14.f2878c
            android.widget.EdgeEffect r0 = r0.m()
            float r12 = androidx.compose.ui.unit.Velocity.i(r12)
            int r12 = kotlin.math.MathKt.d(r12)
            r15.d(r0, r12)
            goto L_0x01ba
        L_0x019e:
            float r15 = androidx.compose.ui.unit.Velocity.i(r12)
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ba
            androidx.compose.foundation.EdgeEffectCompat r15 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r0 = r14.f2878c
            android.widget.EdgeEffect r0 = r0.g()
            float r12 = androidx.compose.ui.unit.Velocity.i(r12)
            int r12 = kotlin.math.MathKt.d(r12)
            int r12 = -r12
            r15.d(r0, r12)
        L_0x01ba:
            r14.d()
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.O(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean P() {
        EdgeEffectWrapper edgeEffectWrapper = this.f2878c;
        EdgeEffect d2 = edgeEffectWrapper.f3059d;
        if (d2 != null && EdgeEffectCompat.f3052a.c(d2) != 0.0f) {
            return true;
        }
        EdgeEffect a2 = edgeEffectWrapper.f3060e;
        if (a2 != null && EdgeEffectCompat.f3052a.c(a2) != 0.0f) {
            return true;
        }
        EdgeEffect b2 = edgeEffectWrapper.f3061f;
        if (b2 != null && EdgeEffectCompat.f3052a.c(b2) != 0.0f) {
            return true;
        }
        EdgeEffect c2 = edgeEffectWrapper.f3062g;
        return (c2 == null || EdgeEffectCompat.f3052a.c(c2) == 0.0f) ? false : true;
    }

    public final void d() {
        boolean z2;
        EdgeEffectWrapper edgeEffectWrapper = this.f2878c;
        EdgeEffect d2 = edgeEffectWrapper.f3059d;
        boolean z3 = true;
        if (d2 != null) {
            d2.onRelease();
            z2 = !d2.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect a2 = edgeEffectWrapper.f3060e;
        if (a2 != null) {
            a2.onRelease();
            z2 = !a2.isFinished() || z2;
        }
        EdgeEffect b2 = edgeEffectWrapper.f3061f;
        if (b2 != null) {
            b2.onRelease();
            z2 = !b2.isFinished() || z2;
        }
        EdgeEffect c2 = edgeEffectWrapper.f3062g;
        if (c2 != null) {
            c2.onRelease();
            if (c2.isFinished() && !z2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (z2) {
            g();
        }
    }

    public final long e() {
        long j2 = this.f2877b;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            j2 = SizeKt.b(this.f2882g);
        }
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (this.f2882g & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (this.f2882g >> 32)))) << 32));
    }

    public final MutableState f() {
        return this.f2879d;
    }

    public final void g() {
        if (this.f2880e) {
            this.f2879d.setValue(Unit.f40552a);
        }
    }

    public final float h(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f2882g & 4294967295L));
        EdgeEffect g2 = this.f2878c.g();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f3052a;
        return edgeEffectCompat.c(g2) == 0.0f ? (-edgeEffectCompat.e(g2, -intBitsToFloat2, ((float) 1) - intBitsToFloat)) * Float.intBitsToFloat((int) (this.f2882g & 4294967295L)) : Float.intBitsToFloat(i2);
    }

    public final float i(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f2882g >> 32));
        EdgeEffect i3 = this.f2878c.i();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f3052a;
        return edgeEffectCompat.c(i3) == 0.0f ? edgeEffectCompat.e(i3, intBitsToFloat2, ((float) 1) - intBitsToFloat) * Float.intBitsToFloat((int) (this.f2882g >> 32)) : Float.intBitsToFloat(i2);
    }

    public final float j(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f2882g >> 32));
        EdgeEffect k2 = this.f2878c.k();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f3052a;
        return edgeEffectCompat.c(k2) == 0.0f ? (-edgeEffectCompat.e(k2, -intBitsToFloat2, intBitsToFloat)) * Float.intBitsToFloat((int) (this.f2882g >> 32)) : Float.intBitsToFloat(i2);
    }

    public final float k(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f2882g & 4294967295L));
        EdgeEffect m2 = this.f2878c.m();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f3052a;
        return edgeEffectCompat.c(m2) == 0.0f ? edgeEffectCompat.e(m2, intBitsToFloat2, intBitsToFloat) * Float.intBitsToFloat((int) (this.f2882g & 4294967295L)) : Float.intBitsToFloat(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(long r11) {
        /*
            r10 = this;
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.f2878c
            boolean r0 = r0.s()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x002d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002d
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r5 = r10.f2878c
            android.widget.EdgeEffect r5 = r5.i()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.f(r5, r0)
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.f2878c
            boolean r0 = r0.s()
            goto L_0x002e
        L_0x002d:
            r0 = r3
        L_0x002e:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.f2878c
            boolean r4 = r4.v()
            r5 = 1
            if (r4 == 0) goto L_0x005f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r6 = r10.f2878c
            android.widget.EdgeEffect r6 = r6.k()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.f(r6, r1)
            if (r0 != 0) goto L_0x005e
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.f2878c
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = r3
            goto L_0x005f
        L_0x005e:
            r0 = r5
        L_0x005f:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.f2878c
            boolean r1 = r1.z()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L_0x0094
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0094
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r8 = r10.f2878c
            android.widget.EdgeEffect r8 = r8.m()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.f(r8, r1)
            if (r0 != 0) goto L_0x0093
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.f2878c
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r0 = r3
            goto L_0x0094
        L_0x0093:
            r0 = r5
        L_0x0094:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.f2878c
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x00c1
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c1
            androidx.compose.foundation.EdgeEffectCompat r12 = androidx.compose.foundation.EdgeEffectCompat.f3052a
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.f2878c
            android.widget.EdgeEffect r1 = r1.g()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.f(r1, r11)
            if (r0 != 0) goto L_0x00bf
            androidx.compose.foundation.EdgeEffectWrapper r11 = r10.f2878c
            boolean r11 = r11.p()
            if (r11 == 0) goto L_0x00c0
        L_0x00bf:
            r3 = r5
        L_0x00c0:
            r0 = r3
        L_0x00c1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.l(long):boolean");
    }

    public final void m(long j2) {
        boolean f2 = Size.f(this.f2882g, Size.f15876b.b());
        boolean f3 = Size.f(j2, this.f2882g);
        this.f2882g = j2;
        if (!f3) {
            EdgeEffectWrapper edgeEffectWrapper = this.f2878c;
            int d2 = MathKt.d(Float.intBitsToFloat((int) (j2 >> 32)));
            edgeEffectWrapper.C(IntSize.c((((long) MathKt.d(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) d2) << 32)));
        }
        if (!f2 && !f3) {
            d();
        }
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j2, PaddingValues paddingValues) {
        DelegatableNode delegatableNode;
        this.f2876a = density;
        this.f2877b = Offset.f15855b.b();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.j(j2));
        this.f2878c = edgeEffectWrapper;
        this.f2879d = SnapshotStateKt.i(Unit.f40552a, SnapshotStateKt.k());
        this.f2880e = true;
        this.f2882g = Size.f15876b.b();
        this.f2883h = PointerId.a(-1);
        SuspendingPointerInputModifierNode a2 = SuspendingPointerInputFilterKt.a(new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this));
        this.f2884i = a2;
        if (Build.VERSION.SDK_INT >= 31) {
            delegatableNode = new StretchOverscrollNode(a2, this, edgeEffectWrapper);
        } else {
            delegatableNode = new GlowOverscrollNode(a2, this, edgeEffectWrapper, paddingValues);
        }
        this.f2885j = delegatableNode;
    }
}
