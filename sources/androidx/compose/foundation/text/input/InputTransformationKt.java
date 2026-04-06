package androidx.compose.foundation.text.input;

import kotlin.Metadata;

@Metadata
public final class InputTransformationKt {
    public static final InputTransformation a(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
