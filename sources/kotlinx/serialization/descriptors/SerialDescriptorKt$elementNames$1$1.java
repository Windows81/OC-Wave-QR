package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class SerialDescriptorKt$elementNames$1$1 implements Iterator<String>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42054A;

    /* renamed from: z  reason: collision with root package name */
    public int f42055z;

    public SerialDescriptorKt$elementNames$1$1(SerialDescriptor serialDescriptor) {
        this.f42054A = serialDescriptor;
        this.f42055z = serialDescriptor.f();
    }

    /* renamed from: b */
    public String next() {
        SerialDescriptor serialDescriptor = this.f42054A;
        int f2 = serialDescriptor.f();
        int i2 = this.f42055z;
        this.f42055z = i2 - 1;
        return serialDescriptor.g(f2 - i2);
    }

    public boolean hasNext() {
        return this.f42055z > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
