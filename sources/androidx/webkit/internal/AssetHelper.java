package androidx.webkit.internal;

import android.content.Context;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class AssetHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23144a;

    public AssetHelper(Context context) {
        this.f23144a = context;
    }

    public static String a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    public static File b(File file, String str) {
        String a2 = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(a2)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static String e(String str) {
        String a2 = MimeUtil.a(str);
        return a2 == null ? "text/plain" : a2;
    }

    public static InputStream f(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static InputStream h(File file) {
        return f(file.getPath(), new FileInputStream(file));
    }

    public static String j(String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    public final int c(String str, String str2) {
        return this.f23144a.getResources().getIdentifier(str2, str, this.f23144a.getPackageName());
    }

    public final int d(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f23144a.getResources().getValue(i2, typedValue, true);
        return typedValue.type;
    }

    public InputStream g(String str) {
        String j2 = j(str);
        return f(j2, this.f23144a.getAssets().open(j2, 2));
    }

    public InputStream i(String str) {
        String j2 = j(str);
        String[] split = j2.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int c2 = c(str2, str3);
            int d2 = d(c2);
            if (d2 == 3) {
                return f(j2, this.f23144a.getResources().openRawResource(c2));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", new Object[]{j2, Integer.valueOf(d2)}));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + j2);
    }
}
