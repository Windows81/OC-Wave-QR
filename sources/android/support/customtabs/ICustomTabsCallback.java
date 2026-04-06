package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface ICustomTabsCallback extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3a = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static class Default implements ICustomTabsCallback {
        public void E2(String str, Bundle bundle) {
        }

        public void H1(int i2, int i3, Bundle bundle) {
        }

        public void L2(Bundle bundle) {
        }

        public void P2(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        public Bundle Q0(String str, Bundle bundle) {
            return null;
        }

        public void a2(String str, Bundle bundle) {
        }

        public IBinder asBinder() {
            return null;
        }

        public void k2(Bundle bundle) {
        }

        public void o2(int i2, Bundle bundle) {
        }

        public void q1(Bundle bundle) {
        }

        public void r0(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        }

        public void y1(Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        public static class Proxy implements ICustomTabsCallback {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f4l;

            public Proxy(IBinder iBinder) {
                this.f4l = iBinder;
            }

            public void E2(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeString(str);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void H1(int i2, int i3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void L2(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void P2(int i2, Uri uri, boolean z2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeInt(i2);
                    _Parcel.d(obtain, uri, 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public Bundle Q0(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeString(str);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.c(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a2(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeString(str);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4l;
            }

            public void k2(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void o2(int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeInt(i2);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void q1(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void r0(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void y1(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsCallback.f3a);
                    _Parcel.d(obtain, bundle, 0);
                    this.f4l.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static ICustomTabsCallback J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.f3a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsCallback)) ? new Proxy(iBinder) : (ICustomTabsCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ICustomTabsCallback.f3a;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    o2(parcel.readInt(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    a2(parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 4:
                    L2((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    E2(parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    P2(parcel.readInt(), (Uri) _Parcel.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 7:
                    Bundle Q0 = Q0(parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, Q0, 1);
                    break;
                case 8:
                    H1(parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 9:
                    k2((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 10:
                    r0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 11:
                    q1((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    break;
                case 12:
                    y1((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
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

    void E2(String str, Bundle bundle);

    void H1(int i2, int i3, Bundle bundle);

    void L2(Bundle bundle);

    void P2(int i2, Uri uri, boolean z2, Bundle bundle);

    Bundle Q0(String str, Bundle bundle);

    void a2(String str, Bundle bundle);

    void k2(Bundle bundle);

    void o2(int i2, Bundle bundle);

    void q1(Bundle bundle);

    void r0(int i2, int i3, int i4, int i5, int i6, Bundle bundle);

    void y1(Bundle bundle);
}
