package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {

    /* renamed from: b  reason: collision with root package name */
    public final int f5351b;

    public PagerSnapDistanceMaxPages(int i2) {
        this.f5351b = i2;
    }

    public int a(int i2, int i3, float f2, int i4, int i5) {
        long j2 = (long) i2;
        return RangesKt.o(i3, (int) RangesKt.f(j2 - ((long) this.f5351b), 0), (int) RangesKt.k(j2 + ((long) this.f5351b), 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.f5351b == ((PagerSnapDistanceMaxPages) obj).f5351b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f5351b);
    }
}
