package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

@Metadata
public interface JsonDecoder extends Decoder, CompositeDecoder {

    @Metadata
    public static final class DefaultImpls {
    }

    Json d();

    JsonElement i();
}
