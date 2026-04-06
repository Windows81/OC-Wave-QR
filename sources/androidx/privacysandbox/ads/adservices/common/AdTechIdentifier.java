package androidx.privacysandbox.ads.adservices.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdTechIdentifier {

    /* renamed from: a  reason: collision with root package name */
    public final String f22693a;

    public final String a() {
        return this.f22693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdTechIdentifier)) {
            return false;
        }
        return Intrinsics.d(this.f22693a, ((AdTechIdentifier) obj).f22693a);
    }

    public int hashCode() {
        return this.f22693a.hashCode();
    }

    public String toString() {
        return String.valueOf(this.f22693a);
    }
}
