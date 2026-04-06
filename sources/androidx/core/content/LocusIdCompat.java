package androidx.core.content;

import android.content.LocusId;

public final class LocusIdCompat {

    /* renamed from: a  reason: collision with root package name */
    public final String f19698a;

    /* renamed from: b  reason: collision with root package name */
    public final LocusId f19699b;

    public static class Api29Impl {
    }

    public final String a() {
        int length = this.f19698a.length();
        return length + "_chars";
    }

    public LocusId b() {
        return this.f19699b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.f19698a;
        return str == null ? locusIdCompat.f19698a == null : str.equals(locusIdCompat.f19698a);
    }

    public int hashCode() {
        String str = this.f19698a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + a() + "]";
    }
}
