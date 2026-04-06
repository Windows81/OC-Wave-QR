package com.getkeepsafe.relinker;

import android.os.Build;
import com.getkeepsafe.relinker.ReLinker;

final class SystemLibraryLoader implements ReLinker.LibraryLoader {
    public String a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    public void b(String str) {
        System.loadLibrary(str);
    }

    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !TextUtils.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    public void e(String str) {
        System.load(str);
    }
}
