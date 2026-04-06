package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuBuilder implements SupportMenu {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f889A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f890a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f891b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f892c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f893d;

    /* renamed from: e  reason: collision with root package name */
    public Callback f894e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f895f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f896g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f897h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f898i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f899j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f900k;

    /* renamed from: l  reason: collision with root package name */
    public int f901l = 0;

    /* renamed from: m  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f902m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f903n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f904o;

    /* renamed from: p  reason: collision with root package name */
    public View f905p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f906q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f907r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f908s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f909t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f910u = false;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f911v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    public CopyOnWriteArrayList f912w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    public MenuItemImpl f913x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f914y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f915z;

    public interface Callback {
        boolean a(MenuBuilder menuBuilder, MenuItem menuItem);

        void b(MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean a(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        this.f890a = context;
        this.f891b = context.getResources();
        this.f895f = new ArrayList();
        this.f896g = new ArrayList();
        this.f897h = true;
        this.f898i = new ArrayList();
        this.f899j = new ArrayList();
        this.f900k = true;
        b0(true);
    }

    public static int B(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f889A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.f909t;
    }

    public Resources C() {
        return this.f891b;
    }

    public MenuBuilder D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f897h) {
            return this.f896g;
        }
        this.f896g.clear();
        int size = this.f895f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i2);
            if (menuItemImpl.isVisible()) {
                this.f896g.add(menuItemImpl);
            }
        }
        this.f897h = false;
        this.f900k = true;
        return this.f896g;
    }

    public boolean F() {
        return this.f914y;
    }

    public boolean G() {
        return this.f892c;
    }

    public boolean H() {
        return this.f893d;
    }

    public void I(MenuItemImpl menuItemImpl) {
        this.f900k = true;
        K(true);
    }

    public void J(MenuItemImpl menuItemImpl) {
        this.f897h = true;
        K(true);
    }

    public void K(boolean z2) {
        if (!this.f906q) {
            if (z2) {
                this.f897h = true;
                this.f900k = true;
            }
            i(z2);
            return;
        }
        this.f907r = true;
        if (z2) {
            this.f908s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, (MenuPresenter) null, i2);
    }

    public boolean M(MenuItem menuItem, MenuPresenter menuPresenter, int i2) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean k2 = menuItemImpl.k();
        ActionProvider b2 = menuItemImpl.b();
        boolean z2 = b2 != null && b2.a();
        if (menuItemImpl.j()) {
            k2 |= menuItemImpl.expandActionView();
            if (k2) {
                e(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.x(new SubMenuBuilder(u(), this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z2) {
                b2.f(subMenuBuilder);
            }
            k2 |= j(subMenuBuilder, menuPresenter);
            if (!k2) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return k2;
    }

    public final void N(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f895f.size()) {
            this.f895f.remove(i2);
            if (z2) {
                K(true);
            }
        }
    }

    public void O(MenuPresenter menuPresenter) {
        Iterator it = this.f912w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.f912w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).P(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(Callback callback) {
        this.f894e = callback;
    }

    public MenuBuilder S(int i2) {
        this.f901l = i2;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f895f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i2);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.m() && menuItemImpl.isCheckable()) {
                menuItemImpl.s(menuItemImpl == menuItem);
            }
        }
        c0();
    }

    public MenuBuilder U(int i2) {
        W(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    public MenuBuilder V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f905p = view;
            this.f903n = null;
            this.f904o = null;
        } else {
            if (i2 > 0) {
                this.f903n = C.getText(i2);
            } else if (charSequence != null) {
                this.f903n = charSequence;
            }
            if (i3 > 0) {
                this.f904o = ContextCompat.e(u(), i3);
            } else if (drawable != null) {
                this.f904o = drawable;
            }
            this.f905p = null;
        }
        K(false);
    }

    public MenuBuilder X(int i2) {
        W(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public MenuBuilder Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public MenuBuilder Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B2 = B(i4);
        MenuItemImpl g2 = g(i2, i3, i4, B2, charSequence, this.f901l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f902m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f895f;
        arrayList.add(n(arrayList, B2), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z2) {
        this.f915z = z2;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f890a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(MenuPresenter menuPresenter) {
        c(menuPresenter, this.f890a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if (androidx.core.view.ViewConfigurationCompat.j(android.view.ViewConfiguration.get(r2.f890a), r2.f890a) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            android.content.res.Resources r3 = r2.f891b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L_0x001c
            android.content.Context r3 = r2.f890a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f890a
            boolean r3 = androidx.core.view.ViewConfigurationCompat.j(r3, r1)
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.f893d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.b0(boolean):void");
    }

    public void c(MenuPresenter menuPresenter, Context context) {
        this.f912w.add(new WeakReference(menuPresenter));
        menuPresenter.i(context, this);
        this.f900k = true;
    }

    public void c0() {
        this.f906q = false;
        if (this.f907r) {
            this.f907r = false;
            K(this.f908s);
        }
    }

    public void clear() {
        MenuItemImpl menuItemImpl = this.f913x;
        if (menuItemImpl != null) {
            f(menuItemImpl);
        }
        this.f895f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f904o = null;
        this.f903n = null;
        this.f905p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        Callback callback = this.f894e;
        if (callback != null) {
            callback.b(this);
        }
    }

    public void d0() {
        if (!this.f906q) {
            this.f906q = true;
            this.f907r = false;
            this.f908s = false;
        }
    }

    public final void e(boolean z2) {
        if (!this.f910u) {
            this.f910u = true;
            Iterator it = this.f912w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f912w.remove(weakReference);
                } else {
                    menuPresenter.c(this, z2);
                }
            }
            this.f910u = false;
        }
    }

    public boolean f(MenuItemImpl menuItemImpl) {
        boolean z2 = false;
        if (!this.f912w.isEmpty() && this.f913x == menuItemImpl) {
            d0();
            Iterator it = this.f912w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f912w.remove(weakReference);
                } else {
                    z2 = menuPresenter.f(this, menuItemImpl);
                    if (z2) {
                        break;
                    }
                }
            }
            c0();
            if (z2) {
                this.f913x = null;
            }
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i3);
            if (menuItemImpl.getItemId() == i2) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemImpl g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new MenuItemImpl(this, i2, i3, i4, i5, charSequence, i6);
    }

    public MenuItem getItem(int i2) {
        return (MenuItem) this.f895f.get(i2);
    }

    public boolean h(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.f894e;
        return callback != null && callback.a(menuBuilder, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f915z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) this.f895f.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z2) {
        if (!this.f912w.isEmpty()) {
            d0();
            Iterator it = this.f912w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f912w.remove(weakReference);
                } else {
                    menuPresenter.d(z2);
                }
            }
            c0();
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public final boolean j(SubMenuBuilder subMenuBuilder, MenuPresenter menuPresenter) {
        boolean z2 = false;
        if (this.f912w.isEmpty()) {
            return false;
        }
        if (menuPresenter != null) {
            z2 = menuPresenter.k(subMenuBuilder);
        }
        Iterator it = this.f912w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null) {
                this.f912w.remove(weakReference);
            } else if (!z2) {
                z2 = menuPresenter2.k(subMenuBuilder);
            }
        }
        return z2;
    }

    public boolean k(MenuItemImpl menuItemImpl) {
        boolean z2 = false;
        if (this.f912w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f912w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.f912w.remove(weakReference);
            } else {
                z2 = menuPresenter.g(this, menuItemImpl);
                if (z2) {
                    break;
                }
            }
        }
        c0();
        if (z2) {
            this.f913x = menuItemImpl;
        }
        return z2;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (((MenuItemImpl) this.f895f.get(i3)).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemImpl) this.f895f.get(i3)).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public MenuItemImpl p(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f911v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            char alphabeticShortcut = G ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i2 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        MenuItemImpl p2 = p(i2, keyEvent);
        boolean L = p2 != null ? L(p2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    public void q(List list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f895f.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if ((modifiers & 69647) == ((G ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i2 == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E = E();
        if (this.f900k) {
            Iterator it = this.f912w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f912w.remove(weakReference);
                } else {
                    z2 |= menuPresenter.e();
                }
            }
            if (z2) {
                this.f898i.clear();
                this.f899j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) E.get(i2);
                    if (menuItemImpl.l()) {
                        this.f898i.add(menuItemImpl);
                    } else {
                        this.f899j.add(menuItemImpl);
                    }
                }
            } else {
                this.f898i.clear();
                this.f899j.clear();
                this.f899j.addAll(E());
            }
            this.f900k = false;
        }
    }

    public void removeGroup(int i2) {
        int l2 = l(i2);
        if (l2 >= 0) {
            int size = this.f895f.size() - l2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || ((MenuItemImpl) this.f895f.get(l2)).getGroupId() != i2) {
                    K(true);
                } else {
                    N(l2, false);
                    i3 = i4;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList s() {
        r();
        return this.f898i;
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f895f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i3);
            if (menuItemImpl.getGroupId() == i2) {
                menuItemImpl.t(z3);
                menuItemImpl.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f914y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f895f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i3);
            if (menuItemImpl.getGroupId() == i2) {
                menuItemImpl.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f895f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f895f.get(i3);
            if (menuItemImpl.getGroupId() == i2 && menuItemImpl.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f892c = z2;
        K(false);
    }

    public int size() {
        return this.f895f.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f890a;
    }

    public MenuItemImpl v() {
        return this.f913x;
    }

    public Drawable w() {
        return this.f904o;
    }

    public CharSequence x() {
        return this.f903n;
    }

    public View y() {
        return this.f905p;
    }

    public ArrayList z() {
        r();
        return this.f899j;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f891b.getString(i2));
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f891b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) a(i2, i3, i4, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f890a, this, menuItemImpl);
        menuItemImpl.x(subMenuBuilder);
        return subMenuBuilder;
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f891b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f891b.getString(i5));
    }
}
