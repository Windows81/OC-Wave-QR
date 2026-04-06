package com.hansecom.abt.presentation.screens.helpRequest;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata
@Deprecated
public /* synthetic */ class HelpRequestDestination$$serializer implements GeneratedSerializer<HelpRequestDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final HelpRequestDestination$$serializer f34847a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34848b = 8;
    private static final SerialDescriptor descriptor;

    static {
        HelpRequestDestination$$serializer helpRequestDestination$$serializer = new HelpRequestDestination$$serializer();
        f34847a = helpRequestDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination", helpRequestDestination$$serializer, 4);
        pluginGeneratedSerialDescriptor.q("showBottomBar", true);
        pluginGeneratedSerialDescriptor.q("isGuestMode", true);
        pluginGeneratedSerialDescriptor.q("showInternalTopBar", true);
        pluginGeneratedSerialDescriptor.q("showTopBar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final SerialDescriptor a() {
        return descriptor;
    }

    public KSerializer[] b() {
        return GeneratedSerializer.DefaultImpls.a(this);
    }

    public final KSerializer[] e() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f42073a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    /* renamed from: f */
    public final HelpRequestDestination c(Decoder decoder) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        Decoder decoder2 = decoder;
        Intrinsics.i(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder2.c(serialDescriptor);
        if (c2.y()) {
            boolean s2 = c2.s(serialDescriptor, 0);
            boolean s3 = c2.s(serialDescriptor, 1);
            boolean s4 = c2.s(serialDescriptor, 2);
            z5 = s2;
            z2 = c2.s(serialDescriptor, 3);
            z3 = s4;
            z4 = s3;
            i2 = 15;
        } else {
            boolean z6 = true;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i3 = 0;
            while (z6) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z6 = false;
                } else if (x2 == 0) {
                    z7 = c2.s(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    z10 = c2.s(serialDescriptor, 1);
                    i3 |= 2;
                } else if (x2 == 2) {
                    z9 = c2.s(serialDescriptor, 2);
                    i3 |= 4;
                } else if (x2 == 3) {
                    z8 = c2.s(serialDescriptor, 3);
                    i3 |= 8;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            z5 = z7;
            z2 = z8;
            z3 = z9;
            z4 = z10;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new HelpRequestDestination(i2, z5, z4, z3, z2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, HelpRequestDestination helpRequestDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(helpRequestDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        HelpRequestDestination.e(helpRequestDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
