package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AdData {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f22690a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22691b;

    public final String a() {
        return this.f22691b;
    }

    public final Uri b() {
        return this.f22690a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return Intrinsics.d(this.f22690a, adData.f22690a) && Intrinsics.d(this.f22691b, adData.f22691b);
    }

    public int hashCode() {
        return (this.f22690a.hashCode() * 31) + this.f22691b.hashCode();
    }

    public String toString() {
        return "AdData: renderUri=" + this.f22690a + ", metadata='" + this.f22691b + '\'';
    }
}
