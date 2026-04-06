package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class StringListOperator extends ManagedListOperator<String> {
    public StringListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.n((String) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof String)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.String", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.G((long) i2, (String) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.Y((long) i2, (String) obj);
    }

    /* renamed from: r */
    public String f(int i2) {
        return (String) this.f39898b.u((long) i2);
    }
}
