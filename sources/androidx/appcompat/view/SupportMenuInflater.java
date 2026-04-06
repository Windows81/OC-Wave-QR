package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SupportMenuInflater extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f791e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f792f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f793a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f794b;

    /* renamed from: c  reason: collision with root package name */
    public Context f795c;

    /* renamed from: d  reason: collision with root package name */
    public Object f796d;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class[] f797c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f798a;

        /* renamed from: b  reason: collision with root package name */
        public Method f799b;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.f798a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f799b = cls.getMethod(str, f797c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f799b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f799b.invoke(this.f798a, new Object[]{menuItem})).booleanValue();
                }
                this.f799b.invoke(this.f798a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class MenuState {

        /* renamed from: A  reason: collision with root package name */
        public ActionProvider f800A;

        /* renamed from: B  reason: collision with root package name */
        public CharSequence f801B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f802a;

        /* renamed from: b  reason: collision with root package name */
        public int f803b;

        /* renamed from: c  reason: collision with root package name */
        public int f804c;

        /* renamed from: d  reason: collision with root package name */
        public int f805d;

        /* renamed from: e  reason: collision with root package name */
        public int f806e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f807f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f808g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f809h;

        /* renamed from: i  reason: collision with root package name */
        public int f810i;

        /* renamed from: j  reason: collision with root package name */
        public int f811j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f812k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f813l;

        /* renamed from: m  reason: collision with root package name */
        public int f814m;

        /* renamed from: n  reason: collision with root package name */
        public char f815n;

        /* renamed from: o  reason: collision with root package name */
        public int f816o;

        /* renamed from: p  reason: collision with root package name */
        public char f817p;

        /* renamed from: q  reason: collision with root package name */
        public int f818q;

        /* renamed from: r  reason: collision with root package name */
        public int f819r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f820s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f821t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f822u;

        /* renamed from: v  reason: collision with root package name */
        public int f823v;

        /* renamed from: w  reason: collision with root package name */
        public int f824w;

        /* renamed from: x  reason: collision with root package name */
        public String f825x;

        /* renamed from: y  reason: collision with root package name */
        public String f826y;

        /* renamed from: z  reason: collision with root package name */
        public String f827z;

        public MenuState(Menu menu) {
            this.f802a = menu;
            h();
        }

        public void a() {
            this.f809h = true;
            i(this.f802a.add(this.f803b, this.f810i, this.f811j, this.f812k));
        }

        public SubMenu b() {
            this.f809h = true;
            SubMenu addSubMenu = this.f802a.addSubMenu(this.f803b, this.f810i, this.f811j, this.f812k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f809h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f795c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.f795c.obtainStyledAttributes(attributeSet, R.styleable.q1);
            this.f803b = obtainStyledAttributes.getResourceId(R.styleable.s1, 0);
            this.f804c = obtainStyledAttributes.getInt(R.styleable.u1, 0);
            this.f805d = obtainStyledAttributes.getInt(R.styleable.v1, 0);
            this.f806e = obtainStyledAttributes.getInt(R.styleable.w1, 0);
            this.f807f = obtainStyledAttributes.getBoolean(R.styleable.t1, true);
            this.f808g = obtainStyledAttributes.getBoolean(R.styleable.r1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TintTypedArray t2 = TintTypedArray.t(SupportMenuInflater.this.f795c, attributeSet, R.styleable.x1);
            this.f810i = t2.m(R.styleable.A1, 0);
            this.f811j = (t2.j(R.styleable.D1, this.f804c) & -65536) | (t2.j(R.styleable.E1, this.f805d) & 65535);
            this.f812k = t2.o(R.styleable.F1);
            this.f813l = t2.o(R.styleable.G1);
            this.f814m = t2.m(R.styleable.y1, 0);
            this.f815n = c(t2.n(R.styleable.H1));
            this.f816o = t2.j(R.styleable.O1, 4096);
            this.f817p = c(t2.n(R.styleable.I1));
            this.f818q = t2.j(R.styleable.S1, 4096);
            if (t2.r(R.styleable.J1)) {
                this.f819r = t2.a(R.styleable.J1, false) ? 1 : 0;
            } else {
                this.f819r = this.f806e;
            }
            this.f820s = t2.a(R.styleable.B1, false);
            this.f821t = t2.a(R.styleable.C1, this.f807f);
            this.f822u = t2.a(R.styleable.z1, this.f808g);
            this.f823v = t2.j(R.styleable.T1, -1);
            this.f827z = t2.n(R.styleable.K1);
            this.f824w = t2.m(R.styleable.L1, 0);
            this.f825x = t2.n(R.styleable.N1);
            String n2 = t2.n(R.styleable.M1);
            this.f826y = n2;
            boolean z2 = n2 != null;
            if (z2 && this.f824w == 0 && this.f825x == null) {
                this.f800A = (ActionProvider) e(n2, SupportMenuInflater.f792f, SupportMenuInflater.this.f794b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f800A = null;
            }
            this.f801B = t2.o(R.styleable.P1);
            this.C = t2.o(R.styleable.U1);
            if (t2.r(R.styleable.R1)) {
                this.E = DrawableUtils.e(t2.j(R.styleable.R1, -1), this.E);
            } else {
                this.E = null;
            }
            if (t2.r(R.styleable.Q1)) {
                this.D = t2.c(R.styleable.Q1);
            } else {
                this.D = null;
            }
            t2.v();
            this.f809h = false;
        }

        public void h() {
            this.f803b = 0;
            this.f804c = 0;
            this.f805d = 0;
            this.f806e = 0;
            this.f807f = true;
            this.f808g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f820s).setVisible(this.f821t).setEnabled(this.f822u).setCheckable(this.f819r >= 1).setTitleCondensed(this.f813l).setIcon(this.f814m);
            int i2 = this.f823v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f827z != null) {
                if (!SupportMenuInflater.this.f795c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.b(), this.f827z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f819r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).t(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).h(true);
                }
            }
            String str = this.f825x;
            if (str != null) {
                menuItem.setActionView((View) e(str, SupportMenuInflater.f791e, SupportMenuInflater.this.f793a));
                z2 = true;
            }
            int i3 = this.f824w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            ActionProvider actionProvider = this.f800A;
            if (actionProvider != null) {
                MenuItemCompat.a(menuItem, actionProvider);
            }
            MenuItemCompat.c(menuItem, this.f801B);
            MenuItemCompat.g(menuItem, this.C);
            MenuItemCompat.b(menuItem, this.f815n, this.f816o);
            MenuItemCompat.f(menuItem, this.f817p, this.f818q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                MenuItemCompat.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                MenuItemCompat.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f791e = clsArr;
        f792f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f795c = context;
        Object[] objArr = {context};
        this.f793a = objArr;
        this.f794b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f796d == null) {
            this.f796d = a(this.f795c);
        }
        return this.f796d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            menuState.h();
                        } else if (name2.equals("item")) {
                            if (!menuState.d()) {
                                ActionProvider actionProvider = menuState.f800A;
                                if (actionProvider == null || !actionProvider.a()) {
                                    menuState.a();
                                } else {
                                    menuState.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        menuState.f(attributeSet);
                    } else if (name3.equals("item")) {
                        menuState.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, menuState.b());
                    } else {
                        str = name3;
                        z3 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f795c.getResources().getLayout(i2);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
