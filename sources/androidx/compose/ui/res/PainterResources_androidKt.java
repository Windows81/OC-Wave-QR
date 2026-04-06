package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PainterResources_androidKt {
    public static final ImageBitmap a(CharSequence charSequence, Resources resources, int i2) {
        try {
            return ImageResources_androidKt.a(ImageBitmap.f16019a, resources, i2);
        } catch (Exception e2) {
            throw new ResourceResolutionException("Error attempting to load resource: " + charSequence, e2);
        }
    }

    public static final ImageVector b(Resources.Theme theme, Resources resources, int i2, int i3, Composer composer, int i4) {
        if (ComposerKt.P()) {
            ComposerKt.Y(21855625, i4, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:89)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.C(AndroidCompositionLocals_androidKt.h());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry b2 = imageVectorCache.b(key);
        if (b2 == null) {
            XmlResourceParser xml = resources.getXml(i2);
            if (Intrinsics.d(XmlVectorParser_androidKt.j(xml).getName(), "vector")) {
                b2 = VectorResources_androidKt.a(theme, resources, xml, i3);
                imageVectorCache.d(key, b2);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
        }
        ImageVector b3 = b2.b();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.compose.ui.graphics.ImageBitmap} */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.compose.ui.graphics.vector.VectorPainter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.graphics.painter.Painter c(int r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            r2 = 473971343(0x1c403a8f, float:6.3603156E-22)
            androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
        L_0x000f:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r10.C(r0)
            android.content.Context r0 = (android.content.Context) r0
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            r10.C(r1)
            android.content.res.Resources r3 = r0.getResources()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.i()
            java.lang.Object r1 = r10.C(r1)
            androidx.compose.ui.res.ResourceIdCache r1 = (androidx.compose.ui.res.ResourceIdCache) r1
            android.util.TypedValue r1 = r1.b(r3, r9)
            java.lang.CharSequence r2 = r1.string
            r4 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0060
            r5 = 2
            r6 = 0
            java.lang.String r7 = ".xml"
            boolean r5 = kotlin.text.StringsKt.b0(r2, r7, r8, r5, r6)
            if (r5 != r4) goto L_0x0060
            r2 = -803043333(0xffffffffd02287fb, float:-1.09072824E10)
            r10.X(r2)
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int r5 = r1.changingConfigurations
            int r11 = r11 << 6
            r7 = r11 & 896(0x380, float:1.256E-42)
            r4 = r9
            r6 = r10
            androidx.compose.ui.graphics.vector.ImageVector r9 = b(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.VectorPainter r9 = androidx.compose.ui.graphics.vector.VectorPainterKt.h(r9, r10, r8)
            r10.M()
            goto L_0x00af
        L_0x0060:
            r1 = -802887899(0xffffffffd024e725, float:-1.10664468E10)
            r10.X(r1)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            boolean r1 = r10.W(r2)
            r5 = r11 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L_0x007b
            boolean r5 = r10.i(r9)
            if (r5 != 0) goto L_0x0081
        L_0x007b:
            r11 = r11 & 6
            if (r11 != r6) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r4 = r8
        L_0x0081:
            r11 = r1 | r4
            boolean r0 = r10.W(r0)
            r11 = r11 | r0
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x0096
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x009d
        L_0x0096:
            androidx.compose.ui.graphics.ImageBitmap r0 = a(r2, r3, r9)
            r10.N(r0)
        L_0x009d:
            r2 = r0
            androidx.compose.ui.graphics.ImageBitmap r2 = (androidx.compose.ui.graphics.ImageBitmap) r2
            androidx.compose.ui.graphics.painter.BitmapPainter r9 = new androidx.compose.ui.graphics.painter.BitmapPainter
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.M()
        L_0x00af:
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x00b8
            androidx.compose.runtime.ComposerKt.X()
        L_0x00b8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.PainterResources_androidKt.c(int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.painter.Painter");
    }
}
