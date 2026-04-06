package com.hansecom.abt.presentation.screens.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class ResetPasswordSuccessDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f34269a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ResetPasswordSuccessDestination> serializer() {
            return ResetPasswordSuccessDestination$$serializer.f34270a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ResetPasswordSuccessDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, ResetPasswordSuccessDestination$$serializer.f34270a.a());
        }
        this.f34269a = str;
    }

    public final String a() {
        return this.f34269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetPasswordSuccessDestination) && Intrinsics.d(this.f34269a, ((ResetPasswordSuccessDestination) obj).f34269a);
    }

    public int hashCode() {
        return this.f34269a.hashCode();
    }

    public String toString() {
        String str = this.f34269a;
        return "ResetPasswordSuccessDestination(email=" + str + ")";
    }

    public ResetPasswordSuccessDestination(String str) {
        Intrinsics.i(str, "email");
        this.f34269a = str;
    }
}
