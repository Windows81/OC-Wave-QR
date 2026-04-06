package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;

@Metadata
public final class DataPointAtTime {

    /* renamed from: a  reason: collision with root package name */
    public long f16957a;

    /* renamed from: b  reason: collision with root package name */
    public float f16958b;

    public DataPointAtTime(long j2, float f2) {
        this.f16957a = j2;
        this.f16958b = f2;
    }

    public final float a() {
        return this.f16958b;
    }

    public final long b() {
        return this.f16957a;
    }

    public final void c(float f2) {
        this.f16958b = f2;
    }

    public final void d(long j2) {
        this.f16957a = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.f16957a == dataPointAtTime.f16957a && Float.compare(this.f16958b, dataPointAtTime.f16958b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f16957a) * 31) + Float.hashCode(this.f16958b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f16957a + ", dataPoint=" + this.f16958b + ')';
    }
}
