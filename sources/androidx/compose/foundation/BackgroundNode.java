package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    public long N;
    public Brush O;
    public float P;
    public Shape Q;
    public long R;
    public LayoutDirection S;
    public Outline T;
    public Shape U;
    public Outline V;

    public /* synthetic */ BackgroundNode(long j2, Brush brush, float f2, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, brush, f2, shape);
    }

    public void L1() {
        this.R = Size.f15876b.a();
        this.S = null;
        this.T = null;
        this.U = null;
        DrawModifierNodeKt.a(this);
    }

    public void U(ContentDrawScope contentDrawScope) {
        if (this.Q == RectangleShapeKt.a()) {
            b3(contentDrawScope);
        } else {
            a3(contentDrawScope);
        }
        contentDrawScope.q2();
    }

    public final void a3(ContentDrawScope contentDrawScope) {
        Outline c3 = c3(contentDrawScope);
        if (!Color.n(this.N, Color.f15975b.f())) {
            OutlineKt.e(contentDrawScope, c3, this.N, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        }
        Brush brush = this.O;
        if (brush != null) {
            OutlineKt.c(contentDrawScope, c3, brush, this.P, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        }
    }

    public final void b3(ContentDrawScope contentDrawScope) {
        if (!Color.n(this.N, Color.f15975b.f())) {
            DrawScope.A1(contentDrawScope, this.N, 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
        Brush brush = this.O;
        if (brush != null) {
            DrawScope.G0(contentDrawScope, brush, 0, 0, this.P, (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
        }
    }

    public final Outline c3(ContentDrawScope contentDrawScope) {
        Outline outline;
        if (!Size.f(contentDrawScope.c(), this.R) || contentDrawScope.getLayoutDirection() != this.S || !Intrinsics.d(this.U, this.Q)) {
            ObserverModifierNodeKt.a(this, new BackgroundNode$getOutline$1(this, contentDrawScope));
            outline = this.V;
            this.V = null;
        } else {
            outline = this.T;
            Intrinsics.f(outline);
        }
        this.T = outline;
        this.R = contentDrawScope.c();
        this.S = contentDrawScope.getLayoutDirection();
        this.U = this.Q;
        Intrinsics.f(outline);
        return outline;
    }

    public final void d(float f2) {
        this.P = f2;
    }

    public final Shape d3() {
        return this.Q;
    }

    public final void e3(Brush brush) {
        this.O = brush;
    }

    public final void f3(long j2) {
        this.N = j2;
    }

    public final void s1(Shape shape) {
        this.Q = shape;
    }

    public BackgroundNode(long j2, Brush brush, float f2, Shape shape) {
        this.N = j2;
        this.O = brush;
        this.P = f2;
        this.Q = shape;
        this.R = Size.f15876b.a();
    }
}
