package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {

    /* renamed from: z  reason: collision with root package name */
    public static final ColorVectorConverterKt$ColorToVector$1 f2182z = new ColorVectorConverterKt$ColorToVector$1();

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    /* renamed from: b */
    public final TwoWayConverter invoke(final ColorSpace colorSpace) {
        return VectorConvertersKt.a(AnonymousClass1.f2183z, new Function1<AnimationVector4D, Color>() {
            public final long b(AnimationVector4D animationVector4D) {
                float g2 = animationVector4D.g();
                float f2 = 0.0f;
                if (g2 < 0.0f) {
                    g2 = 0.0f;
                }
                float f3 = 1.0f;
                if (g2 > 1.0f) {
                    g2 = 1.0f;
                }
                float h2 = animationVector4D.h();
                float f4 = -0.5f;
                if (h2 < -0.5f) {
                    h2 = -0.5f;
                }
                float f5 = 0.5f;
                if (h2 > 0.5f) {
                    h2 = 0.5f;
                }
                float i2 = animationVector4D.i();
                if (i2 >= -0.5f) {
                    f4 = i2;
                }
                if (f4 <= 0.5f) {
                    f5 = f4;
                }
                float f6 = animationVector4D.f();
                if (f6 >= 0.0f) {
                    f2 = f6;
                }
                if (f2 <= 1.0f) {
                    f3 = f2;
                }
                return Color.j(ColorKt.a(g2, h2, f5, f3, ColorSpaces.f16176a.D()), colorSpace);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Color.h(b((AnimationVector4D) obj));
            }
        });
    }
}
