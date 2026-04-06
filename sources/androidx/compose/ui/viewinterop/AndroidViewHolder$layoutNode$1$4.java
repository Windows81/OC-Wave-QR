package androidx.compose.ui.viewinterop;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$layoutNode$1$4 extends Lambda implements Function1<Owner, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19209z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f19209z = androidViewHolder;
    }

    public final void b(Owner owner) {
        if (ComposeUiFlags.f15477e && this.f19209z.hasFocus()) {
            owner.getFocusOwner().w(true);
        }
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.Y0(this.f19209z);
        }
        this.f19209z.removeAllViewsInLayout();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Owner) obj);
        return Unit.f40552a;
    }
}
