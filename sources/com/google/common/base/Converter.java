package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements Function<A, B> {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f27687z;

    /* renamed from: com.google.common.base.Converter$1  reason: invalid class name */
    class AnonymousClass1 implements Iterable<Object> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Converter f27688A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Iterable f27689z;

        public Iterator iterator() {
            return new Iterator<Object>() {

                /* renamed from: z  reason: collision with root package name */
                public final Iterator f27691z;

                {
                    this.f27691z = AnonymousClass1.this.f27689z.iterator();
                }

                public boolean hasNext() {
                    return this.f27691z.hasNext();
                }

                public Object next() {
                    return AnonymousClass1.this.f27688A.a(this.f27691z.next());
                }

                public void remove() {
                    this.f27691z.remove();
                }
            };
        }
    }

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f27692A;

        /* renamed from: B  reason: collision with root package name */
        public final Converter f27693B;

        public Object b(Object obj) {
            return this.f27692A.b(this.f27693B.b(obj));
        }

        public Object c(Object obj) {
            return this.f27693B.c(this.f27692A.c(obj));
        }

        public Object d(Object obj) {
            throw new AssertionError();
        }

        public Object e(Object obj) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            return this.f27692A.equals(converterComposition.f27692A) && this.f27693B.equals(converterComposition.f27693B);
        }

        public int hashCode() {
            return (this.f27692A.hashCode() * 31) + this.f27693B.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27692A);
            String valueOf2 = String.valueOf(this.f27693B);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".andThen(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Function f27694A;

        /* renamed from: B  reason: collision with root package name */
        public final Function f27695B;

        public Object d(Object obj) {
            return this.f27695B.apply(obj);
        }

        public Object e(Object obj) {
            return this.f27694A.apply(obj);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            return this.f27694A.equals(functionBasedConverter.f27694A) && this.f27695B.equals(functionBasedConverter.f27695B);
        }

        public int hashCode() {
            return (this.f27694A.hashCode() * 31) + this.f27695B.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27694A);
            String valueOf2 = String.valueOf(this.f27695B);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("Converter.from(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final IdentityConverter f27696A = new IdentityConverter();

        public Object d(Object obj) {
            return obj;
        }

        public Object e(Object obj) {
            return obj;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Converter f27697A;

        public Object b(Object obj) {
            return this.f27697A.c(obj);
        }

        public Object c(Object obj) {
            return this.f27697A.b(obj);
        }

        public Object d(Object obj) {
            throw new AssertionError();
        }

        public Object e(Object obj) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.f27697A.equals(((ReverseConverter) obj).f27697A);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f27697A.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27697A);
            StringBuilder sb = new StringBuilder(valueOf.length() + 10);
            sb.append(valueOf);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    public Converter() {
        this(true);
    }

    public final Object a(Object obj) {
        return c(obj);
    }

    public final Object apply(Object obj) {
        return a(obj);
    }

    public Object b(Object obj) {
        if (!this.f27687z) {
            return f(obj);
        }
        if (obj == null) {
            return null;
        }
        return Preconditions.q(d(obj));
    }

    public Object c(Object obj) {
        if (!this.f27687z) {
            return g(obj);
        }
        if (obj == null) {
            return null;
        }
        return Preconditions.q(e(obj));
    }

    public abstract Object d(Object obj);

    public abstract Object e(Object obj);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final Object f(Object obj) {
        return d(NullnessCasts.a(obj));
    }

    public final Object g(Object obj) {
        return e(NullnessCasts.a(obj));
    }

    public Converter(boolean z2) {
        this.f27687z = z2;
    }
}
