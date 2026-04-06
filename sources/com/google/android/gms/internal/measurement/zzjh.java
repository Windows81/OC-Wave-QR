package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzji;
import java.io.IOException;

public abstract class zzjh<MessageType extends zzji<MessageType, BuilderType>, BuilderType extends zzjh<MessageType, BuilderType>> implements zzmk {
    public final /* synthetic */ zzmk A0(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public final /* synthetic */ zzmk Q(byte[] bArr, zzkp zzkp) {
        return l(bArr, 0, bArr.length, zzkp);
    }

    /* renamed from: j */
    public abstract zzjh p(zzkg zzkg, zzkp zzkp);

    public zzjh k(byte[] bArr, int i2, int i3) {
        try {
            zzkg d2 = zzkg.d(bArr, 0, i3, false);
            p(d2, zzkp.f25600c);
            d2.f(0);
            return this;
        } catch (zzlk e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(n("byte array"), e3);
        }
    }

    public zzjh l(byte[] bArr, int i2, int i3, zzkp zzkp) {
        try {
            zzkg d2 = zzkg.d(bArr, 0, i3, false);
            p(d2, zzkp);
            d2.f(0);
            return this;
        } catch (zzlk e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(n("byte array"), e3);
        }
    }

    public final String n(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: o */
    public abstract zzjh clone();
}
