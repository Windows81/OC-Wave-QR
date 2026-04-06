package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.Typeface;
import kotlin.Metadata;

@Metadata
public interface AndroidTypeface extends Typeface {
    android.graphics.Typeface a(FontWeight fontWeight, int i2, int i3);
}
