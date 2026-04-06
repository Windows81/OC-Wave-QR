package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public ArrayList f21662A;

    /* renamed from: B  reason: collision with root package name */
    public BackStackRecordState[] f21663B;
    public int C;
    public String D = null;
    public ArrayList E = new ArrayList();
    public ArrayList F = new ArrayList();
    public ArrayList G;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f21664z;

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f21664z);
        parcel.writeStringList(this.f21662A);
        parcel.writeTypedArray(this.f21663B, i2);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeStringList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeTypedList(this.G);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f21664z = parcel.createStringArrayList();
        this.f21662A = parcel.createStringArrayList();
        this.f21663B = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.createStringArrayList();
        this.F = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.G = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
