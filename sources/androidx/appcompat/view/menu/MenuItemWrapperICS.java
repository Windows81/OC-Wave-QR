package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final SupportMenuItem f948d;

    /* renamed from: e  reason: collision with root package name */
    public Method f949e;

    public class ActionProviderWrapper extends ActionProvider {

        /* renamed from: d  reason: collision with root package name */
        public final android.view.ActionProvider f950d;

        public ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f950d = actionProvider;
        }

        public boolean a() {
            return this.f950d.hasSubMenu();
        }

        public View c() {
            return this.f950d.onCreateActionView();
        }

        public boolean e() {
            return this.f950d.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f950d.onPrepareSubMenu(MenuItemWrapperICS.this.d(subMenu));
        }
    }

    public class ActionProviderWrapperJB extends ActionProviderWrapper implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        public ActionProvider.VisibilityListener f952f;

        public ActionProviderWrapperJB(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f950d.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f950d.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f950d.overridesItemVisibility();
        }

        public void j(ActionProvider.VisibilityListener visibilityListener) {
            this.f952f = visibilityListener;
            this.f950d.setVisibilityListener(visibilityListener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z2) {
            ActionProvider.VisibilityListener visibilityListener = this.f952f;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    public static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {

        /* renamed from: z  reason: collision with root package name */
        public final android.view.CollapsibleActionView f954z;

        public CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f954z = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f954z;
        }

        public void c() {
            this.f954z.onActionViewExpanded();
        }

        public void d() {
            this.f954z.onActionViewCollapsed();
        }
    }

    public class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f955a;

        public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f955a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f955a.onMenuItemActionCollapse(MenuItemWrapperICS.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f955a.onMenuItemActionExpand(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f957a;

        public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f957a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f957a.onMenuItemClick(MenuItemWrapperICS.this.c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.f948d = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f948d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f948d.expandActionView();
    }

    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider b2 = this.f948d.b();
        if (b2 instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) b2).f950d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f948d.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f948d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f948d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f948d.getContentDescription();
    }

    public int getGroupId() {
        return this.f948d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f948d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f948d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f948d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f948d.getIntent();
    }

    public int getItemId() {
        return this.f948d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f948d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f948d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f948d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f948d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f948d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f948d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f948d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f948d.getTooltipText();
    }

    public void h(boolean z2) {
        try {
            if (this.f949e == null) {
                this.f949e = this.f948d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f949e.invoke(this.f948d, new Object[]{Boolean.valueOf(z2)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean hasSubMenu() {
        return this.f948d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f948d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f948d.isCheckable();
    }

    public boolean isChecked() {
        return this.f948d.isChecked();
    }

    public boolean isEnabled() {
        return this.f948d.isEnabled();
    }

    public boolean isVisible() {
        return this.f948d.isVisible();
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapperJB actionProviderWrapperJB = new ActionProviderWrapperJB(this.f861a, actionProvider);
        SupportMenuItem supportMenuItem = this.f948d;
        if (actionProvider == null) {
            actionProviderWrapperJB = null;
        }
        supportMenuItem.a(actionProviderWrapperJB);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f948d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f948d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f948d.setCheckable(z2);
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.f948d.setChecked(z2);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f948d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f948d.setEnabled(z2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f948d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f948d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f948d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f948d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f948d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f948d.setOnActionExpandListener(onActionExpandListener != null ? new OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f948d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f948d.setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f948d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f948d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f948d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f948d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f948d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        return this.f948d.setVisible(z2);
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f948d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f948d.setIcon(i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f948d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f948d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f948d.setTitle(i2);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f948d.setActionView(i2);
        View actionView = this.f948d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f948d.setActionView((View) new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
