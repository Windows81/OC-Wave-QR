package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class IconKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Modifier f7897a = SizeKt.t(Modifier.f15489d, Dp.m((float) 24));

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.graphics.painter.Painter r24, java.lang.String r25, androidx.compose.ui.Modifier r26, long r27, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r9 = r24
            r10 = r25
            r11 = r30
            r0 = -1142959010(0xffffffffbbdfd45e, float:-0.006830736)
            r1 = r29
            androidx.compose.runtime.Composer r12 = r1.q(r0)
            r1 = r31 & 1
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
            r2 = r31 & 2
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
            r2 = r31 & 4
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r4 = r26
            goto L_0x0059
        L_0x0047:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0044
            r4 = r26
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
            r5 = r31 & 8
            r7 = r27
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
            r7 = r27
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
            if (r5 == 0) goto L_0x01a0
            r12.p()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x009f
            boolean r5 = r12.J()
            if (r5 == 0) goto L_0x0094
            goto L_0x009f
        L_0x0094:
            r12.B()
            r2 = r31 & 8
            if (r2 == 0) goto L_0x009d
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009d:
            r13 = r4
            goto L_0x00d9
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00a5
        L_0x00a4:
            r2 = r4
        L_0x00a5:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x00d8
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r4 = r12.C(r4)
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.ui.graphics.Color) r4
            long r16 = r4.v()
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ContentAlphaKt.a()
            java.lang.Object r4 = r12.C(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            float r18 = r4.floatValue()
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            long r4 = androidx.compose.ui.graphics.Color.l(r16, r18, r19, r20, r21, r22, r23)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r2
            r7 = r4
            goto L_0x00d9
        L_0x00d8:
            r13 = r2
        L_0x00d9:
            r12.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00e8
            r2 = -1
            java.lang.String r4 = "androidx.compose.material.Icon (Icon.kt:134)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r2, r4)
        L_0x00e8:
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            if (r0 <= r6) goto L_0x00f4
            boolean r0 = r12.j(r7)
            if (r0 != 0) goto L_0x00f8
        L_0x00f4:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != r6) goto L_0x00fa
        L_0x00f8:
            r0 = r15
            goto L_0x00fb
        L_0x00fa:
            r0 = r14
        L_0x00fb:
            java.lang.Object r2 = r12.g()
            r4 = 0
            if (r0 != 0) goto L_0x010a
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x012a
        L_0x010a:
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.f15975b
            long r5 = r0.f()
            boolean r0 = androidx.compose.ui.graphics.Color.n(r7, r5)
            if (r0 == 0) goto L_0x0118
            r2 = r4
            goto L_0x0127
        L_0x0118:
            androidx.compose.ui.graphics.ColorFilter$Companion r16 = androidx.compose.ui.graphics.ColorFilter.f15990b
            r20 = 2
            r21 = 0
            r19 = 0
            r17 = r7
            androidx.compose.ui.graphics.ColorFilter r0 = androidx.compose.ui.graphics.ColorFilter.Companion.b(r16, r17, r19, r20, r21)
            r2 = r0
        L_0x0127:
            r12.N(r2)
        L_0x012a:
            r6 = r2
            androidx.compose.ui.graphics.ColorFilter r6 = (androidx.compose.ui.graphics.ColorFilter) r6
            if (r10 == 0) goto L_0x015f
            r0 = 980491077(0x3a711b45, float:9.197484E-4)
            r12.X(r0)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x013d
            r1 = r15
            goto L_0x013e
        L_0x013d:
            r1 = r14
        L_0x013e:
            java.lang.Object r2 = r12.g()
            if (r1 != 0) goto L_0x014c
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0154
        L_0x014c:
            androidx.compose.material.IconKt$Icon$semantics$1$1 r2 = new androidx.compose.material.IconKt$Icon$semantics$1$1
            r2.<init>(r10)
            r12.N(r2)
        L_0x0154:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r14, r2, r15, r4)
            r12.M()
        L_0x015d:
            r15 = r0
            goto L_0x016b
        L_0x015f:
            r0 = 980649859(0x3a738783, float:9.289907E-4)
            r12.X(r0)
            r12.M()
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x015d
        L_0x016b:
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.d(r13)
            androidx.compose.ui.Modifier r0 = c(r0, r9)
            androidx.compose.ui.layout.ContentScale$Companion r1 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r4 = r1.d()
            r16 = 22
            r17 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r24
            r18 = r7
            r7 = r16
            r8 = r17
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.draw.PainterModifierKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Modifier r0 = r0.o0(r15)
            androidx.compose.foundation.layout.BoxKt.a(r0, r12, r14)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x019c
            androidx.compose.runtime.ComposerKt.X()
        L_0x019c:
            r3 = r13
            r4 = r18
            goto L_0x01a5
        L_0x01a0:
            r12.B()
            r3 = r4
            r4 = r7
        L_0x01a5:
            androidx.compose.runtime.ScopeUpdateScope r8 = r12.x()
            if (r8 == 0) goto L_0x01bc
            androidx.compose.material.IconKt$Icon$1 r12 = new androidx.compose.material.IconKt$Icon$1
            r0 = r12
            r1 = r24
            r2 = r25
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r12)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconKt.a(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(ImageVector imageVector, String str, Modifier modifier, long j2, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.f15489d : modifier;
        long l2 = (i3 & 8) != 0 ? Color.l(((Color) composer2.C(ContentColorKt.a())).v(), ((Number) composer2.C(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-800853103, i4, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        ImageVector imageVector2 = imageVector;
        a(VectorPainterKt.h(imageVector, composer2, i4 & 14), str, companion, l2, composer, VectorPainter.M | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public static final Modifier c(Modifier modifier, Painter painter) {
        return modifier.o0((Size.f(painter.k(), Size.f15876b.a()) || d(painter.k())) ? f7897a : Modifier.f15489d);
    }

    public static final boolean d(long j2) {
        return Float.isInfinite(Size.i(j2)) && Float.isInfinite(Size.g(j2));
    }
}
