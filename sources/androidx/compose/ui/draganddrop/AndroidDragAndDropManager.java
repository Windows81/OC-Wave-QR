package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {

    /* renamed from: a  reason: collision with root package name */
    public final Function3 f15654a;

    /* renamed from: b  reason: collision with root package name */
    public final DragAndDropNode f15655b = new DragAndDropNode((Function2) null, (Function1) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public final ArraySet f15656c = new ArraySet(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public final Modifier f15657d = new AndroidDragAndDropManager$modifier$1(this);

    public AndroidDragAndDropManager(Function3 function3) {
        this.f15654a = function3;
    }

    public boolean H() {
        return true;
    }

    public void I(DragAndDropNode dragAndDropNode, long j2) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        dragAndDropNode.i3(new AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1(booleanRef, this), j2, new AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(booleanRef));
    }

    public void J(DragAndDropTarget dragAndDropTarget) {
        this.f15656c.add(dragAndDropTarget);
    }

    public boolean K(DragAndDropTarget dragAndDropTarget) {
        return this.f15656c.contains(dragAndDropTarget);
    }

    public Modifier c() {
        return this.f15657d;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean Z2 = this.f15655b.Z2(dragAndDropEvent);
                for (DragAndDropTarget f0 : this.f15656c) {
                    f0.f0(dragAndDropEvent);
                }
                return Z2;
            case 2:
                this.f15655b.h0(dragAndDropEvent);
                return false;
            case 3:
                return this.f15655b.d0(dragAndDropEvent);
            case 4:
                this.f15655b.r2(dragAndDropEvent);
                this.f15656c.clear();
                return false;
            case 5:
                this.f15655b.M1(dragAndDropEvent);
                return false;
            case 6:
                this.f15655b.N0(dragAndDropEvent);
                return false;
            default:
                return false;
        }
    }
}
