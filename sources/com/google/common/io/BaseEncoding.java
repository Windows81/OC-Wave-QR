package com.google.common.io;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import io.realm.internal.OsSharedRealm;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {

    /* renamed from: a  reason: collision with root package name */
    public static final BaseEncoding f28939a = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b  reason: collision with root package name */
    public static final BaseEncoding f28940b = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c  reason: collision with root package name */
    public static final BaseEncoding f28941c = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d  reason: collision with root package name */
    public static final BaseEncoding f28942d = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e  reason: collision with root package name */
    public static final BaseEncoding f28943e = new Base16Encoding("base16()", "0123456789ABCDEF");

    /* renamed from: com.google.common.io.BaseEncoding$1  reason: invalid class name */
    class AnonymousClass1 extends ByteSink {
    }

    /* renamed from: com.google.common.io.BaseEncoding$2  reason: invalid class name */
    class AnonymousClass2 extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CharSource f28944a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BaseEncoding f28945b;

        public InputStream a() {
            return this.f28945b.b(this.f28944a.a());
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5  reason: invalid class name */
    class AnonymousClass5 extends Writer {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Writer f28951A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Appendable f28952z;

        public void close() {
            this.f28951A.close();
        }

        public void flush() {
            this.f28951A.flush();
        }

        public void write(int i2) {
            this.f28952z.append((char) i2);
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Alphabet {

        /* renamed from: a  reason: collision with root package name */
        public final String f28953a;

        /* renamed from: b  reason: collision with root package name */
        public final char[] f28954b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28955c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28956d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28957e;

        /* renamed from: f  reason: collision with root package name */
        public final int f28958f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f28959g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean[] f28960h;

        public Alphabet(String str, char[] cArr) {
            this.f28953a = (String) Preconditions.q(str);
            this.f28954b = (char[]) Preconditions.q(cArr);
            try {
                int h2 = IntMath.h(cArr.length, RoundingMode.UNNECESSARY);
                this.f28956d = h2;
                int min = Math.min(8, Integer.lowestOneBit(h2));
                try {
                    this.f28957e = 8 / min;
                    this.f28958f = h2 / min;
                    this.f28955c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c2 = cArr[i2];
                        Preconditions.f(c2 < 128, "Non-ASCII character: %s", c2);
                        Preconditions.f(bArr[c2] == -1, "Duplicate character: %s", c2);
                        bArr[c2] = (byte) i2;
                    }
                    this.f28959g = bArr;
                    boolean[] zArr = new boolean[this.f28957e];
                    for (int i3 = 0; i3 < this.f28958f; i3++) {
                        zArr[IntMath.d(i3 * 8, this.f28956d, RoundingMode.CEILING)] = true;
                    }
                    this.f28960h = zArr;
                } catch (ArithmeticException e2) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e2);
                }
            } catch (ArithmeticException e3) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e3);
            }
        }

        public int b(char c2) {
            if (c2 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c2));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b2 = this.f28959g[c2];
            if (b2 != -1) {
                return b2;
            }
            if (c2 <= ' ' || c2 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c2));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c2);
            throw new DecodingException(sb.toString());
        }

        public char c(int i2) {
            return this.f28954b[i2];
        }

        public boolean d(int i2) {
            return this.f28960h[i2 % this.f28957e];
        }

        public boolean e(char c2) {
            byte[] bArr = this.f28959g;
            return c2 < bArr.length && bArr[c2] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.f28954b, ((Alphabet) obj).f28954b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f28954b);
        }

        public String toString() {
            return this.f28953a;
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {

        /* renamed from: h  reason: collision with root package name */
        public final char[] f28961h;

        public Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            Preconditions.q(appendable);
            Preconditions.v(i2, i2 + i3, bArr.length);
            for (int i4 = 0; i4 < i3; i4++) {
                byte b2 = bArr[i2 + i4] & 255;
                appendable.append(this.f28961h[b2]);
                appendable.append(this.f28961h[b2 | OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR]);
            }
        }

        public Base16Encoding(Alphabet alphabet) {
            super(alphabet, (Character) null);
            this.f28961h = new char[512];
            Preconditions.d(alphabet.f28954b.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                this.f28961h[i2] = alphabet.c(i2 >>> 4);
                this.f28961h[i2 | 256] = alphabet.c(i2 & 15);
            }
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            Preconditions.q(appendable);
            int i4 = i2 + i3;
            Preconditions.v(i2, i4, bArr.length);
            while (i3 >= 3) {
                int i5 = i2 + 2;
                int i6 = (bArr[i2 + 1] & 255) << 8;
                i2 += 3;
                byte b2 = i6 | ((bArr[i2] & 255) << 16) | (bArr[i5] & 255);
                appendable.append(this.f28965f.c(b2 >>> 18));
                appendable.append(this.f28965f.c((b2 >>> 12) & 63));
                appendable.append(this.f28965f.c((b2 >>> 6) & 63));
                appendable.append(this.f28965f.c(b2 & 63));
                i3 -= 3;
            }
            if (i2 < i4) {
                h(appendable, bArr, i2, i4 - i2);
            }
        }

        public Base64Encoding(Alphabet alphabet, Character ch) {
            super(alphabet, ch);
            Preconditions.d(alphabet.f28954b.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {

        /* renamed from: f  reason: collision with root package name */
        public final BaseEncoding f28962f;

        /* renamed from: g  reason: collision with root package name */
        public final String f28963g;

        /* renamed from: h  reason: collision with root package name */
        public final int f28964h;

        public InputStream b(Reader reader) {
            return this.f28962f.b(BaseEncoding.e(reader, this.f28963g));
        }

        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            this.f28962f.d(BaseEncoding.g(appendable, this.f28963g, this.f28964h), bArr, i2, i3);
        }

        public int f(int i2) {
            int f2 = this.f28962f.f(i2);
            return f2 + (this.f28963g.length() * IntMath.d(Math.max(0, f2 - 1), this.f28964h, RoundingMode.FLOOR));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f28962f);
            String str = this.f28963g;
            int i2 = this.f28964h;
            StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(".withSeparator(\"");
            sb.append(str);
            sb.append("\", ");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class StandardBaseEncoding extends BaseEncoding {

        /* renamed from: f  reason: collision with root package name */
        public final Alphabet f28965f;

        /* renamed from: g  reason: collision with root package name */
        public final Character f28966g;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1  reason: invalid class name */
        class AnonymousClass1 extends OutputStream {

            /* renamed from: A  reason: collision with root package name */
            public int f28967A;

            /* renamed from: B  reason: collision with root package name */
            public int f28968B;
            public final /* synthetic */ Writer C;
            public final /* synthetic */ StandardBaseEncoding D;

            /* renamed from: z  reason: collision with root package name */
            public int f28969z;

            public void close() {
                int i2 = this.f28967A;
                if (i2 > 0) {
                    int i3 = this.f28969z;
                    Alphabet alphabet = this.D.f28965f;
                    this.C.write(alphabet.c((i3 << (alphabet.f28956d - i2)) & alphabet.f28955c));
                    this.f28968B++;
                    if (this.D.f28966g != null) {
                        while (true) {
                            int i4 = this.f28968B;
                            StandardBaseEncoding standardBaseEncoding = this.D;
                            if (i4 % standardBaseEncoding.f28965f.f28957e == 0) {
                                break;
                            }
                            this.C.write(standardBaseEncoding.f28966g.charValue());
                            this.f28968B++;
                        }
                    }
                }
                this.C.close();
            }

            public void flush() {
                this.C.flush();
            }

            public void write(int i2) {
                this.f28969z = (i2 & 255) | (this.f28969z << 8);
                this.f28967A += 8;
                while (true) {
                    int i3 = this.f28967A;
                    Alphabet alphabet = this.D.f28965f;
                    int i4 = alphabet.f28956d;
                    if (i3 >= i4) {
                        this.C.write(alphabet.c((this.f28969z >> (i3 - i4)) & alphabet.f28955c));
                        this.f28968B++;
                        this.f28967A -= this.D.f28965f.f28956d;
                    } else {
                        return;
                    }
                }
            }
        }

        public StandardBaseEncoding(String str, String str2, Character ch) {
            this(new Alphabet(str, str2.toCharArray()), ch);
        }

        public InputStream b(final Reader reader) {
            Preconditions.q(reader);
            return new InputStream() {

                /* renamed from: A  reason: collision with root package name */
                public int f28970A = 0;

                /* renamed from: B  reason: collision with root package name */
                public int f28971B = 0;
                public boolean C = false;

                /* renamed from: z  reason: collision with root package name */
                public int f28972z = 0;

                public void close() {
                    reader.close();
                }

                public int read() {
                    int i2;
                    while (true) {
                        int read = reader.read();
                        if (read != -1) {
                            this.f28971B++;
                            char c2 = (char) read;
                            Character ch = StandardBaseEncoding.this.f28966g;
                            if (ch == null || ch.charValue() != c2) {
                                if (!this.C) {
                                    int i3 = this.f28972z;
                                    Alphabet alphabet = StandardBaseEncoding.this.f28965f;
                                    int i4 = i3 << alphabet.f28956d;
                                    this.f28972z = i4;
                                    int b2 = alphabet.b(c2) | i4;
                                    this.f28972z = b2;
                                    int i5 = this.f28970A + StandardBaseEncoding.this.f28965f.f28956d;
                                    this.f28970A = i5;
                                    if (i5 >= 8) {
                                        int i6 = i5 - 8;
                                        this.f28970A = i6;
                                        return (b2 >> i6) & 255;
                                    }
                                } else {
                                    int i7 = this.f28971B;
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Expected padding character but found '");
                                    sb.append(c2);
                                    sb.append("' at index ");
                                    sb.append(i7);
                                    throw new DecodingException(sb.toString());
                                }
                            } else if (this.C || ((i2 = this.f28971B) != 1 && StandardBaseEncoding.this.f28965f.d(i2 - 1))) {
                                this.C = true;
                            }
                        } else if (this.C || StandardBaseEncoding.this.f28965f.d(this.f28971B)) {
                            return -1;
                        } else {
                            int i8 = this.f28971B;
                            StringBuilder sb2 = new StringBuilder(32);
                            sb2.append("Invalid input length ");
                            sb2.append(i8);
                            throw new DecodingException(sb2.toString());
                        }
                    }
                    int i9 = this.f28971B;
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("Padding cannot start at index ");
                    sb3.append(i9);
                    throw new DecodingException(sb3.toString());
                }

                public int read(byte[] bArr, int i2, int i3) {
                    int i4 = i3 + i2;
                    Preconditions.v(i2, i4, bArr.length);
                    int i5 = i2;
                    while (i5 < i4) {
                        int read = read();
                        if (read == -1) {
                            int i6 = i5 - i2;
                            if (i6 == 0) {
                                return -1;
                            }
                            return i6;
                        }
                        bArr[i5] = (byte) read;
                        i5++;
                    }
                    return i5 - i2;
                }
            };
        }

        public void d(Appendable appendable, byte[] bArr, int i2, int i3) {
            Preconditions.q(appendable);
            Preconditions.v(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                h(appendable, bArr, i2 + i4, Math.min(this.f28965f.f28958f, i3 - i4));
                i4 += this.f28965f.f28958f;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
            return this.f28965f.equals(standardBaseEncoding.f28965f) && Objects.a(this.f28966g, standardBaseEncoding.f28966g);
        }

        public int f(int i2) {
            Alphabet alphabet = this.f28965f;
            return alphabet.f28957e * IntMath.d(i2, alphabet.f28958f, RoundingMode.CEILING);
        }

        public void h(Appendable appendable, byte[] bArr, int i2, int i3) {
            Preconditions.q(appendable);
            Preconditions.v(i2, i2 + i3, bArr.length);
            int i4 = 0;
            Preconditions.d(i3 <= this.f28965f.f28958f);
            long j2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                j2 = (j2 | ((long) (bArr[i2 + i5] & 255))) << 8;
            }
            int i6 = ((i3 + 1) * 8) - this.f28965f.f28956d;
            while (i4 < i3 * 8) {
                Alphabet alphabet = this.f28965f;
                appendable.append(alphabet.c(((int) (j2 >>> (i6 - i4))) & alphabet.f28955c));
                i4 += this.f28965f.f28956d;
            }
            if (this.f28966g != null) {
                while (i4 < this.f28965f.f28958f * 8) {
                    appendable.append(this.f28966g.charValue());
                    i4 += this.f28965f.f28956d;
                }
            }
        }

        public int hashCode() {
            return this.f28965f.hashCode() ^ Objects.b(this.f28966g);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f28965f.toString());
            if (8 % this.f28965f.f28956d != 0) {
                if (this.f28966g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f28966g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public StandardBaseEncoding(Alphabet alphabet, Character ch) {
            this.f28965f = (Alphabet) Preconditions.q(alphabet);
            Preconditions.j(ch == null || !alphabet.e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f28966g = ch;
        }
    }

    public static BaseEncoding a() {
        return f28943e;
    }

    public static Reader e(final Reader reader, final String str) {
        Preconditions.q(reader);
        Preconditions.q(str);
        return new Reader() {
            public void close() {
                reader.close();
            }

            /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: 
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            public int read() {
                /*
                    r3 = this;
                L_0x0000:
                    java.io.Reader r0 = r1
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 == r1) goto L_0x0012
                    java.lang.String r1 = r2
                    char r2 = (char) r0
                    int r1 = r1.indexOf(r2)
                    if (r1 >= 0) goto L_0x0000
                L_0x0012:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.AnonymousClass3.read():int");
            }

            public int read(char[] cArr, int i2, int i3) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static Appendable g(Appendable appendable, String str, int i2) {
        Preconditions.q(appendable);
        Preconditions.q(str);
        Preconditions.d(i2 > 0);
        return new Appendable(i2, appendable, str) {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ int f28948A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ Appendable f28949B;
            public final /* synthetic */ String C;

            /* renamed from: z  reason: collision with root package name */
            public int f28950z;

            {
                this.f28948A = r1;
                this.f28949B = r2;
                this.C = r3;
                this.f28950z = r1;
            }

            public Appendable append(char c2) {
                if (this.f28950z == 0) {
                    this.f28949B.append(this.C);
                    this.f28950z = this.f28948A;
                }
                this.f28949B.append(c2);
                this.f28950z--;
                return this;
            }

            public Appendable append(CharSequence charSequence, int i2, int i3) {
                throw new UnsupportedOperationException();
            }

            public Appendable append(CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract InputStream b(Reader reader);

    public final String c(byte[] bArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(f(i3));
        try {
            d(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void d(Appendable appendable, byte[] bArr, int i2, int i3);

    public abstract int f(int i2);
}
