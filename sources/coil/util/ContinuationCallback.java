package coil.util;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

@Metadata
final class ContinuationCallback implements Callback, Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final CancellableContinuation f23743A;

    /* renamed from: z  reason: collision with root package name */
    public final Call f23744z;

    public ContinuationCallback(Call call, CancellableContinuation cancellableContinuation) {
        this.f23744z = call;
        this.f23743A = cancellableContinuation;
    }

    public void b(Call call, Response response) {
        this.f23743A.q(Result.b(response));
    }

    public void c(Call call, IOException iOException) {
        if (!call.A()) {
            CancellableContinuation cancellableContinuation = this.f23743A;
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(ResultKt.a(iOException)));
        }
    }

    public void e(Throwable th) {
        try {
            this.f23744z.cancel();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        e((Throwable) obj);
        return Unit.f40552a;
    }
}
