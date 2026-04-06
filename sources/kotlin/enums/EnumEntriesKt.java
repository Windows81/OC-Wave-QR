package kotlin.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EnumEntriesKt {
    public static final EnumEntries a(Enum[] enumArr) {
        Intrinsics.i(enumArr, "entries");
        return new EnumEntriesList(enumArr);
    }
}
