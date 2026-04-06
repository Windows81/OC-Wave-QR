package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class Api26Impl {

    /* renamed from: a  reason: collision with root package name */
    public static final Api26Impl f20542a = new Api26Impl();

    public final boolean a(File file, File file2) {
        Intrinsics.i(file, "srcFile");
        Intrinsics.i(file2, "dstFile");
        try {
            Files.move(file.toPath(), file2.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
