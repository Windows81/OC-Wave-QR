package androidx.compose.ui.viewinterop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewFactoryHolder$releaseBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f19254z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$releaseBlock$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f19254z = viewFactoryHolder;
    }

    public final void invoke() {
        this.f19254z.getReleaseBlock().invoke(this.f19254z.f0);
        this.f19254z.J();
    }
}
