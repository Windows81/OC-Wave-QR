package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebTriggerRegistrationRequest {

    /* renamed from: a  reason: collision with root package name */
    public final List f22747a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f22748b;

    public final Uri a() {
        return this.f22748b;
    }

    public final List b() {
        return this.f22747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return Intrinsics.d(this.f22747a, webTriggerRegistrationRequest.f22747a) && Intrinsics.d(this.f22748b, webTriggerRegistrationRequest.f22748b);
    }

    public int hashCode() {
        return (this.f22747a.hashCode() * 31) + this.f22748b.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f22747a + ", Destination=" + this.f22748b;
    }
}
