package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    /* renamed from: A  reason: collision with root package name */
    public final Shape f15719A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f15720B;
    public final long C;
    public final long D;

    /* renamed from: z  reason: collision with root package name */
    public final float f15721z;

    public /* synthetic */ ShadowGraphicsLayerElement(float f2, Shape shape, boolean z2, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, shape, z2, j2, j3);
    }

    /* renamed from: c */
    public BlockGraphicsLayerModifier a() {
        return new BlockGraphicsLayerModifier(d());
    }

    public final Function1 d() {
        return new ShadowGraphicsLayerElement$createBlock$1(this);
    }

    public final long e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.o(this.f15721z, shadowGraphicsLayerElement.f15721z) && Intrinsics.d(this.f15719A, shadowGraphicsLayerElement.f15719A) && this.f15720B == shadowGraphicsLayerElement.f15720B && Color.n(this.C, shadowGraphicsLayerElement.C) && Color.n(this.D, shadowGraphicsLayerElement.D);
    }

    public final boolean g() {
        return this.f15720B;
    }

    public final float h() {
        return this.f15721z;
    }

    public int hashCode() {
        return (((((((Dp.p(this.f15721z) * 31) + this.f15719A.hashCode()) * 31) + Boolean.hashCode(this.f15720B)) * 31) + Color.t(this.C)) * 31) + Color.t(this.D);
    }

    public final Shape i() {
        return this.f15719A;
    }

    public final long j() {
        return this.D;
    }

    /* renamed from: k */
    public void b(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.b3(d());
        blockGraphicsLayerModifier.a3();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + Dp.r(this.f15721z) + ", shape=" + this.f15719A + ", clip=" + this.f15720B + ", ambientColor=" + Color.u(this.C) + ", spotColor=" + Color.u(this.D) + ')';
    }

    public ShadowGraphicsLayerElement(float f2, Shape shape, boolean z2, long j2, long j3) {
        this.f15721z = f2;
        this.f15719A = shape;
        this.f15720B = z2;
        this.C = j2;
        this.D = j3;
    }
}
