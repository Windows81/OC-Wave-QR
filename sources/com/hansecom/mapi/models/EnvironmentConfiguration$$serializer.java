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

@Metadata
@Deprecated
public final class EnvironmentConfiguration$$serializer implements GeneratedSerializer<EnvironmentConfiguration> {

    /* renamed from: a  reason: collision with root package name */
    public static final EnvironmentConfiguration$$serializer f39308a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EnvironmentConfiguration$$serializer environmentConfiguration$$serializer = new EnvironmentConfiguration$$serializer();
        f39308a = environmentConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.mapi.models.EnvironmentConfiguration", environmentConfiguration$$serializer, 6);
        pluginGeneratedSerialDescriptor.q("loadMoney", true);
        pluginGeneratedSerialDescriptor.q("addPasses", true);
        pluginGeneratedSerialDescriptor.q("fareMediaManagement", true);
        pluginGeneratedSerialDescriptor.q("cardPurchaseDefaults", true);
        pluginGeneratedSerialDescriptor.q("paymentMethods", true);
        pluginGeneratedSerialDescriptor.q("vanillaDirect", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public KSerializer[] e() {
        return new KSerializer[]{BuiltinSerializersKt.u(LoadMoneyConfig$$serializer.f39499a), BuiltinSerializersKt.u(AddPassesConfig$$serializer.f39167a), BuiltinSerializersKt.u(FareMediaConfiguration$$serializer.f39355a), BuiltinSerializersKt.u(CardPurchaseDefaults$$serializer.f39245a), BuiltinSerializersKt.u(PaymentMethodConfiguration$$serializer.f39532a), BuiltinSerializersKt.u(VanillaDirectConfiguration$$serializer.f39694a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.hansecom.mapi.models.AddPassesConfig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.hansecom.mapi.models.FareMediaConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.hansecom.mapi.models.CardPurchaseDefaults} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.hansecom.mapi.models.PaymentMethodConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.hansecom.mapi.models.VanillaDirectConfiguration} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00be, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.hansecom.mapi.models.EnvironmentConfiguration c(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r25.a()
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            boolean r2 = r0.y()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x005e
            com.hansecom.mapi.models.LoadMoneyConfig$$serializer r2 = com.hansecom.mapi.models.LoadMoneyConfig$$serializer.f39499a
            java.lang.Object r2 = r0.v(r1, r8, r2, r9)
            com.hansecom.mapi.models.LoadMoneyConfig r2 = (com.hansecom.mapi.models.LoadMoneyConfig) r2
            com.hansecom.mapi.models.AddPassesConfig$$serializer r8 = com.hansecom.mapi.models.AddPassesConfig$$serializer.f39167a
            java.lang.Object r7 = r0.v(r1, r7, r8, r9)
            com.hansecom.mapi.models.AddPassesConfig r7 = (com.hansecom.mapi.models.AddPassesConfig) r7
            com.hansecom.mapi.models.FareMediaConfiguration$$serializer r8 = com.hansecom.mapi.models.FareMediaConfiguration$$serializer.f39355a
            java.lang.Object r6 = r0.v(r1, r6, r8, r9)
            com.hansecom.mapi.models.FareMediaConfiguration r6 = (com.hansecom.mapi.models.FareMediaConfiguration) r6
            com.hansecom.mapi.models.CardPurchaseDefaults$$serializer r8 = com.hansecom.mapi.models.CardPurchaseDefaults$$serializer.f39245a
            java.lang.Object r4 = r0.v(r1, r4, r8, r9)
            com.hansecom.mapi.models.CardPurchaseDefaults r4 = (com.hansecom.mapi.models.CardPurchaseDefaults) r4
            com.hansecom.mapi.models.PaymentMethodConfiguration$$serializer r8 = com.hansecom.mapi.models.PaymentMethodConfiguration$$serializer.f39532a
            java.lang.Object r5 = r0.v(r1, r5, r8, r9)
            com.hansecom.mapi.models.PaymentMethodConfiguration r5 = (com.hansecom.mapi.models.PaymentMethodConfiguration) r5
            com.hansecom.mapi.models.VanillaDirectConfiguration$$serializer r8 = com.hansecom.mapi.models.VanillaDirectConfiguration$$serializer.f39694a
            java.lang.Object r3 = r0.v(r1, r3, r8, r9)
            com.hansecom.mapi.models.VanillaDirectConfiguration r3 = (com.hansecom.mapi.models.VanillaDirectConfiguration) r3
            r8 = 63
            r18 = r2
            r23 = r3
            r21 = r4
            r22 = r5
            r20 = r6
            r19 = r7
            r17 = r8
            goto L_0x00d2
        L_0x005e:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0065:
            if (r15 == 0) goto L_0x00c4
            int r8 = r0.x(r1)
            switch(r8) {
                case -1: goto L_0x00c0;
                case 0: goto L_0x00b1;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0099;
                case 3: goto L_0x008d;
                case 4: goto L_0x0081;
                case 5: goto L_0x0074;
                default: goto L_0x006e;
            }
        L_0x006e:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x0074:
            com.hansecom.mapi.models.VanillaDirectConfiguration$$serializer r8 = com.hansecom.mapi.models.VanillaDirectConfiguration$$serializer.f39694a
            java.lang.Object r8 = r0.v(r1, r3, r8, r14)
            r14 = r8
            com.hansecom.mapi.models.VanillaDirectConfiguration r14 = (com.hansecom.mapi.models.VanillaDirectConfiguration) r14
            r2 = r2 | 32
        L_0x007f:
            r8 = 0
            goto L_0x0065
        L_0x0081:
            com.hansecom.mapi.models.PaymentMethodConfiguration$$serializer r8 = com.hansecom.mapi.models.PaymentMethodConfiguration$$serializer.f39532a
            java.lang.Object r8 = r0.v(r1, r5, r8, r13)
            r13 = r8
            com.hansecom.mapi.models.PaymentMethodConfiguration r13 = (com.hansecom.mapi.models.PaymentMethodConfiguration) r13
            r2 = r2 | 16
            goto L_0x007f
        L_0x008d:
            com.hansecom.mapi.models.CardPurchaseDefaults$$serializer r8 = com.hansecom.mapi.models.CardPurchaseDefaults$$serializer.f39245a
            java.lang.Object r8 = r0.v(r1, r4, r8, r12)
            r12 = r8
            com.hansecom.mapi.models.CardPurchaseDefaults r12 = (com.hansecom.mapi.models.CardPurchaseDefaults) r12
            r2 = r2 | 8
            goto L_0x007f
        L_0x0099:
            com.hansecom.mapi.models.FareMediaConfiguration$$serializer r8 = com.hansecom.mapi.models.FareMediaConfiguration$$serializer.f39355a
            java.lang.Object r8 = r0.v(r1, r6, r8, r11)
            r11 = r8
            com.hansecom.mapi.models.FareMediaConfiguration r11 = (com.hansecom.mapi.models.FareMediaConfiguration) r11
            r2 = r2 | 4
            goto L_0x007f
        L_0x00a5:
            com.hansecom.mapi.models.AddPassesConfig$$serializer r8 = com.hansecom.mapi.models.AddPassesConfig$$serializer.f39167a
            java.lang.Object r8 = r0.v(r1, r7, r8, r10)
            r10 = r8
            com.hansecom.mapi.models.AddPassesConfig r10 = (com.hansecom.mapi.models.AddPassesConfig) r10
            r2 = r2 | 2
            goto L_0x007f
        L_0x00b1:
            com.hansecom.mapi.models.LoadMoneyConfig$$serializer r8 = com.hansecom.mapi.models.LoadMoneyConfig$$serializer.f39499a
            r3 = 0
            java.lang.Object r8 = r0.v(r1, r3, r8, r9)
            r9 = r8
            com.hansecom.mapi.models.LoadMoneyConfig r9 = (com.hansecom.mapi.models.LoadMoneyConfig) r9
            r2 = r2 | 1
            r8 = r3
        L_0x00be:
            r3 = 5
            goto L_0x0065
        L_0x00c0:
            r3 = 0
            r8 = r3
            r15 = r8
            goto L_0x00be
        L_0x00c4:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x00d2:
            r0.b(r1)
            com.hansecom.mapi.models.EnvironmentConfiguration r0 = new com.hansecom.mapi.models.EnvironmentConfiguration
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.mapi.models.EnvironmentConfiguration$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.mapi.models.EnvironmentConfiguration");
    }

    /* renamed from: g */
    public void d(Encoder encoder, EnvironmentConfiguration environmentConfiguration) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(environmentConfiguration, "value");
        SerialDescriptor a2 = a();
        CompositeEncoder c2 = encoder.c(a2);
        EnvironmentConfiguration.d(environmentConfiguration, c2, a2);
        c2.b(a2);
    }
}
