package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ContextualFlowItemIterator implements Iterator<Measurable>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f3837A;

    /* renamed from: B  reason: collision with root package name */
    public final List f3838B = new ArrayList();
    public int C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public final int f3839z;

    public ContextualFlowItemIterator(int i2, Function2 function2) {
        this.f3839z = i2;
        this.f3837A = function2;
    }

    public static /* synthetic */ Measurable e(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, (DefaultConstructorMarker) null);
        }
        return contextualFlowItemIterator.c(flowLineInfo);
    }

    public final List b() {
        return this.f3838B;
    }

    public final Measurable c(FlowLineInfo flowLineInfo) {
        if (this.D < b().size()) {
            Measurable measurable = (Measurable) b().get(this.D);
            this.D++;
            return measurable;
        }
        int i2 = this.C;
        if (i2 < this.f3839z) {
            List list = (List) this.f3837A.m(Integer.valueOf(i2), flowLineInfo);
            this.C++;
            if (list.isEmpty()) {
                return next();
            }
            this.f3838B.addAll(list);
            this.D++;
            return (Measurable) CollectionsKt.e0(list);
        }
        throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.C);
    }

    /* renamed from: f */
    public Measurable next() {
        return e(this, (FlowLineInfo) null, 1, (Object) null);
    }

    public boolean hasNext() {
        return this.D < b().size() || this.C < this.f3839z;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
