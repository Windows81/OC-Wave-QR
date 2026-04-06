package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface ITrustedWebActivityService extends IInterface {

    /* renamed from: f  reason: collision with root package name */
    public static final String f13f = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static class Default implements ITrustedWebActivityService {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class Proxy implements ITrustedWebActivityService {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f14l;

            public Proxy(IBinder iBinder) {
                this.f14l = iBinder;
            }

            public IBinder asBinder() {
                return this.f14l;
            }
        }

        public static ITrustedWebActivityService J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.f13f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityService)) ? new Proxy(iBinder) : (ITrustedWebActivityService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = ITrustedWebActivityService.f13f;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    Bundle h2 = h2((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, h2, 1);
                    break;
                case 3:
                    d2((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    int I1 = I1();
                    parcel2.writeNoException();
                    parcel2.writeInt(I1);
                    break;
                case 5:
                    Bundle q0 = q0();
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, q0, 1);
                    break;
                case 6:
                    Bundle M1 = M1((Bundle) _Parcel.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, M1, 1);
                    break;
                case 7:
                    Bundle K1 = K1();
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, K1, 1);
                    break;
                case 9:
                    Bundle Z0 = Z0(parcel.readString(), (Bundle) _Parcel.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    _Parcel.d(parcel2, Z0, 1);
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

    int I1();

    Bundle K1();

    Bundle M1(Bundle bundle);

    Bundle Z0(String str, Bundle bundle, IBinder iBinder);

    void d2(Bundle bundle);

    Bundle h2(Bundle bundle);

    Bundle q0();
}
