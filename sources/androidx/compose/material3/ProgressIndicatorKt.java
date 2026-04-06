package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.lokalise.sdk.api.Params;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class ProgressIndicatorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10630a = Dp.m((float) 240);

    /* renamed from: b  reason: collision with root package name */
    public static final float f10631b = LinearProgressIndicatorTokens.f13482a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final float f10632c = Dp.m((float) 6);

    /* renamed from: d  reason: collision with root package name */
    public static final float f10633d = CircularProgressIndicatorTokens.f12921a.a();

    /* renamed from: e  reason: collision with root package name */
    public static final CubicBezierEasing f10634e;

    /* renamed from: f  reason: collision with root package name */
    public static final CubicBezierEasing f10635f;

    static {
        MotionTokens motionTokens = MotionTokens.f13556a;
        f10634e = motionTokens.a();
        f10635f = motionTokens.c();
    }

    public static final Unit A(int i2, float f2, Function0 function0, long j2, long j3, Function1 function1, DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L));
        int i3 = i2;
        float m2 = ((StrokeCap.g(i2, StrokeCap.f16130b.a()) || Float.intBitsToFloat((int) (4294967295L & drawScope.c())) > Float.intBitsToFloat((int) (drawScope.c() >> 32))) ? f2 : Dp.m(drawScope2.E(intBitsToFloat) + f2)) / drawScope2.E(Float.intBitsToFloat((int) (drawScope.c() >> 32)));
        float floatValue = ((Number) function0.invoke()).floatValue();
        float min = floatValue + Math.min(floatValue, m2);
        if (min <= 1.0f) {
            F(drawScope, min, 1.0f, j2, intBitsToFloat, i2);
        }
        F(drawScope, 0.0f, floatValue, j3, intBitsToFloat, i2);
        function1.invoke(drawScope);
        return Unit.f40552a;
    }

    public static final Unit B(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.d(Params.Timeout.CONNECT_SHORT);
        keyframesSpecConfig.e(keyframesSpecConfig.f(Float.valueOf(0.87f), 3000), f10635f);
        keyframesSpecConfig.f(Float.valueOf(0.1f), Params.Timeout.CONNECT_SHORT);
        return Unit.f40552a;
    }

    public static final Unit C(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.d(Params.Timeout.CONNECT_SHORT);
        Float valueOf = Float.valueOf(90.0f);
        keyframesSpecConfig.e(keyframesSpecConfig.f(valueOf, 300), MotionTokens.f13556a.b());
        keyframesSpecConfig.f(valueOf, 1500);
        Float valueOf2 = Float.valueOf(180.0f);
        keyframesSpecConfig.f(valueOf2, 1800);
        keyframesSpecConfig.f(valueOf2, 3000);
        Float valueOf3 = Float.valueOf(270.0f);
        keyframesSpecConfig.f(valueOf3, 3300);
        keyframesSpecConfig.f(valueOf3, 4500);
        Float valueOf4 = Float.valueOf(360.0f);
        keyframesSpecConfig.f(valueOf4, 4800);
        keyframesSpecConfig.f(valueOf4, Params.Timeout.CONNECT_SHORT);
        return Unit.f40552a;
    }

    public static final void D(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        float f4 = (float) 2;
        float f5 = stroke.f() / f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32)) - (f4 * f5);
        DrawScope drawScope2 = drawScope;
        long j3 = j2;
        float f6 = f2;
        float f7 = f3;
        DrawScope.a2(drawScope2, j3, f6, f7, false, Offset.e((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32)), Size.d((((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L)), 0.0f, stroke, (ColorFilter) null, 0, 832, (Object) null);
    }

    public static final void E(DrawScope drawScope, float f2, float f3, long j2, Stroke stroke) {
        D(drawScope, f2, f3, j2, stroke);
    }

    public static final void F(DrawScope drawScope, float f2, float f3, long j2, float f4, int i2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L));
        float f5 = (float) 2;
        float f6 = intBitsToFloat2 / f5;
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f7 = (z2 ? f2 : 1.0f - f3) * intBitsToFloat;
        float f8 = (z2 ? f3 : 1.0f - f2) * intBitsToFloat;
        if (StrokeCap.g(i2, StrokeCap.f16130b.a()) || intBitsToFloat2 > intBitsToFloat) {
            DrawScope.j2(drawScope, j2, Offset.e((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), f4, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
            return;
        }
        float f9 = f4 / f5;
        float f10 = intBitsToFloat - f9;
        if (f7 < f9) {
            f7 = f9;
        }
        if (f7 > f10) {
            f7 = f10;
        }
        if (f8 < f9) {
            f8 = f9;
        }
        if (f8 <= f10) {
            f10 = f8;
        }
        if (Math.abs(f3 - f2) > 0.0f) {
            DrawScope.j2(drawScope, j2, Offset.e((((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L)), f4, i2, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 480, (Object) null);
        }
    }

    public static final InfiniteRepeatableSpec G() {
        return AnimationSpecKt.e(AnimationSpecKt.n(Params.Timeout.CONNECT_SHORT, 0, EasingKt.e(), 2, (Object) null), (RepeatMode) null, 0, 6, (Object) null);
    }

    public static final InfiniteRepeatableSpec H() {
        return AnimationSpecKt.e(AnimationSpecKt.f(new C0058b5()), (RepeatMode) null, 0, 6, (Object) null);
    }

    public static final InfiniteRepeatableSpec I() {
        return AnimationSpecKt.e(AnimationSpecKt.f(new C0068c5()), (RepeatMode) null, 0, 6, (Object) null);
    }

    public static final float J() {
        return f10632c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: androidx.compose.material3.g5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: androidx.compose.material3.g5} */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0250, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0252;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(androidx.compose.ui.Modifier r31, long r32, float r34, long r35, int r37, float r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r9 = r40
            r0 = 333154241(0x13db87c1, float:5.5417236E-27)
            r1 = r39
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r41 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r9 | 6
            r4 = r3
            r3 = r31
            goto L_0x0029
        L_0x0015:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r31
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r9
            goto L_0x0029
        L_0x0026:
            r3 = r31
            r4 = r9
        L_0x0029:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0040
            r5 = r41 & 2
            r7 = r32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.j(r7)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r7 = r32
        L_0x0042:
            r5 = r41 & 4
            if (r5 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r11 = r34
            goto L_0x005d
        L_0x004b:
            r11 = r9 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0048
            r11 = r34
            boolean r12 = r1.h(r11)
            if (r12 == 0) goto L_0x005a
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r12
        L_0x005d:
            r12 = r9 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0074
            r12 = r41 & 8
            r14 = r35
            if (r12 != 0) goto L_0x0070
            boolean r12 = r1.j(r14)
            if (r12 == 0) goto L_0x0070
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r4 = r4 | r12
            goto L_0x0076
        L_0x0074:
            r14 = r35
        L_0x0076:
            r12 = r41 & 16
            if (r12 == 0) goto L_0x007f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r13 = r37
            goto L_0x0092
        L_0x007f:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007c
            r13 = r37
            boolean r16 = r1.i(r13)
            if (r16 == 0) goto L_0x008e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r16
        L_0x0092:
            r16 = r41 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x009d
            r4 = r4 | r17
            r10 = r38
            goto L_0x00b0
        L_0x009d:
            r17 = r9 & r17
            r10 = r38
            if (r17 != 0) goto L_0x00b0
            boolean r18 = r1.h(r10)
            if (r18 == 0) goto L_0x00ac
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r4 = r4 | r18
        L_0x00b0:
            r18 = 74899(0x12493, float:1.04956E-40)
            r6 = r4 & r18
            r0 = 74898(0x12492, float:1.04954E-40)
            r3 = 1
            if (r6 == r0) goto L_0x00bd
            r0 = r3
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            r6 = r4 & 1
            boolean r0 = r1.E(r0, r6)
            if (r0 == 0) goto L_0x0283
            r1.p()
            r0 = r9 & 1
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x00d4
            goto L_0x00e7
        L_0x00d4:
            r1.B()
            r0 = r41 & 2
            if (r0 == 0) goto L_0x00dd
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00dd:
            r0 = r41 & 8
            if (r0 == 0) goto L_0x00e3
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00e3:
            r0 = r31
            r5 = r14
            goto L_0x0125
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ee
        L_0x00ec:
            r0 = r31
        L_0x00ee:
            r2 = r41 & 2
            r6 = 6
            if (r2 == 0) goto L_0x00fb
            androidx.compose.material3.ProgressIndicatorDefaults r2 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r7 = r2.c(r1, r6)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00fb:
            if (r5 == 0) goto L_0x0104
            androidx.compose.material3.ProgressIndicatorDefaults r2 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r2 = r2.i()
            r11 = r2
        L_0x0104:
            r2 = r41 & 8
            if (r2 == 0) goto L_0x0112
            androidx.compose.material3.ProgressIndicatorDefaults r2 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r5 = r2.g(r1, r6)
            r2 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r2
            goto L_0x0113
        L_0x0112:
            r5 = r14
        L_0x0113:
            if (r12 == 0) goto L_0x011c
            androidx.compose.material3.ProgressIndicatorDefaults r2 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r2 = r2.f()
            r13 = r2
        L_0x011c:
            if (r16 == 0) goto L_0x0125
            androidx.compose.material3.ProgressIndicatorDefaults r2 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r2 = r2.h()
            r10 = r2
        L_0x0125:
            r1.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0137
            r2 = -1
            java.lang.String r12 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)"
            r14 = 333154241(0x13db87c1, float:5.5417236E-27)
            androidx.compose.runtime.ComposerKt.Y(r14, r4, r2, r12)
        L_0x0137:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r1.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.ui.graphics.drawscope.Stroke r12 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r2 = r2.B1(r11)
            r14 = 26
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r31 = r12
            r32 = r2
            r33 = r16
            r34 = r13
            r35 = r18
            r36 = r19
            r37 = r14
            r38 = r15
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            r2 = 0
            r14 = 0
            androidx.compose.animation.core.InfiniteTransition r2 = androidx.compose.animation.core.InfiniteTransitionKt.c(r2, r1, r14, r3)
            androidx.compose.animation.core.InfiniteRepeatableSpec r14 = G()
            int r15 = androidx.compose.animation.core.InfiniteTransition.f2584f
            r3 = r15 | 432(0x1b0, float:6.05E-43)
            int r18 = androidx.compose.animation.core.InfiniteRepeatableSpec.f2580d
            int r19 = r18 << 9
            r3 = r3 | r19
            r19 = 8
            r20 = 0
            r21 = 1149698048(0x44870000, float:1080.0)
            r22 = 0
            r31 = r2
            r32 = r20
            r33 = r21
            r34 = r14
            r35 = r22
            r36 = r1
            r37 = r3
            r38 = r19
            androidx.compose.runtime.State r3 = androidx.compose.animation.core.InfiniteTransitionKt.a(r31, r32, r33, r34, r35, r36, r37, r38)
            androidx.compose.animation.core.InfiniteRepeatableSpec r14 = I()
            r9 = r15 | 432(0x1b0, float:6.05E-43)
            int r19 = r18 << 9
            r9 = r9 | r19
            r19 = 8
            r21 = 1135869952(0x43b40000, float:360.0)
            r33 = r21
            r34 = r14
            r37 = r9
            r38 = r19
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.InfiniteTransitionKt.a(r31, r32, r33, r34, r35, r36, r37, r38)
            androidx.compose.animation.core.InfiniteRepeatableSpec r14 = H()
            r15 = r15 | 432(0x1b0, float:6.05E-43)
            int r18 = r18 << 9
            r15 = r15 | r18
            r18 = 8
            r19 = 1036831949(0x3dcccccd, float:0.1)
            r20 = 1063172178(0x3f5eb852, float:0.87)
            r21 = 0
            r32 = r19
            r33 = r20
            r34 = r14
            r35 = r21
            r37 = r15
            r38 = r18
            androidx.compose.runtime.State r2 = androidx.compose.animation.core.InfiniteTransitionKt.a(r31, r32, r33, r34, r35, r36, r37, r38)
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.ProgressSemanticsKt.a(r0)
            float r15 = f10633d
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.t(r14, r15)
            boolean r15 = r1.W(r2)
            r18 = 57344(0xe000, float:8.0356E-41)
            r31 = r0
            r0 = r4 & r18
            r32 = r14
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r14) goto L_0x01ee
            r14 = 1
            goto L_0x01ef
        L_0x01ee:
            r14 = 0
        L_0x01ef:
            r0 = r15 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r4
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r15) goto L_0x01fa
            r14 = 1
            goto L_0x01fb
        L_0x01fa:
            r14 = 0
        L_0x01fb:
            r0 = r0 | r14
            r14 = r4 & 896(0x380, float:1.256E-42)
            r15 = 256(0x100, float:3.59E-43)
            if (r14 != r15) goto L_0x0204
            r14 = 1
            goto L_0x0205
        L_0x0204:
            r14 = 0
        L_0x0205:
            r0 = r0 | r14
            boolean r14 = r1.W(r3)
            r0 = r0 | r14
            boolean r14 = r1.W(r9)
            r0 = r0 | r14
            r14 = r4 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r14 <= r15) goto L_0x021e
            boolean r14 = r1.j(r5)
            if (r14 != 0) goto L_0x0222
        L_0x021e:
            r14 = r4 & 3072(0xc00, float:4.305E-42)
            if (r14 != r15) goto L_0x0224
        L_0x0222:
            r14 = 1
            goto L_0x0225
        L_0x0224:
            r14 = 0
        L_0x0225:
            r0 = r0 | r14
            boolean r14 = r1.l(r12)
            r0 = r0 | r14
            r14 = r4 & 112(0x70, float:1.57E-43)
            r14 = r14 ^ 48
            r15 = 32
            if (r14 <= r15) goto L_0x0239
            boolean r14 = r1.j(r7)
            if (r14 != 0) goto L_0x023d
        L_0x0239:
            r4 = r4 & 48
            if (r4 != r15) goto L_0x0240
        L_0x023d:
            r16 = 1
            goto L_0x0242
        L_0x0240:
            r16 = 0
        L_0x0242:
            r0 = r0 | r16
            java.lang.Object r4 = r1.g()
            if (r0 != 0) goto L_0x0252
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x026e
        L_0x0252:
            androidx.compose.material3.g5 r4 = new androidx.compose.material3.g5
            r19 = r4
            r20 = r2
            r21 = r13
            r22 = r10
            r23 = r11
            r24 = r3
            r25 = r9
            r26 = r5
            r28 = r12
            r29 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r28, r29)
            r1.N(r4)
        L_0x026e:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r2 = r32
            r0 = 0
            androidx.compose.foundation.CanvasKt.b(r2, r4, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x027f
            androidx.compose.runtime.ComposerKt.X()
        L_0x027f:
            r2 = r31
            r4 = r11
            goto L_0x028a
        L_0x0283:
            r1.B()
            r2 = r31
            r4 = r11
            r5 = r14
        L_0x028a:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x02a1
            androidx.compose.material3.h5 r12 = new androidx.compose.material3.h5
            r0 = r12
            r1 = r2
            r2 = r7
            r7 = r13
            r8 = r10
            r9 = r40
            r10 = r41
            r0.<init>(r1, r2, r4, r5, r7, r8, r9, r10)
            r11.a(r12)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.n(androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: androidx.compose.material3.e5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: androidx.compose.material3.e5} */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0231, code lost:
        if (r1 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0233;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(kotlin.jvm.functions.Function0 r33, androidx.compose.ui.Modifier r34, long r35, float r37, long r38, int r40, float r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            r1 = r33
            r10 = r43
            r0 = -1798883595(0xffffffff94c736f5, float:-2.0115542E-26)
            r2 = r42
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r44 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r10
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r5 = r44 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r34
            goto L_0x003f
        L_0x002d:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r34
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0056
            r7 = r44 & 4
            r11 = r35
            if (r7 != 0) goto L_0x0052
            boolean r7 = r2.j(r11)
            if (r7 == 0) goto L_0x0052
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r7
            goto L_0x0058
        L_0x0056:
            r11 = r35
        L_0x0058:
            r7 = r44 & 8
            if (r7 == 0) goto L_0x0061
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x005e:
            r13 = r37
            goto L_0x0073
        L_0x0061:
            r13 = r10 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x005e
            r13 = r37
            boolean r14 = r2.h(r13)
            if (r14 == 0) goto L_0x0070
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r14
        L_0x0073:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x008b
            r14 = r44 & 16
            r8 = r38
            if (r14 != 0) goto L_0x0086
            boolean r16 = r2.j(r8)
            if (r16 == 0) goto L_0x0086
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0088
        L_0x0086:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0088:
            r3 = r3 | r16
            goto L_0x008d
        L_0x008b:
            r8 = r38
        L_0x008d:
            r16 = r44 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x0098
            r3 = r3 | r17
            r15 = r40
            goto L_0x00ab
        L_0x0098:
            r17 = r10 & r17
            r15 = r40
            if (r17 != 0) goto L_0x00ab
            boolean r18 = r2.i(r15)
            if (r18 == 0) goto L_0x00a7
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r18
        L_0x00ab:
            r18 = r44 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00b6
            r3 = r3 | r19
            r14 = r41
            goto L_0x00c9
        L_0x00b6:
            r19 = r10 & r19
            r14 = r41
            if (r19 != 0) goto L_0x00c9
            boolean r20 = r2.h(r14)
            if (r20 == 0) goto L_0x00c5
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r3 = r3 | r20
        L_0x00c9:
            r20 = 599187(0x92493, float:8.3964E-40)
            r4 = r3 & r20
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r4 == r0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r4 = r3 & 1
            boolean r0 = r2.E(r0, r4)
            if (r0 == 0) goto L_0x025e
            r2.p()
            r0 = r10 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0103
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x00ef
            goto L_0x0103
        L_0x00ef:
            r2.B()
            r0 = r44 & 4
            if (r0 == 0) goto L_0x00f8
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f8:
            r0 = r44 & 16
            if (r0 == 0) goto L_0x00fd
            r3 = r3 & r4
        L_0x00fd:
            r0 = r34
            r6 = r8
            r5 = r13
            r4 = r15
            goto L_0x0141
        L_0x0103:
            if (r5 == 0) goto L_0x0108
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010a
        L_0x0108:
            r0 = r34
        L_0x010a:
            r5 = r44 & 4
            r6 = 6
            if (r5 == 0) goto L_0x0117
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r11 = r5.c(r2, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0117:
            if (r7 == 0) goto L_0x0120
            androidx.compose.material3.ProgressIndicatorDefaults r5 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r5 = r5.i()
            goto L_0x0121
        L_0x0120:
            r5 = r13
        L_0x0121:
            r7 = r44 & 16
            if (r7 == 0) goto L_0x012d
            androidx.compose.material3.ProgressIndicatorDefaults r7 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r6 = r7.e(r2, r6)
            r3 = r3 & r4
            goto L_0x012e
        L_0x012d:
            r6 = r8
        L_0x012e:
            if (r16 == 0) goto L_0x0137
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r4 = r4.d()
            goto L_0x0138
        L_0x0137:
            r4 = r15
        L_0x0138:
            if (r18 == 0) goto L_0x0141
            androidx.compose.material3.ProgressIndicatorDefaults r8 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r8 = r8.h()
            r14 = r8
        L_0x0141:
            r2.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0153
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)"
            r13 = -1798883595(0xffffffff94c736f5, float:-2.0115542E-26)
            androidx.compose.runtime.ComposerKt.Y(r13, r3, r8, r9)
        L_0x0153:
            r8 = r3 & 14
            r9 = 4
            if (r8 != r9) goto L_0x015a
            r8 = 1
            goto L_0x015b
        L_0x015a:
            r8 = 0
        L_0x015b:
            java.lang.Object r9 = r2.g()
            if (r8 != 0) goto L_0x0169
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x0171
        L_0x0169:
            androidx.compose.material3.Z4 r9 = new androidx.compose.material3.Z4
            r9.<init>(r1)
            r2.N(r9)
        L_0x0171:
            r8 = r9
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r9 = r2.C(r9)
            androidx.compose.ui.unit.Density r9 = (androidx.compose.ui.unit.Density) r9
            androidx.compose.ui.graphics.drawscope.Stroke r13 = new androidx.compose.ui.graphics.drawscope.Stroke
            float r9 = r9.B1(r5)
            r15 = 26
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r34 = r13
            r35 = r9
            r36 = r18
            r37 = r4
            r38 = r20
            r39 = r21
            r40 = r15
            r41 = r16
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)
            boolean r9 = r2.W(r8)
            java.lang.Object r15 = r2.g()
            if (r9 != 0) goto L_0x01b3
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x01bb
        L_0x01b3:
            androidx.compose.material3.d5 r15 = new androidx.compose.material3.d5
            r15.<init>(r8)
            r2.N(r15)
        L_0x01bb:
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r9 = 1
            androidx.compose.ui.Modifier r15 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r0, r9, r15)
            float r9 = f10633d
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.SizeKt.t(r15, r9)
            boolean r15 = r2.W(r8)
            r16 = 458752(0x70000, float:6.42848E-40)
            r18 = r0
            r0 = r3 & r16
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x01d8
            r0 = 1
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            r0 = r0 | r15
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != r15) goto L_0x01e3
            r1 = 1
            goto L_0x01e4
        L_0x01e3:
            r1 = 0
        L_0x01e4:
            r0 = r0 | r1
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r15 = 2048(0x800, float:2.87E-42)
            if (r1 != r15) goto L_0x01ed
            r1 = 1
            goto L_0x01ee
        L_0x01ed:
            r1 = 0
        L_0x01ee:
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r1 = r1 ^ 24576(0x6000, float:3.4438E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r1 <= r15) goto L_0x01ff
            boolean r1 = r2.j(r6)
            if (r1 != 0) goto L_0x0203
        L_0x01ff:
            r1 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r1 != r15) goto L_0x0205
        L_0x0203:
            r1 = 1
            goto L_0x0206
        L_0x0205:
            r1 = 0
        L_0x0206:
            r0 = r0 | r1
            boolean r1 = r2.l(r13)
            r0 = r0 | r1
            r1 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r1 <= r15) goto L_0x021a
            boolean r1 = r2.j(r11)
            if (r1 != 0) goto L_0x021e
        L_0x021a:
            r1 = r3 & 384(0x180, float:5.38E-43)
            if (r1 != r15) goto L_0x0221
        L_0x021e:
            r22 = 1
            goto L_0x0223
        L_0x0221:
            r22 = 0
        L_0x0223:
            r0 = r0 | r22
            java.lang.Object r1 = r2.g()
            if (r0 != 0) goto L_0x0233
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x024b
        L_0x0233:
            androidx.compose.material3.e5 r1 = new androidx.compose.material3.e5
            r23 = r1
            r24 = r8
            r25 = r4
            r26 = r14
            r27 = r5
            r28 = r6
            r30 = r13
            r31 = r11
            r23.<init>(r24, r25, r26, r27, r28, r30, r31)
            r2.N(r1)
        L_0x024b:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 0
            androidx.compose.foundation.CanvasKt.b(r9, r1, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x025a
            androidx.compose.runtime.ComposerKt.X()
        L_0x025a:
            r8 = r4
            r3 = r11
            r9 = r14
            goto L_0x0268
        L_0x025e:
            r2.B()
            r18 = r34
            r6 = r8
            r3 = r11
            r5 = r13
            r9 = r14
            r8 = r15
        L_0x0268:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x027f
            androidx.compose.material3.f5 r13 = new androidx.compose.material3.f5
            r0 = r13
            r1 = r33
            r2 = r18
            r10 = r43
            r11 = r44
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r10, r11)
            r12.a(r13)
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.o(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, float, long, int, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: finally extract failed */
    public static final Unit p(State state, int i2, float f2, float f3, State state2, State state3, long j2, Stroke stroke, long j3, DrawScope drawScope) {
        float floatValue = ((Number) state.getValue()).floatValue() * 360.0f;
        int i3 = i2;
        float m2 = (((StrokeCap.g(i2, StrokeCap.f16130b.a()) || Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) > Float.intBitsToFloat((int) (drawScope.c() >> 32))) ? f2 : Dp.m(f2 + f3)) / ((float) (((double) drawScope.E(Float.intBitsToFloat((int) (drawScope.c() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float floatValue2 = ((Number) state2.getValue()).floatValue() + ((Number) state3.getValue()).floatValue();
        long T1 = drawScope.T1();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().i(floatValue2, T1);
            D(drawScope, Math.min(floatValue, m2) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, m2) * ((float) 2)), j2, stroke);
            E(drawScope, 0.0f, floatValue, j3, stroke);
            G1.j().t();
            G1.f(c2);
            return Unit.f40552a;
        } catch (Throwable th) {
            G1.j().t();
            G1.f(c2);
            throw th;
        }
    }

    public static final Unit q(Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4, Composer composer, int i5) {
        n(modifier, j2, f2, j3, i2, f3, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    public static final float r(Function0 function0) {
        float floatValue = ((Number) function0.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    public static final Unit s(Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = function0.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f2 = (Float) invoke;
        SemanticsPropertiesKt.r0(semanticsPropertyReceiver, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, RangesKt.b(0.0f, 1.0f), 0, 4, (DefaultConstructorMarker) null));
        return Unit.f40552a;
    }

    public static final Unit t(Function0 function0, int i2, float f2, float f3, long j2, Stroke stroke, long j3, DrawScope drawScope) {
        float floatValue = ((Number) function0.invoke()).floatValue() * 360.0f;
        int i3 = i2;
        float m2 = (((StrokeCap.g(i2, StrokeCap.f16130b.a()) || Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) > Float.intBitsToFloat((int) (drawScope.c() >> 32))) ? f2 : Dp.m(f2 + f3)) / ((float) (((double) drawScope.E(Float.intBitsToFloat((int) (drawScope.c() >> 32)))) * 3.141592653589793d))) * 360.0f;
        D(drawScope, Math.min(floatValue, m2) + 270.0f + floatValue, (360.0f - floatValue) - (Math.min(floatValue, m2) * ((float) 2)), j2, stroke);
        E(drawScope, 270.0f, floatValue, j3, stroke);
        return Unit.f40552a;
    }

    public static final Unit u(Function0 function0, Modifier modifier, long j2, float f2, long j3, int i2, float f3, int i3, int i4, Composer composer, int i5) {
        o(function0, modifier, j2, f2, j3, i2, f3, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: androidx.compose.material3.l5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: androidx.compose.material3.l5} */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x024e, code lost:
        if (r3 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0250;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, long r32, long r34, int r36, float r37, kotlin.jvm.functions.Function1 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r1 = r30
            r10 = r40
            r0 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            r2 = r39
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r41 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r10
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r31
            goto L_0x003f
        L_0x002d:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r31
            boolean r7 = r2.W(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0056
            r7 = r41 & 4
            r11 = r32
            if (r7 != 0) goto L_0x0052
            boolean r7 = r2.j(r11)
            if (r7 == 0) goto L_0x0052
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r7
            goto L_0x0058
        L_0x0056:
            r11 = r32
        L_0x0058:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006f
            r7 = r41 & 8
            r13 = r34
            if (r7 != 0) goto L_0x006b
            boolean r7 = r2.j(r13)
            if (r7 == 0) goto L_0x006b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r7
            goto L_0x0071
        L_0x006f:
            r13 = r34
        L_0x0071:
            r7 = r41 & 16
            if (r7 == 0) goto L_0x007a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0077:
            r9 = r36
            goto L_0x008d
        L_0x007a:
            r9 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0077
            r9 = r36
            boolean r16 = r2.i(r9)
            if (r16 == 0) goto L_0x0089
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r3 = r3 | r16
        L_0x008d:
            r16 = r41 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x0098
            r3 = r3 | r17
            r4 = r37
            goto L_0x00ab
        L_0x0098:
            r17 = r10 & r17
            r4 = r37
            if (r17 != 0) goto L_0x00ab
            boolean r18 = r2.h(r4)
            if (r18 == 0) goto L_0x00a7
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r18
        L_0x00ab:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r19 = r10 & r18
            if (r19 != 0) goto L_0x00c5
            r19 = r41 & 64
            r0 = r38
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r2.l(r0)
            if (r20 == 0) goto L_0x00c0
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c2
        L_0x00c0:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00c2:
            r3 = r3 | r20
            goto L_0x00c7
        L_0x00c5:
            r0 = r38
        L_0x00c7:
            r20 = 599187(0x92493, float:8.3964E-40)
            r15 = r3 & r20
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r15 == r8) goto L_0x00d3
            r8 = 1
            goto L_0x00d4
        L_0x00d3:
            r8 = 0
        L_0x00d4:
            r15 = r3 & 1
            boolean r8 = r2.E(r8, r15)
            if (r8 == 0) goto L_0x027a
            r2.p()
            r8 = r10 & 1
            if (r8 == 0) goto L_0x0107
            boolean r8 = r2.J()
            if (r8 == 0) goto L_0x00ea
            goto L_0x0107
        L_0x00ea:
            r2.B()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00f3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f3:
            r5 = r41 & 8
            if (r5 == 0) goto L_0x00f9
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f9:
            r5 = r41 & 64
            if (r5 == 0) goto L_0x0101
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r5
        L_0x0101:
            r7 = r38
            r5 = r6
            r6 = r9
            goto L_0x017d
        L_0x0107:
            if (r5 == 0) goto L_0x010c
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010d
        L_0x010c:
            r5 = r6
        L_0x010d:
            r6 = r41 & 4
            r8 = 6
            if (r6 == 0) goto L_0x011a
            androidx.compose.material3.ProgressIndicatorDefaults r6 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r11 = r6.j(r2, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x011a:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x0126
            androidx.compose.material3.ProgressIndicatorDefaults r6 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            long r13 = r6.m(r2, r8)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0126:
            if (r7 == 0) goto L_0x012f
            androidx.compose.material3.ProgressIndicatorDefaults r6 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            int r6 = r6.l()
            goto L_0x0130
        L_0x012f:
            r6 = r9
        L_0x0130:
            if (r16 == 0) goto L_0x0138
            androidx.compose.material3.ProgressIndicatorDefaults r4 = androidx.compose.material3.ProgressIndicatorDefaults.f10620a
            float r4 = r4.k()
        L_0x0138:
            r7 = r41 & 64
            if (r7 == 0) goto L_0x017b
            r7 = r3 & 896(0x380, float:1.256E-42)
            r7 = r7 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x014a
            boolean r7 = r2.j(r11)
            if (r7 != 0) goto L_0x014e
        L_0x014a:
            r7 = r3 & 384(0x180, float:5.38E-43)
            if (r7 != r8) goto L_0x0150
        L_0x014e:
            r7 = 1
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r3
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 != r9) goto L_0x015b
            r8 = 1
            goto L_0x015c
        L_0x015b:
            r8 = 0
        L_0x015c:
            r7 = r7 | r8
            java.lang.Object r8 = r2.g()
            if (r7 != 0) goto L_0x016b
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0173
        L_0x016b:
            androidx.compose.material3.i5 r8 = new androidx.compose.material3.i5
            r8.<init>(r11, r6)
            r2.N(r8)
        L_0x0173:
            r7 = r8
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r8
            goto L_0x017d
        L_0x017b:
            r7 = r38
        L_0x017d:
            r2.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x018f
            r8 = -1
            java.lang.String r9 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)"
            r15 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            androidx.compose.runtime.ComposerKt.Y(r15, r3, r8, r9)
        L_0x018f:
            r8 = r3 & 14
            r9 = 4
            if (r8 != r9) goto L_0x0196
            r8 = 1
            goto L_0x0197
        L_0x0196:
            r8 = 0
        L_0x0197:
            java.lang.Object r9 = r2.g()
            if (r8 != 0) goto L_0x01a5
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x01ad
        L_0x01a5:
            androidx.compose.material3.j5 r9 = new androidx.compose.material3.j5
            r9.<init>(r1)
            r2.N(r9)
        L_0x01ad:
            r8 = r9
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            androidx.compose.ui.Modifier r9 = androidx.compose.material3.internal.AccessibilityUtilKt.m()
            androidx.compose.ui.Modifier r9 = r5.o0(r9)
            boolean r15 = r2.W(r8)
            java.lang.Object r0 = r2.g()
            if (r15 != 0) goto L_0x01ca
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r15.a()
            if (r0 != r15) goto L_0x01d2
        L_0x01ca:
            androidx.compose.material3.k5 r0 = new androidx.compose.material3.k5
            r0.<init>(r8)
            r2.N(r0)
        L_0x01d2:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r15 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r9, r15, r0)
            float r9 = f10630a
            float r15 = f10631b
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.v(r0, r9, r15)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r15) goto L_0x01eb
            r9 = 1
            goto L_0x01ec
        L_0x01eb:
            r9 = 0
        L_0x01ec:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r3
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r15 != r1) goto L_0x01f5
            r1 = 1
            goto L_0x01f6
        L_0x01f5:
            r1 = 0
        L_0x01f6:
            r1 = r1 | r9
            boolean r9 = r2.W(r8)
            r1 = r1 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r9 <= r15) goto L_0x020a
            boolean r9 = r2.j(r13)
            if (r9 != 0) goto L_0x020e
        L_0x020a:
            r9 = r3 & 3072(0xc00, float:4.305E-42)
            if (r9 != r15) goto L_0x0210
        L_0x020e:
            r9 = 1
            goto L_0x0211
        L_0x0210:
            r9 = 0
        L_0x0211:
            r1 = r1 | r9
            r9 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r9 <= r15) goto L_0x0220
            boolean r9 = r2.j(r11)
            if (r9 != 0) goto L_0x0224
        L_0x0220:
            r9 = r3 & 384(0x180, float:5.38E-43)
            if (r9 != r15) goto L_0x0226
        L_0x0224:
            r9 = 1
            goto L_0x0227
        L_0x0226:
            r9 = 0
        L_0x0227:
            r1 = r1 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r3
            r9 = r9 ^ r18
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r9 <= r15) goto L_0x0237
            boolean r9 = r2.W(r7)
            if (r9 != 0) goto L_0x023b
        L_0x0237:
            r3 = r3 & r18
            if (r3 != r15) goto L_0x023e
        L_0x023b:
            r16 = 1
            goto L_0x0240
        L_0x023e:
            r16 = 0
        L_0x0240:
            r1 = r1 | r16
            java.lang.Object r3 = r2.g()
            if (r1 != 0) goto L_0x0250
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0266
        L_0x0250:
            androidx.compose.material3.l5 r3 = new androidx.compose.material3.l5
            r21 = r3
            r22 = r6
            r23 = r4
            r24 = r8
            r25 = r13
            r27 = r11
            r29 = r7
            r21.<init>(r22, r23, r24, r25, r27, r29)
            r2.N(r3)
        L_0x0266:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r1 = 0
            androidx.compose.foundation.CanvasKt.b(r0, r3, r2, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0275
            androidx.compose.runtime.ComposerKt.X()
        L_0x0275:
            r8 = r4
            r9 = r7
            r3 = r11
            r7 = r6
            goto L_0x0283
        L_0x027a:
            r2.B()
            r8 = r4
            r5 = r6
            r7 = r9
            r3 = r11
            r9 = r38
        L_0x0283:
            androidx.compose.runtime.ScopeUpdateScope r12 = r2.x()
            if (r12 == 0) goto L_0x029a
            androidx.compose.material3.a5 r15 = new androidx.compose.material3.a5
            r0 = r15
            r1 = r30
            r2 = r5
            r5 = r13
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r15)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ProgressIndicatorKt.v(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, long, long, int, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit w(Function0 function0, Modifier modifier, long j2, long j3, int i2, float f2, Function1 function1, int i3, int i4, Composer composer, int i5) {
        v(function0, modifier, j2, j3, i2, f2, function1, composer, RecomposeScopeImplKt.a(i3 | 1), i4);
        return Unit.f40552a;
    }

    public static final Unit x(long j2, int i2, DrawScope drawScope) {
        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.f10620a;
        progressIndicatorDefaults.a(drawScope, progressIndicatorDefaults.n(), j2, i2);
        return Unit.f40552a;
    }

    public static final float y(Function0 function0) {
        float floatValue = ((Number) function0.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    public static final Unit z(Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = function0.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f2 = (Float) invoke;
        SemanticsPropertiesKt.r0(semanticsPropertyReceiver, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, RangesKt.b(0.0f, 1.0f), 0, 4, (DefaultConstructorMarker) null));
        return Unit.f40552a;
    }
}
