package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class FragmentTransaction {

    /* renamed from: a  reason: collision with root package name */
    public final FragmentFactory f21709a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f21710b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f21711c;

    /* renamed from: d  reason: collision with root package name */
    public int f21712d;

    /* renamed from: e  reason: collision with root package name */
    public int f21713e;

    /* renamed from: f  reason: collision with root package name */
    public int f21714f;

    /* renamed from: g  reason: collision with root package name */
    public int f21715g;

    /* renamed from: h  reason: collision with root package name */
    public int f21716h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21717i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21718j;

    /* renamed from: k  reason: collision with root package name */
    public String f21719k;

    /* renamed from: l  reason: collision with root package name */
    public int f21720l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f21721m;

    /* renamed from: n  reason: collision with root package name */
    public int f21722n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f21723o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f21724p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f21725q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f21726r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f21727s;

    public static final class Op {

        /* renamed from: a  reason: collision with root package name */
        public int f21728a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f21729b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21730c;

        /* renamed from: d  reason: collision with root package name */
        public int f21731d;

        /* renamed from: e  reason: collision with root package name */
        public int f21732e;

        /* renamed from: f  reason: collision with root package name */
        public int f21733f;

        /* renamed from: g  reason: collision with root package name */
        public int f21734g;

        /* renamed from: h  reason: collision with root package name */
        public Lifecycle.State f21735h;

        /* renamed from: i  reason: collision with root package name */
        public Lifecycle.State f21736i;

        public Op() {
        }

        public Op(int i2, Fragment fragment) {
            this.f21728a = i2;
            this.f21729b = fragment;
            this.f21730c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f21735h = state;
            this.f21736i = state;
        }

        public Op(int i2, Fragment fragment, boolean z2) {
            this.f21728a = i2;
            this.f21729b = fragment;
            this.f21730c = z2;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f21735h = state;
            this.f21736i = state;
        }

        public Op(int i2, Fragment fragment, Lifecycle.State state) {
            this.f21728a = i2;
            this.f21729b = fragment;
            this.f21730c = false;
            this.f21735h = fragment.q0;
            this.f21736i = state;
        }

        public Op(Op op) {
            this.f21728a = op.f21728a;
            this.f21729b = op.f21729b;
            this.f21730c = op.f21730c;
            this.f21731d = op.f21731d;
            this.f21732e = op.f21732e;
            this.f21733f = op.f21733f;
            this.f21734g = op.f21734g;
            this.f21735h = op.f21735h;
            this.f21736i = op.f21736i;
        }
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        this.f21711c = new ArrayList();
        this.f21718j = true;
        this.f21726r = false;
        this.f21709a = fragmentFactory;
        this.f21710b = classLoader;
    }

    public FragmentTransaction b(int i2, Fragment fragment) {
        n(i2, fragment, (String) null, 1);
        return this;
    }

    public FragmentTransaction c(int i2, Fragment fragment, String str) {
        n(i2, fragment, str, 1);
        return this;
    }

    public FragmentTransaction d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.g0 = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public FragmentTransaction e(Fragment fragment, String str) {
        n(0, fragment, str, 1);
        return this;
    }

    public void f(Op op) {
        this.f21711c.add(op);
        op.f21731d = this.f21712d;
        op.f21732e = this.f21713e;
        op.f21733f = this.f21714f;
        op.f21734g = this.f21715g;
    }

    public FragmentTransaction g(Fragment fragment) {
        f(new Op(7, fragment));
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public FragmentTransaction l(Fragment fragment) {
        f(new Op(6, fragment));
        return this;
    }

    public FragmentTransaction m() {
        if (!this.f21717i) {
            this.f21718j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void n(int i2, Fragment fragment, String str, int i3) {
        String str2 = fragment.p0;
        if (str2 != null) {
            FragmentStrictMode.h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.Y;
            if (str3 == null || str.equals(str3)) {
                fragment.Y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.Y + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.W;
                if (i4 == 0 || i4 == i2) {
                    fragment.W = i2;
                    fragment.X = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.W + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        f(new Op(i3, fragment));
    }

    public boolean o() {
        return this.f21711c.isEmpty();
    }

    public FragmentTransaction p(Fragment fragment) {
        f(new Op(3, fragment));
        return this;
    }

    public FragmentTransaction q(Fragment fragment, Lifecycle.State state) {
        f(new Op(10, fragment, state));
        return this;
    }

    public FragmentTransaction r(boolean z2) {
        this.f21726r = z2;
        return this;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader, FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        Iterator it = fragmentTransaction.f21711c.iterator();
        while (it.hasNext()) {
            this.f21711c.add(new Op((Op) it.next()));
        }
        this.f21712d = fragmentTransaction.f21712d;
        this.f21713e = fragmentTransaction.f21713e;
        this.f21714f = fragmentTransaction.f21714f;
        this.f21715g = fragmentTransaction.f21715g;
        this.f21716h = fragmentTransaction.f21716h;
        this.f21717i = fragmentTransaction.f21717i;
        this.f21718j = fragmentTransaction.f21718j;
        this.f21719k = fragmentTransaction.f21719k;
        this.f21722n = fragmentTransaction.f21722n;
        this.f21723o = fragmentTransaction.f21723o;
        this.f21720l = fragmentTransaction.f21720l;
        this.f21721m = fragmentTransaction.f21721m;
        if (fragmentTransaction.f21724p != null) {
            ArrayList arrayList = new ArrayList();
            this.f21724p = arrayList;
            arrayList.addAll(fragmentTransaction.f21724p);
        }
        if (fragmentTransaction.f21725q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f21725q = arrayList2;
            arrayList2.addAll(fragmentTransaction.f21725q);
        }
        this.f21726r = fragmentTransaction.f21726r;
    }
}
