package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public Function1 N;
    public Rect O;

    public RectListNode(Function1 function1) {
        this.N = function1;
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        Rect rect;
        if (b3() == null) {
            androidx.compose.ui.geometry.Rect b2 = LayoutCoordinatesKt.b(layoutCoordinates);
            rect = new Rect(MathKt.d(b2.o()), MathKt.d(b2.r()), MathKt.d(b2.p()), MathKt.d(b2.i()));
        } else {
            Function1 b3 = b3();
            Intrinsics.f(b3);
            rect = Z2(layoutCoordinates, (androidx.compose.ui.geometry.Rect) b3.invoke(layoutCoordinates));
        }
        d3(rect);
    }

    public void J2() {
        super.J2();
        d3((Rect) null);
    }

    public final Rect Z2(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        LayoutCoordinates d2 = LayoutCoordinatesKt.d(layoutCoordinates);
        long N2 = d2.N(layoutCoordinates2, rect.t());
        long N3 = d2.N(layoutCoordinates2, rect.u());
        long N4 = d2.N(layoutCoordinates2, rect.k());
        long N5 = d2.N(layoutCoordinates2, rect.l());
        int i2 = (int) (N2 >> 32);
        int i3 = (int) (N3 >> 32);
        int i4 = (int) (N4 >> 32);
        int i5 = i2;
        int i6 = (int) (N5 >> 32);
        int i7 = i6;
        int i8 = (int) (N2 & 4294967295L);
        int i9 = (int) (N3 & 4294967295L);
        int i10 = (int) (N4 & 4294967295L);
        int i11 = (int) (N5 & 4294967295L);
        return new Rect(MathKt.d(ComparisonsKt.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i6))), MathKt.d(ComparisonsKt.k(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), MathKt.d(ComparisonsKt.h(Float.intBitsToFloat(i5), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i7))), MathKt.d(ComparisonsKt.h(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))));
    }

    public abstract MutableVector a3();

    public Function1 b3() {
        return this.N;
    }

    public final View c3() {
        return DelegatableNode_androidKt.a(this);
    }

    public final void d3(Rect rect) {
        MutableVector a3 = a3();
        Rect rect2 = this.O;
        if (rect2 != null) {
            a3.v(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            a3.d(rect);
        }
        f3(a3);
        this.O = rect;
    }

    public void e3(Function1 function1) {
        this.N = function1;
    }

    public abstract void f3(MutableVector mutableVector);
}
