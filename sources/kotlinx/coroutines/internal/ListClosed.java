package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
final class ListClosed extends LockFreeLinkedListNode {
    public final int C;

    public ListClosed(int i2) {
        this.C = i2;
    }
}
