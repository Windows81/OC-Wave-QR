package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f828a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f829b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f830c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimatorListener f831d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f832e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewPropertyAnimatorListenerAdapter f833f = new ViewPropertyAnimatorListenerAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public boolean f834a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f835b = 0;

        public void b(View view) {
            int i2 = this.f835b + 1;
            this.f835b = i2;
            if (i2 == ViewPropertyAnimatorCompatSet.this.f828a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f831d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f834a) {
                this.f834a = true;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f831d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.c((View) null);
                }
            }
        }

        public void d() {
            this.f835b = 0;
            this.f834a = false;
            ViewPropertyAnimatorCompatSet.this.b();
        }
    };

    public void a() {
        if (this.f832e) {
            Iterator it = this.f828a.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).c();
            }
            this.f832e = false;
        }
    }

    public void b() {
        this.f832e = false;
    }

    public ViewPropertyAnimatorCompatSet c(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f832e) {
            this.f828a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f828a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.j(viewPropertyAnimatorCompat.d());
        this.f828a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public ViewPropertyAnimatorCompatSet e(long j2) {
        if (!this.f832e) {
            this.f829b = j2;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet f(Interpolator interpolator) {
        if (!this.f832e) {
            this.f830c = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet g(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f832e) {
            this.f831d = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void h() {
        if (!this.f832e) {
            Iterator it = this.f828a.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
                long j2 = this.f829b;
                if (j2 >= 0) {
                    viewPropertyAnimatorCompat.f(j2);
                }
                Interpolator interpolator = this.f830c;
                if (interpolator != null) {
                    viewPropertyAnimatorCompat.g(interpolator);
                }
                if (this.f831d != null) {
                    viewPropertyAnimatorCompat.h(this.f833f);
                }
                viewPropertyAnimatorCompat.l();
            }
            this.f832e = true;
        }
    }
}
