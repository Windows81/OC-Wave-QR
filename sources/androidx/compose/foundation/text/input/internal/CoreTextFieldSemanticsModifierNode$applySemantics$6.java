package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$6 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6153z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$6(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(0);
        this.f6153z = coreTextFieldSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        this.f6153z.l3().n().invoke(ImeAction.j(this.f6153z.h3().e()));
        return Boolean.TRUE;
    }
}
