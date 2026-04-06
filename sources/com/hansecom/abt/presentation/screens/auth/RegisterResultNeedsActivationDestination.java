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
public final class RegisterResultNeedsActivationDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f34265a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RegisterResultNeedsActivationDestination> serializer() {
            return RegisterResultNeedsActivationDestination$$serializer.f34266a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RegisterResultNeedsActivationDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, RegisterResultNeedsActivationDestination$$serializer.f34266a.a());
        }
        this.f34265a = str;
    }

    public final String a() {
        return this.f34265a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisterResultNeedsActivationDestination) && Intrinsics.d(this.f34265a, ((RegisterResultNeedsActivationDestination) obj).f34265a);
    }

    public int hashCode() {
        return this.f34265a.hashCode();
    }

    public String toString() {
        String str = this.f34265a;
        return "RegisterResultNeedsActivationDestination(email=" + str + ")";
    }

    public RegisterResultNeedsActivationDestination(String str) {
        Intrinsics.i(str, "email");
        this.f34265a = str;
    }
}
