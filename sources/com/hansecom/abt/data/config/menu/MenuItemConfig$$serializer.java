package com.hansecom.abt.data.config.menu;

import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class MenuItemConfig$$serializer implements GeneratedSerializer<MenuItemConfig> {

    /* renamed from: a  reason: collision with root package name */
    public static final MenuItemConfig$$serializer f33242a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33243b = 8;
    private static final SerialDescriptor descriptor;

    static {
        MenuItemConfig$$serializer menuItemConfig$$serializer = new MenuItemConfig$$serializer();
        f33242a = menuItemConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.menu.MenuItemConfig", menuItemConfig$$serializer, 8);
        pluginGeneratedSerialDescriptor.q("icon", true);
        pluginGeneratedSerialDescriptor.q("titleKey", false);
        pluginGeneratedSerialDescriptor.q("type", true);
        pluginGeneratedSerialDescriptor.q("action", true);
        pluginGeneratedSerialDescriptor.q("subItems", true);
        pluginGeneratedSerialDescriptor.q("url", true);
        pluginGeneratedSerialDescriptor.q("visible", true);
        pluginGeneratedSerialDescriptor.q("enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        KSerializer[] a2 = MenuItemConfig.f33233j;
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{BuiltinSerializersKt.u(stringSerializer), StringValueSerializer.f39098a, a2[2], BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(new ArrayListSerializer(f33242a)), BuiltinSerializersKt.u(stringSerializer), a2[6], a2[7]};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.hansecom.abt.util.resourcesResolvers.StringValue} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.hansecom.abt.data.config.menu.MenuItemType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.hansecom.abt.data.config.menu.MenuItemConfig c(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            kotlinx.serialization.encoding.CompositeDecoder r0 = r0.c(r1)
            kotlinx.serialization.KSerializer[] r2 = com.hansecom.abt.data.config.menu.MenuItemConfig.f33233j
            boolean r3 = r0.y()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 7
            r8 = 6
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x007d
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r11 = r0.v(r1, r11, r3, r12)
            java.lang.String r11 = (java.lang.String) r11
            com.hansecom.abt.util.resourcesResolvers.StringValueSerializer r13 = com.hansecom.abt.util.resourcesResolvers.StringValueSerializer.f39098a
            java.lang.Object r10 = r0.m(r1, r10, r13, r12)
            com.hansecom.abt.util.resourcesResolvers.StringValue r10 = (com.hansecom.abt.util.resourcesResolvers.StringValue) r10
            r13 = r2[r9]
            kotlinx.serialization.DeserializationStrategy r13 = (kotlinx.serialization.DeserializationStrategy) r13
            java.lang.Object r9 = r0.m(r1, r9, r13, r12)
            com.hansecom.abt.data.config.menu.MenuItemType r9 = (com.hansecom.abt.data.config.menu.MenuItemType) r9
            java.lang.Object r5 = r0.v(r1, r5, r3, r12)
            java.lang.String r5 = (java.lang.String) r5
            kotlinx.serialization.internal.ArrayListSerializer r13 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.abt.data.config.menu.MenuItemConfig$$serializer r14 = f33242a
            r13.<init>(r14)
            java.lang.Object r6 = r0.v(r1, r6, r13, r12)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = r0.v(r1, r4, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            r4 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.m(r1, r8, r4, r12)
            java.util.List r4 = (java.util.List) r4
            r2 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2
            java.lang.Object r2 = r0.m(r1, r7, r2, r12)
            java.util.List r2 = (java.util.List) r2
            r7 = 255(0xff, float:3.57E-43)
            r27 = r2
            r25 = r3
            r26 = r4
            r23 = r5
            r24 = r6
            r19 = r7
            r22 = r9
            r21 = r10
            r20 = r11
            goto L_0x0125
        L_0x007d:
            r17 = r10
            r3 = r11
            r5 = r12
            r9 = r5
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0087:
            if (r17 == 0) goto L_0x0113
            int r6 = r0.x(r1)
            switch(r6) {
                case -1: goto L_0x010f;
                case 0: goto L_0x0101;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0096;
                default: goto L_0x0090;
            }
        L_0x0090:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r6)
            throw r0
        L_0x0096:
            r6 = r2[r7]
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r5 = r0.m(r1, r7, r6, r5)
            java.util.List r5 = (java.util.List) r5
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00a2:
            r6 = 4
            goto L_0x0087
        L_0x00a4:
            r6 = r2[r8]
            kotlinx.serialization.DeserializationStrategy r6 = (kotlinx.serialization.DeserializationStrategy) r6
            java.lang.Object r6 = r0.m(r1, r8, r6, r9)
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 64
            goto L_0x00a2
        L_0x00b2:
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            java.lang.Object r6 = r0.v(r1, r4, r6, r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 32
            goto L_0x00a2
        L_0x00be:
            kotlinx.serialization.internal.ArrayListSerializer r6 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.abt.data.config.menu.MenuItemConfig$$serializer r4 = f33242a
            r6.<init>(r4)
            r4 = 4
            java.lang.Object r6 = r0.v(r1, r4, r6, r11)
            r11 = r6
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 16
            r6 = r4
            r4 = 5
            goto L_0x0087
        L_0x00d2:
            r4 = 4
            kotlinx.serialization.internal.StringSerializer r6 = kotlinx.serialization.internal.StringSerializer.f42197a
            r4 = 3
            java.lang.Object r6 = r0.v(r1, r4, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 8
        L_0x00df:
            r4 = 5
            goto L_0x00a2
        L_0x00e1:
            r4 = 3
            r6 = 2
            r16 = r2[r6]
            r4 = r16
            kotlinx.serialization.DeserializationStrategy r4 = (kotlinx.serialization.DeserializationStrategy) r4
            java.lang.Object r4 = r0.m(r1, r6, r4, r14)
            r14 = r4
            com.hansecom.abt.data.config.menu.MenuItemType r14 = (com.hansecom.abt.data.config.menu.MenuItemType) r14
            r3 = r3 | 4
            goto L_0x00df
        L_0x00f3:
            r6 = 2
            com.hansecom.abt.util.resourcesResolvers.StringValueSerializer r4 = com.hansecom.abt.util.resourcesResolvers.StringValueSerializer.f39098a
            r6 = 1
            java.lang.Object r4 = r0.m(r1, r6, r4, r13)
            r13 = r4
            com.hansecom.abt.util.resourcesResolvers.StringValue r13 = (com.hansecom.abt.util.resourcesResolvers.StringValue) r13
            r3 = r3 | 2
            goto L_0x00df
        L_0x0101:
            r6 = 1
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.f42197a
            r6 = 0
            java.lang.Object r4 = r0.v(r1, r6, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00df
        L_0x010f:
            r6 = 0
            r17 = r6
            goto L_0x00a2
        L_0x0113:
            r19 = r3
            r27 = r5
            r26 = r9
            r25 = r10
            r24 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x0125:
            r0.b(r1)
            com.hansecom.abt.data.config.menu.MenuItemConfig r0 = new com.hansecom.abt.data.config.menu.MenuItemConfig
            r28 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.config.menu.MenuItemConfig$$serializer.c(kotlinx.serialization.encoding.Decoder):com.hansecom.abt.data.config.menu.MenuItemConfig");
    }

    /* renamed from: g */
    public final void d(Encoder encoder, MenuItemConfig menuItemConfig) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(menuItemConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        MenuItemConfig.j(menuItemConfig, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
