package kotlinx.coroutines.android;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;

public final /* synthetic */ class d implements Choreographer.FrameCallback {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f41454z;

    public /* synthetic */ d(CancellableContinuation cancellableContinuation) {
        this.f41454z = cancellableContinuation;
    }

    public final void doFrame(long j2) {
        HandlerDispatcherKt.f(this.f41454z, j2);
    }
}
