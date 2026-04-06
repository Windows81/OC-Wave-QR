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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class FareMediaAutoloadRequest$$serializer implements GeneratedSerializer<FareMediaAutoloadRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaAutoloadRequest$$serializer f39353a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaAutoloadRequest$$serializer fareMediaAutoloadRequest$$serializer = new FareMediaAutoloadRequest$$serializer();
        f39353a = fareMediaAutoloadRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaAutoloadRequest", fareMediaAutoloadRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("cardId", true);
        pluginGeneratedSerialDescriptor.q("paused", true);
        pluginGeneratedSerialDescriptor.q("balanceThreshold", true);
        pluginGeneratedSerialDescriptor.q("dayOfMonthThreshold", true);
        pluginGeneratedSerialDescriptor.q("autoloadAmount", true);
        pluginGeneratedSerialDescriptor.q("multiplePaymentMethods", true);
        pluginGeneratedSerialDescriptor.q("primaryPaymentMethod", true);
        pluginGeneratedSerialDescriptor.q("backupPaymentMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = FareMediaAutoloadRequest.f39344i;
        KSerializer u2 = BuiltinSerializersKt.u(StringSerializer.f42197a);
        KSerializer u3 = BuiltinSerializersKt.u(BooleanSerializer.f42073a);
        IntSerializer intSerializer = IntSerializer.f42129a;
        KSerializer u4 = BuiltinSerializersKt.u(intSerializer);
        KSerializer u5 = BuiltinSerializersKt.u(intSerializer);
        KSerializer u6 = BuiltinSerializersKt.u(intSerializer);
        KSerializer u7 = BuiltinSerializersKt.u(a2[5]);
        PaymentMethodShortened$$serializer paymentMethodShortened$$serializer = PaymentMethodShortened$$serializer.f39536a;
        return new KSerializer[]{u2, u3, u4, u5, u6, u7, BuiltinSerializersKt.u(paymentMethodShortened$$serializer), BuiltinSerializersKt.u(paymentMethodShortened$$serializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.hansecom.mapi.models.PaymentMethodShortened} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareMediaAutoloadRequest c(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r28.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.FareMediaAutoloadRequest.f39344i
            boolean r3 = r0.y()
            r4 = 7
            r5 = 6
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0074
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r3 = r0.v(r1, r11, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            kotlinx.serialization.internal.BooleanSerializer r11 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r10 = r0.v(r1, r10, r11, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            kotlinx.serialization.internal.IntSerializer r11 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r8 = r0.v(r1, r8, r11, r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r6 = r0.v(r1, r6, r11, r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r0.v(r1, r7, r11, r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r2 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            com.hansecom.mapi.models.PaymentMethodShortened$$serializer r9 = com.hansecom.mapi.models.PaymentMethodShortened$$serializer.f39536a
            java.lang.Object r5 = r0.v(r1, r5, r9, r12)
            com.hansecom.mapi.models.PaymentMethodShortened r5 = (com.hansecom.mapi.models.PaymentMethodShortened) r5
            java.lang.Object r4 = r0.v(r1, r4, r9, r12)
            com.hansecom.mapi.models.PaymentMethodShortened r4 = (com.hansecom.mapi.models.PaymentMethodShortened) r4
            r9 = 255(0xff, float:3.57E-43)
            r24 = r2
            r19 = r3
            r26 = r4
            r25 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r18 = r9
            r20 = r10
            goto L_0x0111
        L_0x0074:
            r16 = r10
            r3 = r11
            r6 = r12
            r8 = r6
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007e:
            if (r16 == 0) goto L_0x00ff
            int r7 = r0.x(r1)
            switch(r7) {
                case -1: goto L_0x00fb;
                case 0: goto L_0x00ed;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00a5;
                case 6: goto L_0x0099;
                case 7: goto L_0x008d;
                default: goto L_0x0087;
            }
        L_0x0087:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r7)
            throw r0
        L_0x008d:
            com.hansecom.mapi.models.PaymentMethodShortened$$serializer r7 = com.hansecom.mapi.models.PaymentMethodShortened$$serializer.f39536a
            java.lang.Object r6 = r0.v(r1, r4, r7, r6)
            com.hansecom.mapi.models.PaymentMethodShortened r6 = (com.hansecom.mapi.models.PaymentMethodShortened) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0097:
            r7 = 4
            goto L_0x007e
        L_0x0099:
            com.hansecom.mapi.models.PaymentMethodShortened$$serializer r7 = com.hansecom.mapi.models.PaymentMethodShortened$$serializer.f39536a
            java.lang.Object r7 = r0.v(r1, r5, r7, r8)
            r8 = r7
            com.hansecom.mapi.models.PaymentMethodShortened r8 = (com.hansecom.mapi.models.PaymentMethodShortened) r8
            r3 = r3 | 64
            goto L_0x0097
        L_0x00a5:
            r7 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r7 = (kotlinx.serialization.DeserializationStrategy) r7
            java.lang.Object r7 = r0.v(r1, r9, r7, r10)
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x0097
        L_0x00b3:
            kotlinx.serialization.internal.IntSerializer r7 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 4
            java.lang.Object r7 = r0.v(r1, r4, r7, r11)
            r11 = r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3 = r3 | 16
            r7 = r4
            r4 = 7
            goto L_0x007e
        L_0x00c2:
            r4 = 4
            kotlinx.serialization.internal.IntSerializer r7 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 3
            java.lang.Object r7 = r0.v(r1, r4, r7, r15)
            r15 = r7
            java.lang.Integer r15 = (java.lang.Integer) r15
            r3 = r3 | 8
        L_0x00cf:
            r4 = 7
            goto L_0x0097
        L_0x00d1:
            r4 = 3
            kotlinx.serialization.internal.IntSerializer r7 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 2
            java.lang.Object r7 = r0.v(r1, r4, r7, r14)
            r14 = r7
            java.lang.Integer r14 = (java.lang.Integer) r14
            r3 = r3 | 4
            goto L_0x00cf
        L_0x00df:
            r4 = 2
            kotlinx.serialization.internal.BooleanSerializer r7 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r4 = 1
            java.lang.Object r7 = r0.v(r1, r4, r7, r13)
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r3 = r3 | 2
            goto L_0x00cf
        L_0x00ed:
            r4 = 1
            kotlinx.serialization.internal.StringSerializer r7 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 0
            java.lang.Object r7 = r0.v(r1, r4, r7, r12)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00cf
        L_0x00fb:
            r4 = 0
            r16 = r4
            goto L_0x00cf
        L_0x00ff:
            r18 = r3
            r26 = r6
            r25 = r8
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0111:
            r0.b(r1)
            com.hansecom.mapi.models.FareMediaAutoloadRequest r0 = new com.hansecom.mapi.models.FareMediaAutoloadRequest
            r27 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.String) r19, (java.lang.Boolean) r20, (java.lang.Integer) r21, (java.lang.Integer) r22, (java.lang.Integer) r23, (java.util.List) r24, (com.hansecom.mapi.models.PaymentMethodShortened) r25, (com.hansecom.mapi.models.PaymentMethodShortened) r26, (kotlinx.serialization.internal.SerializationConstructorMarker) r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMediaAutoloadRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareMediaAutoloadRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaAutoloadRequest fareMediaAutoloadRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaAutoloadRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaAutoloadRequest.b(fareMediaAutoloadRequest, c2, a2);
        c2.b(a2);
    }
}
