package com.google.common.hash;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
public final class Funnels {

    public enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        /* renamed from: f */
        public void o0(byte[] bArr, PrimitiveSink primitiveSink) {
            primitiveSink.a(bArr);
        }

        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    public enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        /* renamed from: f */
        public void o0(Integer num, PrimitiveSink primitiveSink) {
            primitiveSink.e(num.intValue());
        }

        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    public enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        /* renamed from: f */
        public void o0(Long l2, PrimitiveSink primitiveSink) {
            primitiveSink.g(l2.longValue());
        }

        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Funnel f28867z;

        /* renamed from: a */
        public void o0(Iterable iterable, PrimitiveSink primitiveSink) {
            for (Object o0 : iterable) {
                this.f28867z.o0(o0, primitiveSink);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.f28867z.equals(((SequentialFunnel) obj).f28867z);
            }
            return false;
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.f28867z.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28867z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("Funnels.sequentialFunnel(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class SinkAsStream extends OutputStream {

        /* renamed from: z  reason: collision with root package name */
        public final PrimitiveSink f28868z;

        public String toString() {
            String valueOf = String.valueOf(this.f28868z);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Funnels.asOutputStream(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public void write(int i2) {
            this.f28868z.b((byte) i2);
        }

        public void write(byte[] bArr) {
            this.f28868z.a(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            this.f28868z.d(bArr, i2, i3);
        }
    }

    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Charset f28869z;

        public static class SerializedForm implements Serializable {
        }

        /* renamed from: a */
        public void o0(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.f(charSequence, this.f28869z);
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.f28869z.equals(((StringCharsetFunnel) obj).f28869z);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.f28869z.hashCode();
        }

        public String toString() {
            String name = this.f28869z.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
            sb.append("Funnels.stringFunnel(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        /* renamed from: f */
        public void o0(CharSequence charSequence, PrimitiveSink primitiveSink) {
            primitiveSink.c(charSequence);
        }

        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }
}
