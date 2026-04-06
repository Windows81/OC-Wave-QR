package androidx.core.location;

import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class LocationRequestCompat {

    /* renamed from: a  reason: collision with root package name */
    public final int f19890a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19891b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19892c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19893d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19894e;

    /* renamed from: f  reason: collision with root package name */
    public final float f19895f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19896g;

    public static class Api19Impl {
    }

    public static class Api31Impl {
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.f19890a == locationRequestCompat.f19890a && this.f19891b == locationRequestCompat.f19891b && this.f19892c == locationRequestCompat.f19892c && this.f19893d == locationRequestCompat.f19893d && this.f19894e == locationRequestCompat.f19894e && Float.compare(locationRequestCompat.f19895f, this.f19895f) == 0 && this.f19896g == locationRequestCompat.f19896g;
    }

    public int hashCode() {
        long j2 = this.f19891b;
        long j3 = this.f19892c;
        return (((this.f19890a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f19891b != Long.MAX_VALUE) {
            sb.append("@");
            TimeUtils.e(this.f19891b, sb);
            int i2 = this.f19890a;
            if (i2 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i2 == 102) {
                sb.append(" BALANCED");
            } else if (i2 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f19893d != Long.MAX_VALUE) {
            sb.append(", duration=");
            TimeUtils.e(this.f19893d, sb);
        }
        if (this.f19894e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f19894e);
        }
        long j2 = this.f19892c;
        if (j2 != -1 && j2 < this.f19891b) {
            sb.append(", minUpdateInterval=");
            TimeUtils.e(this.f19892c, sb);
        }
        if (((double) this.f19895f) > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f19895f);
        }
        if (this.f19896g / 2 > this.f19891b) {
            sb.append(", maxUpdateDelay=");
            TimeUtils.e(this.f19896g, sb);
        }
        sb.append(']');
        return sb.toString();
    }
}
