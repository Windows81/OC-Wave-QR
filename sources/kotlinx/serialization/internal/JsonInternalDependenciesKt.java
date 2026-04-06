package kotlinx.serialization.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class JsonInternalDependenciesKt {
    public static final Set a(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        return Platform_commonKt.a(serialDescriptor);
    }
}
