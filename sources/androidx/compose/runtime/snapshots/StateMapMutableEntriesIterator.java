package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    public StateMapMutableEntriesIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        super(snapshotStateMap, it);
    }

    /* renamed from: i */
    public Map.Entry next() {
        e();
        if (f() != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
