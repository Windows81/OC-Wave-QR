package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class GraphicsLayerModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new BlockGraphicsLayerElement(function1));
    }

    public static final Modifier b(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        GraphicsLayerElement graphicsLayerElement = r0;
        GraphicsLayerElement graphicsLayerElement2 = new GraphicsLayerElement(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2, (DefaultConstructorMarker) null);
        return modifier.o0(graphicsLayerElement);
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, int i3, Object obj) {
        int i4 = i3;
        float f12 = 1.0f;
        float f13 = (i4 & 1) != 0 ? 1.0f : f2;
        float f14 = (i4 & 2) != 0 ? 1.0f : f3;
        if ((i4 & 4) == 0) {
            f12 = f4;
        }
        float f15 = 0.0f;
        float f16 = (i4 & 8) != 0 ? 0.0f : f5;
        float f17 = (i4 & 16) != 0 ? 0.0f : f6;
        float f18 = (i4 & 32) != 0 ? 0.0f : f7;
        float f19 = (i4 & 64) != 0 ? 0.0f : f8;
        float f20 = (i4 & 128) != 0 ? 0.0f : f9;
        if ((i4 & 256) == 0) {
            f15 = f10;
        }
        return b(modifier, f13, f14, f12, f16, f17, f18, f19, f20, f15, (i4 & 512) != 0 ? 8.0f : f11, (i4 & 1024) != 0 ? TransformOrigin.f16150b.a() : j2, (i4 & 2048) != 0 ? RectangleShapeKt.a() : shape, (i4 & 4096) != 0 ? false : z2, (i4 & 8192) != 0 ? null : renderEffect, (i4 & 16384) != 0 ? GraphicsLayerScopeKt.a() : j3, (i4 & 32768) != 0 ? GraphicsLayerScopeKt.a() : j4, (i4 & 65536) != 0 ? CompositingStrategy.f15997b.a() : i2);
    }

    public static final Modifier d(Modifier modifier) {
        if (!InspectableValueKt.b()) {
            return modifier;
        }
        return modifier.o0(c(Modifier.f15489d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131071, (Object) null));
    }
}
