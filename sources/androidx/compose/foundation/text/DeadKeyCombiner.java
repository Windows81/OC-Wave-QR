package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata
public final class DeadKeyCombiner {

    /* renamed from: a  reason: collision with root package name */
    public Integer f5729a;

    public final Integer a(KeyEvent keyEvent) {
        int c2 = KeyEvent_androidKt.c(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & c2) != 0) {
            this.f5729a = Integer.valueOf(c2 & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f5729a;
        if (num2 == null) {
            return Integer.valueOf(c2);
        }
        this.f5729a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), c2));
        if (valueOf.intValue() != 0) {
            num = valueOf;
        }
        return num == null ? Integer.valueOf(c2) : num;
    }
}
