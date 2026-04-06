package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DefaultChoreographerFrameClock$withFrameNanos$2$1 implements Function1<Throwable, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f14642z;

    public DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        this.f14642z = frameCallback;
    }

    public final void b(Throwable th) {
        DefaultChoreographerFrameClock.f14640A.removeFrameCallback(this.f14642z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
