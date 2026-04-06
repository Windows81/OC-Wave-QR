package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f21250b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f21251a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f21251a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f21250b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    public boolean a(CharSequence charSequence, int i2, int i3, int i4) {
        StringBuilder b2 = b();
        b2.setLength(0);
        while (i2 < i3) {
            b2.append(charSequence.charAt(i2));
            i2++;
        }
        return PaintCompat.a(this.f21251a, b2.toString());
    }
}
