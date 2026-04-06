package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class LongListOperator<T> extends ManagedListOperator<T> {
    public LongListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.i(((Number) obj).longValue());
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()}));
        }
    }

    public Object f(int i2) {
        Long l2 = (Long) this.f39898b.u((long) i2);
        if (l2 == null) {
            return null;
        }
        Class<Byte> cls = this.f39899c;
        if (cls == Long.class) {
            return l2;
        }
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(l2.intValue()));
        }
        if (cls == Short.class) {
            return cls.cast(Short.valueOf(l2.shortValue()));
        }
        if (cls == Byte.class) {
            return cls.cast(Byte.valueOf(l2.byteValue()));
        }
        throw new IllegalStateException("Unexpected element type: " + this.f39899c.getName());
    }

    public void j(int i2, Object obj) {
        this.f39898b.B((long) i2, ((Number) obj).longValue());
    }

    public void p(int i2, Object obj) {
        this.f39898b.T((long) i2, ((Number) obj).longValue());
    }
}
