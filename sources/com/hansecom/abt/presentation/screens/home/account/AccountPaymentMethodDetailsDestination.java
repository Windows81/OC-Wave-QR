package com.hansecom.abt.presentation.screens.home.account;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class AccountPaymentMethodDetailsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f35054a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AccountPaymentMethodDetailsDestination> serializer() {
            return AccountPaymentMethodDetailsDestination$$serializer.f35055a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AccountPaymentMethodDetailsDestination(int i2, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, AccountPaymentMethodDetailsDestination$$serializer.f35055a.a());
        }
        this.f35054a = j2;
    }

    public final long a() {
        return this.f35054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountPaymentMethodDetailsDestination) && this.f35054a == ((AccountPaymentMethodDetailsDestination) obj).f35054a;
    }

    public int hashCode() {
        return Long.hashCode(this.f35054a);
    }

    public String toString() {
        long j2 = this.f35054a;
        return "AccountPaymentMethodDetailsDestination(cardId=" + j2 + ")";
    }

    public AccountPaymentMethodDetailsDestination(long j2) {
        this.f35054a = j2;
    }
}
