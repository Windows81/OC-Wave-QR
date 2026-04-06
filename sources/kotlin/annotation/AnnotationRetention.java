package kotlin.annotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AnnotationRetention {
    SOURCE,
    BINARY,
    RUNTIME;

    static {
        AnnotationRetention[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
