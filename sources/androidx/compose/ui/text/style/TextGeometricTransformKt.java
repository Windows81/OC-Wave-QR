package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata
public final class TextGeometricTransformKt {
    public static final TextGeometricTransform a(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f2) {
        return new TextGeometricTransform(MathHelpersKt.b(textGeometricTransform.b(), textGeometricTransform2.b(), f2), MathHelpersKt.b(textGeometricTransform.c(), textGeometricTransform2.c(), f2));
    }
}
