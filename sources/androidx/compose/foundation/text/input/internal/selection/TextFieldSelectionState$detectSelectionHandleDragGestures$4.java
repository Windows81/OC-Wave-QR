package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$4 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6526A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6527B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6528z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$4(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        super(0);
        this.f6528z = longRef;
        this.f6526A = textFieldSelectionState;
        this.f6527B = longRef2;
    }

    public final void invoke() {
        TextFieldSelectionState.P(this.f6528z, this.f6526A, this.f6527B);
    }
}
