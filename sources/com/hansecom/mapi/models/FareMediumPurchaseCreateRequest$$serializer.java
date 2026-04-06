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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class FareMediumPurchaseCreateRequest$$serializer implements GeneratedSerializer<FareMediumPurchaseCreateRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediumPurchaseCreateRequest$$serializer f39420a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediumPurchaseCreateRequest$$serializer fareMediumPurchaseCreateRequest$$serializer = new FareMediumPurchaseCreateRequest$$serializer();
        f39420a = fareMediumPurchaseCreateRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediumPurchaseCreateRequest", fareMediumPurchaseCreateRequest$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("virtualFareMediaId", true);
        pluginGeneratedSerialDescriptor.q("nickname", true);
        pluginGeneratedSerialDescriptor.q("walletType", true);
        pluginGeneratedSerialDescriptor.q("paymentMethodId", true);
        pluginGeneratedSerialDescriptor.q("topUpAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = FareMediumPurchaseCreateRequest.f39414f;
        return new KSerializer[]{BuiltinSerializersKt.u(IntSerializer.f42129a), BuiltinSerializersKt.u(StringSerializer.f42197a), BuiltinSerializersKt.u(a2[2]), BuiltinSerializersKt.u(LongSerializer.f42142a), BuiltinSerializersKt.u(TopUpReference$$serializer.f39592a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.hansecom.mapi.models.FareMediumPurchaseCreateRequest$WalletType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.hansecom.mapi.models.TopUpReference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareMediumPurchaseCreateRequest c(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r24.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.FareMediumPurchaseCreateRequest.f39414f
            boolean r3 = r0.y()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0059
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r3 = r0.v(r1, r8, r3, r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r7 = r0.v(r1, r7, r8, r9)
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r6, r2, r9)
            com.hansecom.mapi.models.FareMediumPurchaseCreateRequest$WalletType r2 = (com.hansecom.mapi.models.FareMediumPurchaseCreateRequest.WalletType) r2
            kotlinx.serialization.internal.LongSerializer r6 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r4 = r0.v(r1, r4, r6, r9)
            java.lang.Long r4 = (java.lang.Long) r4
            com.hansecom.mapi.models.TopUpReference$$serializer r6 = com.hansecom.mapi.models.TopUpReference$$serializer.f39592a
            java.lang.Object r5 = r0.v(r1, r5, r6, r9)
            com.hansecom.mapi.models.TopUpReference r5 = (com.hansecom.mapi.models.TopUpReference) r5
            r6 = 31
            r20 = r2
            r18 = r3
            r21 = r4
            r22 = r5
            r17 = r6
            r19 = r7
            goto L_0x00c9
        L_0x0059:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x005f:
            if (r14 == 0) goto L_0x00bd
            int r15 = r0.x(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b9
            if (r15 == 0) goto L_0x00ab
            if (r15 == r7) goto L_0x009f
            if (r15 == r6) goto L_0x0091
            if (r15 == r4) goto L_0x0085
            if (r15 != r5) goto L_0x007f
            com.hansecom.mapi.models.TopUpReference$$serializer r8 = com.hansecom.mapi.models.TopUpReference$$serializer.f39592a
            java.lang.Object r8 = r0.v(r1, r5, r8, r13)
            r13 = r8
            com.hansecom.mapi.models.TopUpReference r13 = (com.hansecom.mapi.models.TopUpReference) r13
            r3 = r3 | 16
        L_0x007d:
            r8 = 0
            goto L_0x005f
        L_0x007f:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r15)
            throw r0
        L_0x0085:
            kotlinx.serialization.internal.LongSerializer r8 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r8 = r0.v(r1, r4, r8, r12)
            r12 = r8
            java.lang.Long r12 = (java.lang.Long) r12
            r3 = r3 | 8
            goto L_0x007d
        L_0x0091:
            r8 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r8 = (kotlinx.serialization.DeserializationStrategy) r8
            java.lang.Object r8 = r0.v(r1, r6, r8, r11)
            r11 = r8
            com.hansecom.mapi.models.FareMediumPurchaseCreateRequest$WalletType r11 = (com.hansecom.mapi.models.FareMediumPurchaseCreateRequest.WalletType) r11
            r3 = r3 | 4
            goto L_0x007d
        L_0x009f:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r7, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 2
            goto L_0x007d
        L_0x00ab:
            kotlinx.serialization.internal.IntSerializer r8 = kotlinx.serialization.internal.IntSerializer.f42129a
            r15 = 0
            java.lang.Object r8 = r0.v(r1, r15, r8, r9)
            r9 = r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            r3 = r3 | 1
            r8 = r15
            goto L_0x005f
        L_0x00b9:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x005f
        L_0x00bd:
            r17 = r3
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
        L_0x00c9:
            r0.b(r1)
            com.hansecom.mapi.models.FareMediumPurchaseCreateRequest r0 = new com.hansecom.mapi.models.FareMediumPurchaseCreateRequest
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMediumPurchaseCreateRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareMediumPurchaseCreateRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediumPurchaseCreateRequest fareMediumPurchaseCreateRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediumPurchaseCreateRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediumPurchaseCreateRequest.b(fareMediumPurchaseCreateRequest, c2, a2);
        c2.b(a2);
    }
}
