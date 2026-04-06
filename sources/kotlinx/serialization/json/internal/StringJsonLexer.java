package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public class StringJsonLexer extends AbstractJsonLexer {

    /* renamed from: e  reason: collision with root package name */
    public final String f42455e;

    public StringJsonLexer(String str) {
        Intrinsics.i(str, "source");
        this.f42455e = str;
    }

    public String G(String str, boolean z2) {
        Intrinsics.i(str, "keyToMatch");
        int i2 = this.f42334a;
        try {
            if (j() == 6) {
                if (Intrinsics.d(I(z2), str)) {
                    t();
                    if (j() == 5) {
                        String I = I(z2);
                        this.f42334a = i2;
                        t();
                        return I;
                    }
                }
            }
            return null;
        } finally {
            this.f42334a = i2;
            t();
        }
    }

    public int J(int i2) {
        if (i2 < D().length()) {
            return i2;
        }
        return -1;
    }

    public int L() {
        int i2 = this.f42334a;
        if (i2 == -1) {
            return i2;
        }
        String T = D();
        while (i2 < T.length() && ((r2 = T.charAt(i2)) == ' ' || r2 == 10 || r2 == 13 || r2 == 9)) {
            i2++;
        }
        this.f42334a = i2;
        return i2;
    }

    /* renamed from: T */
    public String D() {
        return this.f42455e;
    }

    public boolean e() {
        int i2 = this.f42334a;
        if (i2 == -1) {
            return false;
        }
        String T = D();
        while (i2 < T.length()) {
            char charAt = T.charAt(i2);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i2++;
            } else {
                this.f42334a = i2;
                return F(charAt);
            }
        }
        this.f42334a = i2;
        return false;
    }

    public String i() {
        l('\"');
        int i2 = this.f42334a;
        int i0 = StringsKt.i0(D(), '\"', i2, false, 4, (Object) null);
        if (i0 != -1) {
            for (int i3 = i2; i3 < i0; i3++) {
                if (D().charAt(i3) == '\\') {
                    return p(D(), this.f42334a, i3);
                }
            }
            this.f42334a = i0 + 1;
            String substring = D().substring(i2, i0);
            Intrinsics.h(substring, "substring(...)");
            return substring;
        }
        q();
        y((byte) 1, false);
        throw new KotlinNothingValueException();
    }

    public byte j() {
        String T = D();
        int i2 = this.f42334a;
        while (i2 != -1 && i2 < T.length()) {
            int i3 = i2 + 1;
            char charAt = T.charAt(i2);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i2 = i3;
            } else {
                this.f42334a = i3;
                return AbstractJsonLexerKt.a(charAt);
            }
        }
        this.f42334a = T.length();
        return 10;
    }

    public void l(char c2) {
        if (this.f42334a == -1) {
            R(c2);
        }
        String T = D();
        int i2 = this.f42334a;
        while (i2 < T.length()) {
            int i3 = i2 + 1;
            char charAt = T.charAt(i2);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f42334a = i3;
                if (charAt != c2) {
                    R(c2);
                } else {
                    return;
                }
            }
            i2 = i3;
        }
        this.f42334a = -1;
        R(c2);
    }
}
