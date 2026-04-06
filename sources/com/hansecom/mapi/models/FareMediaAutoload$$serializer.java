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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class FareMediaAutoload$$serializer implements GeneratedSerializer<FareMediaAutoload> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediaAutoload$$serializer f39339a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediaAutoload$$serializer fareMediaAutoload$$serializer = new FareMediaAutoload$$serializer();
        f39339a = fareMediaAutoload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediaAutoload", fareMediaAutoload$$serializer, 13);
        pluginGeneratedSerialDescriptor.q("paused", true);
        pluginGeneratedSerialDescriptor.q("type", true);
        pluginGeneratedSerialDescriptor.q("passName", true);
        pluginGeneratedSerialDescriptor.q("balanceThreshold", true);
        pluginGeneratedSerialDescriptor.q("dayOfMonthThreshold", true);
        pluginGeneratedSerialDescriptor.q("autoloadAmount", true);
        pluginGeneratedSerialDescriptor.q("autoloadId", true);
        pluginGeneratedSerialDescriptor.q("isFundingSourceStoredValue", true);
        pluginGeneratedSerialDescriptor.q("fundingSourceId", true);
        pluginGeneratedSerialDescriptor.q("multiplePaymentMethods", true);
        pluginGeneratedSerialDescriptor.q("isBackupFundingSourceStoredValue", true);
        pluginGeneratedSerialDescriptor.q("backupFundingSourceId", true);
        pluginGeneratedSerialDescriptor.q("relatedPass", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = FareMediaAutoload.f39325n;
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        KSerializer u2 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u3 = BuiltinSerializersKt.u(a2[1]);
        KSerializer u4 = BuiltinSerializersKt.u(StringSerializer.f42197a);
        LongSerializer longSerializer = LongSerializer.f42142a;
        return new KSerializer[]{u2, u3, u4, BuiltinSerializersKt.u(longSerializer), BuiltinSerializersKt.u(IntSerializer.f42129a), BuiltinSerializersKt.u(longSerializer), BuiltinSerializersKt.u(longSerializer), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(longSerializer), BuiltinSerializersKt.u(a2[9]), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(longSerializer), BuiltinSerializersKt.u(FareProduct$$serializer.f39445a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.hansecom.mapi.models.FareMediaAutoload$Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Long} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e1, code lost:
        r6 = r23;
        r14 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01b1, code lost:
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01b3, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareMediaAutoload c(kotlinx.serialization.encoding.Decoder r42) {
        /*
            r41 = this;
            r0 = r42
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r41.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.FareMediaAutoload.f39325n
            boolean r3 = r0.y()
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r15 = 1
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00b0
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r4 = r0.v(r1, r4, r3, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r17 = r2[r15]
            r6 = r17
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r6 = r0.v(r1, r15, r6, r5)
            com.hansecom.mapi.models.FareMediaAutoload$Type r6 = (com.hansecom.mapi.models.FareMediaAutoload.Type) r6
            kotlinx.serialization.internal.StringSerializer r15 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r13 = r0.v(r1, r13, r15, r5)
            java.lang.String r13 = (java.lang.String) r13
            kotlinx.serialization.internal.LongSerializer r15 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r10 = r0.v(r1, r10, r15, r5)
            java.lang.Long r10 = (java.lang.Long) r10
            kotlinx.serialization.internal.IntSerializer r14 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r12 = r0.v(r1, r12, r14, r5)
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r9 = r0.v(r1, r9, r15, r5)
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r8 = r0.v(r1, r8, r15, r5)
            java.lang.Long r8 = (java.lang.Long) r8
            java.lang.Object r7 = r0.v(r1, r7, r3, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r11 = r0.v(r1, r11, r15, r5)
            java.lang.Long r11 = (java.lang.Long) r11
            r14 = 9
            r2 = r2[r14]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r14, r2, r5)
            java.util.List r2 = (java.util.List) r2
            r14 = 10
            java.lang.Object r3 = r0.v(r1, r14, r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r14 = 11
            java.lang.Object r14 = r0.v(r1, r14, r15, r5)
            java.lang.Long r14 = (java.lang.Long) r14
            com.hansecom.mapi.models.FareProduct$$serializer r15 = com.hansecom.mapi.models.FareProduct$$serializer.f39445a
            r16 = r2
            r2 = 12
            java.lang.Object r2 = r0.v(r1, r2, r15, r5)
            com.hansecom.mapi.models.FareProduct r2 = (com.hansecom.mapi.models.FareProduct) r2
            r5 = 8191(0x1fff, float:1.1478E-41)
            r39 = r2
            r37 = r3
            r27 = r4
            r26 = r5
            r28 = r6
            r34 = r7
            r33 = r8
            r32 = r9
            r30 = r10
            r35 = r11
            r31 = r12
            r29 = r13
            r38 = r14
            r36 = r16
            goto L_0x0209
        L_0x00b0:
            r3 = r5
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r21 = r14
            r22 = r15
            r5 = r4
            r4 = r21
            r15 = r4
        L_0x00c2:
            if (r22 == 0) goto L_0x01e6
            r23 = r6
            int r6 = r0.x(r1)
            switch(r6) {
                case -1: goto L_0x01d4;
                case 0: goto L_0x01b7;
                case 1: goto L_0x0198;
                case 2: goto L_0x017f;
                case 3: goto L_0x016f;
                case 4: goto L_0x015e;
                case 5: goto L_0x014f;
                case 6: goto L_0x0140;
                case 7: goto L_0x0130;
                case 8: goto L_0x011f;
                case 9: goto L_0x010a;
                case 10: goto L_0x00f8;
                case 11: goto L_0x00e6;
                case 12: goto L_0x00d3;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x00d3:
            com.hansecom.mapi.models.FareProduct$$serializer r6 = com.hansecom.mapi.models.FareProduct$$serializer.f39445a
            r24 = r14
            r14 = 12
            java.lang.Object r3 = r0.v(r1, r14, r6, r3)
            com.hansecom.mapi.models.FareProduct r3 = (com.hansecom.mapi.models.FareProduct) r3
            r5 = r5 | 4096(0x1000, float:5.74E-42)
        L_0x00e1:
            r6 = r23
            r14 = r24
            goto L_0x00c2
        L_0x00e6:
            r24 = r14
            r14 = 12
            kotlinx.serialization.internal.LongSerializer r6 = kotlinx.serialization.internal.LongSerializer.f42142a
            r14 = 11
            java.lang.Object r6 = r0.v(r1, r14, r6, r11)
            r11 = r6
            java.lang.Long r11 = (java.lang.Long) r11
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x00e1
        L_0x00f8:
            r24 = r14
            r14 = 11
            kotlinx.serialization.internal.BooleanSerializer r6 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r14 = 10
            java.lang.Object r6 = r0.v(r1, r14, r6, r7)
            r7 = r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x00e1
        L_0x010a:
            r24 = r14
            r6 = 9
            r14 = 10
            r17 = r2[r6]
            r14 = r17
            kotlinx.serialization.DeserializationStrategy r14 = (kotlinx.serialization.DeserializationStrategy) r14
            java.lang.Object r8 = r0.v(r1, r6, r14, r8)
            java.util.List r8 = (java.util.List) r8
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x00e1
        L_0x011f:
            r24 = r14
            r6 = 9
            kotlinx.serialization.internal.LongSerializer r14 = kotlinx.serialization.internal.LongSerializer.f42142a
            r6 = 8
            java.lang.Object r9 = r0.v(r1, r6, r14, r9)
            java.lang.Long r9 = (java.lang.Long) r9
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x00e1
        L_0x0130:
            r24 = r14
            r6 = 8
            kotlinx.serialization.internal.BooleanSerializer r14 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r6 = 7
            java.lang.Object r12 = r0.v(r1, r6, r14, r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x00e1
        L_0x0140:
            r24 = r14
            r6 = 7
            kotlinx.serialization.internal.LongSerializer r14 = kotlinx.serialization.internal.LongSerializer.f42142a
            r6 = 6
            java.lang.Object r10 = r0.v(r1, r6, r14, r10)
            java.lang.Long r10 = (java.lang.Long) r10
            r5 = r5 | 64
            goto L_0x00e1
        L_0x014f:
            r24 = r14
            r6 = 6
            kotlinx.serialization.internal.LongSerializer r14 = kotlinx.serialization.internal.LongSerializer.f42142a
            r6 = 5
            java.lang.Object r13 = r0.v(r1, r6, r14, r13)
            java.lang.Long r13 = (java.lang.Long) r13
            r5 = r5 | 32
            goto L_0x00e1
        L_0x015e:
            r24 = r14
            r6 = 5
            kotlinx.serialization.internal.IntSerializer r14 = kotlinx.serialization.internal.IntSerializer.f42129a
            r6 = 4
            java.lang.Object r14 = r0.v(r1, r6, r14, r15)
            r15 = r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r5 = r5 | 16
            goto L_0x00e1
        L_0x016f:
            r24 = r14
            r6 = 4
            kotlinx.serialization.internal.LongSerializer r14 = kotlinx.serialization.internal.LongSerializer.f42142a
            r6 = 3
            java.lang.Object r4 = r0.v(r1, r6, r14, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            r5 = r5 | 8
            goto L_0x00e1
        L_0x017f:
            r24 = r14
            r6 = 3
            kotlinx.serialization.internal.StringSerializer r14 = kotlinx.serialization.internal.StringSerializer.f42197a
            r20 = r3
            r3 = r24
            r6 = 2
            java.lang.Object r3 = r0.v(r1, r6, r14, r3)
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r5 = r5 | 4
            r3 = r20
            r6 = r23
            goto L_0x00c2
        L_0x0198:
            r20 = r3
            r3 = r14
            r6 = 2
            r14 = 1
            r19 = r2[r14]
            r6 = r19
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            r19 = r2
            r2 = r23
            java.lang.Object r2 = r0.v(r1, r14, r6, r2)
            r6 = r2
            com.hansecom.mapi.models.FareMediaAutoload$Type r6 = (com.hansecom.mapi.models.FareMediaAutoload.Type) r6
            r5 = r5 | 2
            r14 = r3
        L_0x01b1:
            r2 = r19
        L_0x01b3:
            r3 = r20
            goto L_0x00c2
        L_0x01b7:
            r19 = r2
            r20 = r3
            r3 = r14
            r2 = r23
            r14 = 1
            kotlinx.serialization.internal.BooleanSerializer r6 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r18 = r2
            r2 = r21
            r14 = 0
            java.lang.Object r2 = r0.v(r1, r14, r6, r2)
            r21 = r2
            java.lang.Boolean r21 = (java.lang.Boolean) r21
            r5 = r5 | 1
            r14 = r3
            r6 = r18
            goto L_0x01b1
        L_0x01d4:
            r19 = r2
            r20 = r3
            r3 = r14
            r2 = r21
            r18 = r23
            r14 = 0
            r22 = r14
            r6 = r18
            r2 = r19
            r14 = r3
            goto L_0x01b3
        L_0x01e6:
            r20 = r3
            r18 = r6
            r3 = r14
            r2 = r21
            r27 = r2
            r29 = r3
            r30 = r4
            r26 = r5
            r37 = r7
            r36 = r8
            r35 = r9
            r33 = r10
            r38 = r11
            r34 = r12
            r32 = r13
            r31 = r15
            r28 = r18
            r39 = r20
        L_0x0209:
            r0.b(r1)
            com.hansecom.mapi.models.FareMediaAutoload r0 = new com.hansecom.mapi.models.FareMediaAutoload
            r40 = 0
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMediaAutoload$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareMediaAutoload");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediaAutoload fareMediaAutoload) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediaAutoload, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediaAutoload.h(fareMediaAutoload, c2, a2);
        c2.b(a2);
    }
}
