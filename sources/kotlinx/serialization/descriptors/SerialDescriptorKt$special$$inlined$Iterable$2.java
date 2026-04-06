package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SerialDescriptorKt$special$$inlined$Iterable$2 implements Iterable<String>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42051z;

    public SerialDescriptorKt$special$$inlined$Iterable$2(SerialDescriptor serialDescriptor) {
        this.f42051z = serialDescriptor;
    }

    public Iterator iterator() {
        return new SerialDescriptorKt$elementNames$1$1(this.f42051z);
    }
}
