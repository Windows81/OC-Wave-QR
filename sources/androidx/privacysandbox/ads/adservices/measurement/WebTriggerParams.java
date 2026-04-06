package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebTriggerParams {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f22745a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22746b;

    public final boolean a() {
        return this.f22746b;
    }

    public final Uri b() {
        return this.f22745a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerParams)) {
            return false;
        }
        WebTriggerParams webTriggerParams = (WebTriggerParams) obj;
        return Intrinsics.d(this.f22745a, webTriggerParams.f22745a) && this.f22746b == webTriggerParams.f22746b;
    }

    public int hashCode() {
        return (this.f22745a.hashCode() * 31) + Boolean.hashCode(this.f22746b);
    }

    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f22745a + ", DebugKeyAllowed=" + this.f22746b + " }";
    }
}
