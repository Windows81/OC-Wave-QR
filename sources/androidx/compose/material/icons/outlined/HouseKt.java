package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HouseKt {

    /* renamed from: a  reason: collision with root package name */
    public static ImageVector f8961a;

    public static final ImageVector a(Icons.Outlined outlined) {
        ImageVector imageVector = f8961a;
        if (imageVector != null) {
            Intrinsics.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("Outlined.House", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a2 = VectorKt.a();
        SolidColor solidColor = r0;
        Color.Companion companion = Color.f15975b;
        SolidColor solidColor2 = new SolidColor(companion.a(), (DefaultConstructorMarker) null);
        StrokeCap.Companion companion2 = StrokeCap.f16130b;
        int a3 = companion2.a();
        StrokeJoin.Companion companion3 = StrokeJoin.f16135b;
        int a4 = companion3.a();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(19.0f, 9.3f);
        pathBuilder.m(4.0f);
        pathBuilder.f(-3.0f);
        pathBuilder.n(2.6f);
        pathBuilder.g(12.0f, 3.0f);
        pathBuilder.g(2.0f, 12.0f);
        pathBuilder.f(3.0f);
        pathBuilder.n(8.0f);
        pathBuilder.f(6.0f);
        pathBuilder.n(-6.0f);
        pathBuilder.f(2.0f);
        pathBuilder.n(6.0f);
        pathBuilder.f(6.0f);
        pathBuilder.n(-8.0f);
        pathBuilder.f(3.0f);
        pathBuilder.g(19.0f, 9.3f);
        pathBuilder.a();
        pathBuilder.i(17.0f, 18.0f);
        pathBuilder.f(-2.0f);
        pathBuilder.n(-6.0f);
        pathBuilder.e(9.0f);
        pathBuilder.n(6.0f);
        pathBuilder.e(7.0f);
        pathBuilder.n(-7.81f);
        pathBuilder.h(5.0f, -4.5f);
        pathBuilder.h(5.0f, 4.5f);
        pathBuilder.m(18.0f);
        pathBuilder.a();
        ImageVector.Builder.d(builder2, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int a5 = VectorKt.a();
        SolidColor solidColor3 = r3;
        SolidColor solidColor4 = new SolidColor(companion.a(), (DefaultConstructorMarker) null);
        int a6 = companion2.a();
        int a7 = companion3.a();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.i(10.0f, 10.0f);
        pathBuilder2.f(4.0f);
        pathBuilder2.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.k(10.0f, 8.9f, 10.0f, 10.0f);
        pathBuilder2.a();
        ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder2.d(), a5, "", solidColor3, 1.0f, (Brush) null, 1.0f, 1.0f, a6, a7, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f8961a = f2;
        Intrinsics.f(f2);
        return f2;
    }
}
