package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

public class ActionMenuItem implements SupportMenuItem {

    /* renamed from: a  reason: collision with root package name */
    public final int f838a;

    /* renamed from: b  reason: collision with root package name */
    public final int f839b;

    /* renamed from: c  reason: collision with root package name */
    public final int f840c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f841d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f842e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f843f;

    /* renamed from: g  reason: collision with root package name */
    public char f844g;

    /* renamed from: h  reason: collision with root package name */
    public int f845h = 4096;

    /* renamed from: i  reason: collision with root package name */
    public char f846i;

    /* renamed from: j  reason: collision with root package name */
    public int f847j = 4096;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f848k;

    /* renamed from: l  reason: collision with root package name */
    public Context f849l;

    /* renamed from: m  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f850m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f851n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f852o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f853p = null;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f854q = null;

    /* renamed from: r  reason: collision with root package name */
    public boolean f855r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f856s = false;

    /* renamed from: t  reason: collision with root package name */
    public int f857t = 16;

    public ActionMenuItem(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f849l = context;
        this.f838a = i3;
        this.f839b = i2;
        this.f840c = i5;
        this.f841d = charSequence;
    }

    public SupportMenuItem a(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f848k;
        if (drawable == null) {
            return;
        }
        if (this.f855r || this.f856s) {
            Drawable q2 = DrawableCompat.q(drawable);
            this.f848k = q2;
            Drawable mutate = q2.mutate();
            this.f848k = mutate;
            if (this.f855r) {
                DrawableCompat.n(mutate, this.f853p);
            }
            if (this.f856s) {
                DrawableCompat.o(this.f848k, this.f854q);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public SupportMenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public SupportMenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f847j;
    }

    public char getAlphabeticShortcut() {
        return this.f846i;
    }

    public CharSequence getContentDescription() {
        return this.f851n;
    }

    public int getGroupId() {
        return this.f839b;
    }

    public Drawable getIcon() {
        return this.f848k;
    }

    public ColorStateList getIconTintList() {
        return this.f853p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f854q;
    }

    public Intent getIntent() {
        return this.f843f;
    }

    public int getItemId() {
        return this.f838a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f845h;
    }

    public char getNumericShortcut() {
        return this.f844g;
    }

    public int getOrder() {
        return this.f840c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f841d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f842e;
        return charSequence != null ? charSequence : this.f841d;
    }

    public CharSequence getTooltipText() {
        return this.f852o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f857t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f857t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f857t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f857t & 8) == 0;
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f846i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f857t = z2 | (this.f857t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.f857t = (z2 ? 2 : 0) | (this.f857t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f857t = (z2 ? 16 : 0) | (this.f857t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f848k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f853p = colorStateList;
        this.f855r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f854q = mode;
        this.f856s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f843f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f844g = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f850m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f844g = c2;
        this.f846i = Character.toLowerCase(c3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f841d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f842e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.f857t & 8;
        if (z2) {
            i2 = 0;
        }
        this.f857t = i3 | i2;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f846i = Character.toLowerCase(c2);
        this.f847j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f851n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f844g = c2;
        this.f845h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f841d = this.f849l.getResources().getString(i2);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f852o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f848k = ContextCompat.e(this.f849l, i2);
        c();
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f844g = c2;
        this.f845h = KeyEvent.normalizeMetaState(i2);
        this.f846i = Character.toLowerCase(c3);
        this.f847j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
