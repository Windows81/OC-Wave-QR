package com.hansecom.mapi.models;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class CombinedProductOrderRequest$$serializer implements GeneratedSerializer<CombinedProductOrderRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final CombinedProductOrderRequest$$serializer f39269a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CombinedProductOrderRequest$$serializer combinedProductOrderRequest$$serializer = new CombinedProductOrderRequest$$serializer();
        f39269a = combinedProductOrderRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.CombinedProductOrderRequest", combinedProductOrderRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.q("partialPayment", true);
        pluginGeneratedSerialDescriptor.q("paymentToken", true);
        pluginGeneratedSerialDescriptor.q("email", true);
        pluginGeneratedSerialDescriptor.q("paymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("promoCode", true);
        pluginGeneratedSerialDescriptor.q("additionalPaymentInformation", true);
        pluginGeneratedSerialDescriptor.q("isStoredValuePayment", true);
        pluginGeneratedSerialDescriptor.q("topUps", true);
        pluginGeneratedSerialDescriptor.q("products", true);
        pluginGeneratedSerialDescriptor.q("invoiceAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = CombinedProductOrderRequest.f39258k;
        KSerializer u2 = BuiltinSerializersKt.u(a2[0]);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(LongSerializer.f42142a), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(AdditionalPaymentInfo$$serializer.f39180a), BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(a2[7]), BuiltinSerializersKt.u(a2[8]), BuiltinSerializersKt.u(UserAddress$$serializer.f39673a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.CombinedProductOrderRequest c(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r33.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.CombinedProductOrderRequest.f39258k
            boolean r3 = r0.y()
            r4 = 9
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 4
            r9 = 2
            r10 = 7
            r11 = 8
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0092
            r3 = r2[r13]
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3
            java.lang.Object r3 = r0.v(r1, r13, r3, r14)
            java.util.List r3 = (java.util.List) r3
            kotlinx.serialization.internal.StringSerializer r13 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r12 = r0.v(r1, r12, r13, r14)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r0.v(r1, r9, r13, r14)
            java.lang.String r9 = (java.lang.String) r9
            kotlinx.serialization.internal.LongSerializer r15 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r7 = r0.v(r1, r7, r15, r14)
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r8 = r0.v(r1, r8, r13, r14)
            java.lang.String r8 = (java.lang.String) r8
            com.hansecom.mapi.models.AdditionalPaymentInfo$$serializer r13 = com.hansecom.mapi.models.AdditionalPaymentInfo$$serializer.f39180a
            java.lang.Object r6 = r0.v(r1, r6, r13, r14)
            com.hansecom.mapi.models.AdditionalPaymentInfo r6 = (com.hansecom.mapi.models.AdditionalPaymentInfo) r6
            kotlinx.serialization.internal.BooleanSerializer r13 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r5 = r0.v(r1, r5, r13, r14)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r13 = r2[r10]
            kotlinx.serialization.DeserializationStrategy r13 = (kotlinx.serialization.DeserializationStrategy) r13
            java.lang.Object r10 = r0.v(r1, r10, r13, r14)
            java.util.List r10 = (java.util.List) r10
            r2 = r2[r11]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r11, r2, r14)
            java.util.List r2 = (java.util.List) r2
            com.hansecom.mapi.models.UserAddress$$serializer r11 = com.hansecom.mapi.models.UserAddress$$serializer.f39673a
            java.lang.Object r4 = r0.v(r1, r4, r11, r14)
            com.hansecom.mapi.models.UserAddress r4 = (com.hansecom.mapi.models.UserAddress) r4
            r11 = 1023(0x3ff, float:1.434E-42)
            r30 = r2
            r22 = r3
            r31 = r4
            r28 = r5
            r27 = r6
            r25 = r7
            r26 = r8
            r24 = r9
            r29 = r10
            r21 = r11
            r23 = r12
            goto L_0x0160
        L_0x0092:
            r18 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
        L_0x009e:
            if (r18 == 0) goto L_0x014a
            int r11 = r0.x(r1)
            switch(r11) {
                case -1: goto L_0x0145;
                case 0: goto L_0x0133;
                case 1: goto L_0x0125;
                case 2: goto L_0x0117;
                case 3: goto L_0x0109;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00e2;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00ba;
                case 9: goto L_0x00ad;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r11)
            throw r0
        L_0x00ad:
            com.hansecom.mapi.models.UserAddress$$serializer r11 = com.hansecom.mapi.models.UserAddress$$serializer.f39673a
            java.lang.Object r10 = r0.v(r1, r4, r11, r10)
            com.hansecom.mapi.models.UserAddress r10 = (com.hansecom.mapi.models.UserAddress) r10
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00b7:
            r11 = 8
            goto L_0x009e
        L_0x00ba:
            r11 = 8
            r19 = r2[r11]
            r4 = r19
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.v(r1, r11, r4, r5)
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 256(0x100, float:3.59E-43)
            r4 = 9
            goto L_0x009e
        L_0x00ce:
            r4 = 7
            r11 = 8
            r17 = r2[r4]
            r11 = r17
            kotlinx.serialization.DeserializationStrategy r11 = (kotlinx.serialization.DeserializationStrategy) r11
            java.lang.Object r6 = r0.v(r1, r4, r11, r6)
            java.util.List r6 = (java.util.List) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00df:
            r4 = 9
            goto L_0x00b7
        L_0x00e2:
            r4 = 7
            kotlinx.serialization.internal.BooleanSerializer r11 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r4 = 6
            java.lang.Object r8 = r0.v(r1, r4, r11, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3 = r3 | 64
            goto L_0x00df
        L_0x00ef:
            r4 = 6
            com.hansecom.mapi.models.AdditionalPaymentInfo$$serializer r11 = com.hansecom.mapi.models.AdditionalPaymentInfo$$serializer.f39180a
            r4 = 5
            java.lang.Object r7 = r0.v(r1, r4, r11, r7)
            com.hansecom.mapi.models.AdditionalPaymentInfo r7 = (com.hansecom.mapi.models.AdditionalPaymentInfo) r7
            r3 = r3 | 32
            goto L_0x00df
        L_0x00fc:
            r4 = 5
            kotlinx.serialization.internal.StringSerializer r11 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 4
            java.lang.Object r9 = r0.v(r1, r4, r11, r9)
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 16
            goto L_0x00df
        L_0x0109:
            r4 = 4
            kotlinx.serialization.internal.LongSerializer r11 = kotlinx.serialization.internal.LongSerializer.f42142a
            r4 = 3
            java.lang.Object r11 = r0.v(r1, r4, r11, r12)
            r12 = r11
            java.lang.Long r12 = (java.lang.Long) r12
            r3 = r3 | 8
            goto L_0x00df
        L_0x0117:
            r4 = 3
            kotlinx.serialization.internal.StringSerializer r11 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 2
            java.lang.Object r11 = r0.v(r1, r4, r11, r13)
            r13 = r11
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            goto L_0x00df
        L_0x0125:
            r4 = 2
            kotlinx.serialization.internal.StringSerializer r11 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 1
            java.lang.Object r11 = r0.v(r1, r4, r11, r15)
            r15 = r11
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 2
            goto L_0x00df
        L_0x0133:
            r4 = 1
            r11 = 0
            r16 = r2[r11]
            r4 = r16
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.v(r1, r11, r4, r14)
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 1
            goto L_0x00df
        L_0x0145:
            r11 = 0
            r18 = r11
            goto L_0x00b7
        L_0x014a:
            r21 = r3
            r30 = r5
            r29 = r6
            r27 = r7
            r28 = r8
            r26 = r9
            r31 = r10
            r25 = r12
            r24 = r13
            r22 = r14
            r23 = r15
        L_0x0160:
            r0.b(r1)
            com.hansecom.mapi.models.CombinedProductOrderRequest r0 = new com.hansecom.mapi.models.CombinedProductOrderRequest
            r32 = 0
            r20 = r0
            r20.<init>((int) r21, (java.util.List) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.Long) r25, (java.lang.String) r26, (com.hansecom.mapi.models.AdditionalPaymentInfo) r27, (java.lang.Boolean) r28, (java.util.List) r29, (java.util.List) r30, (com.hansecom.mapi.models.UserAddress) r31, (kotlinx.serialization.internal.SerializationConstructorMarker) r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.CombinedProductOrderRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.CombinedProductOrderRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, CombinedProductOrderRequest combinedProductOrderRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(combinedProductOrderRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        CombinedProductOrderRequest.b(combinedProductOrderRequest, c2, a2);
        c2.b(a2);
    }
}
