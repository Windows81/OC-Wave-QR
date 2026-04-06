package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyLayoutNearestRangeState implements State<IntRange> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final int f4892A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableState f4893B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f4894z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange b(int i2, int i3, int i4) {
            int i5 = (i2 / i3) * i3;
            return RangesKt.v(Math.max(i5 - i4, 0), i5 + i3 + i4);
        }

        public Companion() {
        }
    }

    public LazyLayoutNearestRangeState(int i2, int i3, int i4) {
        this.f4894z = i3;
        this.f4892A = i4;
        this.f4893B = SnapshotStateKt.i(D.b(i2, i3, i4), SnapshotStateKt.r());
        this.C = i2;
    }

    /* renamed from: g */
    public IntRange getValue() {
        return (IntRange) this.f4893B.getValue();
    }

    public final void h(IntRange intRange) {
        this.f4893B.setValue(intRange);
    }

    public final void i(int i2) {
        if (i2 != this.C) {
            this.C = i2;
            h(D.b(i2, this.f4894z, this.f4892A));
        }
    }
}
