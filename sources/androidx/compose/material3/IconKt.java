package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class IconKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Modifier f10130a = SizeKt.t(Modifier.f15489d, SmallIconButtonTokens.f14035a.d());

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(androidx.compose.ui.graphics.painter.Painter r22, java.lang.String r23, androidx.compose.ui.Modifier r24, long r25, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            r9 = r22
            r10 = r23
            r11 = r28
            r0 = -2142239481(0xffffffff80500507, float:-7.348643E-39)
            r1 = r27
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r11 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r12.l(r9)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r11
            goto L_0x0026
        L_0x0025:
            r1 = r11
        L_0x0026:
            r2 = r29 & 2
            r3 = 32
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003e
        L_0x002f:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x003e
            boolean r2 = r12.W(r10)
            if (r2 == 0) goto L_0x003b
            r2 = r3
            goto L_0x003d
        L_0x003b:
            r2 = 16
        L_0x003d:
            r1 = r1 | r2
        L_0x003e:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r4 = r24
            goto L_0x0059
        L_0x0047:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0044
            r4 = r24
            boolean r5 = r12.W(r4)
            if (r5 == 0) goto L_0x0056
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r5
        L_0x0059:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0071
            r5 = r29 & 8
            r7 = r25
            if (r5 != 0) goto L_0x006d
            boolean r5 = r12.j(r7)
            if (r5 == 0) goto L_0x006d
            r5 = r6
            goto L_0x006f
        L_0x006d:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006f:
            r1 = r1 | r5
            goto L_0x0073
        L_0x0071:
            r7 = r25
        L_0x0073:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r14 = 0
            r15 = 1
            if (r5 == r13) goto L_0x007d
            r5 = r15
            goto L_0x007e
        L_0x007d:
            r5 = r14
        L_0x007e:
            r13 = r1 & 1
            boolean r5 = r12.E(r5, r13)
            if (r5 == 0) goto L_0x0184
            r12.p()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x009f
            boolean r5 = r12.J()
            if (r5 == 0) goto L_0x0094
            goto L_0x009f
        L_0x0094:
            r12.B()
            r2 = r29 & 8
            if (r2 == 0) goto L_0x009d
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009d:
            r13 = r4
            goto L_0x00bd
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00a5
        L_0x00a4:
            r2 = r4
        L_0x00a5:
            r4 = r29 & 8
            if (r4 == 0) goto L_0x00bc
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r4 = r12.C(r4)
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.ui.graphics.Color) r4
            long r4 = r4.v()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r2
            r7 = r4
            goto L_0x00bd
        L_0x00bc:
            r13 = r2
        L_0x00bd:
            r12.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00cc
            r2 = -1
            java.lang.String r4 = "androidx.compose.material3.Icon (Icon.kt:142)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r4)
        L_0x00cc:
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            if (r0 <= r6) goto L_0x00d8
            boolean r0 = r12.j(r7)
            if (r0 != 0) goto L_0x00dc
        L_0x00d8:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != r6) goto L_0x00de
        L_0x00dc:
            r0 = r15
            goto L_0x00df
        L_0x00de:
            r0 = r14
        L_0x00df:
            java.lang.Object r2 = r12.g()
            r4 = 0
            if (r0 != 0) goto L_0x00ee
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x010e
        L_0x00ee:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r5 = r0.f()
            boolean r0 = androidx.compose.ui.graphics.Color.n(r7, r5)
            if (r0 == 0) goto L_0x00fc
            r2 = r4
            goto L_0x010b
        L_0x00fc:
            androidx.compose.ui.graphics.ColorFilter$Companion r16 = androidx.compose.ui.graphics.ColorFilter.f15990b
            r20 = 2
            r21 = 0
            r19 = 0
            r17 = r7
            androidx.compose.ui.graphics.ColorFilter r0 = androidx.compose.ui.graphics.ColorFilter.Companion.b(r16, r17, r19, r20, r21)
            r2 = r0
        L_0x010b:
            r12.N(r2)
        L_0x010e:
            r6 = r2
            androidx.compose.ui.graphics.ColorFilter r6 = (androidx.compose.ui.graphics.ColorFilter) r6
            if (r10 == 0) goto L_0x0143
            r0 = -536990979(0xffffffffdffe2afd, float:-3.6629458E19)
            r12.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0121
            r1 = r15
            goto L_0x0122
        L_0x0121:
            r1 = r14
        L_0x0122:
            java.lang.Object r2 = r12.g()
            if (r1 != 0) goto L_0x0130
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0138
        L_0x0130:
            androidx.compose.material3.b3 r2 = new androidx.compose.material3.b3
            r2.<init>(r10)
            r12.N(r2)
        L_0x0138:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r14, r2, r15, r4)
            r12.M()
        L_0x0141:
            r15 = r0
            goto L_0x014f
        L_0x0143:
            r0 = -536832197(0xffffffffe000973b, float:-3.706376E19)
            r12.X(r0)
            r12.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0141
        L_0x014f:
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.d(r13)
            androidx.compose.ui.Modifier r0 = i(r0, r9)
            androidx.compose.ui.layout.ContentScale$Companion r1 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r4 = r1.d()
            r16 = 22
            r17 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r22
            r18 = r7
            r7 = r16
            r8 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.PainterModifierKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier r0 = r0.o0(r15)
            androidx.compose.foundation.layout.BoxKt.a(r0, r12, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0180
            androidx.compose.runtime.ComposerKt.X()
        L_0x0180:
            r3 = r13
            r4 = r18
            goto L_0x0189
        L_0x0184:
            r12.B()
            r3 = r4
            r4 = r7
        L_0x0189:
            androidx.compose.runtime.ScopeUpdateScope r8 = r12.x()
            if (r8 == 0) goto L_0x01a0
            androidx.compose.material3.c3 r12 = new androidx.compose.material3.c3
            r0 = r12
            r1 = r22
            r2 = r23
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r12)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.d(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.graphics.vector.ImageVector r17, java.lang.String r18, androidx.compose.ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            r0 = -126890956(0xfffffffff86fcc34, float:-1.9454698E34)
            r2 = r22
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r24 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.W(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r6
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r4 = r18
            goto L_0x003f
        L_0x002d:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x002a
            r4 = r18
            boolean r5 = r2.W(r4)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r3 = r3 | r5
        L_0x003f:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r7 = r19
            goto L_0x005a
        L_0x0048:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r19
            boolean r8 = r2.W(r7)
            if (r8 == 0) goto L_0x0057
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r8
        L_0x005a:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0073
            r8 = r24 & 8
            if (r8 != 0) goto L_0x006d
            r8 = r20
            boolean r10 = r2.j(r8)
            if (r10 == 0) goto L_0x006f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006d:
            r8 = r20
        L_0x006f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r3 = r3 | r10
            goto L_0x0075
        L_0x0073:
            r8 = r20
        L_0x0075:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 == r11) goto L_0x007d
            r10 = 1
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r11 = r3 & 1
            boolean r10 = r2.E(r10, r11)
            if (r10 == 0) goto L_0x00f1
            r2.p()
            r10 = r6 & 1
            if (r10 == 0) goto L_0x00a0
            boolean r10 = r2.J()
            if (r10 == 0) goto L_0x0094
            goto L_0x00a0
        L_0x0094:
            r2.B()
            r5 = r24 & 8
            if (r5 == 0) goto L_0x009d
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009d:
            r5 = r7
        L_0x009e:
            r15 = r8
            goto L_0x00bb
        L_0x00a0:
            if (r5 == 0) goto L_0x00a5
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00a6
        L_0x00a5:
            r5 = r7
        L_0x00a6:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x009e
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.material3.ContentColorKt.a()
            java.lang.Object r7 = r2.C(r7)
            androidx.compose.ui.graphics.Color r7 = (androidx.compose.ui.graphics.Color) r7
            long r7 = r7.v()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r7
        L_0x00bb:
            r2.U()
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x00ca
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.Icon (Icon.kt:69)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r7, r8)
        L_0x00ca:
            r0 = r3 & 14
            androidx.compose.ui.graphics.vector.VectorPainter r7 = androidx.compose.ui.graphics.vector.VectorPainterKt.h(r1, r2, r0)
            int r0 = androidx.compose.ui.graphics.vector.VectorPainter.M
            r8 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r3
            r14 = 0
            r8 = r18
            r9 = r5
            r10 = r15
            r12 = r2
            d(r7, r8, r9, r10, r12, r13, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00ee
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ee:
            r3 = r5
            r8 = r15
            goto L_0x00f5
        L_0x00f1:
            r2.B()
            r3 = r7
        L_0x00f5:
            androidx.compose.runtime.ScopeUpdateScope r10 = r2.x()
            if (r10 == 0) goto L_0x010d
            androidx.compose.material3.a3 r11 = new androidx.compose.material3.a3
            r0 = r11
            r1 = r17
            r2 = r18
            r4 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r10.a(r11)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.e(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit f(ImageVector imageVector, String str, Modifier modifier, long j2, int i2, int i3, Composer composer, int i4) {
        e(imageVector, str, modifier, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit g(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.e());
        return Unit.f40552a;
    }

    public static final Unit h(Painter painter, String str, Modifier modifier, long j2, int i2, int i3, Composer composer, int i4) {
        d(painter, str, modifier, j2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Modifier i(Modifier modifier, Painter painter) {
        return modifier.o0((Size.f(painter.k(), Size.f15876b.a()) || j(painter.k())) ? f10130a : Modifier.f15489d);
    }

    public static final boolean j(long j2) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j2 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }
}
