package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata
public final class MaterialTextSelectionColorsKt {
    public static final float a(long j2, long j3, long j4) {
        float f2 = 0.2f;
        float f3 = 0.4f;
        float f4 = 0.4f;
        for (int i2 = 0; i2 < 7; i2++) {
            float c2 = (c(j2, f3, j3, j4) / 4.5f) - 1.0f;
            if (0.0f <= c2 && c2 <= 0.01f) {
                break;
            }
            if (c2 < 0.0f) {
                f4 = f3;
            } else {
                f2 = f3;
            }
            f3 = (f4 + f2) / 2.0f;
        }
        return f3;
    }

    public static final float b(long j2, long j3) {
        float i2 = ColorKt.i(j2) + 0.05f;
        float i3 = ColorKt.i(j3) + 0.05f;
        return Math.max(i2, i3) / Math.min(i2, i3);
    }

    public static final float c(long j2, float f2, long j3, long j4) {
        long g2 = ColorKt.g(Color.l(j2, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null), j4);
        return b(ColorKt.g(j3, g2), g2);
    }

    public static final long d(long j2, long j3, long j4) {
        return Color.l(j2, c(j2, 0.4f, j3, j4) >= 4.5f ? 0.4f : c(j2, 0.2f, j3, j4) < 4.5f ? 0.2f : a(j2, j3, j4), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.foundation.text.selection.TextSelectionColors} */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (r3 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x006f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.TextSelectionColors e(androidx.compose.material.Colors r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r0 = r19
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0013
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"
            r3 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r4 = r20
            androidx.compose.runtime.ComposerKt.Y(r3, r4, r1, r2)
        L_0x0013:
            long r4 = r18.j()
            long r8 = r18.c()
            r1 = 1102762852(0x41bad364, float:23.353218)
            r0.X(r1)
            r1 = r18
            long r2 = androidx.compose.material.ColorsKt.a(r1, r8)
            r6 = 16
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002f
        L_0x002d:
            r10 = r2
            goto L_0x003e
        L_0x002f:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r2 = r0.C(r2)
            androidx.compose.ui.graphics.Color r2 = (androidx.compose.ui.graphics.Color) r2
            long r2 = r2.v()
            goto L_0x002d
        L_0x003e:
            r19.M()
            androidx.compose.material.ContentAlpha r2 = androidx.compose.material.ContentAlpha.f7561a
            r3 = 6
            float r12 = r2.d(r0, r3)
            r16 = 14
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            long r6 = androidx.compose.ui.graphics.Color.l(r10, r12, r13, r14, r15, r16, r17)
            boolean r2 = r0.j(r4)
            boolean r3 = r0.j(r8)
            r2 = r2 | r3
            boolean r3 = r0.j(r6)
            r2 = r2 | r3
            java.lang.Object r3 = r19.g()
            if (r2 != 0) goto L_0x006f
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0081
        L_0x006f:
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = new androidx.compose.foundation.text.selection.TextSelectionColors
            long r11 = r18.j()
            long r13 = d(r4, r6, r8)
            r15 = 0
            r10 = r3
            r10.<init>(r11, r13, r15)
            r0.N(r3)
        L_0x0081:
            androidx.compose.foundation.text.selection.TextSelectionColors r3 = (androidx.compose.foundation.text.selection.TextSelectionColors) r3
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.X()
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialTextSelectionColorsKt.e(androidx.compose.material.Colors, androidx.compose.runtime.Composer, int):androidx.compose.foundation.text.selection.TextSelectionColors");
    }
}
