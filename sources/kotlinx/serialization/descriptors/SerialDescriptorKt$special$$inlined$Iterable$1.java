package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SerialDescriptorKt$special$$inlined$Iterable$1 implements Iterable<SerialDescriptor>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42050z;

    public SerialDescriptorKt$special$$inlined$Iterable$1(SerialDescriptor serialDescriptor) {
        this.f42050z = serialDescriptor;
    }

    public Iterator iterator() {
        return new SerialDescriptorKt$elementDescriptors$1$1(this.f42050z);
    }
}
