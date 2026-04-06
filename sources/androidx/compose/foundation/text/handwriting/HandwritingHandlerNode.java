package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {
    public FocusState N;
    public final Lazy O = LazyKt.a(LazyThreadSafetyMode.NONE, new HandwritingHandlerNode$composeImm$2(this));

    public void X(FocusState focusState) {
        if (!Intrinsics.d(this.N, focusState)) {
            this.N = focusState;
            if (focusState.d()) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new HandwritingHandlerNode$onFocusEvent$1(this, (Continuation) null), 3, (Object) null);
            }
        }
    }

    public final ComposeInputMethodManager a3() {
        return (ComposeInputMethodManager) this.O.getValue();
    }
}
