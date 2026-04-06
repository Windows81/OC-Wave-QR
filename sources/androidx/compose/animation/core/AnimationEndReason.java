package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AnimationEndReason {
    BoundReached,
    Finished;

    static {
        AnimationEndReason[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
