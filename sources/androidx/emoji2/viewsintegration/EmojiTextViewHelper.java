package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;

public final class EmojiTextViewHelper {

    /* renamed from: a  reason: collision with root package name */
    public final HelperInternal f21417a;

    public static class HelperInternal {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z2) {
        }

        public void d(boolean z2) {
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f21418a;

        /* renamed from: b  reason: collision with root package name */
        public final EmojiInputFilter f21419b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21420c = true;

        public HelperInternal19(TextView textView) {
            this.f21418a = textView;
            this.f21419b = new EmojiInputFilter(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f21420c ? h(inputFilterArr) : f(inputFilterArr);
        }

        public boolean b() {
            return this.f21420c;
        }

        public void c(boolean z2) {
            if (z2) {
                l();
            }
        }

        public void d(boolean z2) {
            this.f21420c = z2;
            l();
            k();
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f21420c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            for (EmojiInputFilter emojiInputFilter : inputFilterArr) {
                if (emojiInputFilter == this.f21419b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f21419b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g2 = g(inputFilterArr);
            if (g2.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g2.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (g2.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z2) {
            this.f21420c = z2;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f21418a.setFilters(a(this.f21418a.getFilters()));
        }

        public void l() {
            this.f21418a.setTransformationMethod(e(this.f21418a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof EmojiTransformationMethod) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new EmojiTransformationMethod(transformationMethod) : transformationMethod;
        }
    }

    public static class SkippingHelper19 extends HelperInternal {

        /* renamed from: a  reason: collision with root package name */
        public final HelperInternal19 f21421a;

        public SkippingHelper19(TextView textView) {
            this.f21421a = new HelperInternal19(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f21421a.a(inputFilterArr);
        }

        public boolean b() {
            return this.f21421a.b();
        }

        public void c(boolean z2) {
            if (!f()) {
                this.f21421a.c(z2);
            }
        }

        public void d(boolean z2) {
            if (f()) {
                this.f21421a.i(z2);
            } else {
                this.f21421a.d(z2);
            }
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f21421a.e(transformationMethod);
        }

        public final boolean f() {
            return !EmojiCompat.k();
        }
    }

    public EmojiTextViewHelper(TextView textView, boolean z2) {
        Preconditions.g(textView, "textView cannot be null");
        if (!z2) {
            this.f21417a = new SkippingHelper19(textView);
        } else {
            this.f21417a = new HelperInternal19(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f21417a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f21417a.b();
    }

    public void c(boolean z2) {
        this.f21417a.c(z2);
    }

    public void d(boolean z2) {
        this.f21417a.d(z2);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f21417a.e(transformationMethod);
    }
}
