package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    public static final Builder J = new zab(new String[0], (String) null);

    /* renamed from: A  reason: collision with root package name */
    public final String[] f24793A;

    /* renamed from: B  reason: collision with root package name */
    public Bundle f24794B;
    public final CursorWindow[] C;
    public final int D;
    public final Bundle E;
    public int[] F;
    public int G;
    public boolean H = false;
    public boolean I = true;

    /* renamed from: z  reason: collision with root package name */
    public final int f24795z;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f24796a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f24797b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f24798c = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zac) {
            this.f24796a = (String[]) Preconditions.m(strArr);
        }
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.f24795z = i2;
        this.f24793A = strArr;
        this.C = cursorWindowArr;
        this.D = i3;
        this.E = bundle;
    }

    public byte[] H(String str, int i2, int i3) {
        o0(str, i2);
        return this.C[i3].getBlob(i2, this.f24794B.getInt(str));
    }

    public Bundle Q() {
        return this.E;
    }

    public int S() {
        return this.D;
    }

    public String X(String str, int i2, int i3) {
        o0(str, i2);
        return this.C[i3].getString(i2, this.f24794B.getInt(str));
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.H) {
                    this.H = true;
                    int i2 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.C;
                        if (i2 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i2].close();
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f0(int i2) {
        int length;
        int i3 = 0;
        Preconditions.q(i2 >= 0 && i2 < this.G);
        while (true) {
            int[] iArr = this.F;
            length = iArr.length;
            if (i3 >= length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == length ? i3 - 1 : i3;
    }

    public final void finalize() {
        try {
            if (this.I && this.C.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.G;
    }

    public boolean isClosed() {
        boolean z2;
        synchronized (this) {
            z2 = this.H;
        }
        return z2;
    }

    public final void m0() {
        this.f24794B = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f24793A;
            if (i3 >= strArr.length) {
                break;
            }
            this.f24794B.putInt(strArr[i3], i3);
            i3++;
        }
        this.F = new int[this.C.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.C;
            if (i2 < cursorWindowArr.length) {
                this.F[i2] = i4;
                i4 += this.C[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.G = i4;
                return;
            }
        }
    }

    public final void o0(String str, int i2) {
        Bundle bundle = this.f24794B;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.G) {
            throw new CursorIndexOutOfBoundsException(i2, this.G);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String[] strArr = this.f24793A;
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, strArr, false);
        SafeParcelWriter.z(parcel, 2, this.C, i2, false);
        SafeParcelWriter.n(parcel, 3, S());
        SafeParcelWriter.e(parcel, 4, Q(), false);
        SafeParcelWriter.n(parcel, 1000, this.f24795z);
        SafeParcelWriter.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
