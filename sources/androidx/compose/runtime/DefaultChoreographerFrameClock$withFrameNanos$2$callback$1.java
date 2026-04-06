package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 implements Choreographer.FrameCallback {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f14643A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f14644z;

    public DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(CancellableContinuation cancellableContinuation, Function1 function1) {
        this.f14644z = cancellableContinuation;
        this.f14643A = function1;
    }

    public final void doFrame(long j2) {
        Object obj;
        CancellableContinuation cancellableContinuation = this.f14644z;
        DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f14641z;
        Function1 function1 = this.f14643A;
        try {
            Result.Companion companion = Result.f40519A;
            obj = Result.b(function1.invoke(Long.valueOf(j2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.f40519A;
            obj = Result.b(ResultKt.a(th));
        }
        cancellableContinuation.q(obj);
    }
}
