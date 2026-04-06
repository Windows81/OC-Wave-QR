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

@Metadata
@Deprecated
public final class CreatePhysicalCardsAsAdmin207Response$$serializer implements GeneratedSerializer<CreatePhysicalCardsAsAdmin207Response> {

    /* renamed from: a  reason: collision with root package name */
    public static final CreatePhysicalCardsAsAdmin207Response$$serializer f39297a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CreatePhysicalCardsAsAdmin207Response$$serializer createPhysicalCardsAsAdmin207Response$$serializer = new CreatePhysicalCardsAsAdmin207Response$$serializer();
        f39297a = createPhysicalCardsAsAdmin207Response$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.CreatePhysicalCardsAsAdmin207Response", createPhysicalCardsAsAdmin207Response$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("success", true);
        pluginGeneratedSerialDescriptor.q("failure", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(AdminCreateCardsResponse$$serializer.f39187a), BuiltinSerializersKt.u(ErrorResponse$$serializer.f39321a)};
    }

    /* renamed from: f */
    public CreatePhysicalCardsAsAdmin207Response c(Decoder decoder) {
        int i2;
        ErrorResponse errorResponse;
        AdminCreateCardsResponse adminCreateCardsResponse;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            adminCreateCardsResponse = (AdminCreateCardsResponse) c2.v(a2, 0, AdminCreateCardsResponse$$serializer.f39187a, (Object) null);
            errorResponse = (ErrorResponse) c2.v(a2, 1, ErrorResponse$$serializer.f39321a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            adminCreateCardsResponse = null;
            ErrorResponse errorResponse2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    adminCreateCardsResponse = (AdminCreateCardsResponse) c2.v(a2, 0, AdminCreateCardsResponse$$serializer.f39187a, adminCreateCardsResponse);
                    i3 |= 1;
                } else if (x2 == 1) {
                    errorResponse2 = (ErrorResponse) c2.v(a2, 1, ErrorResponse$$serializer.f39321a, errorResponse2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            errorResponse = errorResponse2;
            i2 = i3;
        }
        c2.b(a2);
        return new CreatePhysicalCardsAsAdmin207Response(i2, adminCreateCardsResponse, errorResponse, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, CreatePhysicalCardsAsAdmin207Response createPhysicalCardsAsAdmin207Response) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(createPhysicalCardsAsAdmin207Response, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        CreatePhysicalCardsAsAdmin207Response.a(createPhysicalCardsAsAdmin207Response, c2, a2);
        c2.b(a2);
    }
}
