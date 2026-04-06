package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnackbarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f8458a = Dp.m((float) 30);

    /* renamed from: b  reason: collision with root package name */
    public static final float f8459b = Dp.m((float) 16);

    /* renamed from: c  reason: collision with root package name */
    public static final float f8460c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f8461d = Dp.m((float) 2);

    /* renamed from: e  reason: collision with root package name */
    public static final float f8462e = Dp.m((float) 6);

    /* renamed from: f  reason: collision with root package name */
    public static final float f8463f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f8464g = Dp.m((float) 12);

    /* renamed from: h  reason: collision with root package name */
    public static final float f8465h = Dp.m((float) 48);

    /* renamed from: i  reason: collision with root package name */
    public static final float f8466i = Dp.m((float) 68);

    static {
        float f2 = (float) 8;
        f8460c = Dp.m(f2);
        f8463f = Dp.m(f2);
    }

    public static final void a(Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        Function2 function23 = function2;
        Function2 function24 = function22;
        int i4 = i2;
        Composer q2 = composer.q(-1229075900);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function23) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function24) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1229075900, i3, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            float f2 = f8459b;
            float f3 = f8460c;
            Modifier m2 = PaddingKt.m(h2, f2, 0.0f, f3, f8461d, 2, (Object) null);
            Arrangement.Vertical g2 = Arrangement.f3739a.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, m2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
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
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Modifier m3 = PaddingKt.m(AlignmentLineKt.g(companion, f8458a, f8464g), 0.0f, 0.0f, f3, 0.0f, 11, (Object) null);
            MeasurePolicy g3 = BoxKt.g(companion2.o(), false);
            int a5 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, m3);
            Function0 a6 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a6);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g3, companion3.c());
            Updater.g(b4, I2, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a5))) {
                b4.N(Integer.valueOf(a5));
                b4.A(Integer.valueOf(a5), b5);
            }
            Updater.g(b4, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function23.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            Modifier b6 = columnScopeInstance.b(companion, companion2.j());
            MeasurePolicy g4 = BoxKt.g(companion2.o(), false);
            int a7 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I3 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, b6);
            Function0 a8 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a8);
            } else {
                q2.K();
            }
            Composer b7 = Updater.b(q2);
            Updater.g(b7, g4, companion3.c());
            Updater.g(b7, I3, companion3.e());
            Function2 b8 = companion3.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a7))) {
                b7.N(Integer.valueOf(a7));
                b7.A(Integer.valueOf(a7), b8);
            }
            Updater.g(b7, e4, companion3.d());
            function24.m(q2, Integer.valueOf((i3 >> 3) & 14));
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
            x2.a(new SnackbarKt$NewLineButtonSnackbar$2(function23, function24, i4));
        }
    }

    public static final void b(Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        Function2 function23 = function2;
        Function2 function24 = function22;
        int i4 = i2;
        Composer q2 = composer.q(-534813202);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function23) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function24) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-534813202, i3, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:312)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier m2 = PaddingKt.m(companion, f8459b, 0.0f, f8460c, 0.0f, 10, (Object) null);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new SnackbarKt$OneRowSnackbar$2$1("action", "text");
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, m2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion, "text"), 0.0f, f8462e, 1, (Object) null);
            Alignment.Companion companion3 = Alignment.f15444a;
            MeasurePolicy g3 = BoxKt.g(companion3.o(), false);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, k2);
            Function0 a5 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g3, companion2.c());
            Updater.g(b4, I2, companion2.e());
            Function2 b5 = companion2.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a4))) {
                b4.N(Integer.valueOf(a4));
                b4.A(Integer.valueOf(a4), b5);
            }
            Updater.g(b4, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function23.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            Modifier b6 = LayoutIdKt.b(companion, "action");
            MeasurePolicy g4 = BoxKt.g(companion3.o(), false);
            int a6 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I3 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, b6);
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
            Composer b7 = Updater.b(q2);
            Updater.g(b7, g4, companion2.c());
            Updater.g(b7, I3, companion2.e());
            Function2 b8 = companion2.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a6))) {
                b7.N(Integer.valueOf(a6));
                b7.A(Integer.valueOf(a6), b8);
            }
            Updater.g(b7, e4, companion2.d());
            function24.m(q2, Integer.valueOf((i3 >> 3) & 14));
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
            x2.a(new SnackbarKt$OneRowSnackbar$3(function23, function24, i4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function2 r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, kotlin.jvm.functions.Function2 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r10 = r36
            r11 = r38
            r12 = r39
            r0 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            r1 = r37
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0019
            r3 = r11 | 6
            r4 = r3
            r3 = r27
            goto L_0x002d
        L_0x0019:
            r3 = r11 & 6
            if (r3 != 0) goto L_0x002a
            r3 = r27
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r11
            goto L_0x002d
        L_0x002a:
            r3 = r27
            r4 = r11
        L_0x002d:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r6 = r28
            goto L_0x0048
        L_0x0036:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x0033
            r6 = r28
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r29
            goto L_0x0063
        L_0x0051:
            r8 = r11 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r29
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007c
            r9 = r12 & 8
            if (r9 != 0) goto L_0x0076
            r9 = r30
            boolean r13 = r1.W(r9)
            if (r13 == 0) goto L_0x0078
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r9 = r30
        L_0x0078:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r13
            goto L_0x007e
        L_0x007c:
            r9 = r30
        L_0x007e:
            r13 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0097
            r13 = r12 & 16
            if (r13 != 0) goto L_0x0091
            r13 = r31
            boolean r15 = r1.j(r13)
            if (r15 == 0) goto L_0x0093
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r13 = r31
        L_0x0093:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r15
            goto L_0x0099
        L_0x0097:
            r13 = r31
        L_0x0099:
            r15 = 196608(0x30000, float:2.75506E-40)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00b1
            r15 = r12 & 32
            r8 = r33
            if (r15 != 0) goto L_0x00ad
            boolean r15 = r1.j(r8)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r15
            goto L_0x00b3
        L_0x00b1:
            r8 = r33
        L_0x00b3:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00be
            r4 = r4 | r16
            r0 = r35
            goto L_0x00d1
        L_0x00be:
            r17 = r11 & r16
            r0 = r35
            if (r17 != 0) goto L_0x00d1
            boolean r18 = r1.h(r0)
            if (r18 == 0) goto L_0x00cd
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r4 = r4 | r18
        L_0x00d1:
            r0 = r12 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r4 = r4 | r18
            goto L_0x00ea
        L_0x00da:
            r0 = r11 & r18
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r1.l(r10)
            if (r0 == 0) goto L_0x00e7
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r4 = r4 | r0
        L_0x00ea:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r4
            r3 = 4793490(0x492492, float:6.71711E-39)
            r18 = 0
            r6 = 1
            if (r0 == r3) goto L_0x00f8
            r0 = r6
            goto L_0x00fa
        L_0x00f8:
            r0 = r18
        L_0x00fa:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x01e4
            r1.p()
            r0 = r11 & 1
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0139
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0116
            goto L_0x0139
        L_0x0116:
            r1.B()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x011f
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x011f:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0125
            r4 = r4 & r19
        L_0x0125:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x012a
            r4 = r4 & r3
        L_0x012a:
            r0 = r27
            r2 = r28
            r3 = r29
            r5 = r30
            r25 = r8
            r7 = r13
        L_0x0135:
            r9 = r4
            r4 = r35
            goto L_0x0190
        L_0x0139:
            if (r2 == 0) goto L_0x013e
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0140
        L_0x013e:
            r0 = r27
        L_0x0140:
            if (r5 == 0) goto L_0x0144
            r2 = 0
            goto L_0x0146
        L_0x0144:
            r2 = r28
        L_0x0146:
            if (r7 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r18 = r29
        L_0x014b:
            r5 = r12 & 8
            r7 = 6
            if (r5 == 0) goto L_0x015d
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r5 = r5.b(r1, r7)
            androidx.compose.foundation.shape.CornerBasedShape r5 = r5.c()
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x015f
        L_0x015d:
            r5 = r30
        L_0x015f:
            r20 = r12 & 16
            if (r20 == 0) goto L_0x016b
            androidx.compose.material.SnackbarDefaults r13 = androidx.compose.material.SnackbarDefaults.f8428a
            long r13 = r13.a(r1, r7)
            r4 = r4 & r19
        L_0x016b:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x017b
            androidx.compose.material.MaterialTheme r8 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r8 = r8.a(r1, r7)
            long r8 = r8.n()
            r3 = r3 & r4
            r4 = r3
        L_0x017b:
            if (r15 == 0) goto L_0x018a
            float r3 = (float) r7
            float r3 = androidx.compose.ui.unit.Dp.m(r3)
            r25 = r8
            r7 = r13
            r9 = r4
            r4 = r3
            r3 = r18
            goto L_0x0190
        L_0x018a:
            r25 = r8
            r7 = r13
            r3 = r18
            goto L_0x0135
        L_0x0190:
            r1.U()
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x01a2
            r13 = -1
            java.lang.String r14 = "androidx.compose.material.Snackbar (Snackbar.kt:94)"
            r15 = -558258760(0xffffffffdeb9a5b8, float:-6.6886503E18)
            androidx.compose.runtime.ComposerKt.Y(r15, r9, r13, r14)
        L_0x01a2:
            androidx.compose.material.SnackbarKt$Snackbar$1 r13 = new androidx.compose.material.SnackbarKt$Snackbar$1
            r13.<init>(r2, r10, r3)
            r14 = 54
            r15 = -2084221700(0xffffffff83c54cfc, float:-1.1596294E-36)
            androidx.compose.runtime.internal.ComposableLambda r21 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r6, r13, r1, r14)
            r6 = r9 & 14
            r6 = r6 | r16
            int r13 = r9 >> 6
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r6 = r6 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r13
            int r9 = r9 >> 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r13
            r23 = r6 | r9
            r24 = 16
            r19 = 0
            r13 = r0
            r14 = r5
            r15 = r7
            r17 = r25
            r20 = r4
            r22 = r1
            androidx.compose.material.SurfaceKt.a(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x01df
            androidx.compose.runtime.ComposerKt.X()
        L_0x01df:
            r9 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            goto L_0x01f4
        L_0x01e4:
            r1.B()
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r25 = r8
            r7 = r13
            r9 = r35
        L_0x01f4:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0210
            androidx.compose.material.SnackbarKt$Snackbar$2 r14 = new androidx.compose.material.SnackbarKt$Snackbar$2
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r25
            r10 = r36
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.c(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.material.SnackbarData r27, androidx.compose.ui.Modifier r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, long r35, float r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r27
            r12 = r39
            r13 = r40
            r0 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            r2 = r38
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r12 | 6
            goto L_0x002f
        L_0x0016:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x002e
            r3 = r12 & 8
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.W(r1)
            goto L_0x0027
        L_0x0023:
            boolean r3 = r2.l(r1)
        L_0x0027:
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r12
            goto L_0x002f
        L_0x002e:
            r3 = r12
        L_0x002f:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
        L_0x0035:
            r5 = r28
            goto L_0x004a
        L_0x0038:
            r5 = r12 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r28
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r7 = r29
            goto L_0x0065
        L_0x0053:
            r7 = r12 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0050
            r7 = r29
            boolean r8 = r2.d(r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r8
        L_0x0065:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007e
            r8 = r13 & 8
            if (r8 != 0) goto L_0x0078
            r8 = r30
            boolean r9 = r2.W(r8)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x0078:
            r8 = r30
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r9
            goto L_0x0080
        L_0x007e:
            r8 = r30
        L_0x0080:
            r9 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0099
            r9 = r13 & 16
            if (r9 != 0) goto L_0x0093
            r9 = r31
            boolean r11 = r2.j(r9)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r9 = r31
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r11
            goto L_0x009b
        L_0x0099:
            r9 = r31
        L_0x009b:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00b3
            r11 = r13 & 32
            r14 = r33
            if (r11 != 0) goto L_0x00af
            boolean r11 = r2.j(r14)
            if (r11 == 0) goto L_0x00af
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r11
            goto L_0x00b5
        L_0x00b3:
            r14 = r33
        L_0x00b5:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00ce
            r11 = r13 & 64
            r0 = r35
            if (r11 != 0) goto L_0x00c9
            boolean r16 = r2.j(r0)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r16
            goto L_0x00d0
        L_0x00ce:
            r0 = r35
        L_0x00d0:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00db
            r3 = r3 | r16
            r0 = r37
            goto L_0x00ed
        L_0x00db:
            r17 = r12 & r16
            r0 = r37
            if (r17 != 0) goto L_0x00ed
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L_0x00ea
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r3 = r3 | r1
        L_0x00ed:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r3
            r0 = 4793490(0x492492, float:6.71711E-39)
            r17 = 0
            if (r1 == r0) goto L_0x00fa
            r0 = 1
            goto L_0x00fc
        L_0x00fa:
            r0 = r17
        L_0x00fc:
            r1 = r3 & 1
            boolean r0 = r2.E(r0, r1)
            if (r0 == 0) goto L_0x0230
            r2.p()
            r0 = r12 & 1
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x011b
            goto L_0x013f
        L_0x011b:
            r2.B()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0124
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0124:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x012a
            r3 = r3 & r19
        L_0x012a:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0130
            r3 = r3 & r18
        L_0x0130:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0135
            r3 = r3 & r1
        L_0x0135:
            r0 = r28
            r1 = r37
            r4 = r8
            r8 = r9
            r10 = r14
            r14 = r35
            goto L_0x0198
        L_0x013f:
            if (r4 == 0) goto L_0x0144
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0146
        L_0x0144:
            r0 = r28
        L_0x0146:
            if (r6 == 0) goto L_0x014a
            r7 = r17
        L_0x014a:
            r4 = r13 & 8
            r6 = 6
            if (r4 == 0) goto L_0x015c
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r4 = r4.b(r2, r6)
            androidx.compose.foundation.shape.CornerBasedShape r4 = r4.c()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x015d
        L_0x015c:
            r4 = r8
        L_0x015d:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x016a
            androidx.compose.material.SnackbarDefaults r8 = androidx.compose.material.SnackbarDefaults.f8428a
            long r8 = r8.a(r2, r6)
            r3 = r3 & r19
            goto L_0x016b
        L_0x016a:
            r8 = r9
        L_0x016b:
            r10 = r13 & 32
            if (r10 == 0) goto L_0x017b
            androidx.compose.material.MaterialTheme r10 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r10 = r10.a(r2, r6)
            long r14 = r10.n()
            r3 = r3 & r18
        L_0x017b:
            r10 = r13 & 64
            if (r10 == 0) goto L_0x0188
            androidx.compose.material.SnackbarDefaults r10 = androidx.compose.material.SnackbarDefaults.f8428a
            long r17 = r10.b(r2, r6)
            r1 = r1 & r3
            r3 = r1
            goto L_0x018a
        L_0x0188:
            r17 = r35
        L_0x018a:
            if (r11 == 0) goto L_0x0195
            float r1 = (float) r6
            float r1 = androidx.compose.ui.unit.Dp.m(r1)
        L_0x0191:
            r10 = r14
            r14 = r17
            goto L_0x0198
        L_0x0195:
            r1 = r37
            goto L_0x0191
        L_0x0198:
            r2.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x01aa
            r6 = -1
            java.lang.String r5 = "androidx.compose.material.Snackbar (Snackbar.kt:167)"
            r12 = 258660814(0xf6ad9ce, float:1.15790384E-29)
            androidx.compose.runtime.ComposerKt.Y(r12, r3, r6, r5)
        L_0x01aa:
            java.lang.String r5 = r27.c()
            if (r5 == 0) goto L_0x01ce
            r12 = 1609221416(0x5feac528, float:3.3833943E19)
            r2.X(r12)
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1 r12 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
            r6 = r27
            r12.<init>(r14, r6, r5)
            r5 = 1843479216(0x6de142b0, float:8.7143434E27)
            r18 = r14
            r13 = 1
            r14 = 54
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r5, r13, r12, r2, r14)
            r2.M()
        L_0x01cc:
            r15 = r5
            goto L_0x01dd
        L_0x01ce:
            r6 = r27
            r18 = r14
            r5 = 1609519419(0x5fef513b, float:3.4489259E19)
            r2.X(r5)
            r2.M()
            r5 = 0
            goto L_0x01cc
        L_0x01dd:
            r5 = 12
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.PaddingKt.i(r0, r5)
            androidx.compose.material.SnackbarKt$Snackbar$3 r5 = new androidx.compose.material.SnackbarKt$Snackbar$3
            r5.<init>(r6)
            r12 = -261845785(0xfffffffff0648ce7, float:-2.829317E29)
            r28 = r0
            r0 = 54
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r13, r5, r2, r0)
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r16
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r3
            r0 = r0 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r3
            r0 = r0 | r5
            int r3 = r3 >> 3
            r5 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r5
            r25 = r0 | r3
            r26 = 0
            r12 = r18
            r16 = r7
            r17 = r4
            r18 = r8
            r20 = r10
            r22 = r1
            r24 = r2
            c(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x022c
            androidx.compose.runtime.ComposerKt.X()
        L_0x022c:
            r3 = r28
            r14 = r1
            goto L_0x023e
        L_0x0230:
            r6 = r27
            r2.B()
            r3 = r28
            r12 = r35
            r4 = r8
            r8 = r9
            r10 = r14
            r14 = r37
        L_0x023e:
            androidx.compose.runtime.ScopeUpdateScope r15 = r2.x()
            if (r15 == 0) goto L_0x025e
            androidx.compose.material.SnackbarKt$Snackbar$4 r5 = new androidx.compose.material.SnackbarKt$Snackbar$4
            r0 = r5
            r1 = r27
            r2 = r3
            r3 = r7
            r7 = r5
            r5 = r8
            r9 = r7
            r7 = r10
            r11 = r9
            r9 = r12
            r13 = r11
            r11 = r14
            r12 = r39
            r14 = r13
            r13 = r40
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r15.a(r14)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.d(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(917397959);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(917397959, i3, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:237)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = SnackbarKt$TextOnlySnackbar$2.f8499a;
            Modifier.Companion companion = Modifier.f15489d;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, snackbarKt$TextOnlySnackbar$2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            Modifier j2 = PaddingKt.j(companion, f8459b, f8462e);
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, j2);
            Function0 a5 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g2, companion2.c());
            Updater.g(b4, I2, companion2.e());
            Function2 b5 = companion2.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a4))) {
                b4.N(Integer.valueOf(a4));
                b4.A(Integer.valueOf(a4), b5);
            }
            Updater.g(b4, e3, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function2.m(q2, Integer.valueOf(i3 & 14));
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
            x2.a(new SnackbarKt$TextOnlySnackbar$3(function2, i2));
        }
    }
}
