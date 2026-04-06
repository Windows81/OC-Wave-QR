package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1 implements SnapshotMutationPolicy<TextFieldLayoutStateCache.MeasureInputs> {
    /* renamed from: c */
    public boolean a(TextFieldLayoutStateCache.MeasureInputs measureInputs, TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
        if (measureInputs == null || measureInputs2 == null) {
            if ((measureInputs == null) ^ (measureInputs2 == null)) {
                return false;
            }
        } else if (!(measureInputs.d() == measureInputs2.d() && measureInputs.f() == measureInputs2.f() && measureInputs.g() == measureInputs2.g() && Intrinsics.d(measureInputs.e(), measureInputs2.e()) && Constraints.f(measureInputs.b(), measureInputs2.b()))) {
            return false;
        }
        return true;
    }
}
