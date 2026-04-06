package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class AnimationData {

    /* renamed from: a  reason: collision with root package name */
    public final float f3392a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3393b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3394c;

    public /* synthetic */ AnimationData(float f2, long j2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, j2, f3);
    }

    public final float a() {
        return this.f3394c;
    }

    public final long b() {
        return this.f3393b;
    }

    public final float c() {
        return this.f3392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.f3392a, animationData.f3392a) == 0 && Offset.j(this.f3393b, animationData.f3393b) && Float.compare(this.f3394c, animationData.f3394c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f3392a) * 31) + Offset.o(this.f3393b)) * 31) + Float.hashCode(this.f3394c);
    }

    public String toString() {
        return "AnimationData(zoom=" + this.f3392a + ", offset=" + Offset.s(this.f3393b) + ", degrees=" + this.f3394c + ')';
    }

    public AnimationData(float f2, long j2, float f3) {
        this.f3392a = f2;
        this.f3393b = j2;
        this.f3394c = f3;
    }
}
