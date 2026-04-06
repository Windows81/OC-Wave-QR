package androidx.compose.material.icons.filled;

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
public final class CloseKt {

    /* renamed from: a  reason: collision with root package name */
    public static ImageVector f8959a;

    public static final ImageVector a(Icons.Filled filled) {
        ImageVector imageVector = f8959a;
        if (imageVector != null) {
            Intrinsics.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Close", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 96, (DefaultConstructorMarker) null);
        int a2 = VectorKt.a();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
        int a3 = StrokeCap.f16130b.a();
        int a4 = StrokeJoin.f16135b.a();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.i(19.0f, 6.41f);
        pathBuilder.g(17.59f, 5.0f);
        pathBuilder.g(12.0f, 10.59f);
        pathBuilder.g(6.41f, 5.0f);
        pathBuilder.g(5.0f, 6.41f);
        pathBuilder.g(10.59f, 12.0f);
        pathBuilder.g(5.0f, 17.59f);
        pathBuilder.g(6.41f, 19.0f);
        pathBuilder.g(12.0f, 13.41f);
        pathBuilder.g(17.59f, 19.0f);
        pathBuilder.g(19.0f, 17.59f);
        pathBuilder.g(13.41f, 12.0f);
        pathBuilder.a();
        ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
        f8959a = f2;
        Intrinsics.f(f2);
        return f2;
    }
}
