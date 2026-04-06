package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.Preconditions;

public class FragmentController {

    /* renamed from: a  reason: collision with root package name */
    public final FragmentHostCallback f21596a;

    public FragmentController(FragmentHostCallback fragmentHostCallback) {
        this.f21596a = fragmentHostCallback;
    }

    public static FragmentController b(FragmentHostCallback fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.g(fragmentHostCallback, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentHostCallback fragmentHostCallback = this.f21596a;
        fragmentHostCallback.D.n(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void c() {
        this.f21596a.D.A();
    }

    public boolean d(MenuItem menuItem) {
        return this.f21596a.D.D(menuItem);
    }

    public void e() {
        this.f21596a.D.E();
    }

    public void f() {
        this.f21596a.D.G();
    }

    public void g() {
        this.f21596a.D.P();
    }

    public void h() {
        this.f21596a.D.T();
    }

    public void i() {
        this.f21596a.D.U();
    }

    public void j() {
        this.f21596a.D.W();
    }

    public boolean k() {
        return this.f21596a.D.d0(true);
    }

    public FragmentManager l() {
        return this.f21596a.D;
    }

    public void m() {
        this.f21596a.D.b1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f21596a.D.B0().onCreateView(view, str, context, attributeSet);
    }
}
