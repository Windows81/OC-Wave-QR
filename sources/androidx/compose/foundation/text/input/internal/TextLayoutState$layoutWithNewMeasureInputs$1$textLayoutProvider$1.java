package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1 extends Lambda implements Function0<TextLayoutResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f6395z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(TextLayoutState textLayoutState) {
        super(0);
        this.f6395z = textLayoutState;
    }

    /* renamed from: b */
    public final TextLayoutResult invoke() {
        return this.f6395z.f6387a.getValue();
    }
}
