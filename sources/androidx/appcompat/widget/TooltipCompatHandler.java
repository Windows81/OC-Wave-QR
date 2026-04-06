package androidx.appcompat.widget;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;

class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static TooltipCompatHandler J;
    public static TooltipCompatHandler K;

    /* renamed from: A  reason: collision with root package name */
    public final CharSequence f1359A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1360B;
    public final Runnable C;
    public final Runnable D;
    public int E;
    public int F;
    public TooltipPopup G;
    public boolean H;
    public boolean I;

    /* renamed from: z  reason: collision with root package name */
    public final View f1361z;

    public static void e(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = J;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.a();
        }
        J = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.d();
        }
    }

    public final void a() {
        this.f1361z.removeCallbacks(this.C);
    }

    public final void b() {
        this.I = true;
    }

    public void c() {
        if (K == this) {
            K = null;
            TooltipPopup tooltipPopup = this.G;
            if (tooltipPopup != null) {
                tooltipPopup.c();
                this.G = null;
                b();
                this.f1361z.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (J == this) {
            e((TooltipCompatHandler) null);
        }
        this.f1361z.removeCallbacks(this.D);
    }

    public final void d() {
        this.f1361z.postDelayed(this.C, (long) ViewConfiguration.getLongPressTimeout());
    }

    public void f(boolean z2) {
        long j2;
        long longPressTimeout;
        long j3;
        if (ViewCompat.C(this.f1361z)) {
            e((TooltipCompatHandler) null);
            TooltipCompatHandler tooltipCompatHandler = K;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.c();
            }
            K = this;
            this.H = z2;
            TooltipPopup tooltipPopup = new TooltipPopup(this.f1361z.getContext());
            this.G = tooltipPopup;
            tooltipPopup.e(this.f1361z, this.E, this.F, this.H, this.f1359A);
            this.f1361z.addOnAttachStateChangeListener(this);
            if (this.H) {
                j2 = 2500;
            } else {
                if ((ViewCompat.z(this.f1361z) & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j2 = j3 - longPressTimeout;
            }
            this.f1361z.removeCallbacks(this.D);
            this.f1361z.postDelayed(this.D, j2);
        }
    }

    public final boolean g(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (!this.I && Math.abs(x2 - this.E) <= this.f1360B && Math.abs(y2 - this.F) <= this.f1360B) {
            return false;
        }
        this.E = x2;
        this.F = y2;
        this.I = false;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.G != null && this.H) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1361z.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1361z.isEnabled() && this.G == null && g(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.E = view.getWidth() / 2;
        this.F = view.getHeight() / 2;
        f(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
