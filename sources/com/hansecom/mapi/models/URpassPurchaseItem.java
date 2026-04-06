package com.hansecom.mapi.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class URpassPurchaseItem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39614a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39615b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<URpassPurchaseItem> serializer() {
            return URpassPurchaseItem$$serializer.f39616a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ URpassPurchaseItem(int i2, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, URpassPurchaseItem$$serializer.f39616a.a());
        }
        this.f39614a = str;
        if ((i2 & 2) == 0) {
            this.f39615b = 1;
        } else {
            this.f39615b = num;
        }
    }

    public static final /* synthetic */ void a(URpassPurchaseItem uRpassPurchaseItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        compositeEncoder.t(serialDescriptor, 0, uRpassPurchaseItem.f39614a);
        if (compositeEncoder.w(serialDescriptor, 1) || (num = uRpassPurchaseItem.f39615b) == null || num.intValue() != 1) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, uRpassPurchaseItem.f39615b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URpassPurchaseItem)) {
            return false;
        }
        URpassPurchaseItem uRpassPurchaseItem = (URpassPurchaseItem) obj;
        return Intrinsics.d(this.f39614a, uRpassPurchaseItem.f39614a) && Intrinsics.d(this.f39615b, uRpassPurchaseItem.f39615b);
    }

    public int hashCode() {
        int hashCode = this.f39614a.hashCode() * 31;
        Integer num = this.f39615b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "URpassPurchaseItem(offerToken=" + this.f39614a + ", quantity=" + this.f39615b + ')';
    }
}
