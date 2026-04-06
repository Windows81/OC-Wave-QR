package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

@Metadata
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$1 implements View.OnAttachStateChangeListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Job f17935z;

    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(Job job) {
        this.f17935z = job;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Job.DefaultImpls.a(this.f17935z, (CancellationException) null, 1, (Object) null);
    }
}
