package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.J();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31161a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31161a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31161a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.NetworkRequestMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NetworkRequestMetric, Builder> implements NetworkRequestMetricOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder O(Iterable iterable) {
            G();
            ((NetworkRequestMetric) this.f32150A).s0(iterable);
            return this;
        }

        public Builder P() {
            G();
            ((NetworkRequestMetric) this.f32150A).t0();
            return this;
        }

        public long R() {
            return ((NetworkRequestMetric) this.f32150A).F0();
        }

        public boolean T() {
            return ((NetworkRequestMetric) this.f32150A).H0();
        }

        public boolean U() {
            return ((NetworkRequestMetric) this.f32150A).J0();
        }

        public boolean V() {
            return ((NetworkRequestMetric) this.f32150A).N0();
        }

        public Builder W(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).Q0(j2);
            return this;
        }

        public Builder X(HttpMethod httpMethod) {
            G();
            ((NetworkRequestMetric) this.f32150A).R0(httpMethod);
            return this;
        }

        public Builder Y(int i2) {
            G();
            ((NetworkRequestMetric) this.f32150A).S0(i2);
            return this;
        }

        public Builder Z(NetworkClientErrorReason networkClientErrorReason) {
            G();
            ((NetworkRequestMetric) this.f32150A).T0(networkClientErrorReason);
            return this;
        }

        public Builder a0(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).V0(j2);
            return this;
        }

        public Builder b0(String str) {
            G();
            ((NetworkRequestMetric) this.f32150A).X0(str);
            return this;
        }

        public Builder c0(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).Y0(j2);
            return this;
        }

        public Builder d0(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).Z0(j2);
            return this;
        }

        public Builder e0(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).a1(j2);
            return this;
        }

        public Builder g0(long j2) {
            G();
            ((NetworkRequestMetric) this.f32150A).b1(j2);
            return this;
        }

        public Builder h0(String str) {
            G();
            ((NetworkRequestMetric) this.f32150A).c1(str);
            return this;
        }

        public Builder() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    public static final class CustomAttributesDefaultEntryHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite f31162a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f31162a = MapEntryLite.d(fieldType, "", fieldType, "");
        }
    }

    public enum HttpMethod implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        public static final Internal.EnumLiteMap K = null;

        /* renamed from: z  reason: collision with root package name */
        public final int f31165z;

        public static final class HttpMethodVerifier implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f31166a = null;

            static {
                f31166a = new HttpMethodVerifier();
            }

            public boolean a(int i2) {
                return HttpMethod.f(i2) != null;
            }
        }

        static {
            K = new Internal.EnumLiteMap<HttpMethod>() {
                /* renamed from: b */
                public HttpMethod a(int i2) {
                    return HttpMethod.f(i2);
                }
            };
        }

        /* access modifiers changed from: public */
        HttpMethod(int i2) {
            this.f31165z = i2;
        }

        public static HttpMethod f(int i2) {
            switch (i2) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static Internal.EnumVerifier h() {
            return HttpMethodVerifier.f31166a;
        }

        public final int i() {
            return this.f31165z;
        }
    }

    public enum NetworkClientErrorReason implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        public static final Internal.EnumLiteMap C = null;

        /* renamed from: z  reason: collision with root package name */
        public final int f31169z;

        public static final class NetworkClientErrorReasonVerifier implements Internal.EnumVerifier {

            /* renamed from: a  reason: collision with root package name */
            public static final Internal.EnumVerifier f31170a = null;

            static {
                f31170a = new NetworkClientErrorReasonVerifier();
            }

            public boolean a(int i2) {
                return NetworkClientErrorReason.f(i2) != null;
            }
        }

        static {
            C = new Internal.EnumLiteMap<NetworkClientErrorReason>() {
                /* renamed from: b */
                public NetworkClientErrorReason a(int i2) {
                    return NetworkClientErrorReason.f(i2);
                }
            };
        }

        /* access modifiers changed from: public */
        NetworkClientErrorReason(int i2) {
            this.f31169z = i2;
        }

        public static NetworkClientErrorReason f(int i2) {
            if (i2 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i2 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static Internal.EnumVerifier h() {
            return NetworkClientErrorReasonVerifier.f31170a;
        }

        public final int i() {
            return this.f31169z;
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.b0(NetworkRequestMetric.class, networkRequestMetric);
    }

    public static Builder P0() {
        return (Builder) DEFAULT_INSTANCE.B();
    }

    public static NetworkRequestMetric w0() {
        return DEFAULT_INSTANCE;
    }

    public long A0() {
        return this.requestPayloadBytes_;
    }

    public String B0() {
        return this.responseContentType_;
    }

    public long C0() {
        return this.responsePayloadBytes_;
    }

    public long D0() {
        return this.timeToRequestCompletedUs_;
    }

    public long E0() {
        return this.timeToResponseCompletedUs_;
    }

    public final Object F(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.f31161a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return GeneratedMessageLite.W(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.h(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.h(), "customAttributes_", CustomAttributesDefaultEntryHolder.f31162a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NetworkRequestMetric> parser = PARSER;
                if (parser == null) {
                    synchronized (NetworkRequestMetric.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long F0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String G0() {
        return this.url_;
    }

    public boolean H0() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean I0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean J0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean K0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean L0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean M0() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean N0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean O0() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void Q0(long j2) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j2;
    }

    public final void R0(HttpMethod httpMethod) {
        this.httpMethod_ = httpMethod.i();
        this.bitField0_ |= 2;
    }

    public final void S0(int i2) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i2;
    }

    public final void T0(NetworkClientErrorReason networkClientErrorReason) {
        this.networkClientErrorReason_ = networkClientErrorReason.i();
        this.bitField0_ |= 16;
    }

    public final void V0(long j2) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j2;
    }

    public final void X0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void Y0(long j2) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j2;
    }

    public final void Z0(long j2) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j2;
    }

    public final void a1(long j2) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j2;
    }

    public final void b1(long j2) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j2;
    }

    public final void c1(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public final void s0(Iterable iterable) {
        u0();
        AbstractMessageLite.a(iterable, this.perfSessions_);
    }

    public final void t0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = w0().B0();
    }

    public final void u0() {
        Internal.ProtobufList<PerfSession> protobufList = this.perfSessions_;
        if (!protobufList.I()) {
            this.perfSessions_ = GeneratedMessageLite.U(protobufList);
        }
    }

    public long v0() {
        return this.clientStartTimeUs_;
    }

    public HttpMethod x0() {
        HttpMethod f2 = HttpMethod.f(this.httpMethod_);
        return f2 == null ? HttpMethod.HTTP_METHOD_UNKNOWN : f2;
    }

    public int y0() {
        return this.httpResponseCode_;
    }

    public List z0() {
        return this.perfSessions_;
    }
}
