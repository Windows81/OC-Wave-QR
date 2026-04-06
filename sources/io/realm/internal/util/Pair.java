package io.realm.internal.util;

public class Pair<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public Object f40371a;

    /* renamed from: b  reason: collision with root package name */
    public Object f40372b;

    public Pair(Object obj, Object obj2) {
        this.f40371a = obj;
        this.f40372b = obj2;
    }

    public final boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return a(pair.f40371a, this.f40371a) && a(pair.f40372b, this.f40372b);
    }

    public int hashCode() {
        Object obj = this.f40371a;
        int i2 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f40372b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f40371a) + " " + String.valueOf(this.f40372b) + "}";
    }
}
