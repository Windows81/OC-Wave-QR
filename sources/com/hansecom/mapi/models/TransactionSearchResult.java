package com.hansecom.mapi.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class TransactionSearchResult {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f39603c = {null, new ArrayListSerializer(Transaction$$serializer.f39602a)};

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39604a;

    /* renamed from: b  reason: collision with root package name */
    public final List f39605b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionSearchResult> serializer() {
            return TransactionSearchResult$$serializer.f39606a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TransactionSearchResult(int i2, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39604a = null;
        } else {
            this.f39604a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39605b = null;
        } else {
            this.f39605b = list;
        }
    }

    public static final /* synthetic */ void d(TransactionSearchResult transactionSearchResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39603c;
        if (compositeEncoder.w(serialDescriptor, 0) || transactionSearchResult.f39604a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, transactionSearchResult.f39604a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || transactionSearchResult.f39605b != null) {
            compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], transactionSearchResult.f39605b);
        }
    }

    public final List b() {
        return this.f39605b;
    }

    public final Integer c() {
        return this.f39604a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionSearchResult)) {
            return false;
        }
        TransactionSearchResult transactionSearchResult = (TransactionSearchResult) obj;
        return Intrinsics.d(this.f39604a, transactionSearchResult.f39604a) && Intrinsics.d(this.f39605b, transactionSearchResult.f39605b);
    }

    public int hashCode() {
        Integer num = this.f39604a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f39605b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "TransactionSearchResult(totalCount=" + this.f39604a + ", results=" + this.f39605b + ')';
    }

    public TransactionSearchResult(Integer num, List list) {
        this.f39604a = num;
        this.f39605b = list;
    }
}
