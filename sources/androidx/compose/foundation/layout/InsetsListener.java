package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Metadata;

@Metadata
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    /* renamed from: B  reason: collision with root package name */
    public final WindowInsetsHolder f4046B;
    public boolean C;
    public boolean D;
    public WindowInsetsCompat E;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(windowInsetsHolder.d() ^ true ? 1 : 0);
        this.f4046B = windowInsetsHolder;
    }

    public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        this.E = windowInsetsCompat;
        this.f4046B.t(windowInsetsCompat);
        if (this.C) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.D) {
            this.f4046B.s(windowInsetsCompat);
            WindowInsetsHolder.r(this.f4046B, windowInsetsCompat, 0, 2, (Object) null);
        }
        return this.f4046B.d() ? WindowInsetsCompat.f20331b : windowInsetsCompat;
    }

    public void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.C = false;
        this.D = false;
        WindowInsetsCompat windowInsetsCompat = this.E;
        if (!(windowInsetsAnimationCompat.a() == 0 || windowInsetsCompat == null)) {
            this.f4046B.s(windowInsetsCompat);
            this.f4046B.t(windowInsetsCompat);
            WindowInsetsHolder.r(this.f4046B, windowInsetsCompat, 0, 2, (Object) null);
        }
        this.E = null;
        super.c(windowInsetsAnimationCompat);
    }

    public void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.C = true;
        this.D = true;
        super.d(windowInsetsAnimationCompat);
    }

    public WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list) {
        WindowInsetsHolder.r(this.f4046B, windowInsetsCompat, 0, 2, (Object) null);
        return this.f4046B.d() ? WindowInsetsCompat.f20331b : windowInsetsCompat;
    }

    public WindowInsetsAnimationCompat.BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.C = false;
        return super.f(windowInsetsAnimationCompat, boundsCompat);
    }

    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
    }

    public void run() {
        if (this.C) {
            this.C = false;
            this.D = false;
            WindowInsetsCompat windowInsetsCompat = this.E;
            if (windowInsetsCompat != null) {
                this.f4046B.s(windowInsetsCompat);
                WindowInsetsHolder.r(this.f4046B, windowInsetsCompat, 0, 2, (Object) null);
                this.E = null;
            }
        }
    }
}
