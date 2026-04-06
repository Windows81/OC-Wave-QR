package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public class ClickableNode extends AbstractClickableNode {
    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    public static /* synthetic */ Object D3(ClickableNode clickableNode, PointerInputScope pointerInputScope, Continuation continuation) {
        Object k2 = TapGestureDetectorKt.k(pointerInputScope, new ClickableNode$clickPointerInput$2(clickableNode, (Continuation) null), new ClickableNode$clickPointerInput$3(clickableNode), continuation);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public final void E3(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0) {
        C3(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    public Object n3(PointerInputScope pointerInputScope, Continuation continuation) {
        return D3(this, pointerInputScope, continuation);
    }

    public final boolean x3(KeyEvent keyEvent) {
        return false;
    }

    public final boolean y3(KeyEvent keyEvent) {
        t3().invoke();
        return true;
    }

    public ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0) {
        super(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0, (DefaultConstructorMarker) null);
    }
}
