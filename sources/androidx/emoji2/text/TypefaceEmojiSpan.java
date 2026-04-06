package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

public final class TypefaceEmojiSpan extends EmojiSpan {

    /* renamed from: g  reason: collision with root package name */
    public static Paint f21352g;

    /* renamed from: f  reason: collision with root package name */
    public TextPaint f21353f;

    public TypefaceEmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    public static Paint e() {
        if (f21352g == null) {
            TextPaint textPaint = new TextPaint();
            f21352g = textPaint;
            textPaint.setColor(EmojiCompat.c().e());
            f21352g.setStyle(Paint.Style.FILL);
        }
        return f21352g;
    }

    public final TextPaint c(CharSequence charSequence, int i2, int i3, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i3, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint = this.f21353f;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f21353f = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                    return textPaint;
                }
            }
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        } else if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        } else {
            return null;
        }
    }

    public void d(Canvas canvas, TextPaint textPaint, float f2, float f3, float f4, float f5) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f2, f4, f3, f5, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        float f3 = f2;
        int i7 = i4;
        int i8 = i6;
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint c2 = c(charSequence, i2, i3, textPaint);
        if (!(c2 == null || c2.bgColor == 0)) {
            d(canvas, c2, f2, f3 + ((float) b()), (float) i7, (float) i8);
        }
        if (EmojiCompat.c().l()) {
            canvas.drawRect(f2, (float) i7, f3 + ((float) b()), (float) i8, e());
        }
        TypefaceEmojiRasterizer a2 = a();
        float f4 = (float) i5;
        Canvas canvas2 = canvas;
        if (c2 != null) {
            textPaint = c2;
        }
        a2.a(canvas, f3, f4, textPaint);
    }
}
