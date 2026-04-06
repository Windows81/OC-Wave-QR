package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

public final class MenuItemImpl implements SupportMenuItem {

    /* renamed from: A  reason: collision with root package name */
    public View f919A;

    /* renamed from: B  reason: collision with root package name */
    public ActionProvider f920B;
    public MenuItem.OnActionExpandListener C;
    public boolean D = false;
    public ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    public final int f921a;

    /* renamed from: b  reason: collision with root package name */
    public final int f922b;

    /* renamed from: c  reason: collision with root package name */
    public final int f923c;

    /* renamed from: d  reason: collision with root package name */
    public final int f924d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f925e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f926f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f927g;

    /* renamed from: h  reason: collision with root package name */
    public char f928h;

    /* renamed from: i  reason: collision with root package name */
    public int f929i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f930j;

    /* renamed from: k  reason: collision with root package name */
    public int f931k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f932l;

    /* renamed from: m  reason: collision with root package name */
    public int f933m = 0;

    /* renamed from: n  reason: collision with root package name */
    public MenuBuilder f934n;

    /* renamed from: o  reason: collision with root package name */
    public SubMenuBuilder f935o;

    /* renamed from: p  reason: collision with root package name */
    public Runnable f936p;

    /* renamed from: q  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f937q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f938r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f939s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f940t = null;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f941u = null;

    /* renamed from: v  reason: collision with root package name */
    public boolean f942v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f943w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f944x = false;

    /* renamed from: y  reason: collision with root package name */
    public int f945y = 16;

    /* renamed from: z  reason: collision with root package name */
    public int f946z;

