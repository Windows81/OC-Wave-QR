package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

@Metadata
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Comparable f40955A;

    /* renamed from: z  reason: collision with root package name */
    public final Comparable f40956z;

    public Comparable e() {
        return this.f40956z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableRange) {
            if (!isEmpty() || !((ComparableRange) obj).isEmpty()) {
                ComparableRange comparableRange = (ComparableRange) obj;
                if (!Intrinsics.d(e(), comparableRange.e()) || !Intrinsics.d(m(), comparableRange.m())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e().hashCode() * 31) + m().hashCode();
    }

    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.a(this);
    }

    public Comparable m() {
        return this.f40955A;
    }

    public String toString() {
        return e() + ".." + m();
    }
}
