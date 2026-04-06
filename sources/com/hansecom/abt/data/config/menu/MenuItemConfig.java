package com.hansecom.abt.data.config.menu;

import com.hansecom.abt.data.config.menu.MenuItemSelector;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Serializable
public final class MenuItemConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f33232i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer[] f33233j;

    /* renamed from: a  reason: collision with root package name */
    public final String f33234a;

    /* renamed from: b  reason: collision with root package name */
    public final StringValue f33235b;

    /* renamed from: c  reason: collision with root package name */
    public final MenuItemType f33236c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33237d;

    /* renamed from: e  reason: collision with root package name */
    public final List f33238e;

    /* renamed from: f  reason: collision with root package name */
    public final String f33239f;

    /* renamed from: g  reason: collision with root package name */
    public final List f33240g;

    /* renamed from: h  reason: collision with root package name */
    public final List f33241h;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<MenuItemConfig> serializer() {
            return MenuItemConfig$$serializer.f33242a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        KSerializer<MenuItemType> serializer = MenuItemType.Companion.serializer();
        MenuItemSelector.Companion companion = MenuItemSelector.Companion;
        f33233j = new KSerializer[]{null, null, serializer, null, null, null, new ArrayListSerializer(companion.serializer()), new ArrayListSerializer(companion.serializer())};
    }

    public /* synthetic */ MenuItemConfig(int i2, String str, StringValue stringValue, MenuItemType menuItemType, String str2, List list, String str3, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i2 & 2)) {
            PluginExceptionsKt.a(i2, 2, MenuItemConfig$$serializer.f33242a.a());
        }
        if ((i2 & 1) == 0) {
            this.f33234a = null;
        } else {
            this.f33234a = str;
        }
        this.f33235b = stringValue;
        if ((i2 & 4) == 0) {
            this.f33236c = MenuItemType.UNKNOWN;
        } else {
            this.f33236c = menuItemType;
        }
        if ((i2 & 8) == 0) {
            this.f33237d = null;
        } else {
            this.f33237d = str2;
        }
        if ((i2 & 16) == 0) {
            this.f33238e = null;
        } else {
            this.f33238e = list;
        }
        if ((i2 & 32) == 0) {
            this.f33239f = null;
        } else {
            this.f33239f = str3;
        }
        if ((i2 & 64) == 0) {
            this.f33240g = CollectionsKt.e(MenuItemSelector.ALL);
        } else {
            this.f33240g = list2;
        }
        if ((i2 & 128) == 0) {
            this.f33241h = CollectionsKt.e(MenuItemSelector.ALL);
        } else {
            this.f33241h = list3;
        }
    }

    public static final /* synthetic */ void j(MenuItemConfig menuItemConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f33233j;
        if (compositeEncoder.w(serialDescriptor, 0) || menuItemConfig.f33234a != null) {
            compositeEncoder.m(serialDescriptor, 0, StringSerializer.f42197a, menuItemConfig.f33234a);
        }
        compositeEncoder.A(serialDescriptor, 1, StringValueSerializer.f39098a, menuItemConfig.f33235b);
        if (compositeEncoder.w(serialDescriptor, 2) || menuItemConfig.f33236c != MenuItemType.UNKNOWN) {
            compositeEncoder.A(serialDescriptor, 2, kSerializerArr[2], menuItemConfig.f33236c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || menuItemConfig.f33237d != null) {
            compositeEncoder.m(serialDescriptor, 3, StringSerializer.f42197a, menuItemConfig.f33237d);
        }
        if (compositeEncoder.w(serialDescriptor, 4) || menuItemConfig.f33238e != null) {
            compositeEncoder.m(serialDescriptor, 4, new ArrayListSerializer(MenuItemConfig$$serializer.f33242a), menuItemConfig.f33238e);
        }
        if (compositeEncoder.w(serialDescriptor, 5) || menuItemConfig.f33239f != null) {
            compositeEncoder.m(serialDescriptor, 5, StringSerializer.f42197a, menuItemConfig.f33239f);
        }
        if (compositeEncoder.w(serialDescriptor, 6) || !Intrinsics.d(menuItemConfig.f33240g, CollectionsKt.e(MenuItemSelector.ALL))) {
            compositeEncoder.A(serialDescriptor, 6, kSerializerArr[6], menuItemConfig.f33240g);
        }
        if (compositeEncoder.w(serialDescriptor, 7) || !Intrinsics.d(menuItemConfig.f33241h, CollectionsKt.e(MenuItemSelector.ALL))) {
            compositeEncoder.A(serialDescriptor, 7, kSerializerArr[7], menuItemConfig.f33241h);
        }
    }

    public final String b() {
        return this.f33237d;
    }

    public final List c() {
        return this.f33241h;
    }

    public final String d() {
        return this.f33234a;
    }

    public final List e() {
        return this.f33238e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemConfig)) {
            return false;
        }
        MenuItemConfig menuItemConfig = (MenuItemConfig) obj;
        return Intrinsics.d(this.f33234a, menuItemConfig.f33234a) && Intrinsics.d(this.f33235b, menuItemConfig.f33235b) && this.f33236c == menuItemConfig.f33236c && Intrinsics.d(this.f33237d, menuItemConfig.f33237d) && Intrinsics.d(this.f33238e, menuItemConfig.f33238e) && Intrinsics.d(this.f33239f, menuItemConfig.f33239f) && Intrinsics.d(this.f33240g, menuItemConfig.f33240g) && Intrinsics.d(this.f33241h, menuItemConfig.f33241h);
    }

    public final StringValue f() {
        return this.f33235b;
    }

    public final MenuItemType g() {
        return this.f33236c;
    }

    public final String h() {
        return this.f33239f;
    }

    public int hashCode() {
        String str = this.f33234a;
        int i2 = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f33235b.hashCode()) * 31) + this.f33236c.hashCode()) * 31;
        String str2 = this.f33237d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f33238e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f33239f;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode3 + i2) * 31) + this.f33240g.hashCode()) * 31) + this.f33241h.hashCode();
    }

    public final List i() {
        return this.f33240g;
    }

    public String toString() {
        String str = this.f33234a;
        StringValue stringValue = this.f33235b;
        MenuItemType menuItemType = this.f33236c;
        String str2 = this.f33237d;
        List list = this.f33238e;
        String str3 = this.f33239f;
        List list2 = this.f33240g;
        List list3 = this.f33241h;
        return "MenuItemConfig(icon=" + str + ", titleKey=" + stringValue + ", type=" + menuItemType + ", action=" + str2 + ", subItems=" + list + ", url=" + str3 + ", visible=" + list2 + ", enabled=" + list3 + ")";
    }
}
