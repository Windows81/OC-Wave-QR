package com.hansecom.abt.data.preferences.base;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CacheValue<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final SerialDescriptor f33340d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f33341a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33342b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33343c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CacheValue a(Object obj, long j2, long j3) {
            return new CacheValue(obj, j2, j3);
        }

        public final <T> KSerializer<CacheValue<T>> serializer(KSerializer<T> kSerializer) {
            Intrinsics.i(kSerializer, "typeSerial0");
            return new CacheValue$$serializer(kSerializer);
        }

        public Companion() {
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.preferences.base.CacheValue", (GeneratedSerializer) null, 3);
        pluginGeneratedSerialDescriptor.q("value", false);
        pluginGeneratedSerialDescriptor.q("expirationDateEpoch", true);
        pluginGeneratedSerialDescriptor.q("freshnessExpirationDateEpoch", true);
        f33340d = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ CacheValue(int i2, Object obj, long j2, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, f33340d);
        }
        this.f33341a = obj;
        if ((i2 & 2) == 0) {
            this.f33342b = 0;
        } else {
            this.f33342b = j2;
        }
        if ((i2 & 4) == 0) {
            this.f33343c = 0;
        } else {
            this.f33343c = j3;
        }
    }

    public static /* synthetic */ CacheValue b(CacheValue cacheValue, Object obj, long j2, long j3, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = cacheValue.f33341a;
        }
        if ((i2 & 2) != 0) {
            j2 = cacheValue.f33342b;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = cacheValue.f33343c;
        }
        return cacheValue.a(obj, j4, j3);
    }

    public static final /* synthetic */ void h(CacheValue cacheValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.A(serialDescriptor, 0, kSerializer, cacheValue.f33341a);
        if (compositeEncoder.w(serialDescriptor, 1) || cacheValue.f33342b != 0) {
            compositeEncoder.E(serialDescriptor, 1, cacheValue.f33342b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || cacheValue.f33343c != 0) {
            compositeEncoder.E(serialDescriptor, 2, cacheValue.f33343c);
        }
    }

    public final CacheValue a(Object obj, long j2, long j3) {
        return new CacheValue(obj, j2, j3);
    }

    public final LocalDateTime c() {
        return CacheValueKt.d(this.f33342b);
    }

    public final LocalDateTime d() {
        return CacheValueKt.d(this.f33343c);
    }

    public final Object e() {
        return this.f33341a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheValue)) {
            return false;
        }
        CacheValue cacheValue = (CacheValue) obj;
        return Intrinsics.d(this.f33341a, cacheValue.f33341a) && this.f33342b == cacheValue.f33342b && this.f33343c == cacheValue.f33343c;
    }

    public final boolean f() {
        return c().isBefore(LocalDateTime.now());
    }

    public final boolean g() {
        LocalDateTime d2 = d();
        LocalDateTime now = LocalDateTime.now();
        Intrinsics.h(now, "now(...)");
        return CacheValueKt.c(d2, now);
    }

    public int hashCode() {
        Object obj = this.f33341a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + Long.hashCode(this.f33342b)) * 31) + Long.hashCode(this.f33343c);
    }

    public String toString() {
        Object obj = this.f33341a;
        long j2 = this.f33342b;
        long j3 = this.f33343c;
        return "CacheValue(value=" + obj + ", expirationDateEpoch=" + j2 + ", freshnessExpirationDateEpoch=" + j3 + ")";
    }

    public CacheValue(Object obj, long j2, long j3) {
        this.f33341a = obj;
        this.f33342b = j2;
        this.f33343c = j3;
    }
}
