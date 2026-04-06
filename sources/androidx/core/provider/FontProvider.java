package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class FontProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache f19988a = new LruCache(2);

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f19989b = new a();

    public interface ContentQueryWrapper {
        static ContentQueryWrapper a(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final ContentProviderClient f19990a;

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f19990a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                Log.w("FontsProvider", "Unable to query the content provider", e2);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f19990a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final ContentProviderClient f19991a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f19991a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f19991a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                Log.w("FontsProvider", "Unable to query the content provider", e2);
                return null;
            }
        }

        public void close() {
            ContentProviderClient contentProviderClient = this.f19991a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static class ProviderCacheKey {

        /* renamed from: a  reason: collision with root package name */
        public String f19992a;

        /* renamed from: b  reason: collision with root package name */
        public String f19993b;

        /* renamed from: c  reason: collision with root package name */
        public List f19994c;

        public ProviderCacheKey(String str, String str2, List list) {
            this.f19992a = str;
            this.f19993b = str2;
            this.f19994c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.f19992a, providerCacheKey.f19992a) && Objects.equals(this.f19993b, providerCacheKey.f19993b) && Objects.equals(this.f19994c, providerCacheKey.f19994c);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f19992a, this.f19993b, this.f19994c});
        }
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static List d(FontRequest fontRequest, Resources resources) {
        return fontRequest.b() != null ? fontRequest.b() : FontResourcesParserCompat.c(resources, fontRequest.c());
    }

    public static FontsContractCompat.FontFamilyResult e(Context context, List list, CancellationSignal cancellationSignal) {
        Trace.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                FontRequest fontRequest = (FontRequest) list.get(i2);
                ProviderInfo f2 = f(context.getPackageManager(), fontRequest, context.getResources());
                if (f2 == null) {
                    return FontsContractCompat.FontFamilyResult.b(1, (FontsContractCompat.FontInfo[]) null);
                }
                arrayList.add(h(context, fontRequest, f2.authority, cancellationSignal));
            }
            FontsContractCompat.FontFamilyResult a2 = FontsContractCompat.FontFamilyResult.a(0, arrayList);
            Trace.b();
            return a2;
        } finally {
            Trace.b();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        Trace.a("FontProvider.getProvider");
        try {
            List d2 = d(fontRequest, resources);
            ProviderCacheKey providerCacheKey = new ProviderCacheKey(fontRequest.e(), fontRequest.f(), d2);
            ProviderInfo providerInfo = (ProviderInfo) f19988a.d(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e2 = fontRequest.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e2, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e2);
            } else if (resolveContentProvider.packageName.equals(fontRequest.f())) {
                List b2 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(b2, f19989b);
                for (int i2 = 0; i2 < d2.size(); i2++) {
                    ArrayList arrayList = new ArrayList((Collection) d2.get(i2));
                    Collections.sort(arrayList, f19989b);
                    if (c(b2, arrayList)) {
                        f19988a.f(providerCacheKey, resolveContentProvider);
                        Trace.b();
                        return resolveContentProvider;
                    }
                }
                Trace.b();
                return null;
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + e2 + ", but package was not " + fontRequest.f());
            }
        } finally {
            Trace.b();
        }
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    public static FontsContractCompat.FontInfo[] h(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        ContentQueryWrapper a2;
        Cursor cursor;
        ArrayList arrayList;
        Uri uri;
        boolean z2;
        String str2 = str;
        Trace.a("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            a2 = ContentQueryWrapper.a(context, build);
            cursor = null;
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.a("ContentQueryWrapper.query");
            cursor = a2.b(build, strArr, "query = ?", new String[]{fontRequest.g()}, (String) null, cancellationSignal);
            Trace.b();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i4 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z2 = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            FontsContractCompat.FontInfo a3 = FontsContractCompat.FontInfo.a(uri, i3, i4, z2, i2);
                            arrayList3 = arrayList;
                            arrayList3.add(a3);
                        }
                    }
                    z2 = false;
                    FontsContractCompat.FontInfo a32 = FontsContractCompat.FontInfo.a(uri, i3, i4, z2, i2);
                    arrayList3 = arrayList;
                    arrayList3.add(a32);
                }
                arrayList2 = arrayList3;
            }
            if (cursor != null) {
                cursor.close();
            }
            a2.close();
            FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) arrayList2.toArray(new FontsContractCompat.FontInfo[0]);
            Trace.b();
            return fontInfoArr;
        } catch (Throwable th) {
            Trace.b();
            throw th;
        }
    }
}
