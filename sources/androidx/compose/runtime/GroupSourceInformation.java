package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupSourceInformation {

    /* renamed from: a  reason: collision with root package name */
    public final int f14674a;

    /* renamed from: b  reason: collision with root package name */
    public String f14675b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14676c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f14677d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14678e;

    /* renamed from: f  reason: collision with root package name */
    public int f14679f;

    public final void a(Object obj) {
        ArrayList arrayList = this.f14677d;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f14677d = arrayList;
        arrayList.add(obj);
    }

    public final void b(SlotWriter slotWriter, int i2, int i3) {
        Anchor n1;
        ArrayList arrayList = this.f14677d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f14677d = arrayList;
        }
        int i4 = 0;
        if (i2 >= 0 && (n1 = slotWriter.n1(i2)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                Object obj = arrayList.get(i4);
                if (Intrinsics.d(obj, n1) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).i(n1))) {
                    break;
                }
                i4++;
            }
        }
        arrayList.add(i4, slotWriter.B(i3));
    }

    public final boolean c() {
        return this.f14678e;
    }

    public final int d() {
        return this.f14679f;
    }

    public final int e() {
        return this.f14676c;
    }

    public final ArrayList f() {
        return this.f14677d;
    }

    public final int g() {
        return this.f14674a;
    }

    public final String h() {
        return this.f14675b;
    }

    public final boolean i(Anchor anchor) {
        ArrayList arrayList = this.f14677d;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if (Intrinsics.d(obj, anchor) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).i(anchor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.GroupSourceInformation j() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f14677d
            r1 = 0
            if (r0 == 0) goto L_0x0020
            int r2 = r0.size()
            int r2 = r2 + -1
        L_0x000b:
            if (r2 < 0) goto L_0x0020
            java.lang.Object r3 = r0.get(r2)
            boolean r4 = r3 instanceof androidx.compose.runtime.GroupSourceInformation
            if (r4 == 0) goto L_0x001d
            r4 = r3
            androidx.compose.runtime.GroupSourceInformation r4 = (androidx.compose.runtime.GroupSourceInformation) r4
            boolean r4 = r4.f14678e
            if (r4 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            int r2 = r2 + -1
            goto L_0x000b
        L_0x0020:
            r3 = r1
        L_0x0021:
            boolean r0 = r3 instanceof androidx.compose.runtime.GroupSourceInformation
            if (r0 == 0) goto L_0x0028
            r1 = r3
            androidx.compose.runtime.GroupSourceInformation r1 = (androidx.compose.runtime.GroupSourceInformation) r1
        L_0x0028:
            if (r1 == 0) goto L_0x0031
            androidx.compose.runtime.GroupSourceInformation r0 = r1.j()
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r5
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.GroupSourceInformation.j():androidx.compose.runtime.GroupSourceInformation");
    }

    public final boolean k(Anchor anchor) {
        ArrayList arrayList = this.f14677d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.d(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).k(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f14677d = null;
                return false;
            }
        }
        return true;
    }

    public final void l(SlotTable slotTable, int i2) {
        j().a(slotTable.e(i2));
    }

    public final void m(SlotWriter slotWriter, int i2) {
        j().a(slotWriter.B(i2));
    }
}
