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
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$2 extends Lambda implements Function1<Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6520A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f6521B;
    public final /* synthetic */ Handle C;
    public final /* synthetic */ Ref.LongRef D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6522z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$2(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, boolean z2, Handle handle, Ref.LongRef longRef2) {
        super(1);
        this.f6522z = longRef;
        this.f6520A = textFieldSelectionState;
        this.f6521B = z2;
        this.C = handle;
        this.D = longRef2;
    }

    public final void b(long j2) {
        this.f6522z.f40907z = SelectionHandlesKt.a(this.f6520A.b0(this.f6521B));
        this.f6520A.I0(this.C, this.f6522z.f40907z);
        this.D.f40907z = Offset.f15855b.c();
        this.f6520A.f6483u = -1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Offset) obj).t());
        return Unit.f40552a;
    }
}