    public MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f934n = menuBuilder;
        this.f921a = i3;
        this.f922b = i2;
        this.f923c = i4;
        this.f924d = i5;
        this.f925e = charSequence;
        this.f946z = i6;
    }

    public static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f934n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f946z & 4) == 4;
    }

    public SupportMenuItem a(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f920B;
        if (actionProvider2 != null) {
            actionProvider2.h();
        }
        this.f919A = null;
        this.f920B = actionProvider;
        this.f934n.K(true);
        ActionProvider actionProvider3 = this.f920B;
        if (actionProvider3 != null) {
            actionProvider3.j(new ActionProvider.VisibilityListener() {
                public void onActionProviderVisibilityChanged(boolean z2) {
                    MenuItemImpl menuItemImpl = MenuItemImpl.this;
                    menuItemImpl.f934n.J(menuItemImpl);
                }
            });
        }
        return this;
    }

    public ActionProvider b() {
        return this.f920B;
    }

    public void c() {
        this.f934n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f946z & 8) == 0) {
            return false;
        }
        if (this.f919A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f934n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f944x && (this.f942v || this.f943w)) {
            drawable = DrawableCompat.q(drawable).mutate();
            if (this.f942v) {
                DrawableCompat.n(drawable, this.f940t);
            }
            if (this.f943w) {
                DrawableCompat.o(drawable, this.f941u);
            }
            this.f944x = false;
        }
        return drawable;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f934n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f924d;
    }

    public char g() {
        return this.f934n.G() ? this.f930j : this.f928h;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f919A;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f920B;
        if (actionProvider == null) {
            return null;
        }
        View d2 = actionProvider.d(this);
        this.f919A = d2;
        return d2;
    }

    public int getAlphabeticModifiers() {
        return this.f931k;
    }

    public char getAlphabeticShortcut() {
        return this.f930j;
    }

    public CharSequence getContentDescription() {
        return this.f938r;
    }

    public int getGroupId() {
        return this.f922b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f932l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f933m == 0) {
            return null;
        }
        Drawable b2 = AppCompatResources.b(this.f934n.u(), this.f933m);
        this.f933m = 0;
        this.f932l = b2;
        return e(b2);
    }

    public ColorStateList getIconTintList() {
        return this.f940t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f941u;
    }

    public Intent getIntent() {
        return this.f927g;
    }

    public int getItemId() {
        return this.f921a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f929i;
    }

    public char getNumericShortcut() {
        return this.f928h;
    }

    public int getOrder() {
        return this.f923c;
    }

    public SubMenu getSubMenu() {
        return this.f935o;
    }

    public CharSequence getTitle() {
        return this.f925e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f926f;
        return charSequence != null ? charSequence : this.f925e;
    }

    public CharSequence getTooltipText() {
        return this.f939s;
    }

    public String h() {
        char g2 = g();
        if (g2 == 0) {
            return "";
        }
        Resources resources = this.f934n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f934n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.f437o));
        }
        int i2 = this.f934n.G() ? this.f931k : this.f929i;
        d(sb, i2, 65536, resources.getString(R.string.f433k));
        d(sb, i2, 4096, resources.getString(R.string.f429g));
        d(sb, i2, 2, resources.getString(R.string.f428f));
        d(sb, i2, 1, resources.getString(R.string.f434l));
        d(sb, i2, 4, resources.getString(R.string.f436n));
        d(sb, i2, 8, resources.getString(R.string.f432j));
        if (g2 == 8) {
            sb.append(resources.getString(R.string.f430h));
        } else if (g2 == 10) {
            sb.append(resources.getString(R.string.f431i));
        } else if (g2 != ' ') {
            sb.append(g2);
        } else {
            sb.append(resources.getString(R.string.f435m));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f935o != null;
    }

    public CharSequence i(MenuView.ItemView itemView) {
        return (itemView == null || !itemView.c()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f945y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f945y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f945y & 16) != 0;
    }

    public boolean isVisible() {
        ActionProvider actionProvider = this.f920B;
        return (actionProvider == null || !actionProvider.g()) ? (this.f945y & 8) == 0 : (this.f945y & 8) == 0 && this.f920B.b();
    }

    public boolean j() {
        ActionProvider actionProvider;
        if ((this.f946z & 8) == 0) {
            return false;
        }
        if (this.f919A == null && (actionProvider = this.f920B) != null) {
            this.f919A = actionProvider.d(this);
        }
        return this.f919A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f937q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.f934n;
        if (menuBuilder.h(menuBuilder, this)) {
            return true;
        }
        Runnable runnable = this.f936p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f927g != null) {
            try {
                this.f934n.u().startActivity(this.f927g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        ActionProvider actionProvider = this.f920B;
        return actionProvider != null && actionProvider.e();
    }

    public boolean l() {
        return (this.f945y & 32) == 32;
    }

    public boolean m() {
        return (this.f945y & 4) != 0;
    }

    public boolean n() {
        return (this.f946z & 1) == 1;
    }

    public boolean o() {
        return (this.f946z & 2) == 2;
    }

    /* renamed from: p */
    public SupportMenuItem setActionView(int i2) {
        Context u2 = this.f934n.u();
        setActionView(LayoutInflater.from(u2).inflate(i2, new LinearLayout(u2), false));
        return this;
    }

    /* renamed from: q */
    public SupportMenuItem setActionView(View view) {
        int i2;
        this.f919A = view;
        this.f920B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f921a) > 0) {
            view.setId(i2);
        }
        this.f934n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.f934n.K(false);
    }

    public void s(boolean z2) {
        int i2 = this.f945y;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.f945y = i3;
        if (i2 != i3) {
            this.f934n.K(false);
        }
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f930j == c2) {
            return this;
        }
        this.f930j = Character.toLowerCase(c2);
        this.f934n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f945y;
        boolean z3 = z2 | (i2 & true);
        this.f945y = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f934n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.f945y & 4) != 0) {
            this.f934n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f945y |= 16;
        } else {
            this.f945y &= -17;
        }
        this.f934n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f933m = 0;
        this.f932l = drawable;
        this.f944x = true;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f940t = colorStateList;
        this.f942v = true;
        this.f944x = true;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f941u = mode;
        this.f943w = true;
        this.f944x = true;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f927g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f928h == c2) {
            return this;
        }
        this.f928h = c2;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f937q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f928h = c2;
        this.f930j = Character.toLowerCase(c3);
        this.f934n.K(false);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.f946z = i2;
            this.f934n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f925e = charSequence;
        this.f934n.K(false);
        SubMenuBuilder subMenuBuilder = this.f935o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f926f = charSequence;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.f934n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.f945y = (z2 ? 4 : 0) | (this.f945y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f925e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        if (z2) {
            this.f945y |= 32;
        } else {
            this.f945y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public SupportMenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(SubMenuBuilder subMenuBuilder) {
        this.f935o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z2) {
        int i2 = this.f945y;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.f945y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f934n.A();
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f938r = charSequence;
        this.f934n.K(false);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f939s = charSequence;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f930j == c2 && this.f931k == i2) {
            return this;
        }
        this.f930j = Character.toLowerCase(c2);
        this.f931k = KeyEvent.normalizeMetaState(i2);
        this.f934n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f928h == c2 && this.f929i == i2) {
            return this;
        }
        this.f928h = c2;
        this.f929i = KeyEvent.normalizeMetaState(i2);
        this.f934n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f928h = c2;
        this.f929i = KeyEvent.normalizeMetaState(i2);
        this.f930j = Character.toLowerCase(c3);
        this.f931k = KeyEvent.normalizeMetaState(i3);
        this.f934n.K(false);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f932l = null;
        this.f933m = i2;
        this.f944x = true;
        this.f934n.K(false);
        return this;
    }

    public MenuItem setTitle(int i2) {
        return setTitle((CharSequence) this.f934n.u().getString(i2));
    }
}
