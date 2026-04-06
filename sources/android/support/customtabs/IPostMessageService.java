package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;

public interface IPostMessageService extends IInterface {

    /* renamed from: d  reason: collision with root package name */
    public static final String f9d = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public static class Default implements IPostMessageService {
        public IBinder asBinder() {
            return null;
        }

        public void b1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements IPostMessageService {

        public static class Proxy implements IPostMessageService {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f10l;

            public Proxy(IBinder iBinder) {
                this.f10l = iBinder;
            }

            public IBinder asBinder() {
                return this.f10l;
            }

            public void b1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPostMessageService.f9d);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.d(obtain, bundle, 0);
                    this.f10l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IPostMessageService J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.f9d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPostMessageService)) ? new Proxy(iBinder) : (IPostMessageService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IPostMessageService.f9d;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 2) {
                b1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            } else if (i2 != 3) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                z1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class _Parcel {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i2) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i2);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void b1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    void z1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);
}
