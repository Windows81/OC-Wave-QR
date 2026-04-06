package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class HistoricalChange {

    /* renamed from: a  reason: collision with root package name */
    public final long f16806a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16807b;

    /* renamed from: c  reason: collision with root package name */
    public long f16808c;

    public /* synthetic */ HistoricalChange(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public final long a() {
        return this.f16808c;
    }

    public final long b() {
        return this.f16807b;
    }

    public final long c() {
        return this.f16806a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f16806a + ", position=" + Offset.s(this.f16807b) + ')';
    }

    public /* synthetic */ HistoricalChange(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public HistoricalChange(long j2, long j3) {
        this.f16806a = j2;
        this.f16807b = j3;
        this.f16808c = Offset.f15855b.c();
    }

    public HistoricalChange(long j2, long j3, long j4) {
        this(j2, j3, (DefaultConstructorMarker) null);
        this.f16808c = j4;
    }
}
