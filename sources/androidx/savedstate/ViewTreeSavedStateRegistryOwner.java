package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner a(View view) {
        Intrinsics.i(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.f22817a);
            SavedStateRegistryOwner savedStateRegistryOwner = tag instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) tag : null;
            if (savedStateRegistryOwner != null) {
                return savedStateRegistryOwner;
            }
            ViewParent a2 = ViewTree.a(view);
            view = a2 instanceof View ? (View) a2 : null;
        }
        return null;
    }

    public static final void b(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.i(view, "<this>");
        view.setTag(R.id.f22817a, savedStateRegistryOwner);
    }
}
