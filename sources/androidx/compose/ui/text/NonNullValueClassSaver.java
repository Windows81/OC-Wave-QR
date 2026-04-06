package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;

@Metadata
interface NonNullValueClassSaver<Original, Saveable> extends Saver<Original, Saveable> {
}
