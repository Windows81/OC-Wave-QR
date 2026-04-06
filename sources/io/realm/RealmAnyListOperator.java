package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;

final class RealmAnyListOperator extends ManagedListOperator<RealmAny> {
    public RealmAnyListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.l(CollectionUtils.d(this.f39897a, (RealmAny) obj).c());
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof RealmAny)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.util.RealmAny", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        d(i2);
        this.f39898b.E((long) i2, CollectionUtils.d(this.f39897a, (RealmAny) obj).c());
    }

    public void p(int i2, Object obj) {
        this.f39898b.W((long) i2, CollectionUtils.d(this.f39897a, (RealmAny) obj).c());
    }

    /* renamed from: r */
    public RealmAny f(int i2) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.f39898b.u((long) i2);
        if (nativeRealmAny == null) {
            nativeRealmAny = new NativeRealmAny();
        }
        return new RealmAny(RealmAnyOperator.c(this.f39897a, nativeRealmAny));
    }
}
