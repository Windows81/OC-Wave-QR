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
public final class RegisterResultExitingAccountNeedsActivationDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f34262a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RegisterResultExitingAccountNeedsActivationDestination> serializer() {
            return RegisterResultExitingAccountNeedsActivationDestination$$serializer.f34263a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RegisterResultExitingAccountNeedsActivationDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, RegisterResultExitingAccountNeedsActivationDestination$$serializer.f34263a.a());
        }
        this.f34262a = str;
    }

    public final String a() {
        return this.f34262a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisterResultExitingAccountNeedsActivationDestination) && Intrinsics.d(this.f34262a, ((RegisterResultExitingAccountNeedsActivationDestination) obj).f34262a);
    }

    public int hashCode() {
        return this.f34262a.hashCode();
    }

    public String toString() {
        String str = this.f34262a;
        return "RegisterResultExitingAccountNeedsActivationDestination(email=" + str + ")";
    }

    public RegisterResultExitingAccountNeedsActivationDestination(String str) {
        Intrinsics.i(str, "email");
        this.f34262a = str;
    }
}
