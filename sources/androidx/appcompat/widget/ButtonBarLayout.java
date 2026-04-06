package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public boolean f1184A;

    /* renamed from: B  reason: collision with root package name */
    public int f1185B = -1;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1186z;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.P0);
        ViewCompat.S(this, context, R.styleable.P0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1186z = obtainStyledAttributes.getBoolean(R.styleable.Q0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1186z);
        }
    }

    private void setStacked(boolean z2) {
        if (this.f1184A == z2) {
            return;
        }
        if (!z2 || this.f1186z) {
            this.f1184A = z2;
            setOrientation(z2 ? 1 : 0);
            setGravity(z2 ? 8388613 : 80);
            View findViewById = findViewById(R.id.M);
            if (findViewById != null) {
                findViewById.setVisibility(z2 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f1184A;
    }

    public void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f1186z) {
            if (size > this.f1185B && b()) {
                setStacked(false);
            }
            this.f1185B = size;
        }
        if (b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f1186z && !b() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int a2 = a(0);
        if (a2 >= 0) {
            View childAt = getChildAt(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a3 = a(a2 + 1);
                if (a3 >= 0) {
                    paddingTop += getChildAt(a3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            } else {
                i5 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.t(this) != i5) {
            setMinimumHeight(i5);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f1186z != z2) {
            this.f1186z = z2;
            if (!z2 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
