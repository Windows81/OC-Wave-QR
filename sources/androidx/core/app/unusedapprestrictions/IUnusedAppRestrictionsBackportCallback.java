package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    /* renamed from: j  reason: collision with root package name */
    public static final String f19687j = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        public static class Proxy implements IUnusedAppRestrictionsBackportCallback {

            /* renamed from: l  reason: collision with root package name */
            public IBinder f19688l;

            public Proxy(IBinder iBinder) {
                this.f19688l = iBinder;
            }

            public IBinder asBinder() {
                return this.f19688l;
            }
        }

        public Stub() {
            attachInterface(this, IUnusedAppRestrictionsBackportCallback.f19687j);
        }

        public static IUnusedAppRestrictionsBackportCallback J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f19687j);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new Proxy(iBinder) : (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IUnusedAppRestrictionsBackportCallback.f19687j;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                x2(z3, z2);
                return true;
            }
        }
    }

    void x2(boolean z2, boolean z3);
}
