package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    };

    /* renamed from: A  reason: collision with root package name */
    public final String f21678A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f21679B;
    public final int C;
    public final int D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final Bundle I;
    public final boolean J;
    public final int K;
    public Bundle L;

    /* renamed from: z  reason: collision with root package name */
    public final String f21680z;

    public FragmentState(Fragment fragment) {
        this.f21680z = fragment.getClass().getName();
        this.f21678A = fragment.E;
        this.f21679B = fragment.N;
        this.C = fragment.W;
        this.D = fragment.X;
        this.E = fragment.Y;
        this.F = fragment.b0;
        this.G = fragment.L;
        this.H = fragment.a0;
        this.I = fragment.F;
        this.J = fragment.Z;
        this.K = fragment.q0.ordinal();
    }

    public Fragment a(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment a2 = fragmentFactory.a(classLoader, this.f21680z);
        Bundle bundle = this.I;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.H1(this.I);
        a2.E = this.f21678A;
        a2.N = this.f21679B;
        a2.P = true;
        a2.W = this.C;
        a2.X = this.D;
        a2.Y = this.E;
        a2.b0 = this.F;
        a2.L = this.G;
        a2.a0 = this.H;
        a2.Z = this.J;
        a2.q0 = Lifecycle.State.values()[this.K];
        Bundle bundle2 = this.L;
        if (bundle2 != null) {
            a2.f21546A = bundle2;
        } else {
            a2.f21546A = new Bundle();
        }
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f21680z);
        sb.append(" (");
        sb.append(this.f21678A);
        sb.append(")}:");
        if (this.f21679B) {
            sb.append(" fromLayout");
        }
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        String str = this.E;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.E);
        }
        if (this.F) {
            sb.append(" retainInstance");
        }
        if (this.G) {
            sb.append(" removing");
        }
        if (this.H) {
            sb.append(" detached");
        }
        if (this.J) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f21680z);
        parcel.writeString(this.f21678A);
        parcel.writeInt(this.f21679B ? 1 : 0);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeBundle(this.I);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeBundle(this.L);
        parcel.writeInt(this.K);
    }

    public FragmentState(Parcel parcel) {
        this.f21680z = parcel.readString();
        this.f21678A = parcel.readString();
        boolean z2 = false;
        this.f21679B = parcel.readInt() != 0;
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.F = parcel.readInt() != 0;
        this.G = parcel.readInt() != 0;
        this.H = parcel.readInt() != 0;
        this.I = parcel.readBundle();
        this.J = parcel.readInt() != 0 ? true : z2;
        this.L = parcel.readBundle();
        this.K = parcel.readInt();
    }
}
