package com.hansecom.abt.ui.shapes;

import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BottomBarShapeKt {
    public static final GenericShape b() {
        return new GenericShape(new a());
    }

    public static final Unit c(Path path, Size size, LayoutDirection layoutDirection) {
        Intrinsics.i(path, "$this$GenericShape");
        Intrinsics.i(layoutDirection, "<unused var>");
        path.q(0.0f, 0.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (size.m() >> 32)) / 5.0f;
        float f2 = ((float) 2) * intBitsToFloat;
        path.z(f2, 0.0f);
        path.w(new Rect(f2, (-intBitsToFloat) / 2.0f, ((float) 3) * intBitsToFloat, intBitsToFloat / 2.0f), 180.0f, -180.0f, false);
        path.z(Float.intBitsToFloat((int) (size.m() >> 32)), 0.0f);
        path.z(Float.intBitsToFloat((int) (size.m() >> 32)), Float.intBitsToFloat((int) (size.m() & 4294967295L)));
        path.z(0.0f, Float.intBitsToFloat((int) (size.m() & 4294967295L)));
        path.z(0.0f, 0.0f);
        path.close();
        return Unit.f40552a;
    }
}
