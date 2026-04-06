package kotlinx.serialization;

import kotlin.Metadata;

@Metadata
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(String str) {
        super(str);
    }

    public UnknownFieldException(int i2) {
        this("An unknown field for index " + i2);
    }
}
