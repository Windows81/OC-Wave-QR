package androidx.compose.material3.internal;

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
    public static final Icons f12251a = new Icons();

    @Metadata
    public static final class AutoMirrored {

        /* renamed from: a  reason: collision with root package name */
        public static final AutoMirrored f12252a = new AutoMirrored();

        @Metadata
        public static final class Filled {

            /* renamed from: a  reason: collision with root package name */
            public static final Filled f12253a = new Filled();

            /* renamed from: b  reason: collision with root package name */
            public static ImageVector f12254b;

            /* renamed from: c  reason: collision with root package name */
            public static ImageVector f12255c;

            /* renamed from: d  reason: collision with root package name */
            public static final int f12256d = 8;

            public final ImageVector a() {
                ImageVector imageVector = f12254b;
                if (imageVector != null) {
                    Intrinsics.f(imageVector);
                    return imageVector;
                }
                ImageVector.Builder builder = r1;
                ImageVector.Builder builder2 = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowLeft", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, true, 96, (DefaultConstructorMarker) null);
                int a2 = VectorKt.a();
                SolidColor solidColor = r0;
                SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
                int a3 = StrokeCap.f16130b.a();
                int a4 = StrokeJoin.f16135b.a();
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(15.41f, 16.59f);
                pathBuilder.g(10.83f, 12.0f);
                pathBuilder.h(4.58f, -4.59f);
                pathBuilder.g(14.0f, 6.0f);
                pathBuilder.h(-6.0f, 6.0f);
                pathBuilder.h(6.0f, 6.0f);
                pathBuilder.h(1.41f, -1.41f);
                pathBuilder.a();
                ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
                f12254b = f2;
                Intrinsics.f(f2);
                return f2;
            }

            public final ImageVector b() {
                ImageVector imageVector = f12255c;
                if (imageVector != null) {
                    Intrinsics.f(imageVector);
                    return imageVector;
                }
                ImageVector.Builder builder = r1;
                ImageVector.Builder builder2 = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, true, 96, (DefaultConstructorMarker) null);
                int a2 = VectorKt.a();
                SolidColor solidColor = r0;
                SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
                int a3 = StrokeCap.f16130b.a();
                int a4 = StrokeJoin.f16135b.a();
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.i(8.59f, 16.59f);
                pathBuilder.g(13.17f, 12.0f);
                pathBuilder.g(8.59f, 7.41f);
                pathBuilder.g(10.0f, 6.0f);
                pathBuilder.h(6.0f, 6.0f);
                pathBuilder.h(-6.0f, 6.0f);
                pathBuilder.h(-1.41f, -1.41f);
                pathBuilder.a();
                ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
                f12255c = f2;
                Intrinsics.f(f2);
                return f2;
            }
        }
    }

    @Metadata
    public static final class Filled {

        /* renamed from: a  reason: collision with root package name */
        public static final Filled f12257a = new Filled();

        /* renamed from: b  reason: collision with root package name */
        public static ImageVector f12258b;

        /* renamed from: c  reason: collision with root package name */
        public static ImageVector f12259c;

        /* renamed from: d  reason: collision with root package name */
        public static ImageVector f12260d;

        /* renamed from: e  reason: collision with root package name */
        public static ImageVector f12261e;

        /* renamed from: f  reason: collision with root package name */
        public static ImageVector f12262f;

        /* renamed from: g  reason: collision with root package name */
        public static final int f12263g = 8;

        public final ImageVector a() {
            ImageVector imageVector = f12262f;
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
            f12262f = f2;
            Intrinsics.f(f2);
            return f2;
        }

        public final ImageVector b() {
            ImageVector imageVector = f12259c;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Check", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(9.0f, 16.17f);
            pathBuilder.g(4.83f, 12.0f);
            pathBuilder.h(-1.42f, 1.41f);
            pathBuilder.g(9.0f, 19.0f);
            pathBuilder.g(21.0f, 7.0f);
            pathBuilder.h(-1.41f, -1.41f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f12259c = f2;
            Intrinsics.f(f2);
            return f2;
        }

        public final ImageVector c() {
            ImageVector imageVector = f12258b;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Close", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
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
            f12258b = f2;
            Intrinsics.f(f2);
            return f2;
        }

        public final ImageVector d() {
            ImageVector imageVector = f12261e;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.DateRange", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(9.0f, 11.0f);
            pathBuilder.g(7.0f, 11.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(-2.0f);
            pathBuilder.a();
            pathBuilder.i(13.0f, 11.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(-2.0f);
            pathBuilder.a();
            pathBuilder.i(17.0f, 11.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(-2.0f);
            pathBuilder.a();
            pathBuilder.i(19.0f, 4.0f);
            pathBuilder.f(-1.0f);
            pathBuilder.g(18.0f, 2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(8.0f, 4.0f);
            pathBuilder.g(8.0f, 2.0f);
            pathBuilder.g(6.0f, 2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(5.0f, 4.0f);
            pathBuilder.c(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.g(3.0f, 20.0f);
            PathBuilder pathBuilder2 = pathBuilder;
            pathBuilder2.c(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
            pathBuilder.f(14.0f);
            pathBuilder2.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.g(21.0f, 6.0f);
            pathBuilder.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.a();
            pathBuilder.i(19.0f, 20.0f);
            pathBuilder.g(5.0f, 20.0f);
            pathBuilder.g(5.0f, 9.0f);
            pathBuilder.f(14.0f);
            pathBuilder.n(11.0f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f12261e = f2;
            Intrinsics.f(f2);
            return f2;
        }

        public final ImageVector e() {
            ImageVector imageVector = f12260d;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Filled.Edit", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(3.0f, 17.25f);
            pathBuilder.m(21.0f);
            pathBuilder.f(3.75f);
            pathBuilder.g(17.81f, 9.94f);
            pathBuilder.h(-3.75f, -3.75f);
            pathBuilder.g(3.0f, 17.25f);
            pathBuilder.a();
            pathBuilder.i(20.71f, 7.04f);
            pathBuilder.c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            pathBuilder.h(-2.34f, -2.34f);
            pathBuilder.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
            pathBuilder.h(-1.83f, 1.83f);
            pathBuilder.h(3.75f, 3.75f);
            pathBuilder.h(1.83f, -1.83f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f12260d = f2;
            Intrinsics.f(f2);
            return f2;
        }
    }

    @Metadata
    public static final class Outlined {

        /* renamed from: a  reason: collision with root package name */
        public static final Outlined f12264a = new Outlined();

        /* renamed from: b  reason: collision with root package name */
        public static ImageVector f12265b;

        /* renamed from: c  reason: collision with root package name */
        public static ImageVector f12266c;

        /* renamed from: d  reason: collision with root package name */
        public static final int f12267d = 8;

        public final ImageVector a() {
            ImageVector imageVector = f12266c;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Keyboard", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(20.0f, 7.0f);
            pathBuilder.n(10.0f);
            pathBuilder.g(4.0f, 17.0f);
            pathBuilder.g(4.0f, 7.0f);
            pathBuilder.f(16.0f);
            pathBuilder.j(0.0f, -2.0f);
            pathBuilder.g(4.0f, 5.0f);
            PathBuilder pathBuilder2 = pathBuilder;
            pathBuilder2.c(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.g(2.0f, 17.0f);
            pathBuilder2.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.f(16.0f);
            pathBuilder2.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.g(22.0f, 7.0f);
            pathBuilder.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.a();
            pathBuilder.i(11.0f, 8.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            pathBuilder.i(11.0f, 11.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            pathBuilder.i(8.0f, 8.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(8.0f, 10.0f);
            pathBuilder.a();
            pathBuilder.i(8.0f, 11.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(8.0f, 13.0f);
            pathBuilder.a();
            pathBuilder.i(5.0f, 11.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(5.0f, 13.0f);
            pathBuilder.a();
            pathBuilder.i(5.0f, 8.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(5.0f, 10.0f);
            pathBuilder.a();
            pathBuilder.i(8.0f, 14.0f);
            pathBuilder.f(8.0f);
            pathBuilder.n(2.0f);
            pathBuilder.g(8.0f, 16.0f);
            pathBuilder.a();
            pathBuilder.i(14.0f, 11.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            pathBuilder.i(14.0f, 8.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            pathBuilder.i(17.0f, 11.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            pathBuilder.i(17.0f, 8.0f);
            pathBuilder.f(2.0f);
            pathBuilder.n(2.0f);
            pathBuilder.f(-2.0f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f12266c = f2;
            Intrinsics.f(f2);
            return f2;
        }

        public final ImageVector b() {
            ImageVector imageVector = f12265b;
            if (imageVector != null) {
                Intrinsics.f(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = r1;
            ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Schedule", Dp.m(24.0f), Dp.m(24.0f), 24.0f, 24.0f, 0, 0, false, 224, (DefaultConstructorMarker) null);
            int a2 = VectorKt.a();
            SolidColor solidColor = r0;
            SolidColor solidColor2 = new SolidColor(Color.f15975b.a(), (DefaultConstructorMarker) null);
            int a3 = StrokeCap.f16130b.a();
            int a4 = StrokeJoin.f16135b.a();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.i(11.99f, 2.0f);
            pathBuilder.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            pathBuilder.l(4.47f, 10.0f, 9.99f, 10.0f);
            pathBuilder.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            pathBuilder.k(17.52f, 2.0f, 11.99f, 2.0f);
            pathBuilder.a();
            pathBuilder.i(12.0f, 20.0f);
            pathBuilder.c(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            pathBuilder.l(3.58f, -8.0f, 8.0f, -8.0f);
            pathBuilder.l(8.0f, 3.58f, 8.0f, 8.0f);
            pathBuilder.l(-3.58f, 8.0f, -8.0f, 8.0f);
            pathBuilder.a();
            pathBuilder.i(12.5f, 7.0f);
            pathBuilder.g(11.0f, 7.0f);
            pathBuilder.n(6.0f);
            pathBuilder.h(5.25f, 3.15f);
            pathBuilder.h(0.75f, -1.23f);
            pathBuilder.h(-4.5f, -2.67f);
            pathBuilder.a();
            ImageVector f2 = ImageVector.Builder.d(builder, pathBuilder.d(), a2, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, a3, a4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).f();
            f12265b = f2;
            Intrinsics.f(f2);
            return f2;
        }
    }
}
