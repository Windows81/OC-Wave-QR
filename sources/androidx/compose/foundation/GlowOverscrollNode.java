package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final AndroidEdgeEffectOverscrollEffect P;
    public final EdgeEffectWrapper Q;
    public final PaddingValues R;

    public GlowOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.P = androidEdgeEffectOverscrollEffect;
        this.Q = edgeEffectWrapper;
        this.R = paddingValues;
        Z2(delegatableNode);
    }

    public void U(ContentDrawScope contentDrawScope) {
        this.P.m(contentDrawScope.c());
        if (Size.k(contentDrawScope.c())) {
            contentDrawScope.q2();
            return;
        }
        contentDrawScope.q2();
        this.P.f().getValue();
        Canvas d2 = AndroidCanvas_androidKt.d(contentDrawScope.G1().j());
        EdgeEffectWrapper edgeEffectWrapper = this.Q;
        boolean z2 = false;
        boolean g3 = edgeEffectWrapper.s() ? g3(contentDrawScope, edgeEffectWrapper.i(), d2) : false;
        if (edgeEffectWrapper.z()) {
            g3 = i3(contentDrawScope, edgeEffectWrapper.m(), d2) || g3;
        }
        if (edgeEffectWrapper.v()) {
            g3 = h3(contentDrawScope, edgeEffectWrapper.k(), d2) || g3;
        }
        if (edgeEffectWrapper.p()) {
            if (f3(contentDrawScope, edgeEffectWrapper.g(), d2) || g3) {
                z2 = true;
            }
            g3 = z2;
        }
        if (g3) {
            this.P.g();
        }
    }

    public final boolean f3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return j3(180.0f, Offset.e((((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (drawScope.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (drawScope.c() & 4294967295L))) + drawScope.B1(this.R.a()))) & 4294967295L)), edgeEffect, canvas);
    }

    public final boolean g3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return j3(270.0f, Offset.e((((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(drawScope.B1(this.R.b(drawScope.getLayoutDirection())))))), edgeEffect, canvas);
    }

    public final boolean h3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float B1 = (-((float) MathKt.d(Float.intBitsToFloat((int) (drawScope.c() >> 32))))) + drawScope.B1(this.R.c(drawScope.getLayoutDirection()));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(0.0f);
        return j3(90.0f, Offset.e((((long) Float.floatToRawIntBits(B1)) & 4294967295L) | (floatToRawIntBits << 32)), edgeEffect, canvas);
    }

    public final boolean i3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return j3(0.0f, Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(drawScope.B1(this.R.d()))) & 4294967295L)), edgeEffect, canvas);
    }

    public final boolean j3(float f2, long j2, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f2);
        canvas.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
