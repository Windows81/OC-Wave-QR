package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: A  reason: collision with root package name */
    public Context f21700A;

    /* renamed from: B  reason: collision with root package name */
    public FragmentManager f21701B;
    public int C;
    public TabHost.OnTabChangeListener D;
    public TabInfo E;
    public boolean F;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f21702z;

    public static class DummyTabFactory implements TabHost.TabContentFactory {

        /* renamed from: a  reason: collision with root package name */
        public final Context f21703a;

        public View createTabContent(String str) {
            View view = new View(this.f21703a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: z  reason: collision with root package name */
        public String f21704z;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f21704z + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f21704z);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f21704z = parcel.readString();
        }
    }

    public static final class TabInfo {

        /* renamed from: a  reason: collision with root package name */
        public final String f21705a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f21706b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f21707c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f21708d;
    }

    public final FragmentTransaction a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        TabInfo b2 = b(str);
        if (this.E != b2) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f21701B.p();
            }
            TabInfo tabInfo = this.E;
            if (!(tabInfo == null || (fragment = tabInfo.f21708d) == null)) {
                fragmentTransaction.l(fragment);
            }
            if (b2 != null) {
                Fragment fragment2 = b2.f21708d;
                if (fragment2 == null) {
                    Fragment a2 = this.f21701B.x0().a(this.f21700A.getClassLoader(), b2.f21706b.getName());
                    b2.f21708d = a2;
                    a2.H1(b2.f21707c);
                    fragmentTransaction.c(this.C, b2.f21708d, b2.f21705a);
                } else {
                    fragmentTransaction.g(fragment2);
                }
            }
            this.E = b2;
        }
        return fragmentTransaction;
    }

    public final TabInfo b(String str) {
        int size = this.f21702z.size();
        for (int i2 = 0; i2 < size; i2++) {
            TabInfo tabInfo = (TabInfo) this.f21702z.get(i2);
            if (tabInfo.f21705a.equals(str)) {
                return tabInfo;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f21702z.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i2 = 0; i2 < size; i2++) {
            TabInfo tabInfo = (TabInfo) this.f21702z.get(i2);
            Fragment l0 = this.f21701B.l0(tabInfo.f21705a);
            tabInfo.f21708d = l0;
            if (l0 != null && !l0.i0()) {
                if (tabInfo.f21705a.equals(currentTabTag)) {
                    this.E = tabInfo;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f21701B.p();
                    }
                    fragmentTransaction.l(tabInfo.f21708d);
                }
            }
        }
        this.F = true;
        FragmentTransaction a2 = a(currentTabTag, fragmentTransaction);
        if (a2 != null) {
            a2.h();
            this.f21701B.h0();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f21704z);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f21704z = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        FragmentTransaction a2;
        if (this.F && (a2 = a(str, (FragmentTransaction) null)) != null) {
            a2.h();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.D;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.D = onTabChangeListener;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
