package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

final class BinaryRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public BinaryRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), RealmAny.Type.BINARY, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((byte[]) super.h(byte[].class));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!BinaryRealmAnyOperator.class.equals(obj.getClass())) {
            return false;
        }
        Class<byte[]> cls = byte[].class;
        return Arrays.equals((byte[]) h(cls), (byte[]) ((RealmAnyOperator) obj).h(cls));
    }
}
