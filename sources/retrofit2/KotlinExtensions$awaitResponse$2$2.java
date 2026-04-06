package retrofit2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class KotlinExtensions$awaitResponse$2$2 implements Callback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f44160a;

    public KotlinExtensions$awaitResponse$2$2(CancellableContinuation cancellableContinuation) {
        this.f44160a = cancellableContinuation;
    }

    public void onFailure(Call call, Throwable th) {
        Intrinsics.i(call, "call");
        Intrinsics.i(th, "t");
        CancellableContinuation cancellableContinuation = this.f44160a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(th)));
    }

    public void onResponse(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        this.f44160a.q(Result.b(response));
    }
}
