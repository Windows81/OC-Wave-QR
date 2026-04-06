package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", l = {321}, m = "showTextToolbar")
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public /* synthetic */ Object I;
    public final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 J;
    public int K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Continuation continuation) {
        super(continuation);
        this.J = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a((TextFieldSelectionState) null, (Rect) null, this);
    }
}
