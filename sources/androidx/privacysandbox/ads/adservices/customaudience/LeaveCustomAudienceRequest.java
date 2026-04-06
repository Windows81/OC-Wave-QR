package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LeaveCustomAudienceRequest {

    /* renamed from: a  reason: collision with root package name */
    public final AdTechIdentifier f22706a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22707b;

    public final AdTechIdentifier a() {
        return this.f22706a;
    }

    public final String b() {
        return this.f22707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) obj;
        return Intrinsics.d(this.f22706a, leaveCustomAudienceRequest.f22706a) && Intrinsics.d(this.f22707b, leaveCustomAudienceRequest.f22707b);
    }

    public int hashCode() {
        return (this.f22706a.hashCode() * 31) + this.f22707b.hashCode();
    }

    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.f22706a + ", name=" + this.f22707b;
    }
}
