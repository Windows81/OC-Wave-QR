package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

final class AutoValue_ClientInfo extends ClientInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ClientInfo.ClientType f23925a;

    /* renamed from: b  reason: collision with root package name */
    public final AndroidClientInfo f23926b;

    public static final class Builder extends ClientInfo.Builder {

        /* renamed from: a  reason: collision with root package name */
        public ClientInfo.ClientType f23927a;

        /* renamed from: b  reason: collision with root package name */
        public AndroidClientInfo f23928b;

        public ClientInfo a() {
            return new AutoValue_ClientInfo(this.f23927a, this.f23928b);
        }

        public ClientInfo.Builder b(AndroidClientInfo androidClientInfo) {
            this.f23928b = androidClientInfo;
            return this;
        }

        public ClientInfo.Builder c(ClientInfo.ClientType clientType) {
            this.f23927a = clientType;
            return this;
        }
    }

    public AndroidClientInfo b() {
        return this.f23926b;
    }

    public ClientInfo.ClientType c() {
        return this.f23925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f23925a;
        if (clientType != null ? clientType.equals(clientInfo.c()) : clientInfo.c() == null) {
            AndroidClientInfo androidClientInfo = this.f23926b;
            if (androidClientInfo == null) {
                if (clientInfo.b() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.f23925a;
        int i2 = 0;
        int hashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f23926b;
        if (androidClientInfo != null) {
            i2 = androidClientInfo.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f23925a + ", androidClientInfo=" + this.f23926b + "}";
    }

    public AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f23925a = clientType;
        this.f23926b = androidClientInfo;
    }
}
