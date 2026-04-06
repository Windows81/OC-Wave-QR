package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PlatformTransferableContent {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3199a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f3200b;

    public PlatformTransferableContent(Uri uri, Bundle bundle) {
        this.f3199a = uri;
        this.f3200b = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTransferableContent)) {
            return false;
        }
        PlatformTransferableContent platformTransferableContent = (PlatformTransferableContent) obj;
        return Intrinsics.d(this.f3199a, platformTransferableContent.f3199a) && Intrinsics.d(this.f3200b, platformTransferableContent.f3200b);
    }

    public int hashCode() {
        Uri uri = this.f3199a;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.f3200b.hashCode();
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f3199a + ", extras=" + this.f3200b + ')';
    }
}
