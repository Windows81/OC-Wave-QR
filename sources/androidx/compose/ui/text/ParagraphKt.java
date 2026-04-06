package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class ParagraphKt {
    public static final Paragraph a(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, List list2, int i2, int i3) {
        return AndroidParagraph_androidKt.b(str, textStyle, list, list2, i2, i3, j2, density, resolver);
    }

    public static /* synthetic */ Paragraph b(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, List list2, int i2, int i3, int i4, Object obj) {
        int i5 = i4;
        return a(str, textStyle, j2, density, resolver, (i5 & 32) != 0 ? CollectionsKt.m() : list, (i5 & 64) != 0 ? CollectionsKt.m() : list2, (i5 & 128) != 0 ? Integer.MAX_VALUE : i2, (i5 & 256) != 0 ? TextOverflow.f19125b.a() : i3);
    }

    public static final Paragraph c(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, int i3) {
        return AndroidParagraph_androidKt.a(paragraphIntrinsics, i2, i3, j2);
    }

    public static final int d(float f2) {
        return (int) ((float) Math.ceil((double) f2));
    }
}
