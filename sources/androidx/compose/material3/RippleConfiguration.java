package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RippleConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final long f10733a;

    /* renamed from: b  reason: collision with root package name */
    public final RippleAlpha f10734b;

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, rippleAlpha);
    }

    public final long a() {
        return this.f10733a;
    }

    public final RippleAlpha b() {
        return this.f10734b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.n(this.f10733a, rippleConfiguration.f10733a) && Intrinsics.d(this.f10734b, rippleConfiguration.f10734b);
    }

    public int hashCode() {
        int t2 = Color.t(this.f10733a) * 31;
        RippleAlpha rippleAlpha = this.f10734b;
        return t2 + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + Color.u(this.f10733a) + ", rippleAlpha=" + this.f10734b + ')';
    }

    public RippleConfiguration(long j2, RippleAlpha rippleAlpha) {
        this.f10733a = j2;
        this.f10734b = rippleAlpha;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.f15975b.f() : j2, (i2 & 2) != 0 ? null : rippleAlpha, (DefaultConstructorMarker) null);
    }
}
