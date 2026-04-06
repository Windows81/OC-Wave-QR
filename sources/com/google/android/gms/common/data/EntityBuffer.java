package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: A  reason: collision with root package name */
    public boolean f24799A;

    /* renamed from: B  reason: collision with root package name */
    public ArrayList f24800B;

    public abstract Object A(int i2, int i3);

    public abstract String C();

    public final int D(int i2) {
        if (i2 >= 0 && i2 < this.f24800B.size()) {
            return ((Integer) this.f24800B.get(i2)).intValue();
        }
        throw new IllegalArgumentException("Position " + i2 + " is out of bounds for this buffer");
    }

    public final void E() {
        synchronized (this) {
            try {
                if (!this.f24799A) {
                    int count = ((DataHolder) Preconditions.m(this.f24782z)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.f24800B = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String C = C();
                        String X = this.f24782z.X(C, 0, this.f24782z.f0(0));
                        int i2 = 1;
                        while (i2 < count) {
                            int f0 = this.f24782z.f0(i2);
                            String X2 = this.f24782z.X(C, i2, f0);
                            if (X2 != null) {
                                if (!X2.equals(X)) {
                                    this.f24800B.add(Integer.valueOf(i2));
                                    X = X2;
                                }
                                i2++;
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: " + C + ", at row: " + i2 + ", for window: " + f0);
                            }
                        }
                    }
                    this.f24799A = true;
                }
            } finally {
            }
        }
    }

    public final Object get(int i2) {
        int intValue;
        int intValue2;
        E();
        int D = D(i2);
        int i3 = 0;
        if (i2 >= 0 && i2 != this.f24800B.size()) {
            if (i2 == this.f24800B.size() - 1) {
                intValue = ((DataHolder) Preconditions.m(this.f24782z)).getCount();
                intValue2 = ((Integer) this.f24800B.get(i2)).intValue();
            } else {
                intValue = ((Integer) this.f24800B.get(i2 + 1)).intValue();
                intValue2 = ((Integer) this.f24800B.get(i2)).intValue();
            }
            int i4 = intValue - intValue2;
            if (i4 == 1) {
                int D2 = D(i2);
                int f0 = ((DataHolder) Preconditions.m(this.f24782z)).f0(D2);
                String m2 = m();
                if (m2 == null || this.f24782z.X(m2, D2, f0) != null) {
                    i3 = 1;
                }
            } else {
                i3 = i4;
            }
        }
        return A(D, i3);
    }

    public int getCount() {
        E();
        return this.f24800B.size();
    }

    public String m() {
        return null;
    }
}
