package androidx.compose.material3;

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
    public final boolean f10740a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10741b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorProducer f10742c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10743d;

    public /* synthetic */ RippleNodeFactory(boolean z2, float f2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, j2);
    }

    public DelegatableNode b(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.f10742c;
        if (colorProducer == null) {
            colorProducer = new RippleNodeFactory$create$colorProducer$1(this);
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.f10740a, this.f10741b, colorProducer, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.f10740a == rippleNodeFactory.f10740a && Dp.o(this.f10741b, rippleNodeFactory.f10741b) && Intrinsics.d(this.f10742c, rippleNodeFactory.f10742c)) {
            return Color.n(this.f10743d, rippleNodeFactory.f10743d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f10740a) * 31) + Dp.p(this.f10741b)) * 31;
        ColorProducer colorProducer = this.f10742c;
        return ((hashCode + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31) + Color.t(this.f10743d);
    }

    public RippleNodeFactory(boolean z2, float f2, ColorProducer colorProducer, long j2) {
        this.f10740a = z2;
        this.f10741b = f2;
        this.f10742c = colorProducer;
        this.f10743d = j2;
    }

    public RippleNodeFactory(boolean z2, float f2, long j2) {
        this(z2, f2, (ColorProducer) null, j2);
    }
}
