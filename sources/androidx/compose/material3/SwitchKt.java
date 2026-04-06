package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SwitchKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11250a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11251b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11252c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f11253d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11254e;

    /* renamed from: f  reason: collision with root package name */
    public static final SnapSpec f11255f = new SnapSpec(0, 1, (DefaultConstructorMarker) null);

    static {
        SwitchTokens switchTokens = SwitchTokens.f14193a;
        float p2 = switchTokens.p();
        f11250a = p2;
        f11251b = switchTokens.z();
        f11252c = switchTokens.w();
        float t2 = switchTokens.t();
        f11253d = t2;
        f11254e = Dp.m(Dp.m(t2 - p2) / ((float) 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r22, kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function2 r25, boolean r26, androidx.compose.material3.SwitchColors r27, androidx.compose.foundation.interaction.MutableInteractionSource r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r7 = r23
            r8 = r30
            r0 = -263339167(0xfffffffff04dc361, float:-2.547225E29)
            r1 = r29
            androidx.compose.runtime.Composer r15 = r1.q(r0)
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r8 | 6
            r14 = r22
            goto L_0x0028
        L_0x0016:
            r1 = r8 & 6
            r14 = r22
            if (r1 != 0) goto L_0x0027
            boolean r1 = r15.d(r14)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r8
            goto L_0x0028
        L_0x0027:
            r1 = r8
        L_0x0028:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x003f
            boolean r2 = r15.l(r7)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r31 & 4
            if (r2 == 0) goto L_0x0048
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r3 = r24
            goto L_0x005a
        L_0x0048:
            r3 = r8 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r24
            boolean r4 = r15.W(r3)
            if (r4 == 0) goto L_0x0057
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r4
        L_0x005a:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r5 = r25
            goto L_0x0075
        L_0x0063:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0060
            r5 = r25
            boolean r6 = r15.l(r5)
            if (r6 == 0) goto L_0x0072
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r6
        L_0x0075:
            r6 = r31 & 16
            if (r6 == 0) goto L_0x007e
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r10 = r26
            goto L_0x0090
        L_0x007e:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007b
            r10 = r26
            boolean r11 = r15.d(r10)
            if (r11 == 0) goto L_0x008d
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r11
        L_0x0090:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x00aa
            r11 = r31 & 32
            if (r11 != 0) goto L_0x00a4
            r11 = r27
            boolean r12 = r15.W(r11)
            if (r12 == 0) goto L_0x00a6
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r11 = r27
        L_0x00a6:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r12
            goto L_0x00ac
        L_0x00aa:
            r11 = r27
        L_0x00ac:
            r12 = r31 & 64
            r13 = 1572864(0x180000, float:2.204052E-39)
            if (r12 == 0) goto L_0x00b6
            r1 = r1 | r13
        L_0x00b3:
            r13 = r28
            goto L_0x00c8
        L_0x00b6:
            r13 = r13 & r8
            if (r13 != 0) goto L_0x00b3
            r13 = r28
            boolean r16 = r15.W(r13)
            if (r16 == 0) goto L_0x00c4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c6
        L_0x00c4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c6:
            r1 = r1 | r16
        L_0x00c8:
            r16 = 599187(0x92493, float:8.3964E-40)
            r9 = r1 & r16
            r0 = 599186(0x92492, float:8.39638E-40)
            r17 = 1
            if (r9 == r0) goto L_0x00d7
            r0 = r17
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r9 = r1 & 1
            boolean r0 = r15.E(r0, r9)
            if (r0 == 0) goto L_0x01f7
            r15.p()
            r0 = r8 & 1
            r9 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = 6
            if (r0 == 0) goto L_0x0106
            boolean r0 = r15.J()
            if (r0 == 0) goto L_0x00f2
            goto L_0x0106
        L_0x00f2:
            r15.B()
            r0 = r31 & 32
            if (r0 == 0) goto L_0x00fa
            r1 = r1 & r9
        L_0x00fa:
            r9 = r1
            r18 = r5
            r19 = r10
            r20 = r11
            r21 = r13
            r13 = r24
            goto L_0x0137
        L_0x0106:
            if (r2 == 0) goto L_0x010b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010d
        L_0x010b:
            r0 = r24
        L_0x010d:
            if (r4 == 0) goto L_0x0110
            r5 = 0
        L_0x0110:
            if (r6 == 0) goto L_0x0114
            r10 = r17
        L_0x0114:
            r2 = r31 & 32
            if (r2 == 0) goto L_0x0120
            androidx.compose.material3.SwitchDefaults r2 = androidx.compose.material3.SwitchDefaults.f11247a
            androidx.compose.material3.SwitchColors r2 = r2.a(r15, r3)
            r1 = r1 & r9
            r11 = r2
        L_0x0120:
            if (r12 == 0) goto L_0x012d
            r13 = r0
            r9 = r1
            r18 = r5
            r19 = r10
            r20 = r11
            r21 = 0
            goto L_0x0137
        L_0x012d:
            r9 = r1
            r18 = r5
            r19 = r10
            r20 = r11
            r21 = r13
            r13 = r0
        L_0x0137:
            r15.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0149
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.Switch (Switch.kt:98)"
            r2 = -263339167(0xfffffffff04dc361, float:-2.547225E29)
            androidx.compose.runtime.ComposerKt.Y(r2, r9, r0, r1)
        L_0x0149:
            if (r21 != 0) goto L_0x016c
            r0 = 1768604058(0x696ac19a, float:1.7737681E25)
            r15.X(r0)
            java.lang.Object r0 = r15.g()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0164
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.a()
            r15.N(r0)
        L_0x0164:
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r15.M()
            r16 = r0
            goto L_0x0177
        L_0x016c:
            r0 = 334145757(0x13eaa8dd, float:5.9236417E-27)
            r15.X(r0)
            r15.M()
            r16 = r21
        L_0x0177:
            if (r7 == 0) goto L_0x019b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.InteractiveComponentSizeKt.h(r0)
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.f18040b
            int r1 = r1.g()
            r4 = 0
            androidx.compose.ui.semantics.Role r5 = androidx.compose.ui.semantics.Role.j(r1)
            r1 = r22
            r2 = r16
            r12 = r3
            r10 = 0
            r11 = 0
            r3 = r4
            r4 = r19
            r6 = r23
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a0
        L_0x019b:
            r12 = r3
            r10 = 0
            r11 = 0
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
        L_0x01a0:
            androidx.compose.ui.Modifier r0 = r13.o0(r0)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r1 = r1.e()
            r2 = 2
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.E(r0, r1, r10, r2, r11)
            float r1 = f11252c
            float r2 = f11253d
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.p(r0, r1, r2)
            androidx.compose.material3.tokens.SwitchTokens r1 = androidx.compose.material3.tokens.SwitchTokens.f14193a
            androidx.compose.material3.tokens.ShapeKeyTokens r1 = r1.m()
            androidx.compose.ui.graphics.Shape r1 = androidx.compose.material3.ShapesKt.g(r1, r15, r12)
            int r2 = r9 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            int r4 = r9 >> 6
            r5 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r4
            r17 = r3 | r2
            r9 = r0
            r10 = r22
            r11 = r19
            r12 = r20
            r0 = r13
            r13 = r18
            r14 = r16
            r2 = r15
            r15 = r1
            r16 = r2
            e(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01ef
            androidx.compose.runtime.ComposerKt.X()
        L_0x01ef:
            r3 = r0
            r4 = r18
            r5 = r19
            r6 = r20
            goto L_0x0202
        L_0x01f7:
            r2 = r15
            r2.B()
            r3 = r24
            r4 = r5
            r5 = r10
            r6 = r11
            r21 = r13
        L_0x0202:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.x()
            if (r10 == 0) goto L_0x021b
            androidx.compose.material3.L6 r11 = new androidx.compose.material3.L6
            r0 = r11
            r1 = r22
            r2 = r23
            r7 = r21
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.c(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit d(boolean z2, Function1 function1, Modifier modifier, Function2 function2, boolean z3, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        c(z2, function1, modifier, function2, z3, switchColors, mutableInteractionSource, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void e(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, Function2 function2, InteractionSource interactionSource, Shape shape, Composer composer, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        boolean z4 = z2;
        boolean z5 = z3;
        SwitchColors switchColors2 = switchColors;
        Function2 function22 = function2;
        InteractionSource interactionSource2 = interactionSource;
        Shape shape2 = shape;
        int i4 = i2;
        Composer q2 = composer.q(-670917213);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.d(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(switchColors2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function22) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.W(interactionSource2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.W(shape2) ? 1048576 : 524288;
        }
        if (q2.E((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-670917213, i3, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            long e2 = switchColors2.e(z5, z4);
            long d2 = switchColors2.d(z5, z4);
            SwitchTokens switchTokens = SwitchTokens.f14193a;
            Shape g2 = ShapesKt.g(switchTokens.v(), q2, 6);
            long j2 = d2;
            Modifier a2 = BackgroundKt.a(BorderKt.f(modifier2, switchTokens.u(), switchColors2.a(z5, z4), g2), e2, g2);
            Alignment.Companion companion = Alignment.f15444a;
            MeasurePolicy g3 = BoxKt.g(companion.o(), false);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, a2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            int i5 = i3;
            Updater.g(b2, g3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e3, companion2.d());
            Modifier a5 = BackgroundKt.a(IndicationKt.b(BoxScopeInstance.f3797a.g(Modifier.f15489d, companion.h()).o0(new ThumbElement(interactionSource2, z4, MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, q2, 6))), interactionSource2, RippleKt.e(false, Dp.m(switchTokens.s() / ((float) 2)), 0, 4, (Object) null)), j2, shape2);
            MeasurePolicy g4 = BoxKt.g(companion.e(), false);
            int a6 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, a5);
            Function0 a7 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a7);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g4, companion2.c());
            Updater.g(b4, I2, companion2.e());
            Function2 b5 = companion2.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a6))) {
                b4.N(Integer.valueOf(a6));
                b4.A(Integer.valueOf(a6), b5);
            }
            Updater.g(b4, e4, companion2.d());
            if (function22 != null) {
                q2.X(1235836927);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(switchColors2.c(z5, z4))), function22, q2, ProvidedValue.f14769i | ((i5 >> 9) & 112));
                q2.M();
            } else {
                q2.X(1236071411);
                q2.M();
            }
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new M6(modifier, z2, z3, switchColors, function2, interactionSource, shape, i2));
        }
    }

    public static final Unit f(Modifier modifier, boolean z2, boolean z3, SwitchColors switchColors, Function2 function2, InteractionSource interactionSource, Shape shape, int i2, Composer composer, int i3) {
        e(modifier, z2, z3, switchColors, function2, interactionSource, shape, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final float k() {
        return f11250a;
    }

    public static final float l() {
        return f11251b;
    }
}
