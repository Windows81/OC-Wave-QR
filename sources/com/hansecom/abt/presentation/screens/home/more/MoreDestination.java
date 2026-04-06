package com.hansecom.abt.presentation.screens.home.more;

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
public final class MoreDestination implements NavBarsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f37426a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f37427b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<MoreDestination> serializer() {
            return MoreDestination$$serializer.f37428a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MoreDestination(int i2, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.f37426a = (i2 & 1) == 0 ? false : z2;
        if ((i2 & 2) == 0) {
            this.f37427b = true;
        } else {
            this.f37427b = z3;
        }
    }

    public static final /* synthetic */ void c(MoreDestination moreDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || moreDestination.b()) {
            compositeEncoder.s(serialDescriptor, 0, moreDestination.b());
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !moreDestination.a()) {
            compositeEncoder.s(serialDescriptor, 1, moreDestination.a());
        }
    }

    public boolean a() {
        return this.f37427b;
    }

    public boolean b() {
        return this.f37426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreDestination)) {
            return false;
        }
        MoreDestination moreDestination = (MoreDestination) obj;
        return this.f37426a == moreDestination.f37426a && this.f37427b == moreDestination.f37427b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f37426a) * 31) + Boolean.hashCode(this.f37427b);
    }

    public String toString() {
        boolean z2 = this.f37426a;
        boolean z3 = this.f37427b;
        return "MoreDestination(showTopBar=" + z2 + ", showBottomBar=" + z3 + ")";
    }

    public MoreDestination(boolean z2, boolean z3) {
        this.f37426a = z2;
        this.f37427b = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoreDestination(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3);
    }
}
