package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SliderDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SliderDefaults f11057a = new SliderDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11058b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11059c;

    /* renamed from: d  reason: collision with root package name */
    public static final Path f11060d = AndroidPath_androidKt.a();

    static {
        SliderTokens sliderTokens = SliderTokens.f14009a;
        f11058b = sliderTokens.o();
        f11059c = sliderTokens.o();
    }

    public static final Unit A(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit B(float f2, SliderState sliderState, long j2, long j3, long j4, long j5, float f3, float f4, Function2 function2, Function3 function3, boolean z2, boolean z3, DrawScope drawScope) {
        float B1;
        float f5 = f2;
        DrawScope drawScope2 = drawScope;
        if (Dp.o(f5, Dp.f19144A.c())) {
            B1 = (sliderState.j() == Orientation.Vertical ? Float.intBitsToFloat((int) (drawScope.c() >> 32)) : Float.intBitsToFloat((int) (drawScope.c() & 4294967295L))) / ((float) 2);
        } else {
            B1 = drawScope2.B1(f5);
        }
        f11057a.P(drawScope, sliderState.q(), 0.0f, sliderState.h(), j2, j3, j4, j5, drawScope2.D(0), drawScope2.D(0), drawScope2.D(sliderState.p()), drawScope2.D(sliderState.o()), f3, f4, drawScope2.E(B1), function2, function3, false, z2, sliderState.j(), z3);
        return Unit.f40552a;
    }

    public static final Unit C(SliderDefaults sliderDefaults, SliderState sliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, boolean z3, boolean z4, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.x(sliderState, f2, modifier, z2, sliderColors, function2, function3, f3, f4, z3, z4, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final MeasureResult D(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable c0 = measurable.c0(constraints.r());
        return measureScope.y0(c0.L0(), c0.C0(), MapsKt.f(TuplesKt.a(SliderKt.o(), Integer.valueOf(c0.C0() / 2))), new C0099f6(c0));
    }

    public static final Unit E(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit F(float f2, RangeSliderState rangeSliderState, long j2, long j3, long j4, long j5, float f3, float f4, Function2 function2, Function3 function3, DrawScope drawScope) {
        float f5 = f2;
        DrawScope drawScope2 = drawScope;
        Q(f11057a, drawScope, rangeSliderState.q(), rangeSliderState.f(), rangeSliderState.e(), j2, j3, j4, j5, drawScope2.E(rangeSliderState.o()), drawScope2.E(rangeSliderState.n()), drawScope2.E(rangeSliderState.h()), drawScope2.E(rangeSliderState.g()), f3, f4, drawScope2.E(Dp.o(f5, Dp.f19144A.c()) ? Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) / ((float) 2) : drawScope2.B1(f5)), function2, function3, true, false, (Orientation) null, false, 917504, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit G(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, int i2, Composer composer, int i3) {
        sliderDefaults.y(rangeSliderState, f2, modifier, z2, sliderColors, function2, function3, f3, f4, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit H(SliderColors sliderColors, boolean z2, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = f11057a;
        long c2 = sliderColors.c(z2, true);
        DrawScope drawScope2 = drawScope;
        sliderDefaults.O(drawScope2, offset.t(), f11058b, c2);
        return Unit.f40552a;
    }

    public static final Unit I(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.v(sliderState, modifier, z2, sliderColors, function2, function3, f2, f3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit J(SliderColors sliderColors, boolean z2, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = f11057a;
        long c2 = sliderColors.c(z2, true);
        DrawScope drawScope2 = drawScope;
        sliderDefaults.O(drawScope2, offset.t(), f11058b, c2);
        return Unit.f40552a;
    }

    public static final Unit K(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.u(rangeSliderState, modifier, z2, sliderColors, function2, function3, f2, f3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit L(SliderColors sliderColors, boolean z2, DrawScope drawScope, Offset offset) {
        SliderDefaults sliderDefaults = f11057a;
        long c2 = sliderColors.c(z2, true);
        DrawScope drawScope2 = drawScope;
        sliderDefaults.O(drawScope2, offset.t(), f11058b, c2);
        return Unit.f40552a;
    }

    public static final Unit M(SliderDefaults sliderDefaults, SliderState sliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.w(sliderState, f2, modifier, z2, sliderColors, function2, function3, f3, f4, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static /* synthetic */ void Q(SliderDefaults sliderDefaults, DrawScope drawScope, float[] fArr, float f2, float f3, long j2, long j3, long j4, long j5, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Function2 function2, Function3 function3, boolean z2, boolean z3, Orientation orientation, boolean z4, int i2, Object obj) {
        sliderDefaults.P(drawScope, fArr, f2, f3, j2, j3, j4, j5, f4, f5, f6, f7, f8, f9, f10, function2, function3, z2, (i2 & 131072) != 0 ? false : z3, (i2 & 262144) != 0 ? Orientation.Horizontal : orientation, (i2 & 524288) != 0 ? false : z4);
    }

    public static final Unit s(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.q(mutableInteractionSource, modifier, sliderColors, z2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit t(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, int i2, int i3, Composer composer, int i4) {
        sliderDefaults.r(mutableInteractionSource, sliderState, modifier, sliderColors, z2, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final MeasureResult z(float f2, SliderState sliderState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable c0 = measurable.c0(constraints.r());
        return measureScope.y0(c0.L0(), c0.C0(), MapsKt.f(TuplesKt.a(SliderKt.o(), Integer.valueOf(Dp.o(f2, Dp.f19144A.c()) ? sliderState.j() == Orientation.Vertical ? c0.L0() / 2 : c0.C0() / 2 : measureScope.P1(f2)))), new C0108g6(c0));
    }

    public final SliderColors N(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1376295968, i2, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1107)");
        }
        SliderColors S = S(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return S;
    }

    public final void O(DrawScope drawScope, long j2, float f2, long j3) {
        DrawScope.k2(drawScope, j3, drawScope.B1(f2) / 2.0f, j2, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0269, code lost:
        if ((r12.length == 0) == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0128, code lost:
        if ((r12.length == 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0500  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(androidx.compose.ui.graphics.drawscope.DrawScope r33, float[] r34, float r35, float r36, long r37, long r39, long r41, long r43, float r45, float r46, float r47, float r48, float r49, float r50, float r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function3 r53, boolean r54, boolean r55, androidx.compose.foundation.gestures.Orientation r56, boolean r57) {
        /*
            r32 = this;
            r11 = r33
            r12 = r34
            r0 = r35
            r1 = r36
            r2 = r49
            r13 = r52
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.Vertical
            r14 = 0
            r10 = r56
            if (r10 != r3) goto L_0x0016
            r16 = 1
            goto L_0x0018
        L_0x0016:
            r16 = r14
        L_0x0018:
            androidx.compose.ui.unit.LayoutDirection r3 = r33.getLayoutDirection()
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r3 != r4) goto L_0x0023
            r17 = 1
            goto L_0x0025
        L_0x0023:
            r17 = r14
        L_0x0025:
            if (r17 == 0) goto L_0x002e
            if (r16 != 0) goto L_0x002e
            r3 = r51
            r18 = 1
            goto L_0x0032
        L_0x002e:
            r3 = r51
            r18 = r14
        L_0x0032:
            float r19 = r11.B1(r3)
            r20 = 32
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r33.c()
            if (r16 == 0) goto L_0x004d
            long r3 = r3 & r21
        L_0x0045:
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r23 = r3
            goto L_0x0050
        L_0x004d:
            long r3 = r3 >> r20
            goto L_0x0045
        L_0x0050:
            java.lang.Float r3 = kotlin.collections.ArraysKt.f0(r34)
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r0, r3)
            if (r3 != 0) goto L_0x0067
            java.lang.Float r3 = kotlin.collections.ArraysKt.L0(r34)
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r0, r3)
            if (r3 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r3 = r14
            goto L_0x0068
        L_0x0067:
            r3 = 1
        L_0x0068:
            java.lang.Float r4 = kotlin.collections.ArraysKt.f0(r34)
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r1, r4)
            if (r4 != 0) goto L_0x007f
            java.lang.Float r4 = kotlin.collections.ArraysKt.L0(r34)
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r1, r4)
            if (r4 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = r14
            goto L_0x0080
        L_0x007f:
            r4 = 1
        L_0x0080:
            int r5 = r12.length
            if (r5 != 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = r14
        L_0x0086:
            r6 = 2
            r24 = 0
            if (r5 != 0) goto L_0x009a
            if (r4 != 0) goto L_0x009a
            float r4 = r23 - r24
            float r5 = (float) r6
            float r5 = r5 * r19
            float r4 = r4 - r5
            float r4 = r4 * r1
            float r4 = r4 + r24
            float r4 = r4 + r19
        L_0x0098:
            r9 = r4
            goto L_0x00a0
        L_0x009a:
            float r4 = r23 - r24
            float r4 = r4 * r1
            float r4 = r24 + r4
            goto L_0x0098
        L_0x00a0:
            int r1 = r12.length
            if (r1 != 0) goto L_0x00a5
            r1 = 1
            goto L_0x00a6
        L_0x00a5:
            r1 = r14
        L_0x00a6:
            if (r1 != 0) goto L_0x00ba
            if (r3 != 0) goto L_0x00ba
            float r1 = r23 - r24
            float r3 = (float) r6
            float r3 = r3 * r19
            float r1 = r1 - r3
            float r1 = r1 * r0
            float r1 = r1 + r24
            float r1 = r1 + r19
        L_0x00b5:
            r0 = r50
            r25 = r1
            goto L_0x00c0
        L_0x00ba:
            float r1 = r23 - r24
            float r1 = r1 * r0
            float r1 = r24 + r1
            goto L_0x00b5
        L_0x00c0:
            float r26 = r11.B1(r0)
            float r0 = (float) r14
            float r0 = androidx.compose.ui.unit.Dp.m(r0)
            int r0 = androidx.compose.ui.unit.Dp.l(r2, r0)
            if (r0 <= 0) goto L_0x0108
            if (r16 == 0) goto L_0x00ef
            r0 = r46
            float r0 = r11.B1(r0)
            float r1 = (float) r6
            float r0 = r0 / r1
            float r3 = r11.B1(r2)
            float r0 = r0 + r3
            r3 = r48
            float r3 = r11.B1(r3)
            float r3 = r3 / r1
            float r1 = r11.B1(r2)
        L_0x00e9:
            float r3 = r3 + r1
            r27 = r0
            r28 = r3
            goto L_0x010c
        L_0x00ef:
            r0 = r45
            float r0 = r11.B1(r0)
            float r1 = (float) r6
            float r0 = r0 / r1
            float r3 = r11.B1(r2)
            float r0 = r0 + r3
            r3 = r47
            float r3 = r11.B1(r3)
            float r3 = r3 / r1
            float r1 = r11.B1(r2)
            goto L_0x00e9
        L_0x0108:
            r27 = r24
            r28 = r27
        L_0x010c:
            long r0 = r33.T1()
            if (r16 == 0) goto L_0x011b
            long r0 = r0 & r21
        L_0x0114:
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r7 = r0
            goto L_0x011e
        L_0x011b:
            long r0 = r0 >> r20
            goto L_0x0114
        L_0x011e:
            float r0 = r27 + r24
            if (r55 == 0) goto L_0x012a
            int r1 = r12.length
            if (r1 != 0) goto L_0x0127
            r1 = 1
            goto L_0x0128
        L_0x0127:
            r1 = r14
        L_0x0128:
            if (r1 != 0) goto L_0x012c
        L_0x012a:
            float r0 = r0 + r19
        L_0x012c:
            if (r57 == 0) goto L_0x0135
            float r1 = java.lang.Math.min(r9, r7)
            r29 = r1
            goto L_0x0137
        L_0x0135:
            r29 = r25
        L_0x0137:
            if (r57 != 0) goto L_0x0140
            if (r54 == 0) goto L_0x013c
            goto L_0x0140
        L_0x013c:
            r14 = r7
            r15 = r9
            goto L_0x025f
        L_0x0140:
            int r0 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x013c
            if (r18 == 0) goto L_0x0149
            r30 = r26
            goto L_0x014b
        L_0x0149:
            r30 = r19
        L_0x014b:
            if (r18 == 0) goto L_0x0150
            r31 = r19
            goto L_0x0152
        L_0x0150:
            r31 = r26
        L_0x0152:
            float r0 = r29 - r27
            if (r18 == 0) goto L_0x0177
            long r1 = r33.c()
            long r1 = r1 >> r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 - r0
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r24)
            long r3 = (long) r3
            long r1 = r1 << r20
            long r3 = r3 & r21
            long r1 = r1 | r3
            long r1 = androidx.compose.ui.geometry.Offset.e(r1)
        L_0x0175:
            r3 = r1
            goto L_0x018b
        L_0x0177:
            int r1 = java.lang.Float.floatToRawIntBits(r24)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r24)
            long r3 = (long) r3
            long r1 = r1 << r20
            long r3 = r3 & r21
            long r1 = r1 | r3
            long r1 = androidx.compose.ui.geometry.Offset.e(r1)
            goto L_0x0175
        L_0x018b:
            if (r16 == 0) goto L_0x01af
            long r1 = r33.c()
            long r1 = r1 >> r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r0 = r0 - r24
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r20
            long r5 = r5 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
        L_0x01ad:
            r5 = r0
            goto L_0x01d0
        L_0x01af:
            float r0 = r0 - r24
            long r1 = r33.c()
            long r1 = r1 & r21
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r5 = r5 << r20
            long r0 = r0 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
            goto L_0x01ad
        L_0x01d0:
            r0 = r32
            r1 = r33
            r2 = r56
            r14 = r7
            r7 = r37
            r15 = r9
            r9 = r30
            r10 = r31
            r0.R(r1, r2, r3, r5, r7, r9, r10)
            if (r16 == 0) goto L_0x0204
            long r0 = r33.T1()
            long r0 = r0 >> r20
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r19 + r24
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r20
            long r0 = r0 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x0254
        L_0x0204:
            if (r17 == 0) goto L_0x0234
            long r0 = r33.c()
            long r0 = r0 >> r20
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 - r24
            float r0 = r0 - r19
            long r1 = r33.T1()
            long r1 = r1 & r21
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r20
            long r0 = r0 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x0254
        L_0x0234:
            float r0 = r19 + r24
            long r1 = r33.T1()
            long r1 = r1 & r21
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r20
            long r0 = r0 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
        L_0x0254:
            if (r13 == 0) goto L_0x025f
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r0)
            r13.m(r11, r0)
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x025f:
            float r0 = r23 - r28
            if (r55 == 0) goto L_0x026b
            int r1 = r12.length
            if (r1 != 0) goto L_0x0268
            r1 = 1
            goto L_0x0269
        L_0x0268:
            r1 = 0
        L_0x0269:
            if (r1 != 0) goto L_0x026d
        L_0x026b:
            float r0 = r0 - r19
        L_0x026d:
            if (r57 == 0) goto L_0x0276
            float r9 = java.lang.Math.max(r15, r14)
            r30 = r9
            goto L_0x0278
        L_0x0276:
            r30 = r15
        L_0x0278:
            int r0 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b9
            if (r18 == 0) goto L_0x0281
            r9 = r19
            goto L_0x0283
        L_0x0281:
            r9 = r26
        L_0x0283:
            if (r18 == 0) goto L_0x0288
            r10 = r26
            goto L_0x028a
        L_0x0288:
            r10 = r19
        L_0x028a:
            float r0 = r30 + r28
            float r1 = r23 - r0
            if (r16 == 0) goto L_0x02a5
            int r2 = java.lang.Float.floatToRawIntBits(r24)
            long r2 = (long) r2
            int r4 = java.lang.Float.floatToRawIntBits(r0)
            long r4 = (long) r4
            long r2 = r2 << r20
            long r4 = r4 & r21
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.geometry.Offset.e(r2)
        L_0x02a3:
            r3 = r2
            goto L_0x02cf
        L_0x02a5:
            if (r17 == 0) goto L_0x02bb
            int r2 = java.lang.Float.floatToRawIntBits(r24)
            long r2 = (long) r2
            int r4 = java.lang.Float.floatToRawIntBits(r24)
            long r4 = (long) r4
            long r2 = r2 << r20
            long r4 = r4 & r21
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.geometry.Offset.e(r2)
            goto L_0x02a3
        L_0x02bb:
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r2
            int r4 = java.lang.Float.floatToRawIntBits(r24)
            long r4 = (long) r4
            long r2 = r2 << r20
            long r4 = r4 & r21
            long r2 = r2 | r4
            long r2 = androidx.compose.ui.geometry.Offset.e(r2)
            goto L_0x02a3
        L_0x02cf:
            if (r16 == 0) goto L_0x02f1
            long r5 = r33.c()
            long r5 = r5 >> r20
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r5 = r5 << r20
            long r0 = r0 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
        L_0x02ef:
            r5 = r0
            goto L_0x033f
        L_0x02f1:
            if (r17 == 0) goto L_0x0320
            if (r54 != 0) goto L_0x0320
            long r1 = r33.c()
            long r1 = r1 >> r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 - r0
            long r5 = r33.c()
            long r5 = r5 & r21
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r20
            long r5 = r5 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
            goto L_0x02ef
        L_0x0320:
            long r5 = r33.c()
            long r5 = r5 & r21
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r20
            long r5 = r5 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
            goto L_0x02ef
        L_0x033f:
            r0 = r32
            r1 = r33
            r2 = r56
            r7 = r37
            r0.R(r1, r2, r3, r5, r7, r9, r10)
            if (r16 == 0) goto L_0x036d
            long r0 = r33.T1()
            long r0 = r0 >> r20
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r23 - r19
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r20
            long r0 = r0 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x03ae
        L_0x036d:
            if (r17 == 0) goto L_0x038e
            long r0 = r33.T1()
            long r0 = r0 & r21
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r19)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            long r0 = r1 << r20
            long r2 = r3 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x03ae
        L_0x038e:
            float r0 = r23 - r19
            long r1 = r33.T1()
            long r1 = r1 & r21
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r20
            long r0 = r0 & r21
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
        L_0x03ae:
            if (r13 == 0) goto L_0x03b9
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r0)
            r13.m(r11, r0)
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x03b9:
            if (r57 == 0) goto L_0x03c7
            int r0 = (r29 > r14 ? 1 : (r29 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x03c2
            r0 = r27
            goto L_0x03c4
        L_0x03c2:
            r0 = r24
        L_0x03c4:
            float r29 = r29 + r0
            goto L_0x03ce
        L_0x03c7:
            if (r54 == 0) goto L_0x03cc
            float r29 = r25 + r27
            goto L_0x03ce
        L_0x03cc:
            r29 = r24
        L_0x03ce:
            if (r57 == 0) goto L_0x03dc
            int r0 = (r30 > r14 ? 1 : (r30 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d7
            r0 = r28
            goto L_0x03d9
        L_0x03d7:
            r0 = r24
        L_0x03d9:
            float r30 = r30 - r0
            goto L_0x03de
        L_0x03dc:
            float r30 = r15 - r28
        L_0x03de:
            if (r18 != 0) goto L_0x03e8
            if (r57 != 0) goto L_0x03e8
            if (r54 == 0) goto L_0x03e5
            goto L_0x03e8
        L_0x03e5:
            r9 = r19
            goto L_0x03ea
        L_0x03e8:
            r9 = r26
        L_0x03ea:
            if (r18 == 0) goto L_0x03f3
            if (r57 != 0) goto L_0x03f3
            if (r54 != 0) goto L_0x03f3
            r10 = r19
            goto L_0x03f5
        L_0x03f3:
            r10 = r26
        L_0x03f5:
            if (r18 == 0) goto L_0x03fe
            if (r57 != 0) goto L_0x03fe
            if (r54 != 0) goto L_0x03fe
            r0 = r30
            goto L_0x0400
        L_0x03fe:
            float r0 = r30 - r29
        L_0x0400:
            if (r55 == 0) goto L_0x040e
            int r1 = r12.length
            if (r1 != 0) goto L_0x0407
            r1 = 1
            goto L_0x0408
        L_0x0407:
            r1 = 0
        L_0x0408:
            if (r1 != 0) goto L_0x040b
            goto L_0x040e
        L_0x040b:
            r1 = r24
            goto L_0x040f
        L_0x040e:
            r1 = r9
        L_0x040f:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x04d7
            if (r16 == 0) goto L_0x042a
            int r1 = java.lang.Float.floatToRawIntBits(r24)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r29)
            long r3 = (long) r3
            long r1 = r1 << r20
            long r3 = r3 & r21
            long r1 = r1 | r3
            long r1 = androidx.compose.ui.geometry.Offset.e(r1)
        L_0x0428:
            r3 = r1
            goto L_0x0461
        L_0x042a:
            if (r17 == 0) goto L_0x044d
            long r1 = r33.c()
            long r1 = r1 >> r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 - r30
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r24)
            long r3 = (long) r3
            long r1 = r1 << r20
            long r3 = r3 & r21
            long r1 = r1 | r3
            long r1 = androidx.compose.ui.geometry.Offset.e(r1)
            goto L_0x0428
        L_0x044d:
            int r1 = java.lang.Float.floatToRawIntBits(r29)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r24)
            long r3 = (long) r3
            long r1 = r1 << r20
            long r3 = r3 & r21
            long r1 = r1 | r3
            long r1 = androidx.compose.ui.geometry.Offset.e(r1)
            goto L_0x0428
        L_0x0461:
            if (r16 == 0) goto L_0x0483
            long r1 = r33.c()
            long r1 = r1 >> r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r20
            long r5 = r5 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
        L_0x0481:
            r5 = r0
            goto L_0x04c7
        L_0x0483:
            if (r17 == 0) goto L_0x04a8
            if (r57 != 0) goto L_0x04a8
            if (r54 != 0) goto L_0x04a8
            long r0 = r33.c()
            long r0 = r0 & r21
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r30)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r20
            long r5 = r5 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
            goto L_0x0481
        L_0x04a8:
            long r1 = r33.c()
            long r1 = r1 & r21
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r5 = r5 << r20
            long r0 = r0 & r21
            long r0 = r0 | r5
            long r0 = androidx.compose.ui.geometry.Size.d(r0)
            goto L_0x0481
        L_0x04c7:
            r0 = r32
            r1 = r33
            r2 = r56
            r7 = r39
            r11 = r29
            r13 = r30
            r0.R(r1, r2, r3, r5, r7, r9, r10)
            goto L_0x04db
        L_0x04d7:
            r11 = r29
            r13 = r30
        L_0x04db:
            float r0 = r24 + r19
            float r1 = r23 - r19
            kotlin.ranges.ClosedFloatingPointRange r2 = kotlin.ranges.RangesKt.b(r11, r13)
            float r7 = r14 - r28
            float r3 = r14 + r28
            kotlin.ranges.ClosedFloatingPointRange r3 = kotlin.ranges.RangesKt.b(r7, r3)
            float r4 = r25 - r27
            float r5 = r25 + r27
            kotlin.ranges.ClosedFloatingPointRange r4 = kotlin.ranges.RangesKt.b(r4, r5)
            float r9 = r15 - r28
            float r5 = r15 + r28
            kotlin.ranges.ClosedFloatingPointRange r5 = kotlin.ranges.RangesKt.b(r9, r5)
            int r6 = r12.length
            r7 = 0
            r14 = 0
        L_0x04fe:
            if (r14 >= r6) goto L_0x05e0
            r8 = r12[r14]
            r9 = 1
            int r10 = r7 + 1
            if (r52 == 0) goto L_0x051d
            if (r57 != 0) goto L_0x050b
            if (r54 == 0) goto L_0x050e
        L_0x050b:
            if (r7 != 0) goto L_0x050e
            goto L_0x0512
        L_0x050e:
            int r11 = r12.length
            int r11 = r11 - r9
            if (r7 != r11) goto L_0x051d
        L_0x0512:
            r7 = r33
            r8 = r53
            r35 = r0
            r36 = r1
        L_0x051a:
            r0 = 1
            goto L_0x05d8
        L_0x051d:
            float r7 = androidx.compose.ui.util.MathHelpersKt.b(r0, r1, r8)
            if (r57 == 0) goto L_0x052d
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            boolean r8 = r3.i(r8)
            if (r8 != 0) goto L_0x0512
        L_0x052d:
            if (r54 == 0) goto L_0x0539
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            boolean r8 = r4.i(r8)
            if (r8 != 0) goto L_0x0512
        L_0x0539:
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            boolean r8 = r5.i(r8)
            if (r8 == 0) goto L_0x0544
            goto L_0x0512
        L_0x0544:
            if (r16 == 0) goto L_0x0569
            long r8 = r33.T1()
            long r8 = r8 >> r20
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r8 = (long) r8
            int r11 = java.lang.Float.floatToRawIntBits(r7)
            r35 = r0
            r36 = r1
            long r0 = (long) r11
            long r8 = r8 << r20
            long r0 = r0 & r21
            long r0 = r0 | r8
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x05b8
        L_0x0569:
            r35 = r0
            r36 = r1
            if (r17 == 0) goto L_0x059a
            long r0 = r33.c()
            long r0 = r0 >> r20
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 - r7
            long r8 = r33.T1()
            long r8 = r8 & r21
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r8 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r8 = r8 << r20
            long r0 = r0 & r21
            long r0 = r0 | r8
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
            goto L_0x05b8
        L_0x059a:
            long r0 = r33.T1()
            long r0 = r0 & r21
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToRawIntBits(r7)
            long r8 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r8 = r8 << r20
            long r0 = r0 & r21
            long r0 = r0 | r8
            long r0 = androidx.compose.ui.geometry.Offset.e(r0)
        L_0x05b8:
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.d(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            boolean r1 = r2.i(r1)
            if (r1 == 0) goto L_0x05c9
            r7 = r43
            goto L_0x05cb
        L_0x05c9:
            r7 = r41
        L_0x05cb:
            androidx.compose.ui.graphics.Color r1 = androidx.compose.ui.graphics.Color.h(r7)
            r7 = r33
            r8 = r53
            r8.d(r7, r0, r1)
            goto L_0x051a
        L_0x05d8:
            int r14 = r14 + r0
            r0 = r35
            r1 = r36
            r7 = r10
            goto L_0x04fe
        L_0x05e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.P(androidx.compose.ui.graphics.drawscope.DrawScope, float[], float, float, long, long, long, long, float, float, float, float, float, float, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, boolean, boolean, androidx.compose.foundation.gestures.Orientation, boolean):void");
    }

    public final void R(DrawScope drawScope, Orientation orientation, long j2, long j3, long j4, float f2, float f3) {
        RoundRect roundRect;
        long j5 = j2;
        long b2 = CornerRadius.b((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long b3 = CornerRadius.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        if (orientation == Orientation.Vertical) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
            roundRect = RoundRectKt.c(RectKt.c(j5, Size.d((((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (floatToRawIntBits << 32))), b2, b2, b3, b3);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            long floatToRawIntBits2 = (long) Float.floatToRawIntBits(intBitsToFloat3);
            roundRect = RoundRectKt.c(RectKt.c(j5, Size.d((((long) Float.floatToRawIntBits(intBitsToFloat4)) & 4294967295L) | (floatToRawIntBits2 << 32))), b2, b3, b3, b2);
        }
        Path path = f11060d;
        Path.l(path, roundRect, (Path.Direction) null, 2, (Object) null);
        DrawScope.E1(drawScope, path, j4, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        path.t();
    }

    public final SliderColors S(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        SliderColors k2 = colorScheme.k();
        if (k2 != null) {
            return k2;
        }
        SliderTokens sliderTokens = SliderTokens.f14009a;
        SliderColors sliderColors = r2;
        SliderColors sliderColors2 = new SliderColors(ColorSchemeKt.i(colorScheme2, sliderTokens.i()), ColorSchemeKt.i(colorScheme2, sliderTokens.b()), ColorSchemeKt.i(colorScheme2, sliderTokens.m()), ColorSchemeKt.i(colorScheme2, sliderTokens.m()), ColorSchemeKt.i(colorScheme2, sliderTokens.b()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, sliderTokens.e()), sliderTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), Color.l(ColorSchemeKt.i(colorScheme2, sliderTokens.c()), sliderTokens.d(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, sliderTokens.g()), sliderTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, sliderTokens.g()), sliderTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, sliderTokens.c()), sliderTokens.d(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        SliderColors sliderColors3 = sliderColors;
        colorScheme2.t0(sliderColors3);
        return sliderColors3;
    }

    public final float T() {
        return f11059c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.compose.foundation.interaction.MutableInteractionSource r26, androidx.compose.ui.Modifier r27, androidx.compose.material3.SliderColors r28, boolean r29, long r30, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r25 = this;
            r10 = r25
            r2 = r26
            r8 = r33
            r0 = -290277409(0xffffffffeeb2b7df, float:-2.765531E28)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r8 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r8 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r8
            goto L_0x0026
        L_0x0025:
            r3 = r8
        L_0x0026:
            r6 = r34 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r7 = r27
            goto L_0x0041
        L_0x002f:
            r7 = r8 & 48
            if (r7 != 0) goto L_0x002c
            r7 = r27
            boolean r9 = r1.W(r7)
            if (r9 == 0) goto L_0x003e
            r9 = 32
            goto L_0x0040
        L_0x003e:
            r9 = 16
        L_0x0040:
            r3 = r3 | r9
        L_0x0041:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x005a
            r9 = r34 & 4
            if (r9 != 0) goto L_0x0054
            r9 = r28
            boolean r11 = r1.W(r9)
            if (r11 == 0) goto L_0x0056
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0054:
            r9 = r28
        L_0x0056:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r11
            goto L_0x005c
        L_0x005a:
            r9 = r28
        L_0x005c:
            r11 = r34 & 8
            if (r11 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r12 = r29
            goto L_0x0077
        L_0x0065:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0062
            r12 = r29
            boolean r13 = r1.d(r12)
            if (r13 == 0) goto L_0x0074
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r13
        L_0x0077:
            r13 = r34 & 16
            if (r13 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r14 = r30
            goto L_0x0093
        L_0x0080:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x007d
            r14 = r30
            boolean r16 = r1.j(r14)
            if (r16 == 0) goto L_0x008f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r16
        L_0x0093:
            r16 = r34 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x009c
            r3 = r3 | r17
            goto L_0x00ad
        L_0x009c:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00ad
            boolean r16 = r1.W(r10)
            if (r16 == 0) goto L_0x00a9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r3 = r3 | r16
        L_0x00ad:
            r16 = 74899(0x12493, float:1.04956E-40)
            r4 = r3 & r16
            r5 = 74898(0x12492, float:1.04954E-40)
            r0 = 0
            r18 = 1
            if (r4 == r5) goto L_0x00bd
            r4 = r18
            goto L_0x00be
        L_0x00bd:
            r4 = r0
        L_0x00be:
            r5 = r3 & 1
            boolean r4 = r1.E(r4, r5)
            if (r4 == 0) goto L_0x0192
            r1.p()
            r4 = r8 & 1
            if (r4 == 0) goto L_0x00de
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x00d4
            goto L_0x00de
        L_0x00d4:
            r1.B()
            r4 = r34 & 4
            if (r4 == 0) goto L_0x00fd
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00fd
        L_0x00de:
            if (r6 == 0) goto L_0x00e3
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r7 = r4
        L_0x00e3:
            r4 = r34 & 4
            if (r4 == 0) goto L_0x00f2
            int r4 = r3 >> 15
            r4 = r4 & 14
            androidx.compose.material3.SliderColors r4 = r10.N(r1, r4)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r4
        L_0x00f2:
            if (r11 == 0) goto L_0x00f6
            r12 = r18
        L_0x00f6:
            if (r13 == 0) goto L_0x00fd
            long r4 = androidx.compose.material3.SliderKt.f11071d
            r14 = r4
        L_0x00fd:
            r1.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x010f
            r4 = -1
            java.lang.String r5 = "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1212)"
            r6 = -290277409(0xffffffffeeb2b7df, float:-2.765531E28)
            androidx.compose.runtime.ComposerKt.Y(r6, r3, r4, r5)
        L_0x010f:
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r5.a()
            if (r4 != r6) goto L_0x0122
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = androidx.compose.runtime.SnapshotStateKt.f()
            r1.N(r4)
        L_0x0122:
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r3 = r3 & 14
            r6 = 4
            if (r3 != r6) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r18 = r0
        L_0x012c:
            java.lang.Object r6 = r1.g()
            r11 = 0
            if (r18 != 0) goto L_0x0139
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0141
        L_0x0139:
            androidx.compose.material3.SliderDefaults$Thumb$1$1 r6 = new androidx.compose.material3.SliderDefaults$Thumb$1$1
            r6.<init>(r2, r4, r11)
            r1.N(r6)
        L_0x0141:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            androidx.compose.runtime.EffectsKt.g(r2, r6, r1, r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0164
            float r3 = androidx.compose.ui.unit.DpSize.j(r14)
            r4 = 2
            float r5 = (float) r4
            float r3 = r3 / r5
            float r21 = androidx.compose.ui.unit.Dp.m(r3)
            r23 = 2
            r24 = 0
            r22 = 0
            r19 = r14
            long r3 = androidx.compose.ui.unit.DpSize.f(r19, r21, r22, r23, r24)
            goto L_0x0165
        L_0x0164:
            r3 = r14
        L_0x0165:
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.u(r7, r3)
            r4 = 2
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.HoverableKt.b(r3, r2, r0, r4, r11)
            long r4 = r9.a(r12)
            androidx.compose.material3.tokens.SliderTokens r6 = androidx.compose.material3.tokens.SliderTokens.f14009a
            androidx.compose.material3.tokens.ShapeKeyTokens r6 = r6.k()
            r11 = 6
            androidx.compose.ui.graphics.Shape r6 = androidx.compose.material3.ShapesKt.g(r6, r1, r11)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.BackgroundKt.a(r3, r4, r6)
            androidx.compose.foundation.layout.SpacerKt.a(r3, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x018d
            androidx.compose.runtime.ComposerKt.X()
        L_0x018d:
            r3 = r7
            r4 = r9
            r5 = r12
            r6 = r14
            goto L_0x0196
        L_0x0192:
            r1.B()
            goto L_0x018d
        L_0x0196:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x01ad
            androidx.compose.material3.j6 r12 = new androidx.compose.material3.j6
            r0 = r12
            r1 = r25
            r2 = r26
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r11.a(r12)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.q(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(androidx.compose.foundation.interaction.MutableInteractionSource r25, androidx.compose.material3.SliderState r26, androidx.compose.ui.Modifier r27, androidx.compose.material3.SliderColors r28, boolean r29, long r30, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r24 = this;
            r11 = r24
            r2 = r25
            r9 = r33
            r0 = -889714565(0xffffffffcaf8087b, float:-8127549.5)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r34 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r9 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r9
            goto L_0x0026
        L_0x0025:
            r3 = r9
        L_0x0026:
            r6 = r34 & 2
            if (r6 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r6 = r26
            goto L_0x0041
        L_0x002f:
            r6 = r9 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r26
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r3 = r3 | r7
        L_0x0041:
            r7 = r34 & 4
            if (r7 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r8 = r27
            goto L_0x005c
        L_0x004a:
            r8 = r9 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0047
            r8 = r27
            boolean r10 = r1.W(r8)
            if (r10 == 0) goto L_0x0059
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r10
        L_0x005c:
            r10 = r9 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0075
            r10 = r34 & 8
            if (r10 != 0) goto L_0x006f
            r10 = r28
            boolean r12 = r1.W(r10)
            if (r12 == 0) goto L_0x0071
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r10 = r28
        L_0x0071:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r12
            goto L_0x0077
        L_0x0075:
            r10 = r28
        L_0x0077:
            r12 = r34 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r13 = r29
            goto L_0x0092
        L_0x0080:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x007d
            r13 = r29
            boolean r14 = r1.d(r13)
            if (r14 == 0) goto L_0x008f
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r14
        L_0x0092:
            r14 = r34 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009c
            r3 = r3 | r15
            r5 = r30
            goto L_0x00ad
        L_0x009c:
            r15 = r15 & r9
            r5 = r30
            if (r15 != 0) goto L_0x00ad
            boolean r15 = r1.j(r5)
            if (r15 == 0) goto L_0x00aa
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r3 = r3 | r15
        L_0x00ad:
            r15 = r34 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00b6
            r3 = r3 | r16
            goto L_0x00c6
        L_0x00b6:
            r15 = r9 & r16
            if (r15 != 0) goto L_0x00c6
            boolean r15 = r1.W(r11)
            if (r15 == 0) goto L_0x00c3
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00c3:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00c5:
            r3 = r3 | r15
        L_0x00c6:
            r15 = 599187(0x92493, float:8.3964E-40)
            r15 = r15 & r3
            r4 = 599186(0x92492, float:8.39638E-40)
            r0 = 0
            r17 = 1
            if (r15 == r4) goto L_0x00d5
            r4 = r17
            goto L_0x00d6
        L_0x00d5:
            r4 = r0
        L_0x00d6:
            r15 = r3 & 1
            boolean r4 = r1.E(r4, r15)
            if (r4 == 0) goto L_0x01ca
            r1.p()
            r4 = r9 & 1
            if (r4 == 0) goto L_0x00f6
            boolean r4 = r1.J()
            if (r4 == 0) goto L_0x00ec
            goto L_0x00f6
        L_0x00ec:
            r1.B()
            r4 = r34 & 8
            if (r4 == 0) goto L_0x0115
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0115
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r8 = r4
        L_0x00fb:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x010a
            int r4 = r3 >> 18
            r4 = r4 & 14
            androidx.compose.material3.SliderColors r4 = r11.N(r1, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r10 = r4
        L_0x010a:
            if (r12 == 0) goto L_0x010e
            r13 = r17
        L_0x010e:
            if (r14 == 0) goto L_0x0115
            long r4 = androidx.compose.material3.SliderKt.f11071d
            r5 = r4
        L_0x0115:
            r1.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0127
            r4 = -1
            java.lang.String r7 = "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1265)"
            r12 = -889714565(0xffffffffcaf8087b, float:-8127549.5)
            androidx.compose.runtime.ComposerKt.Y(r12, r3, r4, r7)
        L_0x0127:
            java.lang.Object r4 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r7.a()
            if (r4 != r12) goto L_0x013a
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = androidx.compose.runtime.SnapshotStateKt.f()
            r1.N(r4)
        L_0x013a:
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r3 = r3 & 14
            r12 = 4
            if (r3 != r12) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r17 = r0
        L_0x0144:
            java.lang.Object r12 = r1.g()
            r14 = 0
            if (r17 != 0) goto L_0x0151
            java.lang.Object r7 = r7.a()
            if (r12 != r7) goto L_0x0159
        L_0x0151:
            androidx.compose.material3.SliderDefaults$Thumb$3$1 r12 = new androidx.compose.material3.SliderDefaults$Thumb$3$1
            r12.<init>(r2, r4, r14)
            r1.N(r12)
        L_0x0159:
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            androidx.compose.runtime.EffectsKt.g(r2, r12, r1, r3)
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x019c
            androidx.compose.foundation.gestures.Orientation r3 = r26.j()
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r3 != r4) goto L_0x0184
            float r3 = androidx.compose.ui.unit.DpSize.i(r5)
            r4 = 2
            float r7 = (float) r4
            float r3 = r3 / r7
            float r21 = androidx.compose.ui.unit.Dp.m(r3)
            r22 = 1
            r23 = 0
            r20 = 0
            r18 = r5
            long r3 = androidx.compose.ui.unit.DpSize.f(r18, r20, r21, r22, r23)
            goto L_0x019d
        L_0x0184:
            float r3 = androidx.compose.ui.unit.DpSize.j(r5)
            r4 = 2
            float r7 = (float) r4
            float r3 = r3 / r7
            float r20 = androidx.compose.ui.unit.Dp.m(r3)
            r22 = 2
            r23 = 0
            r21 = 0
            r18 = r5
            long r3 = androidx.compose.ui.unit.DpSize.f(r18, r20, r21, r22, r23)
            goto L_0x019d
        L_0x019c:
            r3 = r5
        L_0x019d:
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.u(r8, r3)
            r4 = 2
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.HoverableKt.b(r3, r2, r0, r4, r14)
            long r14 = r10.a(r13)
            androidx.compose.material3.tokens.SliderTokens r4 = androidx.compose.material3.tokens.SliderTokens.f14009a
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.k()
            r7 = 6
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.g(r4, r1, r7)
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.BackgroundKt.a(r3, r14, r4)
            androidx.compose.foundation.layout.SpacerKt.a(r3, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01c5
            androidx.compose.runtime.ComposerKt.X()
        L_0x01c5:
            r4 = r8
            r7 = r5
            r5 = r10
            r6 = r13
            goto L_0x01ce
        L_0x01ca:
            r1.B()
            goto L_0x01c5
        L_0x01ce:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.x()
            if (r12 == 0) goto L_0x01e7
            androidx.compose.material3.i6 r13 = new androidx.compose.material3.i6
            r0 = r13
            r1 = r24
            r2 = r25
            r3 = r26
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            r12.a(r13)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.r(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.compose.material3.RangeSliderState r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.material3.SliderColors r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function3 r30, float r31, float r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r24 = this;
            r12 = r24
            r13 = r34
            r14 = r35
            r0 = -541824132(0xffffffffdfb46b7c, float:-2.6001242E19)
            r1 = r33
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r13 | 6
            r11 = r25
            goto L_0x002a
        L_0x0018:
            r1 = r13 & 6
            r11 = r25
            if (r1 != 0) goto L_0x0029
            boolean r1 = r15.l(r11)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r13
            goto L_0x002a
        L_0x0029:
            r1 = r13
        L_0x002a:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r3 = r26
            goto L_0x0045
        L_0x0033:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0030
            r3 = r26
            boolean r4 = r15.W(r3)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r27
            goto L_0x0060
        L_0x004e:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r27
            boolean r7 = r15.d(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r7
        L_0x0060:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0079
            r7 = r14 & 8
            if (r7 != 0) goto L_0x0073
            r7 = r28
            boolean r9 = r15.W(r7)
            if (r9 == 0) goto L_0x0075
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r7 = r28
        L_0x0075:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r9
            goto L_0x007b
        L_0x0079:
            r7 = r28
        L_0x007b:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0094
            r9 = r14 & 16
            if (r9 != 0) goto L_0x008e
            r9 = r29
            boolean r10 = r15.l(r9)
            if (r10 == 0) goto L_0x0090
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r9 = r29
        L_0x0090:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r10
            goto L_0x0096
        L_0x0094:
            r9 = r29
        L_0x0096:
            r10 = r14 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a1
            r1 = r1 | r16
            r0 = r30
            goto L_0x00b4
        L_0x00a1:
            r16 = r13 & r16
            r0 = r30
            if (r16 != 0) goto L_0x00b4
            boolean r17 = r15.l(r0)
            if (r17 == 0) goto L_0x00b0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r1 = r1 | r17
        L_0x00b4:
            r17 = r14 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00bf
            r1 = r1 | r18
            r5 = r31
            goto L_0x00d2
        L_0x00bf:
            r18 = r13 & r18
            r5 = r31
            if (r18 != 0) goto L_0x00d2
            boolean r18 = r15.h(r5)
            if (r18 == 0) goto L_0x00ce
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r1 = r1 | r18
        L_0x00d2:
            r8 = r14 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00dd
            r1 = r1 | r19
            r0 = r32
            goto L_0x00f0
        L_0x00dd:
            r19 = r13 & r19
            r0 = r32
            if (r19 != 0) goto L_0x00f0
            boolean r19 = r15.h(r0)
            if (r19 == 0) goto L_0x00ec
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r1 = r1 | r19
        L_0x00f0:
            r0 = r14 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f9
            r1 = r1 | r19
            goto L_0x0109
        L_0x00f9:
            r0 = r13 & r19
            if (r0 != 0) goto L_0x0109
            boolean r0 = r15.W(r12)
            if (r0 == 0) goto L_0x0106
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0108
        L_0x0106:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0108:
            r1 = r1 | r0
        L_0x0109:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r1
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            r19 = 0
            r20 = 1
            if (r0 == r3) goto L_0x0119
            r0 = r20
            goto L_0x011b
        L_0x0119:
            r0 = r19
        L_0x011b:
            r3 = r1 & 1
            boolean r0 = r15.E(r0, r3)
            if (r0 == 0) goto L_0x024f
            r15.p()
            r0 = r13 & 1
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0152
            boolean r0 = r15.J()
            if (r0 == 0) goto L_0x0134
            goto L_0x0152
        L_0x0134:
            r15.B()
            r0 = r14 & 8
            if (r0 == 0) goto L_0x013d
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013d:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0142
            r1 = r1 & r3
        L_0x0142:
            r17 = r26
            r21 = r30
            r23 = r32
        L_0x0148:
            r22 = r5
            r18 = r6
            r19 = r7
            r20 = r9
            goto L_0x01e1
        L_0x0152:
            if (r2 == 0) goto L_0x0157
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0159
        L_0x0157:
            r0 = r26
        L_0x0159:
            if (r4 == 0) goto L_0x015d
            r6 = r20
        L_0x015d:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x016c
            int r2 = r1 >> 24
            r2 = r2 & 14
            androidx.compose.material3.SliderColors r2 = r12.N(r15, r2)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r2
        L_0x016c:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x01ac
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 <= r4) goto L_0x017e
            boolean r2 = r15.W(r7)
            if (r2 != 0) goto L_0x0182
        L_0x017e:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            if (r2 != r4) goto L_0x0185
        L_0x0182:
            r2 = r20
            goto L_0x0187
        L_0x0185:
            r2 = r19
        L_0x0187:
            r4 = r1 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r4 != r9) goto L_0x018f
            r19 = r20
        L_0x018f:
            r2 = r2 | r19
            java.lang.Object r4 = r15.g()
            if (r2 != 0) goto L_0x019f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01a7
        L_0x019f:
            androidx.compose.material3.m6 r4 = new androidx.compose.material3.m6
            r4.<init>(r7, r6)
            r15.N(r4)
        L_0x01a7:
            r2 = r4
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r1 = r1 & r3
            r9 = r2
        L_0x01ac:
            if (r10 == 0) goto L_0x01c2
            java.lang.Object r2 = r15.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x01bf
            androidx.compose.material3.SliderDefaults$Track$12$1 r2 = androidx.compose.material3.SliderDefaults$Track$12$1.f11064z
            r15.N(r2)
        L_0x01bf:
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            goto L_0x01c4
        L_0x01c2:
            r2 = r30
        L_0x01c4:
            if (r17 == 0) goto L_0x01cb
            float r3 = androidx.compose.material3.SliderKt.f11073f
            r5 = r3
        L_0x01cb:
            if (r8 == 0) goto L_0x01d9
            float r3 = androidx.compose.material3.SliderKt.f11074g
            r17 = r0
            r21 = r2
            r23 = r3
            goto L_0x0148
        L_0x01d9:
            r23 = r32
            r17 = r0
            r21 = r2
            goto L_0x0148
        L_0x01e1:
            r15.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f3
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1734)"
            r3 = -541824132(0xffffffffdfb46b7c, float:-2.6001242E19)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x01f3:
            androidx.compose.ui.unit.Dp$Companion r0 = androidx.compose.ui.unit.Dp.f19144A
            float r2 = r0.c()
            r0 = r1 & 14
            r0 = r0 | 48
            int r1 = r1 << 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r16 = r0 | r1
            r0 = r24
            r1 = r25
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r15
            r11 = r16
            r0.y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0240
            androidx.compose.runtime.ComposerKt.X()
        L_0x0240:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            goto L_0x025c
        L_0x024f:
            r15.B()
            r3 = r26
            r8 = r5
            r4 = r6
            r5 = r7
            r6 = r9
            r7 = r30
            r9 = r32
        L_0x025c:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.x()
            if (r15 == 0) goto L_0x0274
            androidx.compose.material3.n6 r11 = new androidx.compose.material3.n6
            r0 = r11
            r1 = r24
            r2 = r25
            r10 = r34
            r13 = r11
            r11 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.a(r13)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.u(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(androidx.compose.material3.SliderState r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.material3.SliderColors r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function3 r32, float r33, float r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r26 = this;
            r15 = r26
            r14 = r36
            r13 = r37
            r0 = 49984771(0x2fab503, float:3.6838094E-37)
            r1 = r35
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            r11 = r27
            goto L_0x002a
        L_0x0018:
            r1 = r14 & 6
            r11 = r27
            if (r1 != 0) goto L_0x0029
            boolean r1 = r12.l(r11)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r14
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r3 = r28
            goto L_0x0045
        L_0x0033:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0030
            r3 = r28
            boolean r4 = r12.W(r3)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r29
            goto L_0x0060
        L_0x004e:
            r6 = r14 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r29
            boolean r7 = r12.d(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r7
        L_0x0060:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0079
            r7 = r13 & 8
            if (r7 != 0) goto L_0x0073
            r7 = r30
            boolean r9 = r12.W(r7)
            if (r9 == 0) goto L_0x0075
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r7 = r30
        L_0x0075:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r1 = r1 | r9
            goto L_0x007b
        L_0x0079:
            r7 = r30
        L_0x007b:
            r9 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0094
            r9 = r13 & 16
            if (r9 != 0) goto L_0x008e
            r9 = r31
            boolean r10 = r12.l(r9)
            if (r10 == 0) goto L_0x0090
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r9 = r31
        L_0x0090:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r10
            goto L_0x0096
        L_0x0094:
            r9 = r31
        L_0x0096:
            r10 = r13 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a1
            r1 = r1 | r16
            r0 = r32
            goto L_0x00b4
        L_0x00a1:
            r16 = r14 & r16
            r0 = r32
            if (r16 != 0) goto L_0x00b4
            boolean r17 = r12.l(r0)
            if (r17 == 0) goto L_0x00b0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r1 = r1 | r17
        L_0x00b4:
            r17 = r13 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00bf
            r1 = r1 | r18
            r5 = r33
            goto L_0x00d2
        L_0x00bf:
            r18 = r14 & r18
            r5 = r33
            if (r18 != 0) goto L_0x00d2
            boolean r18 = r12.h(r5)
            if (r18 == 0) goto L_0x00ce
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r1 = r1 | r18
        L_0x00d2:
            r8 = r13 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x00dd
            r1 = r1 | r19
            r0 = r34
            goto L_0x00f0
        L_0x00dd:
            r19 = r14 & r19
            r0 = r34
            if (r19 != 0) goto L_0x00f0
            boolean r19 = r12.h(r0)
            if (r19 == 0) goto L_0x00ec
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r1 = r1 | r19
        L_0x00f0:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f9
            r1 = r1 | r19
            goto L_0x0109
        L_0x00f9:
            r0 = r14 & r19
            if (r0 != 0) goto L_0x0109
            boolean r0 = r12.W(r15)
            if (r0 == 0) goto L_0x0106
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0108
        L_0x0106:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0108:
            r1 = r1 | r0
        L_0x0109:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r1
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            r19 = 0
            r20 = 1
            if (r0 == r3) goto L_0x0119
            r0 = r20
            goto L_0x011b
        L_0x0119:
            r0 = r19
        L_0x011b:
            r3 = r1 & 1
            boolean r0 = r12.E(r0, r3)
            if (r0 == 0) goto L_0x025b
            r12.p()
            r0 = r14 & 1
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0152
            boolean r0 = r12.J()
            if (r0 == 0) goto L_0x0134
            goto L_0x0152
        L_0x0134:
            r12.B()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x013d
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013d:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0142
            r1 = r1 & r3
        L_0x0142:
            r17 = r28
            r21 = r32
            r23 = r34
        L_0x0148:
            r22 = r5
            r18 = r6
            r19 = r7
            r20 = r9
            goto L_0x01e1
        L_0x0152:
            if (r2 == 0) goto L_0x0157
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0159
        L_0x0157:
            r0 = r28
        L_0x0159:
            if (r4 == 0) goto L_0x015d
            r6 = r20
        L_0x015d:
            r2 = r13 & 8
            if (r2 == 0) goto L_0x016c
            int r2 = r1 >> 24
            r2 = r2 & 14
            androidx.compose.material3.SliderColors r2 = r15.N(r12, r2)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r2
        L_0x016c:
            r2 = r13 & 16
            if (r2 == 0) goto L_0x01ac
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 <= r4) goto L_0x017e
            boolean r2 = r12.W(r7)
            if (r2 != 0) goto L_0x0182
        L_0x017e:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            if (r2 != r4) goto L_0x0185
        L_0x0182:
            r2 = r20
            goto L_0x0187
        L_0x0185:
            r2 = r19
        L_0x0187:
            r4 = r1 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r4 != r9) goto L_0x018f
            r19 = r20
        L_0x018f:
            r2 = r2 | r19
            java.lang.Object r4 = r12.g()
            if (r2 != 0) goto L_0x019f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x01a7
        L_0x019f:
            androidx.compose.material3.a6 r4 = new androidx.compose.material3.a6
            r4.<init>(r7, r6)
            r12.N(r4)
        L_0x01a7:
            r2 = r4
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r1 = r1 & r3
            r9 = r2
        L_0x01ac:
            if (r10 == 0) goto L_0x01c2
            java.lang.Object r2 = r12.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x01bf
            androidx.compose.material3.SliderDefaults$Track$5$1 r2 = androidx.compose.material3.SliderDefaults$Track$5$1.f11066z
            r12.N(r2)
        L_0x01bf:
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            goto L_0x01c4
        L_0x01c2:
            r2 = r32
        L_0x01c4:
            if (r17 == 0) goto L_0x01cb
            float r3 = androidx.compose.material3.SliderKt.f11073f
            r5 = r3
        L_0x01cb:
            if (r8 == 0) goto L_0x01d9
            float r3 = androidx.compose.material3.SliderKt.f11074g
            r17 = r0
            r21 = r2
            r23 = r3
            goto L_0x0148
        L_0x01d9:
            r23 = r34
            r17 = r0
            r21 = r2
            goto L_0x0148
        L_0x01e1:
            r12.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f3
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1446)"
            r3 = 49984771(0x2fab503, float:3.6838094E-37)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x01f3:
            androidx.compose.ui.unit.Dp$Companion r0 = androidx.compose.ui.unit.Dp.f19144A
            float r2 = r0.c()
            r0 = r1 & 14
            r3 = 805306416(0x30000030, float:4.6566395E-10)
            r0 = r0 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r3
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r16 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 112(0x70, float:1.57E-43)
            r24 = r0 | 6
            r10 = 0
            r25 = 0
            r0 = r26
            r1 = r27
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r25 = r12
            r13 = r16
            r14 = r24
            r0.x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x024c
            androidx.compose.runtime.ComposerKt.X()
        L_0x024c:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            goto L_0x026a
        L_0x025b:
            r25 = r12
            r25.B()
            r3 = r28
            r8 = r5
            r4 = r6
            r5 = r7
            r6 = r9
            r7 = r32
            r9 = r34
        L_0x026a:
            androidx.compose.runtime.ScopeUpdateScope r12 = r25.x()
            if (r12 == 0) goto L_0x0281
            androidx.compose.material3.h6 r13 = new androidx.compose.material3.h6
            r0 = r13
            r1 = r26
            r2 = r27
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.v(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(androidx.compose.material3.SliderState r28, float r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.material3.SliderColors r32, kotlin.jvm.functions.Function2 r33, kotlin.jvm.functions.Function3 r34, float r35, float r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r27 = this;
            r15 = r27
            r14 = r38
            r13 = r39
            r0 = 1691224881(0x64ce0b31, float:3.0406686E22)
            r1 = r37
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r14 | 6
            r11 = r28
            goto L_0x002a
        L_0x0018:
            r1 = r14 & 6
            r11 = r28
            if (r1 != 0) goto L_0x0029
            boolean r1 = r12.l(r11)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r14
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0033
            r1 = r1 | 48
            r10 = r29
            goto L_0x0045
        L_0x0033:
            r2 = r14 & 48
            r10 = r29
            if (r2 != 0) goto L_0x0045
            boolean r2 = r12.h(r10)
            if (r2 == 0) goto L_0x0042
            r2 = 32
            goto L_0x0044
        L_0x0042:
            r2 = 16
        L_0x0044:
            r1 = r1 | r2
        L_0x0045:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r3 = r30
            goto L_0x0060
        L_0x004e:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r30
            boolean r4 = r12.W(r3)
            if (r4 == 0) goto L_0x005d
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r4
        L_0x0060:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r6 = r31
            goto L_0x007b
        L_0x0069:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r31
            boolean r7 = r12.d(r6)
            if (r7 == 0) goto L_0x0078
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r7
        L_0x007b:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0094
            r7 = r13 & 16
            if (r7 != 0) goto L_0x008e
            r7 = r32
            boolean r9 = r12.W(r7)
            if (r9 == 0) goto L_0x0090
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r7 = r32
        L_0x0090:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r9
            goto L_0x0096
        L_0x0094:
            r7 = r32
        L_0x0096:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r14
            if (r9 != 0) goto L_0x00b1
            r9 = r13 & 32
            if (r9 != 0) goto L_0x00aa
            r9 = r33
            boolean r16 = r12.l(r9)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00aa:
            r9 = r33
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r16
            goto L_0x00b3
        L_0x00b1:
            r9 = r33
        L_0x00b3:
            r16 = r13 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r1 = r1 | r17
            r0 = r34
            goto L_0x00d1
        L_0x00be:
            r17 = r14 & r17
            r0 = r34
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r12.l(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r18
        L_0x00d1:
            r5 = r13 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00dc
            r1 = r1 | r18
            r8 = r35
            goto L_0x00ef
        L_0x00dc:
            r18 = r14 & r18
            r8 = r35
            if (r18 != 0) goto L_0x00ef
            boolean r19 = r12.h(r8)
            if (r19 == 0) goto L_0x00eb
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r1 = r1 | r19
        L_0x00ef:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fa
            r1 = r1 | r19
            r3 = r36
            goto L_0x010d
        L_0x00fa:
            r19 = r14 & r19
            r3 = r36
            if (r19 != 0) goto L_0x010d
            boolean r19 = r12.h(r3)
            if (r19 == 0) goto L_0x0109
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r1 = r1 | r19
        L_0x010d:
            r3 = r13 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0116
            r1 = r1 | r19
            goto L_0x0126
        L_0x0116:
            r3 = r14 & r19
            if (r3 != 0) goto L_0x0126
            boolean r3 = r12.W(r15)
            if (r3 == 0) goto L_0x0123
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0125
        L_0x0123:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0125:
            r1 = r1 | r3
        L_0x0126:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r3 & r1
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            r20 = 0
            r21 = 1
            if (r3 == r6) goto L_0x0136
            r3 = r21
            goto L_0x0138
        L_0x0136:
            r3 = r20
        L_0x0138:
            r6 = r1 & 1
            boolean r3 = r12.E(r3, r6)
            if (r3 == 0) goto L_0x0286
            r12.p()
            r3 = r14 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x0172
            boolean r3 = r12.J()
            if (r3 == 0) goto L_0x0154
            goto L_0x0172
        L_0x0154:
            r12.B()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x015d
            r1 = r1 & r22
        L_0x015d:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0162
            r1 = r1 & r6
        L_0x0162:
            r16 = r30
            r18 = r31
            r22 = r34
            r24 = r36
            r20 = r7
            r23 = r8
            r21 = r9
            goto L_0x020e
        L_0x0172:
            if (r2 == 0) goto L_0x0177
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0179
        L_0x0177:
            r2 = r30
        L_0x0179:
            if (r4 == 0) goto L_0x017e
            r3 = r21
            goto L_0x0180
        L_0x017e:
            r3 = r31
        L_0x0180:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x018f
            int r4 = r1 >> 27
            r4 = r4 & 14
            androidx.compose.material3.SliderColors r4 = r15.N(r12, r4)
            r1 = r1 & r22
            goto L_0x0190
        L_0x018f:
            r4 = r7
        L_0x0190:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x01d5
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r1
            r7 = r7 ^ 24576(0x6000, float:3.4438E-41)
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r7 <= r9) goto L_0x01a4
            boolean r7 = r12.W(r4)
            if (r7 != 0) goto L_0x01a8
        L_0x01a4:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r9) goto L_0x01ab
        L_0x01a8:
            r7 = r21
            goto L_0x01ad
        L_0x01ab:
            r7 = r20
        L_0x01ad:
            r9 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r9 != r6) goto L_0x01b5
            r20 = r21
        L_0x01b5:
            r6 = r7 | r20
            java.lang.Object r7 = r12.g()
            if (r6 != 0) goto L_0x01c5
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x01cd
        L_0x01c5:
            androidx.compose.material3.k6 r7 = new androidx.compose.material3.k6
            r7.<init>(r4, r3)
            r12.N(r7)
        L_0x01cd:
            r6 = r7
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r7
            goto L_0x01d6
        L_0x01d5:
            r6 = r9
        L_0x01d6:
            if (r16 == 0) goto L_0x01ec
            java.lang.Object r7 = r12.g()
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r7 != r9) goto L_0x01e9
            androidx.compose.material3.SliderDefaults$Track$8$1 r7 = androidx.compose.material3.SliderDefaults$Track$8$1.f11067z
            r12.N(r7)
        L_0x01e9:
            kotlin.jvm.functions.Function3 r7 = (kotlin.jvm.functions.Function3) r7
            goto L_0x01ee
        L_0x01ec:
            r7 = r34
        L_0x01ee:
            if (r5 == 0) goto L_0x01f5
            float r5 = androidx.compose.material3.SliderKt.f11073f
            goto L_0x01f6
        L_0x01f5:
            r5 = r8
        L_0x01f6:
            if (r0 == 0) goto L_0x020b
            float r0 = androidx.compose.material3.SliderKt.f11074g
            r24 = r0
        L_0x01fe:
            r16 = r2
            r18 = r3
            r20 = r4
            r23 = r5
            r21 = r6
            r22 = r7
            goto L_0x020e
        L_0x020b:
            r24 = r36
            goto L_0x01fe
        L_0x020e:
            r12.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0220
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1502)"
            r3 = 1691224881(0x64ce0b31, float:3.0406686E22)
            androidx.compose.runtime.ComposerKt.Y(r3, r1, r0, r2)
        L_0x0220:
            r0 = r1 & 14
            r0 = r0 | r19
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r1
            r17 = r0 | r2
            int r0 = r1 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r19 = r0 | 6
            r25 = 1
            r26 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r16
            r4 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r25 = r12
            r13 = r17
            r14 = r19
            r0.x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0277
            androidx.compose.runtime.ComposerKt.X()
        L_0x0277:
            r4 = r16
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            goto L_0x0296
        L_0x0286:
            r25 = r12
            r25.B()
            r4 = r30
            r5 = r31
            r10 = r36
            r6 = r7
            r7 = r9
            r9 = r8
            r8 = r34
        L_0x0296:
            androidx.compose.runtime.ScopeUpdateScope r13 = r25.x()
            if (r13 == 0) goto L_0x02af
            androidx.compose.material3.l6 r14 = new androidx.compose.material3.l6
            r0 = r14
            r1 = r27
            r2 = r28
            r3 = r29
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.w(androidx.compose.material3.SliderState, float, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void x(SliderState sliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, boolean z3, boolean z4, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        Modifier modifier2;
        Modifier modifier3;
        SliderState sliderState2 = sliderState;
        float f5 = f2;
        Modifier modifier4 = modifier;
        boolean z5 = z2;
        SliderColors sliderColors2 = sliderColors;
        int i6 = i2;
        Composer q2 = composer.q(133396521);
        if ((i6 & 6) == 0) {
            i4 = (q2.l(sliderState2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            i4 |= q2.h(f5) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i4 |= q2.W(modifier4) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i4 |= q2.d(z5) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i4 |= q2.W(sliderColors2) ? 16384 : 8192;
        }
        Function2 function22 = function2;
        if ((196608 & i6) == 0) {
            i4 |= q2.l(function22) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i4 |= q2.l(function3) ? 1048576 : 524288;
        } else {
            Function3 function32 = function3;
        }
        float f6 = f3;
        if ((i6 & 12582912) == 0) {
            i4 |= q2.h(f6) ? 8388608 : 4194304;
        }
        float f7 = f4;
        if ((i6 & 100663296) == 0) {
            i4 |= q2.h(f7) ? 67108864 : 33554432;
        }
        boolean z6 = z3;
        if ((i6 & 805306368) == 0) {
            i4 |= q2.d(z6) ? 536870912 : 268435456;
        }
        boolean z7 = z4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (q2.d(z7) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (q2.E(((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(133396521, i4, i5, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1587)");
            }
            long c2 = sliderColors2.c(z5, false);
            long c3 = sliderColors2.c(z5, true);
            long b2 = sliderColors2.b(z5, false);
            long b3 = sliderColors2.b(z5, true);
            if (sliderState.j() == Orientation.Vertical) {
                modifier2 = SizeKt.d(SizeKt.y(modifier4, SliderKt.p()), 0.0f, 1, (Object) null);
                if (sliderState.m()) {
                    modifier2 = ScaleKt.a(modifier2, 1.0f, -1.0f);
                }
            } else {
                modifier2 = SizeKt.i(SizeKt.h(modifier4, 0.0f, 1, (Object) null), SliderKt.p());
            }
            Modifier.Companion companion = Modifier.f15489d;
            int i7 = i4 & 112;
            boolean l2 = (i7 == 32) | q2.l(sliderState2);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new C0069c6(f5, sliderState2);
                q2.N(g2);
            }
            Modifier o0 = modifier2.o0(LayoutModifierKt.a(companion, (Function3) g2));
            long j2 = c3;
            long j3 = b3;
            boolean l3 = ((i4 & 1879048192) == 536870912) | ((29360128 & i4) == 8388608) | (i7 == 32) | q2.l(sliderState2) | q2.j(c2) | q2.j(j2) | q2.j(b2) | q2.j(b3) | ((234881024 & i4) == 67108864) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576) | ((i5 & 14) == 4);
            Object g3 = q2.g();
            if (l3 || g3 == Composer.f14567a.a()) {
                C0079d6 d6Var = r0;
                modifier3 = o0;
                C0079d6 d6Var2 = new C0079d6(f2, sliderState, c2, j2, b2, j3, f3, f4, function2, function3, z3, z4);
                g3 = d6Var;
                composer2 = q2;
                composer2.N(g3);
            } else {
                composer2 = q2;
                modifier3 = o0;
            }
            CanvasKt.b(modifier3, (Function1) g3, composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            C0089e6 e6Var = r0;
            C0089e6 e6Var2 = new C0089e6(this, sliderState, f2, modifier, z2, sliderColors, function2, function3, f3, f4, z3, z4, i2, i3);
            x2.a(e6Var);
        }
    }

    public final void y(RangeSliderState rangeSliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, Composer composer, int i2) {
        int i3;
        Composer composer2;
        RangeSliderState rangeSliderState2 = rangeSliderState;
        Modifier modifier2 = modifier;
        boolean z3 = z2;
        SliderColors sliderColors2 = sliderColors;
        int i4 = i2;
        Composer q2 = composer.q(-1719396904);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(rangeSliderState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        float f5 = f2;
        if ((i4 & 48) == 0) {
            i3 |= q2.h(f5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(modifier2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.W(sliderColors2) ? 16384 : 8192;
        }
        Function2 function22 = function2;
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function22) ? 131072 : 65536;
        }
        Function3 function32 = function3;
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(function32) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i3 |= q2.h(f3) ? 8388608 : 4194304;
        } else {
            float f6 = f3;
        }
        float f7 = f4;
        if ((i4 & 100663296) == 0) {
            i3 |= q2.h(f7) ? 67108864 : 33554432;
        }
        if (q2.E((i3 & 38347923) != 38347922, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1719396904, i3, -1, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1811)");
            }
            long c2 = sliderColors2.c(z3, false);
            long c3 = sliderColors2.c(z3, true);
            long b2 = sliderColors2.b(z3, false);
            long b3 = sliderColors2.b(z3, true);
            Modifier i5 = SizeKt.i(SizeKt.h(modifier2, 0.0f, 1, (Object) null), SliderKt.p());
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new C0205o6();
                q2.N(g2);
            }
            long j2 = c3;
            Modifier a2 = LayoutModifierKt.a(i5, (Function3) g2);
            boolean l2 = ((i3 & 112) == 32) | q2.l(rangeSliderState2) | q2.j(c2) | q2.j(j2) | q2.j(b2) | q2.j(b3) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576);
            Object g3 = q2.g();
            if (l2 || g3 == companion.a()) {
                C0214p6 p6Var = r0;
                C0214p6 p6Var2 = new C0214p6(f2, rangeSliderState, c2, j2, b2, b3, f3, f4, function2, function3);
                composer2 = q2;
                composer2.N(p6Var);
                g3 = p6Var;
            } else {
                composer2 = q2;
            }
            CanvasKt.b(a2, (Function1) g3, composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0059b6(this, rangeSliderState, f2, modifier, z2, sliderColors, function2, function3, f3, f4, i2));
        }
    }
}
