package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
public final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldSelectionManager E;
    public final /* synthetic */ boolean F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldSelectionManager;
        this.F = z2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldSelectionManager$copy$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$copy$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (TextRange.h(this.E.U().h())) {
                return Unit.f40552a;
            }
            Clipboard A2 = this.E.A();
            if (A2 != null) {
                ClipEntry f3 = ClipboardUtils_androidKt.f(TextFieldValueKt.a(this.E.U()));
                this.D = 1;
                if (A2.b(f3, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.F) {
            return Unit.f40552a;
        }
        int k2 = TextRange.k(this.E.U().h());
        TextFieldSelectionManager textFieldSelectionManager = this.E;
        this.E.O().invoke(textFieldSelectionManager.s(textFieldSelectionManager.U().f(), TextRangeKt.b(k2, k2)));
        this.E.j0(HandleState.None);
        return Unit.f40552a;
    }
}
