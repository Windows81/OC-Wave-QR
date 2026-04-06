package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

final class ObjectIdRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public ObjectIdRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), RealmAny.Type.OBJECT_ID, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((ObjectId) super.h(ObjectId.class));
    }
}
