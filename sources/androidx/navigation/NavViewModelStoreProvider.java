package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;

@Metadata
public interface NavViewModelStoreProvider {
    ViewModelStore a(String str);
}
