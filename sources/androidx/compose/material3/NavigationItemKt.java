package androidx.compose.material3;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

@Metadata
public final class NavigationItemKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10466a = Dp.m((float) 12);

    public static final TextStyle g(State state) {
        return (TextStyle) state.getValue();
    }

    public static final void h(boolean z2, TextStyle textStyle, NavigationItemColors navigationItemColors, boolean z3, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-2136267443);
        if ((i2 & 6) == 0) {
            i3 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.W(navigationItemColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= q2.d(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= q2.l(function2) ? 16384 : 8192;
        }
        if (q2.E((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2136267443, i3, -1, "androidx.compose.material3.StyledLabel (NavigationItem.kt:1083)");
            }
            ProvideContentColorTextStyleKt.b(navigationItemColors.a(z2, z3), textStyle, function2, q2, (i3 & 112) | ((i3 >> 6) & 896));
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new A4(z2, textStyle, navigationItemColors, z3, function2, i2));
        }
    }

    public static final Unit i(boolean z2, TextStyle textStyle, NavigationItemColors navigationItemColors, boolean z3, Function2 function2, int i2, Composer composer, int i3) {
        h(z2, textStyle, navigationItemColors, z3, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00f6, code lost:
        if (r6 > 0.0f) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.layout.MeasureResult p(androidx.compose.ui.layout.MeasureScope r20, int r21, kotlin.jvm.functions.Function0 r22, androidx.compose.ui.layout.Placeable r23, androidx.compose.ui.layout.Placeable r24, androidx.compose.ui.layout.Placeable r25, androidx.compose.ui.layout.Placeable r26, int r27, long r28, float r30, float r31, float r32, float r33, float r34, float r35, float r36) {
        /*
            r0 = r20
            r1 = r28
            r3 = r30
            r4 = r32
            r5 = r36
            java.lang.Object r6 = r22.invoke()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            androidx.compose.material3.NavigationItemIconPosition$Companion r7 = androidx.compose.material3.NavigationItemIconPosition.f10462b
            int r7 = r7.a()
            r8 = r21
            boolean r7 = androidx.compose.material3.NavigationItemIconPosition.d(r8, r7)
            int r8 = r23.L0()
            r9 = 2
            float r10 = (float) r9
            float r11 = r5 * r10
            float r12 = androidx.compose.ui.unit.Dp.m(r11)
            int r12 = r0.P1(r12)
            int r12 = r27 + r12
            int r8 = java.lang.Math.max(r8, r12)
            int r8 = androidx.compose.ui.unit.ConstraintsKt.g(r1, r8)
            int r12 = r25.L0()
            int r13 = r0.P1(r5)
            int r12 = r12 + r13
            int r12 = androidx.compose.ui.unit.ConstraintsKt.g(r1, r12)
            float r13 = (float) r8
            int r12 = r12 - r8
            float r8 = (float) r12
            float r8 = r8 * r6
            float r13 = r13 + r8
            int r8 = r25.C0()
            float r8 = (float) r8
            float r12 = r0.B1(r3)
            float r8 = r8 + r12
            int r12 = r23.C0()
            float r12 = (float) r12
            float r8 = r8 + r12
            int r8 = kotlin.math.MathKt.d(r8)
            int r8 = androidx.compose.ui.unit.ConstraintsKt.f(r1, r8)
            int r12 = r25.C0()
            int r1 = androidx.compose.ui.unit.ConstraintsKt.f(r1, r12)
            int r1 = androidx.compose.ui.util.MathHelpersKt.c(r8, r1, r6)
            int r2 = r0.P1(r5)
            int r8 = r26.L0()
            float r8 = (float) r8
            float r8 = r13 - r8
            float r8 = r8 / r10
            int r8 = kotlin.math.MathKt.d(r8)
            float r12 = (float) r2
            float r12 = r12 + r13
            int r14 = r26.L0()
            float r14 = (float) r14
            float r12 = r12 - r14
            float r12 = r12 / r10
            int r12 = kotlin.math.MathKt.d(r12)
            r14 = 0
            int r15 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r15 != 0) goto L_0x0095
            goto L_0x0099
        L_0x0095:
            int r15 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x009f
        L_0x0099:
            int r8 = androidx.compose.ui.util.MathHelpersKt.c(r8, r12, r6)
        L_0x009d:
            r12 = r8
            goto L_0x00a4
        L_0x009f:
            int r8 = r0.P1(r5)
            goto L_0x009d
        L_0x00a4:
            int r8 = r0.P1(r4)
            int r8 = r8 + r2
            r15 = r33
            int r15 = r0.P1(r15)
            int r15 = r15 + r2
            r14 = r31
            int r14 = r0.P1(r14)
            r9 = r34
            int r9 = r0.P1(r9)
            int r15 = androidx.compose.ui.util.MathHelpersKt.c(r8, r15, r6)
            int r14 = androidx.compose.ui.util.MathHelpersKt.c(r14, r9, r6)
            int r8 = r24.L0()
            float r4 = r4 * r10
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            float r9 = androidx.compose.ui.unit.Dp.m(r11)
            float r4 = r4 + r9
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            int r4 = r0.P1(r4)
            int r8 = r8 + r4
            int r4 = r23.L0()
            int r8 = r8 - r4
            r4 = 2
            int r8 = r8 / r4
            int r4 = r24.C0()
            int r4 = r4 + r14
            float r3 = r3 + r3
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            int r3 = r0.P1(r3)
            int r4 = r4 + r3
            if (r7 == 0) goto L_0x00f9
            r3 = 0
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            int r3 = r0.P1(r5)
            float r3 = (float) r3
            float r16 = r16 - r6
            float r3 = r3 * r16
        L_0x0102:
            int r5 = r24.L0()
            int r5 = r5 + r15
            r7 = r35
            int r7 = r0.P1(r7)
            int r5 = r5 + r7
            float r5 = (float) r5
            float r5 = r5 - r3
            int r3 = r23.C0()
            int r3 = r1 - r3
            r7 = 2
            int r3 = r3 / r7
            r7 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0123
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x0128
        L_0x0123:
            float r5 = r5 * r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
        L_0x0128:
            if (r7 >= 0) goto L_0x012b
            r3 = r4
        L_0x012b:
            int r4 = kotlin.math.MathKt.d(r13)
            androidx.compose.material3.w4 r19 = new androidx.compose.material3.w4
            r7 = r19
            r8 = r26
            r9 = r12
            r10 = r24
            r11 = r15
            r12 = r14
            r13 = r23
            r14 = r5
            r15 = r3
            r16 = r25
            r17 = r2
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 4
            r3 = 0
            r5 = 0
            r21 = r4
            r22 = r1
            r23 = r5
            r24 = r19
            r25 = r2
            r26 = r3
            androidx.compose.ui.layout.MeasureResult r0 = androidx.compose.ui.layout.MeasureScope.R1(r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationItemKt.p(androidx.compose.ui.layout.MeasureScope, int, kotlin.jvm.functions.Function0, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Placeable, int, long, float, float, float, float, float, float, float):androidx.compose.ui.layout.MeasureResult");
    }

    public static final Unit q(Placeable placeable, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, Object obj, int i5, Placeable placeable4, int i6, float f2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.r(placementScope, placeable, i2, 0, 0.0f, (Function1) null, 12, (Object) null);
        Placeable.PlacementScope.r(placementScope, placeable2, i3, i4, 0.0f, (Function1) null, 12, (Object) null);
        Placeable.PlacementScope.r(placementScope, placeable3, ((Number) obj).intValue(), i5, 0.0f, new B4(f2), 4, (Object) null);
        Placeable.PlacementScope.r(placementScope, placeable4, i6, 0, 0.0f, (Function1) null, 12, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit r(float f2, GraphicsLayerScope graphicsLayerScope) {
        float f3 = f2 - 0.5f;
        graphicsLayerScope.d(((float) 4) * f3 * f3);
        return Unit.f40552a;
    }

    public static final MeasureResult s(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j2) {
        long j3 = j2;
        int g2 = ConstraintsKt.g(j3, placeable2.L0());
        int f2 = ConstraintsKt.f(j3, placeable2.C0());
        return MeasureScope.R1(measureScope, g2, f2, (Map) null, new C0284x4(placeable3, (g2 - placeable3.L0()) / 2, (f2 - placeable3.C0()) / 2, placeable, (g2 - placeable.L0()) / 2, (f2 - placeable.C0()) / 2, placeable2, (g2 - placeable2.L0()) / 2, (f2 - placeable2.C0()) / 2), 4, (Object) null);
    }

    public static final Unit t(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable2, i4, i5, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable3, i6, i7, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final MeasureResult u(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j2, float f2) {
        MeasureScope measureScope2 = measureScope;
        long j3 = j2;
        float f3 = f2;
        int g2 = ConstraintsKt.g(j3, placeable3.L0());
        int f4 = ConstraintsKt.f(j3, placeable3.C0());
        int L0 = (g2 - placeable4.L0()) / 2;
        int C0 = (f4 - placeable4.C0()) / 2;
        int C02 = (f4 - placeable2.C0()) / 2;
        int C03 = (f4 - placeable.C0()) / 2;
        int L02 = (g2 - ((placeable2.L0() + measureScope2.P1(f3)) + placeable.L0())) / 2;
        return MeasureScope.R1(measureScope, g2, f4, (Map) null, new C0302z4(placeable4, L0, C0, placeable, placeable2.L0() + L02 + measureScope2.P1(f3), C03, placeable2, L02, C02, placeable3, (g2 - placeable3.L0()) / 2, (f4 - placeable3.C0()) / 2), 4, (Object) null);
    }

    public static final Unit v(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable placeable4, int i8, int i9, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable2, i4, i5, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable3, i6, i7, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable4, i8, i9, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final MeasureResult w(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j2, float f2, float f3, float f4) {
        MeasureScope measureScope2 = measureScope;
        long j3 = j2;
        float f5 = f2;
        float f6 = f3;
        float f7 = f4;
        int g2 = ConstraintsKt.g(j3, Math.max(placeable.L0(), placeable3.L0()));
        int f8 = ConstraintsKt.f(j3, MathKt.d(((float) placeable3.C0()) + measureScope2.B1(f5) + ((float) placeable.C0()) + (measureScope2.B1(f7) * ((float) 2))));
        int P1 = measureScope2.P1(Dp.m(f7 + f6));
        int L0 = (g2 - placeable2.L0()) / 2;
        int L02 = (g2 - placeable4.L0()) / 2;
        int P12 = P1 - measureScope2.P1(f6);
        return MeasureScope.R1(measureScope, g2, f8, (Map) null, new C0293y4(placeable4, L02, P12, placeable, (g2 - placeable.L0()) / 2, P1 + placeable2.C0() + measureScope2.P1(Dp.m(f5 + f6)), placeable2, L0, P1, placeable3, (g2 - placeable3.L0()) / 2, P12), 4, (Object) null);
    }

    public static final Unit x(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable placeable3, int i6, int i7, Placeable placeable4, int i8, int i9, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable2, i4, i5, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable3, i6, i7, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable4, i8, i9, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }
}
