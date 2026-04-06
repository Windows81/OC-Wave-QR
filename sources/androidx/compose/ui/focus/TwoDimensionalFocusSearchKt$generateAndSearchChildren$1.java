package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FocusTransactionManager f15845A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f15846B;
    public final /* synthetic */ FocusTargetNode C;
    public final /* synthetic */ Rect D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function1 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f15847z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(int i2, FocusTransactionManager focusTransactionManager, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Rect rect, int i3, Function1 function1) {
        super(1);
        this.f15847z = i2;
        this.f15845A = focusTransactionManager;
        this.f15846B = focusTargetNode;
        this.C = focusTargetNode2;
        this.D = rect;
        this.E = i3;
        this.F = function1;
    }

    /* renamed from: b */
    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        if (this.f15847z != this.f15845A.h() || (ComposeUiFlags.f15479g && this.f15846B != DelegatableNodeKt.p(this.C).getFocusOwner().t())) {
            return Boolean.TRUE;
        }
        boolean a2 = TwoDimensionalFocusSearchKt.r(this.C, this.D, this.E, this.F);
        Boolean valueOf = Boolean.valueOf(a2);
        if (a2 || !beyondBoundsScope.a()) {
            return valueOf;
        }
        return null;
    }
}
