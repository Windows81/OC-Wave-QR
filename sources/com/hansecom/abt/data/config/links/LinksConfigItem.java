package com.hansecom.abt.data.config.links;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
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
public final class LinksConfigItem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33207a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33208b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33209c;

    /* renamed from: d  reason: collision with root package name */
    public final StringValue f33210d;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<LinksConfigItem> serializer() {
            return LinksConfigItem$$serializer.f33211a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LinksConfigItem(int i2, String str, String str2, String str3, StringValue stringValue, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i2 & 15)) {
            PluginExceptionsKt.a(i2, 15, LinksConfigItem$$serializer.f33211a.a());
        }
        this.f33207a = str;
        this.f33208b = str2;
        this.f33209c = str3;
        this.f33210d = stringValue;
    }

    public static final /* synthetic */ void e(LinksConfigItem linksConfigItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, linksConfigItem.f33207a);
        compositeEncoder.t(serialDescriptor, 1, linksConfigItem.f33208b);
        compositeEncoder.m(serialDescriptor, 2, StringSerializer.f42197a, linksConfigItem.f33209c);
        compositeEncoder.m(serialDescriptor, 3, StringValueSerializer.f39098a, linksConfigItem.f33210d);
    }

    public final String a() {
        return this.f33209c;
    }

    public final String b() {
        return this.f33207a;
    }

    public final StringValue c() {
        return this.f33210d;
    }

    public final String d() {
        return this.f33208b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinksConfigItem)) {
            return false;
        }
        LinksConfigItem linksConfigItem = (LinksConfigItem) obj;
        return Intrinsics.d(this.f33207a, linksConfigItem.f33207a) && Intrinsics.d(this.f33208b, linksConfigItem.f33208b) && Intrinsics.d(this.f33209c, linksConfigItem.f33209c) && Intrinsics.d(this.f33210d, linksConfigItem.f33210d);
    }

    public int hashCode() {
        int hashCode = ((this.f33207a.hashCode() * 31) + this.f33208b.hashCode()) * 31;
        String str = this.f33209c;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringValue stringValue = this.f33210d;
        if (stringValue != null) {
            i2 = stringValue.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        String str = this.f33207a;
        String str2 = this.f33208b;
        String str3 = this.f33209c;
        StringValue stringValue = this.f33210d;
        return "LinksConfigItem(name=" + str + ", url=" + str2 + ", fallbackUrl=" + str3 + ", titleKey=" + stringValue + ")";
    }
}
