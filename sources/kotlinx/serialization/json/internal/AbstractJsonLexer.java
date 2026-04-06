package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public abstract class AbstractJsonLexer {

    /* renamed from: a  reason: collision with root package name */
    public int f42334a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonPath f42335b = new JsonPath();

    /* renamed from: c  reason: collision with root package name */
    public String f42336c;

    /* renamed from: d  reason: collision with root package name */
    public StringBuilder f42337d = new StringBuilder();

    public static /* synthetic */ boolean Q(AbstractJsonLexer abstractJsonLexer, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            return abstractJsonLexer.P(z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    public static final double n(long j2, boolean z2) {
        if (!z2) {
            return Math.pow(10.0d, -((double) j2));
        }
        if (z2) {
            return Math.pow(10.0d, (double) j2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void x(AbstractJsonLexer abstractJsonLexer, String str, int i2, String str2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = abstractJsonLexer.f42334a;
            }
            if ((i3 & 4) != 0) {
                str2 = "";
            }
            return abstractJsonLexer.w(str, i2, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ Void z(AbstractJsonLexer abstractJsonLexer, byte b2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return abstractJsonLexer.y(b2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public final void A(String str) {
        Intrinsics.i(str, "key");
        int q0 = StringsKt.q0(M(0, this.f42334a), str, 0, false, 6, (Object) null);
        w("Encountered an unknown key '" + str + '\'', q0, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    public final int B(CharSequence charSequence, int i2) {
        char charAt = charSequence.charAt(i2);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final StringBuilder C() {
        return this.f42337d;
    }

    public abstract CharSequence D();

    public final boolean E() {
        return H() != 10;
    }

    public final boolean F(char c2) {
        return (c2 == ',' || c2 == ':' || c2 == ']' || c2 == '}') ? false : true;
    }

    public abstract String G(String str, boolean z2);

    public byte H() {
        CharSequence D = D();
        int i2 = this.f42334a;
        while (true) {
            int J = J(i2);
            if (J != -1) {
                char charAt = D.charAt(J);
                if (charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ') {
                    i2 = J + 1;
                } else {
                    this.f42334a = J;
                    return AbstractJsonLexerKt.a(charAt);
                }
            } else {
                this.f42334a = J;
                return 10;
            }
        }
    }

    public final String I(boolean z2) {
        String str;
        byte H = H();
        if (z2) {
            if (H != 1 && H != 0) {
                return null;
            }
            str = q();
        } else if (H != 1) {
            return null;
        } else {
            str = o();
        }
        this.f42336c = str;
        return str;
    }

    public abstract int J(int i2);

    public final void K(boolean z2) {
        ArrayList arrayList = new ArrayList();
        byte H = H();
        if (H == 8 || H == 6) {
            while (true) {
                byte H2 = H();
                if (H2 != 1) {
                    if (H2 == 8 || H2 == 6) {
                        arrayList.add(Byte.valueOf(H2));
                    } else if (H2 == 9) {
                        if (((Number) CollectionsKt.p0(arrayList)).byteValue() == 8) {
                            CollectionsKt.K(arrayList);
                        } else {
                            int i2 = this.f42334a;
                            throw JsonExceptionsKt.f(i2, "found ] instead of } at path: " + this.f42335b, D());
                        }
                    } else if (H2 == 7) {
                        if (((Number) CollectionsKt.p0(arrayList)).byteValue() == 6) {
                            CollectionsKt.K(arrayList);
                        } else {
                            int i3 = this.f42334a;
                            throw JsonExceptionsKt.f(i3, "found } instead of ] at path: " + this.f42335b, D());
                        }
                    } else if (H2 == 10) {
                        x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                    j();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z2) {
                    q();
                } else {
                    i();
                }
            }
        } else {
            q();
        }
    }

    public abstract int L();

    public String M(int i2, int i3) {
        return D().subSequence(i2, i3).toString();
    }

    public final String N() {
        String str = this.f42336c;
        Intrinsics.f(str);
        this.f42336c = null;
        return str;
    }

    public final boolean O() {
        int L = L();
        CharSequence D = D();
        if (L >= D.length() || L == -1 || D.charAt(L) != ',') {
            return false;
        }
        this.f42334a++;
        return true;
    }

    public final boolean P(boolean z2) {
        int J = J(L());
        int length = D().length() - J;
        if (length < 4 || J == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("null".charAt(i2) != D().charAt(J + i2)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.a(D().charAt(J + 4)) == 0) {
            return false;
        }
        if (!z2) {
            return true;
        }
        this.f42334a = J + 4;
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final void R(char c2) {
        int i2 = this.f42334a;
        if (i2 > 0 && c2 == '\"') {
            try {
                this.f42334a = i2 - 1;
                String q2 = q();
                this.f42334a = i2;
                if (Intrinsics.d(q2, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f42334a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.f42334a = i2;
                throw th;
            }
        }
        z(this, AbstractJsonLexerKt.a(c2), false, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final boolean S() {
        return D().charAt(this.f42334a - 1) != '\"';
    }

    public final int a(int i2) {
        int J = J(i2);
        if (J != -1) {
            int i3 = J + 1;
            char charAt = D().charAt(J);
            if (charAt == 'u') {
                return c(D(), i3);
            }
            char b2 = AbstractJsonLexerKt.b(charAt);
            if (b2 != 0) {
                this.f42337d.append(b2);
                return i3;
            }
            x(this, "Invalid escaped char '" + charAt + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final int b(int i2, int i3) {
        d(i2, i3);
        return a(i3 + 1);
    }

    public final int c(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 >= charSequence.length()) {
            this.f42334a = i2;
            u();
            if (this.f42334a + 4 < charSequence.length()) {
                return c(charSequence, this.f42334a);
            }
            x(this, "Unexpected EOF during unicode escape", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        this.f42337d.append((char) ((B(charSequence, i2) << 12) + (B(charSequence, i2 + 1) << 8) + (B(charSequence, i2 + 2) << 4) + B(charSequence, i2 + 3)));
        return i3;
    }

    public void d(int i2, int i3) {
        this.f42337d.append(D(), i2, i3);
    }

    public abstract boolean e();

    public final boolean f(int i2) {
        int J = J(i2);
        if (J >= D().length() || J == -1) {
            x(this, "EOF", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
        int i3 = J + 1;
        char charAt = D().charAt(J) | ' ';
        if (charAt == 'f') {
            h("alse", i3);
            return false;
        } else if (charAt == 't') {
            h("rue", i3);
            return true;
        } else {
            x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final boolean g() {
        boolean z2;
        int L = L();
        if (L != D().length()) {
            if (D().charAt(L) == '\"') {
                L++;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean f2 = f(L);
            if (z2) {
                if (this.f42334a == D().length()) {
                    x(this, "EOF", 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                } else if (D().charAt(this.f42334a) == '\"') {
                    this.f42334a++;
                } else {
                    x(this, "Expected closing quotation mark", 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return f2;
        }
        x(this, "EOF", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final void h(String str, int i2) {
        if (D().length() - i2 >= str.length()) {
            int length = str.length();
            int i3 = 0;
            while (i3 < length) {
                if (str.charAt(i3) == (D().charAt(i2 + i3) | ' ')) {
                    i3++;
                } else {
                    x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, (String) null, 6, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f42334a = i2 + str.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b2) {
        byte j2 = j();
        if (j2 == b2) {
            return j2;
        }
        z(this, b2, false, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    public abstract void l(char c2);

    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (r5 == r0) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0146, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r0 == r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        if (r10 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014d, code lost:
        if (r0 == (r5 - 1)) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014f, code lost:
        if (r1 == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0151, code lost:
        if (r3 == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015d, code lost:
        if (D().charAt(r5) != '\"') goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0162, code lost:
        x(r17, "Expected closing quotation mark", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0173, code lost:
        x(r17, "EOF", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0184, code lost:
        r6.f42334a = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        if (r9 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r0 = ((double) r11) * n(r13, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0192, code lost:
        if (r0 > 9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        if (r0 < -9.223372036854776E18d) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        r11 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        x(r17, "Can't convert " + r0 + " to Long", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c8, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d9, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r11 == Long.MIN_VALUE) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        x(r17, "Numeric value overflow", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        x(r17, "Expected numeric literal", 0, (java.lang.String) null, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r17.L()
            int r0 = r6.J(r0)
            java.lang.CharSequence r1 = r17.D()
            int r1 = r1.length()
            if (r0 >= r1) goto L_0x0207
            r1 = -1
            if (r0 == r1) goto L_0x0207
            java.lang.CharSequence r1 = r17.D()
            char r1 = r1.charAt(r0)
            r2 = 34
            if (r1 != r2) goto L_0x0042
            int r0 = r0 + 1
            java.lang.CharSequence r1 = r17.D()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0031
            r1 = 1
            goto L_0x0043
        L_0x0031:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0042:
            r1 = 0
        L_0x0043:
            r7 = 0
            r5 = r0
            r11 = r7
            r13 = r11
            r9 = 0
            r10 = 0
        L_0x004a:
            r15 = 0
        L_0x004b:
            java.lang.CharSequence r16 = r17.D()
            int r3 = r16.length()
            if (r5 == r3) goto L_0x0142
            java.lang.CharSequence r3 = r17.D()
            char r3 = r3.charAt(r5)
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L_0x0065
            r4 = 69
            if (r3 != r4) goto L_0x0093
        L_0x0065:
            if (r9 != 0) goto L_0x0093
            if (r5 == r0) goto L_0x006e
            int r5 = r5 + 1
            r9 = 1
        L_0x006c:
            r15 = 1
            goto L_0x004b
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0093:
            r4 = 45
            if (r3 != r4) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            if (r5 == r0) goto L_0x009e
            int r5 = r5 + 1
            goto L_0x004a
        L_0x009e:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00af:
            r2 = 43
            if (r3 != r2) goto L_0x00cd
            if (r9 == 0) goto L_0x00cd
            if (r5 == r0) goto L_0x00bc
            int r5 = r5 + 1
            r2 = 34
            goto L_0x006c
        L_0x00bc:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00cd:
            if (r3 != r4) goto L_0x00e9
            if (r5 != r0) goto L_0x00d8
            int r5 = r5 + 1
            r2 = 34
            r10 = 1
            goto L_0x004b
        L_0x00d8:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Unexpected symbol '-' in numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00e9:
            byte r2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.a(r3)
            if (r2 != 0) goto L_0x0142
            int r5 = r5 + 1
            int r2 = r3 + -48
            if (r2 < 0) goto L_0x011d
            r4 = 10
            if (r2 >= r4) goto L_0x011d
            if (r9 == 0) goto L_0x0103
            long r3 = (long) r4
            long r13 = r13 * r3
            long r2 = (long) r2
            long r13 = r13 + r2
        L_0x00ff:
            r2 = 34
            goto L_0x004b
        L_0x0103:
            long r3 = (long) r4
            long r11 = r11 * r3
            long r2 = (long) r2
            long r11 = r11 - r2
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x010c
            goto L_0x00ff
        L_0x010c:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected symbol '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "' in numeric literal"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0142:
            if (r5 == r0) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r0 == r5) goto L_0x01f6
            if (r10 == 0) goto L_0x014f
            int r2 = r5 + -1
            if (r0 == r2) goto L_0x01f6
        L_0x014f:
            if (r1 == 0) goto L_0x0184
            if (r3 == 0) goto L_0x0173
            java.lang.CharSequence r0 = r17.D()
            char r0 = r0.charAt(r5)
            r1 = 34
            if (r0 != r1) goto L_0x0162
            int r5 = r5 + 1
            goto L_0x0184
        L_0x0162:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected closing quotation mark"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0173:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0184:
            r6.f42334a = r5
            if (r9 == 0) goto L_0x01da
            double r0 = (double) r11
            double r2 = n(r13, r15)
            double r0 = r0 * r2
            r2 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c9
            r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01c9
            double r2 = java.lang.Math.floor(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            long r11 = (long) r0
            goto L_0x01da
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't convert "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " to Long"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01c9:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01da:
            if (r10 == 0) goto L_0x01dd
            goto L_0x01e4
        L_0x01dd:
            r0 = -9223372036854775808
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e5
            long r11 = -r11
        L_0x01e4:
            return r11
        L_0x01e5:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Numeric value overflow"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x01f6:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "Expected numeric literal"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x0207:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "EOF"
            r2 = 0
            r3 = 0
            r0 = r17
            x(r0, r1, r2, r3, r4, r5)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonLexer.m():long");
    }

    public final String o() {
        return this.f42336c != null ? N() : i();
    }

    public final String p(CharSequence charSequence, int i2, int i3) {
        int J;
        Intrinsics.i(charSequence, "source");
        char charAt = charSequence.charAt(i3);
        boolean z2 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                J = J(b(i2, i3));
                if (J == -1) {
                    x(this, "Unexpected EOF", J, (String) null, 4, (Object) null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i3++;
                if (i3 >= charSequence.length()) {
                    d(i2, i3);
                    J = J(i3);
                    if (J == -1) {
                        x(this, "Unexpected EOF", J, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i3);
                }
            }
            z2 = true;
            i2 = J;
            i3 = i2;
            charAt = charSequence.charAt(i3);
        }
        String M = !z2 ? M(i2, i3) : s(i2, i3);
        this.f42334a = i3 + 1;
        return M;
    }

    public final String q() {
        if (this.f42336c != null) {
            return N();
        }
        int L = L();
        if (L >= D().length() || L == -1) {
            x(this, "EOF", L, (String) null, 4, (Object) null);
            throw new KotlinNothingValueException();
        }
        byte a2 = AbstractJsonLexerKt.a(D().charAt(L));
        if (a2 == 1) {
            return o();
        }
        if (a2 == 0) {
            boolean z2 = false;
            while (AbstractJsonLexerKt.a(D().charAt(L)) == 0) {
                L++;
                if (L >= D().length()) {
                    d(this.f42334a, L);
                    int J = J(L);
                    if (J == -1) {
                        this.f42334a = L;
                        return s(0, 0);
                    }
                    L = J;
                    z2 = true;
                }
            }
            String M = !z2 ? M(this.f42334a, L) : s(this.f42334a, L);
            this.f42334a = L;
            return M;
        }
        x(this, "Expected beginning of the string, but got " + D().charAt(L), 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final String r() {
        String q2 = q();
        if (!Intrinsics.d(q2, "null") || !S()) {
            return q2;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public final String s(int i2, int i3) {
        d(i2, i3);
        String sb = this.f42337d.toString();
        Intrinsics.h(sb, "toString(...)");
        this.f42337d.setLength(0);
        return sb;
    }

    public final void t() {
        this.f42336c = null;
    }

    public String toString() {
        return "JsonReader(source='" + D() + "', currentPosition=" + this.f42334a + ')';
    }

    public void u() {
    }

    public final void v() {
        if (j() != 10) {
            x(this, "Expected EOF after parsing, but had " + D().charAt(this.f42334a - 1) + " instead", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public final Void w(String str, int i2, String str2) {
        String str3;
        Intrinsics.i(str, "message");
        Intrinsics.i(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = 10 + str2;
        }
        throw JsonExceptionsKt.f(i2, str + " at path: " + this.f42335b.a() + str3, D());
    }

    public final Void y(byte b2, boolean z2) {
        String c2 = AbstractJsonLexerKt.c(b2);
        int i2 = z2 ? this.f42334a - 1 : this.f42334a;
        String valueOf = (this.f42334a == D().length() || i2 < 0) ? "EOF" : String.valueOf(D().charAt(i2));
        x(this, "Expected " + c2 + ", but had '" + valueOf + "' instead", i2, (String) null, 4, (Object) null);
        throw new KotlinNothingValueException();
    }
}
