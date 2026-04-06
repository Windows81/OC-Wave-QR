package com.hansecom.abt.presentation.screens.home.faremedia;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class FareMediaAddValuePaymentCashBarcodeDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f35930a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FareMediaAddValuePaymentCashBarcodeDestination> serializer() {
            return FareMediaAddValuePaymentCashBarcodeDestination$$serializer.f35931a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FareMediaAddValuePaymentCashBarcodeDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, FareMediaAddValuePaymentCashBarcodeDestination$$serializer.f35931a.a());
        }
        this.f35930a = str;
    }

    public final String a() {
        return this.f35930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FareMediaAddValuePaymentCashBarcodeDestination) && Intrinsics.d(this.f35930a, ((FareMediaAddValuePaymentCashBarcodeDestination) obj).f35930a);
    }

    public int hashCode() {
        return this.f35930a.hashCode();
    }

    public String toString() {
        String str = this.f35930a;
        return "FareMediaAddValuePaymentCashBarcodeDestination(fareMediaId=" + str + ")";
    }

    public FareMediaAddValuePaymentCashBarcodeDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f35930a = str;
    }
}
