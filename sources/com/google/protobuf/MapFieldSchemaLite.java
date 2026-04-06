package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

@CheckReturnValue
class MapFieldSchemaLite implements MapFieldSchema {
    public static int i(int i2, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i3 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i3 += mapEntryLite.a(i2, entry.getKey(), entry.getValue());
        }
        return i3;
    }

    public static MapFieldLite j(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.j()) {
                mapFieldLite = mapFieldLite.o();
            }
            mapFieldLite.n(mapFieldLite2);
        }
        return mapFieldLite;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        ((MapFieldLite) obj).k();
        return obj;
    }

    public MapEntryLite.Metadata c(Object obj) {
        return ((MapEntryLite) obj).c();
    }

    public Map d(Object obj) {
        return (MapFieldLite) obj;
    }

    public Object e(Object obj) {
        return MapFieldLite.f().o();
    }

    public int f(int i2, Object obj, Object obj2) {
        return i(i2, obj, obj2);
    }

    public boolean g(Object obj) {
        return !((MapFieldLite) obj).j();
    }

    public Map h(Object obj) {
        return (MapFieldLite) obj;
    }
}
