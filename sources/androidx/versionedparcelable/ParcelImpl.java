package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i2) {
            return new ParcelImpl[i2];
        }
    };

    /* renamed from: z  reason: collision with root package name */
    public final VersionedParcelable f23037z;

    public ParcelImpl(Parcel parcel) {
        this.f23037z = new VersionedParcelParcel(parcel).u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        new VersionedParcelParcel(parcel).L(this.f23037z);
    }
}
