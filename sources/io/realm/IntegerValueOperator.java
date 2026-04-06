package io.realm;

class IntegerValueOperator<K> extends GenericPrimitiveValueOperator<K, Integer> {
    /* renamed from: o */
    public Integer n(Object obj) {
        return Integer.valueOf(((Long) obj).intValue());
    }
}
