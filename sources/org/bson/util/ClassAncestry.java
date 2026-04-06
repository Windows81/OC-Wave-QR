package org.bson.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

class ClassAncestry {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap f44063a = CopyOnWriteMap.i();

    public static List a(Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Object.class);
        b(cls, arrayList);
        Collections.reverse(arrayList);
        return Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public static void b(Class cls, List list) {
        if (cls != null && cls != Object.class) {
            Class[] interfaces = cls.getInterfaces();
            for (int length = interfaces.length - 1; length >= 0; length--) {
                b(interfaces[length], list);
            }
            b(cls.getSuperclass(), list);
            if (!list.contains(cls)) {
                list.add(cls);
            }
        }
    }

    public static List c(Class cls) {
        ConcurrentMap d2 = d();
        while (true) {
            List list = (List) d2.get(cls);
            if (list != null) {
                return list;
            }
            d2.putIfAbsent(cls, a(cls));
        }
    }

    public static ConcurrentMap d() {
        return f44063a;
    }
}
