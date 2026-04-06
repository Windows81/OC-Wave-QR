package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.viewmodel.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner a(View view) {
        Intrinsics.i(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.f22066a);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            ViewParent a2 = ViewTree.a(view);
            view = a2 instanceof View ? (View) a2 : null;
        }
        return null;
    }

    public static final void b(View view, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.i(view, "<this>");
        view.setTag(R.id.f22066a, viewModelStoreOwner);
    }
}
