package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, KMutableMap {
    public final MutableScatterMap D;
    public MutableEntries E;
    public MutableKeys F;
    public MutableValues G;

    public Set a() {
        MutableEntries mutableEntries = this.E;
        if (mutableEntries != null) {
            return mutableEntries;
        }
        MutableEntries mutableEntries2 = new MutableEntries(this.D);
        this.E = mutableEntries2;
        return mutableEntries2;
    }

    public Set b() {
        MutableKeys mutableKeys = this.F;
        if (mutableKeys != null) {
            return mutableKeys;
        }
        MutableKeys mutableKeys2 = new MutableKeys(this.D);
        this.F = mutableKeys2;
        return mutableKeys2;
    }

    public void clear() {
        this.D.k();
    }

    public Collection e() {
        MutableValues mutableValues = this.G;
        if (mutableValues != null) {
            return mutableValues;
        }
        MutableValues mutableValues2 = new MutableValues(this.D);
        this.G = mutableValues2;
        return mutableValues2;
    }

    public Object put(Object obj, Object obj2) {
        return this.D.r(obj, obj2);
    }

    public void putAll(Map map) {
        Intrinsics.i(map, "from");
        for (Map.Entry entry : map.entrySet()) {
            this.D.x(entry.getKey(), entry.getValue());
        }
    }

    public Object remove(Object obj) {
        return this.D.u(obj);
    }
}
