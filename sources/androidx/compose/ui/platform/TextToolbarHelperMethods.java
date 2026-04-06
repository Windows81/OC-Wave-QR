package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

@Metadata
public final class TextToolbarHelperMethods {

    /* renamed from: a  reason: collision with root package name */
    public static final TextToolbarHelperMethods f17881a = new TextToolbarHelperMethods();

    public final ActionMode a(View view, ActionMode.Callback callback, int i2) {
        return view.startActionMode(callback, i2);
    }
}
