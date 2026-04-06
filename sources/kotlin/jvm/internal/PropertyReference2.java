package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2(Class cls, String str, String str2, int i2) {
        super(CallableReference.F, cls, str, str2, i2);
    }

    public KProperty2.Getter a() {
        return ((KProperty2) v()).a();
    }

    public Object m(Object obj, Object obj2) {
        return o(obj, obj2);
    }

    public KCallable p() {
        return Reflection.j(this);
    }
}
