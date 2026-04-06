package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface IResultReceiver extends IInterface {

    /* renamed from: i  reason: collision with root package name */
    public static final String f17i = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static class Default implements IResultReceiver {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver {

        public static class Proxy implements IResultReceiver {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f18l;

            public Proxy(IBinder iBinder) {
                this.f18l = iBinder;
            }

            public IBinder asBinder() {
                return this.f18l;
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver.f17i);
        }

        public static IResultReceiver J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.f17i);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) ? new Proxy(iBinder) : (IResultReceiver) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IResultReceiver.f17i;
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
