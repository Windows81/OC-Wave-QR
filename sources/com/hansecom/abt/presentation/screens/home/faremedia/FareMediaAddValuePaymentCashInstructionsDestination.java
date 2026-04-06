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
public final class FareMediaAddValuePaymentCashInstructionsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f35933a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FareMediaAddValuePaymentCashInstructionsDestination> serializer() {
            return FareMediaAddValuePaymentCashInstructionsDestination$$serializer.f35934a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FareMediaAddValuePaymentCashInstructionsDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, FareMediaAddValuePaymentCashInstructionsDestination$$serializer.f35934a.a());
        }
        this.f35933a = str;
    }

    public final String a() {
        return this.f35933a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FareMediaAddValuePaymentCashInstructionsDestination) && Intrinsics.d(this.f35933a, ((FareMediaAddValuePaymentCashInstructionsDestination) obj).f35933a);
    }

    public int hashCode() {
        return this.f35933a.hashCode();
    }

    public String toString() {
        String str = this.f35933a;
        return "FareMediaAddValuePaymentCashInstructionsDestination(fareMediaId=" + str + ")";
    }

    public FareMediaAddValuePaymentCashInstructionsDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f35933a = str;
    }
}
