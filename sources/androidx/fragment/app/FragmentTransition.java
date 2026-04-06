package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.List;

class FragmentTransition {

    /* renamed from: a  reason: collision with root package name */
    public static final FragmentTransitionImpl f21737a = new FragmentTransitionCompat21();

    /* renamed from: b  reason: collision with root package name */
    public static final FragmentTransitionImpl f21738b = c();

    public static void a(Fragment fragment, Fragment fragment2, boolean z2, ArrayMap arrayMap, boolean z3) {
        SharedElementCallback y2 = z2 ? fragment2.y() : fragment.y();
        if (y2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add((String) arrayMap.g(i2));
                arrayList.add((View) arrayMap.j(i2));
            }
            if (z3) {
                y2.g(arrayList2, arrayList, (List) null);
            } else {
                y2.f(arrayList2, arrayList, (List) null);
            }
        }
    }

    public static String b(ArrayMap arrayMap, String str) {
        int size = arrayMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(arrayMap.j(i2))) {
                return (String) arrayMap.g(i2);
            }
        }
        return null;
    }

    public static FragmentTransitionImpl c() {
        try {
            return (FragmentTransitionImpl) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void d(ArrayMap arrayMap, ArrayMap arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey((String) arrayMap.j(size))) {
                arrayMap.h(size);
            }
        }
    }

    public static void e(ArrayList arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i2);
            }
        }
    }
}
