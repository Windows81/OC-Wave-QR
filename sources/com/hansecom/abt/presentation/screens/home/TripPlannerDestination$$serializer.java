package com.hansecom.abt.presentation.screens.home;

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
public /* synthetic */ class TripPlannerDestination$$serializer implements GeneratedSerializer<TripPlannerDestination> {

    /* renamed from: a  reason: collision with root package name */
    public static final TripPlannerDestination$$serializer f35010a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f35011b = 8;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerDestination$$serializer tripPlannerDestination$$serializer = new TripPlannerDestination$$serializer();
        f35010a = tripPlannerDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.hansecom.abt.presentation.screens.home.TripPlannerDestination", tripPlannerDestination$$serializer, 2);
        pluginGeneratedSerialDescriptor.q("showTopBar", true);
        pluginGeneratedSerialDescriptor.q("showBottomBar", true);
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
        return new KSerializer[]{booleanSerializer, booleanSerializer};
    }

    /* renamed from: f */
    public final TripPlannerDestination c(Decoder decoder) {
        int i2;
        boolean z2;
        boolean z3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder c2 = decoder.c(serialDescriptor);
        if (c2.y()) {
            z3 = c2.s(serialDescriptor, 0);
            z2 = c2.s(serialDescriptor, 1);
            i2 = 3;
        } else {
            boolean z4 = true;
            z3 = false;
            boolean z5 = false;
            int i3 = 0;
            while (z4) {
                int x2 = c2.x(serialDescriptor);
                if (x2 == -1) {
                    z4 = false;
                } else if (x2 == 0) {
                    z3 = c2.s(serialDescriptor, 0);
                    i3 |= 1;
                } else if (x2 == 1) {
                    z5 = c2.s(serialDescriptor, 1);
                    i3 |= 2;
                } else {
                    throw new UnknownFieldException(x2);
                }
            }
            z2 = z5;
            i2 = i3;
        }
        c2.b(serialDescriptor);
        return new TripPlannerDestination(i2, z3, z2, (SerializationConstructorMarker) null);
    }

    /* renamed from: g */
    public final void d(Encoder encoder, TripPlannerDestination tripPlannerDestination) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(tripPlannerDestination, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder c2 = encoder.c(serialDescriptor);
        TripPlannerDestination.c(tripPlannerDestination, c2, serialDescriptor);
        c2.b(serialDescriptor);
    }
}
