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
public final class FareProduct$$serializer implements GeneratedSerializer<FareProduct> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareProduct$$serializer f39445a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareProduct$$serializer fareProduct$$serializer = new FareProduct$$serializer();
        f39445a = fareProduct$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareProduct", fareProduct$$serializer, 13);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("autoloadEnabled", true);
        pluginGeneratedSerialDescriptor.q("isActive", true);
        pluginGeneratedSerialDescriptor.q("name", true);
        pluginGeneratedSerialDescriptor.q("description", true);
        pluginGeneratedSerialDescriptor.q("typeId", true);
        pluginGeneratedSerialDescriptor.q("activateUntil", true);
        pluginGeneratedSerialDescriptor.q("validFrom", true);
        pluginGeneratedSerialDescriptor.q("validTo", true);
        pluginGeneratedSerialDescriptor.q("price", true);
        pluginGeneratedSerialDescriptor.q("hasAutoloads", true);
        pluginGeneratedSerialDescriptor.q("validityDescription", true);
        pluginGeneratedSerialDescriptor.q("groupSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer u2 = BuiltinSerializersKt.u(LongSerializer.f42142a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        KSerializer u3 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u4 = BuiltinSerializersKt.u(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        KSerializer u5 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u6 = BuiltinSerializersKt.u(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{u2, u3, u4, u5, u6, BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00cf, code lost:
        r3 = r19;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ac, code lost:
        r2 = r16;
        r4 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareProduct c(kotlinx.serialization.encoding.Decoder r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r37.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 1
            r15 = 0
            r3 = 0
            if (r2 == 0) goto L_0x00a0
            kotlinx.serialization.internal.LongSerializer r2 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r2 = r0.v(r1, r15, r2, r3)
            java.lang.Long r2 = (java.lang.Long) r2
            kotlinx.serialization.internal.BooleanSerializer r15 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r14 = r0.v(r1, r14, r15, r3)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r13 = r0.v(r1, r13, r15, r3)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r10 = r0.v(r1, r10, r4, r3)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r0.v(r1, r12, r4, r3)
            java.lang.String r12 = (java.lang.String) r12
            kotlinx.serialization.internal.IntSerializer r5 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r9 = r0.v(r1, r9, r5, r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r8 = r0.v(r1, r8, r4, r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.v(r1, r7, r4, r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r0.v(r1, r11, r4, r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r6 = r0.v(r1, r6, r5, r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r16 = r2
            r2 = 10
            java.lang.Object r2 = r0.v(r1, r2, r15, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r15 = 11
            java.lang.Object r4 = r0.v(r1, r15, r4, r3)
            java.lang.String r4 = (java.lang.String) r4
            r15 = 12
            java.lang.Object r3 = r0.v(r1, r15, r5, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r5 = 8191(0x1fff, float:1.1478E-41)
            r33 = r2
            r35 = r3
            r34 = r4
            r22 = r5
            r32 = r6
            r30 = r7
            r29 = r8
            r28 = r9
            r26 = r10
            r31 = r11
            r27 = r12
            r25 = r13
            r24 = r14
            r23 = r16
            goto L_0x01de
        L_0x00a0:
            r2 = r3
            r4 = r2
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r18 = r14
            r6 = r15
            r14 = r13
            r15 = r14
        L_0x00af:
            if (r18 == 0) goto L_0x01bd
            r19 = r3
            int r3 = r0.x(r1)
            switch(r3) {
                case -1: goto L_0x01b2;
                case 0: goto L_0x0199;
                case 1: goto L_0x0180;
                case 2: goto L_0x016f;
                case 3: goto L_0x015e;
                case 4: goto L_0x014d;
                case 5: goto L_0x013d;
                case 6: goto L_0x012d;
                case 7: goto L_0x011c;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f8;
                case 10: goto L_0x00e6;
                case 11: goto L_0x00d4;
                case 12: goto L_0x00c0;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r3)
            throw r0
        L_0x00c0:
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            r20 = r2
            r2 = 12
            java.lang.Object r3 = r0.v(r1, r2, r3, r11)
            r11 = r3
            java.lang.Integer r11 = (java.lang.Integer) r11
            r6 = r6 | 4096(0x1000, float:5.74E-42)
        L_0x00cf:
            r3 = r19
            r2 = r20
            goto L_0x00af
        L_0x00d4:
            r20 = r2
            r2 = 12
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 11
            java.lang.Object r3 = r0.v(r1, r2, r3, r7)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x00cf
        L_0x00e6:
            r20 = r2
            r2 = 11
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r2 = 10
            java.lang.Object r3 = r0.v(r1, r2, r3, r8)
            r8 = r3
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x00cf
        L_0x00f8:
            r20 = r2
            r2 = 10
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            r2 = 9
            java.lang.Object r3 = r0.v(r1, r2, r3, r9)
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x00cf
        L_0x010a:
            r20 = r2
            r2 = 9
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 8
            java.lang.Object r3 = r0.v(r1, r2, r3, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x00cf
        L_0x011c:
            r20 = r2
            r2 = 8
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 7
            java.lang.Object r3 = r0.v(r1, r2, r3, r10)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x00cf
        L_0x012d:
            r20 = r2
            r2 = 7
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 6
            java.lang.Object r3 = r0.v(r1, r2, r3, r13)
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            r6 = r6 | 64
            goto L_0x00cf
        L_0x013d:
            r20 = r2
            r2 = 6
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            r2 = 5
            java.lang.Object r3 = r0.v(r1, r2, r3, r14)
            r14 = r3
            java.lang.Integer r14 = (java.lang.Integer) r14
            r6 = r6 | 32
            goto L_0x00cf
        L_0x014d:
            r20 = r2
            r2 = 5
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 4
            java.lang.Object r3 = r0.v(r1, r2, r3, r15)
            r15 = r3
            java.lang.String r15 = (java.lang.String) r15
            r6 = r6 | 16
            goto L_0x00cf
        L_0x015e:
            r20 = r2
            r2 = 4
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            r2 = 3
            java.lang.Object r3 = r0.v(r1, r2, r3, r5)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r6 = r6 | 8
            goto L_0x00cf
        L_0x016f:
            r20 = r2
            r2 = 3
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r2 = 2
            java.lang.Object r3 = r0.v(r1, r2, r3, r4)
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r6 = r6 | 4
            goto L_0x00cf
        L_0x0180:
            r20 = r2
            r2 = 2
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r17 = r4
            r4 = r20
            r2 = 1
            java.lang.Object r3 = r0.v(r1, r2, r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r6 = r6 | 2
            r2 = r3
            r4 = r17
            r3 = r19
            goto L_0x00af
        L_0x0199:
            r17 = r4
            r4 = r2
            r2 = 1
            kotlinx.serialization.internal.LongSerializer r3 = kotlinx.serialization.internal.LongSerializer.f42142a
            r16 = r4
            r4 = r19
            r2 = 0
            java.lang.Object r3 = r0.v(r1, r2, r3, r4)
            java.lang.Long r3 = (java.lang.Long) r3
            r6 = r6 | 1
        L_0x01ac:
            r2 = r16
            r4 = r17
            goto L_0x00af
        L_0x01b2:
            r16 = r2
            r17 = r4
            r4 = r19
            r2 = 0
            r18 = r2
            r3 = r4
            goto L_0x01ac
        L_0x01bd:
            r16 = r2
            r17 = r4
            r4 = r3
            r23 = r4
            r26 = r5
            r22 = r6
            r34 = r7
            r33 = r8
            r32 = r9
            r30 = r10
            r35 = r11
            r31 = r12
            r29 = r13
            r28 = r14
            r27 = r15
            r24 = r16
            r25 = r17
        L_0x01de:
            r0.b(r1)
            com.hansecom.mapi.models.FareProduct r0 = new com.hansecom.mapi.models.FareProduct
            r36 = 0
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareProduct$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareProduct");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareProduct fareProduct) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareProduct, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareProduct.i(fareProduct, c2, a2);
        c2.b(a2);
    }
}
