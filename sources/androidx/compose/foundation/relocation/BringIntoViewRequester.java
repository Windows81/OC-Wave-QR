package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface BringIntoViewRequester {
    Object a(Rect rect, Continuation continuation);
}
