package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public enum DecodeSequenceMode {
    WHITESPACE_SEPARATED,
    ARRAY_WRAPPED,
    AUTO_DETECT;

    static {
        DecodeSequenceMode[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
