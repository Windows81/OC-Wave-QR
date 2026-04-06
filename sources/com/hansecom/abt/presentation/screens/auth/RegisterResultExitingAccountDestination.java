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
public final class RegisterResultExitingAccountDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f34259a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RegisterResultExitingAccountDestination> serializer() {
            return RegisterResultExitingAccountDestination$$serializer.f34260a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RegisterResultExitingAccountDestination(int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, RegisterResultExitingAccountDestination$$serializer.f34260a.a());
        }
        this.f34259a = str;
    }

    public final String a() {
        return this.f34259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisterResultExitingAccountDestination) && Intrinsics.d(this.f34259a, ((RegisterResultExitingAccountDestination) obj).f34259a);
    }

    public int hashCode() {
        return this.f34259a.hashCode();
    }

    public String toString() {
        String str = this.f34259a;
        return "RegisterResultExitingAccountDestination(email=" + str + ")";
    }

    public RegisterResultExitingAccountDestination(String str) {
        Intrinsics.i(str, "email");
        this.f34259a = str;
    }
}
