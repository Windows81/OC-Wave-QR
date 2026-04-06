package com.hansecom.mapi.models;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class Country$$serializer implements GeneratedSerializer<Country> {

    /* renamed from: a  reason: collision with root package name */
    public static final Country$$serializer f39291a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Country$$serializer country$$serializer = new Country$$serializer();
        f39291a = country$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.Country", country$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("countryId", true);
        pluginGeneratedSerialDescriptor.q("countryName", true);
        pluginGeneratedSerialDescriptor.q("hasStates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a), BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(BooleanSerializer.f42073a)};
    }

    /* renamed from: f */
    public Country c(Decoder decoder) {
        Boolean bool;
        String str;
        Integer num;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        Integer num2 = null;
        if (c2.y()) {
            num = (Integer) c2.v(a2, 0, IntSerializer.f42129a, (Object) null);
            bool = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, (Object) null);
            str = (String) c2.v(a2, 1, StringSerializer.f42197a, (Object) null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str2 = null;
            Boolean bool2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    num2 = (Integer) c2.v(a2, 0, IntSerializer.f42129a, num2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str2 = (String) c2.v(a2, 1, StringSerializer.f42197a, str2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    bool2 = (Boolean) c2.v(a2, 2, BooleanSerializer.f42073a, bool2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            num = num2;
            str = str2;
            bool = bool2;
        }
        c2.b(a2);
        return new Country(i2, num, str, bool, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, Country country) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(country, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        Country.d(country, c2, a2);
        c2.b(a2);
    }
}
