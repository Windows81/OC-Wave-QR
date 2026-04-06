package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FocusGroupPropertiesNode$onExit$1 extends Lambda implements Function1<FocusEnterExitScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusGroupPropertiesNode f19251z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusGroupPropertiesNode$onExit$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.f19251z = focusGroupPropertiesNode;
    }

    public final void b(FocusEnterExitScope focusEnterExitScope) {
        View view;
        View c2 = FocusGroupNode_androidKt.g(this.f19251z);
        if (ComposeUiFlags.f15477e) {
            if (c2.hasFocus() || c2.isFocused()) {
                c2.clearFocus();
            }
        } else if (c2.hasFocus()) {
            FocusOwner focusOwner = DelegatableNodeKt.p(this.f19251z).getFocusOwner();
            View a2 = DelegatableNode_androidKt.a(this.f19251z);
            if (c2 instanceof ViewGroup) {
                Rect b2 = FocusGroupNode_androidKt.f(focusOwner, a2, c2);
                Integer c3 = FocusInteropUtils_androidKt.c(focusEnterExitScope.a());
                int intValue = c3 != null ? c3.intValue() : 130;
                FocusFinder instance = FocusFinder.getInstance();
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.f19251z;
                if (focusGroupPropertiesNode.a3() != null) {
                    Intrinsics.g(a2, "null cannot be cast to non-null type android.view.ViewGroup");
                    view = instance.findNextFocus((ViewGroup) a2, focusGroupPropertiesNode.a3(), intValue);
                } else {
                    Intrinsics.g(a2, "null cannot be cast to non-null type android.view.ViewGroup");
                    view = instance.findNextFocusFromRect((ViewGroup) a2, b2, intValue);
                }
                if (view != null && FocusGroupNode_androidKt.d(c2, view)) {
                    view.requestFocus(intValue, b2);
                    focusEnterExitScope.b();
                } else if (!a2.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            } else if (!a2.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusEnterExitScope) obj);
        return Unit.f40552a;
    }
}
