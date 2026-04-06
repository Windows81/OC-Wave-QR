package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: A  reason: collision with root package name */
    public int f1371A;

    /* renamed from: B  reason: collision with root package name */
    public WeakReference f1372B;
    public LayoutInflater C;
    public OnInflateListener D;

    /* renamed from: z  reason: collision with root package name */
    public int f1373z;

    public interface OnInflateListener {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1373z != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.C;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1373z, viewGroup, false);
            int i2 = this.f1371A;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1372B = new WeakReference(inflate);
            OnInflateListener onInflateListener = this.D;
            if (onInflateListener != null) {
                onInflateListener.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1371A;
    }

    public LayoutInflater getLayoutInflater() {
        return this.C;
    }

    public int getLayoutResource() {
        return this.f1373z;
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f1371A = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.C = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f1373z = i2;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.D = onInflateListener;
    }

    public void setVisibility(int i2) {
        WeakReference weakReference = this.f1372B;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1373z = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.B3, i2, 0);
        this.f1371A = obtainStyledAttributes.getResourceId(R.styleable.E3, -1);
        this.f1373z = obtainStyledAttributes.getResourceId(R.styleable.D3, 0);
        setId(obtainStyledAttributes.getResourceId(R.styleable.C3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
