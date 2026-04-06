package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum ClassDiscriminatorMode {
    NONE,
    ALL_JSON_OBJECTS,
    POLYMORPHIC;

    static {
        ClassDiscriminatorMode[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
