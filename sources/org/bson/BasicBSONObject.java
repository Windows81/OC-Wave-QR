package org.bson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.bson.types.BasicBSONList;

public class BasicBSONObject extends LinkedHashMap<String, Object> implements BSONObject {
    public BasicBSONObject() {
    }

    public static Object c(Object obj) {
        return (!(obj instanceof BSONObject) || (obj instanceof BasicBSONList)) ? obj instanceof List ? i((List) obj) : obj instanceof Map ? j((Map) obj) : obj : f((BSONObject) obj);
    }

    public static BasicBSONObject f(BSONObject bSONObject) {
        BasicBSONObject basicBSONObject = new BasicBSONObject();
        Iterator it = new TreeSet(bSONObject.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            basicBSONObject.put(str, c(bSONObject.e(str)));
        }
        return basicBSONObject;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object c2 : list) {
            arrayList.add(c(c2));
        }
        return arrayList;
    }

    public static Map j(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        Iterator it = new TreeSet(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            linkedHashMap.put(str, c(map.get(str)));
        }
        return linkedHashMap;
    }

    public BasicBSONObject b(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public Object e(String str) {
        return super.get(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BSONObject)) {
            return false;
        }
        BSONObject bSONObject = (BSONObject) obj;
        if (!keySet().equals(bSONObject.keySet())) {
            return false;
        }
        return Arrays.equals(n().a(f(this)), n().a(f(bSONObject)));
    }

    public /* bridge */ /* synthetic */ Object g(String str, Object obj) {
        return super.put(str, obj);
    }

    public boolean h(String str) {
        return super.containsKey(str);
    }

    public int hashCode() {
        return Arrays.hashCode(f(this).k());
    }

    public final byte[] k() {
        return n().a(this);
    }

    public final BSONEncoder n() {
        return new BasicBSONEncoder();
    }

    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey().toString(), entry.getValue());
        }
    }

    public BasicBSONObject(String str, Object obj) {
        put(str, obj);
    }
}
