package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.Preconditions;

public abstract class EmojiSpan extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f21311a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final TypefaceEmojiRasterizer f21312b;

    /* renamed from: c  reason: collision with root package name */
    public short f21313c = -1;

    /* renamed from: d  reason: collision with root package name */
    public short f21314d = -1;

    /* renamed from: e  reason: collision with root package name */
    public float f21315e = 1.0f;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.g(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f21312b = typefaceEmojiRasterizer;
    }

    public final TypefaceEmojiRasterizer a() {
        return this.f21312b;
    }

    public final int b() {
        return this.f21313c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f21311a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f21311a;
        this.f21315e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f21312b.e());
        this.f21314d = (short) ((int) (((float) this.f21312b.e()) * this.f21315e));
        short i4 = (short) ((int) (((float) this.f21312b.i()) * this.f21315e));
        this.f21313c = i4;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f21311a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i4;
    }
}
