package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public final class Escapers {

    /* renamed from: a  reason: collision with root package name */
    public static final Escaper f28699a = new CharEscaper() {
        public String a(String str) {
            return (String) Preconditions.q(str);
        }

        public char[] b(char c2) {
            return null;
        }
    };

    /* renamed from: com.google.common.escape.Escapers$2  reason: invalid class name */
    class AnonymousClass2 extends UnicodeEscaper {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CharEscaper f28700b;

        public char[] c(int i2) {
            if (i2 < 65536) {
                return this.f28700b.b((char) i2);
            }
            char[] cArr = new char[2];
            Character.toChars(i2, cArr, 0);
            char[] b2 = this.f28700b.b(cArr[0]);
            char[] b3 = this.f28700b.b(cArr[1]);
            if (b2 == null && b3 == null) {
                return null;
            }
            int length = b2 != null ? b2.length : 1;
            char[] cArr2 = new char[((b3 != null ? b3.length : 1) + length)];
            if (b2 != null) {
                for (int i3 = 0; i3 < b2.length; i3++) {
                    cArr2[i3] = b2[i3];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (b3 != null) {
                for (int i4 = 0; i4 < b3.length; i4++) {
                    cArr2[length + i4] = b3[i4];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Map f28701a;

        /* renamed from: b  reason: collision with root package name */
        public char f28702b;

        /* renamed from: c  reason: collision with root package name */
        public char f28703c;

        /* renamed from: d  reason: collision with root package name */
        public String f28704d;

        public Builder b(char c2, String str) {
            Preconditions.q(str);
            this.f28701a.put(Character.valueOf(c2), str);
            return this;
        }

        public Escaper c() {
            return new ArrayBasedCharEscaper(this.f28701a, this.f28702b, this.f28703c) {

                /* renamed from: f  reason: collision with root package name */
                public final char[] f28705f;

                {
                    this.f28705f = Builder.this.f28704d != null ? Builder.this.f28704d.toCharArray() : null;
                }

                public char[] e(char c2) {
                    return this.f28705f;
                }
            };
        }

        public Builder d(char c2, char c3) {
            this.f28702b = c2;
            this.f28703c = c3;
            return this;
        }

        public Builder e(String str) {
            this.f28704d = str;
            return this;
        }

        public Builder() {
            this.f28701a = new HashMap();
            this.f28702b = 0;
            this.f28703c = 65535;
            this.f28704d = null;
        }
    }

    public static Builder a() {
        return new Builder();
    }
}
