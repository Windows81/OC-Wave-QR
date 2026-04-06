package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GetTopicsRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f22749a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22750b;

    @Metadata
    public static final class Builder {
    }

    public final String a() {
        return this.f22749a;
    }

    public final boolean b() {
        return this.f22750b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return Intrinsics.d(this.f22749a, getTopicsRequest.f22749a) && this.f22750b == getTopicsRequest.f22750b;
    }

    public int hashCode() {
        return (this.f22749a.hashCode() * 31) + Boolean.hashCode(this.f22750b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f22749a + ", shouldRecordObservation=" + this.f22750b;
    }
}
