package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    public boolean r() {
        return false;
    }
}
