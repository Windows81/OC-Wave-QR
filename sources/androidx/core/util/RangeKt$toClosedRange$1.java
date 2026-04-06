package androidx.core.util;

import android.util.Range;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;

@Metadata
public final class RangeKt$toClosedRange$1 implements ClosedRange<Comparable<Object>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Range f20169z;

    public Comparable e() {
        return this.f20169z.getLower();
    }

    public boolean isEmpty() {
        return ClosedRange.DefaultImpls.a(this);
    }

    public Comparable m() {
        return this.f20169z.getUpper();
    }
}
