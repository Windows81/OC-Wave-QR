package io.realm;

class ShortValueOperator<K> extends GenericPrimitiveValueOperator<K, Short> {
    /* renamed from: o */
    public Short n(Object obj) {
        return Short.valueOf(((Long) obj).shortValue());
    }
}
