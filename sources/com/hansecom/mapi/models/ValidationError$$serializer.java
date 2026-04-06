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
public final class ValidationError$$serializer implements GeneratedSerializer<ValidationError> {

    /* renamed from: a  reason: collision with root package name */
    public static final ValidationError$$serializer f39690a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ValidationError$$serializer validationError$$serializer = new ValidationError$$serializer();
        f39690a = validationError$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.ValidationError", validationError$$serializer, 5);
        pluginGeneratedSerialDescriptor.q("code", false);
        pluginGeneratedSerialDescriptor.q("field", false);
        pluginGeneratedSerialDescriptor.q("message", true);
        pluginGeneratedSerialDescriptor.q("localizationKey", true);
        pluginGeneratedSerialDescriptor.q("localizationValues", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        KSerializer[] a2 = ValidationError.f39684f;
        KSerializer kSerializer = a2[0];
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{kSerializer, stringSerializer, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(a2[4])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.ValidationError c(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r23.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.ValidationError.f39684f
            boolean r3 = r0.y()
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0055
            r3 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3
            java.lang.Object r3 = r0.m(r1, r8, r3, r9)
            com.hansecom.mapi.models.ErrorCode r3 = (com.hansecom.mapi.models.ErrorCode) r3
            java.lang.String r7 = r0.t(r1, r7)
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r5 = r0.v(r1, r5, r8, r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.v(r1, r4, r8, r9)
            java.lang.String r4 = (java.lang.String) r4
            r2 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r6, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r6 = 31
            r21 = r2
            r17 = r3
            r20 = r4
            r19 = r5
            r16 = r6
            r18 = r7
            goto L_0x00bf
        L_0x0055:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x005b:
            if (r14 == 0) goto L_0x00b3
            int r15 = r0.x(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b0
            if (r15 == 0) goto L_0x00a2
            if (r15 == r7) goto L_0x009b
            if (r15 == r5) goto L_0x008f
            if (r15 == r4) goto L_0x0083
            if (r15 != r6) goto L_0x007d
            r8 = r2[r6]
            kotlinx.serialization.DeserializationStrategy r8 = (kotlinx.serialization.DeserializationStrategy) r8
            java.lang.Object r8 = r0.v(r1, r6, r8, r13)
            r13 = r8
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 16
        L_0x007b:
            r8 = 0
            goto L_0x005b
        L_0x007d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r15)
            throw r0
        L_0x0083:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x007b
        L_0x008f:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r5, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 4
            goto L_0x007b
        L_0x009b:
            java.lang.String r10 = r0.t(r1, r7)
            r3 = r3 | 2
            goto L_0x007b
        L_0x00a2:
            r8 = 0
            r15 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r15 = (kotlinx.serialization.DeserializationStrategy) r15
            java.lang.Object r9 = r0.m(r1, r8, r15, r9)
            com.hansecom.mapi.models.ErrorCode r9 = (com.hansecom.mapi.models.ErrorCode) r9
            r3 = r3 | 1
            goto L_0x005b
        L_0x00b0:
            r8 = 0
            r14 = r8
            goto L_0x005b
        L_0x00b3:
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00bf:
            r0.b(r1)
            com.hansecom.mapi.models.ValidationError r0 = new com.hansecom.mapi.models.ValidationError
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.ValidationError$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.ValidationError");
    }

    /* renamed from: g */
    public void d(Encoder encoder, ValidationError validationError) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(validationError, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        ValidationError.f(validationError, c2, a2);
        c2.b(a2);
    }
}
