package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FocusTargetModifierNodeKt {
    public static final FocusTargetModifierNode a(int i2, Function2 function2) {
        return new FocusTargetNode(i2, function2, (Function1) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FocusTargetModifierNode b(int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Focusability.f15833b.a();
        }
        if ((i3 & 2) != 0) {
            function2 = null;
        }
        return a(i2, function2);
    }
}
