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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata
@Deprecated
public final class FareMediumConfigurations$$serializer implements GeneratedSerializer<FareMediumConfigurations> {

    /* renamed from: a  reason: collision with root package name */
    public static final FareMediumConfigurations$$serializer f39410a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FareMediumConfigurations$$serializer fareMediumConfigurations$$serializer = new FareMediumConfigurations$$serializer();
        f39410a = fareMediumConfigurations$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.FareMediumConfigurations", fareMediumConfigurations$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("minTopUp", true);
        pluginGeneratedSerialDescriptor.q("maxTopUp", true);
        pluginGeneratedSerialDescriptor.q("minAutoloadTopUp", true);
        pluginGeneratedSerialDescriptor.q("defaultThresholdAutoloadTopUp", true);
        pluginGeneratedSerialDescriptor.q("maxBalance", true);
        pluginGeneratedSerialDescriptor.q("topUpOptions", true);
        pluginGeneratedSerialDescriptor.q("fixedAutoloadAmountOptions", true);
        pluginGeneratedSerialDescriptor.q("maxInstitutions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = FareMediumConfigurations.f39401i;
        IntSerializer intSerializer = IntSerializer.f42129a;
        return new KSerializer[]{BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(a2[5]), BuiltinSerializersKt.u(a2[6]), BuiltinSerializersKt.u(intSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.FareMediumConfigurations c(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r28.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.FareMediumConfigurations.f39401i
            boolean r3 = r0.y()
            r4 = 7
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0072
            kotlinx.serialization.internal.IntSerializer r3 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r11 = r0.v(r1, r11, r3, r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r10 = r0.v(r1, r10, r3, r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r7 = r0.v(r1, r7, r3, r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r5 = r0.v(r1, r5, r3, r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r0.v(r1, r6, r3, r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r13 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r13 = (kotlinx.serialization.DeserializationStrategy) r13
            java.lang.Object r9 = r0.v(r1, r9, r13, r12)
            java.util.List r9 = (java.util.List) r9
            r2 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r8, r2, r12)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.v(r1, r4, r3, r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 255(0xff, float:3.57E-43)
            r25 = r2
            r26 = r3
            r18 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r24 = r9
            r20 = r10
            r19 = r11
            goto L_0x0111
        L_0x0072:
            r16 = r10
            r3 = r11
            r5 = r12
            r7 = r5
            r10 = r7
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007c:
            if (r16 == 0) goto L_0x00ff
            int r6 = r0.x(r1)
            switch(r6) {
                case -1: goto L_0x00fb;
                case 0: goto L_0x00ed;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00a5;
                case 6: goto L_0x0097;
                case 7: goto L_0x008b;
                default: goto L_0x0085;
            }
        L_0x0085:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x008b:
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r5 = r0.v(r1, r4, r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0095:
            r6 = 4
            goto L_0x007c
        L_0x0097:
            r6 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r6 = r0.v(r1, r8, r6, r7)
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 64
            goto L_0x0095
        L_0x00a5:
            r6 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r6 = r0.v(r1, r9, r6, r10)
            r10 = r6
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x0095
        L_0x00b3:
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 4
            java.lang.Object r6 = r0.v(r1, r4, r6, r11)
            r11 = r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3 = r3 | 16
            r6 = r4
            r4 = 7
            goto L_0x007c
        L_0x00c2:
            r4 = 4
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 3
            java.lang.Object r6 = r0.v(r1, r4, r6, r15)
            r15 = r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            r3 = r3 | 8
        L_0x00cf:
            r4 = 7
            goto L_0x0095
        L_0x00d1:
            r4 = 3
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 2
            java.lang.Object r6 = r0.v(r1, r4, r6, r14)
            r14 = r6
            java.lang.Integer r14 = (java.lang.Integer) r14
            r3 = r3 | 4
            goto L_0x00cf
        L_0x00df:
            r4 = 2
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 1
            java.lang.Object r6 = r0.v(r1, r4, r6, r13)
            r13 = r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            r3 = r3 | 2
            goto L_0x00cf
        L_0x00ed:
            r4 = 1
            kotlinx.serialization.internal.IntSerializer r6 = kotlinx.serialization.internal.IntSerializer.f42129a
            r4 = 0
            java.lang.Object r6 = r0.v(r1, r4, r6, r12)
            r12 = r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            r3 = r3 | 1
            goto L_0x00cf
        L_0x00fb:
            r4 = 0
            r16 = r4
            goto L_0x00cf
        L_0x00ff:
            r18 = r3
            r26 = r5
            r25 = r7
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0111:
            r0.b(r1)
            com.hansecom.mapi.models.FareMediumConfigurations r0 = new com.hansecom.mapi.models.FareMediumConfigurations
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.FareMediumConfigurations$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.FareMediumConfigurations");
    }

    /* renamed from: g */
    public void d(Encoder encoder, FareMediumConfigurations fareMediumConfigurations) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(fareMediumConfigurations, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        FareMediumConfigurations.j(fareMediumConfigurations, c2, a2);
        c2.b(a2);
    }
}
