package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RippleNodeFactory implements IndicationNodeFactory {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8249a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8250b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorProducer f8251c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8252d;

    public /* synthetic */ RippleNodeFactory(boolean z2, float f2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, j2);
    }

    public DelegatableNode b(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.f8251c;
        if (colorProducer == null) {
            colorProducer = new RippleNodeFactory$create$colorProducer$1(this);
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.f8249a, this.f8250b, colorProducer, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.f8249a == rippleNodeFactory.f8249a && Dp.o(this.f8250b, rippleNodeFactory.f8250b) && Intrinsics.d(this.f8251c, rippleNodeFactory.f8251c)) {
            return Color.n(this.f8252d, rippleNodeFactory.f8252d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f8249a) * 31) + Dp.p(this.f8250b)) * 31;
        ColorProducer colorProducer = this.f8251c;
        return ((hashCode + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.t(this.f8252d);
    }

    public RippleNodeFactory(boolean z2, float f2, ColorProducer colorProducer, long j2) {
        this.f8249a = z2;
        this.f8250b = f2;
        this.f8251c = colorProducer;
        this.f8252d = j2;
    }

    public RippleNodeFactory(boolean z2, float f2, long j2) {
        this(z2, f2, (ColorProducer) null, j2);
    }
}
