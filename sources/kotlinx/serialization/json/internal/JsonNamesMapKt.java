package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

@Metadata
public final class JsonNamesMapKt {

    /* renamed from: a  reason: collision with root package name */
    public static final DescriptorSchemaCache.Key f42392a = new DescriptorSchemaCache.Key();

    /* renamed from: b  reason: collision with root package name */
    public static final DescriptorSchemaCache.Key f42393b = new DescriptorSchemaCache.Key();

    public static final Map c(SerialDescriptor serialDescriptor, Json json) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean e2 = e(json, serialDescriptor);
        JsonNamingStrategy n2 = n(serialDescriptor, json);
        int f2 = serialDescriptor.f();
        for (int i2 = 0; i2 < f2; i2++) {
            ArrayList arrayList = new ArrayList();
            for (Object next : serialDescriptor.i(i2)) {
                if (next instanceof JsonNames) {
                    arrayList.add(next);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.C0(arrayList);
            if (!(jsonNames == null || (names = jsonNames.names()) == null)) {
                for (String str2 : names) {
                    if (e2) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.h(str2, "toLowerCase(...)");
                    }
                    d(linkedHashMap, serialDescriptor, str2, i2);
                }
            }
            if (e2) {
                str = serialDescriptor.g(i2).toLowerCase(Locale.ROOT);
                Intrinsics.h(str, "toLowerCase(...)");
            } else {
                str = n2 != null ? n2.a(serialDescriptor, i2, serialDescriptor.g(i2)) : null;
            }
            if (str != null) {
                d(linkedHashMap, serialDescriptor, str, i2);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.h() : linkedHashMap;
    }

    public static final void d(Map map, SerialDescriptor serialDescriptor, String str, int i2) {
        String str2 = Intrinsics.d(serialDescriptor.e(), SerialKind.ENUM.f42057a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i2));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.g(i2) + " is already one of the names for " + str2 + ' ' + serialDescriptor.g(((Number) MapsKt.i(map, str)).intValue()) + " in " + serialDescriptor);
    }

    public static final boolean e(Json json, SerialDescriptor serialDescriptor) {
        return json.g().h() && Intrinsics.d(serialDescriptor.e(), SerialKind.ENUM.f42057a);
    }

    public static final Map f(Json json, SerialDescriptor serialDescriptor) {
        Intrinsics.i(json, "<this>");
        Intrinsics.i(serialDescriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.a(json).b(serialDescriptor, f42392a, new b(serialDescriptor, json));
    }

    public static final Map g(SerialDescriptor serialDescriptor, Json json) {
        return c(serialDescriptor, json);
    }

    public static final DescriptorSchemaCache.Key h() {
        return f42392a;
    }

    public static final String i(SerialDescriptor serialDescriptor, Json json, int i2) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(json, "json");
        JsonNamingStrategy n2 = n(serialDescriptor, json);
        return n2 == null ? serialDescriptor.g(i2) : o(serialDescriptor, json, n2)[i2];
    }

    public static final int j(SerialDescriptor serialDescriptor, Json json, String str) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(json, "json");
        Intrinsics.i(str, "name");
        if (e(json, serialDescriptor)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return m(serialDescriptor, json, lowerCase);
        } else if (n(serialDescriptor, json) != null) {
            return m(serialDescriptor, json, str);
        } else {
            int d2 = serialDescriptor.d(str);
            return (d2 == -3 && json.g().o()) ? m(serialDescriptor, json, str) : d2;
        }
    }

    public static final int k(SerialDescriptor serialDescriptor, Json json, String str, String str2) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(json, "json");
        Intrinsics.i(str, "name");
        Intrinsics.i(str2, "suffix");
        int j2 = j(serialDescriptor, json, str);
        if (j2 != -3) {
            return j2;
        }
        throw new SerializationException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int l(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return k(serialDescriptor, json, str, str2);
    }

    public static final int m(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = (Integer) f(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final JsonNamingStrategy n(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(json, "json");
        if (Intrinsics.d(serialDescriptor.e(), StructureKind.CLASS.f42058a)) {
            return json.g().l();
        }
        return null;
    }

    public static final String[] o(SerialDescriptor serialDescriptor, Json json, JsonNamingStrategy jsonNamingStrategy) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(json, "json");
        Intrinsics.i(jsonNamingStrategy, "strategy");
        return (String[]) JsonSchemaCacheKt.a(json).b(serialDescriptor, f42393b, new c(serialDescriptor, jsonNamingStrategy));
    }

    public static final String[] p(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        int f2 = serialDescriptor.f();
        String[] strArr = new String[f2];
        for (int i2 = 0; i2 < f2; i2++) {
            strArr[i2] = jsonNamingStrategy.a(serialDescriptor, i2, serialDescriptor.g(i2));
        }
        return strArr;
    }
}
