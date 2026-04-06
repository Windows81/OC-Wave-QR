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
public final class URpassTicketsResponse$$serializer implements GeneratedSerializer<URpassTicketsResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final URpassTicketsResponse$$serializer f39641a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        URpassTicketsResponse$$serializer uRpassTicketsResponse$$serializer = new URpassTicketsResponse$$serializer();
        f39641a = uRpassTicketsResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.URpassTicketsResponse", uRpassTicketsResponse$$serializer, 14);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("urpassTenantId", true);
        pluginGeneratedSerialDescriptor.q("isActive", true);
        pluginGeneratedSerialDescriptor.q("status", true);
        pluginGeneratedSerialDescriptor.q("name", true);
        pluginGeneratedSerialDescriptor.q("description", true);
        pluginGeneratedSerialDescriptor.q("type", true);
        pluginGeneratedSerialDescriptor.q("urPassRiderClass", true);
        pluginGeneratedSerialDescriptor.q("inspectionCode", true);
        pluginGeneratedSerialDescriptor.q("validTo", true);
        pluginGeneratedSerialDescriptor.q("price", true);
        pluginGeneratedSerialDescriptor.q("barcodeContent", true);
        pluginGeneratedSerialDescriptor.q("activationCount", true);
        pluginGeneratedSerialDescriptor.q("maxActivationCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = URpassTicketsResponse.f39626o;
        KSerializer u2 = BuiltinSerializersKt.u(a2[0]);
        KSerializer u3 = BuiltinSerializersKt.u(a2[1]);
        KSerializer u4 = BuiltinSerializersKt.u(BooleanSerializer.f42073a);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        KSerializer u5 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u6 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u7 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u8 = BuiltinSerializersKt.u(a2[6]);
        KSerializer u9 = BuiltinSerializersKt.u(a2[7]);
        KSerializer u10 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u11 = BuiltinSerializersKt.u(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.hansecom.mapi.models.URpassTicketsResponse$Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.hansecom.mapi.models.URpassTicketsResponse$UrPassRiderClass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00f2, code lost:
        r5 = r26;
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01c9, code lost:
        r4 = r19;
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01e7, code lost:
        r5 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0208, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.URpassTicketsResponse c(kotlinx.serialization.encoding.Decoder r46) {
        /*
            r45 = this;
            r0 = r46
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r45.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.URpassTicketsResponse.f39626o
            boolean r3 = r0.y()
            r8 = 9
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 7
            r15 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x00be
            r3 = r2[r5]
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3
            java.lang.Object r3 = r0.v(r1, r5, r3, r6)
            java.util.UUID r3 = (java.util.UUID) r3
            r5 = r2[r4]
            kotlinx.serialization.DeserializationStrategy r5 = (kotlinx.serialization.DeserializationStrategy) r5
            java.lang.Object r4 = r0.v(r1, r4, r5, r6)
            kotlinx.serialization.internal.BooleanSerializer r5 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r5 = r0.v(r1, r13, r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            kotlinx.serialization.internal.StringSerializer r13 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r10 = r0.v(r1, r10, r13, r6)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r0.v(r1, r12, r13, r6)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r0.v(r1, r9, r13, r6)
            java.lang.String r9 = (java.lang.String) r9
            r17 = r2[r15]
            r7 = r17
            kotlinx.serialization.DeserializationStrategy r7 = (kotlinx.serialization.DeserializationStrategy) r7
            java.lang.Object r7 = r0.v(r1, r15, r7, r6)
            com.hansecom.mapi.models.URpassTicketsResponse$Type r7 = (com.hansecom.mapi.models.URpassTicketsResponse.Type) r7
            r2 = r2[r14]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r14, r2, r6)
            com.hansecom.mapi.models.URpassTicketsResponse$UrPassRiderClass r2 = (com.hansecom.mapi.models.URpassTicketsResponse.UrPassRiderClass) r2
            java.lang.Object r11 = r0.v(r1, r11, r13, r6)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.v(r1, r8, r13, r6)
            java.lang.String r8 = (java.lang.String) r8
            kotlinx.serialization.internal.IntSerializer r14 = kotlinx.serialization.internal.IntSerializer.f42129a
            r15 = 10
            java.lang.Object r15 = r0.v(r1, r15, r14, r6)
            java.lang.Integer r15 = (java.lang.Integer) r15
            r17 = r2
            r2 = 11
            java.lang.Object r2 = r0.v(r1, r2, r13, r6)
            java.lang.String r2 = (java.lang.String) r2
            r13 = 12
            java.lang.Object r13 = r0.v(r1, r13, r14, r6)
            java.lang.Integer r13 = (java.lang.Integer) r13
            r16 = r2
            r2 = 13
            java.lang.Object r2 = r0.v(r1, r2, r14, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r6 = 16383(0x3fff, float:2.2957E-41)
            r43 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            r29 = r6
            r36 = r7
            r39 = r8
            r35 = r9
            r33 = r10
            r38 = r11
            r34 = r12
            r42 = r13
            r40 = r15
            r41 = r16
            r37 = r17
            goto L_0x0243
        L_0x00be:
            r25 = r4
            r3 = r6
            r4 = r3
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r23 = r15
            r24 = r23
            r6 = r5
            r5 = r24
        L_0x00d2:
            if (r25 == 0) goto L_0x021b
            r26 = r5
            int r5 = r0.x(r1)
            switch(r5) {
                case -1: goto L_0x020b;
                case 0: goto L_0x01ea;
                case 1: goto L_0x01cf;
                case 2: goto L_0x01b5;
                case 3: goto L_0x019c;
                case 4: goto L_0x018b;
                case 5: goto L_0x017a;
                case 6: goto L_0x0165;
                case 7: goto L_0x0150;
                case 8: goto L_0x013e;
                case 9: goto L_0x012c;
                case 10: goto L_0x011a;
                case 11: goto L_0x0108;
                case 12: goto L_0x00f7;
                case 13: goto L_0x00e3;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r5)
            throw r0
        L_0x00e3:
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            r27 = r4
            r4 = 13
            java.lang.Object r5 = r0.v(r1, r4, r5, r7)
            r7 = r5
            java.lang.Integer r7 = (java.lang.Integer) r7
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
        L_0x00f2:
            r5 = r26
            r4 = r27
            goto L_0x00d2
        L_0x00f7:
            r27 = r4
            r4 = 13
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 12
            java.lang.Object r3 = r0.v(r1, r4, r5, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x00f2
        L_0x0108:
            r27 = r4
            r4 = 12
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 11
            java.lang.Object r5 = r0.v(r1, r4, r5, r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x00f2
        L_0x011a:
            r27 = r4
            r4 = 11
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 10
            java.lang.Object r5 = r0.v(r1, r4, r5, r11)
            r11 = r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x00f2
        L_0x012c:
            r27 = r4
            r4 = 10
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 9
            java.lang.Object r5 = r0.v(r1, r4, r5, r14)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x00f2
        L_0x013e:
            r27 = r4
            r4 = 9
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 8
            java.lang.Object r5 = r0.v(r1, r4, r5, r15)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x00f2
        L_0x0150:
            r27 = r4
            r4 = 8
            r5 = 7
            r22 = r2[r5]
            r4 = r22
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.v(r1, r5, r4, r9)
            r9 = r4
            com.hansecom.mapi.models.URpassTicketsResponse$UrPassRiderClass r9 = (com.hansecom.mapi.models.URpassTicketsResponse.UrPassRiderClass) r9
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x00f2
        L_0x0165:
            r27 = r4
            r4 = 6
            r5 = 7
            r21 = r2[r4]
            r5 = r21
            kotlinx.serialization.DeserializationStrategy r5 = (kotlinx.serialization.DeserializationStrategy) r5
            java.lang.Object r5 = r0.v(r1, r4, r5, r12)
            r12 = r5
            com.hansecom.mapi.models.URpassTicketsResponse$Type r12 = (com.hansecom.mapi.models.URpassTicketsResponse.Type) r12
            r6 = r6 | 64
            goto L_0x00f2
        L_0x017a:
            r27 = r4
            r4 = 6
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 5
            java.lang.Object r5 = r0.v(r1, r4, r5, r10)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            r6 = r6 | 32
            goto L_0x00f2
        L_0x018b:
            r27 = r4
            r4 = 5
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 4
            java.lang.Object r5 = r0.v(r1, r4, r5, r13)
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            r6 = r6 | 16
            goto L_0x00f2
        L_0x019c:
            r27 = r4
            r4 = 4
            kotlinx.serialization.internal.StringSerializer r5 = kotlinx.serialization.internal.StringSerializer.f42197a
            r20 = r3
            r3 = r27
            r4 = 3
            java.lang.Object r3 = r0.v(r1, r4, r5, r3)
            java.lang.String r3 = (java.lang.String) r3
            r6 = r6 | 8
            r4 = r3
            r3 = r20
            r5 = r26
            goto L_0x00d2
        L_0x01b5:
            r20 = r3
            r3 = r4
            r4 = 3
            kotlinx.serialization.internal.BooleanSerializer r5 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r19 = r3
            r3 = r26
            r4 = 2
            java.lang.Object r3 = r0.v(r1, r4, r5, r3)
            r5 = r3
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r6 = r6 | 4
        L_0x01c9:
            r4 = r19
            r3 = r20
            goto L_0x00d2
        L_0x01cf:
            r20 = r3
            r19 = r4
            r3 = r26
            r4 = 2
            r5 = 1
            r18 = r2[r5]
            r4 = r18
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            r18 = r3
            r3 = r24
            java.lang.Object r24 = r0.v(r1, r5, r4, r3)
            r6 = r6 | 2
        L_0x01e7:
            r5 = r18
            goto L_0x01c9
        L_0x01ea:
            r20 = r3
            r19 = r4
            r3 = r24
            r18 = r26
            r4 = 0
            r5 = 1
            r17 = r2[r4]
            r5 = r17
            kotlinx.serialization.DeserializationStrategy r5 = (kotlinx.serialization.DeserializationStrategy) r5
            r17 = r2
            r2 = r23
            java.lang.Object r2 = r0.v(r1, r4, r5, r2)
            r23 = r2
            java.util.UUID r23 = (java.util.UUID) r23
            r6 = r6 | 1
        L_0x0208:
            r2 = r17
            goto L_0x01e7
        L_0x020b:
            r17 = r2
            r20 = r3
            r19 = r4
            r2 = r23
            r3 = r24
            r18 = r26
            r4 = 0
            r25 = r4
            goto L_0x0208
        L_0x021b:
            r20 = r3
            r19 = r4
            r18 = r5
            r2 = r23
            r3 = r24
            r30 = r2
            r31 = r3
            r29 = r6
            r43 = r7
            r41 = r8
            r37 = r9
            r35 = r10
            r40 = r11
            r36 = r12
            r34 = r13
            r39 = r14
            r38 = r15
            r32 = r18
            r33 = r19
            r42 = r20
        L_0x0243:
            r0.b(r1)
            com.hansecom.mapi.models.URpassTicketsResponse r0 = new com.hansecom.mapi.models.URpassTicketsResponse
            r28 = r0
            r44 = 0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.URpassTicketsResponse$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.URpassTicketsResponse");
    }

    /* renamed from: g */
    public void d(Encoder encoder, URpassTicketsResponse uRpassTicketsResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(uRpassTicketsResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        URpassTicketsResponse.b(uRpassTicketsResponse, c2, a2);
        c2.b(a2);
    }
}
