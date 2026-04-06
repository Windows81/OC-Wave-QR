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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class InvoiceData$$serializer implements GeneratedSerializer<InvoiceData> {

    /* renamed from: a  reason: collision with root package name */
    public static final InvoiceData$$serializer f39493a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InvoiceData$$serializer invoiceData$$serializer = new InvoiceData$$serializer();
        f39493a = invoiceData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.InvoiceData", invoiceData$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("address", false);
        pluginGeneratedSerialDescriptor.q("firstName", true);
        pluginGeneratedSerialDescriptor.q("lastName", true);
        pluginGeneratedSerialDescriptor.q("phoneNumber", true);
        pluginGeneratedSerialDescriptor.q("email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{UserAddress$$serializer.f39673a, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public InvoiceData c(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        UserAddress userAddress;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        UserAddress userAddress2 = null;
        if (c2.y()) {
            StringSerializer stringSerializer = StringSerializer.f42197a;
            userAddress = (UserAddress) c2.m(a2, 0, UserAddress$$serializer.f39673a, (Object) null);
            str2 = (String) c2.v(a2, 3, stringSerializer, (Object) null);
            str = (String) c2.v(a2, 4, stringSerializer, (Object) null);
            str3 = (String) c2.v(a2, 2, stringSerializer, (Object) null);
            str4 = (String) c2.v(a2, 1, stringSerializer, (Object) null);
            i2 = 31;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    userAddress2 = (UserAddress) c2.m(a2, 0, UserAddress$$serializer.f39673a, userAddress2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str5 = (String) c2.v(a2, 1, StringSerializer.f42197a, str5);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str6 = (String) c2.v(a2, 2, StringSerializer.f42197a, str6);
                    i3 |= 4;
                } else if (x2 == 3) {
                    str7 = (String) c2.v(a2, 3, StringSerializer.f42197a, str7);
                    i3 |= 8;
                } else if (x2 == 4) {
                    str8 = (String) c2.v(a2, 4, StringSerializer.f42197a, str8);
                    i3 |= 16;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            userAddress = userAddress2;
            str4 = str5;
            str3 = str6;
            str2 = str7;
            str = str8;
        }
        c2.b(a2);
        return new InvoiceData(i2, userAddress, str4, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, InvoiceData invoiceData) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(invoiceData, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        InvoiceData.a(invoiceData, c2, a2);
        c2.b(a2);
    }
}
