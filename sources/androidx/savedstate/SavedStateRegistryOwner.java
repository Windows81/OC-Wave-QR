package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@Metadata
public interface SavedStateRegistryOwner extends LifecycleOwner {
    SavedStateRegistry v();
}
