package androidx.compose.material;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;

@Metadata
public final class DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1 implements ColorProducer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f7676z;

    public DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f7676z = delegatingThemeAwareRippleNode;
    }

    public final long a() {
        long a2 = this.f7676z.S.a();
        if (a2 != 16) {
            return a2;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(this.f7676z, RippleKt.d());
        return (rippleConfiguration == null || rippleConfiguration.a() == 16) ? RippleDefaults.f8241a.b(((Color) CompositionLocalConsumerModifierNodeKt.a(this.f7676z, ContentColorKt.a())).v(), ((Colors) CompositionLocalConsumerModifierNodeKt.a(this.f7676z, ColorsKt.c())).o()) : rippleConfiguration.a();
    }
}
