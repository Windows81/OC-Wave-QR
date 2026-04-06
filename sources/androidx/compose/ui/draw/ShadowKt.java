package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ShadowKt {
    public static final Modifier a(Modifier modifier, float f2, Shape shape, boolean z2, long j2, long j3) {
        float f3 = f2;
        if (Dp.l(f2, Dp.m((float) 0)) <= 0 && !z2) {
            return modifier;
        }
        Modifier modifier2 = modifier;
        return modifier.o0(new ShadowGraphicsLayerElement(f2, shape, z2, j2, j3, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, Shape shape, boolean z2, long j2, long j3, int i2, Object obj) {
        boolean z3;
        Shape a2 = (i2 & 2) != 0 ? RectangleShapeKt.a() : shape;
        if ((i2 & 4) != 0) {
            z3 = false;
            float f3 = f2;
            if (Dp.l(f2, Dp.m((float) 0)) > 0) {
                z3 = true;
            }
        } else {
            float f4 = f2;
            z3 = z2;
        }
        return a(modifier, f2, a2, z3, (i2 & 8) != 0 ? GraphicsLayerScopeKt.a() : j2, (i2 & 16) != 0 ? GraphicsLayerScopeKt.a() : j3);
    }
}
