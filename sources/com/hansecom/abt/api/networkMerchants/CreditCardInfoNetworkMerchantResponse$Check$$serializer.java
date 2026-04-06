package com.hansecom.abt.api.networkMerchants;

import com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class CreditCardInfoNetworkMerchantResponse$Check$$serializer implements GeneratedSerializer<CreditCardInfoNetworkMerchantResponse.Check> {

    /* renamed from: a  reason: collision with root package name */
    public static final CreditCardInfoNetworkMerchantResponse$Check$$serializer f33141a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33142b = 8;
    private static final SerialDescriptor descriptor;

    static {
        CreditCardInfoNetworkMerchantResponse$Check$$serializer creditCardInfoNetworkMerchantResponse$Check$$serializer = new CreditCardInfoNetworkMerchantResponse$Check$$serializer();
        f33141a = creditCardInfoNetworkMerchantResponse$Check$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse.Check", creditCardInfoNetworkMerchantResponse$Check$$serializer, 6);
        pluginGeneratedSerialDescriptor.q("name", false);
        pluginGeneratedSerialDescriptor.q("account", false);
        pluginGeneratedSerialDescriptor.q("aba", false);
        pluginGeneratedSerialDescriptor.q("transit", false);
        pluginGeneratedSerialDescriptor.q("institution", false);
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
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b2, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse.Check c(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0052
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r8, r2, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.v(r1, r7, r2, r9)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.v(r1, r6, r2, r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.v(r1, r4, r2, r9)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.v(r1, r5, r2, r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r0.v(r1, r3, r2, r9)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 63
            r23 = r2
            r17 = r3
            r21 = r4
            r22 = r5
            r20 = r6
            r19 = r7
            r18 = r8
            goto L_0x00c6
        L_0x0052:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0059:
            if (r15 == 0) goto L_0x00b8
            int r8 = r0.x(r1)
            switch(r8) {
                case -1: goto L_0x00b4;
                case 0: goto L_0x00a5;
                case 1: goto L_0x0099;
                case 2: goto L_0x008d;
                case 3: goto L_0x0081;
                case 4: goto L_0x0075;
                case 5: goto L_0x0068;
                default: goto L_0x0062;
            }
        L_0x0062:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0068:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r3, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 32
        L_0x0073:
            r8 = 0
            goto L_0x0059
        L_0x0075:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 16
            goto L_0x0073
        L_0x0081:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 8
            goto L_0x0073
        L_0x008d:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r6, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 4
            goto L_0x0073
        L_0x0099:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r7, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 2
            goto L_0x0073
        L_0x00a5:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 0
            java.lang.Object r8 = r0.v(r1, r3, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 1
            r8 = r3
        L_0x00b2:
            r3 = 5
            goto L_0x0059
        L_0x00b4:
            r3 = 0
            r8 = r3
            r15 = r8
            goto L_0x00b2
        L_0x00b8:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x00c6:
            r0.b(r1)
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check r0 = new com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse$Check");
    }

    /* renamed from: g */
    public final void d(Encoder encoder, CreditCardInfoNetworkMerchantResponse.Check check) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(check, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        CreditCardInfoNetworkMerchantResponse.Check.c(check, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
