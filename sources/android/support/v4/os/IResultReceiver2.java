package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface IResultReceiver2 extends IInterface {

    /* renamed from: h  reason: collision with root package name */
    public static final String f19h = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public static class Default implements IResultReceiver2 {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver2 {

        public static class Proxy implements IResultReceiver2 {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f20l;

            public IBinder asBinder() {
                return this.f20l;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IResultReceiver2.f19h;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                Q(parcel.readInt(), (Bundle) _Parcel.b(parcel, Bundle.CREATOR));
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

    void Q(int i2, Bundle bundle);
}
