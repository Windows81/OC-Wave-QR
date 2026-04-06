package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    public KProperty2.Getter a() {
        return ((KMutableProperty2) v()).a();
    }

    public Object m(Object obj, Object obj2) {
        return o(obj, obj2);
    }

    public KCallable p() {
        return Reflection.f(this);
    }
}
