package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface ITrustedWebActivityCallback extends IInterface {

    /* renamed from: e  reason: collision with root package name */
    public static final String f11e = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public static class Default implements ITrustedWebActivityCallback {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class Proxy implements ITrustedWebActivityCallback {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f12l;

            public Proxy(IBinder iBinder) {
                this.f12l = iBinder;
            }

            public IBinder asBinder() {
                return this.f12l;
            }
        }

        public static ITrustedWebActivityCallback J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.f11e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityCallback)) ? new Proxy(iBinder) : (ITrustedWebActivityCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ITrustedWebActivityCallback.f11e;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i2 != 2) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                J2(parcel.readString(), (Bundle) _Parcel.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            }
        }
    }

    public static class _Parcel {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void J2(String str, Bundle bundle);
}
