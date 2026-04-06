package kotlinx.serialization;

import kotlin.Metadata;

@Metadata
public interface StringFormat extends SerialFormat {
    Object b(DeserializationStrategy deserializationStrategy, String str);

    String c(SerializationStrategy serializationStrategy, Object obj);
}
