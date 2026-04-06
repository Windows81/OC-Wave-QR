package com.hansecom.abt.presentation.screens.home.account;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class AccountPaymentMethodDetailsDestination$$serializer implements GeneratedSerializer<AccountPaymentMethodDetailsDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final AccountPaymentMethodDetailsDestination$$serializer f35055a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f35056b = 8;
    private static final SerialDescriptor descriptor;

    static {
        AccountPaymentMethodDetailsDestination$$serializer accountPaymentMethodDetailsDestination$$serializer = new AccountPaymentMethodDetailsDestination$$serializer();
        f35055a = accountPaymentMethodDetailsDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.account.AccountPaymentMethodDetailsDestination", accountPaymentMethodDetailsDestination$$serializer, 1);
        pluginGeneratedSerialDescriptor.q("cardId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{LongSerializer.f42142a};
    }

    /* renamed from: f */
    public final AccountPaymentMethodDetailsDestination c(Decoder decoder) {
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        int i2 = 1;
        if (c2.y()) {
            j2 = c2.h(serialDescriptor, 0);
        } else {
            long j3 = 0;
            boolean z2 = true;
            int i3 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    j3 = c2.h(serialDescriptor, 0);
                    i3 = 1;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            j2 = j3;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new AccountPaymentMethodDetailsDestination(i2, j2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, AccountPaymentMethodDetailsDestination accountPaymentMethodDetailsDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(accountPaymentMethodDetailsDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        c2.E(serialDescriptor, 0, accountPaymentMethodDetailsDestination.f35054a);
        c2.b(serialDescriptor);
    }
}
