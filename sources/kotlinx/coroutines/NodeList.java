package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;

@Metadata
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public NodeList a() {
        return this;
    }

    public boolean b() {
        return true;
    }

    public String toString() {
        return super.toString();
    }
}
