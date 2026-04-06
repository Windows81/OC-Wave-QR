package androidx.compose.ui.viewinterop;

import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19216A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19217B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19218z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, AndroidViewHolder androidViewHolder2) {
        super(1);
        this.f19218z = androidViewHolder;
        this.f19216A = layoutNode;
        this.f19217B = androidViewHolder2;
    }

    public final void b(DrawScope drawScope) {
        AndroidViewHolder androidViewHolder = this.f19218z;
        LayoutNode layoutNode = this.f19216A;
        AndroidViewHolder androidViewHolder2 = this.f19217B;
        Canvas j2 = drawScope.G1().j();
        if (androidViewHolder.getView().getVisibility() != 8) {
            androidViewHolder.a0 = true;
            Owner B0 = layoutNode.B0();
            AndroidComposeView androidComposeView = B0 instanceof AndroidComposeView ? (AndroidComposeView) B0 : null;
            if (androidComposeView != null) {
                androidComposeView.y0(androidViewHolder2, AndroidCanvas_androidKt.d(j2));
            }
            androidViewHolder.a0 = false;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
