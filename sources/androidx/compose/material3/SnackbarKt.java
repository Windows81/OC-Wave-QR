package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnackbarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11176a = Dp.m((float) 600);

    /* renamed from: b  reason: collision with root package name */
    public static final float f11177b = Dp.m((float) 30);

    /* renamed from: c  reason: collision with root package name */
    public static final float f11178c = Dp.m((float) 16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11179d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11180e = Dp.m((float) 2);

    /* renamed from: f  reason: collision with root package name */
    public static final float f11181f = Dp.m((float) 6);

    /* renamed from: g  reason: collision with root package name */
    public static final float f11182g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11183h = Dp.m((float) 12);

    static {
        float f2 = (float) 8;
        f11179d = Dp.m(f2);
        f11182g = Dp.m(f2);
    }

    public static final void e(Function2 function2, Function2 function22, Function2 function23, TextStyle textStyle, long j2, long j3, Composer composer, int i2) {
        int i3;
        Function2 function24 = function2;
        Function2 function25 = function22;
        Function2 function26 = function23;
        TextStyle textStyle2 = textStyle;
        int i4 = i2;
        Composer q2 = composer.q(-264666338);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function24) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function25) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function26) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(textStyle2) ? 2048 : 1024;
        }
        long j4 = j2;
        if ((i4 & 24576) == 0) {
            i3 |= q2.j(j4) ? 16384 : 8192;
        }
        long j5 = j3;
        if ((196608 & i4) == 0) {
            i3 |= q2.j(j5) ? 131072 : 65536;
        }
        if (q2.E((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-264666338, i3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:258)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier m2 = PaddingKt.m(SizeKt.h(SizeKt.A(companion, 0.0f, f11176a, 1, (Object) null), 0.0f, 1, (Object) null), f11178c, 0.0f, 0.0f, f11180e, 6, (Object) null);
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
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
            Modifier g3 = AlignmentLineKt.g(companion, f11177b, f11183h);
            float f2 = f11179d;
            Modifier m3 = PaddingKt.m(g3, 0.0f, 0.0f, f2, 0.0f, 11, (Object) null);
            MeasurePolicy g4 = BoxKt.g(companion2.o(), false);
            int a5 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, m3);
            float f3 = f2;
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
            Updater.g(b4, g4, companion3.c());
            Updater.g(b4, I2, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a5))) {
                b4.N(Integer.valueOf(a5));
                b4.A(Integer.valueOf(a5), b5);
            }
            Updater.g(b4, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function24.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            Modifier m4 = PaddingKt.m(columnScopeInstance.b(companion, companion2.j()), 0.0f, 0.0f, function26 == null ? f3 : Dp.m((float) 0), 0.0f, 11, (Object) null);
            MeasurePolicy g5 = BoxKt.g(companion2.o(), false);
            int a7 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I3 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, m4);
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
            Composer b6 = Updater.b(q2);
            Updater.g(b6, g5, companion3.c());
            Updater.g(b6, I3, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a7))) {
                b6.N(Integer.valueOf(a7));
                b6.A(Integer.valueOf(a7), b7);
            }
            Updater.g(b6, e4, companion3.d());
            MeasurePolicy b8 = RowKt.b(arrangement.f(), companion2.l(), q2, 0);
            int a9 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I4 = q2.I();
            Modifier e5 = ComposedModifierKt.e(q2, companion);
            Function0 a10 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a10);
            } else {
                q2.K();
            }
            Composer b9 = Updater.b(q2);
            Updater.g(b9, b8, companion3.c());
            Updater.g(b9, I4, companion3.e());
            Function2 b10 = companion3.b();
            if (b9.n() || !Intrinsics.d(b9.g(), Integer.valueOf(a9))) {
                b9.N(Integer.valueOf(a9));
                b9.A(Integer.valueOf(a9), b10);
            }
            Updater.g(b9, e5, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            ProvidedValue[] providedValueArr = {ContentColorKt.a().d(Color.h(j2)), TextKt.q().d(textStyle2)};
            int i5 = ProvidedValue.f14769i;
            CompositionLocalKt.d(providedValueArr, function22, q2, (i3 & 112) | i5);
            if (function26 != null) {
                q2.X(916269829);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j3)), function26, q2, i5 | ((i3 >> 3) & 112));
                q2.M();
            } else {
                q2.X(916475483);
                q2.M();
            }
            q2.T();
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            Function2 function27 = function25;
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new E6(function2, function22, function23, textStyle, j2, j3, i2));
        }
    }

    public static final Unit f(Function2 function2, Function2 function22, Function2 function23, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        e(function2, function22, function23, textStyle, j2, j3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void g(Function2 function2, Function2 function22, Function2 function23, TextStyle textStyle, long j2, long j3, Composer composer, int i2) {
        int i3;
        Function2 function24 = function2;
        Function2 function25 = function22;
        Function2 function26 = function23;
        TextStyle textStyle2 = textStyle;
        int i4 = i2;
        Composer q2 = composer.q(-931325388);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function24) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function25) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function26) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.W(textStyle2) ? 2048 : 1024;
        }
        long j4 = j2;
        if ((i4 & 24576) == 0) {
            i3 |= q2.j(j4) ? 16384 : 8192;
        }
        long j5 = j3;
        if ((196608 & i4) == 0) {
            i3 |= q2.j(j5) ? 131072 : 65536;
        }
        if (q2.E((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-931325388, i3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:303)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier m2 = PaddingKt.m(companion, f11178c, 0.0f, function26 == null ? f11179d : Dp.m((float) 0), 0.0f, 10, (Object) null);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new SnackbarKt$OneRowSnackbar$2$1("action", "dismissAction", "text");
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
            Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion, "text"), 0.0f, f11181f, 1, (Object) null);
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
            function24.m(q2, Integer.valueOf(i3 & 14));
            q2.T();
            if (function25 != null) {
                q2.X(-1014168049);
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
                CompositionLocalKt.d(new ProvidedValue[]{ContentColorKt.a().d(Color.h(j2)), TextKt.q().d(textStyle2)}, function25, q2, ProvidedValue.f14769i | (i3 & 112));
                q2.T();
                q2.M();
            } else {
                q2.X(-1013852841);
                q2.M();
            }
            if (function26 != null) {
                q2.X(-1013804481);
                Modifier b9 = LayoutIdKt.b(companion, "dismissAction");
                MeasurePolicy g5 = BoxKt.g(companion3.o(), false);
                int a8 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I4 = q2.I();
                Modifier e5 = ComposedModifierKt.e(q2, b9);
                Function0 a9 = companion2.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a9);
                } else {
                    q2.K();
                }
                Composer b10 = Updater.b(q2);
                Updater.g(b10, g5, companion2.c());
                Updater.g(b10, I4, companion2.e());
                Function2 b11 = companion2.b();
                if (b10.n() || !Intrinsics.d(b10.g(), Integer.valueOf(a8))) {
                    b10.N(Integer.valueOf(a8));
                    b10.A(Integer.valueOf(a8), b11);
                }
                Updater.g(b10, e5, companion2.d());
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j3)), function26, q2, ProvidedValue.f14769i | ((i3 >> 3) & 112));
                q2.T();
                q2.M();
            } else {
                q2.X(-1013535401);
                q2.M();
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C6(function2, function22, function23, textStyle, j2, j3, i2));
        }
    }

    public static final Unit h(Function2 function2, Function2 function22, Function2 function23, TextStyle textStyle, long j2, long j3, int i2, Composer composer, int i3) {
        g(function2, function22, function23, textStyle, j2, j3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, long r35, long r37, kotlin.jvm.functions.Function2 r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            r15 = r41
            r14 = r42
            r0 = -1218779924(0xffffffffb75ae4ec, float:-1.3047113E-5)
            r1 = r40
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r3 = r15 | 6
            r4 = r3
            r3 = r26
            goto L_0x002b
        L_0x0017:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r26
            boolean r4 = r1.W(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r15
            goto L_0x002b
        L_0x0028:
            r3 = r26
            r4 = r15
        L_0x002b:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r27
            goto L_0x0046
        L_0x0034:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r27
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r28
            goto L_0x0061
        L_0x004f:
            r8 = r15 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r28
            boolean r9 = r1.l(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r9
        L_0x0061:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r29
            goto L_0x007c
        L_0x006a:
            r10 = r15 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r29
            boolean r11 = r1.d(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r11
        L_0x007c:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0095
            r11 = r14 & 16
            if (r11 != 0) goto L_0x008f
            r11 = r30
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0091
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r11 = r30
        L_0x0091:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r12
            goto L_0x0097
        L_0x0095:
            r11 = r30
        L_0x0097:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00b2
            r12 = r14 & 32
            if (r12 != 0) goto L_0x00ab
            r12 = r31
            boolean r16 = r1.j(r12)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r12 = r31
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r16
            goto L_0x00b4
        L_0x00b2:
            r12 = r31
        L_0x00b4:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00ce
            r16 = r14 & 64
            r10 = r33
            if (r16 != 0) goto L_0x00c9
            boolean r16 = r1.j(r10)
            if (r16 == 0) goto L_0x00c9
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r4 = r4 | r16
            goto L_0x00d0
        L_0x00ce:
            r10 = r33
        L_0x00d0:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e9
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r35
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r1.j(r10)
            if (r0 == 0) goto L_0x00e5
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e7
        L_0x00e5:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e7:
            r4 = r4 | r0
            goto L_0x00eb
        L_0x00e9:
            r10 = r35
        L_0x00eb:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x0103
            r0 = r14 & 256(0x100, float:3.59E-43)
            r10 = r37
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r1.j(r10)
            if (r0 == 0) goto L_0x00ff
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0101
        L_0x00ff:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0101:
            r4 = r4 | r0
            goto L_0x0105
        L_0x0103:
            r10 = r37
        L_0x0105:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0110
            r4 = r4 | r17
        L_0x010d:
            r0 = r39
            goto L_0x0123
        L_0x0110:
            r0 = r15 & r17
            if (r0 != 0) goto L_0x010d
            r0 = r39
            boolean r17 = r1.l(r0)
            if (r17 == 0) goto L_0x011f
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0121
        L_0x011f:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0121:
            r4 = r4 | r17
        L_0x0123:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r4 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 0
            r6 = 1
            if (r0 == r3) goto L_0x0132
            r0 = r6
            goto L_0x0134
        L_0x0132:
            r0 = r17
        L_0x0134:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x025d
            r1.p()
            r0 = r15 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r21 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0188
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0159
            goto L_0x0188
        L_0x0159:
            r1.B()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0162
            r4 = r4 & r21
        L_0x0162:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0168
            r4 = r4 & r20
        L_0x0168:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x016e
            r4 = r4 & r19
        L_0x016e:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0174
            r4 = r4 & r18
        L_0x0174:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0179
            r4 = r4 & r3
        L_0x0179:
            r0 = r26
            r5 = r27
            r17 = r29
            r7 = r30
            r20 = r33
            r22 = r35
            r2 = r8
            goto L_0x01e5
        L_0x0188:
            if (r2 == 0) goto L_0x018d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x018f
        L_0x018d:
            r0 = r26
        L_0x018f:
            r2 = 0
            if (r5 == 0) goto L_0x0194
            r5 = r2
            goto L_0x0196
        L_0x0194:
            r5 = r27
        L_0x0196:
            if (r7 == 0) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r2 = r8
        L_0x019a:
            if (r9 == 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r17 = r29
        L_0x019f:
            r7 = r14 & 16
            r8 = 6
            if (r7 == 0) goto L_0x01ad
            androidx.compose.material3.SnackbarDefaults r7 = androidx.compose.material3.SnackbarDefaults.f11157a
            androidx.compose.ui.graphics.Shape r7 = r7.f(r1, r8)
            r4 = r4 & r21
            goto L_0x01af
        L_0x01ad:
            r7 = r30
        L_0x01af:
            r9 = r14 & 32
            if (r9 == 0) goto L_0x01bb
            androidx.compose.material3.SnackbarDefaults r9 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r12 = r9.c(r1, r8)
            r4 = r4 & r20
        L_0x01bb:
            r9 = r14 & 64
            if (r9 == 0) goto L_0x01c8
            androidx.compose.material3.SnackbarDefaults r9 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r20 = r9.d(r1, r8)
            r4 = r4 & r19
            goto L_0x01ca
        L_0x01c8:
            r20 = r33
        L_0x01ca:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01d7
            androidx.compose.material3.SnackbarDefaults r9 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r22 = r9.b(r1, r8)
            r4 = r4 & r18
            goto L_0x01d9
        L_0x01d7:
            r22 = r35
        L_0x01d9:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x01e5
            androidx.compose.material3.SnackbarDefaults r9 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r8 = r9.e(r1, r8)
            r4 = r4 & r3
            r10 = r8
        L_0x01e5:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x01f7
            r3 = -1
            java.lang.String r8 = "androidx.compose.material3.Snackbar (Snackbar.kt:110)"
            r9 = -1218779924(0xffffffffb75ae4ec, float:-1.3047113E-5)
            androidx.compose.runtime.ComposerKt.Y(r9, r4, r3, r8)
        L_0x01f7:
            androidx.compose.material3.tokens.SnackbarTokens r3 = androidx.compose.material3.tokens.SnackbarTokens.f14050a
            float r3 = r3.d()
            androidx.compose.material3.SnackbarKt$Snackbar$1 r8 = new androidx.compose.material3.SnackbarKt$Snackbar$1
            r26 = r8
            r27 = r17
            r28 = r5
            r29 = r39
            r30 = r2
            r31 = r22
            r33 = r10
            r26.<init>(r27, r28, r29, r30, r31, r33)
            r9 = 54
            r40 = r2
            r2 = -1343524879(0xffffffffafeb6ff1, float:-4.282579E-10)
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r6, r8, r1, r9)
            r6 = r4 & 14
            r8 = 12779520(0xc30000, float:1.7907922E-38)
            r6 = r6 | r8
            int r4 = r4 >> 9
            r8 = r4 & 112(0x70, float:1.57E-43)
            r6 = r6 | r8
            r8 = r4 & 896(0x380, float:1.256E-42)
            r6 = r6 | r8
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r6
            r6 = 80
            r8 = 0
            r9 = 0
            r26 = r0
            r27 = r7
            r28 = r12
            r30 = r20
            r32 = r8
            r33 = r3
            r34 = r9
            r35 = r2
            r36 = r1
            r37 = r4
            r38 = r6
            androidx.compose.material3.SurfaceKt.c(r26, r27, r28, r30, r32, r33, r34, r35, r36, r37, r38)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0251
            androidx.compose.runtime.ComposerKt.X()
        L_0x0251:
            r3 = r40
            r2 = r0
            r4 = r17
            r8 = r20
            r16 = r10
            r10 = r22
            goto L_0x026f
        L_0x025d:
            r1.B()
            r2 = r26
            r5 = r27
            r4 = r29
            r7 = r30
            r3 = r8
            r16 = r10
            r8 = r33
            r10 = r35
        L_0x026f:
            androidx.compose.runtime.ScopeUpdateScope r6 = r1.x()
            if (r6 == 0) goto L_0x0292
            androidx.compose.material3.F6 r1 = new androidx.compose.material3.F6
            r0 = r1
            r24 = r1
            r1 = r2
            r2 = r5
            r5 = r7
            r25 = r6
            r6 = r12
            r12 = r16
            r14 = r39
            r15 = r41
            r16 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r15, r16)
            r1 = r24
            r0 = r25
            r0.a(r1)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.i(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(androidx.compose.material3.SnackbarData r41, androidx.compose.ui.Modifier r42, boolean r43, androidx.compose.ui.graphics.Shape r44, long r45, long r47, long r49, long r51, long r53, androidx.compose.runtime.Composer r55, int r56, int r57) {
        /*
            r1 = r41
            r15 = r56
            r13 = r57
            r0 = 274621471(0x105e641f, float:4.385891E-29)
            r2 = r55
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r15 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r15
            goto L_0x0026
        L_0x0025:
            r3 = r15
        L_0x0026:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r42
            goto L_0x0041
        L_0x002f:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r42
            boolean r6 = r2.W(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r43
            goto L_0x005c
        L_0x004a:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r43
            boolean r8 = r2.d(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0075
            r8 = r13 & 8
            if (r8 != 0) goto L_0x006f
            r8 = r44
            boolean r9 = r2.W(r8)
            if (r9 == 0) goto L_0x0071
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r8 = r44
        L_0x0071:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r9
            goto L_0x0077
        L_0x0075:
            r8 = r44
        L_0x0077:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0090
            r9 = r13 & 16
            if (r9 != 0) goto L_0x008a
            r9 = r45
            boolean r11 = r2.j(r9)
            if (r11 == 0) goto L_0x008c
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008a:
            r9 = r45
        L_0x008c:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r3 = r3 | r11
            goto L_0x0092
        L_0x0090:
            r9 = r45
        L_0x0092:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x00ac
            r11 = r13 & 32
            if (r11 != 0) goto L_0x00a6
            r11 = r47
            boolean r14 = r2.j(r11)
            if (r14 == 0) goto L_0x00a8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00a6:
            r11 = r47
        L_0x00a8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00aa:
            r3 = r3 | r14
            goto L_0x00ae
        L_0x00ac:
            r11 = r47
        L_0x00ae:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r15
            if (r14 != 0) goto L_0x00c7
            r14 = r13 & 64
            r0 = r49
            if (r14 != 0) goto L_0x00c2
            boolean r16 = r2.j(r0)
            if (r16 == 0) goto L_0x00c2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r3 = r3 | r16
            goto L_0x00c9
        L_0x00c7:
            r0 = r49
        L_0x00c9:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00e2
            r14 = r13 & 128(0x80, float:1.794E-43)
            r0 = r51
            if (r14 != 0) goto L_0x00de
            boolean r14 = r2.j(r0)
            if (r14 == 0) goto L_0x00de
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00de:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e0:
            r3 = r3 | r14
            goto L_0x00e4
        L_0x00e2:
            r0 = r51
        L_0x00e4:
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 & r15
            if (r14 != 0) goto L_0x00fc
            r14 = r13 & 256(0x100, float:3.59E-43)
            r0 = r53
            if (r14 != 0) goto L_0x00f8
            boolean r14 = r2.j(r0)
            if (r14 == 0) goto L_0x00f8
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fa
        L_0x00f8:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fa:
            r3 = r3 | r14
            goto L_0x00fe
        L_0x00fc:
            r0 = r53
        L_0x00fe:
            r14 = 38347923(0x2492493, float:1.4777644E-37)
            r14 = r14 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 == r0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            r14 = r3 & 1
            boolean r0 = r2.E(r0, r14)
            if (r0 == 0) goto L_0x02a4
            r2.p()
            r0 = r15 & 1
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x015f
            boolean r0 = r2.J()
            if (r0 == 0) goto L_0x012f
            goto L_0x015f
        L_0x012f:
            r2.B()
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0138
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0138:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x013e
            r3 = r3 & r20
        L_0x013e:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0144
            r3 = r3 & r19
        L_0x0144:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x014a
            r3 = r3 & r18
        L_0x014a:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0150
            r3 = r3 & r17
        L_0x0150:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0155
            r3 = r3 & r14
        L_0x0155:
            r33 = r51
            r35 = r53
            r0 = r5
            r4 = r8
            r5 = r49
            goto L_0x01d2
        L_0x015f:
            if (r4 == 0) goto L_0x0164
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0165
        L_0x0164:
            r0 = r5
        L_0x0165:
            if (r6 == 0) goto L_0x016a
            r16 = 0
            goto L_0x016c
        L_0x016a:
            r16 = r7
        L_0x016c:
            r4 = r13 & 8
            r5 = 6
            if (r4 == 0) goto L_0x017a
            androidx.compose.material3.SnackbarDefaults r4 = androidx.compose.material3.SnackbarDefaults.f11157a
            androidx.compose.ui.graphics.Shape r4 = r4.f(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x017b
        L_0x017a:
            r4 = r8
        L_0x017b:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0188
            androidx.compose.material3.SnackbarDefaults r6 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r6 = r6.c(r2, r5)
            r3 = r3 & r20
            goto L_0x0189
        L_0x0188:
            r6 = r9
        L_0x0189:
            r8 = r13 & 32
            if (r8 == 0) goto L_0x0196
            androidx.compose.material3.SnackbarDefaults r8 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r8 = r8.d(r2, r5)
            r3 = r3 & r19
            goto L_0x0197
        L_0x0196:
            r8 = r11
        L_0x0197:
            r10 = r13 & 64
            if (r10 == 0) goto L_0x01a4
            androidx.compose.material3.SnackbarDefaults r10 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r10 = r10.a(r2, r5)
            r3 = r3 & r18
            goto L_0x01a6
        L_0x01a4:
            r10 = r49
        L_0x01a6:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x01b3
            androidx.compose.material3.SnackbarDefaults r12 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r18 = r12.b(r2, r5)
            r3 = r3 & r17
            goto L_0x01b5
        L_0x01b3:
            r18 = r51
        L_0x01b5:
            r12 = r13 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x01cd
            androidx.compose.material3.SnackbarDefaults r12 = androidx.compose.material3.SnackbarDefaults.f11157a
            long r20 = r12.e(r2, r5)
            r3 = r3 & r14
            r33 = r18
            r35 = r20
        L_0x01c4:
            r39 = r6
            r7 = r16
            r5 = r10
            r11 = r8
            r9 = r39
            goto L_0x01d2
        L_0x01cd:
            r35 = r53
            r33 = r18
            goto L_0x01c4
        L_0x01d2:
            r2.U()
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x01e4
            r8 = -1
            java.lang.String r14 = "androidx.compose.material3.Snackbar (Snackbar.kt:206)"
            r1 = 274621471(0x105e641f, float:4.385891E-29)
            androidx.compose.runtime.ComposerKt.Y(r1, r3, r8, r14)
        L_0x01e4:
            androidx.compose.material3.SnackbarVisuals r1 = r41.a()
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L_0x020b
            r8 = -663815981(0xffffffffd86ef8d3, float:-1.05100984E15)
            r2.X(r8)
            androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1 r8 = new androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
            r14 = r41
            r8.<init>(r5, r14, r1)
            r1 = -1378313599(0xffffffffadd89a81, float:-2.462497E-11)
            r44 = r5
            r5 = 1
            r6 = 54
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r5, r8, r2, r6)
            r2.M()
            goto L_0x0219
        L_0x020b:
            r14 = r41
            r44 = r5
            r1 = -663517017(0xffffffffd87388a7, float:-1.07107297E15)
            r2.X(r1)
            r2.M()
            r1 = 0
        L_0x0219:
            androidx.compose.material3.SnackbarVisuals r5 = r41.a()
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x023e
            r5 = -663364652(0xffffffffd875dbd4, float:-1.08129801E15)
            r2.X(r5)
            androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1 r5 = new androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
            r5.<init>(r14)
            r6 = -1812633777(0xffffffff93f5674f, float:-6.1948565E-27)
            r8 = 1
            r13 = 54
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r8, r5, r2, r13)
            r2.M()
            r18 = r5
            goto L_0x0249
        L_0x023e:
            r5 = -662974393(0xffffffffd87bd047, float:-1.10748785E15)
            r2.X(r5)
            r2.M()
            r18 = 0
        L_0x0249:
            r5 = 12
            float r5 = (float) r5
            float r5 = androidx.compose.ui.unit.Dp.m(r5)
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.PaddingKt.i(r0, r5)
            androidx.compose.material3.SnackbarKt$Snackbar$3 r5 = new androidx.compose.material3.SnackbarKt$Snackbar$3
            r5.<init>(r14)
            r6 = -1266389126(0xffffffffb4846f7a, float:-2.4668026E-7)
            r8 = 1
            r13 = 54
            androidx.compose.runtime.internal.ComposableLambda r29 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r8, r5, r2, r13)
            int r5 = r3 << 3
            r6 = r5 & 7168(0x1c00, float:1.0045E-41)
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r5
            r6 = r6 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r5
            r6 = r6 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r8
            r5 = r5 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r3
            r5 = r5 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            r31 = r5 | r3
            r32 = 0
            r17 = r1
            r19 = r7
            r20 = r4
            r21 = r9
            r23 = r11
            r25 = r33
            r27 = r35
            r30 = r2
            i(r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r30, r31, r32)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x029e
            androidx.compose.runtime.ComposerKt.X()
        L_0x029e:
            r5 = r0
            r3 = r7
            r7 = r11
            r11 = r44
            goto L_0x02b2
        L_0x02a4:
            r14 = r41
            r2.B()
            r33 = r51
            r35 = r53
            r3 = r7
            r4 = r8
            r7 = r11
            r11 = r49
        L_0x02b2:
            androidx.compose.runtime.ScopeUpdateScope r13 = r2.x()
            if (r13 == 0) goto L_0x02d7
            androidx.compose.material3.D6 r6 = new androidx.compose.material3.D6
            r0 = r6
            r1 = r41
            r2 = r5
            r14 = r6
            r5 = r9
            r9 = r11
            r11 = r33
            r37 = r13
            r38 = r14
            r13 = r35
            r15 = r56
            r16 = r57
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r13, r15, r16)
            r0 = r37
            r1 = r38
            r0.a(r1)
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.j(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit k(Modifier modifier, Function2 function2, Function2 function22, boolean z2, Shape shape, long j2, long j3, long j4, long j5, Function2 function23, int i2, int i3, Composer composer, int i4) {
        i(modifier, function2, function22, z2, shape, j2, j3, j4, j5, function23, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit l(SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, long j5, long j6, int i2, int i3, Composer composer, int i4) {
        j(snackbarData, modifier, z2, shape, j2, j3, j4, j5, j6, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
