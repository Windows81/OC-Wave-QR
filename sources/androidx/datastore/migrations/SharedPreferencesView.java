package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SharedPreferencesView {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f20683a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f20684b;

    public SharedPreferencesView(SharedPreferences sharedPreferences, Set set) {
        Intrinsics.i(sharedPreferences, "prefs");
        this.f20683a = sharedPreferences;
        this.f20684b = set;
    }

    public final Map a() {
        Map<String, ?> all = this.f20683a.getAll();
        Intrinsics.h(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Set set = this.f20684b;
            if (set != null ? set.contains(str) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.R0((Iterable) value);
            }
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }
}
