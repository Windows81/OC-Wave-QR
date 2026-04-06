package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata
final class EmptyArrayDecoder extends AbstractDecoder {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyArrayDecoder f22849a = new EmptyArrayDecoder();

    /* renamed from: b  reason: collision with root package name */
    public static final SerializersModule f22850b = SerializersModuleBuildersKt.a();

    public SerializersModule a() {
        return f22850b;
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return -1;
    }
}
