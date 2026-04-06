package androidx.browser.browseractions;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {
    public static Object G = new Object();

    public static class FileCleanupTask extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        public static final long f1587b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f1588c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f1589d;

        /* renamed from: a  reason: collision with root package name */
        public final Context f1590a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f1587b = timeUnit.toMillis(7);
            f1588c = timeUnit.toMillis(7);
            f1589d = timeUnit.toMillis(1);
        }

        public FileCleanupTask(Context context) {
            this.f1590a = context.getApplicationContext();
        }

        public static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        public static boolean c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f1588c;
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f1590a.getSharedPreferences(this.f1590a.getPackageName() + ".image_provider", 0);
            if (!c(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.G) {
                try {
                    File file = new File(this.f1590a.getFilesDir(), "image_provider");
                    if (!file.exists()) {
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    long currentTimeMillis = System.currentTimeMillis() - f1587b;
                    boolean z2 = true;
                    for (File file2 : listFiles) {
                        if (b(file2)) {
                            if (file2.lastModified() < currentTimeMillis && !file2.delete()) {
                                Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                                z2 = false;
                            }
                        }
                    }
                    long currentTimeMillis2 = z2 ? System.currentTimeMillis() : (System.currentTimeMillis() - f1588c) + f1589d;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("last_cleanup_time", currentTimeMillis2);
                    edit.apply();
                    return null;
                } finally {
                }
            }
        }
    }

    public static class FileSaveTask extends AsyncTask<String, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1591a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1592b;

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap f1593c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f1594d;

        /* renamed from: e  reason: collision with root package name */
        public final ResolvableFuture f1595e;

        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            d();
            return null;
        }

        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            new FileCleanupTask(this.f1591a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        public final void c(File file) {
            FileOutputStream fileOutputStream;
            AtomicFile atomicFile = new AtomicFile(file);
            try {
                fileOutputStream = atomicFile.d();
                try {
                    this.f1593c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    atomicFile.b(fileOutputStream);
                    this.f1595e.z(this.f1594d);
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream = null;
                atomicFile.a(fileOutputStream);
                this.f1595e.A(e);
            }
        }

        public final void d() {
            File file = new File(this.f1591a.getFilesDir(), "image_provider");
            synchronized (BrowserServiceFileProvider.G) {
                try {
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, this.f1592b + ".png");
                        if (file2.exists()) {
                            this.f1595e.z(this.f1594d);
                        } else {
                            c(file2);
                        }
                        file2.setLastModified(System.currentTimeMillis());
                        return;
                    }
                    this.f1595e.A(new IOException("Could not create file directory."));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static ListenableFuture k(final ContentResolver contentResolver, final Uri uri) {
        final ResolvableFuture E = ResolvableFuture.E();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
            public void run() {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (openFileDescriptor == null) {
                        E.A(new FileNotFoundException());
                        return;
                    }
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                    openFileDescriptor.close();
                    if (decodeFileDescriptor == null) {
                        E.A(new IOException("File could not be decoded."));
                    } else {
                        E.z(decodeFileDescriptor);
                    }
                } catch (IOException e2) {
                    E.A(e2);
                }
            }
        });
        return E;
    }
}
