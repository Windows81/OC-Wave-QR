package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class DoubleListOperator extends ManagedListOperator<Double> {
    public DoubleListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.e(((Number) obj).doubleValue());
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Number", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.z((long) i2, ((Number) obj).doubleValue());
    }

    public void p(int i2, Object obj) {
        this.f39898b.R((long) i2, ((Number) obj).doubleValue());
    }

    /* renamed from: r */
    public Double f(int i2) {
        return (Double) this.f39898b.u((long) i2);
    }
}
