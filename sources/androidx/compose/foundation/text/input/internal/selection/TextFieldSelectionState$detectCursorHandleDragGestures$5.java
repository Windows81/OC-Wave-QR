package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectCursorHandleDragGestures$5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6517A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6518B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6519z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$5(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        super(2);
        this.f6519z = longRef;
        this.f6517A = textFieldSelectionState;
        this.f6518B = longRef2;
    }

    public final void b(PointerInputChange pointerInputChange, long j2) {
        Ref.LongRef longRef = this.f6519z;
        longRef.f40907z = Offset.q(longRef.f40907z, j2);
        this.f6517A.I0(Handle.Cursor, Offset.q(this.f6518B.f40907z, this.f6519z.f40907z));
        TextFieldSelectionState textFieldSelectionState = this.f6517A;
        if (textFieldSelectionState.s0(textFieldSelectionState.a0())) {
            pointerInputChange.a();
            HapticFeedback h2 = this.f6517A.f6470h;
            if (h2 != null) {
                h2.a(HapticFeedbackType.f16726b.i());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
