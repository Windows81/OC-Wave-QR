package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class TextFieldSelectionState$observeTextToolbarVisibility$3<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6542z;

    public TextFieldSelectionState$observeTextToolbarVisibility$3(TextFieldSelectionState textFieldSelectionState) {
        this.f6542z = textFieldSelectionState;
    }

    /* renamed from: a */
    public final Object c(Rect rect, Continuation continuation) {
        if (Intrinsics.d(rect, Rect.f15860e.a())) {
            this.f6542z.j0();
        } else {
            TextToolbarHandler n2 = this.f6542z.f6471i;
            if (n2 != null) {
                Object a2 = n2.a(this.f6542z, rect, continuation);
                return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
            }
        }
        return Unit.f40552a;
    }
}
