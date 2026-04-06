package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdSelectionOutcome {

    /* renamed from: a  reason: collision with root package name */
    public final long f22681a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f22682b;

    public AdSelectionOutcome(long j2, Uri uri) {
        Intrinsics.i(uri, "renderUri");
        this.f22681a = j2;
        this.f22682b = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.f22681a == adSelectionOutcome.f22681a && Intrinsics.d(this.f22682b, adSelectionOutcome.f22682b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f22681a) * 31) + this.f22682b.hashCode();
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f22681a + ", renderUri=" + this.f22682b;
    }
}
