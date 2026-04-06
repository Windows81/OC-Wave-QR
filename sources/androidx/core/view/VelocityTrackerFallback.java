package androidx.core.view;

import android.view.MotionEvent;

class VelocityTrackerFallback {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f20255a = new float[20];

    /* renamed from: b  reason: collision with root package name */
    public final long[] f20256b = new long[20];

    /* renamed from: c  reason: collision with root package name */
    public float f20257c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f20258d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f20259e = 0;

    public static float f(float f2) {
        return (f2 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt((double) (Math.abs(f2) * 2.0f)));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f20258d != 0 && eventTime - this.f20256b[this.f20259e] > 40) {
            b();
        }
        int i2 = (this.f20259e + 1) % 20;
        this.f20259e = i2;
        int i3 = this.f20258d;
        if (i3 != 20) {
            this.f20258d = i3 + 1;
        }
        this.f20255a[i2] = motionEvent.getAxisValue(26);
        this.f20256b[this.f20259e] = eventTime;
    }

    public final void b() {
        this.f20258d = 0;
        this.f20257c = 0.0f;
    }

    public void c(int i2, float f2) {
        float e2 = e() * ((float) i2);
        this.f20257c = e2;
        if (e2 < (-Math.abs(f2))) {
            this.f20257c = -Math.abs(f2);
        } else if (this.f20257c > Math.abs(f2)) {
            this.f20257c = Math.abs(f2);
        }
    }

    public float d(int i2) {
        if (i2 != 26) {
            return 0.0f;
        }
        return this.f20257c;
    }

    public final float e() {
        long[] jArr;
        long j2;
        int i2 = this.f20258d;
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.f20259e;
        int i4 = ((i3 + 20) - (i2 - 1)) % 20;
        long j3 = this.f20256b[i3];
        while (true) {
            jArr = this.f20256b;
            j2 = jArr[i4];
            if (j3 - j2 <= 100) {
                break;
            }
            this.f20258d--;
            i4 = (i4 + 1) % 20;
        }
        int i5 = this.f20258d;
        if (i5 < 2) {
            return 0.0f;
        }
        if (i5 == 2) {
            int i6 = (i4 + 1) % 20;
            long j4 = jArr[i6];
            if (j2 == j4) {
                return 0.0f;
            }
            return this.f20255a[i6] / ((float) (j4 - j2));
        }
        float f2 = 0.0f;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f20258d - 1; i8++) {
            int i9 = i8 + i4;
            long[] jArr2 = this.f20256b;
            long j5 = jArr2[i9 % 20];
            int i10 = (i9 + 1) % 20;
            if (jArr2[i10] != j5) {
                i7++;
                float f3 = f(f2);
                float f4 = this.f20255a[i10] / ((float) (this.f20256b[i10] - j5));
                f2 += (f4 - f3) * Math.abs(f4);
                if (i7 == 1) {
                    f2 *= 0.5f;
                }
            }
        }
        return f(f2);
    }
}
