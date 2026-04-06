package androidx.savedstate.serialization;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;

@Metadata
public final class SavedStateDecoderKt {
    public static final Object a(DeserializationStrategy deserializationStrategy, Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.i(deserializationStrategy, "deserializer");
        Intrinsics.i(bundle, "savedState");
        Intrinsics.i(savedStateConfiguration, "configuration");
        return new SavedStateDecoder(bundle, savedStateConfiguration).C(deserializationStrategy);
    }
}
