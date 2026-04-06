package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectCursorHandleDragGestures$2 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6508A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6509B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6510z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$2(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        super(1);
        this.f6510z = longRef;
        this.f6508A = textFieldSelectionState;
        this.f6509B = longRef2;
    }

    public final void b(long j2) {
        this.f6510z.f40907z = SelectionHandlesKt.a(this.f6508A.W().j());
        this.f6509B.f40907z = Offset.f15855b.c();
        this.f6508A.y0(true);
        this.f6508A.n0();
        this.f6508A.I0(Handle.Cursor, this.f6510z.f40907z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
