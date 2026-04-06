package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdId {

    /* renamed from: a  reason: collision with root package name */
    public final String f22668a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22669b;

    public AdId(String str, boolean z2) {
        Intrinsics.i(str, "adId");
        this.f22668a = str;
        this.f22669b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return Intrinsics.d(this.f22668a, adId.f22668a) && this.f22669b == adId.f22669b;
    }

    public int hashCode() {
        return (this.f22668a.hashCode() * 31) + Boolean.hashCode(this.f22669b);
    }

    public String toString() {
        return "AdId: adId=" + this.f22668a + ", isLimitAdTrackingEnabled=" + this.f22669b;
    }
}
