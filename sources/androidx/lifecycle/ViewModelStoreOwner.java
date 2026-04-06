package androidx.lifecycle;

import kotlin.Metadata;

@Metadata
public interface ViewModelStoreOwner {
    ViewModelStore s();
}
