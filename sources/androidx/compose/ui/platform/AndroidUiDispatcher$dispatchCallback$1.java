package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f17641z;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.f17641z = androidUiDispatcher;
    }

    public void doFrame(long j2) {
        this.f17641z.C.removeCallbacks(this);
        this.f17641z.G1();
        this.f17641z.F1(j2);
    }

    public void run() {
        this.f17641z.G1();
        Object L0 = this.f17641z.D;
        AndroidUiDispatcher androidUiDispatcher = this.f17641z;
        synchronized (L0) {
            try {
                if (androidUiDispatcher.F.isEmpty()) {
                    androidUiDispatcher.q1().removeFrameCallback(this);
                    androidUiDispatcher.I = false;
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
