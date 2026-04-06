package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class MaterialThemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10274a = CompositionLocalKt.j(new C0193n3());

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10275b = CompositionLocalKt.j(new C0202o3());

    public static final boolean e() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c6, code lost:
        if ((r25 & 8) != 0) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(androidx.compose.material3.ColorScheme r18, androidx.compose.material3.MotionScheme r19, androidx.compose.material3.Shapes r20, androidx.compose.material3.Typography r21, kotlin.jvm.functions.Function2 r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r5 = r22
            r6 = r24
            r0 = 904511636(0x35e9c094, float:1.74159E-6)
            r1 = r23
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0024
            r2 = r25 & 1
            if (r2 != 0) goto L_0x001f
            r2 = r18
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0021
            r3 = 4
            goto L_0x0022
        L_0x001f:
            r2 = r18
        L_0x0021:
            r3 = 2
        L_0x0022:
            r3 = r3 | r6
            goto L_0x0027
        L_0x0024:
            r2 = r18
            r3 = r6
        L_0x0027:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x0040
            r4 = r25 & 2
            if (r4 != 0) goto L_0x003a
            r4 = r19
            boolean r7 = r1.W(r4)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003a:
            r4 = r19
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
            goto L_0x0042
        L_0x0040:
            r4 = r19
        L_0x0042:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005b
            r7 = r25 & 4
            if (r7 != 0) goto L_0x0055
            r7 = r20
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0055:
            r7 = r20
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
            goto L_0x005d
        L_0x005b:
            r7 = r20
        L_0x005d:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0076
            r8 = r25 & 8
            if (r8 != 0) goto L_0x0070
            r8 = r21
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0072
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0070:
            r8 = r21
        L_0x0072:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r9
            goto L_0x0078
        L_0x0076:
            r8 = r21
        L_0x0078:
            r9 = r25 & 16
            if (r9 == 0) goto L_0x007f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008f
        L_0x007f:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008f
            boolean r9 = r1.l(r5)
            if (r9 == 0) goto L_0x008c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r3 = r3 | r9
        L_0x008f:
            r9 = r3 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            r11 = 1
            if (r9 == r10) goto L_0x0098
            r9 = r11
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            r10 = r3 & 1
            boolean r9 = r1.E(r9, r10)
            if (r9 == 0) goto L_0x016e
            r1.p()
            r9 = r6 & 1
            if (r9 == 0) goto L_0x00cb
            boolean r9 = r1.J()
            if (r9 == 0) goto L_0x00af
            goto L_0x00cb
        L_0x00af:
            r1.B()
            r9 = r25 & 1
            if (r9 == 0) goto L_0x00b8
            r3 = r3 & -15
        L_0x00b8:
            r9 = r25 & 2
            if (r9 == 0) goto L_0x00be
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00be:
            r9 = r25 & 4
            if (r9 == 0) goto L_0x00c4
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c4:
            r9 = r25 & 8
            if (r9 == 0) goto L_0x00fb
        L_0x00c8:
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x00fb
        L_0x00cb:
            r9 = r25 & 1
            r10 = 6
            if (r9 == 0) goto L_0x00d8
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.ColorScheme r2 = r2.a(r1, r10)
            r3 = r3 & -15
        L_0x00d8:
            r9 = r25 & 2
            if (r9 == 0) goto L_0x00e4
            androidx.compose.material3.MaterialTheme r4 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.MotionScheme r4 = r4.c(r1, r10)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e4:
            r9 = r25 & 4
            if (r9 == 0) goto L_0x00f0
            androidx.compose.material3.MaterialTheme r7 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.Shapes r7 = r7.d(r1, r10)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f0:
            r9 = r25 & 8
            if (r9 == 0) goto L_0x00fb
            androidx.compose.material3.MaterialTheme r8 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.Typography r8 = r8.e(r1, r10)
            goto L_0x00c8
        L_0x00fb:
            r1.U()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x010a
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:95)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r9, r10)
        L_0x010a:
            r16 = 7
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            androidx.compose.foundation.IndicationNodeFactory r0 = androidx.compose.material3.RippleKt.e(r12, r13, r14, r16, r17)
            r3 = r3 & 14
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = l(r2, r1, r3)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.material3.ColorSchemeKt.j()
            androidx.compose.runtime.ProvidedValue r12 = r9.d(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = f10275b
            androidx.compose.runtime.ProvidedValue r13 = r9.d(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.foundation.IndicationKt.a()
            androidx.compose.runtime.ProvidedValue r14 = r9.d(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.ShapesKt.f()
            androidx.compose.runtime.ProvidedValue r15 = r0.d(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            androidx.compose.runtime.ProvidedValue r16 = r0.d(r3)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.TypographyKt.d()
            androidx.compose.runtime.ProvidedValue r17 = r0.d(r8)
            androidx.compose.runtime.ProvidedValue[] r0 = new androidx.compose.runtime.ProvidedValue[]{r12, r13, r14, r15, r16, r17}
            androidx.compose.material3.MaterialThemeKt$MaterialTheme$2 r3 = new androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
            r3.<init>(r8, r5)
            r9 = 54
            r10 = -1750539308(0xffffffff97a8e3d4, float:-1.0914257E-24)
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r10, r11, r3, r1, r9)
            int r9 = androidx.compose.runtime.ProvidedValue.f14769i
            r9 = r9 | 48
            androidx.compose.runtime.CompositionLocalKt.d(r0, r3, r1, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x016c
            androidx.compose.runtime.ComposerKt.X()
        L_0x016c:
            r3 = r7
            goto L_0x0172
        L_0x016e:
            r1.B()
            goto L_0x016c
        L_0x0172:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x018a
            androidx.compose.material3.l3 r10 = new androidx.compose.material3.l3
            r0 = r10
            r1 = r2
            r2 = r4
            r4 = r8
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.f(androidx.compose.material3.ColorScheme, androidx.compose.material3.MotionScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        if ((r15 & 4) != 0) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.compose.material3.ColorScheme r9, androidx.compose.material3.Shapes r10, androidx.compose.material3.Typography r11, kotlin.jvm.functions.Function2 r12, androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            r0 = -449719819(0xffffffffe531d1f5, float:-5.2483243E22)
            androidx.compose.runtime.Composer r13 = r13.q(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001a
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.W(r9)
            if (r1 == 0) goto L_0x0017
            r1 = 4
            goto L_0x0018
        L_0x0017:
            r1 = 2
        L_0x0018:
            r1 = r1 | r14
            goto L_0x001b
        L_0x001a:
            r1 = r14
        L_0x001b:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x002f
            r2 = r15 & 2
            if (r2 != 0) goto L_0x002c
            boolean r2 = r13.W(r10)
            if (r2 == 0) goto L_0x002c
            r2 = 32
            goto L_0x002e
        L_0x002c:
            r2 = 16
        L_0x002e:
            r1 = r1 | r2
        L_0x002f:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0043
            r2 = r15 & 4
            if (r2 != 0) goto L_0x0040
            boolean r2 = r13.W(r11)
            if (r2 == 0) goto L_0x0040
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x005a
        L_0x004a:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r13.l(r12)
            if (r2 == 0) goto L_0x0057
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 == r3) goto L_0x0062
            r2 = 1
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            r3 = r1 & 1
            boolean r2 = r13.E(r2, r3)
            if (r2 == 0) goto L_0x00ee
            r13.p()
            r2 = r14 & 1
            r3 = 6
            if (r2 == 0) goto L_0x0090
            boolean r2 = r13.J()
            if (r2 == 0) goto L_0x007a
            goto L_0x0090
        L_0x007a:
            r13.B()
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0083
            r1 = r1 & -15
        L_0x0083:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0089
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0089:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x00b3
        L_0x008d:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00b3
        L_0x0090:
            r2 = r15 & 1
            if (r2 == 0) goto L_0x009c
            androidx.compose.material3.MaterialTheme r9 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.ColorScheme r9 = r9.a(r13, r3)
            r1 = r1 & -15
        L_0x009c:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x00a8
            androidx.compose.material3.MaterialTheme r10 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.Shapes r10 = r10.d(r13, r3)
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a8:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x00b3
            androidx.compose.material3.MaterialTheme r11 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.Typography r11 = r11.e(r13, r3)
            goto L_0x008d
        L_0x00b3:
            r13.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00c2
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:59)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r4)
        L_0x00c2:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.f10273a
            androidx.compose.material3.MotionScheme r2 = r0.c(r13, r3)
            r0 = r1 & 14
            int r1 = r1 << 3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r7 = r0 | r1
            r8 = 0
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            f(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ea
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ea:
            r2 = r9
            r3 = r10
            r4 = r11
            goto L_0x00f2
        L_0x00ee:
            r13.B()
            goto L_0x00ea
        L_0x00f2:
            androidx.compose.runtime.ScopeUpdateScope r9 = r13.x()
            if (r9 == 0) goto L_0x0104
            androidx.compose.material3.m3 r10 = new androidx.compose.material3.m3
            r1 = r10
            r5 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.g(androidx.compose.material3.ColorScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit h(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2 function2, int i2, int i3, Composer composer, int i4) {
        g(colorScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit i(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i2, int i3, Composer composer, int i4) {
        f(colorScheme, motionScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final MotionScheme j() {
        return MotionScheme.f10364a.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0025;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors l(androidx.compose.material3.ColorScheme r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:217)"
            r2 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            androidx.compose.runtime.ComposerKt.Y(r2, r13, r0, r1)
        L_0x000f:
            long r0 = r11.N()
            boolean r11 = r12.j(r0)
            java.lang.Object r13 = r12.g()
            if (r11 != 0) goto L_0x0025
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x003e
        L_0x0025:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = new androidx.compose.foundation.text.selection.TextSelectionColors
            r9 = 14
            r10 = 0
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            long r6 = androidx.compose.ui.graphics.Color.l(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.N(r13)
        L_0x003e:
            androidx.compose.foundation.text.selection.TextSelectionColors r13 = (androidx.compose.foundation.text.selection.TextSelectionColors) r13
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0049
            androidx.compose.runtime.ComposerKt.X()
        L_0x0049:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.l(androidx.compose.material3.ColorScheme, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
