package androidx.core.util;

public class Pair<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20157a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20158b;

    public Pair(Object obj, Object obj2) {
        this.f20157a = obj;
        this.f20158b = obj2;
    }

    public static Pair a(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.a(pair.f20157a, this.f20157a) && ObjectsCompat.a(pair.f20158b, this.f20158b);
    }

    public int hashCode() {
        Object obj = this.f20157a;
        int i2 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20158b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "Pair{" + this.f20157a + " " + this.f20158b + "}";
    }
}
