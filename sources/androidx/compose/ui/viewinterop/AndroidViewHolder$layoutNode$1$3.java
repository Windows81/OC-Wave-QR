package androidx.compose.ui.viewinterop;

import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$3 extends Lambda implements Function1<Owner, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f19207A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19208z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f19208z = androidViewHolder;
        this.f19207A = layoutNode;
    }

    public final void b(Owner owner) {
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.p0(this.f19208z, this.f19207A);
        }
        ViewParent parent = this.f19208z.getView().getParent();
        AndroidViewHolder androidViewHolder = this.f19208z;
        if (parent != androidViewHolder) {
            androidViewHolder.addView(androidViewHolder.getView());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Owner) obj);
        return Unit.f40552a;
    }
}
