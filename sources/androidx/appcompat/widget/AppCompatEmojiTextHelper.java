package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

class AppCompatEmojiTextHelper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1093a;

    /* renamed from: b  reason: collision with root package name */
    public final EmojiTextViewHelper f1094b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f1093a = textView;
        this.f1094b = new EmojiTextViewHelper(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1094b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1094b.b();
    }

    /* JADX INFO: finally extract failed */
    public void c(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f1093a.getContext().obtainStyledAttributes(attributeSet, R.styleable.i0, i2, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(R.styleable.w0)) {
                z2 = obtainStyledAttributes.getBoolean(R.styleable.w0, true);
            }
            obtainStyledAttributes.recycle();
            e(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z2) {
        this.f1094b.c(z2);
    }

    public void e(boolean z2) {
        this.f1094b.d(z2);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1094b.e(transformationMethod);
    }
}
