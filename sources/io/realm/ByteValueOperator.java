package io.realm;

class ByteValueOperator<K> extends GenericPrimitiveValueOperator<K, Byte> {
    /* renamed from: o */
    public Byte n(Object obj) {
        return Byte.valueOf(((Long) obj).byteValue());
    }
}
