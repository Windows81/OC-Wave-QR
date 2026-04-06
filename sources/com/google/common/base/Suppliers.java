package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public final class Suppliers {

    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final long f27785A;

        /* renamed from: B  reason: collision with root package name */
        public volatile transient Object f27786B;
        public volatile transient long C;

        /* renamed from: z  reason: collision with root package name */
        public final Supplier f27787z;

        public Object get() {
            long j2 = this.C;
            long f2 = Platform.f();
            if (j2 == 0 || f2 - j2 >= 0) {
                synchronized (this) {
                    try {
                        if (j2 == this.C) {
                            Object obj = this.f27787z.get();
                            this.f27786B = obj;
                            long j3 = f2 + this.f27785A;
                            if (j3 == 0) {
                                j3 = 1;
                            }
                            this.C = j3;
                            return obj;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
            return NullnessCasts.a(this.f27786B);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27787z);
            long j2 = this.f27785A;
            StringBuilder sb = new StringBuilder(valueOf.length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(j2);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public volatile transient boolean f27788A;

        /* renamed from: B  reason: collision with root package name */
        public transient Object f27789B;

        /* renamed from: z  reason: collision with root package name */
        public final Supplier f27790z;

        public MemoizingSupplier(Supplier supplier) {
            this.f27790z = (Supplier) Preconditions.q(supplier);
        }

        public Object get() {
            if (!this.f27788A) {
                synchronized (this) {
                    try {
                        if (!this.f27788A) {
                            Object obj = this.f27790z.get();
                            this.f27789B = obj;
                            this.f27788A = true;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return NullnessCasts.a(this.f27789B);
        }

        public String toString() {
            Object obj;
            if (this.f27788A) {
                String valueOf = String.valueOf(this.f27789B);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f27790z;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {

        /* renamed from: A  reason: collision with root package name */
        public volatile boolean f27791A;

        /* renamed from: B  reason: collision with root package name */
        public Object f27792B;

        /* renamed from: z  reason: collision with root package name */
        public volatile Supplier f27793z;

        public NonSerializableMemoizingSupplier(Supplier supplier) {
            this.f27793z = (Supplier) Preconditions.q(supplier);
        }

        public Object get() {
            if (!this.f27791A) {
                synchronized (this) {
                    try {
                        if (!this.f27791A) {
                            Supplier supplier = this.f27793z;
                            Objects.requireNonNull(supplier);
                            Object obj = supplier.get();
                            this.f27792B = obj;
                            this.f27791A = true;
                            this.f27793z = null;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return NullnessCasts.a(this.f27792B);
        }

        public String toString() {
            Object obj = this.f27793z;
            if (obj == null) {
                String valueOf = String.valueOf(this.f27792B);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Supplier f27794A;

        /* renamed from: z  reason: collision with root package name */
        public final Function f27795z;

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierComposition)) {
                return false;
            }
            SupplierComposition supplierComposition = (SupplierComposition) obj;
            return this.f27795z.equals(supplierComposition.f27795z) && this.f27794A.equals(supplierComposition.f27794A);
        }

        public Object get() {
            return this.f27795z.apply(this.f27794A.get());
        }

        public int hashCode() {
            return Objects.b(this.f27795z, this.f27794A);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27795z);
            String valueOf2 = String.valueOf(this.f27794A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21 + valueOf2.length());
            sb.append("Suppliers.compose(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        /* renamed from: f */
        public Object apply(Supplier supplier) {
            return supplier.get();
        }

        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Object f27798z;

        public SupplierOfInstance(Object obj) {
            this.f27798z = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.a(this.f27798z, ((SupplierOfInstance) obj).f27798z);
            }
            return false;
        }

        public Object get() {
            return this.f27798z;
        }

        public int hashCode() {
            return Objects.b(this.f27798z);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27798z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Supplier f27799z;

        public Object get() {
            Object obj;
            synchronized (this.f27799z) {
                obj = this.f27799z.get();
            }
            return obj;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27799z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Supplier a(Supplier supplier) {
        return ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) ? supplier : supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static Supplier b(Object obj) {
        return new SupplierOfInstance(obj);
    }
}
