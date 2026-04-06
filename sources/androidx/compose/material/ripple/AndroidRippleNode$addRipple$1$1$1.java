package androidx.compose.material.ripple;

import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidRippleNode$addRipple$1$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidRippleNode f9051z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidRippleNode$addRipple$1$1$1(AndroidRippleNode androidRippleNode) {
        super(0);
        this.f9051z = androidRippleNode;
    }

    public final void invoke() {
        DrawModifierNodeKt.a(this.f9051z);
    }
}
