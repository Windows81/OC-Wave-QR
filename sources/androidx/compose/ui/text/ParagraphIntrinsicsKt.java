package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class ParagraphIntrinsicsKt {
    public static final ParagraphIntrinsics a(String str, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver, List list2) {
        return AndroidParagraphIntrinsics_androidKt.a(str, textStyle, list, list2, density, resolver);
    }
}
