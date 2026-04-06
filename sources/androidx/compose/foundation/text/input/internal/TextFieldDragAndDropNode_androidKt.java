package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldDragAndDropNode_androidKt {
    public static final DragAndDropTargetModifierNode a(Function0 function0, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17) {
        Function0 function02 = function0;
        return DragAndDropNodeKt.c(new TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1(function0), new TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2(function1, function2, function12, function13, function14, function16, function15, function17));
    }

    public static /* synthetic */ DragAndDropTargetModifierNode b(Function0 function0, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i2, Object obj) {
        int i3 = i2;
        return a(function0, function2, function1, (i3 & 8) != 0 ? null : function12, (i3 & 16) != 0 ? null : function13, (i3 & 32) != 0 ? null : function14, (i3 & 64) != 0 ? null : function15, (i3 & 128) != 0 ? null : function16, (i3 & 256) != 0 ? null : function17);
    }
}
