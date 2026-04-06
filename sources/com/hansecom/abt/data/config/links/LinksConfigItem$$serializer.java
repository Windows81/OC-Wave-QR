package com.hansecom.abt.data.config.links;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata
@Deprecated
public /* synthetic */ class LinksConfigItem$$serializer implements GeneratedSerializer<LinksConfigItem> {

    /* renamed from: a  reason: collision with root package name */
    public static final LinksConfigItem$$serializer f33211a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33212b = 8;
    private static final SerialDescriptor descriptor;

    static {
        LinksConfigItem$$serializer linksConfigItem$$serializer = new LinksConfigItem$$serializer();
        f33211a = linksConfigItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.links.LinksConfigItem", linksConfigItem$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("name", false);
        pluginGeneratedSerialDescriptor.q("url", false);
        pluginGeneratedSerialDescriptor.q("fallback_url", false);
        pluginGeneratedSerialDescriptor.q("titleKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        StringSerializer stringSerializer = StringSerializer.f42197a;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.u(stringSerializer), BuiltinSerializersKt.u(StringValueSerializer.f39098a)};
    }

    /* renamed from: f */
    public final LinksConfigItem c(Decoder decoder) {
        StringValue stringValue;
        String str;
        String str2;
        String str3;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        String str4 = null;
        if (c2.y()) {
            String t2 = c2.t(serialDescriptor, 0);
            String t3 = c2.t(serialDescriptor, 1);
            str3 = t2;
            stringValue = (StringValue) c2.v(serialDescriptor, 3, StringValueSerializer.f39098a, (Object) null);
            str = (String) c2.v(serialDescriptor, 2, StringSerializer.f42197a, (Object) null);
            str2 = t3;
            i2 = 15;
        } else {
            boolean z2 = true;
            int i3 = 0;
            String str5 = null;
            String str6 = null;
            StringValue stringValue2 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    str4 = c2.t(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    str5 = c2.t(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str6 = (String) c2.v(serialDescriptor, 2, StringSerializer.f42197a, str6);
                    i3 |= 4;
                } else if (x2 == 3) {
                    stringValue2 = (StringValue) c2.v(serialDescriptor, 3, StringValueSerializer.f39098a, stringValue2);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            str3 = str4;
            str2 = str5;
            str = str6;
            stringValue = stringValue2;
        }
        c2.b(serialDescriptor);
        return new LinksConfigItem(i2, str3, str2, str, stringValue, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, LinksConfigItem linksConfigItem) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(linksConfigItem, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        LinksConfigItem.e(linksConfigItem, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
