package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;

@Metadata
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {
    public final BufferedChannel D;
    public final /* synthetic */ AtomicReferenceArray E = new AtomicReferenceArray(BufferedChannelKt.f41472b * 2);

    public ChannelSegment(long j2, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i2) {
        super(j2, channelSegment, i2);
        this.D = bufferedChannel;
    }

    public final Object A(int i2) {
        return z().get(i2 * 2);
    }

    public final Object B(int i2) {
        return z().get((i2 * 2) + 1);
    }

    public final void C(int i2, boolean z2) {
        if (z2) {
            y().H1((this.f41864B * ((long) BufferedChannelKt.f41472b)) + ((long) i2));
        }
        t();
    }

    public final Object D(int i2) {
        Object A2 = A(i2);
        w(i2);
        return A2;
    }

    public final void E(int i2, Object obj) {
        z().set(i2 * 2, obj);
    }

    public final void F(int i2, Object obj) {
        z().set((i2 * 2) + 1, obj);
    }

    public final void G(int i2, Object obj) {
        E(i2, obj);
    }

    public int r() {
        return BufferedChannelKt.f41472b;
    }

    public void s(int i2, Throwable th, CoroutineContext coroutineContext) {
        Function1 function1;
        Function1 function12;
        int i3 = BufferedChannelKt.f41472b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object A2 = A(i2);
        while (true) {
            Object B2 = B(i2);
            if ((B2 instanceof Waiter) || (B2 instanceof WaiterEB)) {
                if (v(i2, B2, z2 ? BufferedChannelKt.f41480j : BufferedChannelKt.f41481k)) {
                    w(i2);
                    C(i2, !z2);
                    if (z2 && (function1 = y().f41461A) != null) {
                        OnUndeliveredElementKt.a(function1, A2, coroutineContext);
                        return;
                    }
                    return;
                }
            } else if (B2 == BufferedChannelKt.f41480j || B2 == BufferedChannelKt.f41481k) {
                w(i2);
            } else if (!(B2 == BufferedChannelKt.f41477g || B2 == BufferedChannelKt.f41476f)) {
                if (B2 != BufferedChannelKt.f41479i && B2 != BufferedChannelKt.f41474d && B2 != BufferedChannelKt.z()) {
                    throw new IllegalStateException(("unexpected state: " + B2).toString());
                }
                return;
            }
        }
        w(i2);
        if (z2 && (function12 = y().f41461A) != null) {
            OnUndeliveredElementKt.a(function12, A2, coroutineContext);
        }
    }

    public final boolean v(int i2, Object obj, Object obj2) {
        return d.a(z(), (i2 * 2) + 1, obj, obj2);
    }

    public final void w(int i2) {
        E(i2, (Object) null);
    }

    public final Object x(int i2, Object obj) {
        return z().getAndSet((i2 * 2) + 1, obj);
    }

    public final BufferedChannel y() {
        BufferedChannel bufferedChannel = this.D;
        Intrinsics.f(bufferedChannel);
        return bufferedChannel;
    }

    public final /* synthetic */ AtomicReferenceArray z() {
        return this.E;
    }
}
