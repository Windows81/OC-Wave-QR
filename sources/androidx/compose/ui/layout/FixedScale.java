package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class FixedScale implements ContentScale {

    /* renamed from: b  reason: collision with root package name */
    public final float f17039b;

    public FixedScale(float f2) {
        this.f17039b = f2;
    }

    public long a(long j2, long j3) {
        float f2 = this.f17039b;
        return ScaleFactor.a((((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.f17039b, ((FixedScale) obj).f17039b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f17039b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f17039b + ')';
    }
}
