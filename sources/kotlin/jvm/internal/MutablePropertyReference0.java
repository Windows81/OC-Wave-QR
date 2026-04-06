package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public KProperty0.Getter a() {
        return ((KMutableProperty0) v()).a();
    }

    public Object invoke() {
        return get();
    }

    public KCallable p() {
        return Reflection.d(this);
    }
}
