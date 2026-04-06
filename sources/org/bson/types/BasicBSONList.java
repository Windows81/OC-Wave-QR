package org.bson.types;

import java.util.ArrayList;
import java.util.Set;
import org.bson.BSONObject;

public class BasicBSONList extends ArrayList<Object> implements BSONObject {
    public Object e(String str) {
        int i2 = i(str);
        if (i2 >= 0 && i2 < size()) {
            return get(i2);
        }
        return null;
    }

    public Object g(String str, Object obj) {
        return o(i(str), obj);
    }

    public boolean h(String str) {
        int n2 = n(str, false);
        return n2 >= 0 && n2 >= 0 && n2 < size();
    }

    public int i(String str) {
        return n(str, true);
    }

    public Set keySet() {
        return new StringRangeSet(size());
    }

    public int n(String str, boolean z2) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            if (!z2) {
                return -1;
            }
            throw new IllegalArgumentException("BasicBSONList can only work with numeric keys, not: [" + str + "]");
        }
    }

    public Object o(int i2, Object obj) {
        while (i2 >= size()) {
            add((Object) null);
        }
        set(i2, obj);
        return obj;
    }
}
