package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;

@Metadata
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return g((Map.Entry) obj);
    }

    public final boolean g(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return h(entry);
    }

    public abstract boolean h(Map.Entry entry);

    public final boolean i(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return m(entry);
    }

    public abstract boolean m(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return i((Map.Entry) obj);
    }
}
