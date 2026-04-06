package androidx.arch.core.internal;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    public final HashMap D = new HashMap();

    public boolean contains(Object obj) {
        return this.D.containsKey(obj);
    }

    public SafeIterableMap.Entry g(Object obj) {
        return (SafeIterableMap.Entry) this.D.get(obj);
    }

    public Object n(Object obj, Object obj2) {
        SafeIterableMap.Entry g2 = g(obj);
        if (g2 != null) {
            return g2.f1392A;
        }
        this.D.put(obj, m(obj, obj2));
        return null;
    }

    public Object o(Object obj) {
        Object o2 = super.o(obj);
        this.D.remove(obj);
        return o2;
    }

    public Map.Entry p(Object obj) {
        if (contains(obj)) {
            return ((SafeIterableMap.Entry) this.D.get(obj)).C;
        }
        return null;
    }
}
