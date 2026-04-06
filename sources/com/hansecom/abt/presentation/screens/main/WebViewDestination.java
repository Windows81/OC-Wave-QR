package com.hansecom.abt.presentation.screens.main;

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
public final class WebViewDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f37596a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37597b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<WebViewDestination> serializer() {
            return WebViewDestination$$serializer.f37598a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WebViewDestination(int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, WebViewDestination$$serializer.f37598a.a());
        }
        this.f37596a = str;
        if ((i2 & 2) == 0) {
            this.f37597b = "";
        } else {
            this.f37597b = str2;
        }
    }

    public static final /* synthetic */ void c(WebViewDestination webViewDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, webViewDestination.f37596a);
        if (compositeEncoder.w(serialDescriptor, 1) || !Intrinsics.d(webViewDestination.f37597b, "")) {
            compositeEncoder.m(serialDescriptor, 1, StringSerializer.f42197a, webViewDestination.f37597b);
        }
    }

    public final String a() {
        return this.f37597b;
    }

    public final String b() {
        return this.f37596a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewDestination)) {
            return false;
        }
        WebViewDestination webViewDestination = (WebViewDestination) obj;
        return Intrinsics.d(this.f37596a, webViewDestination.f37596a) && Intrinsics.d(this.f37597b, webViewDestination.f37597b);
    }

    public int hashCode() {
        int hashCode = this.f37596a.hashCode() * 31;
        String str = this.f37597b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f37596a;
        String str2 = this.f37597b;
        return "WebViewDestination(url=" + str + ", title=" + str2 + ")";
    }

    public WebViewDestination(String str, String str2) {
        Intrinsics.i(str, "url");
        this.f37596a = str;
        this.f37597b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewDestination(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2);
    }
}
