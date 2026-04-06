package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

public final class AppOpsManagerCompat {

    public static class Api23Impl {
        public static Object a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    public static class Api29Impl {
        public static int a(AppOpsManager appOpsManager, String str, int i2, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        public static String b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i2, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        AppOpsManager c2 = Api29Impl.c(context);
        int a2 = Api29Impl.a(c2, str, Binder.getCallingUid(), str2);
        return a2 != 0 ? a2 : Api29Impl.a(c2, str, i2, Api29Impl.b(context));
    }

    public static int b(Context context, String str, String str2) {
        return Api23Impl.b((AppOpsManager) Api23Impl.a(context, AppOpsManager.class), str, str2);
    }

    public static String c(String str) {
        return Api23Impl.c(str);
    }
}
