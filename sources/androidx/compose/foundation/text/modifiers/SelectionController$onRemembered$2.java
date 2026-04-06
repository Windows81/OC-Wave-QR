package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionController$onRemembered$2 extends Lambda implements Function0<TextLayoutResult> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionController f6658z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionController$onRemembered$2(SelectionController selectionController) {
        super(0);
        this.f6658z = selectionController;
    }

    /* renamed from: b */
    public final TextLayoutResult invoke() {
        return this.f6658z.C.g();
    }
}
