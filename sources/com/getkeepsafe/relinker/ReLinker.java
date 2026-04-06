package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

public class ReLinker {

    public interface LibraryInstaller {
        void a(Context context, String[] strArr, String str, File file, ReLinkerInstance reLinkerInstance);
    }

    public interface LibraryLoader {
        String a(String str);

        void b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    public interface LoadListener {
        void a();

        void b(Throwable th);
    }

    public interface Logger {
        void a(String str);
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, str2, (LoadListener) null);
    }

    public static void b(Context context, String str, String str2, LoadListener loadListener) {
        new ReLinkerInstance().f(context, str, str2, loadListener);
    }
}
