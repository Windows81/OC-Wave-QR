package androidx.savedstate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class SavedStateReaderKt__SavedStateReaderKt {
    public static final Void a(String str) {
        Intrinsics.i(str, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
