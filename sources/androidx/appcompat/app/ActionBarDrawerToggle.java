package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: a  reason: collision with root package name */
    public final Delegate f474a;

    /* renamed from: b  reason: collision with root package name */
    public final DrawerLayout f475b;

    /* renamed from: c  reason: collision with root package name */
    public DrawerArrowDrawable f476c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f477d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f478e;

    /* renamed from: f  reason: collision with root package name */
    public final int f479f;

    /* renamed from: g  reason: collision with root package name */
    public final int f480g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f481h;

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1  reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ActionBarDrawerToggle f482z;

        public void onClick(View view) {
            ActionBarDrawerToggle actionBarDrawerToggle = this.f482z;
            if (actionBarDrawerToggle.f478e) {
                actionBarDrawerToggle.g();
                return;
            }
            View.OnClickListener onClickListener = actionBarDrawerToggle.f481h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public interface Delegate {
        void a(int i2);
    }

    public interface DelegateProvider {
    }

    public static class FrameworkActionBarDelegate implements Delegate {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f483a;

        public static class Api18Impl {
            public static void a(ActionBar actionBar, int i2) {
                actionBar.setHomeActionContentDescription(i2);
            }

            public static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public void a(int i2) {
            ActionBar actionBar = this.f483a.getActionBar();
            if (actionBar != null) {
                Api18Impl.a(actionBar, i2);
            }
        }
    }

    public static class ToolbarCompatDelegate implements Delegate {

        /* renamed from: a  reason: collision with root package name */
        public final Toolbar f484a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f485b;

        public void a(int i2) {
            if (i2 == 0) {
                this.f484a.setNavigationContentDescription(this.f485b);
            } else {
                this.f484a.setNavigationContentDescription(i2);
            }
        }
    }

    public void a(View view) {
        f(1.0f);
        if (this.f478e) {
            e(this.f480g);
        }
    }

    public void b(View view) {
        f(0.0f);
        if (this.f478e) {
            e(this.f479f);
        }
    }

    public void c(int i2) {
    }

    public void d(View view, float f2) {
        if (this.f477d) {
            f(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            f(0.0f);
        }
    }

    public void e(int i2) {
        this.f474a.a(i2);
    }

    public final void f(float f2) {
        if (f2 == 1.0f) {
            this.f476c.c(true);
        } else if (f2 == 0.0f) {
            this.f476c.c(false);
        }
        this.f476c.b(f2);
    }

    public void g() {
        int q2 = this.f475b.q(8388611);
        if (this.f475b.E(8388611) && q2 != 2) {
            this.f475b.d(8388611);
        } else if (q2 != 1) {
            this.f475b.J(8388611);
        }
    }
}
