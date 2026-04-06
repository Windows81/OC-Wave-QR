package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
class FilesKt__FilePathComponentsKt {
    public static final int a(String str) {
        int i0;
        char c2 = File.separatorChar;
        int i02 = StringsKt.i0(str, c2, 0, false, 4, (Object) null);
        if (i02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (i0 = StringsKt.i0(str, c2, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int i03 = StringsKt.i0(str, c2, i0 + 1, false, 4, (Object) null);
            return i03 >= 0 ? i03 + 1 : str.length();
        } else if (i02 > 0 && str.charAt(i02 - 1) == ':') {
            return i02 + 1;
        } else {
            if (i02 != -1 || !StringsKt.a0(str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    public static final boolean b(File file) {
        Intrinsics.i(file, "<this>");
        String path = file.getPath();
        Intrinsics.h(path, "getPath(...)");
        return a(path) > 0;
    }
}
