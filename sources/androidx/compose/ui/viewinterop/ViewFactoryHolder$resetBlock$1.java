package androidx.compose.ui.viewinterop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewFactoryHolder$resetBlock$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f19255z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$resetBlock$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f19255z = viewFactoryHolder;
    }

    public final void invoke() {
        this.f19255z.getResetBlock().invoke(this.f19255z.f0);
    }
}
