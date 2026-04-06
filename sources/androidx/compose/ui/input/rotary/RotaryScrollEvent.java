package androidx.compose.ui.input.rotary;

import kotlin.Metadata;

@Metadata
public final class RotaryScrollEvent {

    /* renamed from: a  reason: collision with root package name */
    public final float f16982a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16983b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16984c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16985d;

    public RotaryScrollEvent(float f2, float f3, long j2, int i2) {
        this.f16982a = f2;
        this.f16983b = f3;
        this.f16984c = j2;
        this.f16985d = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RotaryScrollEvent) {
            RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
            return rotaryScrollEvent.f16982a == this.f16982a && rotaryScrollEvent.f16983b == this.f16983b && rotaryScrollEvent.f16984c == this.f16984c && rotaryScrollEvent.f16985d == this.f16985d;
        }
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f16982a) * 31) + Float.hashCode(this.f16983b)) * 31) + Long.hashCode(this.f16984c)) * 31) + Integer.hashCode(this.f16985d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f16982a + ",horizontalScrollPixels=" + this.f16983b + ",uptimeMillis=" + this.f16984c + ",deviceId=" + this.f16985d + ')';
    }
}
