package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class StringJsonLexerWithComments extends StringJsonLexer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringJsonLexerWithComments(String str) {
        super(str);
        Intrinsics.i(str, "source");
    }

    public byte H() {
        String T = D();
        int L = L();
        if (L >= T.length() || L == -1) {
            return 10;
        }
        this.f42334a = L;
        return AbstractJsonLexerKt.a(T.charAt(L));
    }

    public int L() {
        int i2;
        int i3 = this.f42334a;
        if (i3 == -1) {
            return i3;
        }
        String T = D();
        while (i3 < T.length()) {
            char charAt = T.charAt(i3);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != '/' || (i2 = i3 + 1) >= T.length()) {
                    break;
                }
                char charAt2 = T.charAt(i2);
                if (charAt2 == '*') {
                    int j0 = StringsKt.j0(T, "*/", i3 + 2, false, 4, (Object) null);
                    if (j0 != -1) {
                        i3 = j0 + 2;
                    } else {
                        this.f42334a = T.length();
                        AbstractJsonLexer.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else if (charAt2 != '/') {
                    break;
                } else {
                    i3 = StringsKt.i0(T, 10, i3 + 2, false, 4, (Object) null);
                    if (i3 == -1) {
                        i3 = T.length();
                    }
                }
            }
            i3++;
        }
        this.f42334a = i3;
        return i3;
    }

    public boolean e() {
        int L = L();
        if (L >= D().length() || L == -1) {
            return false;
        }
        return F(D().charAt(L));
    }

    public byte j() {
        String T = D();
        int L = L();
        if (L >= T.length() || L == -1) {
            return 10;
        }
        this.f42334a = L + 1;
        return AbstractJsonLexerKt.a(T.charAt(L));
    }

    public void l(char c2) {
        String T = D();
        int L = L();
        if (L >= T.length() || L == -1) {
            this.f42334a = -1;
            R(c2);
        }
        char charAt = T.charAt(L);
        this.f42334a = L + 1;
        if (charAt != c2) {
            R(c2);
        }
    }
}
