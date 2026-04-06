package com.hansecom.abt.presentation.screens.home.account;

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
public final class AccountDestination implements NavBarsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35040a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f35041b;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AccountDestination> serializer() {
            return AccountDestination$$serializer.f35042a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AccountDestination(int i2, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        this.f35040a = (i2 & 1) == 0 ? false : z2;
        if ((i2 & 2) == 0) {
            this.f35041b = true;
        } else {
            this.f35041b = z3;
        }
    }

    public static final /* synthetic */ void c(AccountDestination accountDestination, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.w(serialDescriptor, 0) || accountDestination.b()) {
            compositeEncoder.s(serialDescriptor, 0, accountDestination.b());
        }
        if (compositeEncoder.w(serialDescriptor, 1) || !accountDestination.a()) {
            compositeEncoder.s(serialDescriptor, 1, accountDestination.a());
        }
    }

    public boolean a() {
        return this.f35041b;
    }

    public boolean b() {
        return this.f35040a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDestination)) {
            return false;
        }
        AccountDestination accountDestination = (AccountDestination) obj;
        return this.f35040a == accountDestination.f35040a && this.f35041b == accountDestination.f35041b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f35040a) * 31) + Boolean.hashCode(this.f35041b);
    }

    public String toString() {
        boolean z2 = this.f35040a;
        boolean z3 = this.f35041b;
        return "AccountDestination(showTopBar=" + z2 + ", showBottomBar=" + z3 + ")";
    }

    public AccountDestination(boolean z2, boolean z3) {
        this.f35040a = z2;
        this.f35041b = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountDestination(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? true : z3);
    }
}
