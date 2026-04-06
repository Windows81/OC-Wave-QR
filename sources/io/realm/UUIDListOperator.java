package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;

final class UUIDListOperator extends ManagedListOperator<UUID> {
    public UUIDListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.o((UUID) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof UUID)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.util.UUID", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.H((long) i2, (UUID) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.Z((long) i2, (UUID) obj);
    }

    /* renamed from: r */
    public UUID f(int i2) {
        return (UUID) this.f39898b.u((long) i2);
    }
}
