package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Set;

class EmojiExclusions {

    public static class EmojiExclusions_Api34 {
        public static Set<int[]> a() {
            return EmojiExclusions_Reflections.a();
        }
    }

    public static class EmojiExclusions_Reflections {
        public static Set a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<Object> set = (Set) invoke;
                for (Object obj : set) {
                    if (!(obj instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    public static Set a() {
        return Build.VERSION.SDK_INT >= 34 ? EmojiExclusions_Api34.a() : EmojiExclusions_Reflections.a();
    }
}
