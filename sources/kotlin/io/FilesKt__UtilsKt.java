package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static String c(File file) {
        Intrinsics.i(file, "<this>");
        String name = file.getName();
        Intrinsics.h(name, "getName(...)");
        return StringsKt.Y0(name, '.', "");
    }

    public static final File d(File file, File file2) {
        Intrinsics.i(file, "<this>");
        Intrinsics.i(file2, "relative");
        if (FilesKt__FilePathComponentsKt.b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        Intrinsics.h(file3, "toString(...)");
        if (file3.length() != 0) {
            char c2 = File.separatorChar;
            if (!StringsKt.a0(file3, c2, false, 2, (Object) null)) {
                return new File(file3 + c2 + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File e(File file, String str) {
        Intrinsics.i(file, "<this>");
        Intrinsics.i(str, "relative");
        return d(file, new File(str));
    }
}
