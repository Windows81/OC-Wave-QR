package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

final class zad {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f24827a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        return Objects.a(((zad) obj).f24827a, this.f24827a);
    }

    public final int hashCode() {
        return Objects.b(this.f24827a);
    }
}
