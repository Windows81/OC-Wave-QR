package com.google.common.base;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Equivalence f27712A;

    /* renamed from: z  reason: collision with root package name */
    public final Function f27713z;

    public boolean a(Object obj, Object obj2) {
        return this.f27712A.d(this.f27713z.apply(obj), this.f27713z.apply(obj2));
    }

    public int b(Object obj) {
        return this.f27712A.e(this.f27713z.apply(obj));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        return this.f27713z.equals(functionalEquivalence.f27713z) && this.f27712A.equals(functionalEquivalence.f27712A);
    }

    public int hashCode() {
        return Objects.b(this.f27713z, this.f27712A);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27712A);
        String valueOf2 = String.valueOf(this.f27713z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
