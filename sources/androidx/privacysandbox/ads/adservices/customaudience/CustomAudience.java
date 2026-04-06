package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CustomAudience {

    /* renamed from: a  reason: collision with root package name */
    public final AdTechIdentifier f22694a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22695b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f22696c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f22697d;

    /* renamed from: e  reason: collision with root package name */
    public final List f22698e;

    /* renamed from: f  reason: collision with root package name */
    public final Instant f22699f;

    /* renamed from: g  reason: collision with root package name */
    public final Instant f22700g;

    /* renamed from: h  reason: collision with root package name */
    public final AdSelectionSignals f22701h;

    /* renamed from: i  reason: collision with root package name */
    public final TrustedBiddingData f22702i;

    @Metadata
    public static final class Builder {
    }

    public final Instant a() {
        return this.f22699f;
    }

    public final List b() {
        return this.f22698e;
    }

    public final Uri c() {
        return this.f22697d;
    }

    public final AdTechIdentifier d() {
        return this.f22694a;
    }

    public final Uri e() {
        return this.f22696c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return Intrinsics.d(this.f22694a, customAudience.f22694a) && Intrinsics.d(this.f22695b, customAudience.f22695b) && Intrinsics.d(this.f22699f, customAudience.f22699f) && Intrinsics.d(this.f22700g, customAudience.f22700g) && Intrinsics.d(this.f22696c, customAudience.f22696c) && Intrinsics.d(this.f22701h, customAudience.f22701h) && Intrinsics.d(this.f22702i, customAudience.f22702i) && Intrinsics.d(this.f22698e, customAudience.f22698e);
    }

    public final Instant f() {
        return this.f22700g;
    }

    public final String g() {
        return this.f22695b;
    }

    public final TrustedBiddingData h() {
        return this.f22702i;
    }

    public int hashCode() {
        int hashCode = ((this.f22694a.hashCode() * 31) + this.f22695b.hashCode()) * 31;
        Instant instant = this.f22699f;
        int i2 = 0;
        int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f22700g;
        int hashCode3 = (((hashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.f22696c.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.f22701h;
        int hashCode4 = (hashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.f22702i;
        if (trustedBiddingData != null) {
            i2 = trustedBiddingData.hashCode();
        }
        return ((((hashCode4 + i2) * 31) + this.f22697d.hashCode()) * 31) + this.f22698e.hashCode();
    }

    public final AdSelectionSignals i() {
        return this.f22701h;
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.f22697d + ", activationTime=" + this.f22699f + ", expirationTime=" + this.f22700g + ", dailyUpdateUri=" + this.f22696c + ", userBiddingSignals=" + this.f22701h + ", trustedBiddingSignals=" + this.f22702i + ", biddingLogicUri=" + this.f22697d + ", ads=" + this.f22698e;
    }
}
