package androidx.compose.material.icons.automirrored.outlined;

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
public final class ArrowBackKt {

    /* renamed from: a  reason: collision with root package name */
    public static ImageVector f8958a;

    public static final ImageVector a(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = f8958a;
        if (imageVector != null) {
            Intrinsics.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("AutoMirrored.Outlined.ArrowBack", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, true, 96, (DefaultConstructorMarker) null);
        int a2 = VectorKt.a();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
        int a3 = StrokeCap.f16130b.a();
        int a4 = StrokeJoin.f16135b.a();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(20.0f, 11.0f);
        pathBuilder.e(7.83f);
        pathBuilder.h(5.59f, -5.59f);
        pathBuilder.g(12.0f, 4.0f);
        pathBuilder.h(-8.0f, 8.0f);
        pathBuilder.h(8.0f, 8.0f);
        pathBuilder.h(1.41f, -1.41f);
        pathBuilder.g(7.83f, 13.0f);
        pathBuilder.e(20.0f);
        pathBuilder.n(-2.0f);
        pathBuilder.a();
        ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f8958a = f2;
        Intrinsics.f(f2);
        return f2;
    }
}
