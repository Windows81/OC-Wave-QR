package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

@Metadata
public final class DrawStyleSpan_androidKt {
    public static final Paint.Cap a(int i2) {
        StrokeCap.Companion companion = StrokeCap.f16130b;
        return StrokeCap.g(i2, companion.a()) ? Paint.Cap.BUTT : StrokeCap.g(i2, companion.b()) ? Paint.Cap.ROUND : StrokeCap.g(i2, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int i2) {
        StrokeJoin.Companion companion = StrokeJoin.f16135b;
        return StrokeJoin.g(i2, companion.b()) ? Paint.Join.MITER : StrokeJoin.g(i2, companion.c()) ? Paint.Join.ROUND : StrokeJoin.g(i2, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
