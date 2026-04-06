package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;

@Metadata
public interface HasDefaultViewModelProviderFactory {
    ViewModelProvider.Factory m();

    CreationExtras n() {
        return CreationExtras.Empty.f22064c;
    }
}
