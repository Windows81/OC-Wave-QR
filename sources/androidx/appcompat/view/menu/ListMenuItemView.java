package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A  reason: collision with root package name */
    public ImageView f878A;

    /* renamed from: B  reason: collision with root package name */
    public RadioButton f879B;
    public TextView C;
    public CheckBox D;
    public TextView E;
    public ImageView F;
    public ImageView G;
    public LinearLayout H;
    public Drawable I;
    public int J;
    public Context K;
    public boolean L;
    public Drawable M;
    public boolean N;
    public LayoutInflater O;
    public boolean P;

    /* renamed from: z  reason: collision with root package name */
    public MenuItemImpl f880z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.F);
    }

    private LayoutInflater getInflater() {
        if (this.O == null) {
            this.O = LayoutInflater.from(getContext());
        }
        return this.O;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.F;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.G;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.G.getLayoutParams();
            rect.top += this.G.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public final void b(View view, int i2) {
        LinearLayout linearLayout = this.H;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public boolean c() {
        return false;
    }

    public void d(MenuItemImpl menuItemImpl, int i2) {
        this.f880z = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.i(this));
        setCheckable(menuItemImpl.isCheckable());
        h(menuItemImpl.A(), menuItemImpl.g());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.f410j, this, false);
        this.D = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.f411k, this, false);
        this.f878A = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.f413m, this, false);
        this.f879B = radioButton;
        a(radioButton);
    }

    public MenuItemImpl getItemData() {
        return this.f880z;
    }

    public void h(boolean z2, char c2) {
        int i2 = (!z2 || !this.f880z.A()) ? 8 : 0;
        if (i2 == 0) {
            this.E.setText(this.f880z.h());
        }
        if (this.E.getVisibility() != i2) {
            this.E.setVisibility(i2);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.X(this, this.I);
        TextView textView = (TextView) findViewById(R.id.S);
        this.C = textView;
        int i2 = this.J;
        if (i2 != -1) {
            textView.setTextAppearance(this.K, i2);
        }
        this.E = (TextView) findViewById(R.id.L);
        ImageView imageView = (ImageView) findViewById(R.id.O);
        this.F = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.M);
        }
        this.G = (ImageView) findViewById(R.id.f395u);
        this.H = (LinearLayout) findViewById(R.id.f387m);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f878A != null && this.L) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f878A.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        View view;
        CompoundButton compoundButton;
        if (z2 || this.f879B != null || this.D != null) {
            if (this.f880z.m()) {
                if (this.f879B == null) {
                    g();
                }
                compoundButton = this.f879B;
                view = this.D;
            } else {
                if (this.D == null) {
                    e();
                }
                compoundButton = this.D;
                view = this.f879B;
            }
            if (z2) {
                compoundButton.setChecked(this.f880z.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.D;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f879B;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f880z.m()) {
            if (this.f879B == null) {
                g();
            }
            compoundButton = this.f879B;
        } else {
            if (this.D == null) {
                e();
            }
            compoundButton = this.D;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.P = z2;
        this.L = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility((this.N || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f880z.z() || this.P;
        if (z2 || this.L) {
            ImageView imageView = this.f878A;
            if (imageView != null || drawable != null || this.L) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.L) {
                    ImageView imageView2 = this.f878A;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f878A.getVisibility() != 0) {
                        this.f878A.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f878A.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.C.setText(charSequence);
            if (this.C.getVisibility() != 0) {
                this.C.setVisibility(0);
            }
        } else if (this.C.getVisibility() != 8) {
            this.C.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        TintTypedArray u2 = TintTypedArray.u(getContext(), attributeSet, R.styleable.V1, i2, 0);
        this.I = u2.f(R.styleable.X1);
        this.J = u2.m(R.styleable.W1, -1);
        this.L = u2.a(R.styleable.Y1, false);
        this.K = context;
        this.M = u2.f(R.styleable.Z1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.C, 0);
        this.N = obtainStyledAttributes.hasValue(0);
        u2.v();
        obtainStyledAttributes.recycle();
    }
}
