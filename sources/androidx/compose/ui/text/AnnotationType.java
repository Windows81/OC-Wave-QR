package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
enum AnnotationType {
    Paragraph,
    Span,
    VerbatimTts,
    Url,
    Link,
    Clickable,
    String;

    static {
        AnnotationType[] d2;
        H = EnumEntriesKt.a(d2);
    }
}
