package com.hansecom.abt.data.config.signUp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Serializable
public final class SignUpConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33262a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f33263b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f33264c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f33265d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f33266e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f33267f;

    /* renamed from: g  reason: collision with root package name */
    public final int f33268g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f33269h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f33270i;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SignUpConfiguration> serializer() {
            return SignUpConfiguration$$serializer.f33271a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SignUpConfiguration(int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, boolean z8, boolean z9, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i2 & 511)) {
            PluginExceptionsKt.a(i2, 511, SignUpConfiguration$$serializer.f33271a.a());
        }
        this.f33262a = z2;
        this.f33263b = z3;
        this.f33264c = z4;
        this.f33265d = z5;
        this.f33266e = z6;
        this.f33267f = z7;
        this.f33268g = i3;
        this.f33269h = z8;
        this.f33270i = z9;
    }

    public static final /* synthetic */ void i(SignUpConfiguration signUpConfiguration, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.s(serialDescriptor, 0, signUpConfiguration.f33262a);
        compositeEncoder.s(serialDescriptor, 1, signUpConfiguration.f33263b);
        compositeEncoder.s(serialDescriptor, 2, signUpConfiguration.f33264c);
        compositeEncoder.s(serialDescriptor, 3, signUpConfiguration.f33265d);
        compositeEncoder.s(serialDescriptor, 4, signUpConfiguration.f33266e);
        compositeEncoder.s(serialDescriptor, 5, signUpConfiguration.f33267f);
        compositeEncoder.r(serialDescriptor, 6, signUpConfiguration.f33268g);
        compositeEncoder.s(serialDescriptor, 7, signUpConfiguration.f33269h);
        compositeEncoder.s(serialDescriptor, 8, signUpConfiguration.f33270i);
    }

    public final boolean a() {
        return this.f33269h;
    }

    public final boolean b() {
        return this.f33264c;
    }

    public final boolean c() {
        return this.f33262a;
    }

    public final boolean d() {
        return this.f33263b;
    }

    public final boolean e() {
        return this.f33266e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpConfiguration)) {
            return false;
        }
        SignUpConfiguration signUpConfiguration = (SignUpConfiguration) obj;
        return this.f33262a == signUpConfiguration.f33262a && this.f33263b == signUpConfiguration.f33263b && this.f33264c == signUpConfiguration.f33264c && this.f33265d == signUpConfiguration.f33265d && this.f33266e == signUpConfiguration.f33266e && this.f33267f == signUpConfiguration.f33267f && this.f33268g == signUpConfiguration.f33268g && this.f33269h == signUpConfiguration.f33269h && this.f33270i == signUpConfiguration.f33270i;
    }

    public final int f() {
        return this.f33268g;
    }

    public final boolean g() {
        return this.f33267f;
    }

    public final boolean h() {
        return this.f33265d;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f33262a) * 31) + Boolean.hashCode(this.f33263b)) * 31) + Boolean.hashCode(this.f33264c)) * 31) + Boolean.hashCode(this.f33265d)) * 31) + Boolean.hashCode(this.f33266e)) * 31) + Boolean.hashCode(this.f33267f)) * 31) + Integer.hashCode(this.f33268g)) * 31) + Boolean.hashCode(this.f33269h)) * 31) + Boolean.hashCode(this.f33270i);
    }

    public String toString() {
        boolean z2 = this.f33262a;
        boolean z3 = this.f33263b;
        boolean z4 = this.f33264c;
        boolean z5 = this.f33265d;
        boolean z6 = this.f33266e;
        boolean z7 = this.f33267f;
        int i2 = this.f33268g;
        boolean z8 = this.f33269h;
        boolean z9 = this.f33270i;
        return "SignUpConfiguration(firstName=" + z2 + ", lastName=" + z3 + ", emailConfirmation=" + z4 + ", passwordConfirmation=" + z5 + ", mandatoryPhoneNumber=" + z6 + ", optionalPhoneNumber=" + z7 + ", numberOfSecurityQuestions=" + i2 + ", accountPin=" + z8 + ", termsAndConditions=" + z9 + ")";
    }

    public SignUpConfiguration(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, boolean z8, boolean z9) {
        this.f33262a = z2;
        this.f33263b = z3;
        this.f33264c = z4;
        this.f33265d = z5;
        this.f33266e = z6;
        this.f33267f = z7;
        this.f33268g = i2;
        this.f33269h = z8;
        this.f33270i = z9;
    }
}
