package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidTextStyle_androidKt {
    public static final PlatformTextStyle a(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f2) {
        return platformParagraphStyle.c() == platformParagraphStyle2.c() ? platformParagraphStyle : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.d(EmojiSupportMatch.d(platformParagraphStyle.b()), EmojiSupportMatch.d(platformParagraphStyle2.b()), f2)).j(), ((Boolean) SpanStyleKt.d(Boolean.valueOf(platformParagraphStyle.c()), Boolean.valueOf(platformParagraphStyle2.c()), f2)).booleanValue(), (DefaultConstructorMarker) null);
    }

    public static final PlatformSpanStyle c(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f2) {
        return platformSpanStyle;
    }
}
