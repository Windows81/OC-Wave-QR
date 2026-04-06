package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.Metadata;

@Metadata
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final TextActionModeCallback f17963a;

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f17963a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f17963a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f17963a.f();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f17963a.g(actionMode, menu);
    }
}
