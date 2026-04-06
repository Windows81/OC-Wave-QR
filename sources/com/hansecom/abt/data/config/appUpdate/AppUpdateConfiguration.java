package com.hansecom.abt.data.config.appUpdate;

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
public final class AppUpdateConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f33179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33180b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AppUpdateConfiguration> serializer() {
            return AppUpdateConfiguration$$serializer.f33181a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AppUpdateConfiguration(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, AppUpdateConfiguration$$serializer.f33181a.a());
        }
        this.f33179a = str;
        this.f33180b = str2;
    }

    public static final /* synthetic */ void c(AppUpdateConfiguration appUpdateConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        compositeEncoder.m(serialDescriptor, 0, stringSerializer, appUpdateConfiguration.f33179a);
        compositeEncoder.m(serialDescriptor, 1, stringSerializer, appUpdateConfiguration.f33180b);
    }

    public final String a() {
        return this.f33180b;
    }

    public final String b() {
        return this.f33179a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppUpdateConfiguration)) {
            return false;
        }
        AppUpdateConfiguration appUpdateConfiguration = (AppUpdateConfiguration) obj;
        return Intrinsics.d(this.f33179a, appUpdateConfiguration.f33179a) && Intrinsics.d(this.f33180b, appUpdateConfiguration.f33180b);
    }

    public int hashCode() {
        String str = this.f33179a;
        int i2 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33180b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        String str = this.f33179a;
        String str2 = this.f33180b;
        return "AppUpdateConfiguration(softUpdateVersion=" + str + ", hardUpdateVersion=" + str2 + ")";
    }

    public AppUpdateConfiguration(String str, String str2) {
        this.f33179a = str;
        this.f33180b = str2;
    }
}
