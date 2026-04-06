package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class AndroidUiFrameClock$withFrameNanos$2$callback$1 implements Choreographer.FrameCallback {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidUiFrameClock f17648A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f17649B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f17650z;

    public AndroidUiFrameClock$withFrameNanos$2$callback$1(CancellableContinuation cancellableContinuation, AndroidUiFrameClock androidUiFrameClock, Function1 function1) {
        this.f17650z = cancellableContinuation;
        this.f17648A = androidUiFrameClock;
        this.f17649B = function1;
    }

    public final void doFrame(long j2) {
        Object obj;
        CancellableContinuation cancellableContinuation = this.f17650z;
        Function1 function1 = this.f17649B;
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
