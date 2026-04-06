package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zznn implements Iterator {

    /* renamed from: A  reason: collision with root package name */
    public boolean f25707A;

    /* renamed from: B  reason: collision with root package name */
    public Iterator f25708B;
    public final /* synthetic */ zzne C;

    /* renamed from: z  reason: collision with root package name */
    public int f25709z;

    public final Iterator b() {
        if (this.f25708B == null) {
            this.f25708B = this.C.f25697B.entrySet().iterator();
        }
        return this.f25708B;
    }

    public final boolean hasNext() {
        return this.f25709z + 1 < this.C.f25696A || (!this.C.f25697B.isEmpty() && b().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f25707A = true;
        int i2 = this.f25709z + 1;
        this.f25709z = i2;
        return i2 < this.C.f25696A ? (zznk) this.C.f25698z[this.f25709z] : (Map.Entry) b().next();
    }

    public final void remove() {
        if (this.f25707A) {
            this.f25707A = false;
            this.C.s();
            if (this.f25709z < this.C.f25696A) {
                zzne zzne = this.C;
                int i2 = this.f25709z;
                this.f25709z = i2 - 1;
                Object unused = zzne.i(i2);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public zznn(zzne zzne) {
        this.C = zzne;
        this.f25709z = -1;
    }
}
