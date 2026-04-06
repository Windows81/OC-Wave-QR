package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;

@Metadata
final class LayerPositionalProperties {

    /* renamed from: a  reason: collision with root package name */
    public float f17267a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f17268b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f17269c;

    /* renamed from: d  reason: collision with root package name */
    public float f17270d;

    /* renamed from: e  reason: collision with root package name */
    public float f17271e;

    /* renamed from: f  reason: collision with root package name */
    public float f17272f;

    /* renamed from: g  reason: collision with root package name */
    public float f17273g;

    /* renamed from: h  reason: collision with root package name */
    public float f17274h = 8.0f;

    /* renamed from: i  reason: collision with root package name */
    public long f17275i = TransformOrigin.f16150b.a();

    public final void a(GraphicsLayerScope graphicsLayerScope) {
        this.f17267a = graphicsLayerScope.o();
        this.f17268b = graphicsLayerScope.Y();
        this.f17269c = graphicsLayerScope.Q();
        this.f17270d = graphicsLayerScope.K();
        this.f17271e = graphicsLayerScope.S();
        this.f17272f = graphicsLayerScope.z();
        this.f17273g = graphicsLayerScope.B();
        this.f17274h = graphicsLayerScope.O();
        this.f17275i = graphicsLayerScope.N1();
    }

    public final void b(LayerPositionalProperties layerPositionalProperties) {
        this.f17267a = layerPositionalProperties.f17267a;
        this.f17268b = layerPositionalProperties.f17268b;
        this.f17269c = layerPositionalProperties.f17269c;
        this.f17270d = layerPositionalProperties.f17270d;
        this.f17271e = layerPositionalProperties.f17271e;
        this.f17272f = layerPositionalProperties.f17272f;
        this.f17273g = layerPositionalProperties.f17273g;
        this.f17274h = layerPositionalProperties.f17274h;
        this.f17275i = layerPositionalProperties.f17275i;
    }

    public final boolean c(LayerPositionalProperties layerPositionalProperties) {
        return this.f17267a == layerPositionalProperties.f17267a && this.f17268b == layerPositionalProperties.f17268b && this.f17269c == layerPositionalProperties.f17269c && this.f17270d == layerPositionalProperties.f17270d && this.f17271e == layerPositionalProperties.f17271e && this.f17272f == layerPositionalProperties.f17272f && this.f17273g == layerPositionalProperties.f17273g && this.f17274h == layerPositionalProperties.f17274h && TransformOrigin.e(this.f17275i, layerPositionalProperties.f17275i);
    }
}
