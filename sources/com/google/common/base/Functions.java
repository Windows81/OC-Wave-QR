package com.google.common.base;

import java.io.Serializable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class Functions {

    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Object f27714z;

        public Object apply(Object obj) {
            return this.f27714z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.a(this.f27714z, ((ConstantFunction) obj).f27714z);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f27714z;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27714z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Functions.constant(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Object f27715A;

        /* renamed from: z  reason: collision with root package name */
        public final Map f27716z;

        public Object apply(Object obj) {
            Object obj2 = this.f27716z.get(obj);
            return (obj2 != null || this.f27716z.containsKey(obj)) ? NullnessCasts.a(obj2) : this.f27715A;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ForMapWithDefault)) {
                return false;
            }
            ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
            return this.f27716z.equals(forMapWithDefault.f27716z) && Objects.a(this.f27715A, forMapWithDefault.f27715A);
        }

        public int hashCode() {
            return Objects.b(this.f27716z, this.f27715A);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27716z);
            String valueOf2 = String.valueOf(this.f27715A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(", defaultValue=");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Function f27717A;

        /* renamed from: z  reason: collision with root package name */
        public final Function f27718z;

        public Object apply(Object obj) {
            return this.f27718z.apply(this.f27717A.apply(obj));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionComposition)) {
                return false;
            }
            FunctionComposition functionComposition = (FunctionComposition) obj;
            return this.f27717A.equals(functionComposition.f27717A) && this.f27718z.equals(functionComposition.f27718z);
        }

        public int hashCode() {
            return this.f27717A.hashCode() ^ this.f27718z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27718z);
            String valueOf2 = String.valueOf(this.f27717A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Map f27719z;

        public Object apply(Object obj) {
            Object obj2 = this.f27719z.get(obj);
            Preconditions.j(obj2 != null || this.f27719z.containsKey(obj), "Key '%s' not present in map", obj);
            return NullnessCasts.a(obj2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.f27719z.equals(((FunctionForMapNoDefault) obj).f27719z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27719z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27719z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18);
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "Functions.identity()";
        }
    }

    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Predicate f27722z;

        /* renamed from: a */
        public Boolean apply(Object obj) {
            return Boolean.valueOf(this.f27722z.apply(obj));
        }

        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.f27722z.equals(((PredicateFunction) obj).f27722z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27722z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27722z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Functions.forPredicate(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class SupplierFunction<F, T> implements Function<F, T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Supplier f27723z;

        public Object apply(Object obj) {
            return this.f27723z.get();
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.f27723z.equals(((SupplierFunction) obj).f27723z);
            }
            return false;
        }

        public int hashCode() {
            return this.f27723z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27723z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Functions.forSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        /* renamed from: f */
        public String apply(Object obj) {
            Preconditions.q(obj);
            return obj.toString();
        }

        public String toString() {
            return "Functions.toStringFunction()";
        }
    }
}
