package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RippleConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final long f8239a;

    /* renamed from: b  reason: collision with root package name */
    public final RippleAlpha f8240b;

    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, rippleAlpha);
    }

    public final long a() {
        return this.f8239a;
    }

    public final RippleAlpha b() {
        return this.f8240b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.n(this.f8239a, rippleConfiguration.f8239a) && Intrinsics.d(this.f8240b, rippleConfiguration.f8240b);
    }

    public int hashCode() {
        int t2 = Color.t(this.f8239a) * 31;
        RippleAlpha rippleAlpha = this.f8240b;
        return t2 + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + Color.u(this.f8239a) + ", rippleAlpha=" + this.f8240b + ')';
    }

    public RippleConfiguration(long j2, RippleAlpha rippleAlpha) {
        this.f8239a = j2;
        this.f8240b = rippleAlpha;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RippleConfiguration(long j2, RippleAlpha rippleAlpha, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.f15975b.f() : j2, (i2 & 2) != 0 ? null : rippleAlpha, (DefaultConstructorMarker) null);
    }
}
