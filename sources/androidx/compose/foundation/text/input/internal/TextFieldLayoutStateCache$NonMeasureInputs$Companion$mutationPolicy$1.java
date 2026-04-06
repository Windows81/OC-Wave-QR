package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1 implements SnapshotMutationPolicy<TextFieldLayoutStateCache.NonMeasureInputs> {
    /* renamed from: c */
    public boolean a(TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
        if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
            if ((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null)) {
                return false;
            }
        } else if (!(nonMeasureInputs.d() == nonMeasureInputs2.d() && Intrinsics.d(nonMeasureInputs.e(), nonMeasureInputs2.e()) && nonMeasureInputs.b() == nonMeasureInputs2.b() && nonMeasureInputs.c() == nonMeasureInputs2.c() && nonMeasureInputs.f() == nonMeasureInputs2.f())) {
            return false;
        }
        return true;
    }
}
