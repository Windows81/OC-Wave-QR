package kotlinx.serialization;

import kotlin.Metadata;

@Metadata
public interface BinaryFormat extends SerialFormat {
    byte[] d(SerializationStrategy serializationStrategy, Object obj);

    Object e(DeserializationStrategy deserializationStrategy, byte[] bArr);
}
