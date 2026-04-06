package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CodepointTransformationKt {
    public static final CharSequence a(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < textFieldCharSequence.length()) {
            int b2 = CodepointHelpers_jvmKt.b(textFieldCharSequence, i2);
            int a2 = codepointTransformation.a(i3, b2);
            int a3 = CodepointHelpers_jvmKt.a(b2);
            if (a2 != b2) {
                offsetMappingCalculator.e(sb.length(), sb.length() + a3, CodepointHelpers_jvmKt.a(a2));
                z2 = true;
            }
            StringHelpers_jvmKt.a(sb, a2);
            i2 += a3;
            i3++;
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return z2 ? sb2 : textFieldCharSequence;
    }
}
