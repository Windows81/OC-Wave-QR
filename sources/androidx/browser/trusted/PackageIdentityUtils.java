package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

class PackageIdentityUtils {

    public static class Api28Implementation implements SignaturesCompat {
        public boolean a(String str, PackageManager packageManager, TokenContents tokenContents) {
            List b2;
            if (tokenContents.f().equals(str) && (b2 = b(str, packageManager)) != null) {
                return b2.size() == 1 ? packageManager.hasSigningCertificate(str, tokenContents.e(0), 1) : tokenContents.equals(TokenContents.c(str, b2));
            }
            return false;
        }

        public List b(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature a2 : signingInfo.getApkContentsSigners()) {
                    arrayList.add(PackageIdentityUtils.a(a2));
                }
            } else {
                arrayList.add(PackageIdentityUtils.a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }
    }

    public static class Pre28Implementation implements SignaturesCompat {
        public boolean a(String str, PackageManager packageManager, TokenContents tokenContents) {
            List b2;
            if (str.equals(tokenContents.f()) && (b2 = b(str, packageManager)) != null) {
                return tokenContents.equals(TokenContents.c(str, b2));
            }
            return false;
        }

        public List b(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature a2 : packageInfo.signatures) {
                byte[] a3 = PackageIdentityUtils.a(a2);
                if (a3 == null) {
                    return null;
                }
                arrayList.add(a3);
            }
            return arrayList;
        }
    }

    public interface SignaturesCompat {
        boolean a(String str, PackageManager packageManager, TokenContents tokenContents);
    }

    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static SignaturesCompat b() {
        return Build.VERSION.SDK_INT >= 28 ? new Api28Implementation() : new Pre28Implementation();
    }

    public static boolean c(String str, PackageManager packageManager, TokenContents tokenContents) {
        try {
            return b().a(str, packageManager, tokenContents);
        } catch (PackageManager.NameNotFoundException | IOException e2) {
            Log.e("PackageIdentity", "Could not check if package matches token.", e2);
            return false;
        }
    }
}
