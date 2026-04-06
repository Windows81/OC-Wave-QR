package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum CoroutineSingletons {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    static {
        CoroutineSingletons[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
