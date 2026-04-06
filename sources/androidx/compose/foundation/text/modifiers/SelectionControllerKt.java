package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class SelectionControllerKt {
    public static final Modifier b(SelectionRegistrar selectionRegistrar, long j2, Function0 function0) {
        SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1 selectionControllerKt$makeSelectionModifier$longPressDragObserver$1 = new SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1(function0, selectionRegistrar, j2);
        return SelectionGesturesKt.m(Modifier.f15489d, new SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1(function0, selectionRegistrar, j2), selectionControllerKt$makeSelectionModifier$longPressDragObserver$1);
    }
}
