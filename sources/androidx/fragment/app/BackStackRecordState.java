package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() {
        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* renamed from: b */
        public BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f21492A;

    /* renamed from: B  reason: collision with root package name */
    public final int[] f21493B;
    public final int[] C;
    public final int D;
    public final String E;
    public final int F;
    public final int G;
    public final CharSequence H;
    public final int I;
    public final CharSequence J;
    public final ArrayList K;
    public final ArrayList L;
    public final boolean M;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f21494z;

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f21711c.size();
        this.f21494z = new int[(size * 6)];
        if (backStackRecord.f21717i) {
            this.f21492A = new ArrayList(size);
            this.f21493B = new int[size];
            this.C = new int[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) backStackRecord.f21711c.get(i3);
                int i4 = i2 + 1;
                this.f21494z[i2] = op.f21728a;
                ArrayList arrayList = this.f21492A;
                Fragment fragment = op.f21729b;
                arrayList.add(fragment != null ? fragment.E : null);
                int[] iArr = this.f21494z;
                iArr[i4] = op.f21730c;
                iArr[i2 + 2] = op.f21731d;
                iArr[i2 + 3] = op.f21732e;
                int i5 = i2 + 5;
                iArr[i2 + 4] = op.f21733f;
                i2 += 6;
                iArr[i5] = op.f21734g;
                this.f21493B[i3] = op.f21735h.ordinal();
                this.C[i3] = op.f21736i.ordinal();
            }
            this.D = backStackRecord.f21716h;
            this.E = backStackRecord.f21719k;
            this.F = backStackRecord.f21490v;
            this.G = backStackRecord.f21720l;
            this.H = backStackRecord.f21721m;
            this.I = backStackRecord.f21722n;
            this.J = backStackRecord.f21723o;
            this.K = backStackRecord.f21724p;
            this.L = backStackRecord.f21725q;
            this.M = backStackRecord.f21726r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(BackStackRecord backStackRecord) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < this.f21494z.length) {
                FragmentTransaction.Op op = new FragmentTransaction.Op();
                int i4 = i2 + 1;
                op.f21728a = this.f21494z[i2];
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + this.f21494z[i4]);
                }
                op.f21735h = Lifecycle.State.values()[this.f21493B[i3]];
                op.f21736i = Lifecycle.State.values()[this.C[i3]];
                int[] iArr = this.f21494z;
                int i5 = i2 + 2;
                if (iArr[i4] == 0) {
                    z2 = false;
                }
                op.f21730c = z2;
                int i6 = iArr[i5];
                op.f21731d = i6;
                int i7 = iArr[i2 + 3];
                op.f21732e = i7;
                int i8 = i2 + 5;
                int i9 = iArr[i2 + 4];
                op.f21733f = i9;
                i2 += 6;
                int i10 = iArr[i8];
                op.f21734g = i10;
                backStackRecord.f21712d = i6;
                backStackRecord.f21713e = i7;
                backStackRecord.f21714f = i9;
                backStackRecord.f21715g = i10;
                backStackRecord.f(op);
                i3++;
            } else {
                backStackRecord.f21716h = this.D;
                backStackRecord.f21719k = this.E;
                backStackRecord.f21717i = true;
                backStackRecord.f21720l = this.G;
                backStackRecord.f21721m = this.H;
                backStackRecord.f21722n = this.I;
                backStackRecord.f21723o = this.J;
                backStackRecord.f21724p = this.K;
                backStackRecord.f21725q = this.L;
                backStackRecord.f21726r = this.M;
                return;
            }
        }
    }

    public BackStackRecord b(FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        a(backStackRecord);
        backStackRecord.f21490v = this.F;
        for (int i2 = 0; i2 < this.f21492A.size(); i2++) {
            String str = (String) this.f21492A.get(i2);
            if (str != null) {
                ((FragmentTransaction.Op) backStackRecord.f21711c.get(i2)).f21729b = fragmentManager.i0(str);
            }
        }
        backStackRecord.s(1);
        return backStackRecord;
    }

    public BackStackRecord c(FragmentManager fragmentManager, Map map) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        a(backStackRecord);
        for (int i2 = 0; i2 < this.f21492A.size(); i2++) {
            String str = (String) this.f21492A.get(i2);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment != null) {
                    ((FragmentTransaction.Op) backStackRecord.f21711c.get(i2)).f21729b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.E + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return backStackRecord;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f21494z);
        parcel.writeStringList(this.f21492A);
        parcel.writeIntArray(this.f21493B);
        parcel.writeIntArray(this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        TextUtils.writeToParcel(this.H, parcel, 0);
        parcel.writeInt(this.I);
        TextUtils.writeToParcel(this.J, parcel, 0);
        parcel.writeStringList(this.K);
        parcel.writeStringList(this.L);
        parcel.writeInt(this.M ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f21494z = parcel.createIntArray();
        this.f21492A = parcel.createStringArrayList();
        this.f21493B = parcel.createIntArray();
        this.C = parcel.createIntArray();
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.H = (CharSequence) creator.createFromParcel(parcel);
        this.I = parcel.readInt();
        this.J = (CharSequence) creator.createFromParcel(parcel);
        this.K = parcel.createStringArrayList();
        this.L = parcel.createStringArrayList();
        this.M = parcel.readInt() != 0;
    }
}
