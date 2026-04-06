package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
public abstract class AbstractMutableMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, KMutableMap {
    public abstract Set a();

    public /* bridge */ Set b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection e() {
        return super.values();
    }

    public final /* bridge */ Set entrySet() {
        return a();
    }

    public final /* bridge */ Set keySet() {
        return b();
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final /* bridge */ Collection values() {
        return e();
    }
}
