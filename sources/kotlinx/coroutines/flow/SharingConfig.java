package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata
final class SharingConfig<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Flow f41757a;

    /* renamed from: b  reason: collision with root package name */
    public final int f41758b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferOverflow f41759c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineContext f41760d;

    public SharingConfig(Flow flow, int i2, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.f41757a = flow;
        this.f41758b = i2;
        this.f41759c = bufferOverflow;
        this.f41760d = coroutineContext;
    }
}
