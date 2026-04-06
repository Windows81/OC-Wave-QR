package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;

final class ObjectIdListOperator extends ManagedListOperator<ObjectId> {
    public ObjectIdListOperator(BaseRealm baseRealm, OsList osList, Class cls) {
        super(baseRealm, osList, cls);
    }

    public void c(Object obj) {
        this.f39898b.k((ObjectId) obj);
    }

    public void e(Object obj) {
        if (obj != null && !(obj instanceof ObjectId)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"org.bson.types.ObjectId", obj.getClass().getName()}));
        }
    }

    public void j(int i2, Object obj) {
        this.f39898b.D((long) i2, (ObjectId) obj);
    }

    public void p(int i2, Object obj) {
        this.f39898b.V((long) i2, (ObjectId) obj);
    }

    /* renamed from: r */
    public ObjectId f(int i2) {
        return (ObjectId) this.f39898b.u((long) i2);
    }
}
