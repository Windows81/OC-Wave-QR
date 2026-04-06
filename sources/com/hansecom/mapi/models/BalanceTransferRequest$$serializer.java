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
public final class BalanceTransferRequest$$serializer implements GeneratedSerializer<BalanceTransferRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final BalanceTransferRequest$$serializer f39220a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BalanceTransferRequest$$serializer balanceTransferRequest$$serializer = new BalanceTransferRequest$$serializer();
        f39220a = balanceTransferRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.BalanceTransferRequest", balanceTransferRequest$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("recipientCardId", true);
        pluginGeneratedSerialDescriptor.q("transferAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(IntSerializer.f42129a)};
    }

    /* renamed from: f */
    public BalanceTransferRequest c(Decoder decoder) {
        int i2;
        Integer num;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor a2 = a();
        CompositeDecoder c2 = decoder.c(a2);
        if (c2.y()) {
            str = (String) c2.v(a2, 0, StringSerializer.f42197a, (Object) null);
            num = (Integer) c2.v(a2, 1, IntSerializer.f42129a, (Object) null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str = null;
            Integer num2 = null;
            while (z2) {
                int x2 = c2.x(a2);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str = (String) c2.v(a2, 0, StringSerializer.f42197a, str);
                    i3 |= 1;
                } else if (x2 == 1) {
                    num2 = (Integer) c2.v(a2, 1, IntSerializer.f42129a, num2);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            num = num2;
            i2 = i3;
        }
        c2.b(a2);
        return new BalanceTransferRequest(i2, str, num, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public void d(Encoder encoder, BalanceTransferRequest balanceTransferRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(balanceTransferRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        BalanceTransferRequest.a(balanceTransferRequest, c2, a2);
        c2.b(a2);
    }
}
