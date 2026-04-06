package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
public interface ThreadSafeHeapNode {
    void f(ThreadSafeHeap threadSafeHeap);

    int getIndex();

    ThreadSafeHeap j();

    void setIndex(int i2);
}
