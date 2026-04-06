package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {

    /* renamed from: A  reason: collision with root package name */
    public final float f16015A;

    /* renamed from: B  reason: collision with root package name */
    public final float f16016B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final long J;
    public final Shape K;
    public final boolean L;
    public final RenderEffect M;
    public final long N;
    public final long O;
    public final int P;

    /* renamed from: z  reason: collision with root package name */
    public final float f16017z;

    public /* synthetic */ GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2);
    }

    /* renamed from: c */
    public SimpleGraphicsLayerModifier a() {
        return new SimpleGraphicsLayerModifier(this.f16017z, this.f16015A, this.f16016B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        simpleGraphicsLayerModifier.j(this.f16017z);
        simpleGraphicsLayerModifier.i(this.f16015A);
        simpleGraphicsLayerModifier.d(this.f16016B);
        simpleGraphicsLayerModifier.l(this.C);
        simpleGraphicsLayerModifier.h(this.D);
        simpleGraphicsLayerModifier.p(this.E);
        simpleGraphicsLayerModifier.n(this.F);
        simpleGraphicsLayerModifier.e(this.G);
        simpleGraphicsLayerModifier.g(this.H);
        simpleGraphicsLayerModifier.m(this.I);
        simpleGraphicsLayerModifier.Q1(this.J);
        simpleGraphicsLayerModifier.s1(this.K);
        simpleGraphicsLayerModifier.R(this.L);
        simpleGraphicsLayerModifier.k(this.M);
        simpleGraphicsLayerModifier.L(this.N);
        simpleGraphicsLayerModifier.T(this.O);
        simpleGraphicsLayerModifier.y(this.P);
        simpleGraphicsLayerModifier.i3();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f16017z, graphicsLayerElement.f16017z) == 0 && Float.compare(this.f16015A, graphicsLayerElement.f16015A) == 0 && Float.compare(this.f16016B, graphicsLayerElement.f16016B) == 0 && Float.compare(this.C, graphicsLayerElement.C) == 0 && Float.compare(this.D, graphicsLayerElement.D) == 0 && Float.compare(this.E, graphicsLayerElement.E) == 0 && Float.compare(this.F, graphicsLayerElement.F) == 0 && Float.compare(this.G, graphicsLayerElement.G) == 0 && Float.compare(this.H, graphicsLayerElement.H) == 0 && Float.compare(this.I, graphicsLayerElement.I) == 0 && TransformOrigin.e(this.J, graphicsLayerElement.J) && Intrinsics.d(this.K, graphicsLayerElement.K) && this.L == graphicsLayerElement.L && Intrinsics.d(this.M, graphicsLayerElement.M) && Color.n(this.N, graphicsLayerElement.N) && Color.n(this.O, graphicsLayerElement.O) && CompositingStrategy.f(this.P, graphicsLayerElement.P);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((Float.hashCode(this.f16017z) * 31) + Float.hashCode(this.f16015A)) * 31) + Float.hashCode(this.f16016B)) * 31) + Float.hashCode(this.C)) * 31) + Float.hashCode(this.D)) * 31) + Float.hashCode(this.E)) * 31) + Float.hashCode(this.F)) * 31) + Float.hashCode(this.G)) * 31) + Float.hashCode(this.H)) * 31) + Float.hashCode(this.I)) * 31) + TransformOrigin.h(this.J)) * 31) + this.K.hashCode()) * 31) + Boolean.hashCode(this.L)) * 31;
        RenderEffect renderEffect = this.M;
        return ((((((hashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + Color.t(this.N)) * 31) + Color.t(this.O)) * 31) + CompositingStrategy.g(this.P);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f16017z + ", scaleY=" + this.f16015A + ", alpha=" + this.f16016B + ", translationX=" + this.C + ", translationY=" + this.D + ", shadowElevation=" + this.E + ", rotationX=" + this.F + ", rotationY=" + this.G + ", rotationZ=" + this.H + ", cameraDistance=" + this.I + ", transformOrigin=" + TransformOrigin.i(this.J) + ", shape=" + this.K + ", clip=" + this.L + ", renderEffect=" + this.M + ", ambientShadowColor=" + Color.u(this.N) + ", spotShadowColor=" + Color.u(this.O) + ", compositingStrategy=" + CompositingStrategy.h(this.P) + ')';
    }

    public GraphicsLayerElement(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        this.f16017z = f2;
        this.f16015A = f3;
        this.f16016B = f4;
        this.C = f5;
        this.D = f6;
        this.E = f7;
        this.F = f8;
        this.G = f9;
        this.H = f10;
        this.I = f11;
        this.J = j2;
        this.K = shape;
        this.L = z2;
        this.M = renderEffect;
        this.N = j3;
        this.O = j4;
        this.P = i2;
    }
}
