package androidx.compose.material.internal;

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
public final class Icons {

    /* renamed from: a  reason: collision with root package name */
    public static final Icons f8992a = new Icons();

    @Metadata
    public static final class Filled {

        /* renamed from: a  reason: collision with root package name */
        public static final Filled f8993a = new Filled();

        /* renamed from: b  reason: collision with root package name */
        public static ImageVector f8994b;

        /* renamed from: c  reason: collision with root package name */
        public static final int f8995c = 8;

        public final ImageVector a() {
            ImageVector imageVector = f8994b;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.ArrowDropDown", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(7.0f, 10.0f);
            pathBuilder.h(5.0f, 5.0f);
            pathBuilder.h(5.0f, -5.0f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f8994b = f2;
            Intrinsics.f(f2);
            return f2;
        }
    }
}
