package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public interface SerialFormat {
    SerializersModule a();
}
