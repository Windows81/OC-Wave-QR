package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class FileSystemException extends IOException {

    /* renamed from: A  reason: collision with root package name */
    public final File f40764A;

    /* renamed from: B  reason: collision with root package name */
    public final String f40765B;

    /* renamed from: z  reason: collision with root package name */
    public final File f40766z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(ExceptionsKt.a(file, file2, str));
        Intrinsics.i(file, "file");
        this.f40766z = file;
        this.f40764A = file2;
        this.f40765B = str;
    }
}
