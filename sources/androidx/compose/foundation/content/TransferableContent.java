package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TransferableContent {

    /* renamed from: a  reason: collision with root package name */
    public final ClipEntry f3203a;

    /* renamed from: b  reason: collision with root package name */
    public final ClipMetadata f3204b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3205c;

    /* renamed from: d  reason: collision with root package name */
    public final PlatformTransferableContent f3206d;

    @JvmInline
    @Metadata
    public static final class Source {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f3207b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f3208c = d(0);

        /* renamed from: d  reason: collision with root package name */
        public static final int f3209d = d(1);

        /* renamed from: e  reason: collision with root package name */
        public static final int f3210e = d(2);

        /* renamed from: a  reason: collision with root package name */
        public final int f3211a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return Source.f3210e;
            }

            public final int b() {
                return Source.f3209d;
            }

            public final int c() {
                return Source.f3208c;
            }

            public Companion() {
            }
        }

        public static int d(int i2) {
            return i2;
        }

        public static boolean e(int i2, Object obj) {
            return (obj instanceof Source) && i2 == ((Source) obj).i();
        }

        public static final boolean f(int i2, int i3) {
            return i2 == i3;
        }

        public static int g(int i2) {
            return Integer.hashCode(i2);
        }

        public static String h(int i2) {
            if (f(i2, f3208c)) {
                return "Source.Keyboard";
            }
            if (f(i2, f3209d)) {
                return "Source.DragAndDrop";
            }
            if (f(i2, f3210e)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f3211a, obj);
        }

        public int hashCode() {
            return g(this.f3211a);
        }

        public final /* synthetic */ int i() {
            return this.f3211a;
        }

        public String toString() {
            return h(this.f3211a);
        }
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, platformTransferableContent);
    }

    public final ClipEntry a() {
        return this.f3203a;
    }

    public TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent) {
        this.f3203a = clipEntry;
        this.f3204b = clipMetadata;
        this.f3205c = i2;
        this.f3206d = platformTransferableContent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipEntry, clipMetadata, i2, (i3 & 8) != 0 ? null : platformTransferableContent, (DefaultConstructorMarker) null);
    }
}
