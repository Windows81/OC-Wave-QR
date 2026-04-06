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
public /* synthetic */ class CreditCardInfoNetworkMerchantResponse$$serializer implements GeneratedSerializer<CreditCardInfoNetworkMerchantResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final CreditCardInfoNetworkMerchantResponse$$serializer f33137a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33138b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CreditCardInfoNetworkMerchantResponse$$serializer creditCardInfoNetworkMerchantResponse$$serializer = new CreditCardInfoNetworkMerchantResponse$$serializer();
        f33137a = creditCardInfoNetworkMerchantResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse", creditCardInfoNetworkMerchantResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("tokenType", false);
        pluginGeneratedSerialDescriptor.q("token", false);
        pluginGeneratedSerialDescriptor.q("card", false);
        pluginGeneratedSerialDescriptor.q("check", false);
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
        return new KSerializer[]{stringSerializer, stringSerializer, CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a, CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a};
    }

    /* renamed from: f */
    public final CreditCardInfoNetworkMerchantResponse c(Decoder decoder) {
        CreditCardInfoNetworkMerchantResponse.Check check;
        CreditCardInfoNetworkMerchantResponse.Card card;
        String str;
        String str2;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        String str3 = null;
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            String t3 = c2.t(serialDescriptor, 1);
            str2 = t2;
            check = (CreditCardInfoNetworkMerchantResponse.Check) c2.m(serialDescriptor, 3, CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a, (Object) null);
            card = (CreditCardInfoNetworkMerchantResponse.Card) c2.m(serialDescriptor, 2, CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a, (Object) null);
            str = t3;
            i2 = 15;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str4 = null;
            CreditCardInfoNetworkMerchantResponse.Card card2 = null;
            CreditCardInfoNetworkMerchantResponse.Check check2 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str3 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str4 = c2.t(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    card2 = (CreditCardInfoNetworkMerchantResponse.Card) c2.m(serialDescriptor, 2, CreditCardInfoNetworkMerchantResponse$Card$$serializer.f33139a, card2);
                    i3 |= 4;
                } else if (x2 == 3) {
                    check2 = (CreditCardInfoNetworkMerchantResponse.Check) c2.m(serialDescriptor, 3, CreditCardInfoNetworkMerchantResponse$Check$$serializer.f33141a, check2);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str2 = str3;
            str = str4;
            card = card2;
            check = check2;
        }
        c2.b(serialDescriptor);
        return new CreditCardInfoNetworkMerchantResponse(i2, str2, str, card, check, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CreditCardInfoNetworkMerchantResponse creditCardInfoNetworkMerchantResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(creditCardInfoNetworkMerchantResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CreditCardInfoNetworkMerchantResponse.d(creditCardInfoNetworkMerchantResponse, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
