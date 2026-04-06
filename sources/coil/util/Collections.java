package coil.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

@Metadata
/* renamed from: coil.util.-Collections  reason: invalid class name */
public final class Collections {
    public static final List a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? java.util.Collections.unmodifiableList(new ArrayList(list)) : java.util.Collections.singletonList(CollectionsKt.e0(list)) : CollectionsKt.m();
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.h();
        }
        if (size != 1) {
            return java.util.Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.d0(map.entrySet());
        return java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
