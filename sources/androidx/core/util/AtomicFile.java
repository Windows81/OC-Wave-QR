package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile {

    /* renamed from: a  reason: collision with root package name */
    public final File f20140a;

    /* renamed from: b  reason: collision with root package name */
    public final File f20141b;

    /* renamed from: c  reason: collision with root package name */
    public final File f20142c;

    public AtomicFile(File file) {
        this.f20140a = file;
        this.f20141b = new File(file.getPath() + ".new");
        this.f20142c = new File(file.getPath() + ".bak");
    }

    public static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static boolean e(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!e(fileOutputStream)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("AtomicFile", "Failed to close file output stream", e2);
            }
            if (!this.f20141b.delete()) {
                Log.e("AtomicFile", "Failed to delete new file " + this.f20141b);
            }
        }
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            if (!e(fileOutputStream)) {
                Log.e("AtomicFile", "Failed to sync file output stream");
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("AtomicFile", "Failed to close file output stream", e2);
            }
            c(this.f20141b, this.f20140a);
        }
    }

    public FileOutputStream d() {
        if (this.f20142c.exists()) {
            c(this.f20142c, this.f20140a);
        }
        try {
            return new FileOutputStream(this.f20141b);
        } catch (FileNotFoundException unused) {
            if (this.f20141b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f20141b);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Failed to create new file " + this.f20141b, e2);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.f20141b);
            }
        }
    }
}
