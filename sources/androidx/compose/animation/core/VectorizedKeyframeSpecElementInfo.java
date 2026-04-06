package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationVector f2829a;

    /* renamed from: b  reason: collision with root package name */
    public final Easing f2830b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2831c;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationVector, easing, i2);
    }

    public final int a() {
        return this.f2831c;
    }

    public final Easing b() {
        return this.f2830b;
    }

    public final AnimationVector c() {
        return this.f2829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return Intrinsics.d(this.f2829a, vectorizedKeyframeSpecElementInfo.f2829a) && Intrinsics.d(this.f2830b, vectorizedKeyframeSpecElementInfo.f2830b) && ArcMode.d(this.f2831c, vectorizedKeyframeSpecElementInfo.f2831c);
    }

    public int hashCode() {
        return (((this.f2829a.hashCode() * 31) + this.f2830b.hashCode()) * 31) + ArcMode.e(this.f2831c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f2829a + ", easing=" + this.f2830b + ", arcMode=" + ArcMode.f(this.f2831c) + ')';
    }

    public VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i2) {
        this.f2829a = animationVector;
        this.f2830b = easing;
        this.f2831c = i2;
    }
}
