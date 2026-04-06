package androidx.loader.content;

import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* renamed from: p  reason: collision with root package name */
    public final Loader.ForceLoadContentObserver f22113p;

    /* renamed from: q  reason: collision with root package name */
    public Uri f22114q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f22115r;

    /* renamed from: s  reason: collision with root package name */
    public String f22116s;

    /* renamed from: t  reason: collision with root package name */
    public String[] f22117t;

    /* renamed from: u  reason: collision with root package name */
    public String f22118u;

    /* renamed from: v  reason: collision with root package name */
    public Cursor f22119v;

    /* renamed from: w  reason: collision with root package name */
    public CancellationSignal f22120w;

    /* renamed from: H */
    public void f(Cursor cursor) {
        if (!k()) {
            Cursor cursor2 = this.f22119v;
            this.f22119v = cursor;
            if (l()) {
                super.f(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: I */
    public Cursor E() {
        Cursor b2;
        synchronized (this) {
            if (!D()) {
                this.f22120w = new CancellationSignal();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            b2 = ContentResolverCompat.b(i().getContentResolver(), this.f22114q, this.f22115r, this.f22116s, this.f22117t, this.f22118u, this.f22120w);
            if (b2 != null) {
                b2.getCount();
                b2.registerContentObserver(this.f22113p);
            }
            synchronized (this) {
                this.f22120w = null;
            }
            return b2;
        } catch (RuntimeException e2) {
            b2.close();
            throw e2;
        } catch (Throwable th) {
            synchronized (this) {
                this.f22120w = null;
                throw th;
            }
        }
    }

    /* renamed from: J */
    public void F(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f22114q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f22115r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f22116s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f22117t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f22118u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f22119v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f22128h);
    }

    public void q() {
        super.q();
        s();
        Cursor cursor = this.f22119v;
        if (cursor != null && !cursor.isClosed()) {
            this.f22119v.close();
        }
        this.f22119v = null;
    }

    public void r() {
        Cursor cursor = this.f22119v;
        if (cursor != null) {
            f(cursor);
        }
        if (x() || this.f22119v == null) {
            h();
        }
    }

    public void s() {
        b();
    }

    public void z() {
        super.z();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f22120w;
                if (cancellationSignal != null) {
                    cancellationSignal.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
