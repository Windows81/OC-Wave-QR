package com.hansecom.abt.data.config.guidedTour;

import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public /* synthetic */ class GuidedTourPage$$serializer implements GeneratedSerializer<GuidedTourPage> {

    /* renamed from: a  reason: collision with root package name */
    public static final GuidedTourPage$$serializer f33194a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33195b = 8;
    private static final SerialDescriptor descriptor;

    static {
        GuidedTourPage$$serializer guidedTourPage$$serializer = new GuidedTourPage$$serializer();
        f33194a = guidedTourPage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.data.config.guidedTour.GuidedTourPage", guidedTourPage$$serializer, 3);
        pluginGeneratedSerialDescriptor.q("titleKey", false);
        pluginGeneratedSerialDescriptor.q("mediaType", true);
        pluginGeneratedSerialDescriptor.q("mediaUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        return new KSerializer[]{StringValueSerializer.f39098a, GuidedTourPage.C[1], StringSerializer.f42197a};
    }

    /* renamed from: f */
    public final GuidedTourPage c(Decoder decoder) {
        String str;
        MediaType mediaType;
        StringValue stringValue;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        KSerializer[] a2 = GuidedTourPage.C;
        StringValue stringValue2 = null;
        if (c2.y()) {
            mediaType = (MediaType) c2.m(serialDescriptor, 1, a2[1], (Object) null);
            stringValue = (StringValue) c2.m(serialDescriptor, 0, StringValueSerializer.f39098a, (Object) null);
            str = c2.t(serialDescriptor, 2);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            MediaType mediaType2 = null;
            String str2 = null;
            while (z2) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z2 = false;
                } else if (x2 == 0) {
                    stringValue2 = (StringValue) c2.m(serialDescriptor, 0, StringValueSerializer.f39098a, stringValue2);
                    i3 |= 1;
                } else if (x2 == 1) {
                    mediaType2 = (MediaType) c2.m(serialDescriptor, 1, a2[1], mediaType2);
                    i3 |= 2;
                } else if (x2 == 2) {
                    str2 = c2.t(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            i2 = i3;
            stringValue = stringValue2;
            mediaType = mediaType2;
            str = str2;
        }
        c2.b(serialDescriptor);
        return new GuidedTourPage(i2, stringValue, mediaType, str, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, GuidedTourPage guidedTourPage) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(guidedTourPage, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        GuidedTourPage.e(guidedTourPage, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
