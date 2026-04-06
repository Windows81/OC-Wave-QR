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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class Transaction {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39593a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39594b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39595c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39596d;

    /* renamed from: e  reason: collision with root package name */
    public final String f39597e;

    /* renamed from: f  reason: collision with root package name */
    public final String f39598f;

    /* renamed from: g  reason: collision with root package name */
    public final String f39599g;

    /* renamed from: h  reason: collision with root package name */
    public final String f39600h;

    /* renamed from: i  reason: collision with root package name */
    public final String f39601i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Transaction> serializer() {
            return Transaction$$serializer.f39602a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Transaction(int i2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39593a = null;
        } else {
            this.f39593a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39594b = null;
        } else {
            this.f39594b = str;
        }
        if ((i2 & 4) == 0) {
            this.f39595c = null;
        } else {
            this.f39595c = str2;
        }
        if ((i2 & 8) == 0) {
            this.f39596d = null;
        } else {
            this.f39596d = str3;
        }
        if ((i2 & 16) == 0) {
            this.f39597e = null;
        } else {
            this.f39597e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f39598f = null;
        } else {
            this.f39598f = str5;
        }
        if ((i2 & 64) == 0) {
            this.f39599g = null;
        } else {
            this.f39599g = str6;
        }
        if ((i2 & 128) == 0) {
            this.f39600h = null;
        } else {
            this.f39600h = str7;
        }
        if ((i2 & 256) == 0) {
            this.f39601i = null;
        } else {
            this.f39601i = str8;
        }
    }

    public static final /* synthetic */ void g(Transaction transaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || transaction.f39593a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, transaction.f39593a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || transaction.f39594b != null) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, transaction.f39594b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || transaction.f39595c != null) {
            compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, transaction.f39595c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || transaction.f39596d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, transaction.f39596d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || transaction.f39597e != null) {
            compositeEncoder.m(serialDescriptor, 4, StringSerializer.f42197a, transaction.f39597e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || transaction.f39598f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, transaction.f39598f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || transaction.f39599g != null) {
            compositeEncoder.m(serialDescriptor, 6, StringSerializer.f42197a, transaction.f39599g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || transaction.f39600h != null) {
            compositeEncoder.m(serialDescriptor, 7, StringSerializer.f42197a, transaction.f39600h);
        }
        if (compositeEncoder.w(serialDescriptor, 8) || transaction.f39601i != null) {
            compositeEncoder.m(serialDescriptor, 8, StringSerializer.f42197a, transaction.f39601i);
        }
    }

    public final String a() {
        return this.f39596d;
    }

    public final String b() {
        return this.f39600h;
    }

    public final String c() {
        return this.f39598f;
    }

    public final String d() {
        return this.f39601i;
    }

    public final String e() {
        return this.f39597e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return Intrinsics.d(this.f39593a, transaction.f39593a) && Intrinsics.d(this.f39594b, transaction.f39594b) && Intrinsics.d(this.f39595c, transaction.f39595c) && Intrinsics.d(this.f39596d, transaction.f39596d) && Intrinsics.d(this.f39597e, transaction.f39597e) && Intrinsics.d(this.f39598f, transaction.f39598f) && Intrinsics.d(this.f39599g, transaction.f39599g) && Intrinsics.d(this.f39600h, transaction.f39600h) && Intrinsics.d(this.f39601i, transaction.f39601i);
    }

    public final String f() {
        return this.f39595c;
    }

    public int hashCode() {
        Integer num = this.f39593a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f39594b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39595c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39596d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39597e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f39598f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39599g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f39600h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f39601i;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        return "Transaction(id=" + this.f39593a + ", transactionId=" + this.f39594b + ", title=" + this.f39595c + ", description=" + this.f39596d + ", timestamp=" + this.f39597e + ", price=" + this.f39598f + ", type=" + this.f39599g + ", line=" + this.f39600h + ", stop=" + this.f39601i + ')';
    }
}
