package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.Decimal128;

final class Decimal128ListOperator extends ManagedListOperator<Decimal128> {
    public Decimal128ListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.d((Decimal128) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Decimal128)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"org.bson.types.Decimal128", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.y((long) i2, (Decimal128) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.Q((long) i2, (Decimal128) obj);
    }

    /* renamed from: r */
    public Decimal128 f(int i2) {
        return (Decimal128) this.f39898b.u((long) i2);
    }
}
