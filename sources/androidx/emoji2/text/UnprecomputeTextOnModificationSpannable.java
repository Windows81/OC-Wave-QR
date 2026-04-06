package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.b;
import java.util.stream.IntStream;

class UnprecomputeTextOnModificationSpannable implements Spannable {

    /* renamed from: A  reason: collision with root package name */
    public Spannable f21354A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f21355z = false;

    public static class CharSequenceHelper_API24 {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class PrecomputedTextDetector {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        public boolean a(CharSequence charSequence) {
            return b.a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.f21354A = spannable;
    }

    public static PrecomputedTextDetector c() {
        return Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28();
    }

    public final void a() {
        Spannable spannable = this.f21354A;
        if (!this.f21355z && c().a(spannable)) {
            this.f21354A = new SpannableString(spannable);
        }
        this.f21355z = true;
    }

    public Spannable b() {
        return this.f21354A;
    }

    public char charAt(int i2) {
        return this.f21354A.charAt(i2);
    }

    public IntStream chars() {
        return CharSequenceHelper_API24.a(this.f21354A);
    }

    public IntStream codePoints() {
        return CharSequenceHelper_API24.b(this.f21354A);
    }

    public int getSpanEnd(Object obj) {
        return this.f21354A.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f21354A.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f21354A.getSpanStart(obj);
    }

    public Object[] getSpans(int i2, int i3, Class cls) {
        return this.f21354A.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.f21354A.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f21354A.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f21354A.removeSpan(obj);
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f21354A.setSpan(obj, i2, i3, i4);
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f21354A.subSequence(i2, i3);
    }

    public String toString() {
        return this.f21354A.toString();
    }

    public UnprecomputeTextOnModificationSpannable(CharSequence charSequence) {
        this.f21354A = new SpannableString(charSequence);
    }
}
