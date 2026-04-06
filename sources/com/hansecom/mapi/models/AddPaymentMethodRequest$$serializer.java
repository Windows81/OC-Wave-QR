package com.hansecom.mapi.models;

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
public final class AddPaymentMethodRequest$$serializer implements GeneratedSerializer<AddPaymentMethodRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final AddPaymentMethodRequest$$serializer f39176a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AddPaymentMethodRequest$$serializer addPaymentMethodRequest$$serializer = new AddPaymentMethodRequest$$serializer();
        f39176a = addPaymentMethodRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.AddPaymentMethodRequest", addPaymentMethodRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("paymentToken", false);
        pluginGeneratedSerialDescriptor.q("cardNumber", false);
        pluginGeneratedSerialDescriptor.q("address", false);
        pluginGeneratedSerialDescriptor.q("nickname", true);
        pluginGeneratedSerialDescriptor.q("cardType", true);
        pluginGeneratedSerialDescriptor.q("expiryDate", true);
        pluginGeneratedSerialDescriptor.q("checkaba", true);
        pluginGeneratedSerialDescriptor.q("checkaccount", true);
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
        return new KSerializer[]{stringSerializer, stringSerializer, BillingAddress$$serializer.f39230a, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.hansecom.mapi.models.BillingAddress} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.AddPaymentMethodRequest c(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r29.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = r0.t(r1, r10)
            java.lang.String r9 = r0.t(r1, r9)
            com.hansecom.mapi.models.BillingAddress$$serializer r10 = com.hansecom.mapi.models.BillingAddress$$serializer.f39230a
            java.lang.Object r8 = r0.m(r1, r8, r10, r11)
            com.hansecom.mapi.models.BillingAddress r8 = (com.hansecom.mapi.models.BillingAddress) r8
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r6, r10, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.v(r1, r7, r10, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.v(r1, r5, r10, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.v(r1, r4, r10, r11)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.v(r1, r3, r10, r11)
            java.lang.String r3 = (java.lang.String) r3
            r10 = 255(0xff, float:3.57E-43)
            r20 = r2
            r27 = r3
            r26 = r4
            r25 = r5
            r23 = r6
            r24 = r7
            r22 = r8
            r21 = r9
            r19 = r10
            goto L_0x00f9
        L_0x0064:
            r17 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006e:
            if (r17 == 0) goto L_0x00e7
            int r6 = r0.x(r1)
            switch(r6) {
                case -1: goto L_0x00e1;
                case 0: goto L_0x00d5;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a2;
                case 5: goto L_0x0096;
                case 6: goto L_0x008a;
                case 7: goto L_0x007d;
                default: goto L_0x0077;
            }
        L_0x0077:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x007d:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r3, r6, r8)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0088:
            r6 = 3
            goto L_0x006e
        L_0x008a:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r4, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x0088
        L_0x0096:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r5, r6, r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 32
            goto L_0x0088
        L_0x00a2:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r7, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 16
            goto L_0x0088
        L_0x00ae:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 3
            java.lang.Object r6 = r0.v(r1, r3, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x006e
        L_0x00bd:
            r3 = 3
            com.hansecom.mapi.models.BillingAddress$$serializer r6 = com.hansecom.mapi.models.BillingAddress$$serializer.f39230a
            r3 = 2
            java.lang.Object r6 = r0.m(r1, r3, r6, r13)
            r13 = r6
            com.hansecom.mapi.models.BillingAddress r13 = (com.hansecom.mapi.models.BillingAddress) r13
            r2 = r2 | 4
        L_0x00ca:
            r3 = 7
            goto L_0x0088
        L_0x00cc:
            r3 = 2
            r6 = 1
            java.lang.String r12 = r0.t(r1, r6)
            r2 = r2 | 2
            goto L_0x00ca
        L_0x00d5:
            r3 = 2
            r6 = 1
            r11 = 0
            java.lang.String r16 = r0.t(r1, r11)
            r2 = r2 | 1
            r11 = r16
            goto L_0x00ca
        L_0x00e1:
            r6 = 1
            r16 = 0
            r17 = r16
            goto L_0x0088
        L_0x00e7:
            r19 = r2
            r27 = r8
            r26 = r9
            r25 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00f9:
            r0.b(r1)
            com.hansecom.mapi.models.AddPaymentMethodRequest r0 = new com.hansecom.mapi.models.AddPaymentMethodRequest
            r28 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.AddPaymentMethodRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.AddPaymentMethodRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, AddPaymentMethodRequest addPaymentMethodRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(addPaymentMethodRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        AddPaymentMethodRequest.a(addPaymentMethodRequest, c2, a2);
        c2.b(a2);
    }
}
