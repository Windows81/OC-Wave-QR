package retrofit2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class KotlinExtensions$await$4$2 implements Callback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f44158a;

    public KotlinExtensions$await$4$2(CancellableContinuation cancellableContinuation) {
        this.f44158a = cancellableContinuation;
    }

    public void onFailure(Call call, Throwable th) {
        Intrinsics.i(call, "call");
        Intrinsics.i(th, "t");
        CancellableContinuation cancellableContinuation = this.f44158a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(th)));
    }

    public void onResponse(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        if (response.e()) {
            CancellableContinuation cancellableContinuation = this.f44158a;
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(response.a()));
            return;
        }
        CancellableContinuation cancellableContinuation2 = this.f44158a;
        Result.Companion companion2 = Result.f40519A;
        cancellableContinuation2.q(Result.b(ResultKt.a(new HttpException(response))));
    }
}
