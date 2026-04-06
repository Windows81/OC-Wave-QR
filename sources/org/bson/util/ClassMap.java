package org.bson.util;

import java.util.List;
import java.util.Map;

@Deprecated
public class ClassMap<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f44064a = CopyOnWriteMap.i();

    /* renamed from: b  reason: collision with root package name */
    public final Map f44065b = ComputingMap.a(new ComputeFunction());

    public final class ComputeFunction implements Function<Class<?>, T> {
        public ComputeFunction() {
        }

        /* renamed from: a */
        public Object apply(Class cls) {
            for (Class cls2 : ClassMap.c(cls)) {
                Object obj = ClassMap.this.f44064a.get(cls2);
                if (obj != null) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static List c(Class cls) {
        return ClassAncestry.c(cls);
    }

    public Object b(Object obj) {
        return this.f44065b.get(obj);
    }

    public int d() {
        return this.f44064a.size();
    }
}
