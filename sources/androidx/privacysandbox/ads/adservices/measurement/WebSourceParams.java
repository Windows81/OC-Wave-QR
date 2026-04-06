package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebSourceParams {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f22737a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22738b;

    public final boolean a() {
        return this.f22738b;
    }

    public final Uri b() {
        return this.f22737a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceParams)) {
            return false;
        }
        WebSourceParams webSourceParams = (WebSourceParams) obj;
        return Intrinsics.d(this.f22737a, webSourceParams.f22737a) && this.f22738b == webSourceParams.f22738b;
    }

    public int hashCode() {
        return (this.f22737a.hashCode() * 31) + Boolean.hashCode(this.f22738b);
    }

    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f22737a + ", DebugKeyAllowed=" + this.f22738b + " }";
    }
}
