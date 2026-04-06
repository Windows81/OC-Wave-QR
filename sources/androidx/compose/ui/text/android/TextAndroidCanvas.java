package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextAndroidCanvas extends Canvas {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f18579a;

    public final void a(Canvas canvas) {
        this.f18579a = canvas;
    }

    public boolean clipOutPath(Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f18512a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.a(canvas, path);
    }

    public boolean clipOutRect(RectF rectF) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f18512a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.e(canvas, rectF);
    }

    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    public void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.a(canvas);
    }

    public void drawARGB(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i2, i3, i4, i5);
    }

    public void drawArc(RectF rectF, float f2, float f3, boolean z2, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f2, f3, z2, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f2, f3, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i2, int i3, float[] fArr, int i4, int[] iArr, int i5, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i2, i3, fArr, i4, iArr, i5, paint);
    }

    public void drawCircle(float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f2, f3, f4, paint);
    }

    public void drawColor(int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i2);
    }

    public void drawDoubleRoundRect(RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.e(canvas, rectF, f2, f3, rectF2, f4, f5, paint);
    }

    public void drawGlyphs(int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f18515a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.a(canvas, iArr, i2, fArr, i3, i4, font, paint);
    }

    public void drawLine(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f2, f3, f4, f5, paint);
    }

    public void drawLines(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i2, i3, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f18515a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.b(canvas, ninePatch, rect, paint);
    }

    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f2, f3, paint);
    }

    public void drawPoints(float[] fArr, int i2, int i3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i2, i3, paint);
    }

    public void drawPosText(char[] cArr, int i2, int i3, float[] fArr, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i2, i3, fArr, paint);
    }

    public void drawRGB(int i2, int i3, int i4) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i2, i3, i4);
    }

    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    public void drawRenderNode(RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.g(canvas, renderNode);
    }

    public void drawRoundRect(RectF rectF, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f2, f3, paint);
    }

    public void drawText(char[] cArr, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i2, i3, f2, f3, paint);
    }

    public void drawTextOnPath(char[] cArr, int i2, int i3, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i2, i3, path, f2, f3, paint);
    }

    public void drawTextRun(char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.f18511a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.b(canvas, cArr, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i3, float[] fArr2, int i4, int[] iArr, int i5, short[] sArr, int i6, int i7, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i2, fArr, i3, fArr2, i4, iArr, i5, sArr, i6, i7, paint);
    }

    public void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.i(canvas);
    }

    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i2);
    }

    public void rotate(float f2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f2);
    }

    public int save() {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    public int saveLayer(RectF rectF, Paint paint, int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i2);
    }

    public int saveLayerAlpha(RectF rectF, int i2, int i3) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i2, i3);
    }

    public void scale(float f2, float f3) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f2, f3);
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public void setDensity(int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i2);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f2, float f3) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f2, f3);
    }

    public void translate(float f2, float f3) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f2, f3);
    }

    public boolean clipOutRect(Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f18512a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.d(canvas, rect);
    }

    public boolean clipPath(Path path) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f2, f3, f4, f5, f6, f7, z2, paint);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    public void drawColor(long j2) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.c(canvas, j2);
    }

    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f2, f3, f4, f5, paint);
    }

    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.f18515a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.c(canvas, ninePatch, rectF, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint);
    }

    public void drawText(String str, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f2, f3, paint);
    }

    public void drawTextOnPath(String str, Path path, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f2, f3, paint);
    }

    public boolean quickReject(RectF rectF) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f18514a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.c(canvas, rectF);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i2);
    }

    public boolean clipOutRect(float f2, float f3, float f4, float f5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f18512a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.b(canvas, f2, f3, f4, f5);
    }

    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i2, PorterDuff.Mode mode) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i2, mode);
    }

    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f2, f3, f4, f5, paint);
    }

    public void drawText(String str, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i2, i3, f2, f3, paint);
    }

    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    public int saveLayer(float f2, float f3, float f4, float f5, Paint paint, int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f2, f3, f4, f5, paint, i2);
    }

    public int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2, int i3) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2, i3);
    }

    public boolean clipOutRect(int i2, int i3, int i4, int i5) {
        CanvasCompatO canvasCompatO = CanvasCompatO.f18512a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.c(canvas, i2, i3, i4, i5);
    }

    public boolean clipRect(Rect rect) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    public void drawBitmap(int[] iArr, int i2, int i3, float f2, float f3, int i4, int i5, boolean z2, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i2, i3, f2, f3, i4, i5, z2, paint);
    }

    public void drawColor(int i2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.b(canvas, i2, blendMode);
    }

    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawText(CharSequence charSequence, int i2, int i3, float f2, float f3, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i2, i3, f2, f3, paint);
    }

    public void drawTextRun(CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.f18511a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.a(canvas, charSequence, i2, i3, i4, i5, f2, f3, z2, paint);
    }

    public boolean quickReject(Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f18514a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.b(canvas, path);
    }

    public int saveLayer(float f2, float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f2, f3, f4, f5, paint);
    }

    public int saveLayerAlpha(float f2, float f3, float f4, float f5, int i2) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
    }

    public boolean clipRect(float f2, float f3, float f4, float f5, Region.Op op) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f2, f3, f4, f5, op);
    }

    public void drawBitmap(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i2, i3, i4, i5, i6, i7, z2, paint);
    }

    public void drawColor(long j2, BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.d(canvas, j2, blendMode);
    }

    public boolean quickReject(float f2, float f3, float f4, float f5, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f2, f3, f4, f5, edgeType);
    }

    public boolean clipRect(float f2, float f3, float f4, float f5) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f2, f3, f4, f5);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public boolean quickReject(float f2, float f3, float f4, float f5) {
        CanvasCompatR canvasCompatR = CanvasCompatR.f18514a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.a(canvas, f2, f3, f4, f5);
    }

    public boolean clipRect(int i2, int i3, int i4, int i5) {
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i2, i3, i4, i5);
    }

    public void drawTextRun(MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z2, Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.f18513a;
        Canvas canvas = this.f18579a;
        if (canvas == null) {
            Intrinsics.y("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.h(canvas, measuredText, i2, i3, i4, i5, f2, f3, z2, paint);
    }
}
