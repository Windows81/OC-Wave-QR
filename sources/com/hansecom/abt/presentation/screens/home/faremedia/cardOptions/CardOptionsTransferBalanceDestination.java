package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardOptionsTransferBalanceDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36570a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsTransferBalanceDestination> serializer() {
            return CardOptionsTransferBalanceDestination$$serializer.f36571a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsTransferBalanceDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, CardOptionsTransferBalanceDestination$$serializer.f36571a.a());
        }
        this.f36570a = str;
    }

    public final String a() {
        return this.f36570a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardOptionsTransferBalanceDestination) && Intrinsics.d(this.f36570a, ((CardOptionsTransferBalanceDestination) obj).f36570a);
    }

    public int hashCode() {
        return this.f36570a.hashCode();
    }

    public String toString() {
        String str = this.f36570a;
        return "CardOptionsTransferBalanceDestination(fareMediaId=" + str + ")";
    }

    public CardOptionsTransferBalanceDestination(String str) {
        Intrinsics.i(str, "fareMediaId");
        this.f36570a = str;
    }
}
