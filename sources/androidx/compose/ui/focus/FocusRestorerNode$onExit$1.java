package androidx.compose.ui.focus;

import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusRestorerNode$onExit$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusRestorerNode f15814z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusRestorerNode$onExit$1(FocusRestorerNode focusRestorerNode) {
        super(1);
        this.f15814z = focusRestorerNode;
    }

    public final void b(FocusEnterExitScope focusEnterExitScope) {
        FocusRequesterModifierNodeKt.e(this.f15814z);
        PinnableContainer.PinnedHandle Z2 = this.f15814z.O;
        if (Z2 != null) {
            Z2.g();
        }
        FocusRestorerNode focusRestorerNode = this.f15814z;
        focusRestorerNode.O = FocusRequesterModifierNodeKt.b(focusRestorerNode);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusEnterExitScope) obj);
        return Unit.f40552a;
    }
}
