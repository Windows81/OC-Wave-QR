package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.ModifierNodeElement;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SuspendPointerInputElement extends ModifierNodeElement<SuspendingPointerInputModifierNodeImpl> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f16945A;

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f16946B;
    public final PointerInputEventHandler C;

    /* renamed from: z  reason: collision with root package name */
    public final Object f16947z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? null : obj2, (i2 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    /* renamed from: c */
    public SuspendingPointerInputModifierNodeImpl a() {
        return new SuspendingPointerInputModifierNodeImpl(this.f16947z, this.f16945A, this.f16946B, this.C);
    }

    /* renamed from: d */
    public void b(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.g3(this.f16947z, this.f16945A, this.f16946B, this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.d(this.f16947z, suspendPointerInputElement.f16947z) || !Intrinsics.d(this.f16945A, suspendPointerInputElement.f16945A)) {
            return false;
        }
        Object[] objArr = this.f16946B;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f16946B;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f16946B != null) {
            return false;
        }
        return this.C == suspendPointerInputElement.C;
    }

    public int hashCode() {
        Object obj = this.f16947z;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f16945A;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f16946B;
        if (objArr != null) {
            i2 = Arrays.hashCode(objArr);
        }
        return ((hashCode2 + i2) * 31) + this.C.hashCode();
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f16947z = obj;
        this.f16945A = obj2;
        this.f16946B = objArr;
        this.C = pointerInputEventHandler;
    }
}
