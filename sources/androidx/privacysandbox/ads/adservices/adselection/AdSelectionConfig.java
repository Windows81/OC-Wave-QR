package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdSelectionConfig {

    /* renamed from: a  reason: collision with root package name */
    public final AdTechIdentifier f22672a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f22673b;

    /* renamed from: c  reason: collision with root package name */
    public final List f22674c;

    /* renamed from: d  reason: collision with root package name */
    public final AdSelectionSignals f22675d;

    /* renamed from: e  reason: collision with root package name */
    public final AdSelectionSignals f22676e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f22677f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f22678g;

    public final AdSelectionSignals a() {
        return this.f22675d;
    }

    public final List b() {
        return this.f22674c;
    }

    public final Uri c() {
        return this.f22673b;
    }

    public final Map d() {
        return this.f22677f;
    }

    public final AdTechIdentifier e() {
        return this.f22672a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return Intrinsics.d(this.f22672a, adSelectionConfig.f22672a) && Intrinsics.d(this.f22673b, adSelectionConfig.f22673b) && Intrinsics.d(this.f22674c, adSelectionConfig.f22674c) && Intrinsics.d(this.f22675d, adSelectionConfig.f22675d) && Intrinsics.d(this.f22676e, adSelectionConfig.f22676e) && Intrinsics.d(this.f22677f, adSelectionConfig.f22677f) && Intrinsics.d(this.f22678g, adSelectionConfig.f22678g);
    }

    public final AdSelectionSignals f() {
        return this.f22676e;
    }

    public final Uri g() {
        return this.f22678g;
    }

    public int hashCode() {
        return (((((((((((this.f22672a.hashCode() * 31) + this.f22673b.hashCode()) * 31) + this.f22674c.hashCode()) * 31) + this.f22675d.hashCode()) * 31) + this.f22676e.hashCode()) * 31) + this.f22677f.hashCode()) * 31) + this.f22678g.hashCode();
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.f22672a + ", decisionLogicUri='" + this.f22673b + "', customAudienceBuyers=" + this.f22674c + ", adSelectionSignals=" + this.f22675d + ", sellerSignals=" + this.f22676e + ", perBuyerSignals=" + this.f22677f + ", trustedScoringSignalsUri=" + this.f22678g;
    }
}
