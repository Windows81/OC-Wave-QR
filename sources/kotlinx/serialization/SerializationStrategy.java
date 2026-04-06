package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public interface SerializationStrategy<T> {
    SerialDescriptor a();

    void d(Encoder encoder, Object obj);
}
