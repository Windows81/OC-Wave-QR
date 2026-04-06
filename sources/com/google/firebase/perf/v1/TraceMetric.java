package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class TraceMetric extends GeneratedMessageLite<TraceMetric, Builder> implements TraceMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.f();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private Internal.ProtobufList<PerfSession> perfSessions_ = GeneratedMessageLite.J();
    private Internal.ProtobufList<TraceMetric> subtraces_ = GeneratedMessageLite.J();

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31177a;

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
                f31177a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31177a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.v1.TraceMetric.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TraceMetric, Builder> implements TraceMetricOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public Builder O(Iterable iterable) {
            G();
            ((TraceMetric) this.f32150A).o0(iterable);
            return this;
        }

        public Builder P(Iterable iterable) {
            G();
            ((TraceMetric) this.f32150A).p0(iterable);
            return this;
        }

        public Builder R(PerfSession perfSession) {
            G();
            ((TraceMetric) this.f32150A).q0(perfSession);
            return this;
        }

        public Builder T(TraceMetric traceMetric) {
            G();
            ((TraceMetric) this.f32150A).r0(traceMetric);
            return this;
        }

        public Builder U(Map map) {
            G();
            ((TraceMetric) this.f32150A).A0().putAll(map);
            return this;
        }

        public Builder V(Map map) {
            G();
            ((TraceMetric) this.f32150A).B0().putAll(map);
            return this;
        }

        public Builder W(String str, long j2) {
            str.getClass();
            G();
            ((TraceMetric) this.f32150A).A0().put(str, Long.valueOf(j2));
            return this;
        }

        public Builder X(String str, String str2) {
            str.getClass();
            str2.getClass();
            G();
            ((TraceMetric) this.f32150A).B0().put(str, str2);
            return this;
        }

        public Builder Y(long j2) {
            G();
            ((TraceMetric) this.f32150A).L0(j2);
            return this;
        }

        public Builder Z(long j2) {
            G();
            ((TraceMetric) this.f32150A).M0(j2);
            return this;
        }

        public Builder a0(String str) {
            G();
            ((TraceMetric) this.f32150A).N0(str);
            return this;
        }

        public Builder() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }
    }

    public static final class CountersDefaultEntryHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite f31178a = MapEntryLite.d(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    public static final class CustomAttributesDefaultEntryHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final MapEntryLite f31179a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f31179a = MapEntryLite.d(fieldType, "", fieldType, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.b0(TraceMetric.class, traceMetric);
    }

    /* access modifiers changed from: private */
    public Map B0() {
        return J0();
    }

    private MapFieldLite J0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.o();
        }
        return this.customAttributes_;
    }

    public static Builder K0() {
        return (Builder) DEFAULT_INSTANCE.B();
    }

    /* access modifiers changed from: private */
    public void L0(long j2) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j2;
    }

    /* access modifiers changed from: private */
    public void o0(Iterable iterable) {
        t0();
        AbstractMessageLite.a(iterable, this.perfSessions_);
    }

    private void t0() {
        Internal.ProtobufList<PerfSession> protobufList = this.perfSessions_;
        if (!protobufList.I()) {
            this.perfSessions_ = GeneratedMessageLite.U(protobufList);
        }
    }

    public static TraceMetric y0() {
        return DEFAULT_INSTANCE;
    }

    public final Map A0() {
        return I0();
    }

    public String C0() {
        return this.name_;
    }

    public List D0() {
        return this.perfSessions_;
    }

    public List E0() {
        return this.subtraces_;
    }

    public final Object F(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.f31177a[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new Builder((AnonymousClass1) null);
            case 3:
                return GeneratedMessageLite.W(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", CountersDefaultEntryHolder.f31178a, "subtraces_", TraceMetric.class, "customAttributes_", CustomAttributesDefaultEntryHolder.f31179a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TraceMetric> parser = PARSER;
                if (parser == null) {
                    synchronized (TraceMetric.class) {
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

    public boolean F0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final MapFieldLite G0() {
        return this.counters_;
    }

    public final MapFieldLite H0() {
        return this.customAttributes_;
    }

    public final MapFieldLite I0() {
        if (!this.counters_.j()) {
            this.counters_ = this.counters_.o();
        }
        return this.counters_;
    }

    public final void M0(long j2) {
        this.bitField0_ |= 8;
        this.durationUs_ = j2;
    }

    public final void N0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final void p0(Iterable iterable) {
        u0();
        AbstractMessageLite.a(iterable, this.subtraces_);
    }

    public final void q0(PerfSession perfSession) {
        perfSession.getClass();
        t0();
        this.perfSessions_.add(perfSession);
    }

    public final void r0(TraceMetric traceMetric) {
        traceMetric.getClass();
        u0();
        this.subtraces_.add(traceMetric);
    }

    public boolean s0(String str) {
        str.getClass();
        return H0().containsKey(str);
    }

    public final void u0() {
        Internal.ProtobufList<TraceMetric> protobufList = this.subtraces_;
        if (!protobufList.I()) {
            this.subtraces_ = GeneratedMessageLite.U(protobufList);
        }
    }

    public int v0() {
        return G0().size();
    }

    public Map w0() {
        return Collections.unmodifiableMap(G0());
    }

    public Map x0() {
        return Collections.unmodifiableMap(H0());
    }

    public long z0() {
        return this.durationUs_;
    }
}
