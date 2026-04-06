package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class BenchmarkOperation {

    public static class Api21ContextHelper {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    public static class Api24ContextHelper {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z2 = true;
            for (int i2 = 0; i2 < length; i2++) {
                z2 = a(listFiles[i2]) && z2;
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static void b(Context context, ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (a(Build.VERSION.SDK_INT >= 34 ? Api24ContextHelper.a(context).getCacheDir() : Api21ContextHelper.a(Api24ContextHelper.a(context)))) {
            resultDiagnostics.b(14, (Object) null);
        } else {
            resultDiagnostics.b(15, (Object) null);
        }
    }
}
