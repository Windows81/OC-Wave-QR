package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldSemanticsModifierNode$applySemantics$2 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode f6148z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldSemanticsModifierNode$applySemantics$2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        super(1);
        this.f6148z = coreTextFieldSemanticsModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke(List list) {
        boolean z2;
        if (this.f6148z.l3().l() != null) {
            TextLayoutResultProxy l2 = this.f6148z.l3().l();
            Intrinsics.f(l2);
            list.add(l2.f());
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
