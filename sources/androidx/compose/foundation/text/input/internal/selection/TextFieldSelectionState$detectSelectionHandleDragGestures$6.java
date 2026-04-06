package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$6 extends Lambda implements Function0<String> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Handle f6532A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6533z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$6(TextFieldSelectionState textFieldSelectionState, Handle handle) {
        super(0);
        this.f6533z = textFieldSelectionState;
        this.f6532A = handle;
    }

    public final String invoke() {
        return "Selection Handle drag cancelled for draggingHandle: " + this.f6533z.Y() + " definedOn: " + this.f6532A;
    }
}
