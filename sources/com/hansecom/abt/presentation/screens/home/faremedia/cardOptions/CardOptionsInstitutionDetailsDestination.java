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
public final class CardOptionsInstitutionDetailsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36524a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36525b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CardOptionsInstitutionDetailsDestination> serializer() {
            return CardOptionsInstitutionDetailsDestination$$serializer.f36526a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardOptionsInstitutionDetailsDestination(int i2, String str, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.a(i2, 3, CardOptionsInstitutionDetailsDestination$$serializer.f36526a.a());
        }
        this.f36524a = str;
        this.f36525b = i3;
    }

    public static final /* synthetic */ void c(CardOptionsInstitutionDetailsDestination cardOptionsInstitutionDetailsDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.t(serialDescriptor, 0, cardOptionsInstitutionDetailsDestination.f36524a);
        compositeEncoder.r(serialDescriptor, 1, cardOptionsInstitutionDetailsDestination.f36525b);
    }

    public final String a() {
        return this.f36524a;
    }

    public final int b() {
        return this.f36525b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardOptionsInstitutionDetailsDestination)) {
            return false;
        }
        CardOptionsInstitutionDetailsDestination cardOptionsInstitutionDetailsDestination = (CardOptionsInstitutionDetailsDestination) obj;
        return Intrinsics.d(this.f36524a, cardOptionsInstitutionDetailsDestination.f36524a) && this.f36525b == cardOptionsInstitutionDetailsDestination.f36525b;
    }

    public int hashCode() {
        return (this.f36524a.hashCode() * 31) + Integer.hashCode(this.f36525b);
    }

    public String toString() {
        String str = this.f36524a;
        int i2 = this.f36525b;
        return "CardOptionsInstitutionDetailsDestination(fareMediaId=" + str + ", institutionId=" + i2 + ")";
    }

    public CardOptionsInstitutionDetailsDestination(String str, int i2) {
        Intrinsics.i(str, "fareMediaId");
        this.f36524a = str;
        this.f36525b = i2;
    }
}
