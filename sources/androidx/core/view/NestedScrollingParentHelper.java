package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper {

    /* renamed from: a  reason: collision with root package name */
    public int f20242a;

    /* renamed from: b  reason: collision with root package name */
    public int f20243b;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f20242a | this.f20243b;
    }

    public void b(View view, View view2, int i2) {
        c(view, view2, i2, 0);
    }

    public void c(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f20243b = i2;
        } else {
            this.f20242a = i2;
        }
    }

    public void d(View view, int i2) {
        if (i2 == 1) {
            this.f20243b = 0;
        } else {
            this.f20242a = 0;
        }
    }
}
