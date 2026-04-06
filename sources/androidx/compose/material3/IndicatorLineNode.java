package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class IndicatorLineNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    public boolean P;
    public boolean Q;
    public InteractionSource R;
    public float S;
    public float T;
    public boolean U;
    public Job V;
    public TextFieldColors W;
    public Animatable X;
    public Shape Y;
    public final Animatable Z;
    public final CacheDrawModifierNode a0;

    public /* synthetic */ IndicatorLineNode(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, interactionSource, textFieldColors, shape, f2, f3);
    }

    public static final DrawResult s3(IndicatorLineNode indicatorLineNode, CacheDrawScope cacheDrawScope) {
        float B1 = cacheDrawScope.B1(((Dp) indicatorLineNode.Z.m()).t());
        Path a2 = AndroidPath_androidKt.a();
        OutlineKt.a(a2, indicatorLineNode.v3().a(cacheDrawScope.c(), cacheDrawScope.getLayoutDirection(), cacheDrawScope));
        Path a3 = AndroidPath_androidKt.a();
        Path.d(a3, new Rect(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.c() & 4294967295L)) - B1, Float.intBitsToFloat((int) (cacheDrawScope.c() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.c() & 4294967295L))), (Path.Direction) null, 2, (Object) null);
        return cacheDrawScope.t(new C0086e3(a3.f(a2), indicatorLineNode));
    }

    public static final Unit t3(Path path, IndicatorLineNode indicatorLineNode, ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        Animatable animatable = indicatorLineNode.X;
        Intrinsics.f(animatable);
        DrawScope.n1(contentDrawScope, path, new SolidColor(((Color) animatable.m()).v(), (DefaultConstructorMarker) null), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        return Unit.f40552a;
    }

    private final Shape v3() {
        Shape shape = this.Y;
        return shape == null ? ShapesKt.e((Shapes) CompositionLocalConsumerModifierNodeKt.a(this, ShapesKt.f()), FilledTextFieldTokens.f13329a.d()) : shape;
    }

    public boolean D2() {
        return false;
    }

    public void I2() {
        this.V = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new IndicatorLineNode$onAttach$1(this, (Continuation) null), 3, (Object) null);
        if (this.X == null) {
            long o2 = u3().o(this.P, this.Q, this.U);
            this.X = new Animatable(Color.h(o2), (TwoWayConverter) ColorVectorConverterKt.a(Color.f15975b).invoke(Color.q(o2)), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        }
    }

    public final TextFieldColors u3() {
        TextFieldColors textFieldColors = this.W;
        return textFieldColors == null ? TextFieldDefaults.f11367a.n((ColorScheme) CompositionLocalConsumerModifierNodeKt.a(this, ColorSchemeKt.j()), (TextSelectionColors) CompositionLocalConsumerModifierNodeKt.a(this, TextSelectionColorsKt.b())) : textFieldColors;
    }

    public final void w3() {
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new IndicatorLineNode$invalidateIndicator$1(this, (Continuation) null), 3, (Object) null);
        Job unused2 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new IndicatorLineNode$invalidateIndicator$2(this, (Continuation) null), 3, (Object) null);
    }

    public final void x3(Shape shape) {
        if (!Intrinsics.d(this.Y, shape)) {
            this.Y = shape;
            this.a0.s0();
        }
    }

    public final Object y3(Continuation continuation) {
        this.U = false;
        Object a2 = this.R.c().a(new IndicatorLineNode$trackFocusState$2(new ArrayList(), this), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final void z3(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        boolean z4;
        boolean z5 = true;
        if (this.P != z2) {
            this.P = z2;
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.Q != z3) {
            this.Q = z3;
            z4 = true;
        }
        if (this.R != interactionSource) {
            this.R = interactionSource;
            Job job = this.V;
            if (job != null) {
                Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            }
            this.V = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new IndicatorLineNode$update$1(this, (Continuation) null), 3, (Object) null);
        }
        if (!Intrinsics.d(this.W, textFieldColors)) {
            this.W = textFieldColors;
            z4 = true;
        }
        if (!Intrinsics.d(this.Y, shape)) {
            x3(shape);
            z4 = true;
        }
        if (!Dp.o(this.S, f2)) {
            this.S = f2;
            z4 = true;
        }
        if (!Dp.o(this.T, f3)) {
            this.T = f3;
        } else {
            z5 = z4;
        }
        if (z5) {
            w3();
        }
    }

    public IndicatorLineNode(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3) {
        float f4;
        this.P = z2;
        this.Q = z3;
        this.R = interactionSource;
        this.S = f2;
        this.T = f3;
        this.W = textFieldColors;
        this.Y = shape;
        if (!this.U || !this.P) {
            f4 = this.T;
        } else {
            f4 = this.S;
        }
        this.Z = new Animatable(Dp.j(f4), VectorConvertersKt.e(Dp.f19144A), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
        this.a0 = (CacheDrawModifierNode) Z2(DrawModifierKt.a(new C0076d3(this)));
    }
}
