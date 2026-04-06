package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

@Metadata
public final class TextMeasurerKt {
    public static final boolean b(int i2) {
        TextOverflow.Companion companion = TextOverflow.f19125b;
        return TextOverflow.h(i2, companion.b()) || TextOverflow.h(i2, companion.d()) || TextOverflow.h(i2, companion.c());
    }
}
