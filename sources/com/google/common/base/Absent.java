package com.google.common.base;

@ElementTypesAreNonnullByDefault
final class Absent<T> extends Optional<T> {

    /* renamed from: z  reason: collision with root package name */
    public static final Absent f27638z = new Absent();

    public static Optional g() {
        return f27638z;
    }

    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public Object e(Object obj) {
        return Preconditions.r(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public Object f() {
        return null;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
