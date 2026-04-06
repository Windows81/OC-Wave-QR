package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ReaderJsonLexer extends AbstractJsonLexer {

    /* renamed from: e  reason: collision with root package name */
    public final InternalJsonReader f42431e;

    /* renamed from: f  reason: collision with root package name */
    public int f42432f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayAsSequence f42433g;

    public String G(String str, boolean z2) {
        Intrinsics.i(str, "keyToMatch");
        return null;
    }

    public int J(int i2) {
        if (i2 < D().length()) {
            return i2;
        }
        this.f42334a = i2;
        u();
        return (this.f42334a != 0 || D().length() == 0) ? -1 : 0;
    }

    public int L() {
        int J;
        char charAt;
        int i2 = this.f42334a;
        while (true) {
            J = J(i2);
            if (J == -1 || !((charAt = D().charAt(J)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f42334a = J;
            } else {
                i2 = J + 1;
            }
        }
        this.f42334a = J;
        return J;
    }

    public String M(int i2, int i3) {
        return D().e(i2, i3);
    }

    /* renamed from: T */
    public ArrayAsSequence D() {
        return this.f42433g;
    }

    public int U(char c2, int i2) {
        ArrayAsSequence T = D();
        int length = T.length();
        while (i2 < length) {
            if (T.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final void V(int i2) {
        char[] b2 = D().b();
        if (i2 != 0) {
            int i3 = this.f42334a;
            ArraysKt.h(b2, b2, 0, i3, i3 + i2);
        }
        int length = D().length();
        while (true) {
            if (i2 == length) {
                break;
            }
            int a2 = this.f42431e.a(b2, i2, length - i2);
            if (a2 == -1) {
                D().f(i2);
                this.f42432f = -1;
                break;
            }
            i2 += a2;
        }
        this.f42334a = 0;
    }

    public void d(int i2, int i3) {
        StringBuilder C = C();
        C.append(D().b(), i2, i3 - i2);
        Intrinsics.h(C, "append(...)");
    }

    public boolean e() {
        u();
        int i2 = this.f42334a;
        while (true) {
            int J = J(i2);
            if (J != -1) {
                char charAt = D().charAt(J);
                if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                    i2 = J + 1;
                } else {
                    this.f42334a = J;
                    return F(charAt);
                }
            } else {
                this.f42334a = J;
                return false;
            }
        }
    }

    public String i() {
        l('\"');
        int i2 = this.f42334a;
        int U = U('\"', i2);
        if (U == -1) {
            int J = J(i2);
            if (J != -1) {
                return p(D(), this.f42334a, J);
            }
            AbstractJsonLexer.z(this, (byte) 1, false, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        for (int i3 = i2; i3 < U; i3++) {
            if (D().charAt(i3) == '\\') {
                return p(D(), this.f42334a, i3);
            }
        }
        this.f42334a = U + 1;
        return M(i2, U);
    }

    public byte j() {
        u();
        ArrayAsSequence T = D();
        int i2 = this.f42334a;
        while (true) {
            int J = J(i2);
            if (J != -1) {
                int i3 = J + 1;
                byte a2 = AbstractJsonLexerKt.a(T.charAt(J));
                if (a2 != 3) {
                    this.f42334a = i3;
                    return a2;
                }
                i2 = i3;
            } else {
                this.f42334a = J;
                return 10;
            }
        }
    }

    public void l(char c2) {
        u();
        ArrayAsSequence T = D();
        int i2 = this.f42334a;
        while (true) {
            int J = J(i2);
            if (J != -1) {
                int i3 = J + 1;
                char charAt = T.charAt(J);
                if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                    this.f42334a = i3;
                    if (charAt != c2) {
                        R(c2);
                    } else {
                        return;
                    }
                }
                i2 = i3;
            } else {
                this.f42334a = J;
                R(c2);
                return;
            }
        }
    }

    public void u() {
        int length = D().length() - this.f42334a;
        if (length <= this.f42432f) {
            V(length);
        }
    }
}
