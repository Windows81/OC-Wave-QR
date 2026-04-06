package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator {

    /* renamed from: a  reason: collision with root package name */
    public final FrameMetricsBaseImpl f19488a;

    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {

        /* renamed from: e  reason: collision with root package name */
        public static HandlerThread f19489e;

        /* renamed from: f  reason: collision with root package name */
        public static Handler f19490f;

        /* renamed from: a  reason: collision with root package name */
        public int f19491a;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f19492b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f19493c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f19494d = new Window.OnFrameMetricsAvailableListener() {
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                FrameMetricsApi24Impl frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.f19491a & 1) != 0) {
                    frameMetricsApi24Impl.e(frameMetricsApi24Impl.f19492b[0], frameMetrics.getMetric(8));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl2 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl2.f19491a & 2) != 0) {
                    frameMetricsApi24Impl2.e(frameMetricsApi24Impl2.f19492b[1], frameMetrics.getMetric(1));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl3 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl3.f19491a & 4) != 0) {
                    frameMetricsApi24Impl3.e(frameMetricsApi24Impl3.f19492b[2], frameMetrics.getMetric(3));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl4 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl4.f19491a & 8) != 0) {
                    frameMetricsApi24Impl4.e(frameMetricsApi24Impl4.f19492b[3], frameMetrics.getMetric(4));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl5 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl5.f19491a & 16) != 0) {
                    frameMetricsApi24Impl5.e(frameMetricsApi24Impl5.f19492b[4], frameMetrics.getMetric(5));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl6 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl6.f19491a & 64) != 0) {
                    frameMetricsApi24Impl6.e(frameMetricsApi24Impl6.f19492b[6], frameMetrics.getMetric(7));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl7 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl7.f19491a & 32) != 0) {
                    frameMetricsApi24Impl7.e(frameMetricsApi24Impl7.f19492b[5], frameMetrics.getMetric(6));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl8 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl8.f19491a & 128) != 0) {
                    frameMetricsApi24Impl8.e(frameMetricsApi24Impl8.f19492b[7], frameMetrics.getMetric(0));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl9 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl9.f19491a & 256) != 0) {
                    frameMetricsApi24Impl9.e(frameMetricsApi24Impl9.f19492b[8], frameMetrics.getMetric(2));
                }
            }
        };

        public FrameMetricsApi24Impl(int i2) {
            this.f19491a = i2;
        }

        public void a(Activity activity) {
            if (f19489e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f19489e = handlerThread;
                handlerThread.start();
                f19490f = new Handler(f19489e.getLooper());
            }
            for (int i2 = 0; i2 <= 8; i2++) {
                SparseIntArray[] sparseIntArrayArr = this.f19492b;
                if (sparseIntArrayArr[i2] == null && (this.f19491a & (1 << i2)) != 0) {
                    sparseIntArrayArr[i2] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f19494d, f19490f);
            this.f19493c.add(new WeakReference(activity));
        }

        public SparseIntArray[] b() {
            return this.f19492b;
        }

        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f19493c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f19493c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f19494d);
            return this.f19492b;
        }

        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f19492b;
            this.f19492b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public void e(SparseIntArray sparseIntArray, long j2) {
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + j2) / 1000000);
                if (j2 >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }

    public static class FrameMetricsBaseImpl {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f19488a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f19488a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f19488a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f19488a.d();
    }

    public FrameMetricsAggregator(int i2) {
        this.f19488a = new FrameMetricsApi24Impl(i2);
    }
}
