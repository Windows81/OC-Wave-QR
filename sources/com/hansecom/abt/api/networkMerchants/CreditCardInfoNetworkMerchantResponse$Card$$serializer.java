package com.hansecom.abt.api.networkMerchants;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class CreditCardInfoNetworkMerchantResponse$Card$$serializer implements GeneratedSerializer<CreditCardInfoNetworkMerchantResponse.Card> {

    /* renamed from: a  reason: collision with root package name */
    public static final CreditCardInfoNetworkMerchantResponse$Card$$serializer f33139a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33140b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CreditCardInfoNetworkMerchantResponse$Card$$serializer creditCardInfoNetworkMerchantResponse$Card$$serializer = new CreditCardInfoNetworkMerchantResponse$Card$$serializer();
        f33139a = creditCardInfoNetworkMerchantResponse$Card$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse.Card", creditCardInfoNetworkMerchantResponse$Card$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("number", false);
        pluginGeneratedSerialDescriptor.q("bin", false);
        pluginGeneratedSerialDescriptor.q("exp", false);
        pluginGeneratedSerialDescriptor.q("type", false);
        pluginGeneratedSerialDescriptor.q("hash", false);
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
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* renamed from: f */
    public final CreditCardInfoNetworkMerchantResponse.Card c(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            String t3 = c2.t(serialDescriptor, 1);
            String t4 = c2.t(serialDescriptor, 2);
            str5 = t2;
            str2 = c2.t(serialDescriptor, 3);
            str = c2.t(serialDescriptor, 4);
            str3 = t4;
            str4 = t3;
            i2 = 31;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z2 = true;
            int i3 = 0;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str6 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str10 = c2.t(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str9 = c2.t(serialDescriptor, 2);
                    i3 |= 4;
                } else if (x2 == 3) {
                    str7 = c2.t(serialDescriptor, 3);
                    i3 |= 8;
                } else if (x2 == 4) {
                    str8 = c2.t(serialDescriptor, 4);
                    i3 |= 16;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            str5 = str6;
            str2 = str7;
            str = str8;
            str3 = str9;
            str4 = str10;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new CreditCardInfoNetworkMerchantResponse.Card(i2, str5, str4, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CreditCardInfoNetworkMerchantResponse.Card card) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(card, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CreditCardInfoNetworkMerchantResponse.Card.d(card, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
