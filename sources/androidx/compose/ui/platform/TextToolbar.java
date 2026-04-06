package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public interface TextToolbar {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void D(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2, Object obj) {
        if (obj == null) {
            Function0 function06 = null;
            Function0 function07 = (i2 & 2) != 0 ? null : function0;
            Function0 function08 = (i2 & 4) != 0 ? null : function02;
            Function0 function09 = (i2 & 8) != 0 ? null : function03;
            Function0 function010 = (i2 & 16) != 0 ? null : function04;
            if ((i2 & 32) == 0) {
                function06 = function05;
            }
            textToolbar.B(rect, function07, function08, function09, function010, function06);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    TextToolbarStatus A();

    void B(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        C(rect, function0, function02, function03, function04);
    }

    void C(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04);

    void a();
}
