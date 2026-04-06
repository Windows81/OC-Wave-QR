package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {

    /* renamed from: t  reason: collision with root package name */
    public final FragmentManager f21488t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f21489u;

    /* renamed from: v  reason: collision with root package name */
    public int f21490v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f21491w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackStackRecord(FragmentManager fragmentManager) {
        super(fragmentManager.x0(), fragmentManager.A0() != null ? fragmentManager.A0().l().getClassLoader() : null);
        this.f21490v = -1;
        this.f21491w = false;
        this.f21488t = fragmentManager;
    }

    public String A() {
        return this.f21719k;
    }

    public void B() {
        if (this.f21727s != null) {
            for (int i2 = 0; i2 < this.f21727s.size(); i2++) {
                ((Runnable) this.f21727s.get(i2)).run();
            }
            this.f21727s = null;
        }
    }

    public Fragment C(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f21711c.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(size);
            int i2 = op.f21728a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = op.f21729b;
                            break;
                        case 10:
                            op.f21736i = op.f21735h;
                            break;
                    }
                }
                arrayList.add(op.f21729b);
            }
            arrayList.remove(op.f21729b);
        }
        return fragment;
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f21717i) {
            return true;
        }
        this.f21488t.i(this);
        return true;
    }

    public int h() {
        return u(false);
    }

    public int i() {
        return u(true);
    }

    public void j() {
        m();
        this.f21488t.e0(this, false);
    }

    public void k() {
        m();
        this.f21488t.e0(this, true);
    }

    public FragmentTransaction l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.S;
        if (fragmentManager == null || fragmentManager == this.f21488t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void n(int i2, Fragment fragment, String str, int i3) {
        super.n(i2, fragment, str, i3);
        fragment.S = this.f21488t;
    }

    public boolean o() {
        return this.f21711c.isEmpty();
    }

    public FragmentTransaction p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.S;
        if (fragmentManager == null || fragmentManager == this.f21488t) {
            return super.p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public FragmentTransaction q(Fragment fragment, Lifecycle.State state) {
        if (fragment.S != this.f21488t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f21488t);
        } else if (state == Lifecycle.State.INITIALIZED && fragment.f21548z > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            return super.q(fragment, state);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public void s(int i2) {
        if (this.f21717i) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f21711c.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(i3);
                Fragment fragment = op.f21729b;
                if (fragment != null) {
                    fragment.R += i2;
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f21729b + " to " + op.f21729b.R);
                    }
                }
            }
        }
    }

    public void t() {
        int size = this.f21711c.size() - 1;
        while (size >= 0) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(size);
            if (op.f21730c) {
                if (op.f21728a == 8) {
                    op.f21730c = false;
                    this.f21711c.remove(size - 1);
                    size--;
                } else {
                    int i2 = op.f21729b.X;
                    op.f21728a = 2;
                    op.f21730c = false;
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        FragmentTransaction.Op op2 = (FragmentTransaction.Op) this.f21711c.get(i3);
                        if (op2.f21730c && op2.f21729b.X == i2) {
                            this.f21711c.remove(i3);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f21490v >= 0) {
            sb.append(" #");
            sb.append(this.f21490v);
        }
        if (this.f21719k != null) {
            sb.append(" ");
            sb.append(this.f21719k);
        }
        sb.append("}");
        return sb.toString();
    }

    public int u(boolean z2) {
        if (!this.f21489u) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                v("  ", printWriter);
                printWriter.close();
            }
            this.f21489u = true;
            if (this.f21717i) {
                this.f21490v = this.f21488t.m();
            } else {
                this.f21490v = -1;
            }
            this.f21488t.b0(this, z2);
            return this.f21490v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void v(String str, PrintWriter printWriter) {
        w(str, printWriter, true);
    }

    public void w(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f21719k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f21490v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f21489u);
            if (this.f21716h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f21716h));
            }
            if (!(this.f21712d == 0 && this.f21713e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21712d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21713e));
            }
            if (!(this.f21714f == 0 && this.f21715g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21714f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21715g));
            }
            if (!(this.f21720l == 0 && this.f21721m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21720l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f21721m);
            }
            if (!(this.f21722n == 0 && this.f21723o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21722n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f21723o);
            }
        }
        if (!this.f21711c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f21711c.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(i2);
                switch (op.f21728a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + op.f21728a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(op.f21729b);
                if (z2) {
                    if (!(op.f21731d == 0 && op.f21732e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(op.f21731d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(op.f21732e));
                    }
                    if (op.f21733f != 0 || op.f21734g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(op.f21733f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(op.f21734g));
                    }
                }
            }
        }
    }

    public void x() {
        int size = this.f21711c.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(i2);
            Fragment fragment = op.f21729b;
            if (fragment != null) {
                fragment.M = this.f21491w;
                fragment.N1(false);
                fragment.M1(this.f21716h);
                fragment.Q1(this.f21724p, this.f21725q);
            }
            switch (op.f21728a) {
                case 1:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, false);
                    this.f21488t.j(fragment);
                    break;
                case 3:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.l1(fragment);
                    break;
                case 4:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.K0(fragment);
                    break;
                case 5:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, false);
                    this.f21488t.A1(fragment);
                    break;
                case 6:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.z(fragment);
                    break;
                case 7:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, false);
                    this.f21488t.o(fragment);
                    break;
                case 8:
                    this.f21488t.y1(fragment);
                    break;
                case 9:
                    this.f21488t.y1((Fragment) null);
                    break;
                case 10:
                    this.f21488t.x1(fragment, op.f21736i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f21728a);
            }
        }
    }

    public void y() {
        for (int size = this.f21711c.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(size);
            Fragment fragment = op.f21729b;
            if (fragment != null) {
                fragment.M = this.f21491w;
                fragment.N1(true);
                fragment.M1(FragmentManager.r1(this.f21716h));
                fragment.Q1(this.f21725q, this.f21724p);
            }
            switch (op.f21728a) {
                case 1:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, true);
                    this.f21488t.l1(fragment);
                    break;
                case 3:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.j(fragment);
                    break;
                case 4:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.A1(fragment);
                    break;
                case 5:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, true);
                    this.f21488t.K0(fragment);
                    break;
                case 6:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.o(fragment);
                    break;
                case 7:
                    fragment.G1(op.f21731d, op.f21732e, op.f21733f, op.f21734g);
                    this.f21488t.w1(fragment, true);
                    this.f21488t.z(fragment);
                    break;
                case 8:
                    this.f21488t.y1((Fragment) null);
                    break;
                case 9:
                    this.f21488t.y1(fragment);
                    break;
                case 10:
                    this.f21488t.x1(fragment, op.f21735h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f21728a);
            }
        }
    }

    public Fragment z(ArrayList arrayList, Fragment fragment) {
        ArrayList arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f21711c.size()) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) this.f21711c.get(i2);
            int i3 = op.f21728a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = op.f21729b;
                    int i4 = fragment3.X;
                    boolean z2 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList2.get(size);
                        if (fragment4.X == i4) {
                            if (fragment4 == fragment3) {
                                z2 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f21711c.add(i2, new FragmentTransaction.Op(9, fragment4, true));
                                    i2++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.Op op2 = new FragmentTransaction.Op(3, fragment4, true);
                                op2.f21731d = op.f21731d;
                                op2.f21733f = op.f21733f;
                                op2.f21732e = op.f21732e;
                                op2.f21734g = op.f21734g;
                                this.f21711c.add(i2, op2);
                                arrayList2.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z2) {
                        this.f21711c.remove(i2);
                        i2--;
                    } else {
                        op.f21728a = 1;
                        op.f21730c = true;
                        arrayList2.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(op.f21729b);
                    Fragment fragment5 = op.f21729b;
                    if (fragment5 == fragment2) {
                        this.f21711c.add(i2, new FragmentTransaction.Op(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f21711c.add(i2, new FragmentTransaction.Op(9, fragment2, true));
                        op.f21730c = true;
                        i2++;
                        fragment2 = op.f21729b;
                    }
                }
                i2++;
            }
            arrayList2.add(op.f21729b);
            i2++;
        }
        return fragment2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackStackRecord(BackStackRecord backStackRecord) {
        super(backStackRecord.f21488t.x0(), backStackRecord.f21488t.A0() != null ? backStackRecord.f21488t.A0().l().getClassLoader() : null, backStackRecord);
        this.f21490v = -1;
        this.f21491w = false;
        this.f21488t = backStackRecord.f21488t;
        this.f21489u = backStackRecord.f21489u;
        this.f21490v = backStackRecord.f21490v;
        this.f21491w = backStackRecord.f21491w;
    }
}
