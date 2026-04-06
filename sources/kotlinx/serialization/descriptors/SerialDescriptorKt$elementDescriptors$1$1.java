package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SerialDescriptorKt$elementDescriptors$1$1 implements Iterator<SerialDescriptor>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42052A;

    /* renamed from: z  reason: collision with root package name */
    public int f42053z;

    public SerialDescriptorKt$elementDescriptors$1$1(SerialDescriptor serialDescriptor) {
        this.f42052A = serialDescriptor;
        this.f42053z = serialDescriptor.f();
    }

    /* renamed from: b */
    public SerialDescriptor next() {
        SerialDescriptor serialDescriptor = this.f42052A;
        int f2 = serialDescriptor.f();
        int i2 = this.f42053z;
        this.f42053z = i2 - 1;
        return serialDescriptor.j(f2 - i2);
    }

    public boolean hasNext() {
        return this.f42053z > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
