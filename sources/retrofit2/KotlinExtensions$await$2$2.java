package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class KotlinExtensions$await$2$2 implements Callback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f44156a;

    public KotlinExtensions$await$2$2(CancellableContinuation cancellableContinuation) {
        this.f44156a = cancellableContinuation;
    }

    public void onFailure(Call call, Throwable th) {
        Intrinsics.i(call, "call");
        Intrinsics.i(th, "t");
        CancellableContinuation cancellableContinuation = this.f44156a;
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(th)));
    }

    public void onResponse(Call call, Response response) {
        Intrinsics.i(call, "call");
        Intrinsics.i(response, "response");
        if (response.e()) {
            Object a2 = response.a();
            if (a2 == null) {
                Object j2 = call.m().j(Invocation.class);
                Intrinsics.f(j2);
                Invocation invocation = (Invocation) j2;
                Class b2 = invocation.b();
                Method a3 = invocation.a();
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + b2.getName() + '.' + a3.getName() + " was null but response body type was declared as non-null");
                CancellableContinuation cancellableContinuation = this.f44156a;
                Result.Companion companion = Result.f40519A;
                cancellableContinuation.q(Result.b(ResultKt.a(kotlinNullPointerException)));
                return;
            }
            this.f44156a.q(Result.b(a2));
            return;
        }
        CancellableContinuation cancellableContinuation2 = this.f44156a;
        Result.Companion companion2 = Result.f40519A;
        cancellableContinuation2.q(Result.b(ResultKt.a(new HttpException(response))));
    }
}
