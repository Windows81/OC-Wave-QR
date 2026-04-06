package kotlin.collections;

import kotlin.Metadata;

@Metadata
public final class RingBuffer$iterator$1 extends AbstractIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public int f40637B;
    public int C;
    public final /* synthetic */ RingBuffer D;

    public RingBuffer$iterator$1(RingBuffer ringBuffer) {
        this.D = ringBuffer;
        this.f40637B = ringBuffer.size();
        this.C = ringBuffer.C;
    }

    public void b() {
        if (this.f40637B == 0) {
            c();
            return;
        }
        e(this.D.f40635A[this.C]);
        this.C = (this.C + 1) % this.D.f40636B;
        this.f40637B--;
    }
}
