package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

final class BinaryListOperator extends ManagedListOperator<byte[]> {
    public BinaryListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.a((byte[]) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof byte[])) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"byte[]", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.v((long) i2, (byte[]) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.N((long) i2, (byte[]) obj);
    }

    /* renamed from: r */
    public byte[] f(int i2) {
        return (byte[]) this.f39898b.u((long) i2);
    }
}
