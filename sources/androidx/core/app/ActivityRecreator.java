package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class ActivityRecreator {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f19469a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f19470b = b();

    /* renamed from: c  reason: collision with root package name */
    public static final Field f19471c = f();

    /* renamed from: d  reason: collision with root package name */
    public static final Method f19472d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f19473e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f19474f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f19475g = new Handler(Looper.getMainLooper());

    public static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {

        /* renamed from: A  reason: collision with root package name */
        public Activity f19482A;

        /* renamed from: B  reason: collision with root package name */
        public final int f19483B;
        public boolean C = false;
        public boolean D = false;
        public boolean E = false;

        /* renamed from: z  reason: collision with root package name */
        public Object f19484z;

        public LifecycleCheckCallbacks(Activity activity) {
            this.f19482A = activity;
            this.f19483B = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f19482A == activity) {
                this.f19482A = null;
                this.D = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.D && !this.E && !this.C && ActivityRecreator.h(this.f19484z, this.f19483B, activity)) {
                this.E = true;
                this.f19484z = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f19482A == activity) {
                this.C = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a2 = a();
        f19469a = a2;
        f19472d = d(a2);
        f19473e = c(a2);
        f19474f = e(a2);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class cls) {
        if (g() && cls != null) {
            Class<IBinder> cls2 = IBinder.class;
            Class<List> cls3 = List.class;
            Class<List> cls4 = List.class;
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{cls2, cls3, cls4, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean h(Object obj, int i2, Activity activity) {
        try {
            final Object obj2 = f19471c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i2) {
                    final Object obj3 = f19470b.get(activity);
                    f19475g.postAtFrontOfQueue(new Runnable() {
                        public void run() {
                            try {
                                Method method = ActivityRecreator.f19472d;
                                if (method != null) {
                                    method.invoke(obj3, new Object[]{obj2, Boolean.FALSE, "AppCompat recreation"});
                                } else {
                                    ActivityRecreator.f19473e.invoke(obj3, new Object[]{obj2, Boolean.FALSE});
                                }
                            } catch (RuntimeException e2) {
                                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                                    throw e2;
                                }
                            } catch (Throwable th) {
                                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                            }
                        }
                    });
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        final Application application;
        final LifecycleCheckCallbacks lifecycleCheckCallbacks;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f19474f == null) {
            return false;
        } else {
            if (f19473e == null && f19472d == null) {
                return false;
            }
            try {
                final Object obj2 = f19471c.get(activity);
                if (obj2 == null || (obj = f19470b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                lifecycleCheckCallbacks = new LifecycleCheckCallbacks(activity);
                application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                Handler handler = f19475g;
                handler.post(new Runnable() {
                    public void run() {
                        LifecycleCheckCallbacks.this.f19484z = obj2;
                    }
                });
                if (g()) {
                    Method method = f19474f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new Runnable() {
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
