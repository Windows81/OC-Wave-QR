package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Metadata;

@Metadata
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    public final TextActionModeCallback f17958a;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.f17958a = textActionModeCallback;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f17958a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f17958a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f17958a.f();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect c2 = this.f17958a.c();
        if (rect != null) {
            rect.set((int) c2.o(), (int) c2.r(), (int) c2.p(), (int) c2.i());
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f17958a.g(actionMode, menu);
    }
}
