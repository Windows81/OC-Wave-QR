package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusTargetModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusableNode$applySemantics$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusableNode f3071z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableNode$applySemantics$1(FocusableNode focusableNode) {
        super(0);
        this.f3071z = focusableNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(FocusTargetModifierNode.v1(this.f3071z.V, 0, 1, (Object) null));
    }
}
