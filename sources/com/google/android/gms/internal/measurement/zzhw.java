package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

public final class zzhw implements zzhy {
    public final Map a(ContentResolver contentResolver, String[] strArr, zzhv zzhv) {
        Cursor query;
        Uri uri = zzhq.f25484b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, strArr, (String) null);
                if (query != null) {
                    Map j2 = zzhv.j(query.getCount());
                    while (query.moveToNext()) {
                        j2.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return j2;
                    }
                    throw new zzhx("Cursor read incomplete (ContentProvider dead?)");
                }
                throw new zzhx("ContentProvider query returned null cursor");
            } catch (RemoteException e2) {
                try {
                    throw new zzhx("ContentProvider query failed", e2);
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new zzhx("Unable to acquire ContentProviderClient");
        }
        throw th;
    }

    public final String b(ContentResolver contentResolver, String str) {
        Cursor query;
        Uri uri = zzhq.f25483a;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, new String[]{str}, (String) null);
                if (query == null) {
                    throw new zzhx("ContentProvider query returned null cursor");
                } else if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return string;
                } else {
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return null;
                }
            } catch (RemoteException e2) {
                throw new zzhx("ContentProvider query failed", e2);
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        } else {
            throw new zzhx("Unable to acquire ContentProviderClient");
        }
        throw th;
    }
}
