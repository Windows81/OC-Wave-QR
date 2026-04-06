package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {747}, m = "collectImeNotifications")
public final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ TransformedTextFieldState F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, Continuation continuation) {
        super(continuation);
        this.F = transformedTextFieldState;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.i((TextFieldState.NotifyImeListener) null, this);
    }
}
