package androidx.compose.foundation.text.input.internal;

import android.view.DragEvent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2 implements DragAndDropTarget {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f6343A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f6344B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ Function1 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f6345z;

    public TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2(Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17) {
        this.f6345z = function1;
        this.f6343A = function2;
        this.f6344B = function12;
        this.C = function13;
        this.D = function14;
        this.E = function15;
        this.F = function16;
        this.G = function17;
    }

    public void M1(DragAndDropEvent dragAndDropEvent) {
        Function1 function1 = this.C;
        if (function1 != null) {
            function1.invoke(dragAndDropEvent);
            Unit unit = Unit.f40552a;
        }
    }

    public void N0(DragAndDropEvent dragAndDropEvent) {
        Function1 function1 = this.E;
        if (function1 != null) {
            function1.invoke(dragAndDropEvent);
            Unit unit = Unit.f40552a;
        }
    }

    public boolean d0(DragAndDropEvent dragAndDropEvent) {
        this.f6345z.invoke(dragAndDropEvent);
        return ((Boolean) this.f6343A.m(AndroidClipboardManager_androidKt.a(DragAndDrop_androidKt.b(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.b(DragAndDrop_androidKt.b(dragAndDropEvent).getClipDescription()))).booleanValue();
    }

    public void f0(DragAndDropEvent dragAndDropEvent) {
        Function1 function1 = this.f6344B;
        if (function1 != null) {
            function1.invoke(dragAndDropEvent);
            Unit unit = Unit.f40552a;
        }
    }

    public void h0(DragAndDropEvent dragAndDropEvent) {
        DragEvent b2 = DragAndDrop_androidKt.b(dragAndDropEvent);
        Function1 function1 = this.D;
        if (function1 != null) {
            function1.invoke(Offset.d(Offset.e((((long) Float.floatToRawIntBits(b2.getX())) << 32) | (((long) Float.floatToRawIntBits(b2.getY())) & 4294967295L))));
            Unit unit = Unit.f40552a;
        }
    }

    public void r2(DragAndDropEvent dragAndDropEvent) {
        Function1 function1 = this.G;
        if (function1 != null) {
            function1.invoke(dragAndDropEvent);
            Unit unit = Unit.f40552a;
        }
    }
}
