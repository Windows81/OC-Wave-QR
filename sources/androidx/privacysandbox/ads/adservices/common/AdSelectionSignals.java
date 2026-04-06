package androidx.privacysandbox.ads.adservices.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdSelectionSignals {

    /* renamed from: a  reason: collision with root package name */
    public final String f22692a;

    public final String a() {
        return this.f22692a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionSignals)) {
            return false;
        }
        return Intrinsics.d(this.f22692a, ((AdSelectionSignals) obj).f22692a);
    }

    public int hashCode() {
        return this.f22692a.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.f22692a;
    }
}
