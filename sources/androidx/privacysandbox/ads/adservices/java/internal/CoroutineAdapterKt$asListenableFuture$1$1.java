package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;

@Metadata
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Deferred f22720A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f22721z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer completer, Deferred deferred) {
        super(1);
        this.f22721z = completer;
        this.f22720A = deferred;
    }

    public final void b(Throwable th) {
        if (th == null) {
            this.f22721z.b(this.f22720A.m());
        } else if (th instanceof CancellationException) {
            this.f22721z.c();
        } else {
            this.f22721z.e(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
