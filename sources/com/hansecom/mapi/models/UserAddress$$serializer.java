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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class UserAddress$$serializer implements GeneratedSerializer<UserAddress> {

    /* renamed from: a  reason: collision with root package name */
    public static final UserAddress$$serializer f39673a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserAddress$$serializer userAddress$$serializer = new UserAddress$$serializer();
        f39673a = userAddress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.UserAddress", userAddress$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("userAddressId", true);
        pluginGeneratedSerialDescriptor.q("street", true);
        pluginGeneratedSerialDescriptor.q("street_optional", true);
        pluginGeneratedSerialDescriptor.q("city", true);
        pluginGeneratedSerialDescriptor.q("state", true);
        pluginGeneratedSerialDescriptor.q("stateIsEnum", true);
        pluginGeneratedSerialDescriptor.q("country", true);
        pluginGeneratedSerialDescriptor.q("zip", true);
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
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.UserAddress c(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r28.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x006a
            kotlinx.serialization.internal.LongSerializer r2 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r2 = r0.v(r1, r10, r2, r11)
            java.lang.Long r2 = (java.lang.Long) r2
            kotlinx.serialization.internal.StringSerializer r10 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r9 = r0.v(r1, r9, r10, r11)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.v(r1, r8, r10, r11)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.v(r1, r6, r10, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.v(r1, r7, r10, r11)
            java.lang.String r7 = (java.lang.String) r7
            kotlinx.serialization.internal.BooleanSerializer r12 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r5 = r0.v(r1, r5, r12, r11)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Object r4 = r0.v(r1, r4, r10, r11)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.v(r1, r3, r10, r11)
            java.lang.String r3 = (java.lang.String) r3
            r10 = 255(0xff, float:3.57E-43)
            r19 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            r18 = r10
            goto L_0x0104
        L_0x006a:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0074:
            if (r16 == 0) goto L_0x00f2
            int r6 = r0.x(r1)
            switch(r6) {
                case -1: goto L_0x00ee;
                case 0: goto L_0x00e0;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009c;
                case 6: goto L_0x0090;
                case 7: goto L_0x0083;
                default: goto L_0x007d;
            }
        L_0x007d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0083:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r3, r6, r8)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x008e:
            r6 = 3
            goto L_0x0074
        L_0x0090:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r4, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x008e
        L_0x009c:
            kotlinx.serialization.internal.BooleanSerializer r6 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r6 = r0.v(r1, r5, r6, r10)
            r10 = r6
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r2 = r2 | 32
            goto L_0x008e
        L_0x00a8:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r7, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 16
            goto L_0x008e
        L_0x00b4:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 3
            java.lang.Object r6 = r0.v(r1, r3, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x0074
        L_0x00c3:
            r3 = 3
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 2
            java.lang.Object r6 = r0.v(r1, r3, r6, r13)
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 4
        L_0x00d0:
            r3 = 7
            goto L_0x008e
        L_0x00d2:
            r3 = 2
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r3 = 1
            java.lang.Object r6 = r0.v(r1, r3, r6, r12)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 2
            goto L_0x00d0
        L_0x00e0:
            r3 = 1
            kotlinx.serialization.internal.LongSerializer r6 = kotlinx.serialization.internal.LongSerializer.f42142a
            r3 = 0
            java.lang.Object r6 = r0.v(r1, r3, r6, r11)
            r11 = r6
            java.lang.Long r11 = (java.lang.Long) r11
            r2 = r2 | 1
            goto L_0x00d0
        L_0x00ee:
            r3 = 0
            r16 = r3
            goto L_0x00d0
        L_0x00f2:
            r18 = r2
            r26 = r8
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x0104:
            r0.b(r1)
            com.hansecom.mapi.models.UserAddress r0 = new com.hansecom.mapi.models.UserAddress
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.UserAddress$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.UserAddress");
    }

    /* renamed from: g */
    public void d(Encoder encoder, UserAddress userAddress) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(userAddress, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        UserAddress.h(userAddress, c2, a2);
        c2.b(a2);
    }
}
