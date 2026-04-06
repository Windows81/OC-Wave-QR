package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    public static final int[] N = {16842804, 16842901, 16842904, 16842927};
    public static final int[] O = {16843660};

    /* renamed from: A  reason: collision with root package name */
    public TextView f23073A;

    /* renamed from: B  reason: collision with root package name */
    public TextView f23074B;
    public TextView C;
    public int D;
    public float E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public final PageListener J;
    public WeakReference K;
    public int L;
    public int M;

    /* renamed from: z  reason: collision with root package name */
    public ViewPager f23075z;

    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f23076a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PagerTitleStrip f23077b;

        public void a(int i2, float f2, int i3) {
            if (f2 > 0.5f) {
                i2++;
            }
            this.f23077b.c(i2, f2, false);
        }

        public void b(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.f23077b.a(pagerAdapter, pagerAdapter2);
        }

        public void c(int i2) {
            this.f23076a = i2;
        }

        public void d(int i2) {
            if (this.f23076a == 0) {
                PagerTitleStrip pagerTitleStrip = this.f23077b;
                pagerTitleStrip.b(pagerTitleStrip.f23075z.getCurrentItem(), this.f23077b.f23075z.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = this.f23077b;
                float f2 = pagerTitleStrip2.E;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                pagerTitleStrip2.c(pagerTitleStrip2.f23075z.getCurrentItem(), f2, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = this.f23077b;
            pagerTitleStrip.b(pagerTitleStrip.f23075z.getCurrentItem(), this.f23077b.f23075z.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = this.f23077b;
            float f2 = pagerTitleStrip2.E;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            pagerTitleStrip2.c(pagerTitleStrip2.f23075z.getCurrentItem(), f2, true);
        }
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* renamed from: a  reason: collision with root package name */
        public Locale f23078a;

        public SingleLineAllCapsTransform(Context context) {
            this.f23078a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f23078a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.t(this.J);
            this.K = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.l(this.J);
            this.K = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.f23075z;
        if (viewPager != null) {
            this.D = -1;
            this.E = -1.0f;
            b(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public void b(int i2, PagerAdapter pagerAdapter) {
        int e2 = pagerAdapter != null ? pagerAdapter.e() : 0;
        this.H = true;
        CharSequence charSequence = null;
        this.f23073A.setText((i2 < 1 || pagerAdapter == null) ? null : pagerAdapter.g(i2 - 1));
        this.f23074B.setText((pagerAdapter == null || i2 >= e2) ? null : pagerAdapter.g(i2));
        int i3 = i2 + 1;
        if (i3 < e2 && pagerAdapter != null) {
            charSequence = pagerAdapter.g(i3);
        }
        this.C.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f23073A.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f23074B.measure(makeMeasureSpec, makeMeasureSpec2);
        this.C.measure(makeMeasureSpec, makeMeasureSpec2);
        this.D = i2;
        if (!this.I) {
            c(i2, this.E, false);
        }
        this.H = false;
    }

    public void c(int i2, float f2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        float f3 = f2;
        if (i7 != this.D) {
            b(i7, this.f23075z.getAdapter());
        } else if (!z2 && f3 == this.E) {
            return;
        }
        this.I = true;
        int measuredWidth = this.f23073A.getMeasuredWidth();
        int measuredWidth2 = this.f23074B.getMeasuredWidth();
        int measuredWidth3 = this.C.getMeasuredWidth();
        int i8 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i9 = paddingRight + i8;
        int i10 = (width - (paddingLeft + i8)) - i9;
        float f4 = 0.5f + f3;
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        int i11 = ((width - i9) - ((int) (((float) i10) * f4))) - i8;
        int i12 = measuredWidth2 + i11;
        int baseline = this.f23073A.getBaseline();
        int baseline2 = this.f23074B.getBaseline();
        int baseline3 = this.C.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i13 = max - baseline;
        int i14 = max - baseline2;
        int i15 = max - baseline3;
        int i16 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f23073A.getMeasuredHeight() + i13, this.f23074B.getMeasuredHeight() + i14), this.C.getMeasuredHeight() + i15);
        int i17 = this.G & 112;
        if (i17 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i17 != 80) {
            i5 = i13 + paddingTop;
            i3 = i14 + paddingTop;
            i4 = paddingTop + i15;
            TextView textView = this.f23074B;
            textView.layout(i11, i3, i12, textView.getMeasuredHeight() + i3);
            int min = Math.min(paddingLeft, (i11 - this.F) - measuredWidth);
            TextView textView2 = this.f23073A;
            textView2.layout(min, i5, measuredWidth + min, textView2.getMeasuredHeight() + i5);
            int max3 = Math.max((width - paddingRight) - i16, i12 + this.F);
            TextView textView3 = this.C;
            textView3.layout(max3, i4, max3 + i16, textView3.getMeasuredHeight() + i4);
            this.E = f2;
            this.I = false;
        } else {
            i6 = (height - paddingBottom) - max2;
        }
        i5 = i13 + i6;
        i3 = i14 + i6;
        i4 = i6 + i15;
        TextView textView4 = this.f23074B;
        textView4.layout(i11, i3, i12, textView4.getMeasuredHeight() + i3);
        int min2 = Math.min(paddingLeft, (i11 - this.F) - measuredWidth);
        TextView textView22 = this.f23073A;
        textView22.layout(min2, i5, measuredWidth + min2, textView22.getMeasuredHeight() + i5);
        int max32 = Math.max((width - paddingRight) - i16, i12 + this.F);
        TextView textView32 = this.C;
        textView32.layout(max32, i4, max32 + i16, textView32.getMeasuredHeight() + i4);
        this.E = f2;
        this.I = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.F;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.N(this.J);
            viewPager.b(this.J);
            this.f23075z = viewPager;
            WeakReference weakReference = this.K;
            a(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f23075z;
        if (viewPager != null) {
            a(viewPager.getAdapter(), (PagerAdapter) null);
            this.f23075z.N((ViewPager.OnPageChangeListener) null);
            this.f23075z.G(this.J);
            this.f23075z = null;
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f23075z != null) {
            float f2 = this.E;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            c(this.D, f2, true);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i2);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (((float) size) * 0.2f), -2);
            this.f23073A.measure(childMeasureSpec2, childMeasureSpec);
            this.f23074B.measure(childMeasureSpec2, childMeasureSpec);
            this.C.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i3) == 1073741824) {
                i4 = View.MeasureSpec.getSize(i3);
            } else {
                i4 = Math.max(getMinHeight(), this.f23074B.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i4, i3, this.f23074B.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.H) {
            super.requestLayout();
        }
    }

    public void setGravity(int i2) {
        this.G = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        int i2 = ((int) (f2 * 255.0f)) & 255;
        this.L = i2;
        int i3 = (i2 << 24) | (this.M & 16777215);
        this.f23073A.setTextColor(i3);
        this.C.setTextColor(i3);
    }

    public void setTextColor(int i2) {
        this.M = i2;
        this.f23074B.setTextColor(i2);
        int i3 = (this.L << 24) | (this.M & 16777215);
        this.f23073A.setTextColor(i3);
        this.C.setTextColor(i3);
    }

    public void setTextSpacing(int i2) {
        this.F = i2;
        requestLayout();
    }
}
