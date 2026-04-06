package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class MotionEventAdapter {

    /* renamed from: a  reason: collision with root package name */
    public long f16826a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseLongArray f16827b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f16828c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    public final List f16829d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f16830e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f16831f = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f16827b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f16827b;
                long j2 = this.f16826a;
                this.f16826a = 1 + j2;
                sparseLongArray.put(pointerId, j2);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f16828c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f16827b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f16827b;
                long j3 = this.f16826a;
                this.f16826a = 1 + j3;
                sparseLongArray2.put(pointerId2, j3);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f16830e || source != this.f16831f) {
                this.f16830e = toolType;
                this.f16831f = source;
                this.f16828c.clear();
                this.f16827b.clear();
            }
        }
    }

    public final PointerInputEvent c(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f16827b.clear();
            this.f16828c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            this.f16828c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f16829d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            this.f16829d.add(d(positionCalculator, motionEvent, i2, !z2 && i2 != actionIndex && (!z3 || motionEvent.getButtonState() != 0)));
            i2++;
        }
        h(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.f16829d, motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.input.pointer.PointerInputEventData d(androidx.compose.ui.input.pointer.PositionCalculator r34, android.view.MotionEvent r35, int r36, boolean r37) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r36
            int r4 = r35.getPointerId(r36)
            long r6 = r0.f(r4)
            float r15 = r35.getPressure(r36)
            float r4 = r35.getX(r36)
            float r5 = r35.getY(r36)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r8 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r10 = 32
            long r8 = r8 << r10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r11
            long r4 = r4 | r8
            long r4 = androidx.compose.ui.geometry.Offset.e(r4)
            r20 = 3
            r21 = 0
            r18 = 0
            r19 = 0
            r16 = r4
            long r21 = androidx.compose.ui.geometry.Offset.g(r16, r18, r19, r20, r21)
            if (r3 != 0) goto L_0x0065
            float r4 = r35.getRawX()
            float r5 = r35.getRawY()
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r8 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r8 = r8 << r10
            long r4 = r4 & r11
            long r4 = r4 | r8
            long r4 = androidx.compose.ui.geometry.Offset.e(r4)
            long r8 = r1.w(r4)
        L_0x0061:
            r13 = r4
            r18 = r8
            goto L_0x007d
        L_0x0065:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x0076
            androidx.compose.ui.input.pointer.MotionEventHelper r4 = androidx.compose.ui.input.pointer.MotionEventHelper.f16832a
            long r4 = r4.a(r2, r3)
            long r8 = r1.w(r4)
            goto L_0x0061
        L_0x0076:
            long r8 = r1.f(r4)
            r18 = r4
            r13 = r8
        L_0x007d:
            int r1 = r35.getToolType(r36)
            if (r1 == 0) goto L_0x00b4
            r4 = 1
            if (r1 == r4) goto L_0x00ad
            r4 = 2
            if (r1 == r4) goto L_0x00a6
            r4 = 3
            if (r1 == r4) goto L_0x009f
            r4 = 4
            if (r1 == r4) goto L_0x0098
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.e()
        L_0x0095:
            r16 = r1
            goto L_0x00bb
        L_0x0098:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.a()
            goto L_0x0095
        L_0x009f:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.b()
            goto L_0x0095
        L_0x00a6:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.c()
            goto L_0x0095
        L_0x00ad:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.d()
            goto L_0x0095
        L_0x00b4:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.e()
            goto L_0x0095
        L_0x00bb:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r35.getHistorySize()
            r1.<init>(r4)
            int r4 = r35.getHistorySize()
            r8 = 0
        L_0x00c9:
            if (r8 >= r4) goto L_0x011f
            float r9 = r2.getHistoricalX(r3, r8)
            float r17 = r2.getHistoricalY(r3, r8)
            int r20 = java.lang.Float.floatToRawIntBits(r9)
            r23 = 2147483647(0x7fffffff, float:NaN)
            r5 = r20 & r23
            r11 = 2139095040(0x7f800000, float:Infinity)
            if (r5 >= r11) goto L_0x0113
            int r5 = java.lang.Float.floatToRawIntBits(r17)
            r5 = r5 & r23
            if (r5 >= r11) goto L_0x0113
            int r5 = java.lang.Float.floatToRawIntBits(r9)
            long r11 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r17)
            r9 = r4
            long r3 = (long) r5
            long r11 = r11 << r10
            r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r23
            long r3 = r3 | r11
            long r30 = androidx.compose.ui.geometry.Offset.e(r3)
            androidx.compose.ui.input.pointer.HistoricalChange r3 = new androidx.compose.ui.input.pointer.HistoricalChange
            long r26 = r2.getHistoricalEventTime(r8)
            r32 = 0
            r25 = r3
            r28 = r30
            r25.<init>(r26, r28, r30, r32)
            r1.add(r3)
            goto L_0x0114
        L_0x0113:
            r9 = r4
        L_0x0114:
            int r8 = r8 + 1
            r3 = r36
            r4 = r9
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x00c9
        L_0x011f:
            int r3 = r35.getActionMasked()
            r4 = 8
            if (r3 != r4) goto L_0x014d
            r3 = 10
            float r3 = r2.getAxisValue(r3)
            r4 = 9
            float r4 = r2.getAxisValue(r4)
            float r4 = -r4
            r5 = 0
            float r4 = r4 + r5
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r8 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r8 = r8 << r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r10
            long r3 = r3 | r8
            long r3 = androidx.compose.ui.geometry.Offset.e(r3)
            goto L_0x0153
        L_0x014d:
            androidx.compose.ui.geometry.Offset$Companion r3 = androidx.compose.ui.geometry.Offset.f15855b
            long r3 = r3.c()
        L_0x0153:
            android.util.SparseBooleanArray r5 = r0.f16828c
            int r8 = r35.getPointerId(r36)
            r9 = 0
            boolean r17 = r5.get(r8, r9)
            androidx.compose.ui.input.pointer.PointerInputEventData r24 = new androidx.compose.ui.input.pointer.PointerInputEventData
            r5 = r24
            long r8 = r35.getEventTime()
            r23 = 0
            r10 = r13
            r12 = r18
            r14 = r37
            r18 = r1
            r19 = r3
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21, r23)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.d(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    public final void e(int i2) {
        this.f16828c.delete(i2);
        this.f16827b.delete(i2);
    }

    public final long f(int i2) {
        long j2;
        int indexOfKey = this.f16827b.indexOfKey(i2);
        if (indexOfKey >= 0) {
            j2 = this.f16827b.valueAt(indexOfKey);
        } else {
            j2 = this.f16826a;
            this.f16826a = 1 + j2;
            this.f16827b.put(i2, j2);
        }
        return PointerId.a(j2);
    }

    public final boolean g(MotionEvent motionEvent, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (motionEvent.getPointerId(i3) == i2) {
                return true;
            }
        }
        return false;
    }

    public final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f16828c.get(pointerId, false)) {
                this.f16827b.delete(pointerId);
                this.f16828c.delete(pointerId);
            }
        }
        if (this.f16827b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f16827b.size() - 1; -1 < size; size--) {
                int keyAt = this.f16827b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f16827b.removeAt(size);
                    this.f16828c.delete(keyAt);
                }
            }
        }
    }
}
