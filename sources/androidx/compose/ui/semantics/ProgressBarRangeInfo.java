package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class ProgressBarRangeInfo {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f18035d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final ProgressBarRangeInfo f18036e = new ProgressBarRangeInfo(0.0f, RangesKt.b(0.0f, 0.0f), 0, 4, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float f18037a;

    /* renamed from: b  reason: collision with root package name */
    public final ClosedFloatingPointRange f18038b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18039c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBarRangeInfo a() {
            return ProgressBarRangeInfo.f18036e;
        }

        public Companion() {
        }
    }

    public ProgressBarRangeInfo(float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2) {
        this.f18037a = f2;
        this.f18038b = closedFloatingPointRange;
        this.f18039c = i2;
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f18037a;
    }

    public final ClosedFloatingPointRange c() {
        return this.f18038b;
    }

    public final int d() {
        return this.f18039c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.f18037a == progressBarRangeInfo.f18037a && Intrinsics.d(this.f18038b, progressBarRangeInfo.f18038b) && this.f18039c == progressBarRangeInfo.f18039c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f18037a) * 31) + this.f18038b.hashCode()) * 31) + this.f18039c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f18037a + ", range=" + this.f18038b + ", steps=" + this.f18039c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressBarRangeInfo(float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, closedFloatingPointRange, (i3 & 4) != 0 ? 0 : i2);
    }
}
