package androidx.compose.foundation.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ToggleableNode$_onClick$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ToggleableNode f5446z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableNode$_onClick$1(ToggleableNode toggleableNode) {
        super(0);
        this.f5446z = toggleableNode;
    }

    public final void invoke() {
        this.f5446z.j0.invoke(Boolean.valueOf(!this.f5446z.i0));
    }
}
