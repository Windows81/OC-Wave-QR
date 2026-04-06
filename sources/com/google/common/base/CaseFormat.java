package com.google.common.base;

import java.io.Serializable;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public enum CaseFormat {
    LOWER_HYPHEN(CharMatcher.k('-'), "-") {
        public String h(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_UNDERSCORE ? str.replace('-', '_') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.e(str.replace('-', '_')) : CaseFormat.super.h(caseFormat, str);
        }

        public String l(String str) {
            return Ascii.c(str);
        }
    },
    LOWER_UNDERSCORE(CharMatcher.k('_'), "_") {
        public String h(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? str.replace('_', '-') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.e(str) : CaseFormat.super.h(caseFormat, str);
        }

        public String l(String str) {
            return Ascii.c(str);
        }
    },
    LOWER_CAMEL(CharMatcher.h('A', 'Z'), "") {
        public String k(String str) {
            return Ascii.c(str);
        }

        public String l(String str) {
            return CaseFormat.j(str);
        }
    },
    UPPER_CAMEL(CharMatcher.h('A', 'Z'), "") {
        public String l(String str) {
            return CaseFormat.j(str);
        }
    },
    UPPER_UNDERSCORE(CharMatcher.k('_'), "_") {
        public String h(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? Ascii.c(str.replace('_', '-')) : caseFormat == CaseFormat.LOWER_UNDERSCORE ? Ascii.c(str) : CaseFormat.super.h(caseFormat, str);
        }

        public String l(String str) {
            return Ascii.e(str);
        }
    };
    

    /* renamed from: A  reason: collision with root package name */
    public final String f27646A;

    /* renamed from: z  reason: collision with root package name */
    public final CharMatcher f27647z;

    public static final class StringConverter extends Converter<String, String> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final CaseFormat f27648A;

        /* renamed from: B  reason: collision with root package name */
        public final CaseFormat f27649B;

        public boolean equals(Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) obj;
            return this.f27648A.equals(stringConverter.f27648A) && this.f27649B.equals(stringConverter.f27649B);
        }

        /* renamed from: h */
        public String d(String str) {
            return this.f27649B.m(this.f27648A, str);
        }

        public int hashCode() {
            return this.f27648A.hashCode() ^ this.f27649B.hashCode();
        }

        /* renamed from: i */
        public String e(String str) {
            return this.f27648A.m(this.f27649B, str);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f27648A);
            String valueOf2 = String.valueOf(this.f27649B);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static String j(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char d2 = Ascii.d(str.charAt(0));
        String c2 = Ascii.c(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 1);
        sb.append(d2);
        sb.append(c2);
        return sb.toString();
    }

    public String h(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            i3 = this.f27647z.j(str, i3 + 1);
            if (i3 == -1) {
                break;
            }
            if (i2 == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.f27646A.length() * 4));
                sb.append(caseFormat.k(str.substring(i2, i3)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.l(str.substring(i2, i3)));
            }
            sb.append(caseFormat.f27646A);
            i2 = this.f27646A.length() + i3;
        }
        if (i2 == 0) {
            return caseFormat.k(str);
        }
        Objects.requireNonNull(sb);
        sb.append(caseFormat.l(str.substring(i2)));
        return sb.toString();
    }

    public String k(String str) {
        return l(str);
    }

    public abstract String l(String str);

    public final String m(CaseFormat caseFormat, String str) {
        Preconditions.q(caseFormat);
        Preconditions.q(str);
        return caseFormat == this ? str : h(caseFormat, str);
    }

    /* access modifiers changed from: public */
    CaseFormat(CharMatcher charMatcher, String str) {
        this.f27647z = charMatcher;
        this.f27646A = str;
    }
}
