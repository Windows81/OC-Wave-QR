package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    public final DrawStyle f19013a;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.f19013a = drawStyle;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.f19013a;
            if (Intrinsics.d(drawStyle, Fill.f16295a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.f19013a).f());
                textPaint.setStrokeMiter(((Stroke) this.f19013a).d());
                textPaint.setStrokeJoin(DrawStyleSpan_androidKt.b(((Stroke) this.f19013a).c()));
                textPaint.setStrokeCap(DrawStyleSpan_androidKt.a(((Stroke) this.f19013a).b()));
                PathEffect e2 = ((Stroke) this.f19013a).e();
                textPaint.setPathEffect(e2 != null ? AndroidPathEffect_androidKt.a(e2) : null);
            }
        }
    }
}
