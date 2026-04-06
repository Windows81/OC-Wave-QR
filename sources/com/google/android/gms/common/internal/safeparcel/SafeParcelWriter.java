package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class SafeParcelWriter {
    public static void A(Parcel parcel, int i2, List list, boolean z2) {
        if (list != null) {
            int B2 = B(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    E(parcel, parcelable, 0);
                }
            }
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static int B(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void C(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void D(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static void E(Parcel parcel, Parcelable parcelable, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return B(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z2) {
        D(parcel, i2, 4);
        parcel.writeInt(z2 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Boolean bool, boolean z2) {
        if (bool != null) {
            D(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void e(Parcel parcel, int i2, Bundle bundle, boolean z2) {
        if (bundle != null) {
            int B2 = B(parcel, i2);
            parcel.writeBundle(bundle);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void f(Parcel parcel, int i2, byte b2) {
        D(parcel, i2, 4);
        parcel.writeInt(b2);
    }

    public static void g(Parcel parcel, int i2, byte[] bArr, boolean z2) {
        if (bArr != null) {
            int B2 = B(parcel, i2);
            parcel.writeByteArray(bArr);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void h(Parcel parcel, int i2, byte[][] bArr, boolean z2) {
        if (bArr != null) {
            int B2 = B(parcel, i2);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void i(Parcel parcel, int i2, double d2) {
        D(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void j(Parcel parcel, int i2, Double d2, boolean z2) {
        if (d2 != null) {
            D(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void k(Parcel parcel, int i2, float f2) {
        D(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void l(Parcel parcel, int i2, Float f2, boolean z2) {
        if (f2 != null) {
            D(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void m(Parcel parcel, int i2, IBinder iBinder, boolean z2) {
        if (iBinder != null) {
            int B2 = B(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void n(Parcel parcel, int i2, int i3) {
        D(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void o(Parcel parcel, int i2, int[] iArr, boolean z2) {
        if (iArr != null) {
            int B2 = B(parcel, i2);
            parcel.writeIntArray(iArr);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void p(Parcel parcel, int i2, List list, boolean z2) {
        if (list != null) {
            int B2 = B(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel.writeInt(((Integer) list.get(i3)).intValue());
            }
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void q(Parcel parcel, int i2, Integer num, boolean z2) {
        if (num != null) {
            D(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void r(Parcel parcel, int i2, List list, boolean z2) {
        if (list != null) {
            int B2 = B(parcel, i2);
            parcel.writeList(list);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void s(Parcel parcel, int i2, long j2) {
        D(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void t(Parcel parcel, int i2, Long l2, boolean z2) {
        if (l2 != null) {
            D(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void u(Parcel parcel, int i2, Parcel parcel2, boolean z2) {
        if (parcel2 != null) {
            int B2 = B(parcel, i2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void v(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z2) {
        if (parcelable != null) {
            int B2 = B(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void w(Parcel parcel, int i2, String str, boolean z2) {
        if (str != null) {
            int B2 = B(parcel, i2);
            parcel.writeString(str);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void x(Parcel parcel, int i2, String[] strArr, boolean z2) {
        if (strArr != null) {
            int B2 = B(parcel, i2);
            parcel.writeStringArray(strArr);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void y(Parcel parcel, int i2, List list, boolean z2) {
        if (list != null) {
            int B2 = B(parcel, i2);
            parcel.writeStringList(list);
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }

    public static void z(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3, boolean z2) {
        if (parcelableArr != null) {
            int B2 = B(parcel, i2);
            parcel.writeInt(r7);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    E(parcel, parcelable, i3);
                }
            }
            C(parcel, B2);
        } else if (z2) {
            D(parcel, i2, 0);
        }
    }
}
