package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

final class AutoValue_NetworkConnectionInfo extends NetworkConnectionInfo {

    /* renamed from: a  reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f23974a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f23975b;

    public static final class Builder extends NetworkConnectionInfo.Builder {

        /* renamed from: a  reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f23976a;

        /* renamed from: b  reason: collision with root package name */
        public NetworkConnectionInfo.MobileSubtype f23977b;

        public NetworkConnectionInfo a() {
            return new AutoValue_NetworkConnectionInfo(this.f23976a, this.f23977b);
        }

        public NetworkConnectionInfo.Builder b(NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f23977b = mobileSubtype;
            return this;
        }

        public NetworkConnectionInfo.Builder c(NetworkConnectionInfo.NetworkType networkType) {
            this.f23976a = networkType;
            return this;
        }
    }

    public NetworkConnectionInfo.MobileSubtype b() {
        return this.f23975b;
    }

    public NetworkConnectionInfo.NetworkType c() {
        return this.f23974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f23974a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.c()) : networkConnectionInfo.c() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f23975b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.b() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f23974a;
        int i2 = 0;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f23975b;
        if (mobileSubtype != null) {
            i2 = mobileSubtype.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f23974a + ", mobileSubtype=" + this.f23975b + "}";
    }

    public AutoValue_NetworkConnectionInfo(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f23974a = networkType;
        this.f23975b = mobileSubtype;
    }
}
