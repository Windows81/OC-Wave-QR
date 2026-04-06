package androidx.compose.ui.viewinterop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$runUpdate$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f19224z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.f19224z = androidViewHolder;
    }

    public final void invoke() {
        AndroidViewHolder androidViewHolder;
        if (this.f19224z.E && this.f19224z.isAttachedToWindow() && this.f19224z.getView().getParent() == (androidViewHolder = this.f19224z)) {
            androidViewHolder.getSnapshotObserver().i(this.f19224z, AndroidViewHolder.e0, this.f19224z.getUpdate());
        }
    }
}
