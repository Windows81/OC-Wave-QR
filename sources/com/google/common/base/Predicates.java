package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@ElementTypesAreNonnullByDefault
public final class Predicates {

    public static class AndPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final List f27750z;

        public boolean apply(Object obj) {
            for (int i2 = 0; i2 < this.f27750z.size(); i2++) {
                if (!((Predicate) this.f27750z.get(i2)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f27750z.equals(((AndPredicate) obj).f27750z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27750z.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.k("and", this.f27750z);
        }

        public AndPredicate(List list) {
            this.f27750z = list;
        }
    }

    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Function f27751A;

        /* renamed from: z  reason: collision with root package name */
        public final Predicate f27752z;

        public boolean apply(Object obj) {
            return this.f27752z.apply(this.f27751A.apply(obj));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            return this.f27751A.equals(compositionPredicate.f27751A) && this.f27752z.equals(compositionPredicate.f27752z);
        }

        public int hashCode() {
            return this.f27751A.hashCode() ^ this.f27752z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27752z);
            String valueOf2 = String.valueOf(this.f27751A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }

        public CompositionPredicate(Predicate predicate, Function function) {
            this.f27752z = (Predicate) Preconditions.q(predicate);
            this.f27751A = (Function) Preconditions.q(function);
        }
    }

    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        public String toString() {
            String c2 = this.f27753z.c();
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 28);
            sb.append("Predicates.containsPattern(");
            sb.append(c2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final CommonPattern f27753z;

        /* renamed from: a */
        public boolean apply(CharSequence charSequence) {
            return this.f27753z.b(charSequence).b();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            return Objects.a(this.f27753z.c(), containsPatternPredicate.f27753z.c()) && this.f27753z.a() == containsPatternPredicate.f27753z.a();
        }

        public int hashCode() {
            return Objects.b(this.f27753z.c(), Integer.valueOf(this.f27753z.a()));
        }

        public String toString() {
            String toStringHelper = MoreObjects.c(this.f27753z).d("pattern", this.f27753z.c()).b("pattern.flags", this.f27753z.a()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(toStringHelper).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(toStringHelper);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class InPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Collection f27754z;

        public boolean apply(Object obj) {
            try {
                return this.f27754z.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.f27754z.equals(((InPredicate) obj).f27754z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27754z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27754z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15);
            sb.append("Predicates.in(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public InPredicate(Collection collection) {
            this.f27754z = (Collection) Preconditions.q(collection);
        }
    }

    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Class f27755z;

        public boolean apply(Object obj) {
            return this.f27755z.isInstance(obj);
        }

        public boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.f27755z == ((InstanceOfPredicate) obj).f27755z;
        }

        public int hashCode() {
            return this.f27755z.hashCode();
        }

        public String toString() {
            String name = this.f27755z.getName();
            StringBuilder sb = new StringBuilder(name.length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        public InstanceOfPredicate(Class cls) {
            this.f27755z = (Class) Preconditions.q(cls);
        }
    }

    public static class IsEqualToPredicate implements Predicate<Object>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Object f27756z;

        public Predicate a() {
            return this;
        }

        public boolean apply(Object obj) {
            return this.f27756z.equals(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f27756z.equals(((IsEqualToPredicate) obj).f27756z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27756z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27756z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public IsEqualToPredicate(Object obj) {
            this.f27756z = obj;
        }
    }

    public static class NotPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Predicate f27757z;

        public NotPredicate(Predicate predicate) {
            this.f27757z = (Predicate) Preconditions.q(predicate);
        }

        public boolean apply(Object obj) {
            return !this.f27757z.apply(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f27757z.equals(((NotPredicate) obj).f27757z);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f27757z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27757z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public Predicate f() {
            return this;
        }
    }

    public static class OrPredicate<T> implements Predicate<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final List f27761z;

        public boolean apply(Object obj) {
            for (int i2 = 0; i2 < this.f27761z.size(); i2++) {
                if (((Predicate) this.f27761z.get(i2)).apply(obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.f27761z.equals(((OrPredicate) obj).f27761z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27761z.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.k("or", this.f27761z);
        }
    }

    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Class f27762z;

        /* renamed from: a */
        public boolean apply(Class cls) {
            return this.f27762z.isAssignableFrom(cls);
        }

        public boolean equals(Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.f27762z == ((SubtypeOfPredicate) obj).f27762z;
        }

        public int hashCode() {
            return this.f27762z.hashCode();
        }

        public String toString() {
            String name = this.f27762z.getName();
            StringBuilder sb = new StringBuilder(name.length() + 22);
            sb.append("Predicates.subtypeOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Predicate b() {
        return ObjectPredicate.ALWAYS_TRUE.f();
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        return new AndPredicate(d((Predicate) Preconditions.q(predicate), (Predicate) Preconditions.q(predicate2)));
    }

    public static List d(Predicate predicate, Predicate predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    public static Predicate e(Predicate predicate, Function function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate f(Object obj) {
        return obj == null ? i() : new IsEqualToPredicate(obj).a();
    }

    public static Predicate g(Collection collection) {
        return new InPredicate(collection);
    }

    public static Predicate h(Class cls) {
        return new InstanceOfPredicate(cls);
    }

    public static Predicate i() {
        return ObjectPredicate.IS_NULL.f();
    }

    public static Predicate j(Predicate predicate) {
        return new NotPredicate(predicate);
    }

    public static String k(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z2 = true;
        for (Object next : iterable) {
            if (!z2) {
                sb.append(',');
            }
            sb.append(next);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
