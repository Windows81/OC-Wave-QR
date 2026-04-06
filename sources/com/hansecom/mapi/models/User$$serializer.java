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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class User$$serializer implements GeneratedSerializer<User> {

    /* renamed from: a  reason: collision with root package name */
    public static final User$$serializer f39660a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        User$$serializer user$$serializer = new User$$serializer();
        f39660a = user$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.User", user$$serializer, 9);
        pluginGeneratedSerialDescriptor.q("id", true);
        pluginGeneratedSerialDescriptor.q("userName", true);
        pluginGeneratedSerialDescriptor.q("email", true);
        pluginGeneratedSerialDescriptor.q("firstName", true);
        pluginGeneratedSerialDescriptor.q("lastName", true);
        pluginGeneratedSerialDescriptor.q("phoneNumber", true);
        pluginGeneratedSerialDescriptor.q("state", true);
        pluginGeneratedSerialDescriptor.q("fareMedia", true);
        pluginGeneratedSerialDescriptor.q("userAddresses", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = User.f39650j;
        KSerializer u2 = BuiltinSerializersKt.u(LongSerializer.f42142a);
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{u2, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(a2[6]), BuiltinSerializersKt.u(a2[7]), BuiltinSerializersKt.u(UserAddress$$serializer.f39673a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d2, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d4, code lost:
        r9 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.User c(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r30.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.User.f39650j
            boolean r3 = r0.y()
            r4 = 5
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 7
            r10 = 6
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0080
            kotlinx.serialization.internal.LongSerializer r3 = kotlinx.serialization.internal.LongSerializer.f42142a
            java.lang.Object r3 = r0.v(r1, r12, r3, r13)
            java.lang.Long r3 = (java.lang.Long) r3
            kotlinx.serialization.internal.StringSerializer r12 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r11 = r0.v(r1, r11, r12, r13)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r0.v(r1, r8, r12, r13)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r0.v(r1, r5, r12, r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r0.v(r1, r7, r12, r13)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r0.v(r1, r4, r12, r13)
            java.lang.String r4 = (java.lang.String) r4
            r12 = r2[r10]
            kotlinx.serialization.DeserializationStrategy r12 = (kotlinx.serialization.DeserializationStrategy) r12
            java.lang.Object r10 = r0.v(r1, r10, r12, r13)
            com.hansecom.mapi.models.User$State r10 = (com.hansecom.mapi.models.User.State) r10
            r2 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r9, r2, r13)
            java.util.List r2 = (java.util.List) r2
            com.hansecom.mapi.models.UserAddress$$serializer r9 = com.hansecom.mapi.models.UserAddress$$serializer.f39673a
            java.lang.Object r6 = r0.v(r1, r6, r9, r13)
            com.hansecom.mapi.models.UserAddress r6 = (com.hansecom.mapi.models.UserAddress) r6
            r9 = 511(0x1ff, float:7.16E-43)
            r27 = r2
            r20 = r3
            r25 = r4
            r23 = r5
            r28 = r6
            r24 = r7
            r22 = r8
            r19 = r9
            r26 = r10
            r21 = r11
            goto L_0x013a
        L_0x0080:
            r16 = r11
            r3 = r12
            r4 = r13
            r5 = r4
            r7 = r5
            r8 = r7
            r11 = r8
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x008b:
            if (r16 == 0) goto L_0x0126
            int r10 = r0.x(r1)
            switch(r10) {
                case -1: goto L_0x0121;
                case 0: goto L_0x0112;
                case 1: goto L_0x0103;
                case 2: goto L_0x00f4;
                case 3: goto L_0x00e5;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a6;
                case 8: goto L_0x009a;
                default: goto L_0x0094;
            }
        L_0x0094:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r10)
            throw r0
        L_0x009a:
            com.hansecom.mapi.models.UserAddress$$serializer r10 = com.hansecom.mapi.models.UserAddress$$serializer.f39673a
            java.lang.Object r4 = r0.v(r1, r6, r10, r4)
            com.hansecom.mapi.models.UserAddress r4 = (com.hansecom.mapi.models.UserAddress) r4
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x00a4:
            r10 = 6
            goto L_0x008b
        L_0x00a6:
            r10 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r10 = (kotlinx.serialization.DeserializationStrategy) r10
            java.lang.Object r7 = r0.v(r1, r9, r10, r7)
            java.util.List r7 = (java.util.List) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00a4
        L_0x00b3:
            r10 = 6
            r17 = r2[r10]
            r6 = r17
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r5 = r0.v(r1, r10, r6, r5)
            com.hansecom.mapi.models.User$State r5 = (com.hansecom.mapi.models.User.State) r5
            r3 = r3 | 64
            r6 = 8
            goto L_0x008b
        L_0x00c5:
            r10 = 6
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r9 = 5
            java.lang.Object r6 = r0.v(r1, r9, r6, r8)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 32
        L_0x00d2:
            r6 = 8
        L_0x00d4:
            r9 = 7
            goto L_0x008b
        L_0x00d6:
            r9 = 5
            r10 = 6
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r9 = 4
            java.lang.Object r6 = r0.v(r1, r9, r6, r11)
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 16
            goto L_0x00d2
        L_0x00e5:
            r9 = 4
            r10 = 6
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r9 = 3
            java.lang.Object r6 = r0.v(r1, r9, r6, r12)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x00d2
        L_0x00f4:
            r9 = 3
            r10 = 6
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r9 = 2
            java.lang.Object r6 = r0.v(r1, r9, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 4
            goto L_0x00d2
        L_0x0103:
            r9 = 2
            r10 = 6
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r9 = 1
            java.lang.Object r6 = r0.v(r1, r9, r6, r14)
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 2
            goto L_0x00d2
        L_0x0112:
            r9 = 1
            r10 = 6
            kotlinx.serialization.internal.LongSerializer r6 = kotlinx.serialization.internal.LongSerializer.f42142a
            r9 = 0
            java.lang.Object r6 = r0.v(r1, r9, r6, r13)
            r13 = r6
            java.lang.Long r13 = (java.lang.Long) r13
            r3 = r3 | 1
            goto L_0x00d2
        L_0x0121:
            r9 = 0
            r10 = 6
            r16 = r9
            goto L_0x00d4
        L_0x0126:
            r19 = r3
            r28 = r4
            r26 = r5
            r27 = r7
            r25 = r8
            r24 = r11
            r23 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x013a:
            r0.b(r1)
            com.hansecom.mapi.models.User r0 = new com.hansecom.mapi.models.User
            r29 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.User$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.User");
    }

    /* renamed from: g */
    public void d(Encoder encoder, User user) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(user, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        User.j(user, c2, a2);
        c2.b(a2);
    }
}
