package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface PlatformFontLoader {
    Object a();

    Object b(Font font);

    Object c(Font font, Continuation continuation);
}
