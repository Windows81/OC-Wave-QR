package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;

public class ShareActionProvider extends ActionProvider {

    /* renamed from: d  reason: collision with root package name */
    public int f1287d;

    /* renamed from: e  reason: collision with root package name */
    public final ShareMenuItemOnMenuItemClickListener f1288e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1289f;

    /* renamed from: g  reason: collision with root package name */
    public String f1290g;

    /* renamed from: h  reason: collision with root package name */
    public OnShareTargetSelectedListener f1291h;

    public interface OnShareTargetSelectedListener {
        boolean a(ShareActionProvider shareActionProvider, Intent intent);
    }

    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareActionProvider f1292a;

        public boolean a(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = this.f1292a;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.f1291h;
            if (onShareTargetSelectedListener == null) {
                return false;
            }
            onShareTargetSelectedListener.a(shareActionProvider, intent);
            return false;
        }
    }

    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareActionProvider f1293a;

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = this.f1293a;
            Intent b2 = ActivityChooserModel.d(shareActionProvider.f1289f, shareActionProvider.f1290g).b(menuItem.getItemId());
            if (b2 == null) {
                return true;
            }
            String action = b2.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                this.f1293a.l(b2);
            }
            this.f1293a.f1289f.startActivity(b2);
            return true;
        }
    }

    public boolean a() {
        return true;
    }

    public View c() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1289f);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.d(this.f1289f, this.f1290g));
        }
        TypedValue typedValue = new TypedValue();
        this.f1289f.getTheme().resolveAttribute(R.attr.f304j, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.b(this.f1289f, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.f440r);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.f439q);
        return activityChooserView;
    }

    public void f(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel d2 = ActivityChooserModel.d(this.f1289f, this.f1290g);
        PackageManager packageManager = this.f1289f.getPackageManager();
        int f2 = d2.f();
        int min = Math.min(f2, this.f1287d);
        for (int i2 = 0; i2 < min; i2++) {
            ResolveInfo e2 = d2.e(i2);
            subMenu.add(0, i2, i2, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1288e);
        }
        if (min < f2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1289f.getString(R.string.f424b));
            for (int i3 = 0; i3 < f2; i3++) {
                ResolveInfo e3 = d2.e(i3);
                addSubMenu.add(0, i3, i3, e3.loadLabel(packageManager)).setIcon(e3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1288e);
            }
        }
    }

    public void l(Intent intent) {
        intent.addFlags(134742016);
    }
}
