package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$3 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6149z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$3(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(1);
        this.f6149z = coreTextFieldSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f6149z;
        coreTextFieldSemanticsModifierNode.n3(coreTextFieldSemanticsModifierNode.l3(), annotatedString.k(), this.f6149z.k3(), this.f6149z.g3());
        return Boolean.TRUE;
    }
}
