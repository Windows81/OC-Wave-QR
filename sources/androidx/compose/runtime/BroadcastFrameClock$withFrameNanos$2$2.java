package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.internal.AtomicInt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
public final class BroadcastFrameClock$withFrameNanos$2$2 implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BroadcastFrameClock f14546A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f14547B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BroadcastFrameClock.FrameAwaiter f14548z;

    public BroadcastFrameClock$withFrameNanos$2$2(BroadcastFrameClock.FrameAwaiter frameAwaiter, BroadcastFrameClock broadcastFrameClock, Ref.IntRef intRef) {
        this.f14548z = frameAwaiter;
        this.f14546A = broadcastFrameClock;
        this.f14547B = intRef;
    }

    public final void b(Throwable th) {
        int i2;
        this.f14548z.a();
        AtomicInt o2 = this.f14546A.C;
        int i3 = this.f14547B.f40906z;
        do {
            i2 = o2.get();
        } while (!o2.compareAndSet(i2, ((i2 >>> 27) & 15) == i3 ? i2 - 1 : i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
