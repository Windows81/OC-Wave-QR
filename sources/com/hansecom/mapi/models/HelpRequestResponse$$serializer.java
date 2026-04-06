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
public final class HelpRequestResponse$$serializer implements GeneratedSerializer<HelpRequestResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final HelpRequestResponse$$serializer f39479a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HelpRequestResponse$$serializer helpRequestResponse$$serializer = new HelpRequestResponse$$serializer();
        f39479a = helpRequestResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.HelpRequestResponse", helpRequestResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.q("contactName", true);
        pluginGeneratedSerialDescriptor.q("email", true);
        pluginGeneratedSerialDescriptor.q("phoneNumber", true);
        pluginGeneratedSerialDescriptor.q("subject", true);
        pluginGeneratedSerialDescriptor.q("card", true);
        pluginGeneratedSerialDescriptor.q("description", true);
        pluginGeneratedSerialDescriptor.q("caseReason", true);
        pluginGeneratedSerialDescriptor.q("caseCategory", true);
        pluginGeneratedSerialDescriptor.q("caseResolution", true);
        pluginGeneratedSerialDescriptor.q("appVersion", true);
        pluginGeneratedSerialDescriptor.q("deviceType", true);
        pluginGeneratedSerialDescriptor.q("attachmentName", true);
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
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.HelpRequestResponse c(kotlinx.serialization.encoding.Decoder r35) {
        /*
            r34 = this;
            r0 = r35
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r34.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 11
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x008e
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r14 = r0.v(r1, r14, r2, r15)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r0.v(r1, r13, r2, r15)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.v(r1, r12, r2, r15)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r0.v(r1, r9, r2, r15)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r0.v(r1, r11, r2, r15)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.v(r1, r8, r2, r15)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.v(r1, r7, r2, r15)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.v(r1, r6, r2, r15)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r0.v(r1, r10, r2, r15)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r0.v(r1, r5, r2, r15)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.v(r1, r4, r2, r15)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r0.v(r1, r3, r2, r15)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 4095(0xfff, float:5.738E-42)
            r31 = r2
            r19 = r3
            r30 = r4
            r29 = r5
            r27 = r6
            r26 = r7
            r25 = r8
            r23 = r9
            r28 = r10
            r24 = r11
            r22 = r12
            r21 = r13
            r20 = r14
            goto L_0x01ae
        L_0x008e:
            r16 = r13
            r2 = r14
            r4 = r15
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x009c:
            if (r16 == 0) goto L_0x0191
            int r3 = r0.x(r1)
            switch(r3) {
                case -1: goto L_0x0184;
                case 0: goto L_0x016b;
                case 1: goto L_0x015a;
                case 2: goto L_0x0149;
                case 3: goto L_0x0139;
                case 4: goto L_0x0129;
                case 5: goto L_0x0119;
                case 6: goto L_0x0109;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00d4;
                case 10: goto L_0x00be;
                case 11: goto L_0x00ab;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x00ab:
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r17 = r15
            r15 = 11
            java.lang.Object r3 = r0.v(r1, r15, r3, r4)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = r15
            r15 = r17
            goto L_0x009c
        L_0x00be:
            r17 = r15
            r15 = 11
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 10
            java.lang.Object r3 = r0.v(r1, r15, r3, r5)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L_0x00cf:
            r15 = r17
        L_0x00d1:
            r3 = 11
            goto L_0x009c
        L_0x00d4:
            r17 = r15
            r15 = 10
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 9
            java.lang.Object r3 = r0.v(r1, r15, r3, r10)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x00cf
        L_0x00e6:
            r17 = r15
            r15 = 9
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 8
            java.lang.Object r3 = r0.v(r1, r15, r3, r6)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00cf
        L_0x00f8:
            r17 = r15
            r15 = 8
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 7
            java.lang.Object r3 = r0.v(r1, r15, r3, r7)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00cf
        L_0x0109:
            r17 = r15
            r15 = 7
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 6
            java.lang.Object r3 = r0.v(r1, r15, r3, r8)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 64
            goto L_0x00cf
        L_0x0119:
            r17 = r15
            r15 = 6
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 5
            java.lang.Object r3 = r0.v(r1, r15, r3, r11)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 32
            goto L_0x00cf
        L_0x0129:
            r17 = r15
            r15 = 5
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 4
            java.lang.Object r3 = r0.v(r1, r15, r3, r9)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 16
            goto L_0x00cf
        L_0x0139:
            r17 = r15
            r15 = 4
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 3
            java.lang.Object r3 = r0.v(r1, r15, r3, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 8
            goto L_0x00cf
        L_0x0149:
            r17 = r15
            r15 = 3
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 2
            java.lang.Object r3 = r0.v(r1, r15, r3, r13)
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 4
            goto L_0x00cf
        L_0x015a:
            r17 = r15
            r15 = 2
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 1
            java.lang.Object r3 = r0.v(r1, r15, r3, r14)
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 2
            goto L_0x00cf
        L_0x016b:
            r17 = r15
            r15 = 1
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r15 = 0
            r33 = r17
            r17 = r4
            r4 = r33
            java.lang.Object r3 = r0.v(r1, r15, r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2 | 1
            r15 = r3
            r4 = r17
            goto L_0x00d1
        L_0x0184:
            r17 = r4
            r4 = r15
            r15 = 0
            r16 = r15
            r3 = 11
            r15 = r4
            r4 = r17
            goto L_0x009c
        L_0x0191:
            r17 = r4
            r4 = r15
            r19 = r2
            r20 = r4
            r30 = r5
            r28 = r6
            r27 = r7
            r26 = r8
            r24 = r9
            r29 = r10
            r25 = r11
            r23 = r12
            r22 = r13
            r21 = r14
            r31 = r17
        L_0x01ae:
            r0.b(r1)
            com.hansecom.mapi.models.HelpRequestResponse r0 = new com.hansecom.mapi.models.HelpRequestResponse
            r32 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.HelpRequestResponse$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.HelpRequestResponse");
    }

    /* renamed from: g */
    public void d(Encoder encoder, HelpRequestResponse helpRequestResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(helpRequestResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        HelpRequestResponse.a(helpRequestResponse, c2, a2);
        c2.b(a2);
    }
}
