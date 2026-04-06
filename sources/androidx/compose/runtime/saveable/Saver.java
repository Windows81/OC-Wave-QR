package androidx.compose.runtime.saveable;

import kotlin.Metadata;

@Metadata
public interface Saver<Original, Saveable> {
    Object a(Object obj);

    Object b(SaverScope saverScope, Object obj);
}
