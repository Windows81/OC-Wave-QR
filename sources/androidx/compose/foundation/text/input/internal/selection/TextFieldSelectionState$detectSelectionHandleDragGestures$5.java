package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6529A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Handle f6530B;
    public final /* synthetic */ Ref.LongRef C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6531z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$5(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Handle handle, Ref.LongRef longRef2, boolean z2) {
        super(2);
        this.f6531z = longRef;
        this.f6529A = textFieldSelectionState;
        this.f6530B = handle;
        this.C = longRef2;
        this.D = z2;
    }

    public final void b(PointerInputChange pointerInputChange, long j2) {
        Ref.LongRef longRef = this.f6531z;
        longRef.f40907z = Offset.q(longRef.f40907z, j2);
        TextLayoutResult f2 = this.f6529A.f6464b.f();
        if (f2 != null) {
            this.f6529A.I0(this.f6530B, Offset.q(this.C.f40907z, this.f6531z.f40907z));
            int x2 = this.D ? f2.x(this.f6529A.a0()) : TextRange.n(this.f6529A.f6463a.o().g());
            int i2 = this.D ? TextRange.i(this.f6529A.f6463a.o().g()) : f2.x(this.f6529A.a0());
            long g2 = this.f6529A.f6463a.o().g();
            TextFieldSelectionState textFieldSelectionState = this.f6529A;
            long K0 = TextFieldSelectionState.K0(textFieldSelectionState, textFieldSelectionState.f6463a.o(), x2, i2, this.D, SelectionAdjustment.f6782a.l(), false, false, 96, (Object) null);
            if (TextRange.h(g2) || !TextRange.h(K0)) {
                this.f6529A.f6463a.B(K0);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
