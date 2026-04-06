package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

public final class TrustedWebActivityServiceConnectionPool {

    public static class BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1714a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f1715b;

        /* renamed from: c  reason: collision with root package name */
        public final ConnectionHolder f1716c;

        /* renamed from: a */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f1714a.bindService(this.f1715b, this.f1716c, 4097)) {
                    return null;
                }
                this.f1714a.unbindService(this.f1716c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e2) {
                Log.w("TWAConnectionPool", "SecurityException while binding.", e2);
                return e2;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f1716c.a(exc);
            }
        }
    }
}
