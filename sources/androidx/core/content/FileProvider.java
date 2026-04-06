package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static final String[] D = {"_display_name", "_size"};
    public static final File E = new File("/");
    public static final HashMap F = new HashMap();

    /* renamed from: A  reason: collision with root package name */
    public String f19693A;

    /* renamed from: B  reason: collision with root package name */
    public PathStrategy f19694B;
    public final int C;

    /* renamed from: z  reason: collision with root package name */
    public final Object f19695z;

    public static class Api21Impl {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    public interface PathStrategy {
        File a(Uri uri);
    }

    public static class SimplePathStrategy implements PathStrategy {

        /* renamed from: a  reason: collision with root package name */
        public final String f19696a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f19697b = new HashMap();

        public SimplePathStrategy(String str) {
            this.f19696a = str;
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f19697b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (c(canonicalFile.getPath(), file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        public void b(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f19697b.put(str, file.getCanonicalFile());
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        public final boolean c(String str, String str2) {
            String a2 = FileProvider.j(str);
            String a3 = FileProvider.j(str2);
            if (!a2.equals(a3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a3);
                sb.append('/');
                return a2.startsWith(sb.toString());
            }
        }
    }

    public static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] c(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    public static String[] d(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    public static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i2) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i2 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i2);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    public static PathStrategy g(Context context, String str, int i2) {
        PathStrategy pathStrategy;
        HashMap hashMap = F;
        synchronized (hashMap) {
            try {
                pathStrategy = (PathStrategy) hashMap.get(str);
                if (pathStrategy == null) {
                    pathStrategy = i(context, str, i2);
                    hashMap.put(str, pathStrategy);
                }
            } catch (IOException e2) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
            } catch (XmlPullParserException e3) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    public static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static PathStrategy i(Context context, String str, int i2) {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser e2 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i2);
        while (true) {
            int next = e2.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                String name = e2.getName();
                File file = null;
                String attributeValue = e2.getAttributeValue((String) null, "name");
                String attributeValue2 = e2.getAttributeValue((String) null, "path");
                if ("root-path".equals(name)) {
                    file = E;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g2 = ContextCompat.g(context, (String) null);
                    if (g2.length > 0) {
                        file = g2[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f2 = ContextCompat.f(context);
                    if (f2.length > 0) {
                        file = f2[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a2 = Api21Impl.a(context);
                    if (a2.length > 0) {
                        file = a2[0];
                    }
                }
                if (file != null) {
                    simplePathStrategy.b(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    public static String j(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + -1) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.f19695z) {
                this.f19693A = str;
            }
            HashMap hashMap = F;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return f().a(uri).delete() ? 1 : 0;
    }

    public final PathStrategy f() {
        PathStrategy pathStrategy;
        synchronized (this.f19695z) {
            try {
                ObjectsCompat.d(this.f19693A, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f19694B == null) {
                    this.f19694B = g(getContext(), this.f19693A, this.C);
                }
                pathStrategy = this.f19694B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r2.f()
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0029
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0029
            return r3
        L_0x0029:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().a(uri), h(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File a2 = f().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = D;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? a2.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(a2.length());
            }
            i3 = i2;
        }
        String[] d2 = d(strArr3, i3);
        Object[] c2 = c(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(d2, 1);
        matrixCursor.addRow(c2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
