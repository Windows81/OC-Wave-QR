package com.google.android.gms.measurement.internal;

final class zzgl implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26337A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f26338B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ zzgi E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f26339z;

    public zzgl(zzgi zzgi, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f26339z = i2;
        this.f26337A = str;
        this.f26338B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = zzgi;
    }

    public final void run() {
        zzgu F = this.E.f26587a.F();
        if (!F.s()) {
            this.E.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.E.f26321c == 0) {
            if (this.E.d().v()) {
                this.E.f26321c = 'C';
            } else {
                this.E.f26321c = 'c';
            }
        }
        if (this.E.f26322d < 0) {
            this.E.f26322d = 102001;
        }
        String str = "2" + "01VDIWEA?".charAt(this.f26339z) + this.E.f26321c + this.E.f26322d + ":" + zzgi.x(true, this.f26337A, this.f26338B, this.C, this.D);
        if (str.length() > 1024) {
            str = this.f26337A.substring(0, 1024);
        }
        zzgy zzgy = F.f26359f;
        if (zzgy != null) {
            zzgy.b(str, 1);
        }
    }
}
