package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$8 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6155z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$8(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(0);
        this.f6155z = coreTextFieldSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        TextFieldSelectionManager.y(this.f6155z.i3(), false, 1, (Object) null);
        return Boolean.TRUE;
    }
}
