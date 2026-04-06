package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;

class VersionedParcelParcel extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f23041d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f23042e;

    /* renamed from: f  reason: collision with root package name */
    public final int f23043f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23044g;

    /* renamed from: h  reason: collision with root package name */
    public final String f23045h;

    /* renamed from: i  reason: collision with root package name */
    public int f23046i;

    /* renamed from: j  reason: collision with root package name */
    public int f23047j;

    /* renamed from: k  reason: collision with root package name */
    public int f23048k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f23042e.writeInt(bArr.length);
            this.f23042e.writeByteArray(bArr);
            return;
        }
        this.f23042e.writeInt(-1);
    }

    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f23042e, 0);
    }

    public void E(int i2) {
        this.f23042e.writeInt(i2);
    }

    public void G(Parcelable parcelable) {
        this.f23042e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f23042e.writeString(str);
    }

    public void a() {
        int i2 = this.f23046i;
        if (i2 >= 0) {
            int i3 = this.f23041d.get(i2);
            int dataPosition = this.f23042e.dataPosition();
            this.f23042e.setDataPosition(i3);
            this.f23042e.writeInt(dataPosition - i3);
            this.f23042e.setDataPosition(dataPosition);
        }
    }

    public VersionedParcel b() {
        Parcel parcel = this.f23042e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f23047j;
        if (i2 == this.f23043f) {
            i2 = this.f23044g;
        }
        int i3 = i2;
        return new VersionedParcelParcel(parcel, dataPosition, i3, this.f23045h + "  ", this.f23038a, this.f23039b, this.f23040c);
    }

    public boolean g() {
        return this.f23042e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f23042e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f23042e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f23042e);
    }

    public boolean m(int i2) {
        while (this.f23047j < this.f23044g) {
            int i3 = this.f23048k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f23042e.setDataPosition(this.f23047j);
            int readInt = this.f23042e.readInt();
            this.f23048k = this.f23042e.readInt();
            this.f23047j += readInt;
        }
        return this.f23048k == i2;
    }

    public int o() {
        return this.f23042e.readInt();
    }

    public Parcelable q() {
        return this.f23042e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f23042e.readString();
    }

    public void w(int i2) {
        a();
        this.f23046i = i2;
        this.f23041d.put(i2, this.f23042e.dataPosition());
        E(0);
        E(i2);
    }

    public void y(boolean z2) {
        this.f23042e.writeInt(z2 ? 1 : 0);
    }

    public VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f23041d = new SparseIntArray();
        this.f23046i = -1;
        this.f23048k = -1;
        this.f23042e = parcel;
        this.f23043f = i2;
        this.f23044g = i3;
        this.f23047j = i2;
        this.f23045h = str;
    }
}
