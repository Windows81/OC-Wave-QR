package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public interface JsonEncoder extends Encoder, CompositeEncoder {

    @Metadata
    public static final class DefaultImpls {
    }

    Json d();

    void x(JsonElement jsonElement);
}
