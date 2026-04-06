package androidx.compose.material;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DelegatingThemeAwareRippleNode$updateConfiguration$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f7678z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$updateConfiguration$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f7678z = delegatingThemeAwareRippleNode;
    }

    public final void invoke() {
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(this.f7678z, RippleKt.d())) == null) {
            this.f7678z.k3();
        } else if (this.f7678z.T == null) {
            this.f7678z.j3();
        }
    }
}
