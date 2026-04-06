package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusGroupPropertiesNode$onEnter$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusGroupPropertiesNode f19250z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusGroupPropertiesNode$onEnter$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.f19250z = focusGroupPropertiesNode;
    }

    public final void b(FocusEnterExitScope focusEnterExitScope) {
        View c2 = FocusGroupNode_androidKt.g(this.f19250z);
        if (!c2.isFocused() && !c2.hasFocus()) {
            if (!FocusInteropUtils_androidKt.b(c2, FocusInteropUtils_androidKt.c(focusEnterExitScope.a()), FocusGroupNode_androidKt.f(DelegatableNodeKt.p(this.f19250z).getFocusOwner(), DelegatableNode_androidKt.a(this.f19250z), c2))) {
                focusEnterExitScope.b();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusEnterExitScope) obj);
        return Unit.f40552a;
    }
}
