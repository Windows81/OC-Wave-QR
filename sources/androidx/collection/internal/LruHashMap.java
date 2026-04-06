package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LruHashMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2009a;

    public LruHashMap(int i2, float f2) {
        this.f2009a = new LinkedHashMap(i2, f2, true);
    }

    public final Object a(Object obj) {
        Intrinsics.i(obj, "key");
        return this.f2009a.get(obj);
    }

    public final Set b() {
        Set entrySet = this.f2009a.entrySet();
        Intrinsics.h(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public final boolean c() {
        return this.f2009a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        Intrinsics.i(obj, "key");
        Intrinsics.i(obj2, "value");
        return this.f2009a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        Intrinsics.i(obj, "key");
        return this.f2009a.remove(obj);
    }
}
