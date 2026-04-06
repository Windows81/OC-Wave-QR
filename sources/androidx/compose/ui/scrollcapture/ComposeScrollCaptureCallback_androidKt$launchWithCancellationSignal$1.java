package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f18004z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1(CancellationSignal cancellationSignal) {
        super(1);
        this.f18004z = cancellationSignal;
    }

    public final void b(Throwable th) {
        if (th != null) {
            this.f18004z.cancel();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
