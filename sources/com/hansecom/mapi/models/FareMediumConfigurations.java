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
public final class FareMediumConfigurations {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer[] f39401i;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f39402a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f39403b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f39404c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f39405d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f39406e;

    /* renamed from: f  reason: collision with root package name */
    public final List f39407f;

    /* renamed from: g  reason: collision with root package name */
    public final List f39408g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f39409h;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FareMediumConfigurations> serializer() {
            return FareMediumConfigurations$$serializer.f39410a;
        }

        public Companion() {
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.f42129a;
        f39401i = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), null};
    }

    public /* synthetic */ FareMediumConfigurations(int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, List list2, Integer num6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.f39402a = null;
        } else {
            this.f39402a = num;
        }
        if ((i2 & 2) == 0) {
            this.f39403b = null;
        } else {
            this.f39403b = num2;
        }
        if ((i2 & 4) == 0) {
            this.f39404c = null;
        } else {
            this.f39404c = num3;
        }
        if ((i2 & 8) == 0) {
            this.f39405d = null;
        } else {
            this.f39405d = num4;
        }
        if ((i2 & 16) == 0) {
            this.f39406e = null;
        } else {
            this.f39406e = num5;
        }
        if ((i2 & 32) == 0) {
            this.f39407f = null;
        } else {
            this.f39407f = list;
        }
        if ((i2 & 64) == 0) {
            this.f39408g = null;
        } else {
            this.f39408g = list2;
        }
        if ((i2 & 128) == 0) {
            this.f39409h = null;
        } else {
            this.f39409h = num6;
        }
    }

    public static final /* synthetic */ void j(FareMediumConfigurations fareMediumConfigurations, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f39401i;
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediumConfigurations.f39402a != null) {
            compositeEncoder.m(serialDescriptor, 0, IntSerializer.f42129a, fareMediumConfigurations.f39402a);
        }
        if (compositeEncoder.w(serialDescriptor, 1) || fareMediumConfigurations.f39403b != null) {
            compositeEncoder.m(serialDescriptor, 1, IntSerializer.f42129a, fareMediumConfigurations.f39403b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || fareMediumConfigurations.f39404c != null) {
            compositeEncoder.m(serialDescriptor, 2, IntSerializer.f42129a, fareMediumConfigurations.f39404c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || fareMediumConfigurations.f39405d != null) {
            compositeEncoder.m(serialDescriptor, 3, IntSerializer.f42129a, fareMediumConfigurations.f39405d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || fareMediumConfigurations.f39406e != null) {
            compositeEncoder.m(serialDescriptor, 4, IntSerializer.f42129a, fareMediumConfigurations.f39406e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || fareMediumConfigurations.f39407f != null) {
            compositeEncoder.m(serialDescriptor, 5, kSerializerArr[5], fareMediumConfigurations.f39407f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || fareMediumConfigurations.f39408g != null) {
            compositeEncoder.m(serialDescriptor, 6, kSerializerArr[6], fareMediumConfigurations.f39408g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || fareMediumConfigurations.f39409h != null) {
            compositeEncoder.m(serialDescriptor, 7, IntSerializer.f42129a, fareMediumConfigurations.f39409h);
        }
    }

    public final Integer b() {
        return this.f39405d;
    }

    public final List c() {
        return this.f39408g;
    }

    public final Integer d() {
        return this.f39406e;
    }

    public final Integer e() {
        return this.f39409h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediumConfigurations)) {
            return false;
        }
        FareMediumConfigurations fareMediumConfigurations = (FareMediumConfigurations) obj;
        return Intrinsics.d(this.f39402a, fareMediumConfigurations.f39402a) && Intrinsics.d(this.f39403b, fareMediumConfigurations.f39403b) && Intrinsics.d(this.f39404c, fareMediumConfigurations.f39404c) && Intrinsics.d(this.f39405d, fareMediumConfigurations.f39405d) && Intrinsics.d(this.f39406e, fareMediumConfigurations.f39406e) && Intrinsics.d(this.f39407f, fareMediumConfigurations.f39407f) && Intrinsics.d(this.f39408g, fareMediumConfigurations.f39408g) && Intrinsics.d(this.f39409h, fareMediumConfigurations.f39409h);
    }

    public final Integer f() {
        return this.f39403b;
    }

    public final Integer g() {
        return this.f39404c;
    }

    public final Integer h() {
        return this.f39402a;
    }

    public int hashCode() {
        Integer num = this.f39402a;
        int i2 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f39403b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39404c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f39405d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f39406e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list = this.f39407f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f39408g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.f39409h;
        if (num6 != null) {
            i2 = num6.hashCode();
        }
        return hashCode7 + i2;
    }

    public final List i() {
        return this.f39407f;
    }

    public String toString() {
        return "FareMediumConfigurations(minTopUp=" + this.f39402a + ", maxTopUp=" + this.f39403b + ", minAutoloadTopUp=" + this.f39404c + ", defaultThresholdAutoloadTopUp=" + this.f39405d + ", maxBalance=" + this.f39406e + ", topUpOptions=" + this.f39407f + ", fixedAutoloadAmountOptions=" + this.f39408g + ", maxInstitutions=" + this.f39409h + ')';
    }
}
