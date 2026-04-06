package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.data.localDomain.PaymentMethodType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class ChoosePaymentDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37730d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f37731e = {new ArrayListSerializer(EnumsKt.b("com.hansecom.abt.data.localDomain.PaymentMethodType", PaymentMethodType.values())), new ArrayListSerializer(LongSerializer.f42142a), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f37732a;

    /* renamed from: b  reason: collision with root package name */
    public final List f37733b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37734c;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChoosePaymentDestination> serializer() {
            return ChoosePaymentDestination$$serializer.f37735a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChoosePaymentDestination(int i2, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.a(i2, 7, ChoosePaymentDestination$$serializer.f37735a.a());
        }
        this.f37732a = list;
        this.f37733b = list2;
        this.f37734c = str;
    }

    public static final /* synthetic */ void e(ChoosePaymentDestination choosePaymentDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f37731e;
        compositeEncoder.A(serialDescriptor, 0, kSerializerArr[0], choosePaymentDestination.f37732a);
        compositeEncoder.m(serialDescriptor, 1, kSerializerArr[1], choosePaymentDestination.f37733b);
        compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, choosePaymentDestination.f37734c);
    }

    public final String b() {
        return this.f37734c;
    }

    public final List c() {
        return this.f37733b;
    }

    public final List d() {
        return this.f37732a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoosePaymentDestination)) {
            return false;
        }
        ChoosePaymentDestination choosePaymentDestination = (ChoosePaymentDestination) obj;
        return Intrinsics.d(this.f37732a, choosePaymentDestination.f37732a) && Intrinsics.d(this.f37733b, choosePaymentDestination.f37733b) && Intrinsics.d(this.f37734c, choosePaymentDestination.f37734c);
    }

    public int hashCode() {
        int hashCode = this.f37732a.hashCode() * 31;
        List list = this.f37733b;
        int i2 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f37734c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        List list = this.f37732a;
        List list2 = this.f37733b;
        String str = this.f37734c;
        return "ChoosePaymentDestination(paymentMethodTypes=" + list + ", ignorePaymentMethodIds=" + list2 + ", fareMediaCardId=" + str + ")";
    }

    public ChoosePaymentDestination(List list, List list2, String str) {
        Intrinsics.i(list, "paymentMethodTypes");
        this.f37732a = list;
        this.f37733b = list2;
        this.f37734c = str;
    }
}
