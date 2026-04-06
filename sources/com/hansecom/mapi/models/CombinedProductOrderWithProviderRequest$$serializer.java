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
public final class CombinedProductOrderWithProviderRequest$$serializer implements GeneratedSerializer<CombinedProductOrderWithProviderRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final CombinedProductOrderWithProviderRequest$$serializer f39283a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CombinedProductOrderWithProviderRequest$$serializer combinedProductOrderWithProviderRequest$$serializer = new CombinedProductOrderWithProviderRequest$$serializer();
        f39283a = combinedProductOrderWithProviderRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest", combinedProductOrderWithProviderRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.q("cardNetwork", false);
        pluginGeneratedSerialDescriptor.q("invoiceData", false);
        pluginGeneratedSerialDescriptor.q("encryptedPaymentData", false);
        pluginGeneratedSerialDescriptor.q("promoCode", true);
        pluginGeneratedSerialDescriptor.q("topUps", true);
        pluginGeneratedSerialDescriptor.q("products", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = CombinedProductOrderWithProviderRequest.f39276g;
        KSerializer kSerializer = a2[0];
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{kSerializer, InvoiceData$$serializer.f39493a, stringSerializer, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(a2[4]), BuiltinSerializersKt.u(a2[5])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.hansecom.mapi.models.InvoiceData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest c(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r26.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest.f39276g
            boolean r3 = r0.y()
            r4 = 3
            r5 = 2
            r6 = 5
            r7 = 4
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0064
            r3 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3
            java.lang.Object r3 = r0.m(r1, r9, r3, r10)
            com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest$CardNetwork r3 = (com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest.CardNetwork) r3
            com.hansecom.mapi.models.InvoiceData$$serializer r9 = com.hansecom.mapi.models.InvoiceData$$serializer.f39493a
            java.lang.Object r8 = r0.m(r1, r8, r9, r10)
            com.hansecom.mapi.models.InvoiceData r8 = (com.hansecom.mapi.models.InvoiceData) r8
            java.lang.String r5 = r0.t(r1, r5)
            kotlinx.serialization.internal.StringSerializer r9 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r4 = r0.v(r1, r4, r9, r10)
            java.lang.String r4 = (java.lang.String) r4
            r9 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r9 = (kotlinx.serialization.DeserializationStrategy) r9
            java.lang.Object r7 = r0.v(r1, r7, r9, r10)
            java.util.List r7 = (java.util.List) r7
            r2 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r6, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r6 = 63
            r24 = r2
            r19 = r3
            r22 = r4
            r21 = r5
            r18 = r6
            r23 = r7
            r20 = r8
            goto L_0x00db
        L_0x0064:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006c:
            if (r16 == 0) goto L_0x00cd
            int r9 = r0.x(r1)
            switch(r9) {
                case -1: goto L_0x00c9;
                case 0: goto L_0x00b7;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0098;
                case 4: goto L_0x008a;
                case 5: goto L_0x007b;
                default: goto L_0x0075;
            }
        L_0x0075:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r9)
            throw r0
        L_0x007b:
            r9 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r9 = (kotlinx.serialization.DeserializationStrategy) r9
            java.lang.Object r9 = r0.v(r1, r6, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
        L_0x0088:
            r9 = 0
            goto L_0x006c
        L_0x008a:
            r9 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r9 = (kotlinx.serialization.DeserializationStrategy) r9
            java.lang.Object r9 = r0.v(r1, r7, r9, r14)
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 16
            goto L_0x0088
        L_0x0098:
            kotlinx.serialization.internal.StringSerializer r9 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r9 = r0.v(r1, r4, r9, r13)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 8
            goto L_0x0088
        L_0x00a4:
            java.lang.String r12 = r0.t(r1, r5)
            r3 = r3 | 4
            goto L_0x0088
        L_0x00ab:
            com.hansecom.mapi.models.InvoiceData$$serializer r9 = com.hansecom.mapi.models.InvoiceData$$serializer.f39493a
            java.lang.Object r9 = r0.m(r1, r8, r9, r11)
            r11 = r9
            com.hansecom.mapi.models.InvoiceData r11 = (com.hansecom.mapi.models.InvoiceData) r11
            r3 = r3 | 2
            goto L_0x0088
        L_0x00b7:
            r9 = 0
            r17 = r2[r9]
            r4 = r17
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.m(r1, r9, r4, r10)
            r10 = r4
            com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest$CardNetwork r10 = (com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest.CardNetwork) r10
            r3 = r3 | 1
            r4 = 3
            goto L_0x006c
        L_0x00c9:
            r9 = 0
            r16 = r9
            goto L_0x006c
        L_0x00cd:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00db:
            r0.b(r1)
            com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest r0 = new com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.CombinedProductOrderWithProviderRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, CombinedProductOrderWithProviderRequest combinedProductOrderWithProviderRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(combinedProductOrderWithProviderRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        CombinedProductOrderWithProviderRequest.b(combinedProductOrderWithProviderRequest, c2, a2);
        c2.b(a2);
    }
}
