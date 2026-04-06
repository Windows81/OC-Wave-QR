package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class DifferentialMotionFlingController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f20211a;

    /* renamed from: b  reason: collision with root package name */
    public final DifferentialMotionFlingTarget f20212b;

    /* renamed from: c  reason: collision with root package name */
    public final FlingVelocityThresholdCalculator f20213c;

    /* renamed from: d  reason: collision with root package name */
    public final DifferentialVelocityProvider f20214d;

    /* renamed from: e  reason: collision with root package name */
    public VelocityTracker f20215e;

    /* renamed from: f  reason: collision with root package name */
    public float f20216f;

    /* renamed from: g  reason: collision with root package name */
    public int f20217g;

    /* renamed from: h  reason: collision with root package name */
    public int f20218h;

    /* renamed from: i  reason: collision with root package name */
    public int f20219i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f20220j;

    public interface DifferentialVelocityProvider {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2);
    }

    public interface FlingVelocityThresholdCalculator {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i2);
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this(context, differentialMotionFlingTarget, new C0361j(), new C0362k());
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = ViewConfigurationCompat.g(context, viewConfiguration, motionEvent.getDeviceId(), i2, motionEvent.getSource());
        iArr[1] = ViewConfigurationCompat.f(context, viewConfiguration, motionEvent.getDeviceId(), i2, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i2) {
        VelocityTrackerCompat.a(velocityTracker, motionEvent);
        VelocityTrackerCompat.b(velocityTracker, 1000);
        return VelocityTrackerCompat.d(velocityTracker, i2);
    }

    public final boolean d(MotionEvent motionEvent, int i2) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f20218h == source && this.f20219i == deviceId && this.f20217g == i2) {
            return false;
        }
        this.f20213c.a(this.f20211a, this.f20220j, motionEvent, i2);
        this.f20218h = source;
        this.f20219i = deviceId;
        this.f20217g = i2;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i2) {
        if (this.f20215e == null) {
            this.f20215e = VelocityTracker.obtain();
        }
        return this.f20214d.a(this.f20215e, motionEvent, i2);
    }

    public void g(MotionEvent motionEvent, int i2) {
        boolean d2 = d(motionEvent, i2);
        if (this.f20220j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f20215e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f20215e = null;
                return;
            }
            return;
        }
        float e2 = e(motionEvent, i2) * this.f20212b.b();
        float signum = Math.signum(e2);
        float f2 = 0.0f;
        if (d2 || !(signum == Math.signum(this.f20216f) || signum == 0.0f)) {
            this.f20212b.c();
        }
        float abs = Math.abs(e2);
        int[] iArr = this.f20220j;
        if (abs >= ((float) iArr[0])) {
            int i3 = iArr[1];
            float max = Math.max((float) (-i3), Math.min(e2, (float) i3));
            if (this.f20212b.a(max)) {
                f2 = max;
            }
            this.f20216f = f2;
        }
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget, FlingVelocityThresholdCalculator flingVelocityThresholdCalculator, DifferentialVelocityProvider differentialVelocityProvider) {
        this.f20217g = -1;
        this.f20218h = -1;
        this.f20219i = -1;
        this.f20220j = new int[]{Integer.MAX_VALUE, 0};
        this.f20211a = context;
        this.f20212b = differentialMotionFlingTarget;
        this.f20213c = flingVelocityThresholdCalculator;
        this.f20214d = differentialVelocityProvider;
    }
}
