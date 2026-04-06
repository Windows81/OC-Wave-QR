package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import kotlinx.coroutines.Job;

public final /* synthetic */ class c implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Job f18016a;

    public /* synthetic */ c(Job job) {
        this.f18016a = job;
    }

    public final void onCancel() {
        ComposeScrollCaptureCallback_androidKt.d(this.f18016a);
    }
}
