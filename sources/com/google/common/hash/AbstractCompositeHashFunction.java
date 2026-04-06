package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractCompositeHashFunction extends AbstractHashFunction {

    /* renamed from: z  reason: collision with root package name */
    public final HashFunction[] f28830z;

    public Hasher a() {
        int length = this.f28830z.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.f28830z[i2].a();
        }
        return d(hasherArr);
    }

    public final Hasher d(final Hasher[] hasherArr) {
        return new Hasher() {
            public Hasher h(Object obj, Funnel funnel) {
                for (Hasher h2 : hasherArr) {
                    h2.h(obj, funnel);
                }
                return this;
            }

            public HashCode i() {
                return AbstractCompositeHashFunction.this.e(hasherArr);
            }

            public Hasher a(byte[] bArr) {
                for (Hasher a2 : hasherArr) {
                    a2.a(bArr);
                }
                return this;
            }

            public Hasher b(byte b2) {
                for (Hasher b3 : hasherArr) {
                    b3.b(b2);
                }
                return this;
            }

            public Hasher c(CharSequence charSequence) {
                for (Hasher c2 : hasherArr) {
                    c2.c(charSequence);
                }
                return this;
            }

            public Hasher d(byte[] bArr, int i2, int i3) {
                for (Hasher d2 : hasherArr) {
                    d2.d(bArr, i2, i3);
                }
                return this;
            }

            public Hasher e(int i2) {
                for (Hasher e2 : hasherArr) {
                    e2.e(i2);
                }
                return this;
            }

            public Hasher f(CharSequence charSequence, Charset charset) {
                for (Hasher f2 : hasherArr) {
                    f2.f(charSequence, charset);
                }
                return this;
            }

            public Hasher g(long j2) {
                for (Hasher g2 : hasherArr) {
                    g2.g(j2);
                }
                return this;
            }
        };
    }

    public abstract HashCode e(Hasher[] hasherArr);
}
