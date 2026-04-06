package androidx.datastore.preferences.core;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Actual_jvmAndroidKt {
    public static final Set a(Set set) {
        Intrinsics.i(set, "set");
        Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.R0(set));
        Intrinsics.h(unmodifiableSet, "unmodifiableSet(set.toSet())");
        return unmodifiableSet;
    }

    public static final Map b(Map map) {
        Intrinsics.i(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.h(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }
}
