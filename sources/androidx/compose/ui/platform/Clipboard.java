package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Clipboard {
    Object a(Continuation continuation);

    Object b(ClipEntry clipEntry, Continuation continuation);
}
