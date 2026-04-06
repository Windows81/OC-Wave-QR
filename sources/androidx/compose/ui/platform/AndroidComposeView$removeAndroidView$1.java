package androidx.compose.ui.platform;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$removeAndroidView$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17518A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17519z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.f17519z = androidComposeView;
        this.f17518A = androidViewHolder;
    }

    public final void invoke() {
        this.f17519z.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f17518A);
        this.f17519z.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(this.f17519z.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f17518A));
        this.f17518A.setImportantForAccessibility(0);
    }
}
