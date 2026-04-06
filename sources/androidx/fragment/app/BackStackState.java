package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final List f21495A;

    /* renamed from: z  reason: collision with root package name */
    public final List f21496z;

    public BackStackState(List list, List list2) {
        this.f21496z = list;
        this.f21495A = list2;
    }

    public List a(FragmentManager fragmentManager, Map map) {
        HashMap hashMap = new HashMap(this.f21496z.size());
        for (String str : this.f21496z) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.E, fragment);
            } else {
                FragmentState B2 = fragmentManager.y0().B(str, (FragmentState) null);
                if (B2 != null) {
                    Fragment a2 = B2.a(fragmentManager.x0(), fragmentManager.A0().l().getClassLoader());
                    hashMap.put(a2.E, a2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (BackStackRecordState c2 : this.f21495A) {
            arrayList.add(c2.c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f21496z);
        parcel.writeTypedList(this.f21495A);
    }

    public BackStackState(Parcel parcel) {
        this.f21496z = parcel.createStringArrayList();
        this.f21495A = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
