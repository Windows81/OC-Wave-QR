package io.realm;

import io.realm.internal.OsList;
import java.util.Date;
import java.util.Locale;

final class DateListOperator extends ManagedListOperator<Date> {
    public DateListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.c((Date) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof Date)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.util.Date", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.x((long) i2, (Date) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.P((long) i2, (Date) obj);
    }

    /* renamed from: r */
    public Date f(int i2) {
        return (Date) this.f39898b.u((long) i2);
    }
}
