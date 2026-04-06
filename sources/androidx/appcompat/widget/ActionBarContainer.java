package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    public View f988A;

    /* renamed from: B  reason: collision with root package name */
    public View f989B;
    public View C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: z  reason: collision with root package name */
    public boolean f990z;

    public static class Api21Impl {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.X(this, new ActionBarBackgroundDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f447a);
        this.D = obtainStyledAttributes.getDrawable(R.styleable.f448b);
        this.E = obtainStyledAttributes.getDrawable(R.styleable.f450d);
        this.I = obtainStyledAttributes.getDimensionPixelSize(R.styleable.f456j, -1);
        boolean z2 = true;
        if (getId() == R.id.N) {
            this.G = true;
            this.F = obtainStyledAttributes.getDrawable(R.styleable.f449c);
        }
        obtainStyledAttributes.recycle();
        if (!this.G ? !(this.D == null && this.E == null) : this.F != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful()) {
            this.D.setState(getDrawableState());
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && drawable2.isStateful()) {
            this.E.setState(getDrawableState());
        }
        Drawable drawable3 = this.F;
        if (drawable3 != null && drawable3.isStateful()) {
            this.F.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f988A;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f989B = findViewById(R.id.f375a);
        this.C = findViewById(R.id.f380f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f990z || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f988A
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.G
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.F
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.D
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f989B
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.D
            android.view.View r7 = r4.f989B
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f989B
            int r8 = r8.getTop()
            android.view.View r0 = r4.f989B
            int r0 = r0.getRight()
            android.view.View r2 = r4.f989B
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.C
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.D
            android.view.View r7 = r4.C
            int r7 = r7.getLeft()
            android.view.View r8 = r4.C
            int r8 = r8.getTop()
            android.view.View r0 = r4.C
            int r0 = r0.getRight()
            android.view.View r2 = r4.C
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.D
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.H = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.E
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f989B == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.I) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f989B != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view = this.f988A;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f989B) ? a(this.f989B) : !b(this.C) ? a(this.C) : 0) + a(this.f988A), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.D);
        }
        this.D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f989B;
            if (view != null) {
                this.D.setBounds(view.getLeft(), this.f989B.getTop(), this.f989B.getRight(), this.f989B.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.G ? this.D == null && this.E == null : this.F == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.F);
        }
        this.F = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.G && (drawable2 = this.F) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.G ? this.D == null && this.E == null : this.F == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.E;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.E);
        }
        this.E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.H && (drawable2 = this.E) != null) {
                drawable2.setBounds(this.f988A.getLeft(), this.f988A.getTop(), this.f988A.getRight(), this.f988A.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.G ? this.D == null && this.E == null : this.F == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f988A;
        if (view != null) {
            removeView(view);
        }
        this.f988A = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f990z = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.D && !this.G) || (drawable == this.E && this.H) || ((drawable == this.F && this.G) || super.verifyDrawable(drawable));
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
