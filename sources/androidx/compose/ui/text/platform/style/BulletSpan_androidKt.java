package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BulletSpan_androidKt {
    public static final void d(Outline outline, Canvas canvas, Paint paint, float f2, float f3, int i2) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Rect a2 = outline.a();
            canvas.translate(f2, f3 - ((a2.i() - a2.r()) / 2.0f));
            Path b2 = ((Outline.Generic) outline).b();
            if (b2 instanceof AndroidPath) {
                canvas.drawPath(((AndroidPath) b2).B(), paint);
                canvas.restore();
                return;
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        } else if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            if (!RoundRectKt.g(rounded.b())) {
                Path a3 = AndroidPath_androidKt.a();
                Path.l(a3, rounded.b(), (Path.Direction) null, 2, (Object) null);
                canvas.save();
                canvas.translate(f2, f3 - (rounded.b().d() / 2.0f));
                if (a3 instanceof AndroidPath) {
                    canvas.drawPath(((AndroidPath) a3).B(), paint);
                    canvas.restore();
                    return;
                }
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (rounded.b().h() >> 32));
            float d2 = f3 + (rounded.b().d() / 2.0f);
            canvas.drawRoundRect(f2, f3 - (rounded.b().d() / 2.0f), (((float) i2) * rounded.b().j()) + f2, d2, intBitsToFloat, intBitsToFloat, paint);
        } else if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            Rect b3 = rectangle.b();
            float i3 = f3 - ((b3.i() - b3.r()) / 2.0f);
            Rect b4 = rectangle.b();
            Rect b5 = rectangle.b();
            canvas.drawRect(f2, i3, (((float) i2) * (b4.p() - b4.o())) + f2, ((b5.i() - b5.r()) / 2.0f) + f3, paint);
        }
    }

    public static final void e(Paint paint, Brush brush, float f2, long j2, Function0 function0) {
        Integer num = null;
        if (brush == null) {
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) ((float) Math.rint((double) (f2 * 255.0f))));
            }
            function0.invoke();
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        } else if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) ((float) Math.rint((double) (f2 * 255.0f))));
            }
            paint.setColor(ColorKt.j(((SolidColor) brush).c()));
            function0.invoke();
            paint.setColor(color);
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        } else if (brush instanceof ShaderBrush) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) ((float) Math.rint((double) (f2 * 255.0f))));
            }
            paint.setShader(((ShaderBrush) brush).c(j2));
            function0.invoke();
            paint.setShader(shader);
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        }
    }

    public static final void f(Paint paint, DrawStyle drawStyle) {
        if (Intrinsics.d(drawStyle, Fill.f16295a)) {
            paint.setStyle(Paint.Style.FILL);
        } else if (drawStyle instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.f());
            paint.setStrokeMiter(stroke.d());
            paint.setStrokeCap(DrawStyleSpan_androidKt.a(stroke.b()));
            paint.setStrokeJoin(DrawStyleSpan_androidKt.b(stroke.c()));
            PathEffect e2 = stroke.e();
            paint.setPathEffect(e2 != null ? AndroidPathEffect_androidKt.a(e2) : null);
        }
    }
}
