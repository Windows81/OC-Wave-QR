package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;

public class PagerTabStrip extends PagerTitleStrip {
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Paint V;
    public final Rect W;
    public int a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public float f0;
    public float g0;
    public int h0;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$1  reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ PagerTabStrip f23071z;

        public void onClick(View view) {
            ViewPager viewPager = this.f23071z.f23075z;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$2  reason: invalid class name */
    class AnonymousClass2 implements View.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ PagerTabStrip f23072z;

        public void onClick(View view) {
            ViewPager viewPager = this.f23072z.f23075z;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public void c(int i2, float f2, boolean z2) {
        Rect rect = this.W;
        int height = getHeight();
        int left = this.f23074B.getLeft() - this.U;
        int right = this.f23074B.getRight() + this.U;
        int i3 = height - this.Q;
        rect.set(left, i3, right, height);
        super.c(i2, f2, z2);
        this.a0 = (int) (Math.abs(f2 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f23074B.getLeft() - this.U, i3, this.f23074B.getRight() + this.U, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.b0;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.T);
    }

    public int getTabIndicatorColor() {
        return this.P;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f23074B.getLeft() - this.U;
        int right = this.f23074B.getRight() + this.U;
        this.V.setColor((this.a0 << 24) | (this.P & 16777215));
        float f2 = (float) height;
        canvas.drawRect((float) left, (float) (height - this.Q), (float) right, f2, this.V);
        if (this.b0) {
            this.V.setColor((this.P & 16777215) | -16777216);
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.d0), (float) (getWidth() - getPaddingRight()), f2, this.V);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.e0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action == 0) {
            this.f0 = x2;
            this.g0 = y2;
            this.e0 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x2 - this.f0) > ((float) this.h0) || Math.abs(y2 - this.g0) > ((float) this.h0))) {
                this.e0 = true;
            }
        } else if (x2 < ((float) (this.f23074B.getLeft() - this.U))) {
            ViewPager viewPager = this.f23075z;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x2 > ((float) (this.f23074B.getRight() + this.U))) {
            ViewPager viewPager2 = this.f23075z;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(int i2) {
        super.setBackgroundColor(i2);
        if (!this.c0) {
            this.b0 = (i2 & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.c0) {
            this.b0 = drawable == null;
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if (!this.c0) {
            this.b0 = i2 == 0;
        }
    }

    public void setDrawFullUnderline(boolean z2) {
        this.b0 = z2;
        this.c0 = true;
        invalidate();
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        int i6 = this.R;
        if (i5 < i6) {
            i5 = i6;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(int i2) {
        this.P = i2;
        this.V.setColor(i2);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i2) {
        setTabIndicatorColor(ContextCompat.c(getContext(), i2));
    }

    public void setTextSpacing(int i2) {
        int i3 = this.S;
        if (i2 < i3) {
            i2 = i3;
        }
        super.setTextSpacing(i2);
    }
}
