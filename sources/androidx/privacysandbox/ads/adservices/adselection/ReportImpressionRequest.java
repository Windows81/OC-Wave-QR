package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReportImpressionRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f22683a;

    /* renamed from: b  reason: collision with root package name */
    public final AdSelectionConfig f22684b;

    public final AdSelectionConfig a() {
        return this.f22684b;
    }

    public final long b() {
        return this.f22683a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        return this.f22683a == reportImpressionRequest.f22683a && Intrinsics.d(this.f22684b, reportImpressionRequest.f22684b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f22683a) * 31) + this.f22684b.hashCode();
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.f22683a + ", adSelectionConfig=" + this.f22684b;
    }
}
