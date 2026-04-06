package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public boolean P;
    public boolean Q;
    public TextLayoutState R;
    public TransformedTextFieldState S;
    public TextFieldSelectionState T;
    public Brush U;
    public boolean V;
    public ScrollState W;
    public Orientation X;
    public CursorAnimationState Y;
    public Job Z;
    public TextRange a0;
    public Rect b0 = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);
    public int c0;
    public final TextFieldMagnifierNode d0;

    public TextFieldCoreModifierNode(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.P = z2;
        this.Q = z3;
        this.R = textLayoutState;
        this.S = transformedTextFieldState;
        this.T = textFieldSelectionState;
        this.U = brush;
        this.V = z4;
        this.W = scrollState;
        this.X = orientation;
        this.d0 = (TextFieldMagnifierNode) Z2(AndroidTextFieldMagnifier_androidKt.a(this.S, this.T, this.R, this.P || this.Q));
    }

    public void I2() {
        if (this.P && p3()) {
            s3();
        }
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.R.m(layoutCoordinates);
        this.d0.J(layoutCoordinates);
    }

    public void U(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        TextFieldCharSequence o2 = this.S.o();
        TextLayoutResult f2 = this.R.f();
        if (f2 != null) {
            Pair e2 = o2.e();
            if (e2 != null) {
                m3(contentDrawScope, e2, f2);
            }
            if (TextRange.h(o2.g())) {
                o3(contentDrawScope, f2);
                if (o2.i()) {
                    l3(contentDrawScope);
                }
            } else {
                if (o2.i()) {
                    n3(contentDrawScope, o2.g(), f2);
                }
                o3(contentDrawScope, f2);
            }
            this.d0.U(contentDrawScope);
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.d0.W(semanticsPropertyReceiver);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.X == Orientation.Vertical ? r3(measureScope, measurable, j2) : q3(measureScope, measurable, j2);
    }

    public final int k3(long j2, int i2) {
        TextRange textRange = this.a0;
        if (textRange == null || TextRange.i(j2) != TextRange.i(textRange.r())) {
            return TextRange.i(j2);
        }
        TextRange textRange2 = this.a0;
        if (textRange2 == null || TextRange.n(j2) != TextRange.n(textRange2.r())) {
            return TextRange.n(j2);
        }
        if (i2 != this.c0) {
            return TextRange.n(j2);
        }
        return -1;
    }

    public final void l3(DrawScope drawScope) {
        CursorAnimationState cursorAnimationState = this.Y;
        float e2 = cursorAnimationState != null ? cursorAnimationState.e() : 0.0f;
        if (e2 != 0.0f && p3()) {
            Rect W2 = this.T.W();
            DrawScope.p2(drawScope, this.U, W2.s(), W2.j(), W2.p() - W2.o(), 0, (PathEffect) null, e2, (ColorFilter) null, 0, 432, (Object) null);
        }
    }

    public final void m3(DrawScope drawScope, Pair pair, TextLayoutResult textLayoutResult) {
        int i2 = ((TextHighlightType) pair.a()).i();
        long r2 = ((TextRange) pair.b()).r();
        if (!TextRange.h(r2)) {
            Path z2 = textLayoutResult.z(TextRange.l(r2), TextRange.k(r2));
            if (TextHighlightType.f(i2, TextHighlightType.f6084b.a())) {
                Brush g2 = textLayoutResult.l().i().g();
                if (g2 != null) {
                    DrawScope.n1(drawScope, z2, g2, 0.2f, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
                    return;
                }
                long h2 = textLayoutResult.l().i().h();
                if (h2 == 16) {
                    h2 = Color.f15975b.a();
                }
                long j2 = h2;
                DrawScope.E1(drawScope, z2, Color.l(j2, Color.o(j2) * 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
                return;
            }
            DrawScope.E1(drawScope, z2, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.a(this, TextSelectionColorsKt.b())).a(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        }
    }

    public final void n3(DrawScope drawScope, long j2, TextLayoutResult textLayoutResult) {
        int l2 = TextRange.l(j2);
        int k2 = TextRange.k(j2);
        if (l2 != k2) {
            DrawScope drawScope2 = drawScope;
            DrawScope.E1(drawScope2, textLayoutResult.z(l2, k2), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.a(this, TextSelectionColorsKt.b())).a(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        }
    }

    public final void o3(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.f18495a.a(drawScope.G1().j(), textLayoutResult);
    }

    public final boolean p3() {
        return this.V && (this.P || this.Q) && TextFieldCoreModifierKt.e(this.U);
    }

    public final MeasureResult q3(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c02 = measurable.c0(Constraints.d(j2, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        int min = Math.min(c02.L0(), Constraints.l(j2));
        return MeasureScope.R1(measureScope, min, c02.C0(), (Map) null, new TextFieldCoreModifierNode$measureHorizontalScroll$1(this, measureScope, min, c02), 4, (Object) null);
    }

    public final MeasureResult r3(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c02 = measurable.c0(Constraints.d(j2, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(c02.C0(), Constraints.k(j2));
        return MeasureScope.R1(measureScope, c02.L0(), min, (Map) null, new TextFieldCoreModifierNode$measureVerticalScroll$1(this, measureScope, min, c02), 4, (Object) null);
    }

    public final void s3() {
        if (this.Y == null) {
            this.Y = new CursorAnimationState(((Boolean) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f())).booleanValue());
            DrawModifierNodeKt.a(this);
        }
        this.Z = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TextFieldCoreModifierNode$startCursorJob$1(this, (Continuation) null), 3, (Object) null);
    }

    public final void t3(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        boolean p3 = p3();
        boolean z5 = this.P;
        TransformedTextFieldState transformedTextFieldState2 = this.S;
        TextLayoutState textLayoutState2 = this.R;
        TextFieldSelectionState textFieldSelectionState2 = this.T;
        ScrollState scrollState2 = this.W;
        this.P = z2;
        this.Q = z3;
        this.R = textLayoutState;
        this.S = transformedTextFieldState;
        this.T = textFieldSelectionState;
        this.U = brush;
        this.V = z4;
        this.W = scrollState;
        this.X = orientation;
        this.d0.f3(transformedTextFieldState, textFieldSelectionState, textLayoutState, z2 || z3);
        if (!p3()) {
            Job job = this.Z;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.Z = null;
            CursorAnimationState cursorAnimationState = this.Y;
            if (cursorAnimationState != null) {
                cursorAnimationState.c();
            }
        } else if (!z5 || !Intrinsics.d(transformedTextFieldState2, transformedTextFieldState) || !p3) {
            s3();
        }
        if (!Intrinsics.d(transformedTextFieldState2, transformedTextFieldState) || !Intrinsics.d(textLayoutState2, textLayoutState) || !Intrinsics.d(textFieldSelectionState2, textFieldSelectionState) || !Intrinsics.d(scrollState2, scrollState)) {
            LayoutModifierNodeKt.b(this);
        }
    }

    public final void u3(Density density, int i2, int i3, long j2, LayoutDirection layoutDirection) {
        TextLayoutResult f2;
        float f3;
        int i4;
        this.W.o(i3 - i2);
        int k3 = k3(j2, i3);
        if (k3 >= 0 && p3() && (f2 = this.R.f()) != null) {
            boolean z2 = false;
            Rect e2 = f2.e(RangesKt.p(k3, new IntRange(0, f2.l().j().length())));
            Rect a2 = TextFieldCoreModifierKt.d(density, e2, layoutDirection == LayoutDirection.Rtl, i3);
            if (a2.o() != this.b0.o() || a2.r() != this.b0.r() || i3 != this.c0) {
                if (this.X == Orientation.Vertical) {
                    z2 = true;
                }
                float r2 = z2 ? a2.r() : a2.o();
                float i5 = z2 ? a2.i() : a2.p();
                int n2 = this.W.n();
                float f4 = (float) (n2 + i2);
                float f5 = (i5 <= f4 && (r2 >= f3 || i5 - r2 <= ((float) i2))) ? (i4 >= 0 || i5 - r2 > ((float) i2)) ? 0.0f : r2 - (f3 = (float) n2) : i5 - f4;
                this.a0 = TextRange.b(j2);
                this.b0 = a2;
                this.c0 = i3;
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f5, e2, (Continuation) null), 1, (Object) null);
            }
        }
    }
}
