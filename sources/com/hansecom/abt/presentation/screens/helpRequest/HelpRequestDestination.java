package com.hansecom.abt.presentation.screens.helpRequest;

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
public final class HelpRequestDestination implements NavBarsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34843a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34844b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34845c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34846d;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<HelpRequestDestination> serializer() {
            return HelpRequestDestination$$serializer.f34847a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpRequestDestination(int i2, boolean z2, boolean z3, boolean z4, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        this.f34843a = (i2 & 1) == 0 ? true : z2;
        if ((i2 & 2) == 0) {
            this.f34844b = false;
        } else {
            this.f34844b = z3;
        }
        if ((i2 & 4) == 0) {
            this.f34845c = false;
        } else {
            this.f34845c = z4;
        }
        if ((i2 & 8) == 0) {
            this.f34846d = false;
        } else {
            this.f34846d = z5;
        }
    }

    public static final /* synthetic */ void e(HelpRequestDestination helpRequestDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || !helpRequestDestination.a()) {
            compositeEncoder.s(serialDescriptor, 0, helpRequestDestination.a());
        }
        if (compositeEncoder.w(serialDescriptor, 1) || helpRequestDestination.f34844b) {
            compositeEncoder.s(serialDescriptor, 1, helpRequestDestination.f34844b);
        }
        if (compositeEncoder.w(serialDescriptor, 2) || helpRequestDestination.f34845c) {
            compositeEncoder.s(serialDescriptor, 2, helpRequestDestination.f34845c);
        }
        if (compositeEncoder.w(serialDescriptor, 3) || helpRequestDestination.c()) {
            compositeEncoder.s(serialDescriptor, 3, helpRequestDestination.c());
        }
    }

    public boolean a() {
        return this.f34843a;
    }

    public final boolean b() {
        return this.f34845c;
    }

    public boolean c() {
        return this.f34846d;
    }

    public final boolean d() {
        return this.f34844b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpRequestDestination)) {
            return false;
        }
        HelpRequestDestination helpRequestDestination = (HelpRequestDestination) obj;
        return this.f34843a == helpRequestDestination.f34843a && this.f34844b == helpRequestDestination.f34844b && this.f34845c == helpRequestDestination.f34845c && this.f34846d == helpRequestDestination.f34846d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f34843a) * 31) + Boolean.hashCode(this.f34844b)) * 31) + Boolean.hashCode(this.f34845c)) * 31) + Boolean.hashCode(this.f34846d);
    }

    public String toString() {
        boolean z2 = this.f34843a;
        boolean z3 = this.f34844b;
        boolean z4 = this.f34845c;
        boolean z5 = this.f34846d;
        return "HelpRequestDestination(showBottomBar=" + z2 + ", isGuestMode=" + z3 + ", showInternalTopBar=" + z4 + ", showTopBar=" + z5 + ")";
    }

    public HelpRequestDestination(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f34843a = z2;
        this.f34844b = z3;
        this.f34845c = z4;
        this.f34846d = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpRequestDestination(boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? false : z5);
    }
}
