package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class BooleanListOperator extends ManagedListOperator<Boolean> {
    public BooleanListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.b(((Boolean) obj).booleanValue());
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.Boolean", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.w((long) i2, ((Boolean) obj).booleanValue());
    }

    public void p(int i2, Object obj) {
        this.f39898b.O((long) i2, ((Boolean) obj).booleanValue());
    }

    /* renamed from: r */
    public Boolean f(int i2) {
        return (Boolean) this.f39898b.u((long) i2);
    }
}
