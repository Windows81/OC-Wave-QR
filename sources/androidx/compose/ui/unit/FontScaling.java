package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;

@Metadata
public interface FontScaling {

    @Metadata
    public static final class DefaultImpls {
    }

    long r(float f2) {
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.f19189a;
        if (!fontScaleConverterFactory.f(u1())) {
            return TextUnitKt.h(f2 / u1());
        }
        FontScaleConverter b2 = fontScaleConverterFactory.b(u1());
        return TextUnitKt.h(b2 != null ? b2.a(f2) : f2 / u1());
    }

    float u1();

    float v(long j2) {
        if (!TextUnitType.g(TextUnit.g(j2), TextUnitType.f19181b.b())) {
            InlineClassHelperKt.b("Only Sp can convert to Px");
        }
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.f19189a;
        if (!fontScaleConverterFactory.f(u1())) {
            return Dp.m(TextUnit.h(j2) * u1());
        }
        FontScaleConverter b2 = fontScaleConverterFactory.b(u1());
        float h2 = TextUnit.h(j2);
        return Dp.m(b2 == null ? h2 * u1() : b2.b(h2));
    }
}
