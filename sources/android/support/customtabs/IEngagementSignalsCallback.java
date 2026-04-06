package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface IEngagementSignalsCallback extends IInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final String f7c = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public static class Default implements IEngagementSignalsCallback {
        public void E(boolean z2, Bundle bundle) {
        }

        public void F(boolean z2, Bundle bundle) {
        }

        public void M(int i2, Bundle bundle) {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        public static class Proxy implements IEngagementSignalsCallback {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f8l;

            public Proxy(IBinder iBinder) {
                this.f8l = iBinder;
            }

            public void E(boolean z2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f7c);
                    obtain.writeInt(z2 ? 1 : 0);
                    _Parcel.d(obtain, bundle, 0);
                    this.f8l.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void F(boolean z2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f7c);
                    obtain.writeInt(z2 ? 1 : 0);
                    _Parcel.d(obtain, bundle, 0);
                    this.f8l.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void M(int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.f7c);
                    obtain.writeInt(i2);
                    _Parcel.d(obtain, bundle, 0);
                    this.f8l.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f8l;
            }
        }

        public static IEngagementSignalsCallback J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.f7c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IEngagementSignalsCallback)) ? new Proxy(iBinder) : (IEngagementSignalsCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IEngagementSignalsCallback.f7c;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            boolean z2 = false;
            if (i2 == 2) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                F(z2, (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
            } else if (i2 == 3) {
                M(parcel.readInt(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
            } else if (i2 != 4) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                E(z2, (Bundle) _Parcel.c(parcel, Bundle.CREATOR));
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

    void E(boolean z2, Bundle bundle);

    void F(boolean z2, Bundle bundle);

    void M(int i2, Bundle bundle);
}
