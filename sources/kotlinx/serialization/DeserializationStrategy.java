package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Metadata
public interface DeserializationStrategy<T> {
    SerialDescriptor a();

    Object c(Decoder decoder);
}
