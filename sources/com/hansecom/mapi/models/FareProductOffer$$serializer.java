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
public final class FareProductOffer$$serializer implements GeneratedSerializer<FareProductOffer> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareProductOffer$$serializer f39459a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareProductOffer$$serializer fareProductOffer$$serializer = new FareProductOffer$$serializer();
        f39459a = fareProductOffer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareProductOffer", fareProductOffer$$serializer, 9);
        pluginGeneratedSerialDescriptor.q("name", true);
        pluginGeneratedSerialDescriptor.q("canBePlacedInCart", true);
        pluginGeneratedSerialDescriptor.q("typeId", true);
        pluginGeneratedSerialDescriptor.q("description", true);
        pluginGeneratedSerialDescriptor.q("price", true);
        pluginGeneratedSerialDescriptor.q("validityDescription", true);
        pluginGeneratedSerialDescriptor.q("offerConstraints", true);
        pluginGeneratedSerialDescriptor.q("groupConstraints", true);
        pluginGeneratedSerialDescriptor.q("offerReference", true);
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
        KSerializer u2 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u3 = BuiltinSerializersKt.u(BooleanSerializer.f42073a);
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{u2, u3, BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(OfferConstraints$$serializer.f39517a), BuiltinSerializersKt.u(GroupConstraints$$serializer.f39466a), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.hansecom.mapi.models.OfferConstraints} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.hansecom.mapi.models.GroupConstraints} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareProductOffer c(kotlinx.serialization.encoding.Decoder r30) {
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
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0078
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r11 = r0.v(r1, r11, r2, r12)
            java.lang.String r11 = (java.lang.String) r11
            kotlinx.serialization.internal.BooleanSerializer r13 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r10 = r0.v(r1, r10, r13, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            kotlinx.serialization.internal.IntSerializer r13 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r9 = r0.v(r1, r9, r13, r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r6 = r0.v(r1, r6, r2, r12)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.v(r1, r8, r13, r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r5 = r0.v(r1, r5, r2, r12)
            java.lang.String r5 = (java.lang.String) r5
            com.hansecom.mapi.models.OfferConstraints$$serializer r13 = com.hansecom.mapi.models.OfferConstraints$$serializer.f39517a
            java.lang.Object r4 = r0.v(r1, r4, r13, r12)
            com.hansecom.mapi.models.OfferConstraints r4 = (com.hansecom.mapi.models.OfferConstraints) r4
            com.hansecom.mapi.models.GroupConstraints$$serializer r13 = com.hansecom.mapi.models.GroupConstraints$$serializer.f39466a
            java.lang.Object r3 = r0.v(r1, r3, r13, r12)
            com.hansecom.mapi.models.GroupConstraints r3 = (com.hansecom.mapi.models.GroupConstraints) r3
            java.lang.Object r2 = r0.v(r1, r7, r2, r12)
            java.lang.String r2 = (java.lang.String) r2
            r7 = 511(0x1ff, float:7.16E-43)
            r27 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r18 = r7
            r23 = r8
            r21 = r9
            r20 = r10
            r19 = r11
            goto L_0x0125
        L_0x0078:
            r16 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0083:
            if (r16 == 0) goto L_0x0111
            int r5 = r0.x(r1)
            switch(r5) {
                case -1: goto L_0x010d;
                case 0: goto L_0x00ff;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d5;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00ab;
                case 7: goto L_0x009f;
                case 8: goto L_0x0092;
                default: goto L_0x008c;
            }
        L_0x008c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r5)
            throw r0
        L_0x0092:
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r5 = r0.v(r1, r7, r5, r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x009d:
            r5 = 5
            goto L_0x0083
        L_0x009f:
            com.hansecom.mapi.models.GroupConstraints$$serializer r5 = com.hansecom.mapi.models.GroupConstraints$$serializer.f39466a
            java.lang.Object r5 = r0.v(r1, r3, r5, r6)
            r6 = r5
            com.hansecom.mapi.models.GroupConstraints r6 = (com.hansecom.mapi.models.GroupConstraints) r6
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x009d
        L_0x00ab:
            com.hansecom.mapi.models.OfferConstraints$$serializer r5 = com.hansecom.mapi.models.OfferConstraints$$serializer.f39517a
            java.lang.Object r5 = r0.v(r1, r4, r5, r9)
            r9 = r5
            com.hansecom.mapi.models.OfferConstraints r9 = (com.hansecom.mapi.models.OfferConstraints) r9
            r2 = r2 | 64
            goto L_0x009d
        L_0x00b7:
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 5
            java.lang.Object r5 = r0.v(r1, r3, r5, r10)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x0083
        L_0x00c6:
            r3 = 5
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            r3 = 4
            java.lang.Object r5 = r0.v(r1, r3, r5, r11)
            r11 = r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r2 = r2 | 16
        L_0x00d3:
            r3 = 7
            goto L_0x009d
        L_0x00d5:
            r3 = 4
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 3
            java.lang.Object r5 = r0.v(r1, r3, r5, r15)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 8
            goto L_0x00d3
        L_0x00e3:
            r3 = 3
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            r3 = 2
            java.lang.Object r5 = r0.v(r1, r3, r5, r14)
            r14 = r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            r2 = r2 | 4
            goto L_0x00d3
        L_0x00f1:
            r3 = 2
            kotlinx.serialization.internal.BooleanSerializer r5 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r3 = 1
            java.lang.Object r5 = r0.v(r1, r3, r5, r13)
            r13 = r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r2 = r2 | 2
            goto L_0x00d3
        L_0x00ff:
            r3 = 1
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 0
            java.lang.Object r5 = r0.v(r1, r3, r5, r12)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 1
            goto L_0x00d3
        L_0x010d:
            r3 = 0
            r16 = r3
            goto L_0x00d3
        L_0x0111:
            r18 = r2
            r26 = r6
            r27 = r8
            r25 = r9
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0125:
            r0.b(r1)
            com.hansecom.mapi.models.FareProductOffer r0 = new com.hansecom.mapi.models.FareProductOffer
            r28 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareProductOffer$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareProductOffer");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareProductOffer fareProductOffer) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareProductOffer, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareProductOffer.h(fareProductOffer, c2, a2);
        c2.b(a2);
    }
}
