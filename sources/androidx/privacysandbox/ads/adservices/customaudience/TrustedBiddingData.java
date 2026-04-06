package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TrustedBiddingData {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f22708a;

    /* renamed from: b  reason: collision with root package name */
    public final List f22709b;

    public final List a() {
        return this.f22709b;
    }

    public final Uri b() {
        return this.f22708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        return Intrinsics.d(this.f22708a, trustedBiddingData.f22708a) && Intrinsics.d(this.f22709b, trustedBiddingData.f22709b);
    }

    public int hashCode() {
        return (this.f22708a.hashCode() * 31) + this.f22709b.hashCode();
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.f22708a + " trustedBiddingKeys=" + this.f22709b;
    }
}
