package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

@Metadata
public final class TextFieldDelegateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5904a = StringsKt.G("H", 10);

    public static final long a(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i2) {
        String str2 = str;
        TextStyle textStyle2 = textStyle;
        Paragraph b2 = ParagraphKt.b(str2, textStyle2, ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null), density, resolver, CollectionsKt.m(), (List) null, i2, TextOverflow.f19125b.a(), 64, (Object) null);
        return IntSize.c((((long) TextDelegateKt.a(b2.c())) << 32) | (((long) TextDelegateKt.a(b2.a())) & 4294967295L));
    }

    public static /* synthetic */ long b(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            str = f5904a;
        }
        if ((i3 & 16) != 0) {
            i2 = 1;
        }
        return a(textStyle, density, resolver, str, i2);
    }

    public static final String c() {
        return f5904a;
    }
}
