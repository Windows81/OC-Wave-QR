package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class PullRefreshIndicatorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9006a = Dp.m((float) 40);

    /* renamed from: b  reason: collision with root package name */
    public static final RoundedCornerShape f9007b = RoundedCornerShapeKt.f();

    /* renamed from: c  reason: collision with root package name */
    public static final float f9008c = Dp.m((float) 7.5d);

    /* renamed from: d  reason: collision with root package name */
    public static final float f9009d = Dp.m((float) 2.5d);

    /* renamed from: e  reason: collision with root package name */
    public static final float f9010e = Dp.m((float) 10);

    /* renamed from: f  reason: collision with root package name */
    public static final float f9011f = Dp.m((float) 5);

    /* renamed from: g  reason: collision with root package name */
    public static final float f9012g = Dp.m((float) 6);

    /* renamed from: h  reason: collision with root package name */
    public static final TweenSpec f9013h = AnimationSpecKt.n(300, 0, EasingKt.e(), 2, (Object) null);

    public static final ArrowValues a(float f2) {
        float f3 = 0.0f;
        float max = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * ((float) 5)) / ((float) 3);
        float abs = Math.abs(f2) - 1.0f;
        if (abs >= 0.0f) {
            f3 = abs;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        float pow = (((0.4f * max) - 16.0f) + (f3 - (((float) Math.pow((double) f3, (double) 2)) / ((float) 4)))) * 0.5f;
        float f4 = (float) 360;
        return new ArrowValues(pow, pow * f4, ((0.8f * max) + pow) * f4, Math.min(1.0f, max));
    }

    public static final void b(PullRefreshState pullRefreshState, long j2, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        PullRefreshState pullRefreshState2 = pullRefreshState;
        Modifier modifier2 = modifier;
        int i4 = i2;
        Composer q2 = composer.q(-486016981);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(pullRefreshState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        long j3 = j2;
        if ((i4 & 48) == 0) {
            i3 |= q2.j(j3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.W(modifier2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-486016981, i3, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            Path path = g2;
            if (g2 == companion.a()) {
                Path a2 = AndroidPath_androidKt.a();
                a2.m(PathFillType.f16071b.a());
                q2.N(a2);
                path = a2;
            }
            Path path2 = (Path) path;
            boolean W = q2.W(pullRefreshState2);
            Object g3 = q2.g();
            if (W || g3 == companion.a()) {
                g3 = SnapshotStateKt.e(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState2));
                q2.N(g3);
            }
            State d2 = AnimateAsStateKt.d(c((State) g3), f9013h, 0.0f, (String) null, (Function1) null, q2, 48, 28);
            Modifier d3 = SemanticsModifierKt.d(modifier2, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.f9014z, 1, (Object) null);
            boolean l2 = q2.l(pullRefreshState2) | q2.W(d2) | ((i3 & 112) == 32) | q2.l(path2);
            Object g4 = q2.g();
            if (l2 || g4 == companion.a()) {
                composer2 = q2;
                PullRefreshIndicatorKt$CircularArrowIndicator$2$1 pullRefreshIndicatorKt$CircularArrowIndicator$2$1 = new PullRefreshIndicatorKt$CircularArrowIndicator$2$1(pullRefreshState, d2, j2, path2);
                composer2.N(pullRefreshIndicatorKt$CircularArrowIndicator$2$1);
                g4 = pullRefreshIndicatorKt$CircularArrowIndicator$2$1;
            } else {
                composer2 = q2;
            }
            CanvasKt.b(d3, (Function1) g4, composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j2, modifier, i2));
        }
    }

    public static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(boolean r30, androidx.compose.material.pullrefresh.PullRefreshState r31, androidx.compose.ui.Modifier r32, long r33, long r35, boolean r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r30
            r2 = r31
            r9 = r39
            r0 = 32
            r3 = 2
            r4 = 6
            r5 = 16
            r6 = 308716636(0x1266a45c, float:7.277779E-28)
            r7 = r38
            androidx.compose.runtime.Composer r7 = r7.q(r6)
            r8 = 1
            r10 = r40 & 1
            r11 = 4
            if (r10 == 0) goto L_0x001e
            r10 = r9 | 6
            goto L_0x002e
        L_0x001e:
            r10 = r9 & 6
            if (r10 != 0) goto L_0x002d
            boolean r10 = r7.d(r1)
            if (r10 == 0) goto L_0x002a
            r10 = r11
            goto L_0x002b
        L_0x002a:
            r10 = r3
        L_0x002b:
            r10 = r10 | r9
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            r3 = r40 & 2
            if (r3 == 0) goto L_0x0035
            r10 = r10 | 48
            goto L_0x0043
        L_0x0035:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x0043
            boolean r3 = r7.l(r2)
            if (r3 == 0) goto L_0x0041
            r3 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r5
        L_0x0042:
            r10 = r10 | r3
        L_0x0043:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x004c
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r12 = r32
            goto L_0x005e
        L_0x004c:
            r12 = r9 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0049
            r12 = r32
            boolean r13 = r7.W(r12)
            if (r13 == 0) goto L_0x005b
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r13 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r10 = r10 | r13
        L_0x005e:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0077
            r13 = r40 & 8
            if (r13 != 0) goto L_0x0071
            r13 = r33
            boolean r15 = r7.j(r13)
            if (r15 == 0) goto L_0x0073
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0071:
            r13 = r33
        L_0x0073:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r10 = r10 | r15
            goto L_0x0079
        L_0x0077:
            r13 = r33
        L_0x0079:
            r15 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0090
            r15 = r40 & 16
            r11 = r35
            if (r15 != 0) goto L_0x008c
            boolean r15 = r7.j(r11)
            if (r15 == 0) goto L_0x008c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r10 = r10 | r15
            goto L_0x0092
        L_0x0090:
            r11 = r35
        L_0x0092:
            r0 = r40 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x009c
            r10 = r10 | r15
        L_0x0099:
            r15 = r37
            goto L_0x00ae
        L_0x009c:
            r15 = r15 & r9
            if (r15 != 0) goto L_0x0099
            r15 = r37
            boolean r16 = r7.d(r15)
            if (r16 == 0) goto L_0x00aa
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r10 = r10 | r16
        L_0x00ae:
            r16 = 74899(0x12493, float:1.04956E-40)
            r6 = r10 & r16
            r4 = 74898(0x12492, float:1.04954E-40)
            r5 = 0
            if (r6 == r4) goto L_0x00bb
            r4 = r8
            goto L_0x00bc
        L_0x00bb:
            r4 = r5
        L_0x00bc:
            r6 = r10 & 1
            boolean r4 = r7.E(r4, r6)
            if (r4 == 0) goto L_0x027c
            r7.p()
            r4 = r9 & 1
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x00ec
            boolean r4 = r7.J()
            if (r4 == 0) goto L_0x00d5
            goto L_0x00ec
        L_0x00d5:
            r7.B()
            r0 = r40 & 8
            if (r0 == 0) goto L_0x00de
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00de:
            r0 = 16
            r0 = r40 & 16
            if (r0 == 0) goto L_0x00e5
            r10 = r10 & r6
        L_0x00e5:
            r3 = r32
        L_0x00e7:
            r18 = r13
            r0 = r15
        L_0x00ea:
            r14 = r11
            goto L_0x011b
        L_0x00ec:
            if (r3 == 0) goto L_0x00f1
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00f3
        L_0x00f1:
            r3 = r32
        L_0x00f3:
            r4 = r40 & 8
            if (r4 == 0) goto L_0x0104
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            r13 = 6
            androidx.compose.material.Colors r4 = r4.a(r7, r13)
            long r13 = r4.n()
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0104:
            r4 = 16
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0115
            int r4 = r10 >> 9
            r4 = r4 & 14
            long r11 = androidx.compose.material.ColorsKt.b(r13, r7, r4)
            r4 = r10 & r6
            r10 = r4
        L_0x0115:
            if (r0 == 0) goto L_0x00e7
            r0 = r5
            r18 = r13
            goto L_0x00ea
        L_0x011b:
            r7.U()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x012d
            r4 = -1
            java.lang.String r6 = "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)"
            r11 = 308716636(0x1266a45c, float:7.277779E-28)
            androidx.compose.runtime.ComposerKt.Y(r11, r10, r4, r6)
        L_0x012d:
            r4 = r10 & 14
            r6 = 4
            if (r4 != r6) goto L_0x0134
            r6 = r8
            goto L_0x0135
        L_0x0134:
            r6 = r5
        L_0x0135:
            boolean r11 = r7.W(r2)
            r6 = r6 | r11
            java.lang.Object r11 = r7.g()
            if (r6 != 0) goto L_0x0148
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r11 != r6) goto L_0x0154
        L_0x0148:
            androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1 r6 = new androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1
            r6.<init>(r1, r2)
            androidx.compose.runtime.State r11 = androidx.compose.runtime.SnapshotStateKt.e(r6)
            r7.N(r11)
        L_0x0154:
            androidx.compose.runtime.State r11 = (androidx.compose.runtime.State) r11
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.material.ElevationOverlayKt.d()
            java.lang.Object r6 = r7.C(r6)
            androidx.compose.material.ElevationOverlay r6 = (androidx.compose.material.ElevationOverlay) r6
            r12 = 0
            if (r6 != 0) goto L_0x016e
            r6 = -1347611339(0xffffffffafad1535, float:-3.1483585E-10)
            r7.X(r6)
            r7.M()
            r6 = r12
            goto L_0x0191
        L_0x016e:
            r13 = 1619096652(0x6081744c, float:7.462531E19)
            r7.X(r13)
            float r13 = f9012g
            int r10 = r10 >> 9
            r10 = r10 & 14
            r10 = r10 | 48
            r32 = r6
            r33 = r18
            r35 = r13
            r36 = r7
            r37 = r10
            long r20 = r32.a(r33, r35, r36, r37)
            r7.M()
            androidx.compose.ui.graphics.Color r6 = androidx.compose.ui.graphics.Color.h(r20)
        L_0x0191:
            if (r6 == 0) goto L_0x019a
            long r20 = r6.v()
            r8 = r20
            goto L_0x019c
        L_0x019a:
            r8 = r18
        L_0x019c:
            float r6 = f9006a
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.t(r3, r6)
            androidx.compose.ui.Modifier r20 = androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt.a(r6, r2, r0)
            boolean r6 = e(r11)
            if (r6 == 0) goto L_0x01b1
            float r6 = f9012g
        L_0x01ae:
            r21 = r6
            goto L_0x01b7
        L_0x01b1:
            float r6 = (float) r5
            float r6 = androidx.compose.ui.unit.Dp.m(r6)
            goto L_0x01ae
        L_0x01b7:
            androidx.compose.foundation.shape.RoundedCornerShape r6 = f9007b
            r28 = 24
            r29 = 0
            r23 = 1
            r24 = 0
            r26 = 0
            r22 = r6
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.draw.ShadowKt.b(r20, r21, r22, r23, r24, r26, r28, r29)
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.BackgroundKt.a(r10, r8, r6)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r8 = r8.o()
            androidx.compose.ui.layout.MeasurePolicy r8 = androidx.compose.foundation.layout.BoxKt.g(r8, r5)
            int r9 = androidx.compose.runtime.ComposablesKt.a(r7, r5)
            androidx.compose.runtime.CompositionLocalMap r10 = r7.I()
            androidx.compose.ui.Modifier r6 = androidx.compose.ui.ComposedModifierKt.e(r7, r6)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r11.a()
            androidx.compose.runtime.Applier r17 = r7.v()
            if (r17 != 0) goto L_0x01f2
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01f2:
            r7.s()
            boolean r17 = r7.n()
            if (r17 == 0) goto L_0x01ff
            r7.y(r13)
            goto L_0x0202
        L_0x01ff:
            r7.K()
        L_0x0202:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r7)
            kotlin.jvm.functions.Function2 r5 = r11.c()
            androidx.compose.runtime.Updater.g(r13, r8, r5)
            kotlin.jvm.functions.Function2 r5 = r11.e()
            androidx.compose.runtime.Updater.g(r13, r10, r5)
            kotlin.jvm.functions.Function2 r5 = r11.b()
            boolean r8 = r13.n()
            if (r8 != 0) goto L_0x022c
            java.lang.Object r8 = r13.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
            if (r8 != 0) goto L_0x023a
        L_0x022c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r13.N(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r13.A(r8, r5)
        L_0x023a:
            kotlin.jvm.functions.Function2 r5 = r11.d()
            androidx.compose.runtime.Updater.g(r13, r6, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r30)
            r5 = 100
            r6 = 0
            r8 = 6
            androidx.compose.animation.core.TweenSpec r12 = androidx.compose.animation.core.AnimationSpecKt.n(r5, r6, r12, r8, r12)
            androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1 r5 = new androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$1$1
            r5.<init>(r14, r2)
            r6 = 54
            r8 = 1853731063(0x6e7db0f7, float:1.9628411E28)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r9, r5, r7, r6)
            r4 = r4 | 24960(0x6180, float:3.4976E-41)
            r17 = 10
            r11 = 0
            r13 = 0
            r8 = r14
            r14 = r5
            r15 = r7
            r16 = r4
            androidx.compose.animation.CrossfadeKt.b(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.T()
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0278
            androidx.compose.runtime.ComposerKt.X()
        L_0x0278:
            r15 = r0
            r4 = r18
            goto L_0x0283
        L_0x027c:
            r7.B()
            r3 = r32
            r8 = r11
            r4 = r13
        L_0x0283:
            androidx.compose.runtime.ScopeUpdateScope r11 = r7.x()
            if (r11 == 0) goto L_0x029c
            androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2 r12 = new androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$PullRefreshIndicator$2
            r0 = r12
            r1 = r30
            r2 = r31
            r6 = r8
            r8 = r15
            r9 = r39
            r10 = r40
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10)
            r11.a(r12)
        L_0x029c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt.d(boolean, androidx.compose.material.pullrefresh.PullRefreshState, androidx.compose.ui.Modifier, long, long, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void k(DrawScope drawScope, Path path, Rect rect, long j2, float f2, ArrowValues arrowValues) {
        DrawScope drawScope2 = drawScope;
        Path path2 = path;
        path.b();
        path.q(0.0f, 0.0f);
        float f3 = f9010e;
        path.z(drawScope.B1(f3) * arrowValues.c(), 0.0f);
        path.z((drawScope.B1(f3) * arrowValues.c()) / ((float) 2), drawScope.B1(f9011f) * arrowValues.c());
        path.v(OffsetKt.a(((Math.min(rect.v(), rect.n()) / 2.0f) + Offset.m(rect.m())) - ((drawScope.B1(f3) * arrowValues.c()) / 2.0f), Offset.n(rect.m()) + (drawScope.B1(f9009d) / 2.0f)));
        path.close();
        float a2 = arrowValues.a();
        long T1 = drawScope.T1();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().i(a2, T1);
            DrawScope.E1(drawScope, path, j2, f2, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        } finally {
            G1.j().t();
            G1.f(c2);
        }
    }
}
