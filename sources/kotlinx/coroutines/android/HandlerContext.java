package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;

@Metadata
public final class HandlerContext extends HandlerDispatcher implements Delay {

    /* renamed from: B  reason: collision with root package name */
    public final Handler f41445B;
    public final String C;
    public final boolean D;
    public final HandlerContext E;

    public HandlerContext(Handler handler, String str, boolean z2) {
        super((DefaultConstructorMarker) null);
        HandlerContext handlerContext;
        this.f41445B = handler;
        this.C = str;
        this.D = z2;
        if (z2) {
            handlerContext = this;
        } else {
            handlerContext = new HandlerContext(handler, str, true);
        }
        this.E = handlerContext;
    }

    public static final Unit E1(HandlerContext handlerContext, Runnable runnable, Throwable th) {
        handlerContext.f41445B.removeCallbacks(runnable);
        return Unit.f40552a;
    }

    public static final void q1(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f41445B.removeCallbacks(runnable);
    }

    public static final void w1(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
        cancellableContinuation.P(handlerContext, Unit.f40552a);
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f41445B.postDelayed(runnable, RangesKt.k(j2, 4611686018427387903L))) {
            return new a(this, runnable);
        }
        b1(coroutineContext, runnable);
        return NonDisposableHandle.f41433z;
    }

    public final void b1(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.b().o0(coroutineContext, runnable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof HandlerContext) {
            HandlerContext handlerContext = (HandlerContext) obj;
            return handlerContext.f41445B == this.f41445B && handlerContext.D == this.D;
        }
    }

    public void f(long j2, CancellableContinuation cancellableContinuation) {
        b bVar = new b(cancellableContinuation, this);
        if (this.f41445B.postDelayed(bVar, RangesKt.k(j2, 4611686018427387903L))) {
            cancellableContinuation.u(new c(this, bVar));
        } else {
            b1(cancellableContinuation.f(), bVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f41445B) ^ (this.D ? 1231 : 1237);
    }

    /* renamed from: j1 */
    public HandlerContext L0() {
        return this.E;
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f41445B.post(runnable)) {
            b1(coroutineContext, runnable);
        }
    }

    public String toString() {
        String J0 = J0();
        if (J0 != null) {
            return J0;
        }
        String str = this.C;
        if (str == null) {
            str = this.f41445B.toString();
        }
        if (!this.D) {
            return str;
        }
        return str + ".immediate";
    }

    public boolean w0(CoroutineContext coroutineContext) {
        return !this.D || !Intrinsics.d(Looper.myLooper(), this.f41445B.getLooper());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerContext(Handler handler, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
