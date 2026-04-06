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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class FareMedium$$serializer implements GeneratedSerializer<FareMedium> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMedium$$serializer f39396a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMedium$$serializer fareMedium$$serializer = new FareMedium$$serializer();
        f39396a = fareMedium$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMedium", fareMedium$$serializer, 27);
        pluginGeneratedSerialDescriptor.q("cardId", false);
        pluginGeneratedSerialDescriptor.q("expirationDate", false);
        pluginGeneratedSerialDescriptor.q("balance", false);
        pluginGeneratedSerialDescriptor.q("cardHolder", true);
        pluginGeneratedSerialDescriptor.q("staticBarcodePayload", true);
        pluginGeneratedSerialDescriptor.q("nextVerification", true);
        pluginGeneratedSerialDescriptor.q("unblockPossible", true);
        pluginGeneratedSerialDescriptor.q("unblockingReason", true);
        pluginGeneratedSerialDescriptor.q("isVirtualCard", true);
        pluginGeneratedSerialDescriptor.q("locked", true);
        pluginGeneratedSerialDescriptor.q("nickname", true);
        pluginGeneratedSerialDescriptor.q("typeName", true);
        pluginGeneratedSerialDescriptor.q("institution", true);
        pluginGeneratedSerialDescriptor.q("hasInstitutions", true);
        pluginGeneratedSerialDescriptor.q("wallet", true);
        pluginGeneratedSerialDescriptor.q("availablePassesQuantity", true);
        pluginGeneratedSerialDescriptor.q("hasStoredValueAutoload", true);
        pluginGeneratedSerialDescriptor.q("hasIntervalAutoload", true);
        pluginGeneratedSerialDescriptor.q("autoloadState", true);
        pluginGeneratedSerialDescriptor.q("hasAutoRenew", true);
        pluginGeneratedSerialDescriptor.q("fareCategory", true);
        pluginGeneratedSerialDescriptor.q("riderType", true);
        pluginGeneratedSerialDescriptor.q("transitAccountId", true);
        pluginGeneratedSerialDescriptor.q("validTo", true);
        pluginGeneratedSerialDescriptor.q("lowBalance", true);
        pluginGeneratedSerialDescriptor.q("payWithCashBarcode", true);
        pluginGeneratedSerialDescriptor.q("canBeConverted", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = FareMedium.f39368B;
        StringSerializer stringSerializer = StringSerializer.f42197a;
        KSerializer u2 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u3 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u4 = BuiltinSerializersKt.u(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        KSerializer u5 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u6 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u7 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u8 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u9 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u10 = BuiltinSerializersKt.u(stringSerializer);
        KSerializer u11 = BuiltinSerializersKt.u(Institution$$serializer.f39487a);
        KSerializer u12 = BuiltinSerializersKt.u(booleanSerializer);
        KSerializer u13 = BuiltinSerializersKt.u(FareMediumWalletInformation$$serializer.f39431a);
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{stringSerializer, stringSerializer, DoubleSerializer.f42102a, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(a2[18]), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(LongSerializer.f42142a), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(booleanSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(booleanSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: com.hansecom.mapi.models.Institution} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v5, resolved type: com.hansecom.mapi.models.FareMediumWalletInformation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x01a0, code lost:
        r9 = r9 | r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x01a1, code lost:
        r10 = r53;
        r3 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x022c, code lost:
        r9 = r9 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0294, code lost:
        r2 = r18;
        r3 = r19;
        r10 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareMedium c(kotlinx.serialization.encoding.Decoder r87) {
        /*
            r86 = this;
            r0 = r87
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r86.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.FareMedium.f39368B
            boolean r3 = r0.y()
            r12 = 10
            r13 = 9
            r14 = 7
            r15 = 6
            r4 = 5
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x014e
            java.lang.String r3 = r0.t(r1, r10)
            java.lang.String r9 = r0.t(r1, r9)
            double r25 = r0.A(r1, r8)
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r5 = r0.v(r1, r5, r8, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r0.v(r1, r7, r8, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r0.v(r1, r4, r8, r11)
            java.lang.String r4 = (java.lang.String) r4
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r15 = r0.v(r1, r15, r10, r11)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r14 = r0.v(r1, r14, r8, r11)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r6 = r0.v(r1, r6, r10, r11)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r13 = r0.v(r1, r13, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            java.lang.Object r12 = r0.v(r1, r12, r8, r11)
            java.lang.String r12 = (java.lang.String) r12
            r27 = r3
            r3 = 11
            java.lang.Object r3 = r0.v(r1, r3, r8, r11)
            java.lang.String r3 = (java.lang.String) r3
            r24 = r3
            com.hansecom.mapi.models.Institution$$serializer r3 = com.hansecom.mapi.models.Institution$$serializer.f39487a
            r28 = r4
            r4 = 12
            java.lang.Object r3 = r0.v(r1, r4, r3, r11)
            com.hansecom.mapi.models.Institution r3 = (com.hansecom.mapi.models.Institution) r3
            r4 = 13
            java.lang.Object r4 = r0.v(r1, r4, r10, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r21 = r3
            com.hansecom.mapi.models.FareMediumWalletInformation$$serializer r3 = com.hansecom.mapi.models.FareMediumWalletInformation$$serializer.f39431a
            r23 = r4
            r4 = 14
            java.lang.Object r3 = r0.v(r1, r4, r3, r11)
            com.hansecom.mapi.models.FareMediumWalletInformation r3 = (com.hansecom.mapi.models.FareMediumWalletInformation) r3
            kotlinx.serialization.internal.IntSerializer r4 = kotlinx.serialization.internal.IntSerializer.f42129a
            r20 = r3
            r3 = 15
            java.lang.Object r3 = r0.v(r1, r3, r4, r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r19 = r3
            r3 = 16
            java.lang.Object r3 = r0.v(r1, r3, r10, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r18 = r3
            r3 = 17
            java.lang.Object r3 = r0.v(r1, r3, r10, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r11 = 18
            r2 = r2[r11]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            r17 = r9
            r9 = 0
            java.lang.Object r2 = r0.v(r1, r11, r2, r9)
            com.hansecom.mapi.models.FareMedium$AutoloadState r2 = (com.hansecom.mapi.models.FareMedium.AutoloadState) r2
            r11 = 19
            java.lang.Object r11 = r0.v(r1, r11, r10, r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r16 = r2
            r2 = 20
            java.lang.Object r2 = r0.v(r1, r2, r4, r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r4 = 21
            java.lang.Object r4 = r0.v(r1, r4, r8, r9)
            java.lang.String r4 = (java.lang.String) r4
            r87 = r2
            r2 = 22
            r22 = r3
            kotlinx.serialization.internal.LongSerializer r3 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r2 = r0.v(r1, r2, r3, r9)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 23
            java.lang.Object r3 = r0.v(r1, r3, r8, r9)
            java.lang.String r3 = (java.lang.String) r3
            r29 = r2
            r2 = 24
            java.lang.Object r2 = r0.v(r1, r2, r10, r9)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r30 = r2
            r2 = 25
            java.lang.Object r2 = r0.v(r1, r2, r8, r9)
            java.lang.String r2 = (java.lang.String) r2
            r8 = 26
            java.lang.Object r8 = r0.v(r1, r8, r10, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r9 = 134217727(0x7ffffff, float:3.8518597E-34)
            r78 = r87
            r83 = r2
            r81 = r3
            r79 = r4
            r61 = r5
            r66 = r6
            r62 = r7
            r84 = r8
            r56 = r9
            r77 = r11
            r68 = r12
            r67 = r13
            r65 = r14
            r64 = r15
            r76 = r16
            r58 = r17
            r74 = r18
            r73 = r19
            r72 = r20
            r70 = r21
            r75 = r22
            r71 = r23
            r69 = r24
            r59 = r25
            r57 = r27
            r63 = r28
            r80 = r29
            r82 = r30
            goto L_0x0593
        L_0x014e:
            r3 = r9
            r9 = r11
            r25 = 0
            r52 = r3
            r3 = r9
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r37 = r15
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r25
            r25 = r49
            r9 = r10
            r10 = r25
        L_0x0180:
            if (r52 == 0) goto L_0x053f
            r53 = r10
            int r10 = r0.x(r1)
            switch(r10) {
                case -1: goto L_0x051b;
                case 0: goto L_0x04f3;
                case 1: goto L_0x04cb;
                case 2: goto L_0x04a3;
                case 3: goto L_0x046b;
                case 4: goto L_0x0435;
                case 5: goto L_0x0401;
                case 6: goto L_0x03cf;
                case 7: goto L_0x039e;
                case 8: goto L_0x036e;
                case 9: goto L_0x0340;
                case 10: goto L_0x0314;
                case 11: goto L_0x02ea;
                case 12: goto L_0x02c2;
                case 13: goto L_0x029c;
                case 14: goto L_0x027a;
                case 15: goto L_0x025c;
                case 16: goto L_0x0240;
                case 17: goto L_0x022f;
                case 18: goto L_0x0218;
                case 19: goto L_0x0206;
                case 20: goto L_0x01f6;
                case 21: goto L_0x01e6;
                case 22: goto L_0x01d6;
                case 23: goto L_0x01c6;
                case 24: goto L_0x01b6;
                case 25: goto L_0x01a6;
                case 26: goto L_0x0191;
                default: goto L_0x018b;
            }
        L_0x018b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r10)
            throw r0
        L_0x0191:
            r10 = 26
            r54 = r3
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r3 = r0.v(r1, r10, r3, r11)
            r11 = r3
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r3 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x01a0:
            r9 = r9 | r3
        L_0x01a1:
            r10 = r53
            r3 = r54
            goto L_0x0180
        L_0x01a6:
            r54 = r3
            r3 = 25
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r3 = r0.v(r1, r3, r10, r12)
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x01a0
        L_0x01b6:
            r54 = r3
            r3 = 24
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r3 = r0.v(r1, r3, r10, r13)
            r13 = r3
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x01a0
        L_0x01c6:
            r54 = r3
            r3 = 23
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r3 = r0.v(r1, r3, r10, r6)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x01a0
        L_0x01d6:
            r54 = r3
            r3 = 22
            kotlinx.serialization.internal.LongSerializer r10 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r3 = r0.v(r1, r3, r10, r14)
            r14 = r3
            java.lang.Long r14 = (java.lang.Long) r14
            r3 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x01a0
        L_0x01e6:
            r54 = r3
            r3 = 21
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r3 = r0.v(r1, r3, r10, r15)
            r15 = r3
            java.lang.String r15 = (java.lang.String) r15
            r3 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01a0
        L_0x01f6:
            r54 = r3
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            r10 = 20
            java.lang.Object r3 = r0.v(r1, r10, r3, r4)
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01a0
        L_0x0206:
            r54 = r3
            r10 = 20
            kotlinx.serialization.internal.BooleanSerializer r3 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r10 = 19
            java.lang.Object r3 = r0.v(r1, r10, r3, r7)
            r7 = r3
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r3 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01a0
        L_0x0218:
            r54 = r3
            r3 = 18
            r10 = 19
            r16 = r2[r3]
            r10 = r16
            kotlinx.serialization.DeserializationStrategy r10 = (kotlinx.serialization.DeserializationStrategy) r10
            java.lang.Object r5 = r0.v(r1, r3, r10, r5)
            com.hansecom.mapi.models.FareMedium$AutoloadState r5 = (com.hansecom.mapi.models.FareMedium.AutoloadState) r5
            r10 = 262144(0x40000, float:3.67342E-40)
        L_0x022c:
            r9 = r9 | r10
            goto L_0x01a1
        L_0x022f:
            r54 = r3
            r3 = 18
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r3 = 17
            java.lang.Object r8 = r0.v(r1, r3, r10, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x022c
        L_0x0240:
            r54 = r3
            r3 = 17
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r18 = r2
            r2 = r54
            r3 = 16
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r10 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r10
            r3 = r2
            r2 = r18
            r10 = r53
            goto L_0x0180
        L_0x025c:
            r18 = r2
            r2 = r3
            r3 = 16
            kotlinx.serialization.internal.IntSerializer r10 = kotlinx.serialization.internal.IntSerializer.f42129a
            r19 = r2
            r2 = r53
            r3 = 15
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r10 = r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            r2 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r2
            r2 = r18
            r3 = r19
            goto L_0x0180
        L_0x027a:
            r18 = r2
            r19 = r3
            r2 = r53
            r3 = 15
            com.hansecom.mapi.models.FareMediumWalletInformation$$serializer r10 = com.hansecom.mapi.models.FareMediumWalletInformation$$serializer.f39431a
            r20 = r2
            r2 = r49
            r3 = 14
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r49 = r2
            com.hansecom.mapi.models.FareMediumWalletInformation r49 = (com.hansecom.mapi.models.FareMediumWalletInformation) r49
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
        L_0x0294:
            r2 = r18
            r3 = r19
            r10 = r20
            goto L_0x0180
        L_0x029c:
            r18 = r2
            r19 = r3
            r2 = r49
            r20 = r53
            r3 = 14
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r21 = r2
            r2 = r48
            r3 = 13
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r48 = r2
            java.lang.Boolean r48 = (java.lang.Boolean) r48
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r2 = r18
            r3 = r19
            r10 = r20
            r49 = r21
            goto L_0x0180
        L_0x02c2:
            r18 = r2
            r19 = r3
            r2 = r48
            r21 = r49
            r20 = r53
            r3 = 13
            com.hansecom.mapi.models.Institution$$serializer r10 = com.hansecom.mapi.models.Institution$$serializer.f39487a
            r23 = r2
            r2 = r47
            r3 = 12
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r47 = r2
            com.hansecom.mapi.models.Institution r47 = (com.hansecom.mapi.models.Institution) r47
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r2 = r18
            r3 = r19
            r10 = r20
            r48 = r23
            goto L_0x0180
        L_0x02ea:
            r18 = r2
            r19 = r3
            r2 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 12
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r24 = r2
            r2 = r46
            r3 = 11
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r46 = r2
            java.lang.String r46 = (java.lang.String) r46
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r2 = r18
            r3 = r19
            r10 = r20
            r47 = r24
            goto L_0x0180
        L_0x0314:
            r18 = r2
            r19 = r3
            r2 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 11
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r36 = r2
            r2 = r45
            r3 = 10
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r45 = r2
            java.lang.String r45 = (java.lang.String) r45
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r2 = r18
            r3 = r19
            r10 = r20
            r46 = r36
            goto L_0x0180
        L_0x0340:
            r18 = r2
            r19 = r3
            r2 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 10
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r35 = r2
            r2 = r44
            r3 = 9
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r44 = r2
            java.lang.Boolean r44 = (java.lang.Boolean) r44
            r9 = r9 | 512(0x200, float:7.175E-43)
            r2 = r18
            r3 = r19
            r10 = r20
            r45 = r35
            goto L_0x0180
        L_0x036e:
            r18 = r2
            r19 = r3
            r2 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 9
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r34 = r2
            r2 = r43
            r3 = 8
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r43 = r2
            java.lang.Boolean r43 = (java.lang.Boolean) r43
            r9 = r9 | 256(0x100, float:3.59E-43)
            r2 = r18
            r3 = r19
            r10 = r20
            r44 = r34
            goto L_0x0180
        L_0x039e:
            r18 = r2
            r19 = r3
            r2 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 8
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r33 = r2
            r2 = r42
            r3 = 7
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r42 = r2
            java.lang.String r42 = (java.lang.String) r42
            r9 = r9 | 128(0x80, float:1.794E-43)
            r2 = r18
            r3 = r19
            r10 = r20
            r43 = r33
            goto L_0x0180
        L_0x03cf:
            r18 = r2
            r19 = r3
            r2 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 7
            kotlinx.serialization.internal.BooleanSerializer r10 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r32 = r2
            r2 = r41
            r3 = 6
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r41 = r2
            java.lang.Boolean r41 = (java.lang.Boolean) r41
            r9 = r9 | 64
            r2 = r18
            r3 = r19
            r10 = r20
            r42 = r32
            goto L_0x0180
        L_0x0401:
            r18 = r2
            r19 = r3
            r2 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 6
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r31 = r2
            r2 = r40
            r3 = 5
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r40 = r2
            java.lang.String r40 = (java.lang.String) r40
            r9 = r9 | 32
            r2 = r18
            r3 = r19
            r10 = r20
            r41 = r31
            goto L_0x0180
        L_0x0435:
            r18 = r2
            r19 = r3
            r2 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 5
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r30 = r2
            r2 = r39
            r3 = 4
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r39 = r2
            java.lang.String r39 = (java.lang.String) r39
            r9 = r9 | 16
            r2 = r18
            r3 = r19
            r10 = r20
            r40 = r30
            goto L_0x0180
        L_0x046b:
            r18 = r2
            r19 = r3
            r2 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 4
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            r29 = r2
            r2 = r38
            r3 = 3
            java.lang.Object r2 = r0.v(r1, r3, r10, r2)
            r38 = r2
            java.lang.String r38 = (java.lang.String) r38
            r9 = r9 | 8
            r2 = r18
            r3 = r19
            r10 = r20
            r39 = r29
            goto L_0x0180
        L_0x04a3:
            r18 = r2
            r19 = r3
            r2 = r38
            r29 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 3
            r10 = 2
            double r50 = r0.A(r1, r10)
            r9 = r9 | 4
            goto L_0x0294
        L_0x04cb:
            r18 = r2
            r19 = r3
            r2 = r38
            r29 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 1
            r10 = 2
            java.lang.String r25 = r0.t(r1, r3)
            r9 = r9 | 2
            goto L_0x0294
        L_0x04f3:
            r18 = r2
            r19 = r3
            r2 = r38
            r29 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 0
            r10 = 2
            java.lang.String r37 = r0.t(r1, r3)
            r9 = r9 | 1
            goto L_0x0294
        L_0x051b:
            r18 = r2
            r19 = r3
            r2 = r38
            r29 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r20 = r53
            r3 = 0
            r10 = 2
            r52 = r3
            goto L_0x0294
        L_0x053f:
            r19 = r3
            r20 = r10
            r2 = r38
            r29 = r39
            r30 = r40
            r31 = r41
            r32 = r42
            r33 = r43
            r34 = r44
            r35 = r45
            r36 = r46
            r24 = r47
            r23 = r48
            r21 = r49
            r61 = r2
            r78 = r4
            r76 = r5
            r81 = r6
            r77 = r7
            r75 = r8
            r56 = r9
            r84 = r11
            r83 = r12
            r82 = r13
            r80 = r14
            r79 = r15
            r74 = r19
            r73 = r20
            r72 = r21
            r71 = r23
            r70 = r24
            r58 = r25
            r62 = r29
            r63 = r30
            r64 = r31
            r65 = r32
            r66 = r33
            r67 = r34
            r68 = r35
            r69 = r36
            r57 = r37
            r59 = r50
        L_0x0593:
            r0.b(r1)
            com.hansecom.mapi.models.FareMedium r0 = new com.hansecom.mapi.models.FareMedium
            r55 = r0
            r85 = 0
            r55.<init>(r56, r57, r58, r59, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMedium$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareMedium");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMedium fareMedium) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMedium, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMedium.r(fareMedium, c2, a2);
        c2.b(a2);
    }
}
