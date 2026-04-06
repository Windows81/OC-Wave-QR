package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {

    /* renamed from: z  reason: collision with root package name */
    public final ActionBar.OnNavigationListener f634z;

    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        ActionBar.OnNavigationListener onNavigationListener = this.f634z;
        if (onNavigationListener != null) {
            onNavigationListener.a(i2, j2);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
