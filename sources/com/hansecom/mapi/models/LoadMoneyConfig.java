package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class LoadMoneyConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39494a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39495b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39496c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39497d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39498e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoadMoneyConfig> serializer() {
            return LoadMoneyConfig$$serializer.f39499a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ LoadMoneyConfig(int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39494a = null;
        } else {
            this.f39494a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39495b = null;
        } else {
            this.f39495b = num2;
        }
        if ((i2 & 4) == 0) {
            this.f39496c = null;
        } else {
            this.f39496c = num3;
        }
        if ((i2 & 8) == 0) {
            this.f39497d = null;
        } else {
            this.f39497d = num4;
        }
        if ((i2 & 16) == 0) {
            this.f39498e = null;
        } else {
            this.f39498e = num5;
        }
    }

    public static final /* synthetic */ void a(LoadMoneyConfig loadMoneyConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || loadMoneyConfig.f39494a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, loadMoneyConfig.f39494a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || loadMoneyConfig.f39495b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, loadMoneyConfig.f39495b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || loadMoneyConfig.f39496c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, loadMoneyConfig.f39496c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || loadMoneyConfig.f39497d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, loadMoneyConfig.f39497d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || loadMoneyConfig.f39498e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, loadMoneyConfig.f39498e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoneyConfig)) {
            return false;
        }
        LoadMoneyConfig loadMoneyConfig = (LoadMoneyConfig) obj;
        return Intrinsics.d(this.f39494a, loadMoneyConfig.f39494a) && Intrinsics.d(this.f39495b, loadMoneyConfig.f39495b) && Intrinsics.d(this.f39496c, loadMoneyConfig.f39496c) && Intrinsics.d(this.f39497d, loadMoneyConfig.f39497d) && Intrinsics.d(this.f39498e, loadMoneyConfig.f39498e);
    }

    public int hashCode() {
        Integer num = this.f39494a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39495b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39496c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f39497d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f39498e;
        if (num5 != null) {
            i2 = num5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "LoadMoneyConfig(minAmountToAdd=" + this.f39494a + ", minAutoloadAmount=" + this.f39495b + ", defaultAutoloadAmount=" + this.f39496c + ", maxAmountToAdd=" + this.f39497d + ", maxBalance=" + this.f39498e + ')';
    }
}
