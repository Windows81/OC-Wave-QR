package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1109b = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1110a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    public final void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet, R.styleable.a2, i2, i3);
        if (u2.r(R.styleable.c2)) {
            b(u2.a(R.styleable.c2, false));
        }
        setBackgroundDrawable(u2.f(R.styleable.b2));
        u2.v();
    }

    public final void b(boolean z2) {
        if (f1109b) {
            this.f1110a = z2;
        } else {
            PopupWindowCompat.a(this, z2);
        }
    }

    public void showAsDropDown(View view, int i2, int i3) {
        if (f1109b && this.f1110a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f1109b && this.f1110a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1109b && this.f1110a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }
}
