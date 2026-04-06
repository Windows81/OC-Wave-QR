package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AndroidSelectionHandles_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.foundation.text.selection.HandlePositionProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.foundation.text.selection.OffsetProvider r21, androidx.compose.ui.Alignment r22, kotlin.jvm.functions.Function2 r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            r0 = r21
            r1 = r22
            r9 = r23
            r10 = r25
            r2 = 476043083(0x1c5fd74b, float:7.406277E-22)
            r3 = r24
            androidx.compose.runtime.Composer r11 = r3.q(r2)
            r3 = r10 & 6
            r4 = 4
            if (r3 != 0) goto L_0x002a
            r3 = r10 & 8
            if (r3 != 0) goto L_0x001f
            boolean r3 = r11.W(r0)
            goto L_0x0023
        L_0x001f:
            boolean r3 = r11.l(r0)
        L_0x0023:
            if (r3 == 0) goto L_0x0027
            r3 = r4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            r5 = r10 & 48
            r6 = 32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r11.W(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r6
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r3 = r3 | r5
        L_0x003c:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004c
            boolean r5 = r11.l(r9)
            if (r5 == 0) goto L_0x0049
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r3 = r3 | r5
        L_0x004c:
            r5 = r3 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r8 = 0
            r12 = 1
            if (r5 == r7) goto L_0x0056
            r5 = r12
            goto L_0x0057
        L_0x0056:
            r5 = r8
        L_0x0057:
            r7 = r3 & 1
            boolean r5 = r11.E(r5, r7)
            if (r5 == 0) goto L_0x00c6
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x006b
            r5 = -1
            java.lang.String r7 = "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)"
            androidx.compose.runtime.ComposerKt.Y(r2, r3, r5, r7)
        L_0x006b:
            r2 = r3 & 112(0x70, float:1.57E-43)
            if (r2 != r6) goto L_0x0071
            r2 = r12
            goto L_0x0072
        L_0x0071:
            r2 = r8
        L_0x0072:
            r5 = r3 & 14
            if (r5 == r4) goto L_0x0080
            r4 = r3 & 8
            if (r4 == 0) goto L_0x0081
            boolean r4 = r11.W(r0)
            if (r4 == 0) goto L_0x0081
        L_0x0080:
            r8 = r12
        L_0x0081:
            r2 = r2 | r8
            java.lang.Object r4 = r11.g()
            if (r2 != 0) goto L_0x0090
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0098
        L_0x0090:
            androidx.compose.foundation.text.selection.HandlePositionProvider r4 = new androidx.compose.foundation.text.selection.HandlePositionProvider
            r4.<init>(r1, r0)
            r11.N(r4)
        L_0x0098:
            r2 = r4
            androidx.compose.foundation.text.selection.HandlePositionProvider r2 = (androidx.compose.foundation.text.selection.HandlePositionProvider) r2
            androidx.compose.ui.window.PopupProperties r4 = new androidx.compose.ui.window.PopupProperties
            r19 = 15
            r20 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r12 = r4
            r12.<init>((boolean) r13, (boolean) r14, (boolean) r15, (androidx.compose.ui.window.SecureFlagPolicy) r16, (boolean) r17, (boolean) r18, (int) r19, (kotlin.jvm.internal.DefaultConstructorMarker) r20)
            int r3 = r3 << 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r7 = r3 | 384(0x180, float:5.38E-43)
            r8 = 2
            r3 = 0
            r5 = r23
            r6 = r11
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x00c9
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x00c9
        L_0x00c6:
            r11.B()
        L_0x00c9:
            androidx.compose.runtime.ScopeUpdateScope r2 = r11.x()
            if (r2 == 0) goto L_0x00d7
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1 r3 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
            r3.<init>(r0, r1, r9, r10)
            r2.a(r3)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.a(androidx.compose.foundation.text.selection.OffsetProvider, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00dc, code lost:
        if ((r30 & 16) != 0) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.foundation.text.selection.OffsetProvider r20, boolean r21, androidx.compose.ui.text.style.ResolvedTextDirection r22, boolean r23, long r24, float r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r7 = r20
            r8 = r21
            r9 = r27
            r10 = r29
            r0 = -466280168(0xffffffffe4352118, float:-1.3364981E22)
            r1 = r28
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r30 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0019
            r1 = r10 | 6
            goto L_0x0032
        L_0x0019:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0031
            r1 = r10 & 8
            if (r1 != 0) goto L_0x0026
            boolean r1 = r11.W(r7)
            goto L_0x002a
        L_0x0026:
            boolean r1 = r11.l(r7)
        L_0x002a:
            if (r1 == 0) goto L_0x002e
            r1 = r2
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r10
            goto L_0x0032
        L_0x0031:
            r1 = r10
        L_0x0032:
            r3 = r30 & 2
            r4 = 32
            if (r3 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004a
        L_0x003b:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x004a
            boolean r3 = r11.d(r8)
            if (r3 == 0) goto L_0x0047
            r3 = r4
            goto L_0x0049
        L_0x0047:
            r3 = 16
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            r12 = r22
            goto L_0x0065
        L_0x0053:
            r3 = r10 & 384(0x180, float:5.38E-43)
            r12 = r22
            if (r3 != 0) goto L_0x0065
            boolean r3 = r11.W(r12)
            if (r3 == 0) goto L_0x0062
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r3
        L_0x0065:
            r3 = r30 & 8
            if (r3 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r13 = r23
            goto L_0x0080
        L_0x006e:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            r13 = r23
            if (r3 != 0) goto L_0x0080
            boolean r3 = r11.d(r13)
            if (r3 == 0) goto L_0x007d
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r3
        L_0x0080:
            r3 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0097
            r3 = r30 & 16
            r5 = r24
            if (r3 != 0) goto L_0x0093
            boolean r3 = r11.j(r5)
            if (r3 == 0) goto L_0x0093
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r1 = r1 | r3
            goto L_0x0099
        L_0x0097:
            r5 = r24
        L_0x0099:
            r3 = r30 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00a1
            r1 = r1 | r14
            goto L_0x00b1
        L_0x00a1:
            r3 = r10 & r14
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r11.W(r9)
            if (r3 == 0) goto L_0x00ae
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b0
        L_0x00ae:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x00b0:
            r1 = r1 | r3
        L_0x00b1:
            r3 = 533651(0x82493, float:7.47804E-40)
            r3 = r3 & r1
            r14 = 533650(0x82492, float:7.47803E-40)
            r15 = 1
            if (r3 == r14) goto L_0x00bd
            r3 = r15
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            r14 = r1 & 1
            boolean r3 = r11.E(r3, r14)
            if (r3 == 0) goto L_0x0183
            r11.p()
            r3 = r10 & 1
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x00e2
            boolean r3 = r11.J()
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e2
        L_0x00d7:
            r11.B()
            r3 = r30 & 16
            if (r3 == 0) goto L_0x00df
        L_0x00de:
            r1 = r1 & r14
        L_0x00df:
            r16 = r5
            goto L_0x00ed
        L_0x00e2:
            r3 = r30 & 16
            if (r3 == 0) goto L_0x00df
            androidx.compose.ui.unit.DpSize$Companion r3 = androidx.compose.ui.unit.DpSize.f19156b
            long r5 = r3.a()
            goto L_0x00de
        L_0x00ed:
            r11.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x00fc
            r3 = -1
            java.lang.String r5 = "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)"
            androidx.compose.runtime.ComposerKt.Y(r0, r1, r3, r5)
        L_0x00fc:
            boolean r5 = androidx.compose.foundation.text.selection.SelectionHandlesKt.f(r21, r22, r23)
            androidx.compose.ui.AbsoluteAlignment r0 = androidx.compose.ui.AbsoluteAlignment.f15434a
            if (r5 == 0) goto L_0x010a
            androidx.compose.ui.Alignment r0 = r0.d()
        L_0x0108:
            r14 = r0
            goto L_0x010f
        L_0x010a:
            androidx.compose.ui.Alignment r0 = r0.c()
            goto L_0x0108
        L_0x010f:
            r6 = r1 & 14
            if (r6 == r2) goto L_0x0120
            r0 = r1 & 8
            if (r0 == 0) goto L_0x011e
            boolean r0 = r11.l(r7)
            if (r0 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r0 = 0
            goto L_0x0121
        L_0x0120:
            r0 = r15
        L_0x0121:
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto L_0x0127
            r1 = r15
            goto L_0x0128
        L_0x0127:
            r1 = 0
        L_0x0128:
            r0 = r0 | r1
            boolean r1 = r11.d(r5)
            r0 = r0 | r1
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x013c
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0144
        L_0x013c:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1 r1 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
            r1.<init>(r7, r8, r5)
            r11.N(r1)
        L_0x0144:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r0 = 0
            r2 = 0
            androidx.compose.ui.Modifier r18 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r9, r2, r1, r15, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.t()
            java.lang.Object r0 = r11.C(r0)
            r1 = r0
            androidx.compose.ui.platform.ViewConfiguration r1 = (androidx.compose.ui.platform.ViewConfiguration) r1
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1 r4 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
            r0 = r4
            r2 = r16
            r8 = r4
            r4 = r5
            r5 = r18
            r19 = r6
            r6 = r20
            r0.<init>(r1, r2, r4, r5, r6)
            r0 = 54
            r1 = 1365123137(0x515e2041, float:5.9626492E10)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r15, r8, r11, r0)
            r1 = r19
            r1 = r1 | 384(0x180, float:5.38E-43)
            a(r7, r14, r0, r11, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0180
            androidx.compose.runtime.ComposerKt.X()
        L_0x0180:
            r5 = r16
            goto L_0x0186
        L_0x0183:
            r11.B()
        L_0x0186:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x01a5
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2 r14 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
            r0 = r14
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r7 = r26
            r8 = r27
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            r11.a(r14)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(androidx.compose.foundation.text.selection.OffsetProvider, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, long, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(Modifier modifier, Function0 function0, boolean z2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.d(z2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2111672474, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            SpacerKt.a(e(SizeKt.v(modifier, SelectionHandlesKt.c(), SelectionHandlesKt.b()), function0, z2), q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AndroidSelectionHandles_androidKt$SelectionHandleIcon$1(modifier, function0, z2, i2));
        }
    }

    public static final ImageBitmap d(CacheDrawScope cacheDrawScope, float f2) {
        int ceil = ((int) ((float) Math.ceil((double) f2))) * 2;
        HandleImageCache handleImageCache = HandleImageCache.f6746a;
        ImageBitmap c2 = handleImageCache.c();
        Canvas a2 = handleImageCache.a();
        CanvasDrawScope b2 = handleImageCache.b();
        if (c2 == null || a2 == null || ceil > c2.b() || ceil > c2.a()) {
            c2 = ImageBitmapKt.b(ceil, ceil, ImageBitmapConfig.f16021b.a(), false, (ColorSpace) null, 24, (Object) null);
            handleImageCache.f(c2);
            a2 = CanvasKt.a(c2);
            handleImageCache.d(a2);
        }
        ImageBitmap imageBitmap = c2;
        Canvas canvas = a2;
        if (b2 == null) {
            b2 = new CanvasDrawScope();
            handleImageCache.e(b2);
        }
        CanvasDrawScope canvasDrawScope = b2;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) imageBitmap.b());
        long d2 = Size.d((((long) Float.floatToRawIntBits((float) imageBitmap.a())) & 4294967295L) | (floatToRawIntBits << 32));
        CanvasDrawScope.DrawParams G = canvasDrawScope.G();
        Density a3 = G.a();
        LayoutDirection b3 = G.b();
        Canvas c3 = G.c();
        long d3 = G.d();
        CanvasDrawScope.DrawParams G2 = canvasDrawScope.G();
        G2.j(cacheDrawScope);
        G2.k(layoutDirection);
        G2.i(canvas);
        G2.l(d2);
        canvas.o();
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        DrawScope.A1(canvasDrawScope2, Color.f15975b.a(), 0, canvasDrawScope.c(), 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.f15926b.a(), 58, (Object) null);
        DrawScope.A1(canvasDrawScope2, ColorKt.d(4278190080L), Offset.f15855b.c(), Size.d((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        long d4 = ColorKt.d(4278190080L);
        long floatToRawIntBits2 = (long) Float.floatToRawIntBits(f2);
        long j2 = d3;
        DrawScope.k2(canvasDrawScope, d4, f2, Offset.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits2 << 32)), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
        canvas.t();
        CanvasDrawScope.DrawParams G3 = canvasDrawScope.G();
        G3.j(a3);
        G3.k(b3);
        G3.i(c3);
        G3.l(j2);
        return imageBitmap;
    }

    public static final Modifier e(Modifier modifier, Function0 function0, boolean z2) {
        return ComposedModifierKt.c(modifier, (Function1) null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(function0, z2), 1, (Object) null);
    }
}
