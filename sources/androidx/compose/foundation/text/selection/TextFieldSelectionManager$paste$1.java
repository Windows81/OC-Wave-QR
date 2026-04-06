package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
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
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {647}, m = "invokeSuspend")
public final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ TextFieldSelectionManager E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        super(2, continuation);
        this.E = textFieldSelectionManager;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TextFieldSelectionManager$paste$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$paste$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        AnnotatedString d2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Clipboard A2 = this.E.A();
            if (A2 != null) {
                this.D = 1;
                obj = A2.a(this);
                if (obj == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ClipEntry clipEntry = (ClipEntry) obj;
        if (!(clipEntry == null || (d2 = ClipboardUtils_androidKt.d(clipEntry)) == null)) {
            AnnotatedString r2 = TextFieldValueKt.c(this.E.U(), this.E.U().i().length()).r(d2).r(TextFieldValueKt.b(this.E.U(), this.E.U().i().length()));
            int l2 = TextRange.l(this.E.U().h()) + d2.length();
            this.E.O().invoke(this.E.s(r2, TextRangeKt.b(l2, l2)));
            this.E.j0(HandleState.None);
            UndoManager T = this.E.T();
            if (T != null) {
                T.a();
            }
            return Unit.f40552a;
        }
        return Unit.f40552a;
    }
}
