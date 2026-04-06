package com.hansecom.abt.presentation.model;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class InstitutionState$$serializer implements GeneratedSerializer<InstitutionState> {

    /* renamed from: a  reason: collision with root package name */
    public static final InstitutionState$$serializer f34175a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34176b = 8;
    private static final SerialDescriptor descriptor;

    static {
        InstitutionState$$serializer institutionState$$serializer = new InstitutionState$$serializer();
        f34175a = institutionState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.model.InstitutionState", institutionState$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("id", false);
        pluginGeneratedSerialDescriptor.q("name", false);
        pluginGeneratedSerialDescriptor.q("institutionType", true);
        pluginGeneratedSerialDescriptor.q("phoneNumber", true);
        pluginGeneratedSerialDescriptor.q("institutionAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{IntSerializer.f42129a, stringSerializer, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public final InstitutionState c(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            int k2 = c2.k(serialDescriptor, 0);
            String t2 = c2.t(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.f42197a;
            i2 = k2;
            str2 = (String) c2.v(serialDescriptor, 3, stringSerializer, (Object) null);
            str = (String) c2.v(serialDescriptor, 4, stringSerializer, (Object) null);
            str3 = (String) c2.v(serialDescriptor, 2, stringSerializer, (Object) null);
            str4 = t2;
            i3 = 31;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    i4 = c2.k(serialDescriptor, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    str5 = c2.t(serialDescriptor, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    str6 = (String) c2.v(serialDescriptor, 2, StringSerializer.f42197a, str6);
                    i5 |= 4;
                } else if (x2 == 3) {
                    str7 = (String) c2.v(serialDescriptor, 3, StringSerializer.f42197a, str7);
                    i5 |= 8;
                } else if (x2 == 4) {
                    str8 = (String) c2.v(serialDescriptor, 4, StringSerializer.f42197a, str8);
                    i5 |= 16;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i4;
            i3 = i5;
            str4 = str5;
            str3 = str6;
            str2 = str7;
            str = str8;
        }
        c2.b(serialDescriptor);
        return new InstitutionState(i3, i2, str4, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, InstitutionState institutionState) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(institutionState, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        InstitutionState.f(institutionState, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
