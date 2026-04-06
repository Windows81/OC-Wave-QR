package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$3 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6523A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6524B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6525z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$3(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        super(0);
        this.f6525z = longRef;
        this.f6523A = textFieldSelectionState;
        this.f6524B = longRef2;
    }

    public final void invoke() {
        TextFieldSelectionState.P(this.f6525z, this.f6523A, this.f6524B);
    }
}
