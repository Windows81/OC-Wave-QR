package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Ordering f28018A;

    /* renamed from: z  reason: collision with root package name */
    public final Function f28019z;

    public ByFunctionOrdering(Function function, Ordering ordering) {
        this.f28019z = (Function) Preconditions.q(function);
        this.f28018A = (Ordering) Preconditions.q(ordering);
    }

    public int compare(Object obj, Object obj2) {
        return this.f28018A.compare(this.f28019z.apply(obj), this.f28019z.apply(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.f28019z.equals(byFunctionOrdering.f28019z) && this.f28018A.equals(byFunctionOrdering.f28018A);
    }

    public int hashCode() {
        return Objects.b(this.f28019z, this.f28018A);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28018A);
        String valueOf2 = String.valueOf(this.f28019z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
