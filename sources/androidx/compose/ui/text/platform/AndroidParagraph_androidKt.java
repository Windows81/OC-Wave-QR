package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidParagraph_androidKt {
    public static final Paragraph a(ParagraphIntrinsics paragraphIntrinsics, int i2, int i3, long j2) {
        Intrinsics.g(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i2, i3, j2, (DefaultConstructorMarker) null);
    }

    public static final Paragraph b(String str, TextStyle textStyle, List list, List list2, int i2, int i3, long j2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i2, i3, j2, (DefaultConstructorMarker) null);
    }
}
