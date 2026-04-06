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
public final class ErrorResponse$$serializer implements GeneratedSerializer<ErrorResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final ErrorResponse$$serializer f39321a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ErrorResponse$$serializer errorResponse$$serializer = new ErrorResponse$$serializer();
        f39321a = errorResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.ErrorResponse", errorResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.q("errorCode", true);
        pluginGeneratedSerialDescriptor.q("developerMessage", true);
        pluginGeneratedSerialDescriptor.q("validationErrors", true);
        pluginGeneratedSerialDescriptor.q("userMessage", true);
        pluginGeneratedSerialDescriptor.q("moreInfo", true);
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
        KSerializer[] a2 = ErrorResponse.f39313h;
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(a2[2]), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(a2[6])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d3, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d4, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.ErrorResponse c(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r28.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.mapi.models.ErrorResponse.f39313h
            boolean r3 = r0.y()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 6
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0069
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r10 = r0.v(r1, r10, r3, r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.v(r1, r9, r3, r11)
            java.lang.String r9 = (java.lang.String) r9
            r12 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r12 = (kotlinx.serialization.DeserializationStrategy) r12
            java.lang.Object r8 = r0.v(r1, r8, r12, r11)
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r5 = r0.v(r1, r5, r3, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.v(r1, r6, r3, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r0.v(r1, r4, r3, r11)
            java.lang.String r3 = (java.lang.String) r3
            r2 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.v(r1, r7, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r4 = 127(0x7f, float:1.78E-43)
            r26 = r2
            r25 = r3
            r19 = r4
            r23 = r5
            r24 = r6
            r22 = r8
            r21 = r9
            r20 = r10
            goto L_0x00fa
        L_0x0069:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0072:
            if (r16 == 0) goto L_0x00ea
            int r8 = r0.x(r1)
            switch(r8) {
                case -1: goto L_0x00e5;
                case 0: goto L_0x00d6;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00a8;
                case 4: goto L_0x009c;
                case 5: goto L_0x0090;
                case 6: goto L_0x0081;
                default: goto L_0x007b;
            }
        L_0x007b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0081:
            r8 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r8 = (kotlinx.serialization.DeserializationStrategy) r8
            java.lang.Object r8 = r0.v(r1, r7, r8, r9)
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 64
        L_0x008e:
            r8 = 2
            goto L_0x0072
        L_0x0090:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r4, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 32
            goto L_0x008e
        L_0x009c:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r6, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 16
            goto L_0x008e
        L_0x00a8:
            kotlinx.serialization.internal.StringSerializer r8 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r8 = r0.v(r1, r5, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 8
            goto L_0x008e
        L_0x00b4:
            r8 = 2
            r17 = r2[r8]
            r4 = r17
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.v(r1, r8, r4, r13)
            r13 = r4
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 4
            r4 = 5
            goto L_0x0072
        L_0x00c6:
            r8 = 2
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.f42197a
            r5 = 1
            java.lang.Object r4 = r0.v(r1, r5, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 2
        L_0x00d3:
            r4 = 5
        L_0x00d4:
            r5 = 3
            goto L_0x0072
        L_0x00d6:
            r5 = 1
            r8 = 2
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.f42197a
            r5 = 0
            java.lang.Object r4 = r0.v(r1, r5, r4, r11)
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
            r3 = r3 | 1
            goto L_0x00d3
        L_0x00e5:
            r5 = 0
            r8 = 2
            r16 = r5
            goto L_0x00d4
        L_0x00ea:
            r19 = r3
            r26 = r9
            r25 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00fa:
            r0.b(r1)
            com.hansecom.mapi.models.ErrorResponse r0 = new com.hansecom.mapi.models.ErrorResponse
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.ErrorResponse$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.ErrorResponse");
    }

    /* renamed from: g */
    public void d(Encoder encoder, ErrorResponse errorResponse) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(errorResponse, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        ErrorResponse.g(errorResponse, c2, a2);
        c2.b(a2);
    }
}
