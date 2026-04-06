package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ComposeScrollCaptureCallback_androidKt {
    public static final Job c(CoroutineScope coroutineScope, CancellationSignal cancellationSignal, Function2 function2) {
        Job d2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, function2, 3, (Object) null);
        d2.S(new ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(cancellationSignal));
        cancellationSignal.setOnCancelListener(new c(d2));
        return d2;
    }

    public static final void d(Job job) {
        Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
    }
}
