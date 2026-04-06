package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class Invocation {

    /* renamed from: a  reason: collision with root package name */
    public final Class f44151a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f44152b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f44153c;

    /* renamed from: d  reason: collision with root package name */
    public final List f44154d;

    public Invocation(Class cls, Object obj, Method method, List list) {
        this.f44151a = cls;
        this.f44152b = obj;
        this.f44153c = method;
        this.f44154d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f44153c;
    }

    public Class b() {
        return this.f44151a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f44151a.getName(), this.f44153c.getName(), this.f44154d});
    }
}
