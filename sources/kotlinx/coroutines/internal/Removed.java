package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
final class Removed {

    /* renamed from: a  reason: collision with root package name */
    public final LockFreeLinkedListNode f41863a;

    public Removed(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f41863a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f41863a + ']';
    }
}
