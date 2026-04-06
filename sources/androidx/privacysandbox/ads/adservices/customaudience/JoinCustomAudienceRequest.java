package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JoinCustomAudienceRequest {

    /* renamed from: a  reason: collision with root package name */
    public final CustomAudience f22705a;

    public final CustomAudience a() {
        return this.f22705a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinCustomAudienceRequest)) {
            return false;
        }
        return Intrinsics.d(this.f22705a, ((JoinCustomAudienceRequest) obj).f22705a);
    }

    public int hashCode() {
        return this.f22705a.hashCode();
    }

    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.f22705a;
    }
}
