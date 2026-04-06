package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

public interface ICustomTabsService extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f5b = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static class Default implements ICustomTabsService {
        public IBinder asBinder() {
            return null;
        }

        public boolean i1(long j2) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsService {

        public static class Proxy implements ICustomTabsService {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f6l;

            public Proxy(IBinder iBinder) {
                this.f6l = iBinder;
            }

            public IBinder asBinder() {
                return this.f6l;
            }

            public boolean i1(long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f5b);
                    obtain.writeLong(j2);
                    boolean z2 = false;
                    this.f6l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICustomTabsService J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.f5b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsService)) ? new Proxy(iBinder) : (ICustomTabsService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ICustomTabsService.f5b;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    boolean i1 = i1(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(i1 ? 1 : 0);
                    break;
                case 3:
                    boolean T1 = T1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(T1 ? 1 : 0);
                    break;
                case 4:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean g0 = g0(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Uri) _Parcel.c(parcel, Uri.CREATOR), (Bundle) _Parcel.c(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(g0 ? 1 : 0);
                    break;
                case 5:
                    Bundle T0 = T0(parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, T0, 1);
                    break;
                case 6:
                    boolean l2 = l2(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(l2 ? 1 : 0);
                    break;
                case 7:
                    boolean u2 = u2(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Uri) _Parcel.c(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(u2 ? 1 : 0);
                    break;
                case 8:
                    int N1 = N1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(N1);
                    break;
                case 9:
                    boolean l0 = l0(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), parcel.readInt(), (Uri) _Parcel.c(parcel, Uri.CREATOR), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(l0 ? 1 : 0);
                    break;
                case 10:
                    boolean X1 = X1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(X1 ? 1 : 0);
                    break;
                case 11:
                    boolean U1 = U1(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Uri) _Parcel.c(parcel, Uri.CREATOR), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(U1 ? 1 : 0);
                    break;
                case 12:
                    boolean y0 = y0(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Uri) _Parcel.c(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(y0 ? 1 : 0);
                    break;
                case 13:
                    boolean Q2 = Q2(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(Q2 ? 1 : 0);
                    break;
                case 14:
                    boolean g2 = g2(ICustomTabsCallback.Stub.J(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(g2 ? 1 : 0);
                    break;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
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

    int N1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean Q2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    Bundle T0(String str, Bundle bundle);

    boolean T1(ICustomTabsCallback iCustomTabsCallback);

    boolean U1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean X1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean g0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list);

    boolean g2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean i1(long j2);

    boolean l0(ICustomTabsCallback iCustomTabsCallback, int i2, Uri uri, Bundle bundle);

    boolean l2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean u2(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    boolean y0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i2, Bundle bundle);
}
