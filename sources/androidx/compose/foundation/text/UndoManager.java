package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UndoManager {

    /* renamed from: a  reason: collision with root package name */
    public final int f6019a;

    /* renamed from: b  reason: collision with root package name */
    public Entry f6020b;

    /* renamed from: c  reason: collision with root package name */
    public Entry f6021c;

    /* renamed from: d  reason: collision with root package name */
    public int f6022d;

    /* renamed from: e  reason: collision with root package name */
    public Long f6023e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6024f;

    @Metadata
    public static final class Entry {

        /* renamed from: a  reason: collision with root package name */
        public Entry f6025a;

        /* renamed from: b  reason: collision with root package name */
        public TextFieldValue f6026b;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.f6025a = entry;
            this.f6026b = textFieldValue;
        }

        public final Entry a() {
            return this.f6025a;
        }

        public final TextFieldValue b() {
            return this.f6026b;
        }

        public final void c(Entry entry) {
            this.f6025a = entry;
        }

        public final void d(TextFieldValue textFieldValue) {
            this.f6026b = textFieldValue;
        }
    }

    public UndoManager(int i2) {
        this.f6019a = i2;
    }

    public static /* synthetic */ void f(UndoManager undoManager, TextFieldValue textFieldValue, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = UndoManager_jvmKt.a();
        }
        undoManager.e(textFieldValue, j2);
    }

    public final void a() {
        this.f6024f = true;
    }

    public final void b(TextFieldValue textFieldValue) {
        TextFieldValue b2;
        this.f6024f = false;
        Entry entry = this.f6020b;
        if (!Intrinsics.d(textFieldValue, entry != null ? entry.b() : null)) {
            String i2 = textFieldValue.i();
            Entry entry2 = this.f6020b;
            if (Intrinsics.d(i2, (entry2 == null || (b2 = entry2.b()) == null) ? null : b2.i())) {
                Entry entry3 = this.f6020b;
                if (entry3 != null) {
                    entry3.d(textFieldValue);
                    return;
                }
                return;
            }
            this.f6020b = new Entry(this.f6020b, textFieldValue);
            this.f6021c = null;
            int length = this.f6022d + textFieldValue.i().length();
            this.f6022d = length;
            if (length > this.f6019a) {
                d();
            }
        }
    }

    public final TextFieldValue c() {
        Entry entry = this.f6021c;
        if (entry == null) {
            return null;
        }
        this.f6021c = entry.a();
        this.f6020b = new Entry(this.f6020b, entry.b());
        this.f6022d += entry.b().i().length();
        return entry.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f6020b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.a()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.a()
            if (r2 == 0) goto L_0x001b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.a()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.a()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.c(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.d():void");
    }

    public final void e(TextFieldValue textFieldValue, long j2) {
        if (!this.f6024f) {
            Long l2 = this.f6023e;
            if (j2 <= (l2 != null ? l2.longValue() : 0) + ((long) UndoManagerKt.a())) {
                return;
            }
        }
        this.f6023e = Long.valueOf(j2);
        b(textFieldValue);
    }

    public final TextFieldValue g() {
        Entry a2;
        Entry entry = this.f6020b;
        if (entry == null || (a2 = entry.a()) == null) {
            return null;
        }
        this.f6020b = a2;
        this.f6022d -= entry.b().i().length();
        this.f6021c = new Entry(this.f6021c, entry.b());
        return a2.b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UndoManager(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 100000 : i2);
    }
}
