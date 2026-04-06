package com.google.common.base;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final Equals f27702z = new Equals();

        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Object f27703A;

        /* renamed from: z  reason: collision with root package name */
        public final Equivalence f27704z;

        public boolean apply(Object obj) {
            return this.f27704z.d(obj, this.f27703A);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            return this.f27704z.equals(equivalentToPredicate.f27704z) && Objects.a(this.f27703A, equivalentToPredicate.f27703A);
        }

        public int hashCode() {
            return Objects.b(this.f27704z, this.f27703A);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27704z);
            String valueOf2 = String.valueOf(this.f27703A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".equivalentTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final Identity f27705z = new Identity();

        public boolean a(Object obj, Object obj2) {
            return false;
        }

        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Object f27706A;

        /* renamed from: z  reason: collision with root package name */
        public final Equivalence f27707z;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.f27707z.equals(wrapper.f27707z)) {
                return this.f27707z.d(this.f27706A, wrapper.f27706A);
            }
            return false;
        }

        public int hashCode() {
            return this.f27707z.e(this.f27706A);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27707z);
            String valueOf2 = String.valueOf(this.f27706A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".wrap(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Equivalence c() {
        return Equals.f27702z;
    }

    public static Equivalence f() {
        return Identity.f27705z;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public final boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }

    public final int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return b(obj);
    }
}
