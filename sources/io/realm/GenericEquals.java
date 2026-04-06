package io.realm;

class GenericEquals<K, V> extends EqualsHelper<K, V> {
    public boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }
}
