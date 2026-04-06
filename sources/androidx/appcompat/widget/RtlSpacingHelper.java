package androidx.appcompat.widget;

class RtlSpacingHelper {

    /* renamed from: a  reason: collision with root package name */
    public int f1245a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1246b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1247c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1248d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1249e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1250f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1251g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1252h = false;

    public int a() {
        return this.f1251g ? this.f1245a : this.f1246b;
    }

    public int b() {
        return this.f1245a;
    }

    public int c() {
        return this.f1246b;
    }

    public int d() {
        return this.f1251g ? this.f1246b : this.f1245a;
    }

    public void e(int i2, int i3) {
        this.f1252h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1249e = i2;
            this.f1245a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1250f = i3;
            this.f1246b = i3;
        }
    }

    public void f(boolean z2) {
        if (z2 != this.f1251g) {
            this.f1251g = z2;
            if (!this.f1252h) {
                this.f1245a = this.f1249e;
                this.f1246b = this.f1250f;
            } else if (z2) {
                int i2 = this.f1248d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1249e;
                }
                this.f1245a = i2;
                int i3 = this.f1247c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1250f;
                }
                this.f1246b = i3;
            } else {
                int i4 = this.f1247c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1249e;
                }
                this.f1245a = i4;
                int i5 = this.f1248d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f1250f;
                }
                this.f1246b = i5;
            }
        }
    }

    public void g(int i2, int i3) {
        this.f1247c = i2;
        this.f1248d = i3;
        this.f1252h = true;
        if (this.f1251g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1245a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1246b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1245a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1246b = i3;
        }
    }
}
