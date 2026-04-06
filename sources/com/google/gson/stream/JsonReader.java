package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class JsonReader implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public boolean f31891A = false;

    /* renamed from: B  reason: collision with root package name */
    public final char[] f31892B = new char[1024];
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public long H;
    public int I;
    public String J;
    public int[] K;
    public int L;
    public String[] M;
    public int[] N;

    /* renamed from: z  reason: collision with root package name */
    public final Reader f31893z;

    static {
        JsonReaderInternalAccess.f31732a = new JsonReaderInternalAccess() {
            public void a(JsonReader jsonReader) {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).H0();
                    return;
                }
                int i2 = jsonReader.G;
                if (i2 == 0) {
                    i2 = jsonReader.f();
                }
                if (i2 == 13) {
                    jsonReader.G = 9;
                } else if (i2 == 12) {
                    jsonReader.G = 8;
                } else if (i2 == 14) {
                    jsonReader.G = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + jsonReader.S() + jsonReader.A());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.K = iArr;
        this.L = 1;
        iArr[0] = 6;
        this.M = new String[32];
        this.N = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f31893z = reader;
    }

    private String m(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (true) {
            int i3 = this.L;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.K[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.N[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.M[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public String A() {
        return " at line " + (this.E + 1) + " column " + ((this.C - this.F) + 1) + " path " + l();
    }

    public boolean C() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 5) {
            this.G = 0;
            int[] iArr = this.N;
            int i3 = this.L - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.G = 0;
            int[] iArr2 = this.N;
            int i4 = this.L - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + S() + A());
        }
    }

    public double D() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            this.G = 0;
            int[] iArr = this.N;
            int i3 = this.L - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.H;
        }
        if (i2 == 16) {
            this.J = new String(this.f31892B, this.C, this.I);
            this.C += this.I;
        } else if (i2 == 8 || i2 == 9) {
            this.J = N(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.J = Q();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + S() + A());
        }
        this.G = 11;
        double parseDouble = Double.parseDouble(this.J);
        if (this.f31891A || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.J = null;
            this.G = 0;
            int[] iArr2 = this.N;
            int i4 = this.L - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + A());
    }

    public int E() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            long j2 = this.H;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.G = 0;
                int[] iArr = this.N;
                int i4 = this.L - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.H + A());
        }
        if (i2 == 16) {
            this.J = new String(this.f31892B, this.C, this.I);
            this.C += this.I;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.J = Q();
            } else {
                this.J = N(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.J);
                this.G = 0;
                int[] iArr2 = this.N;
                int i5 = this.L - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + S() + A());
        }
        this.G = 11;
        double parseDouble = Double.parseDouble(this.J);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.J = null;
            this.G = 0;
            int[] iArr3 = this.N;
            int i7 = this.L - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.J + A());
    }

    public long F() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 15) {
            this.G = 0;
            int[] iArr = this.N;
            int i3 = this.L - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.H;
        }
        if (i2 == 16) {
            this.J = new String(this.f31892B, this.C, this.I);
            this.C += this.I;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.J = Q();
            } else {
                this.J = N(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.J);
                this.G = 0;
                int[] iArr2 = this.N;
                int i4 = this.L - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + S() + A());
        }
        this.G = 11;
        double parseDouble = Double.parseDouble(this.J);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.J = null;
            this.G = 0;
            int[] iArr3 = this.N;
            int i5 = this.L - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.J + A());
    }

    public String G() {
        String str;
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 14) {
            str = Q();
        } else if (i2 == 12) {
            str = N('\'');
        } else if (i2 == 13) {
            str = N('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + S() + A());
        }
        this.G = 0;
        this.M[this.L - 1] = str;
        return str;
    }

    public final int H(boolean z2) {
        char[] cArr = this.f31892B;
        int i2 = this.C;
        int i3 = this.D;
        while (true) {
            if (i2 == i3) {
                this.C = i2;
                if (k(1)) {
                    i2 = this.C;
                    i3 = this.D;
                } else if (!z2) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + A());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == 10) {
                this.E++;
                this.F = i4;
            } else if (!(c2 == ' ' || c2 == 13 || c2 == 9)) {
                if (c2 == '/') {
                    this.C = i4;
                    if (i4 == i3) {
                        this.C = i2;
                        boolean k2 = k(2);
                        this.C++;
                        if (!k2) {
                            return c2;
                        }
                    }
                    c();
                    int i5 = this.C;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.C = i5 + 1;
                        if (m0("*/")) {
                            i2 = this.C + 2;
                            i3 = this.D;
                        } else {
                            throw s0("Unterminated comment");
                        }
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.C = i5 + 1;
                        n0();
                        i2 = this.C;
                        i3 = this.D;
                    }
                } else if (c2 == '#') {
                    this.C = i4;
                    c();
                    n0();
                    i2 = this.C;
                    i3 = this.D;
                } else {
                    this.C = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }

    public void I() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 7) {
            this.G = 0;
            int[] iArr = this.N;
            int i3 = this.L - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + S() + A());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.C = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String N(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f31892B
            r1 = 0
        L_0x0003:
            int r2 = r9.C
            int r3 = r9.D
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.C = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004d
            r9.C = r7
            int r7 = r7 - r3
            int r2 = r7 + -1
            if (r1 != 0) goto L_0x003e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L_0x003e:
            r1.append(r0, r3, r2)
            char r2 = r9.e0()
            r1.append(r2)
            int r2 = r9.C
            int r3 = r9.D
            goto L_0x0007
        L_0x004d:
            r5 = 10
            if (r2 != r5) goto L_0x0058
            int r2 = r9.E
            int r2 = r2 + r6
            r9.E = r2
            r9.F = r7
        L_0x0058:
            r2 = r7
            goto L_0x0009
        L_0x005a:
            if (r1 != 0) goto L_0x006a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.C = r2
            boolean r2 = r9.k(r6)
            if (r2 == 0) goto L_0x0078
            goto L_0x0003
        L_0x0078:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.s0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.N(char):java.lang.String");
    }

    public String O() {
        String str;
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 10) {
            str = Q();
        } else if (i2 == 8) {
            str = N('\'');
        } else if (i2 == 9) {
            str = N('\"');
        } else if (i2 == 11) {
            str = this.J;
            this.J = null;
        } else if (i2 == 15) {
            str = Long.toString(this.H);
        } else if (i2 == 16) {
            str = new String(this.f31892B, this.C, this.I);
            this.C += this.I;
        } else {
            throw new IllegalStateException("Expected a string but was " + S() + A());
        }
        this.G = 0;
        int[] iArr = this.N;
        int i3 = this.L - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String Q() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.C
            int r4 = r3 + r2
            int r5 = r6.D
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f31892B
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.c()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f31892B
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.k(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f31892B
            int r4 = r6.C
            r0.append(r3, r4, r2)
            int r3 = r6.C
            int r3 = r3 + r2
            r6.C = r3
            r2 = 1
            boolean r2 = r6.k(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f31892B
            int r3 = r6.C
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f31892B
            int r3 = r6.C
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.C
            int r2 = r2 + r1
            r6.C = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.Q():java.lang.String");
    }

    public JsonToken S() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        switch (i2) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int T() {
        int i2;
        String str;
        String str2;
        char c2 = this.f31892B[this.C];
        if (c2 == 't' || c2 == 'T') {
            str2 = "true";
            str = "TRUE";
            i2 = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            str2 = "false";
            str = "FALSE";
            i2 = 6;
        } else if (c2 != 'n' && c2 != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i2 = 7;
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.C + i3 >= this.D && !k(i3 + 1)) {
                return 0;
            }
            char c3 = this.f31892B[this.C + i3];
            if (c3 != str2.charAt(i3) && c3 != str.charAt(i3)) {
                return 0;
            }
        }
        if ((this.C + length < this.D || k(length + 1)) && y(this.f31892B[this.C + length])) {
            return 0;
        }
        this.C += length;
        this.G = i2;
        return i2;
    }

    public final int X() {
        char c2;
        char c3;
        char[] cArr = this.f31892B;
        int i2 = this.C;
        int i3 = this.D;
        int i4 = 0;
        int i5 = 0;
        char c4 = 0;
        boolean z2 = false;
        boolean z3 = true;
        long j2 = 0;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!k(i5 + 1)) {
                    break;
                }
                i2 = this.C;
                i3 = this.D;
            }
            c2 = cArr[i2 + i5];
            if (c2 == '+') {
                c3 = 6;
                i4 = 0;
                if (c4 != 5) {
                    return 0;
                }
            } else if (c2 == 'E' || c2 == 'e') {
                i4 = 0;
                if (c4 != 2 && c4 != 4) {
                    return 0;
                }
                c4 = 5;
                i5++;
            } else if (c2 != '-') {
                c3 = 3;
                if (c2 == '.') {
                    i4 = 0;
                    if (c4 != 2) {
                        return 0;
                    }
                } else if (c2 >= '0' && c2 <= '9') {
                    if (c4 == 1 || c4 == 0) {
                        j2 = (long) (-(c2 - '0'));
                        c4 = 2;
                    } else if (c4 != 2) {
                        if (c4 == 3) {
                            i4 = 0;
                            c4 = 4;
                        } else if (c4 == 5 || c4 == 6) {
                            i4 = 0;
                            c4 = 7;
                        }
                        i5++;
                    } else if (j2 == 0) {
                        return 0;
                    } else {
                        long j3 = (10 * j2) - ((long) (c2 - '0'));
                        int i6 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                        z3 &= i6 > 0 || (i6 == 0 && j3 < j2);
                        j2 = j3;
                    }
                    i4 = 0;
                    i5++;
                }
            } else {
                c3 = 6;
                i4 = 0;
                if (c4 == 0) {
                    c4 = 1;
                    z2 = true;
                    i5++;
                } else if (c4 != 5) {
                    return 0;
                }
            }
            c4 = c3;
            i5++;
        }
        if (y(c2)) {
            return 0;
        }
        if (c4 == 2 && z3 && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.H = j2;
            this.C += i5;
            this.G = 15;
            return 15;
        } else if (c4 != 2 && c4 != 4 && c4 != 7) {
            return 0;
        } else {
            this.I = i5;
            this.G = 16;
            return 16;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r7.G = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.G
            if (r2 != 0) goto L_0x000a
            int r2 = r7.f()
        L_0x000a:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006f;
                case 2: goto L_0x005f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0074
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.C
            int r3 = r7.I
            int r2 = r2 + r3
            r7.C = r2
            goto L_0x0074
        L_0x001e:
            r7.o0()
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.M
            int r3 = r7.L
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x002b:
            r7.g0(r4)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.M
            int r3 = r7.L
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0038:
            r7.g0(r3)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.M
            int r3 = r7.L
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0045:
            r7.o0()
            goto L_0x0074
        L_0x0049:
            r7.g0(r4)
            goto L_0x0074
        L_0x004d:
            r7.g0(r3)
            goto L_0x0074
        L_0x0051:
            int r2 = r7.L
            int r2 = r2 - r6
            r7.L = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0074
        L_0x0059:
            r7.c0(r6)
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x005f:
            if (r1 != 0) goto L_0x0069
            java.lang.String[] r2 = r7.M
            int r3 = r7.L
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0069:
            int r2 = r7.L
            int r2 = r2 - r6
            r7.L = r2
            goto L_0x0056
        L_0x006f:
            r2 = 3
            r7.c0(r2)
            goto L_0x005c
        L_0x0074:
            r7.G = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.N
            int r1 = r7.L
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.Y():void");
    }

    public void a() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 3) {
            c0(1);
            this.N[this.L - 1] = 0;
            this.G = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + S() + A());
    }

    public void b() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 1) {
            c0(3);
            this.G = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + S() + A());
    }

    public final void c() {
        if (!this.f31891A) {
            throw s0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final void c0(int i2) {
        int i3 = this.L;
        int[] iArr = this.K;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.K = Arrays.copyOf(iArr, i4);
            this.N = Arrays.copyOf(this.N, i4);
            this.M = (String[]) Arrays.copyOf(this.M, i4);
        }
        int[] iArr2 = this.K;
        int i5 = this.L;
        this.L = i5 + 1;
        iArr2[i5] = i2;
    }

    public void close() {
        this.G = 0;
        this.K[0] = 8;
        this.L = 1;
        this.f31893z.close();
    }

    public final void d() {
        H(true);
        int i2 = this.C;
        this.C = i2 - 1;
        if (i2 + 4 <= this.D || k(5)) {
            int i3 = this.C;
            char[] cArr = this.f31892B;
            if (cArr[i3] == ')' && cArr[i3 + 1] == ']' && cArr[i3 + 2] == '}' && cArr[i3 + 3] == '\'' && cArr[i3 + 4] == 10) {
                this.C = i3 + 5;
            }
        }
    }

    public final char e0() {
        int i2;
        if (this.C != this.D || k(1)) {
            char[] cArr = this.f31892B;
            int i3 = this.C;
            int i4 = i3 + 1;
            this.C = i4;
            char c2 = cArr[i3];
            if (c2 == 10) {
                this.E++;
                this.F = i4;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return 8;
                }
                if (c2 == 'f') {
                    return 12;
                }
                if (c2 == 'n') {
                    return 10;
                }
                if (c2 == 'r') {
                    return 13;
                }
                if (c2 == 't') {
                    return 9;
                }
                if (c2 != 'u') {
                    throw s0("Invalid escape sequence");
                } else if (i3 + 5 <= this.D || k(4)) {
                    int i5 = this.C;
                    int i6 = i5 + 4;
                    char c3 = 0;
                    while (i5 < i6) {
                        char c4 = this.f31892B[i5];
                        char c5 = (char) (c3 << 4);
                        if (c4 >= '0' && c4 <= '9') {
                            i2 = c4 - '0';
                        } else if (c4 >= 'a' && c4 <= 'f') {
                            i2 = c4 - 'W';
                        } else if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f31892B, this.C, 4));
                        } else {
                            i2 = c4 - '7';
                        }
                        c3 = (char) (c5 + i2);
                        i5++;
                    }
                    this.C += 4;
                    return c3;
                } else {
                    throw s0("Unterminated escape sequence");
                }
            }
            return c2;
        }
        throw s0("Unterminated escape sequence");
    }

    public int f() {
        int H2;
        int[] iArr = this.K;
        int i2 = this.L;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int H3 = H(true);
            if (H3 != 44) {
                if (H3 == 59) {
                    c();
                } else if (H3 == 93) {
                    this.G = 4;
                    return 4;
                } else {
                    throw s0("Unterminated array");
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2 - 1] = 4;
            if (i3 == 5 && (H2 = H(true)) != 44) {
                if (H2 == 59) {
                    c();
                } else if (H2 == 125) {
                    this.G = 2;
                    return 2;
                } else {
                    throw s0("Unterminated object");
                }
            }
            int H4 = H(true);
            if (H4 == 34) {
                this.G = 13;
                return 13;
            } else if (H4 == 39) {
                c();
                this.G = 12;
                return 12;
            } else if (H4 != 125) {
                c();
                this.C--;
                if (y((char) H4)) {
                    this.G = 14;
                    return 14;
                }
                throw s0("Expected name");
            } else if (i3 != 5) {
                this.G = 2;
                return 2;
            } else {
                throw s0("Expected name");
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int H5 = H(true);
            if (H5 != 58) {
                if (H5 == 61) {
                    c();
                    if (this.C < this.D || k(1)) {
                        char[] cArr = this.f31892B;
                        int i4 = this.C;
                        if (cArr[i4] == '>') {
                            this.C = i4 + 1;
                        }
                    }
                } else {
                    throw s0("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            if (this.f31891A) {
                d();
            }
            this.K[this.L - 1] = 7;
        } else if (i3 == 7) {
            if (H(false) == -1) {
                this.G = 17;
                return 17;
            }
            c();
            this.C--;
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int H6 = H(true);
        if (H6 == 34) {
            this.G = 9;
            return 9;
        } else if (H6 != 39) {
            if (!(H6 == 44 || H6 == 59)) {
                if (H6 == 91) {
                    this.G = 3;
                    return 3;
                } else if (H6 != 93) {
                    if (H6 != 123) {
                        this.C--;
                        int T = T();
                        if (T != 0) {
                            return T;
                        }
                        int X = X();
                        if (X != 0) {
                            return X;
                        }
                        if (y(this.f31892B[this.C])) {
                            c();
                            this.G = 10;
                            return 10;
                        }
                        throw s0("Expected value");
                    }
                    this.G = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.G = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                c();
                this.C--;
                this.G = 7;
                return 7;
            }
            throw s0("Unexpected value");
        } else {
            c();
            this.G = 8;
            return 8;
        }
    }

    public final void f0(boolean z2) {
        this.f31891A = z2;
    }

    public void g() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 4) {
            int i3 = this.L;
            this.L = i3 - 1;
            int[] iArr = this.N;
            int i4 = i3 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.G = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + S() + A());
    }

    public final void g0(char c2) {
        char[] cArr = this.f31892B;
        do {
            int i2 = this.C;
            int i3 = this.D;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.C = i4;
                    return;
                } else if (c3 == '\\') {
                    this.C = i4;
                    e0();
                    i2 = this.C;
                    i3 = this.D;
                } else {
                    if (c3 == 10) {
                        this.E++;
                        this.F = i4;
                    }
                    i2 = i4;
                }
            }
            this.C = i2;
        } while (k(1));
        throw s0("Unterminated string");
    }

    public void j() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        if (i2 == 2) {
            int i3 = this.L;
            int i4 = i3 - 1;
            this.L = i4;
            this.M[i4] = null;
            int[] iArr = this.N;
            int i5 = i3 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.G = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + S() + A());
    }

    public final boolean k(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f31892B;
        int i5 = this.F;
        int i6 = this.C;
        this.F = i5 - i6;
        int i7 = this.D;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.D = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.D = 0;
        }
        this.C = 0;
        do {
            Reader reader = this.f31893z;
            int i9 = this.D;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.D + read;
            this.D = i3;
            if (this.E == 0 && (i4 = this.F) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.C++;
                this.F = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public String l() {
        return m(false);
    }

    public final boolean m0(String str) {
        int length = str.length();
        while (true) {
            int i2 = 0;
            if (this.C + length > this.D && !k(length)) {
                return false;
            }
            char[] cArr = this.f31892B;
            int i3 = this.C;
            if (cArr[i3] == 10) {
                this.E++;
                this.F = i3 + 1;
            } else {
                while (i2 < length) {
                    if (this.f31892B[this.C + i2] == str.charAt(i2)) {
                        i2++;
                    }
                }
                return true;
            }
            this.C++;
        }
    }

    public final void n0() {
        char c2;
        do {
            if (this.C < this.D || k(1)) {
                char[] cArr = this.f31892B;
                int i2 = this.C;
                int i3 = i2 + 1;
                this.C = i3;
                c2 = cArr[i2];
                if (c2 == 10) {
                    this.E++;
                    this.F = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.C
            int r2 = r1 + r0
            int r3 = r4.D
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f31892B
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.c()
        L_0x004b:
            int r1 = r4.C
            int r1 = r1 + r0
            r4.C = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.C = r1
            r0 = 1
            boolean r0 = r4.k(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.o0():void");
    }

    public String r() {
        return m(true);
    }

    public final IOException s0(String str) {
        throw new MalformedJsonException(str + A());
    }

    public boolean t() {
        int i2 = this.G;
        if (i2 == 0) {
            i2 = f();
        }
        return (i2 == 2 || i2 == 4 || i2 == 17) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + A();
    }

    public final boolean x() {
        return this.f31891A;
    }

    public final boolean y(char c2) {
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }
}
