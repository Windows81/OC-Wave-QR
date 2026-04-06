package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum IndexTransformationType {
    Untransformed,
    Insertion,
    Replacement,
    Deletion;

    static {
        IndexTransformationType[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
