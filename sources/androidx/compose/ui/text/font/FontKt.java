package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FontKt {
    public static final Font a(int i2, FontWeight fontWeight, int i3, int i4) {
        return new ResourceFont(i2, fontWeight, i3, new FontVariation.Settings(new FontVariation.Setting[0]), i4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Font b(int i2, FontWeight fontWeight, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.f18746A.g();
        }
        if ((i5 & 4) != 0) {
            i3 = FontStyle.f18724b.b();
        }
        if ((i5 & 8) != 0) {
            i4 = FontLoadingStrategy.f18719b.b();
        }
        return a(i2, fontWeight, i3, i4);
    }

    public static final FontFamily c(Font font) {
        return FontFamilyKt.b(font);
    }
}
