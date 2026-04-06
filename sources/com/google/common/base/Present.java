package com.google.common.base;

@ElementTypesAreNonnullByDefault
final class Present<T> extends Optional<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Object f27763z;

    public Present(Object obj) {
        this.f27763z = obj;
    }

    public Object b() {
        return this.f27763z;
    }

    public boolean c() {
        return true;
    }

    public Object e(Object obj) {
        Preconditions.r(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f27763z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.f27763z.equals(((Present) obj).f27763z);
        }
        return false;
    }

    public Object f() {
        return this.f27763z;
    }

    public int hashCode() {
        return this.f27763z.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27763z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
