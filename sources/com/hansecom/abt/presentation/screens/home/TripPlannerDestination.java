package com.hansecom.abt.presentation.screens.home;

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
public final class TripPlannerDestination implements NavBarsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35008a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f35009b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<TripPlannerDestination> serializer() {
            return TripPlannerDestination$$serializer.f35010a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TripPlannerDestination(int i2, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.f35008a = (i2 & 1) == 0 ? false : z2;
        if ((i2 & 2) == 0) {
            this.f35009b = true;
        } else {
            this.f35009b = z3;
        }
    }

    public static final /* synthetic */ void c(TripPlannerDestination tripPlannerDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || tripPlannerDestination.b()) {
            compositeEncoder.s(serialDescriptor, 0, tripPlannerDestination.b());
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !tripPlannerDestination.a()) {
            compositeEncoder.s(serialDescriptor, 1, tripPlannerDestination.a());
        }
    }

    public boolean a() {
        return this.f35009b;
    }

    public boolean b() {
        return this.f35008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerDestination)) {
            return false;
        }
        TripPlannerDestination tripPlannerDestination = (TripPlannerDestination) obj;
        return this.f35008a == tripPlannerDestination.f35008a && this.f35009b == tripPlannerDestination.f35009b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f35008a) * 31) + Boolean.hashCode(this.f35009b);
    }

    public String toString() {
        boolean z2 = this.f35008a;
        boolean z3 = this.f35009b;
        return "TripPlannerDestination(showTopBar=" + z2 + ", showBottomBar=" + z3 + ")";
    }

    public TripPlannerDestination(boolean z2, boolean z3) {
        this.f35008a = z2;
        this.f35009b = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TripPlannerDestination(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3);
    }
}
