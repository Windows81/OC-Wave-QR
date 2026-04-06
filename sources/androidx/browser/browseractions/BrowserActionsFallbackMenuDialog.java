package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@Deprecated
class BrowserActionsFallbackMenuDialog extends Dialog {

    /* renamed from: z  reason: collision with root package name */
    public final View f1572z;

    public final void b(final boolean z2) {
        float f2 = 1.0f;
        float f3 = z2 ? 0.0f : 1.0f;
        if (!z2) {
            f2 = 0.0f;
        }
        long j2 = z2 ? 250 : 150;
        this.f1572z.setScaleX(f3);
        this.f1572z.setScaleY(f3);
        this.f1572z.animate().scaleX(f2).scaleY(f2).setDuration(j2).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                if (!z2) {
                    BrowserActionsFallbackMenuDialog.super.dismiss();
                }
            }
        }).start();
    }

    public void dismiss() {
        b(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
