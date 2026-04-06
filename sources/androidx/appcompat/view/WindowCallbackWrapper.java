package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class WindowCallbackWrapper implements Window.Callback {

    /* renamed from: z  reason: collision with root package name */
    public final Window.Callback f837z;

    public static class Api23Impl {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i2) {
            return callback.onWindowStartingActionMode(callback2, i2);
        }
    }

    public static class Api24Impl {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            callback.onProvideKeyboardShortcuts(list, menu, i2);
        }
    }

    public static class Api26Impl {
        public static void a(Window.Callback callback, boolean z2) {
            callback.onPointerCaptureChanged(z2);
        }
    }

    public WindowCallbackWrapper(Window.Callback callback) {
        if (callback != null) {
            this.f837z = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f837z;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f837z.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f837z.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f837z.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f837z.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f837z.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f837z.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f837z.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f837z.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f837z.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f837z.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f837z.onCreatePanelMenu(i2, menu);
    }

    public View onCreatePanelView(int i2) {
        return this.f837z.onCreatePanelView(i2);
    }

    public void onDetachedFromWindow() {
        this.f837z.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f837z.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f837z.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.f837z.onPanelClosed(i2, menu);
    }

    public void onPointerCaptureChanged(boolean z2) {
        Api26Impl.a(this.f837z, z2);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f837z.onPreparePanel(i2, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        Api24Impl.a(this.f837z, list, menu, i2);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return Api23Impl.a(this.f837z, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f837z.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z2) {
        this.f837z.onWindowFocusChanged(z2);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f837z.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f837z.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return Api23Impl.b(this.f837z, callback, i2);
    }
}
