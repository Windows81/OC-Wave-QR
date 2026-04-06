package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f28112A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f28113B;
    public final BoundType C;
    public final boolean D;
    public final Object E;
    public final BoundType F;

    /* renamed from: z  reason: collision with root package name */
    public final Comparator f28114z;

    public GeneralRange(Comparator comparator, boolean z2, Object obj, BoundType boundType, boolean z3, Object obj2, BoundType boundType2) {
        this.f28114z = (Comparator) Preconditions.q(comparator);
        this.f28112A = z2;
        this.D = z3;
        this.f28113B = obj;
        this.C = (BoundType) Preconditions.q(boundType);
        this.E = obj2;
        this.F = (BoundType) Preconditions.q(boundType2);
        if (z2) {
            comparator.compare(NullnessCasts.a(obj), NullnessCasts.a(obj));
        }
        if (z3) {
            comparator.compare(NullnessCasts.a(obj2), NullnessCasts.a(obj2));
        }
        if (z2 && z3) {
            int compare = comparator.compare(NullnessCasts.a(obj), NullnessCasts.a(obj2));
            boolean z4 = false;
            Preconditions.l(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.d((boundType == boundType3 && boundType2 == boundType3) ? z4 : true);
            }
        }
    }

    public static GeneralRange c(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, true, obj, boundType, false, (Object) null, BoundType.OPEN);
    }

    public static GeneralRange m(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, false, (Object) null, BoundType.OPEN, true, obj, boundType);
    }

    public Comparator a() {
        return this.f28114z;
    }

    public boolean b(Object obj) {
        return !l(obj) && !k(obj);
    }

    public BoundType d() {
        return this.C;
    }

    public Object e() {
        return this.f28113B;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.f28114z.equals(generalRange.f28114z) && this.f28112A == generalRange.f28112A && this.D == generalRange.D && d().equals(generalRange.d()) && f().equals(generalRange.f()) && Objects.a(e(), generalRange.e()) && Objects.a(g(), generalRange.g());
    }

    public BoundType f() {
        return this.F;
    }

    public Object g() {
        return this.E;
    }

    public boolean h() {
        return this.f28112A;
    }

    public int hashCode() {
        return Objects.b(this.f28114z, e(), d(), g(), f());
    }

    public boolean i() {
        return this.D;
    }

    public GeneralRange j(GeneralRange generalRange) {
        int compare;
        int compare2;
        BoundType boundType;
        BoundType boundType2;
        Object obj;
        int compare3;
        BoundType boundType3;
        Preconditions.q(generalRange);
        Preconditions.d(this.f28114z.equals(generalRange.f28114z));
        boolean z2 = this.f28112A;
        Object e2 = e();
        BoundType d2 = d();
        if (!h()) {
            z2 = generalRange.f28112A;
            e2 = generalRange.e();
            d2 = generalRange.d();
        } else if (generalRange.h() && ((compare = this.f28114z.compare(e(), generalRange.e())) < 0 || (compare == 0 && generalRange.d() == BoundType.OPEN))) {
            e2 = generalRange.e();
            d2 = generalRange.d();
        }
        boolean z3 = z2;
        boolean z4 = this.D;
        Object g2 = g();
        BoundType f2 = f();
        if (!i()) {
            z4 = generalRange.D;
            g2 = generalRange.g();
            f2 = generalRange.f();
        } else if (generalRange.i() && ((compare2 = this.f28114z.compare(g(), generalRange.g())) > 0 || (compare2 == 0 && generalRange.f() == BoundType.OPEN))) {
            g2 = generalRange.g();
            f2 = generalRange.f();
        }
        boolean z5 = z4;
        Object obj2 = g2;
        if (!z3 || !z5 || ((compare3 = this.f28114z.compare(e2, obj2)) <= 0 && !(compare3 == 0 && d2 == (boundType3 = BoundType.OPEN) && f2 == boundType3))) {
            obj = e2;
            boundType2 = d2;
            boundType = f2;
        } else {
            boundType2 = BoundType.OPEN;
            boundType = BoundType.CLOSED;
            obj = obj2;
        }
        return new GeneralRange(this.f28114z, z3, obj, boundType2, z5, obj2, boundType);
    }

    public boolean k(Object obj) {
        boolean z2 = false;
        if (!i()) {
            return false;
        }
        int compare = this.f28114z.compare(obj, NullnessCasts.a(g()));
        boolean z3 = compare > 0;
        boolean z4 = compare == 0;
        if (f() == BoundType.OPEN) {
            z2 = true;
        }
        return (z4 & z2) | z3;
    }

    public boolean l(Object obj) {
        boolean z2 = false;
        if (!h()) {
            return false;
        }
        int compare = this.f28114z.compare(obj, NullnessCasts.a(e()));
        boolean z3 = compare < 0;
        boolean z4 = compare == 0;
        if (d() == BoundType.OPEN) {
            z2 = true;
        }
        return (z4 & z2) | z3;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28114z);
        BoundType boundType = this.C;
        BoundType boundType2 = BoundType.CLOSED;
        char c2 = boundType == boundType2 ? '[' : '(';
        String valueOf2 = String.valueOf(this.f28112A ? this.f28113B : "-∞");
        String valueOf3 = String.valueOf(this.D ? this.E : "∞");
        char c3 = this.F == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(c2);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c3);
        return sb.toString();
    }
}
