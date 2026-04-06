package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;
import java.util.Map;

final class AutoValue_EventInternal extends EventInternal {

    /* renamed from: a  reason: collision with root package name */
    public final String f24015a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f24016b;

    /* renamed from: c  reason: collision with root package name */
    public final EncodedPayload f24017c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24018d;

    /* renamed from: e  reason: collision with root package name */
    public final long f24019e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f24020f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f24021g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24022h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f24023i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f24024j;

    public static final class Builder extends EventInternal.Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f24025a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f24026b;

        /* renamed from: c  reason: collision with root package name */
        public EncodedPayload f24027c;

        /* renamed from: d  reason: collision with root package name */
        public Long f24028d;

        /* renamed from: e  reason: collision with root package name */
        public Long f24029e;

        /* renamed from: f  reason: collision with root package name */
        public Map f24030f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f24031g;

        /* renamed from: h  reason: collision with root package name */
        public String f24032h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f24033i;

        /* renamed from: j  reason: collision with root package name */
        public byte[] f24034j;

        public EventInternal d() {
            String str = "";
            if (this.f24025a == null) {
                str = str + " transportName";
            }
            if (this.f24027c == null) {
                str = str + " encodedPayload";
            }
            if (this.f24028d == null) {
                str = str + " eventMillis";
            }
            if (this.f24029e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f24030f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.f24025a, this.f24026b, this.f24027c, this.f24028d.longValue(), this.f24029e.longValue(), this.f24030f, this.f24031g, this.f24032h, this.f24033i, this.f24034j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public Map e() {
            Map map = this.f24030f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public EventInternal.Builder f(Map map) {
            if (map != null) {
                this.f24030f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        public EventInternal.Builder g(Integer num) {
            this.f24026b = num;
            return this;
        }

        public EventInternal.Builder h(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.f24027c = encodedPayload;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public EventInternal.Builder i(long j2) {
            this.f24028d = Long.valueOf(j2);
            return this;
        }

        public EventInternal.Builder j(byte[] bArr) {
            this.f24033i = bArr;
            return this;
        }

        public EventInternal.Builder k(byte[] bArr) {
            this.f24034j = bArr;
            return this;
        }

        public EventInternal.Builder l(Integer num) {
            this.f24031g = num;
            return this;
        }

        public EventInternal.Builder m(String str) {
            this.f24032h = str;
            return this;
        }

        public EventInternal.Builder n(String str) {
            if (str != null) {
                this.f24025a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public EventInternal.Builder o(long j2) {
            this.f24029e = Long.valueOf(j2);
            return this;
        }
    }

    public Map c() {
        return this.f24020f;
    }

    public Integer d() {
        return this.f24016b;
    }

    public EncodedPayload e() {
        return this.f24017c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (this.f24015a.equals(eventInternal.n()) && ((num = this.f24016b) != null ? num.equals(eventInternal.d()) : eventInternal.d() == null) && this.f24017c.equals(eventInternal.e()) && this.f24018d == eventInternal.f() && this.f24019e == eventInternal.o() && this.f24020f.equals(eventInternal.c()) && ((num2 = this.f24021g) != null ? num2.equals(eventInternal.l()) : eventInternal.l() == null) && ((str = this.f24022h) != null ? str.equals(eventInternal.m()) : eventInternal.m() == null)) {
            boolean z2 = eventInternal instanceof AutoValue_EventInternal;
            if (Arrays.equals(this.f24023i, z2 ? ((AutoValue_EventInternal) eventInternal).f24023i : eventInternal.g())) {
                if (Arrays.equals(this.f24024j, z2 ? ((AutoValue_EventInternal) eventInternal).f24024j : eventInternal.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    public long f() {
        return this.f24018d;
    }

    public byte[] g() {
        return this.f24023i;
    }

    public byte[] h() {
        return this.f24024j;
    }

    public int hashCode() {
        int hashCode = (this.f24015a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f24016b;
        int i2 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f24018d;
        long j3 = this.f24019e;
        int hashCode3 = (((((((((hashCode ^ hashCode2) * 1000003) ^ this.f24017c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f24020f.hashCode()) * 1000003;
        Integer num2 = this.f24021g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f24022h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((hashCode4 ^ i2) * 1000003) ^ Arrays.hashCode(this.f24023i)) * 1000003) ^ Arrays.hashCode(this.f24024j);
    }

    public Integer l() {
        return this.f24021g;
    }

    public String m() {
        return this.f24022h;
    }

    public String n() {
        return this.f24015a;
    }

    public long o() {
        return this.f24019e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f24015a + ", code=" + this.f24016b + ", encodedPayload=" + this.f24017c + ", eventMillis=" + this.f24018d + ", uptimeMillis=" + this.f24019e + ", autoMetadata=" + this.f24020f + ", productId=" + this.f24021g + ", pseudonymousId=" + this.f24022h + ", experimentIdsClear=" + Arrays.toString(this.f24023i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f24024j) + "}";
    }

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j2, long j3, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f24015a = str;
        this.f24016b = num;
        this.f24017c = encodedPayload;
        this.f24018d = j2;
        this.f24019e = j3;
        this.f24020f = map;
        this.f24021g = num2;
        this.f24022h = str2;
        this.f24023i = bArr;
        this.f24024j = bArr2;
    }
}
