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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public final class UserCreateRequest$$serializer implements GeneratedSerializer<UserCreateRequest> {

    /* renamed from: a  reason: collision with root package name */
    public static final UserCreateRequest$$serializer f39683a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserCreateRequest$$serializer userCreateRequest$$serializer = new UserCreateRequest$$serializer();
        f39683a = userCreateRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.UserCreateRequest", userCreateRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("email", false);
        pluginGeneratedSerialDescriptor.q("firstName", false);
        pluginGeneratedSerialDescriptor.q("lastName", false);
        pluginGeneratedSerialDescriptor.q("password", false);
        pluginGeneratedSerialDescriptor.q("allowNewsletter", true);
        pluginGeneratedSerialDescriptor.q("securityQuestions", true);
        pluginGeneratedSerialDescriptor.q("phoneNumber", true);
        pluginGeneratedSerialDescriptor.q("ivrPin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = UserCreateRequest.f39674i;
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.u(BooleanSerializer.f42073a), BuiltinSerializersKt.u(a2[5]), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b3, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b4, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.UserCreateRequest c(kotlinx.serialization.encoding.Decoder r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r31.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.UserCreateRequest.f39674i
            boolean r3 = r0.y()
            r4 = 7
            r5 = 6
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = r0.t(r1, r11)
            java.lang.String r10 = r0.t(r1, r10)
            java.lang.String r8 = r0.t(r1, r8)
            java.lang.String r6 = r0.t(r1, r6)
            kotlinx.serialization.internal.BooleanSerializer r11 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            java.lang.Object r7 = r0.v(r1, r7, r11, r12)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r2 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            kotlinx.serialization.internal.StringSerializer r9 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r5 = r0.v(r1, r5, r9, r12)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.v(r1, r4, r9, r12)
            java.lang.String r4 = (java.lang.String) r4
            r9 = 255(0xff, float:3.57E-43)
            r27 = r2
            r22 = r3
            r29 = r4
            r28 = r5
            r25 = r6
            r26 = r7
            r24 = r8
            r21 = r9
            r23 = r10
            goto L_0x0108
        L_0x0068:
            r19 = r10
            r3 = r11
            r6 = r12
            r8 = r6
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0072:
            if (r19 == 0) goto L_0x00f6
            int r7 = r0.x(r1)
            switch(r7) {
                case -1: goto L_0x00ec;
                case 0: goto L_0x00db;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00a7;
                case 5: goto L_0x0099;
                case 6: goto L_0x008d;
                case 7: goto L_0x0081;
                default: goto L_0x007b;
            }
        L_0x007b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r7)
            throw r0
        L_0x0081:
            kotlinx.serialization.internal.StringSerializer r7 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r4, r7, r6)
            java.lang.String r6 = (java.lang.String) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x008b:
            r7 = 4
            goto L_0x0072
        L_0x008d:
            kotlinx.serialization.internal.StringSerializer r7 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r7 = r0.v(r1, r5, r7, r8)
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 64
            goto L_0x008b
        L_0x0099:
            r7 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r7 = (kotlinx.serialization.DeserializationStrategy) r7
            java.lang.Object r7 = r0.v(r1, r9, r7, r10)
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x008b
        L_0x00a7:
            kotlinx.serialization.internal.BooleanSerializer r7 = kotlinx.serialization.internal.BooleanSerializer.f42073a
            r4 = 4
            java.lang.Object r7 = r0.v(r1, r4, r7, r11)
            r11 = r7
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r3 = r3 | 16
        L_0x00b3:
            r7 = r4
        L_0x00b4:
            r4 = 7
            goto L_0x0072
        L_0x00b6:
            r4 = 4
            r7 = 3
            java.lang.String r15 = r0.t(r1, r7)
            r3 = r3 | 8
            goto L_0x00b3
        L_0x00bf:
            r4 = 4
            r7 = 3
            r14 = 2
            java.lang.String r17 = r0.t(r1, r14)
            r3 = r3 | 4
            r7 = r4
            r14 = r17
            goto L_0x00b4
        L_0x00cc:
            r4 = 4
            r7 = 3
            r13 = 1
            r16 = 2
            java.lang.String r17 = r0.t(r1, r13)
            r3 = r3 | 2
            r7 = r4
            r13 = r17
            goto L_0x00b4
        L_0x00db:
            r4 = 4
            r7 = 3
            r12 = 0
            r16 = 2
            r17 = 1
            java.lang.String r18 = r0.t(r1, r12)
            r3 = r3 | 1
            r7 = r4
            r12 = r18
            goto L_0x00b4
        L_0x00ec:
            r7 = 3
            r16 = 2
            r17 = 1
            r18 = 0
            r19 = r18
            goto L_0x008b
        L_0x00f6:
            r21 = r3
            r29 = r6
            r28 = r8
            r27 = r10
            r26 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            r25 = r15
        L_0x0108:
            r0.b(r1)
            com.hansecom.mapi.models.UserCreateRequest r0 = new com.hansecom.mapi.models.UserCreateRequest
            r30 = 0
            r20 = r0
            r20.<init>((int) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.Boolean) r26, (java.util.List) r27, (java.lang.String) r28, (java.lang.String) r29, (kotlinx.serialization.internal.SerializationConstructorMarker) r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.UserCreateRequest$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.UserCreateRequest");
    }

    /* renamed from: g */
    public void d(Encoder encoder, UserCreateRequest userCreateRequest) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(userCreateRequest, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        UserCreateRequest.b(userCreateRequest, c2, a2);
        c2.b(a2);
    }
}
