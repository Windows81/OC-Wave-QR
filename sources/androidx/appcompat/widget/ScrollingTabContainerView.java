package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public static final Interpolator J = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public TabClickListener f1253A;

    /* renamed from: B  reason: collision with root package name */
    public LinearLayoutCompat f1254B;
    public Spinner C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public ViewPropertyAnimator I;

    /* renamed from: z  reason: collision with root package name */
    public Runnable f1255z;

    public class TabAdapter extends BaseAdapter {
        public TabAdapter() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f1254B.getChildCount();
        }

        public Object getItem(int i2) {
            return ((TabView) ScrollingTabContainerView.this.f1254B.getChildAt(i2)).b();
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.c((ActionBar.Tab) getItem(i2), true);
            }
            ((TabView) view).a((ActionBar.Tab) getItem(i2));
            return view;
        }
    }

    public class TabClickListener implements View.OnClickListener {
        public TabClickListener() {
        }

        public void onClick(View view) {
            ((TabView) view).b().f();
            int childCount = ScrollingTabContainerView.this.f1254B.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ScrollingTabContainerView.this.f1254B.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class TabView extends LinearLayout {

        /* renamed from: A  reason: collision with root package name */
        public ActionBar.Tab f1260A;

        /* renamed from: B  reason: collision with root package name */
        public TextView f1261B;
        public ImageView C;
        public View D;

        /* renamed from: z  reason: collision with root package name */
        public final int[] f1262z;

        public TabView(Context context, ActionBar.Tab tab, boolean z2) {
            super(context, (AttributeSet) null, R.attr.f298d);
            int[] iArr = {16842964};
            this.f1262z = iArr;
            this.f1260A = tab;
            TintTypedArray u2 = TintTypedArray.u(context, (AttributeSet) null, iArr, R.attr.f298d, 0);
            if (u2.r(0)) {
                setBackgroundDrawable(u2.f(0));
            }
            u2.v();
            if (z2) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.Tab tab) {
            this.f1260A = tab;
            c();
        }

        public ActionBar.Tab b() {
            return this.f1260A;
        }

        public void c() {
            ActionBar.Tab tab = this.f1260A;
            View b2 = tab.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.D = b2;
                TextView textView = this.f1261B;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.C;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.C.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.D;
            if (view != null) {
                removeView(view);
                this.D = null;
            }
            Drawable c2 = tab.c();
            CharSequence e2 = tab.e();
            if (c2 != null) {
                if (this.C == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.C = appCompatImageView;
                }
                this.C.setImageDrawable(c2);
                this.C.setVisibility(0);
            } else {
                ImageView imageView2 = this.C;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.C.setImageDrawable((Drawable) null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(e2);
            if (!isEmpty) {
                if (this.f1261B == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, R.attr.f299e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1261B = appCompatTextView;
                }
                this.f1261B.setText(e2);
                this.f1261B.setVisibility(0);
            } else {
                TextView textView2 = this.f1261B;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1261B.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.C;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.a());
            }
            if (isEmpty) {
                charSequence = tab.a();
            }
            TooltipCompat.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (ScrollingTabContainerView.this.E > 0 && getMeasuredWidth() > (i4 = ScrollingTabContainerView.this.E)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1263a;

        /* renamed from: b  reason: collision with root package name */
        public int f1264b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ScrollingTabContainerView f1265c;

        public void onAnimationCancel(Animator animator) {
            this.f1263a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1263a) {
                ScrollingTabContainerView scrollingTabContainerView = this.f1265c;
                scrollingTabContainerView.I = null;
                scrollingTabContainerView.setVisibility(this.f1264b);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f1265c.setVisibility(0);
            this.f1263a = false;
        }
    }

    public void a(int i2) {
        final View childAt = this.f1254B.getChildAt(i2);
        Runnable runnable = this.f1255z;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        AnonymousClass1 r0 = new Runnable() {
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.f1255z = null;
            }
        };
        this.f1255z = r0;
        post(r0);
    }

    public final Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, R.attr.f302h);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public TabView c(ActionBar.Tab tab, boolean z2) {
        TabView tabView = new TabView(getContext(), tab, z2);
        if (z2) {
            tabView.setBackgroundDrawable((Drawable) null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.G));
        } else {
            tabView.setFocusable(true);
            if (this.f1253A == null) {
                this.f1253A = new TabClickListener();
            }
            tabView.setOnClickListener(this.f1253A);
        }
        return tabView;
    }

    public final boolean d() {
        Spinner spinner = this.C;
        return spinner != null && spinner.getParent() == this;
    }

    public final void e() {
        if (!d()) {
            if (this.C == null) {
                this.C = b();
            }
            removeView(this.f1254B);
            addView(this.C, new ViewGroup.LayoutParams(-2, -1));
            if (this.C.getAdapter() == null) {
                this.C.setAdapter(new TabAdapter());
            }
            Runnable runnable = this.f1255z;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1255z = null;
            }
            this.C.setSelection(this.H);
        }
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.C);
        addView(this.f1254B, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.C.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1255z;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy b2 = ActionBarPolicy.b(getContext());
        setContentHeight(b2.f());
        this.F = b2.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1255z;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        ((TabView) view).b().f();
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1254B.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.E = -1;
        } else {
            if (childCount > 2) {
                this.E = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.E = View.MeasureSpec.getSize(i2) / 2;
            }
            this.E = Math.min(this.E, this.F);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.G, 1073741824);
        if (z2 || !this.D) {
            f();
        } else {
            this.f1254B.measure(0, makeMeasureSpec);
            if (this.f1254B.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.H);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z2) {
        this.D = z2;
    }

    public void setContentHeight(int i2) {
        this.G = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.H = i2;
        int childCount = this.f1254B.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f1254B.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.C;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}
