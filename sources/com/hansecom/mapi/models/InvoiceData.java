package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class InvoiceData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final UserAddress f39488a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39489b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39490c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39491d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39492e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvoiceData> serializer() {
            return InvoiceData$$serializer.f39493a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ InvoiceData(int i2, UserAddress userAddress, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, InvoiceData$$serializer.f39493a.a());
        }
        this.f39488a = userAddress;
        if ((i2 & 2) == 0) {
            this.f39489b = null;
        } else {
            this.f39489b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39490c = null;
        } else {
            this.f39490c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39491d = null;
        } else {
            this.f39491d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39492e = null;
        } else {
            this.f39492e = str4;
        }
    }

    public static final /* synthetic */ void a(InvoiceData invoiceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.A(serialDescriptor, 0, UserAddress$$serializer.f39673a, invoiceData.f39488a);
        if (compositeEncoder.w(serialDescriptor, 1) || invoiceData.f39489b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, invoiceData.f39489b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || invoiceData.f39490c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, invoiceData.f39490c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || invoiceData.f39491d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, invoiceData.f39491d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || invoiceData.f39492e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, invoiceData.f39492e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceData)) {
            return false;
        }
        InvoiceData invoiceData = (InvoiceData) obj;
        return Intrinsics.d(this.f39488a, invoiceData.f39488a) && Intrinsics.d(this.f39489b, invoiceData.f39489b) && Intrinsics.d(this.f39490c, invoiceData.f39490c) && Intrinsics.d(this.f39491d, invoiceData.f39491d) && Intrinsics.d(this.f39492e, invoiceData.f39492e);
    }

    public int hashCode() {
        int hashCode = this.f39488a.hashCode() * 31;
        String str = this.f39489b;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39490c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39491d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39492e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "InvoiceData(address=" + this.f39488a + ", firstName=" + this.f39489b + ", lastName=" + this.f39490c + ", phoneNumber=" + this.f39491d + ", email=" + this.f39492e + ')';
    }
}
