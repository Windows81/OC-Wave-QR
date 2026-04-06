package com.hansecom.abt.data.config.signUp;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class SignUpConfiguration$$serializer implements GeneratedSerializer<SignUpConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final SignUpConfiguration$$serializer f33271a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33272b = 8;
    private static final SerialDescriptor descriptor;

    static {
        SignUpConfiguration$$serializer signUpConfiguration$$serializer = new SignUpConfiguration$$serializer();
        f33271a = signUpConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.signUp.SignUpConfiguration", signUpConfiguration$$serializer, 9);
        pluginGeneratedSerialDescriptor.q("firstName", false);
        pluginGeneratedSerialDescriptor.q("lastName", false);
        pluginGeneratedSerialDescriptor.q("emailConfirmation", false);
        pluginGeneratedSerialDescriptor.q("passwordConfirmation", false);
        pluginGeneratedSerialDescriptor.q("mandatoryPhoneNumber", false);
        pluginGeneratedSerialDescriptor.q("optionalPhoneNumber", false);
        pluginGeneratedSerialDescriptor.q("numberOfSecurityQuestions", false);
        pluginGeneratedSerialDescriptor.q("accountPin", false);
        pluginGeneratedSerialDescriptor.q("termsAndConditions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, IntSerializer.f42129a, booleanSerializer, booleanSerializer};
    }

    /* renamed from: f */
    public final SignUpConfiguration c(Decoder decoder) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        int i4 = 0;
        if (c2.y()) {
            boolean s2 = c2.s(serialDescriptor, 0);
            boolean s3 = c2.s(serialDescriptor, 1);
            boolean s4 = c2.s(serialDescriptor, 2);
            boolean s5 = c2.s(serialDescriptor, 3);
            boolean s6 = c2.s(serialDescriptor, 4);
            boolean s7 = c2.s(serialDescriptor, 5);
            int k2 = c2.k(serialDescriptor, 6);
            z9 = s2;
            z3 = c2.s(serialDescriptor, 7);
            i2 = k2;
            z4 = s7;
            z6 = s5;
            z2 = c2.s(serialDescriptor, 8);
            z5 = s6;
            z7 = s4;
            z8 = s3;
            i3 = 511;
        } else {
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            int i5 = 0;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            while (z10) {
                int x2 = c2.x(serialDescriptor);
                switch (x2) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i4 |= 1;
                        z11 = c2.s(serialDescriptor, 0);
                        continue;
                    case 1:
                        z18 = c2.s(serialDescriptor, 1);
                        i4 |= 2;
                        continue;
                    case 2:
                        z17 = c2.s(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        z14 = c2.s(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        z16 = c2.s(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        z13 = c2.s(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        i5 = c2.k(serialDescriptor, 6);
                        i4 |= 64;
                        break;
                    case 7:
                        z12 = c2.s(serialDescriptor, 7);
                        i4 |= 128;
                        break;
                    case 8:
                        z15 = c2.s(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(x2);
                }
            }
            z9 = z11;
            i3 = i4;
            z3 = z12;
            i2 = i5;
            z4 = z13;
            z6 = z14;
            z2 = z15;
            z5 = z16;
            z7 = z17;
            z8 = z18;
        }
        c2.b(serialDescriptor);
        return new SignUpConfiguration(i3, z9, z8, z7, z6, z5, z4, i2, z3, z2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, SignUpConfiguration signUpConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(signUpConfiguration, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        SignUpConfiguration.i(signUpConfiguration, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
