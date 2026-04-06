package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class CustomBulletSpan implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Shape f19001a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19002b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19003c;

    /* renamed from: d  reason: collision with root package name */
    public final Brush f19004d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19005e;

    /* renamed from: f  reason: collision with root package name */
    public final DrawStyle f19006f;

    /* renamed from: g  reason: collision with root package name */
    public final Density f19007g;

    /* renamed from: h  reason: collision with root package name */
    public final int f19008h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19009i;

    public CustomBulletSpan(Shape shape, float f2, float f3, float f4, Brush brush, float f5, DrawStyle drawStyle, Density density, float f6) {
        this.f19001a = shape;
        this.f19002b = f2;
        this.f19003c = f3;
        this.f19004d = brush;
        this.f19005e = f5;
        this.f19006f = drawStyle;
        this.f19007g = density;
        int d2 = MathKt.d(f2 + f4);
        this.f19008h = d2;
        this.f19009i = MathKt.d(f6) - d2;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z2, Layout layout) {
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        if (canvas != null) {
            float f2 = ((float) (i4 + i6)) / 2.0f;
            int e2 = RangesKt.e(i2 - this.f19008h, 0);
            Intrinsics.g(charSequence2, "null cannot be cast to non-null type android.text.Spanned");
            if (((Spanned) charSequence2).getSpanStart(this) == i7 && paint2 != null) {
                Paint.Style style = paint.getStyle();
                BulletSpan_androidKt.f(paint2, this.f19006f);
                float f3 = this.f19002b;
                float f4 = this.f19003c;
                long floatToRawIntBits = (long) Float.floatToRawIntBits(f3);
                long d2 = Size.d((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (floatToRawIntBits << 32));
                BulletSpan_androidKt.e(paint, this.f19004d, this.f19005e, d2, new CustomBulletSpan$drawLeadingMargin$1$1(this, d2, i3, canvas, paint, e2, f2));
                paint2.setStyle(style);
            }
        }
    }

    public int getLeadingMargin(boolean z2) {
        int i2 = this.f19009i;
        if (i2 >= 0) {
            return 0;
        }
        return Math.abs(i2);
    }
}
