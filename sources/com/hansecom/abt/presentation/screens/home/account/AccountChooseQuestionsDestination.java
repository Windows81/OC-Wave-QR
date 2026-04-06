package com.hansecom.abt.presentation.screens.home.account;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class AccountChooseQuestionsDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35037a;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AccountChooseQuestionsDestination> serializer() {
            return AccountChooseQuestionsDestination$$serializer.f35038a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AccountChooseQuestionsDestination(int i2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.a(i2, 1, AccountChooseQuestionsDestination$$serializer.f35038a.a());
        }
        this.f35037a = z2;
    }

    public final boolean a() {
        return this.f35037a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountChooseQuestionsDestination) && this.f35037a == ((AccountChooseQuestionsDestination) obj).f35037a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f35037a);
    }

    public String toString() {
        boolean z2 = this.f35037a;
        return "AccountChooseQuestionsDestination(secondQuestion=" + z2 + ")";
    }

    public AccountChooseQuestionsDestination(boolean z2) {
        this.f35037a = z2;
    }
}
