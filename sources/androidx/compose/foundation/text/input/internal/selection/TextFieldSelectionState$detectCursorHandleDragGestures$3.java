package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectCursorHandleDragGestures$3 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6511A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6512B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6513z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$3(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6513z = longRef;
        this.f6511A = longRef2;
        this.f6512B = textFieldSelectionState;
    }

    public final void invoke() {
        TextFieldSelectionState.N(this.f6513z, this.f6511A, this.f6512B);
    }
}
