package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
final class StateMapMutableKeysIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<K>, KMutableIterator {
    public StateMapMutableKeysIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        super(snapshotStateMap, it);
    }

    public Object next() {
        Map.Entry h2 = h();
        if (h2 != null) {
            e();
            return h2.getKey();
        }
        throw new IllegalStateException();
    }
}
