package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
public final class MatchGroup {

    /* renamed from: a  reason: collision with root package name */
    public final String f41166a;

    /* renamed from: b  reason: collision with root package name */
    public final IntRange f41167b;

    public MatchGroup(String str, IntRange intRange) {
        Intrinsics.i(str, "value");
        Intrinsics.i(intRange, "range");
        this.f41166a = str;
        this.f41167b = intRange;
    }

    public final String a() {
        return this.f41166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.d(this.f41166a, matchGroup.f41166a) && Intrinsics.d(this.f41167b, matchGroup.f41167b);
    }

    public int hashCode() {
        return (this.f41166a.hashCode() * 31) + this.f41167b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f41166a + ", range=" + this.f41167b + ')';
    }
}
