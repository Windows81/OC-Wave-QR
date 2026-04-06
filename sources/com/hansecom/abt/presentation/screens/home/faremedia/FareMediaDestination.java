package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.navigation.NavBarsDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class FareMediaDestination implements NavBarsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35937a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f35938b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FareMediaDestination> serializer() {
            return FareMediaDestination$$serializer.f35939a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FareMediaDestination(int i2, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.f35937a = (i2 & 1) == 0 ? false : z2;
        if ((i2 & 2) == 0) {
            this.f35938b = true;
        } else {
            this.f35938b = z3;
        }
    }

    public static final /* synthetic */ void c(FareMediaDestination fareMediaDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || fareMediaDestination.b()) {
            compositeEncoder.s(serialDescriptor, 0, fareMediaDestination.b());
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !fareMediaDestination.a()) {
            compositeEncoder.s(serialDescriptor, 1, fareMediaDestination.a());
        }
    }

    public boolean a() {
        return this.f35938b;
    }

    public boolean b() {
        return this.f35937a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMediaDestination)) {
            return false;
        }
        FareMediaDestination fareMediaDestination = (FareMediaDestination) obj;
        return this.f35937a == fareMediaDestination.f35937a && this.f35938b == fareMediaDestination.f35938b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f35937a) * 31) + Boolean.hashCode(this.f35938b);
    }

    public String toString() {
        boolean z2 = this.f35937a;
        boolean z3 = this.f35938b;
        return "FareMediaDestination(showTopBar=" + z2 + ", showBottomBar=" + z3 + ")";
    }

    public FareMediaDestination(boolean z2, boolean z3) {
        this.f35937a = z2;
        this.f35938b = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FareMediaDestination(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3);
    }
}
