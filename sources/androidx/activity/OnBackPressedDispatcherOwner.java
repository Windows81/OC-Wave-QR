package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

@Metadata
public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    OnBackPressedDispatcher c();
}
