package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

public interface IUnusedAppRestrictionsBackportService extends IInterface {

    /* renamed from: k  reason: collision with root package name */
    public static final String f19689k = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    public static class Default implements IUnusedAppRestrictionsBackportService {
        public void J0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        public static class Proxy implements IUnusedAppRestrictionsBackportService {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f19690l;

            public Proxy(IBinder iBinder) {
                this.f19690l = iBinder;
            }

            public void J0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IUnusedAppRestrictionsBackportService.f19689k);
                    obtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.f19690l.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f19690l;
            }
        }

        public static IUnusedAppRestrictionsBackportService J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.f19689k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) ? new Proxy(iBinder) : (IUnusedAppRestrictionsBackportService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IUnusedAppRestrictionsBackportService.f19689k;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                J0(IUnusedAppRestrictionsBackportCallback.Stub.J(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    void J0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);
}
