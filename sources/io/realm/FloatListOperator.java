package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class FloatListOperator extends ManagedListOperator<Float> {
    public FloatListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.f(((Number) obj).floatValue());
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Number", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.A((long) i2, ((Number) obj).floatValue());
    }

    public void p(int i2, Object obj) {
        this.f39898b.S((long) i2, ((Number) obj).floatValue());
    }

    /* renamed from: r */
    public Float f(int i2) {
        return (Float) this.f39898b.u((long) i2);
    }
}
