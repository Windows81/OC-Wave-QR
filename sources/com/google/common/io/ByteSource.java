package com.google.common.io;

import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
public abstract class ByteSource {

    public class AsCharSource extends CharSource {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f28975a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ByteSource f28976b;

        public Reader a() {
            return new InputStreamReader(this.f28976b.a(), this.f28975a);
        }

        public String toString() {
            String obj = this.f28976b.toString();
            String valueOf = String.valueOf(this.f28975a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSource(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class ByteArrayByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f28977a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28978b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28979c;

        public ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        public InputStream a() {
            return new ByteArrayInputStream(this.f28977a, this.f28978b, this.f28979c);
        }

        public String toString() {
            String f2 = Ascii.f(BaseEncoding.a().c(this.f28977a, this.f28978b, this.f28979c), 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 17);
            sb.append("ByteSource.wrap(");
            sb.append(f2);
            sb.append(")");
            return sb.toString();
        }

        public ByteArrayByteSource(byte[] bArr, int i2, int i3) {
            this.f28977a = bArr;
            this.f28978b = i2;
            this.f28979c = i3;
        }
    }

    public static final class ConcatenatedByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final Iterable f28980a;

        public InputStream a() {
            return new MultiInputStream(this.f28980a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28980a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("ByteSource.concat(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class EmptyByteSource extends ByteArrayByteSource {

        /* renamed from: d  reason: collision with root package name */
        public static final EmptyByteSource f28981d = new EmptyByteSource();

        public EmptyByteSource() {
            super(new byte[0]);
        }

        public String toString() {
            return "ByteSource.empty()";
        }
    }

    public final class SlicedByteSource extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final long f28982a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28983b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ByteSource f28984c;

        public InputStream a() {
            return b(this.f28984c.a());
        }

        public final InputStream b(InputStream inputStream) {
            Closer a2;
            long j2 = this.f28982a;
            if (j2 > 0) {
                try {
                    if (ByteStreams.f(inputStream, j2) < this.f28982a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }
            return ByteStreams.a(inputStream, this.f28983b);
        }

        public String toString() {
            String obj = this.f28984c.toString();
            long j2 = this.f28982a;
            long j3 = this.f28983b;
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 50);
            sb.append(obj);
            sb.append(".slice(");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(")");
            return sb.toString();
        }
    }

    public abstract InputStream a();
}
