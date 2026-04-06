package androidx.core.os;

import android.content.Context;
import android.os.UserManager;

public class UserManagerCompat {

    public static class Api24Impl {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return Api24Impl.a(context);
    }
}
