package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }

    public KProperty1.Getter a() {
        return ((KProperty1) v()).a();
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public KCallable p() {
        return Reflection.i(this);
    }
}
