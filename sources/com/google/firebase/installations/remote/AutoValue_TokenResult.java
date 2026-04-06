package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

final class AutoValue_TokenResult extends TokenResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f30851a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30852b;

    /* renamed from: c  reason: collision with root package name */
    public final TokenResult.ResponseCode f30853c;

    public static final class Builder extends TokenResult.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f30854a;

        /* renamed from: b  reason: collision with root package name */
        public Long f30855b;

        /* renamed from: c  reason: collision with root package name */
        public TokenResult.ResponseCode f30856c;

        public TokenResult a() {
            String str = "";
            if (this.f30855b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.f30854a, this.f30855b.longValue(), this.f30856c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public TokenResult.Builder b(TokenResult.ResponseCode responseCode) {
            this.f30856c = responseCode;
            return this;
        }

        public TokenResult.Builder c(String str) {
            this.f30854a = str;
            return this;
        }

        public TokenResult.Builder d(long j2) {
            this.f30855b = Long.valueOf(j2);
            return this;
        }
    }

    public TokenResult.ResponseCode b() {
        return this.f30853c;
    }

    public String c() {
        return this.f30851a;
    }

    public long d() {
        return this.f30852b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f30851a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.f30852b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.f30853c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30851a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f30852b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f30853c;
        if (responseCode != null) {
            i2 = responseCode.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f30851a + ", tokenExpirationTimestamp=" + this.f30852b + ", responseCode=" + this.f30853c + "}";
    }

    public AutoValue_TokenResult(String str, long j2, TokenResult.ResponseCode responseCode) {
        this.f30851a = str;
        this.f30852b = j2;
        this.f30853c = responseCode;
    }
}
