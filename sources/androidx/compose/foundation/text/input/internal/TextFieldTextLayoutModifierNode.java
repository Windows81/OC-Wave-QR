package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public TextLayoutState N;
    public boolean O;
    public Map P;

    public TextFieldTextLayoutModifierNode(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2 function2, KeyboardOptions keyboardOptions) {
        this.N = textLayoutState;
        this.O = z2;
        textLayoutState.p(function2);
        TextLayoutState textLayoutState2 = this.N;
        boolean z3 = this.O;
        textLayoutState2.r(transformedTextFieldState, textStyle, z3, !z3, keyboardOptions);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.N.q(layoutCoordinates);
    }

    public final void Z2(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2 function2, KeyboardOptions keyboardOptions) {
        this.N = textLayoutState;
        textLayoutState.p(function2);
        this.O = z2;
        this.N.r(transformedTextFieldState, textStyle, z2, !z2, keyboardOptions);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        TextLayoutResult l2 = this.N.l(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.i()), j2);
        Placeable c0 = measurable.c0(Constraints.f19137b.b((int) (l2.B() >> 32), (int) (l2.B() >> 32), (int) (l2.B() & 4294967295L), (int) (l2.B() & 4294967295L)));
        this.N.o(this.O ? measureScope.D(TextDelegateKt.a(l2.m(0))) : Dp.m((float) 0));
        Map map = this.P;
        if (map == null) {
            map = new LinkedHashMap(2);
        }
        map.put(AlignmentLineKt.a(), Integer.valueOf(Math.round(l2.h())));
        map.put(AlignmentLineKt.b(), Integer.valueOf(Math.round(l2.k())));
        this.P = map;
        int B2 = (int) (l2.B() >> 32);
        int B3 = (int) (l2.B() & 4294967295L);
        Map map2 = this.P;
        Intrinsics.f(map2);
        return measureScope.y0(B2, B3, map2, new TextFieldTextLayoutModifierNode$measure$1(c0));
    }
}
