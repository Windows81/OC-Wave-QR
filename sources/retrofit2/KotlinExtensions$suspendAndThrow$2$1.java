package retrofit2;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class KotlinExtensions$suspendAndThrow$2$1 implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throwable f44161A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Continuation f44162z;

    public KotlinExtensions$suspendAndThrow$2$1(Continuation continuation, Throwable th) {
        this.f44162z = continuation;
        this.f44161A = th;
    }

    public final void run() {
        Continuation c2 = IntrinsicsKt.c(this.f44162z);
        Result.Companion companion = Result.f40519A;
        c2.q(Result.b(ResultKt.a(this.f44161A)));
    }
}
