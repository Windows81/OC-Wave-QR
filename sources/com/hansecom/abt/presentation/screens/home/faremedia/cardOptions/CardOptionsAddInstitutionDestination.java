package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class CardOptionsAddInstitutionDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36484a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36485b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsAddInstitutionDestination> serializer() {
            return CardOptionsAddInstitutionDestination$$serializer.f36486a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsAddInstitutionDestination(int i2, String str, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, CardOptionsAddInstitutionDestination$$serializer.f36486a.a());
        }
        this.f36484a = str;
        this.f36485b = i3;
    }

    public static final /* synthetic */ void a(CardOptionsAddInstitutionDestination cardOptionsAddInstitutionDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, cardOptionsAddInstitutionDestination.f36484a);
        compositeEncoder.r(serialDescriptor, 1, cardOptionsAddInstitutionDestination.f36485b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardOptionsAddInstitutionDestination)) {
            return false;
        }
        CardOptionsAddInstitutionDestination cardOptionsAddInstitutionDestination = (CardOptionsAddInstitutionDestination) obj;
        return Intrinsics.d(this.f36484a, cardOptionsAddInstitutionDestination.f36484a) && this.f36485b == cardOptionsAddInstitutionDestination.f36485b;
    }

    public int hashCode() {
        return (this.f36484a.hashCode() * 31) + Integer.hashCode(this.f36485b);
    }

    public String toString() {
        String str = this.f36484a;
        int i2 = this.f36485b;
        return "CardOptionsAddInstitutionDestination(fareMediaId=" + str + ", institutionId=" + i2 + ")";
    }

    public CardOptionsAddInstitutionDestination(String str, int i2) {
        Intrinsics.i(str, "fareMediaId");
        this.f36484a = str;
        this.f36485b = i2;
    }
}
