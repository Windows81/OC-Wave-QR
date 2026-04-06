package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public interface KSerializer<T> extends SerializationStrategy<T>, DeserializationStrategy<T> {
    SerialDescriptor a();
}
