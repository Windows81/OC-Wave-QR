package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class BottomSheetDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final BottomSheetDefaults f9266a = new BottomSheetDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9267b = SheetBottomTokens.f13997a.f();

    /* renamed from: c  reason: collision with root package name */
    public static final float f9268c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f9269d = Dp.m((float) 640);

    /* renamed from: e  reason: collision with root package name */
    public static final float f9270e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f9271f = Dp.m((float) 125);

    static {
        float f2 = (float) 56;
        f9268c = Dp.m(f2);
        f9270e = Dp.m(f2);
    }

    public static final Unit d(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final Unit e(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f2, float f3, Shape shape, long j2, int i2, int i3, Composer composer, int i4) {
        bottomSheetDefaults.c(modifier, f2, f3, shape, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cb, code lost:
        if ((r33 & 16) != 0) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.ui.Modifier r25, float r26, float r27, androidx.compose.ui.graphics.Shape r28, long r29, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r24 = this;
            r8 = r32
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = 16
            r4 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            r5 = r31
            androidx.compose.runtime.Composer r5 = r5.q(r4)
            r6 = 1
            r7 = r33 & 1
            if (r7 == 0) goto L_0x001b
            r9 = r8 | 6
            r10 = r9
            r9 = r25
            goto L_0x002f
        L_0x001b:
            r9 = r8 & 6
            if (r9 != 0) goto L_0x002c
            r9 = r25
            boolean r10 = r5.W(r9)
            if (r10 == 0) goto L_0x0029
            r10 = r1
            goto L_0x002a
        L_0x0029:
            r10 = r0
        L_0x002a:
            r10 = r10 | r8
            goto L_0x002f
        L_0x002c:
            r9 = r25
            r10 = r8
        L_0x002f:
            r0 = r33 & 2
            if (r0 == 0) goto L_0x0038
            r10 = r10 | 48
        L_0x0035:
            r11 = r26
            goto L_0x0049
        L_0x0038:
            r11 = r8 & 48
            if (r11 != 0) goto L_0x0035
            r11 = r26
            boolean r12 = r5.h(r11)
            if (r12 == 0) goto L_0x0047
            r12 = 32
            goto L_0x0048
        L_0x0047:
            r12 = r3
        L_0x0048:
            r10 = r10 | r12
        L_0x0049:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x0052
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r12 = r27
            goto L_0x0064
        L_0x0052:
            r12 = r8 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004f
            r12 = r27
            boolean r13 = r5.h(r12)
            if (r13 == 0) goto L_0x0061
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r10 = r10 | r13
        L_0x0064:
            r13 = r8 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x007d
            r13 = r33 & 8
            if (r13 != 0) goto L_0x0077
            r13 = r28
            boolean r14 = r5.W(r13)
            if (r14 == 0) goto L_0x0079
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0077:
            r13 = r28
        L_0x0079:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r10 = r10 | r14
            goto L_0x007f
        L_0x007d:
            r13 = r28
        L_0x007f:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0099
            r14 = r33 & 16
            if (r14 != 0) goto L_0x0092
            r14 = r29
            boolean r16 = r5.j(r14)
            if (r16 == 0) goto L_0x0094
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r14 = r29
        L_0x0094:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r10 = r10 | r16
            goto L_0x009b
        L_0x0099:
            r14 = r29
        L_0x009b:
            r4 = r10 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            r3 = 0
            if (r4 == r2) goto L_0x00a4
            r2 = r6
            goto L_0x00a5
        L_0x00a4:
            r2 = r3
        L_0x00a5:
            r4 = r10 & 1
            boolean r2 = r5.E(r2, r4)
            if (r2 == 0) goto L_0x0195
            r5.p()
            r2 = r8 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x00d5
            boolean r2 = r5.J()
            if (r2 == 0) goto L_0x00be
            goto L_0x00d5
        L_0x00be:
            r5.B()
            r0 = r33 & 8
            if (r0 == 0) goto L_0x00c7
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c7:
            r0 = 16
            r0 = r33 & 16
            if (r0 == 0) goto L_0x00ce
        L_0x00cd:
            r10 = r10 & r4
        L_0x00ce:
            r0 = r9
            r1 = r11
            r2 = r12
            r4 = r13
            r22 = r14
            goto L_0x0112
        L_0x00d5:
            if (r7 == 0) goto L_0x00da
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            r9 = r2
        L_0x00da:
            if (r0 == 0) goto L_0x00e3
            androidx.compose.material3.tokens.SheetBottomTokens r0 = androidx.compose.material3.tokens.SheetBottomTokens.f13997a
            float r0 = r0.e()
            r11 = r0
        L_0x00e3:
            if (r1 == 0) goto L_0x00ec
            androidx.compose.material3.tokens.SheetBottomTokens r0 = androidx.compose.material3.tokens.SheetBottomTokens.f13997a
            float r0 = r0.d()
            r12 = r0
        L_0x00ec:
            r0 = r33 & 8
            if (r0 == 0) goto L_0x0101
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.f10273a
            r1 = 6
            androidx.compose.material3.Shapes r0 = r0.d(r5, r1)
            androidx.compose.foundation.shape.CornerBasedShape r0 = r0.b()
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r0
        L_0x00fe:
            r0 = 16
            goto L_0x0103
        L_0x0101:
            r1 = 6
            goto L_0x00fe
        L_0x0103:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x00ce
            androidx.compose.material3.tokens.SheetBottomTokens r0 = androidx.compose.material3.tokens.SheetBottomTokens.f13997a
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r0 = r0.c()
            long r14 = androidx.compose.material3.ColorSchemeKt.k(r0, r5, r1)
            goto L_0x00cd
        L_0x0112:
            r5.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0124
            r7 = -1
            java.lang.String r9 = "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)"
            r11 = -1364277227(0xffffffffaeaec815, float:-7.9481456E-11)
            androidx.compose.runtime.ComposerKt.Y(r11, r10, r7, r9)
        L_0x0124:
            androidx.compose.material3.internal.Strings$Companion r7 = androidx.compose.material3.internal.Strings.f12320b
            int r7 = androidx.compose.material3.R.string.f10656c
            int r7 = androidx.compose.material3.internal.Strings.a(r7)
            java.lang.String r7 = androidx.compose.material3.internal.Strings_androidKt.b(r7, r5, r3)
            r9 = 0
            float r11 = androidx.compose.material3.SheetDefaultsKt.f10996a
            r12 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.k(r0, r9, r11, r6, r12)
            boolean r11 = r5.W(r7)
            java.lang.Object r13 = r5.g()
            if (r11 != 0) goto L_0x014c
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x0154
        L_0x014c:
            androidx.compose.material3.G r13 = new androidx.compose.material3.G
            r13.<init>(r7)
            r5.N(r13)
        L_0x0154:
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r9, r3, r13, r6, r12)
            androidx.compose.material3.BottomSheetDefaults$DragHandle$2 r3 = new androidx.compose.material3.BottomSheetDefaults$DragHandle$2
            r3.<init>(r1, r2)
            r7 = 54
            r11 = -1039573072(0xffffffffc2095fb0, float:-34.343445)
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r6, r3, r5, r7)
            r3 = 6
            int r3 = r10 >> 6
            r6 = r3 & 112(0x70, float:1.57E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r7
            r3 = r3 & 896(0x380, float:1.256E-42)
            r20 = r6 | r3
            r21 = 120(0x78, float:1.68E-43)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r4
            r11 = r22
            r19 = r5
            androidx.compose.material3.SurfaceKt.c(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x018e
            androidx.compose.runtime.ComposerKt.X()
        L_0x018e:
            r3 = r1
            r13 = r4
            r6 = r22
            r4 = r2
            r2 = r0
            goto L_0x019c
        L_0x0195:
            r5.B()
            r2 = r9
            r3 = r11
            r4 = r12
            r6 = r14
        L_0x019c:
            androidx.compose.runtime.ScopeUpdateScope r10 = r5.x()
            if (r10 == 0) goto L_0x01b2
            androidx.compose.material3.H r11 = new androidx.compose.material3.H
            r0 = r11
            r1 = r24
            r5 = r13
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.a(r11)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.c(androidx.compose.ui.Modifier, float, float, androidx.compose.ui.graphics.Shape, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final long f(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(433375448, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:383)");
        }
        long k2 = ColorSchemeKt.k(SheetBottomTokens.f13997a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float g() {
        return f9267b;
    }

    public final Shape h(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1683783414, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
        }
        Shape g2 = ShapesKt.g(SheetBottomTokens.f13997a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final float i() {
        return f9270e;
    }

    public final long j(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-2040719176, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
        }
        long l2 = Color.l(ColorSchemeKt.k(ScrimTokens.f13918a.a(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }

    public final float k() {
        return f9269d;
    }

    public final float l() {
        return f9271f;
    }

    public final WindowInsets m(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-511309409, i2, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        WindowInsets c2 = WindowInsets_androidKt.c(WindowInsets.f4206a, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.f4266b;
        WindowInsets j2 = WindowInsetsKt.j(c2, WindowInsetsSides.q(companion.e(), companion.k()));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }
}
