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
public final class PrimaryAndBackupPM {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39549a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39550b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39551c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39552d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrimaryAndBackupPM> serializer() {
            return PrimaryAndBackupPM$$serializer.f39553a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PrimaryAndBackupPM(int i2, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39549a = null;
        } else {
            this.f39549a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39550b = null;
        } else {
            this.f39550b = num2;
        }
        if ((i2 & 4) == 0) {
            this.f39551c = null;
        } else {
            this.f39551c = num3;
        }
        if ((i2 & 8) == 0) {
            this.f39552d = null;
        } else {
            this.f39552d = num4;
        }
    }

    public static final /* synthetic */ void a(PrimaryAndBackupPM primaryAndBackupPM, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || primaryAndBackupPM.f39549a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, primaryAndBackupPM.f39549a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || primaryAndBackupPM.f39550b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, primaryAndBackupPM.f39550b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || primaryAndBackupPM.f39551c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, primaryAndBackupPM.f39551c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || primaryAndBackupPM.f39552d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, primaryAndBackupPM.f39552d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimaryAndBackupPM)) {
            return false;
        }
        PrimaryAndBackupPM primaryAndBackupPM = (PrimaryAndBackupPM) obj;
        return Intrinsics.d(this.f39549a, primaryAndBackupPM.f39549a) && Intrinsics.d(this.f39550b, primaryAndBackupPM.f39550b) && Intrinsics.d(this.f39551c, primaryAndBackupPM.f39551c) && Intrinsics.d(this.f39552d, primaryAndBackupPM.f39552d);
    }

    public int hashCode() {
        Integer num = this.f39549a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39550b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39551c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f39552d;
        if (num4 != null) {
            i2 = num4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "PrimaryAndBackupPM(primaryPaymentMethodId=" + this.f39549a + ", backupPaymentMethodId=" + this.f39550b + ", order=" + this.f39551c + ", amount=" + this.f39552d + ')';
    }
}
