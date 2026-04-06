package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17524z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.f17524z = androidComposeView;
    }

    public final void invoke() {
        MotionEvent a0 = this.f17524z.W0;
        if (a0 != null) {
            int actionMasked = a0.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.f17524z.X0 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.f17524z;
                androidComposeView.post(androidComposeView.a1);
            }
        }
    }
}
