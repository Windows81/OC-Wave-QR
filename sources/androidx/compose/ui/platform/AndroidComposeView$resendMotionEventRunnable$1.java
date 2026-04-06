package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeView$resendMotionEventRunnable$1 implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17525z;

    public AndroidComposeView$resendMotionEventRunnable$1(AndroidComposeView androidComposeView) {
        this.f17525z = androidComposeView;
    }

    public void run() {
        this.f17525z.removeCallbacks(this);
        MotionEvent a0 = this.f17525z.W0;
        if (a0 != null) {
            boolean z2 = false;
            if (a0.getToolType(0) == 3) {
                z2 = true;
            }
            int actionMasked = a0.getActionMasked();
            if (z2) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i2 = 7;
            if (!(actionMasked == 7 || actionMasked == 9)) {
                i2 = 2;
            }
            AndroidComposeView androidComposeView = this.f17525z;
            androidComposeView.f1(a0, i2, androidComposeView.X0, false);
        }
    }
}
