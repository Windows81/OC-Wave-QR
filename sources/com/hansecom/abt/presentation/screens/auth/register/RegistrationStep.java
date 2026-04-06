package com.hansecom.abt.presentation.screens.auth.register;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
public interface RegistrationStep {

    @Metadata
    @Serializable
    public static final class ChooseQuestion implements RegistrationStep {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f34431a;

        @Metadata
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<ChooseQuestion> serializer() {
                return RegistrationStep$ChooseQuestion$$serializer.f34429a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ChooseQuestion(int i2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i2 & 1)) {
                PluginExceptionsKt.a(i2, 1, RegistrationStep$ChooseQuestion$$serializer.f34429a.a());
            }
            this.f34431a = z2;
        }

        public final boolean a() {
            return this.f34431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChooseQuestion) && this.f34431a == ((ChooseQuestion) obj).f34431a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f34431a);
        }

        public String toString() {
            boolean z2 = this.f34431a;
            return "ChooseQuestion(secondQuestion=" + z2 + ")";
        }

        public ChooseQuestion(boolean z2) {
            this.f34431a = z2;
        }
    }

    @Metadata
    @Serializable
    public static final class Questions implements RegistrationStep {
        public static final Questions INSTANCE = new Questions();

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Lazy f34432a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new O());

        public static final /* synthetic */ KSerializer b() {
            return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.register.RegistrationStep.Questions", INSTANCE, new Annotation[0]);
        }

        public final /* synthetic */ KSerializer c() {
            return (KSerializer) f34432a.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Questions);
        }

        public int hashCode() {
            return 1037228386;
        }

        public final KSerializer<Questions> serializer() {
            return c();
        }

        public String toString() {
            return "Questions";
        }
    }

    @Metadata
    @Serializable
    public static final class UserInfo implements RegistrationStep {
        public static final UserInfo INSTANCE = new UserInfo();

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Lazy f34433a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new P());

        /* access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return new ObjectSerializer("com.hansecom.abt.presentation.screens.auth.register.RegistrationStep.UserInfo", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer c() {
            return (KSerializer) f34433a.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UserInfo);
        }

        public int hashCode() {
            return 1486714980;
        }

        public final KSerializer<UserInfo> serializer() {
            return c();
        }

        public String toString() {
            return "UserInfo";
        }
    }
}
