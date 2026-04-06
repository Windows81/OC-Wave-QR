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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class AdminLinkInstitutionRequest$$serializer implements GeneratedSerializer<AdminLinkInstitutionRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final AdminLinkInstitutionRequest$$serializer f39199a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AdminLinkInstitutionRequest$$serializer adminLinkInstitutionRequest$$serializer = new AdminLinkInstitutionRequest$$serializer();
        f39199a = adminLinkInstitutionRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AdminLinkInstitutionRequest", adminLinkInstitutionRequest$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("institutionId", false);
        pluginGeneratedSerialDescriptor.q("email", false);
        pluginGeneratedSerialDescriptor.q("cardId", true);
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
        return new KSerializer[]{IntSerializer.f42129a, stringSerializer, BuiltinSerializersKt.u(stringSerializer)};
    }

    /* renamed from: f */
    public AdminLinkInstitutionRequest c(Decoder decoder) {
        String str;
        String str2;
        int i2;
        int i3;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder2.c(a2);
        if (c2.y()) {
            int k2 = c2.k(a2, 0);
            String t2 = c2.t(a2, 1);
            i2 = k2;
            str = (String) c2.v(a2, 2, StringSerializer.f42197a, (Object) null);
            str2 = t2;
            i3 = 7;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str3 = null;
            String str4 = null;
            int i5 = 0;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    i4 = c2.k(a2, 0);
                    i5 |= 1;
                } else if (x2 == 1) {
                    str3 = c2.t(a2, 1);
                    i5 |= 2;
                } else if (x2 == 2) {
                    str4 = (String) c2.v(a2, 2, StringSerializer.f42197a, str4);
                    i5 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i4;
            i3 = i5;
            str2 = str3;
            str = str4;
        }
        c2.b(a2);
        return new AdminLinkInstitutionRequest(i3, i2, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, AdminLinkInstitutionRequest adminLinkInstitutionRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(adminLinkInstitutionRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AdminLinkInstitutionRequest.a(adminLinkInstitutionRequest, c2, a2);
        c2.b(a2);
    }
}
