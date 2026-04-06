package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.text.StringsKt;

@Metadata
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    public byte H() {
        u();
        ArrayAsSequence T = D();
        int L = L();
        if (L >= T.length() || L == -1) {
            return 10;
        }
        this.f42334a = L;
        return AbstractJsonLexerKt.a(T.charAt(L));
    }

    public int L() {
        int J;
        int i2 = this.f42334a;
        while (true) {
            J = J(i2);
            if (J != -1) {
                char charAt = D().charAt(J);
                if (charAt != ' ' && charAt != 10 && charAt != 13 && charAt != 9) {
                    if (charAt != '/' || J + 1 >= D().length()) {
                        break;
                    }
                    Pair W = W(J);
                    int intValue = ((Number) W.a()).intValue();
                    if (!((Boolean) W.b()).booleanValue()) {
                        J = intValue;
                        break;
                    }
                    i2 = intValue;
                } else {
                    i2 = J + 1;
                }
            } else {
                break;
            }
        }
        this.f42334a = J;
        return J;
    }

    public final Pair W(int i2) {
        int i3 = i2 + 2;
        char charAt = D().charAt(i2 + 1);
        if (charAt == '*') {
            boolean z2 = false;
            int i4 = i3;
            while (i2 != -1) {
                int j0 = StringsKt.j0(D(), "*/", i4, false, 4, (Object) null);
                if (j0 != -1) {
                    return TuplesKt.a(Integer.valueOf(j0 + 2), Boolean.TRUE);
                }
                if (D().charAt(D().length() - 1) == '*') {
                    i4 = X(D().length() - 1);
                    if (z2) {
                        break;
                    }
                    z2 = true;
                } else {
                    i4 = J(D().length());
                }
                i2 = i4;
            }
            this.f42334a = D().length();
            AbstractJsonLexer.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        } else if (charAt != '/') {
            return TuplesKt.a(Integer.valueOf(i2), Boolean.FALSE);
        } else {
            int i5 = i3;
            while (i2 != -1) {
                int i0 = StringsKt.i0(D(), 10, i5, false, 4, (Object) null);
                if (i0 != -1) {
                    return TuplesKt.a(Integer.valueOf(i0 + 1), Boolean.TRUE);
                }
                i5 = J(D().length());
                i2 = i5;
            }
            return TuplesKt.a(-1, Boolean.TRUE);
        }
    }

    public final int X(int i2) {
        if (D().length() - i2 > this.f42432f) {
            return i2;
        }
        this.f42334a = i2;
        u();
        return (this.f42334a != 0 || D().length() == 0) ? -1 : 0;
    }

    public boolean e() {
        u();
        int L = L();
        if (L >= D().length() || L == -1) {
            return false;
        }
        return F(D().charAt(L));
    }

    public byte j() {
        u();
        ArrayAsSequence T = D();
        int L = L();
        if (L >= T.length() || L == -1) {
            return 10;
        }
        this.f42334a = L + 1;
        return AbstractJsonLexerKt.a(T.charAt(L));
    }

    public void l(char c2) {
        u();
        ArrayAsSequence T = D();
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
