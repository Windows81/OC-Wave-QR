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
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class VirtualFareMedia$$serializer implements GeneratedSerializer<VirtualFareMedia> {

    /* renamed from: a  reason: collision with root package name */
    public static final VirtualFareMedia$$serializer f39704a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VirtualFareMedia$$serializer virtualFareMedia$$serializer = new VirtualFareMedia$$serializer();
        f39704a = virtualFareMedia$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.VirtualFareMedia", virtualFareMedia$$serializer, 7);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("name", true);
        pluginGeneratedSerialDescriptor.q("description", true);
        pluginGeneratedSerialDescriptor.q("price", true);
        pluginGeneratedSerialDescriptor.q("riderTypeId", true);
        pluginGeneratedSerialDescriptor.q("riderTypeName", true);
        pluginGeneratedSerialDescriptor.q("riderTypeTerms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        IntSerializer intSerializer = IntSerializer.f42129a;
        KSerializer u2 = BuiltinSerializersKt.u(intSerializer);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(intSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.VirtualFareMedia c(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r27.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x005f
            kotlinx.serialization.internal.IntSerializer r2 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r9 = r0.v(r1, r9, r2, r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            kotlinx.serialization.internal.StringSerializer r11 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r8, r11, r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.v(r1, r7, r11, r10)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.v(r1, r5, r2, r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r2 = r0.v(r1, r6, r2, r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.v(r1, r4, r11, r10)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.v(r1, r3, r11, r10)
            java.lang.String r3 = (java.lang.String) r3
            r6 = 127(0x7f, float:1.78E-43)
            r23 = r2
            r25 = r3
            r24 = r4
            r22 = r5
            r18 = r6
            r21 = r7
            r20 = r8
            r19 = r9
            goto L_0x00e6
        L_0x005f:
            r16 = r8
            r2 = r9
            r9 = r10
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0068:
            if (r16 == 0) goto L_0x00d6
            int r8 = r0.x(r1)
            switch(r8) {
                case -1: goto L_0x00d2;
                case 0: goto L_0x00c3;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009c;
                case 4: goto L_0x0090;
                case 5: goto L_0x0084;
                case 6: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0077:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r3, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
        L_0x0082:
            r8 = 1
            goto L_0x0068
        L_0x0084:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r4, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 32
            goto L_0x0082
        L_0x0090:
            kotlinx.serialization.internal.IntSerializer r8 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r8 = r0.v(r1, r6, r8, r14)
            r14 = r8
            java.lang.Integer r14 = (java.lang.Integer) r14
            r2 = r2 | 16
            goto L_0x0082
        L_0x009c:
            kotlinx.serialization.internal.IntSerializer r8 = kotlinx.serialization.internal.IntSerializer.f42129a
            java.lang.Object r8 = r0.v(r1, r5, r8, r13)
            r13 = r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r2 = r2 | 8
            goto L_0x0082
        L_0x00a8:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r7, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 4
            goto L_0x0082
        L_0x00b4:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 1
            java.lang.Object r8 = r0.v(r1, r3, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 2
            r8 = r3
            r3 = 6
            goto L_0x0068
        L_0x00c3:
            r3 = 1
            kotlinx.serialization.internal.IntSerializer r8 = kotlinx.serialization.internal.IntSerializer.f42129a
            r3 = 0
            java.lang.Object r8 = r0.v(r1, r3, r8, r10)
            r10 = r8
            java.lang.Integer r10 = (java.lang.Integer) r10
            r2 = r2 | 1
        L_0x00d0:
            r3 = 6
            goto L_0x0082
        L_0x00d2:
            r3 = 0
            r16 = r3
            goto L_0x00d0
        L_0x00d6:
            r18 = r2
            r25 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00e6:
            r0.b(r1)
            com.hansecom.mapi.models.VirtualFareMedia r0 = new com.hansecom.mapi.models.VirtualFareMedia
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.VirtualFareMedia$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.VirtualFareMedia");
    }

    /* renamed from: g */
    public void d(Encoder encoder, VirtualFareMedia virtualFareMedia) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(virtualFareMedia, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        VirtualFareMedia.f(virtualFareMedia, c2, a2);
        c2.b(a2);
    }
}
