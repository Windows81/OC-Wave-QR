package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.Metadata;

@Metadata
public final class DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1 implements ColorProducer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f9855z;

    public DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f9855z = delegatingThemeAwareRippleNode;
    }

    public final long a() {
        long a2 = this.f9855z.S.a();
        if (a2 != 16) {
            return a2;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(this.f9855z, RippleKt.c());
        return (rippleConfiguration == null || rippleConfiguration.a() == 16) ? ((Color) CompositionLocalConsumerModifierNodeKt.a(this.f9855z, ContentColorKt.a())).v() : rippleConfiguration.a();
    }
}
