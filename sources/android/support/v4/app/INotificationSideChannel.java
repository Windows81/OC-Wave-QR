package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface INotificationSideChannel extends IInterface {

    /* renamed from: g  reason: collision with root package name */
    public static final String f15g = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static class Default implements INotificationSideChannel {
        public void I0(String str) {
        }

        public void L1(String str, int i2, String str2) {
        }

        public void M2(String str, int i2, String str2, Notification notification) {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        public static class Proxy implements INotificationSideChannel {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f16l;

            public Proxy(IBinder iBinder) {
                this.f16l = iBinder;
            }

            public void I0(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f15g);
                    obtain.writeString(str);
                    this.f16l.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void L1(String str, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f15g);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    this.f16l.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void M2(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(INotificationSideChannel.f15g);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    _Parcel.d(obtain, notification, 0);
                    this.f16l.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f16l;
            }
        }

        public static INotificationSideChannel J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.f15g);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = INotificationSideChannel.f15g;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 1) {
                M2(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) _Parcel.c(parcel, Notification.CREATOR));
            } else if (i2 == 2) {
                L1(parcel.readString(), parcel.readInt(), parcel.readString());
            } else if (i2 != 3) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                I0(parcel.readString());
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

    void I0(String str);

    void L1(String str, int i2, String str2);

    void M2(String str, int i2, String str2, Notification notification);
}
