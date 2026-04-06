package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public KProperty0.Getter a() {
        return ((KProperty0) v()).a();
    }

    public Object invoke() {
        return get();
    }

    public KCallable p() {
        return Reflection.h(this);
    }
}
