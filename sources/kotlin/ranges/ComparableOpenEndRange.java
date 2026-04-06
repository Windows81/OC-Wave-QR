package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.OpenEndRange;

@Metadata
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Comparable f40953A;

    /* renamed from: z  reason: collision with root package name */
    public final Comparable f40954z;

    public boolean a() {
        return OpenEndRange.DefaultImpls.a(this);
    }

    public Comparable e() {
        return this.f40954z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableOpenEndRange) {
            if (!a() || !((ComparableOpenEndRange) obj).a()) {
                ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) obj;
                if (!Intrinsics.d(e(), comparableOpenEndRange.e()) || !Intrinsics.d(h(), comparableOpenEndRange.h())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Comparable h() {
        return this.f40953A;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (e().hashCode() * 31) + h().hashCode();
    }

    public String toString() {
        return e() + "..<" + h();
    }
}
