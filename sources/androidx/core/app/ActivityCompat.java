package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends ContextCompat {

    /* renamed from: b  reason: collision with root package name */
    public static PermissionCompatDelegate f19463b;

    /* renamed from: androidx.core.app.ActivityCompat$1  reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Activity f19464A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ int f19465B;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String[] f19466z;

        public void run() {
            int[] iArr = new int[this.f19466z.length];
            PackageManager packageManager = this.f19464A.getPackageManager();
            String packageName = this.f19464A.getPackageName();
            int length = this.f19466z.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f19466z[i2], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.f19464A).onRequestPermissionsResult(this.f19465B, this.f19466z, iArr);
        }
    }

    public static class Api21Impl {
    }

    public static class Api22Impl {
    }

    public static class Api23Impl {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }
    }

    public static class Api28Impl {
    }

    public static class Api30Impl {
    }

    public static class Api31Impl {
    }

    public static class Api32Impl {
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void b(int i2);
    }

    public static class SharedElementCallback21Impl extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        public final SharedElementCallback f19467a;

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f19467a.b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f19467a.c(context, parcelable);
        }

        public void onMapSharedElements(List list, Map map) {
            this.f19467a.d(list, map);
        }

        public void onRejectSharedElements(List list) {
            this.f19467a.e(list);
        }

        public void onSharedElementEnd(List list, List list2, List list3) {
            this.f19467a.f(list, list2, list3);
        }

        public void onSharedElementStart(List list, List list2, List list3) {
            this.f19467a.g(list, list2, list3);
        }

        public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f19467a.h(list, list2, new b(onSharedElementsReadyListener));
        }
    }

    public static void o(Activity activity) {
        activity.finishAffinity();
    }

    public static /* synthetic */ void p(Activity activity) {
        if (!activity.isFinishing() && !ActivityRecreator.i(activity)) {
            activity.recreate();
        }
    }

    public static void q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void r(Activity activity, String[] strArr, int i2) {
        PermissionCompatDelegate permissionCompatDelegate = f19463b;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.a(activity, strArr, i2)) {
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (i3 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i3])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                    i3++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
            if (size > 0) {
                if (size != strArr.length) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < strArr.length; i5++) {
                        if (!hashSet.contains(Integer.valueOf(i5))) {
                            strArr2[i4] = strArr[i5];
                            i4++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).b(i2);
            }
            Api23Impl.b(activity, strArr, i2);
        }
    }

    public static void s(Activity activity, Intent intent, int i2, Bundle bundle) {
        activity.startActivityForResult(intent, i2, bundle);
    }

    public static void t(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
