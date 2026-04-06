package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class PrecomputedTextCompat implements Spannable {
    public static final Object D = new Object();

    /* renamed from: A  reason: collision with root package name */
    public final Params f20081A;

    /* renamed from: B  reason: collision with root package name */
    public final int[] f20082B;
    public final PrecomputedText C;

    /* renamed from: z  reason: collision with root package name */
    public final Spannable f20083z;

    public static class Api28Impl {
        public static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {

            /* renamed from: a  reason: collision with root package name */
            public Params f20093a;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f20094b;

            /* renamed from: a */
            public PrecomputedTextCompat call() {
                return PrecomputedTextCompat.a(this.f20094b, this.f20093a);
            }
        }
    }

    public PrecomputedTextCompat(CharSequence charSequence, Params params, int[] iArr) {
        this.f20083z = new SpannableString(charSequence);
        this.f20081A = params;
        this.f20082B = iArr;
        this.C = null;
    }

    public static PrecomputedTextCompat a(CharSequence charSequence, Params params) {
        PrecomputedText.Params params2;
        Preconditions.f(charSequence);
        Preconditions.f(params);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f20088e) != null) {
                return new PrecomputedTextCompat(PrecomputedText.create(charSequence, params2), params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i2 = 0;
            while (i2 < length) {
                int indexOf = TextUtils.indexOf(charSequence, 10, i2, length);
                i2 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i2));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.e(), Integer.MAX_VALUE).setBreakStrategy(params.b()).setHyphenationFrequency(params.c()).setTextDirection(params.d()).build();
            PrecomputedTextCompat precomputedTextCompat = new PrecomputedTextCompat(charSequence, params, iArr);
            Trace.endSection();
            return precomputedTextCompat;
        } finally {
            Trace.endSection();
        }
    }

    public Params b() {
        return this.f20081A;
    }

    public PrecomputedText c() {
        if (b.a(this.f20083z)) {
            return c.a(this.f20083z);
        }
        return null;
    }

    public char charAt(int i2) {
        return this.f20083z.charAt(i2);
    }

    public int getSpanEnd(Object obj) {
        return this.f20083z.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f20083z.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f20083z.getSpanStart(obj);
    }

    public Object[] getSpans(int i2, int i3, Class cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.C.getSpans(i2, i3, cls) : this.f20083z.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.f20083z.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f20083z.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.C.removeSpan(obj);
        } else {
            this.f20083z.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.C.setSpan(obj, i2, i3, i4);
        } else {
            this.f20083z.setSpan(obj, i2, i3, i4);
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f20083z.subSequence(i2, i3);
    }

    public String toString() {
        return this.f20083z.toString();
    }

    public PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.f20083z = Api28Impl.a(precomputedText);
        this.f20081A = params;
        this.f20082B = null;
        this.C = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class Params {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f20084a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f20085b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20086c;

        /* renamed from: d  reason: collision with root package name */
        public final int f20087d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f20088e;

        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            public final TextPaint f20089a;

            /* renamed from: b  reason: collision with root package name */
            public TextDirectionHeuristic f20090b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            public int f20091c = 1;

            /* renamed from: d  reason: collision with root package name */
            public int f20092d = 1;

            public Builder(TextPaint textPaint) {
                this.f20089a = textPaint;
            }

            public Params a() {
                return new Params(this.f20089a, this.f20090b, this.f20091c, this.f20092d);
            }

            public Builder b(int i2) {
                this.f20091c = i2;
                return this;
            }

            public Builder c(int i2) {
                this.f20092d = i2;
                return this;
            }

            public Builder d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f20090b = textDirectionHeuristic;
                return this;
            }
        }

        public Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20088e = o.a(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f20088e = null;
            }
            this.f20084a = textPaint;
            this.f20085b = textDirectionHeuristic;
            this.f20086c = i2;
            this.f20087d = i3;
        }

        public boolean a(Params params) {
            if (this.f20086c == params.b() && this.f20087d == params.c() && this.f20084a.getTextSize() == params.e().getTextSize() && this.f20084a.getTextScaleX() == params.e().getTextScaleX() && this.f20084a.getTextSkewX() == params.e().getTextSkewX() && this.f20084a.getLetterSpacing() == params.e().getLetterSpacing() && TextUtils.equals(this.f20084a.getFontFeatureSettings(), params.e().getFontFeatureSettings()) && this.f20084a.getFlags() == params.e().getFlags() && this.f20084a.getTextLocales().equals(params.e().getTextLocales())) {
                return this.f20084a.getTypeface() == null ? params.e().getTypeface() == null : this.f20084a.getTypeface().equals(params.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f20086c;
        }

        public int c() {
            return this.f20087d;
        }

        public TextDirectionHeuristic d() {
            return this.f20085b;
        }

        public TextPaint e() {
            return this.f20084a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (!a(params)) {
                return false;
            }
            return this.f20085b == params.d();
        }

        public int hashCode() {
            return ObjectsCompat.b(Float.valueOf(this.f20084a.getTextSize()), Float.valueOf(this.f20084a.getTextScaleX()), Float.valueOf(this.f20084a.getTextSkewX()), Float.valueOf(this.f20084a.getLetterSpacing()), Integer.valueOf(this.f20084a.getFlags()), this.f20084a.getTextLocales(), this.f20084a.getTypeface(), Boolean.valueOf(this.f20084a.isElegantTextHeight()), this.f20085b, Integer.valueOf(this.f20086c), Integer.valueOf(this.f20087d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f20084a.getTextSize());
            sb.append(", textScaleX=" + this.f20084a.getTextScaleX());
            sb.append(", textSkewX=" + this.f20084a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f20084a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f20084a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f20084a.getTextLocales());
            sb.append(", typeface=" + this.f20084a.getTypeface());
            sb.append(", variationSettings=" + this.f20084a.getFontVariationSettings());
            sb.append(", textDir=" + this.f20085b);
            sb.append(", breakStrategy=" + this.f20086c);
            sb.append(", hyphenationFrequency=" + this.f20087d);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f20084a = params.getTextPaint();
            this.f20085b = params.getTextDirection();
            this.f20086c = params.getBreakStrategy();
            this.f20087d = params.getHyphenationFrequency();
            this.f20088e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
