package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class CarouselKt {
    public static final float e(CarouselState carouselState, Strategy strategy) {
        float d2 = strategy.d() + strategy.e();
        return ((((float) carouselState.m().v()) * d2) + (carouselState.m().w() * d2)) - ((float) KeylineSnapPositionKt.a(strategy, carouselState.m().v(), carouselState.m().H()));
    }

    public static final float f(CarouselState carouselState, Strategy strategy) {
        float H = (float) carouselState.m().H();
        return RangesKt.d(((strategy.d() * H) + (strategy.e() * (H - ((float) 1)))) - strategy.a(), 0.0f);
    }

    public static final Modifier g(Modifier modifier, int i2, CarouselState carouselState, Function0 function0, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape) {
        return LayoutModifierKt.a(modifier, new a(function0, carouselState, i2, carouselItemDrawInfoImpl, shape));
    }

    public static final MeasureResult h(Function0 function0, CarouselState carouselState, int i2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int i3 = i2;
        Strategy strategy = (Strategy) function0.invoke();
        if (!strategy.i()) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, new b(), 4, (Object) null);
        }
        boolean z2 = carouselState.m().C().e() == Orientation.Vertical;
        boolean z3 = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        float d2 = strategy.d();
        Placeable c0 = measurable.c0(z2 ? Constraints.c(constraints.r(), Constraints.n(constraints.r()), Constraints.l(constraints.r()), MathKt.d(d2), MathKt.d(d2)) : Constraints.c(constraints.r(), MathKt.d(d2), MathKt.d(d2), Constraints.m(constraints.r()), Constraints.k(constraints.r())));
        float f2 = 1.0f;
        if (i3 != carouselState.m().v()) {
            f2 = i3 == 0 ? 0.0f : 1.0f / ((float) i3);
        }
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new c(c0, f2, carouselState, strategy, i2, z2, carouselItemDrawInfoImpl, shape, z3), 4, (Object) null);
    }

    public static final Unit i(Placeable.PlacementScope placementScope) {
        return Unit.f40552a;
    }

    public static final Unit j(Placeable placeable, float f2, CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z3, Placeable.PlacementScope placementScope) {
        placementScope.w(placeable, 0, 0, f2, new d(carouselState, strategy, i2, z2, carouselItemDrawInfoImpl, shape, z3));
        return Unit.f40552a;
    }

    public static final Unit k(CarouselState carouselState, Strategy strategy, int i2, boolean z2, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape, boolean z3, GraphicsLayerScope graphicsLayerScope) {
        CarouselItemDrawInfoImpl carouselItemDrawInfoImpl2 = carouselItemDrawInfoImpl;
        GraphicsLayerScope graphicsLayerScope2 = graphicsLayerScope;
        float e2 = e(carouselState, strategy);
        float f2 = f(carouselState, strategy);
        KeylineList g2 = Strategy.g(strategy, e2, f2, false, 4, (Object) null);
        KeylineList f3 = strategy.f(e2, f2, true);
        float d2 = ((((float) i2) * (strategy.d() + strategy.e())) + (strategy.d() / 2.0f)) - e2;
        Keyline u2 = g2.u(d2);
        Keyline s2 = g2.s(d2);
        Keyline c2 = KeylineListKt.c(u2, s2, l(u2, s2, d2));
        boolean d3 = Intrinsics.d(u2, s2);
        float intBitsToFloat = (z2 ? Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L)) : strategy.d()) / 2.0f;
        float d4 = (z2 ? strategy.d() : Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L))) / 2.0f;
        float intBitsToFloat2 = (z2 ? Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32)) : c2.e()) / 2.0f;
        float e3 = (z2 ? c2.e() : Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L))) / 2.0f;
        Rect rect = new Rect(intBitsToFloat - intBitsToFloat2, d4 - e3, intBitsToFloat + intBitsToFloat2, d4 + e3);
        carouselItemDrawInfoImpl2.f(c2.e());
        Iterator it = f3.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float e4 = ((Keyline) next).e();
                while (true) {
                    Object next2 = it.next();
                    float e5 = ((Keyline) next2).e();
                    if (Float.compare(e4, e5) > 0) {
                        next = next2;
                        e4 = e5;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    Shape shape2 = shape;
                }
            }
            carouselItemDrawInfoImpl2.e(((Keyline) next).e());
            carouselItemDrawInfoImpl2.d(f3.m().e());
            carouselItemDrawInfoImpl2.c(rect);
            graphicsLayerScope2.R(!Intrinsics.d(rect, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32)), Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L)))));
            graphicsLayerScope2.s1(shape);
            float d5 = c2.d() - d2;
            if (d3) {
                d5 += (d2 - c2.f()) / c2.e();
            }
            if (z2) {
                graphicsLayerScope2.h(d5);
            } else {
                if (z3) {
                    d5 = -d5;
                }
                graphicsLayerScope2.l(d5);
            }
            return Unit.f40552a;
        }
        throw new NoSuchElementException();
    }

    public static final float l(Keyline keyline, Keyline keyline2, float f2) {
        if (Intrinsics.d(keyline, keyline2)) {
            return 1.0f;
        }
        return (f2 - keyline.f()) / (keyline2.f() - keyline.f());
    }
}
