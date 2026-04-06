package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public interface TypefaceResult extends State<Object> {

    @Metadata
    public static final class Async implements TypefaceResult, State<Object> {

        /* renamed from: z  reason: collision with root package name */
        public final AsyncFontListLoader f18775z;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.f18775z = asyncFontListLoader;
        }

        public boolean f() {
            return this.f18775z.h();
        }

        public Object getValue() {
            return this.f18775z.getValue();
        }
    }

    @Metadata
    public static final class Immutable implements TypefaceResult {

        /* renamed from: A  reason: collision with root package name */
        public final boolean f18776A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f18777z;

        public Immutable(Object obj, boolean z2) {
            this.f18777z = obj;
            this.f18776A = z2;
        }

        public boolean f() {
            return this.f18776A;
        }

        public Object getValue() {
            return this.f18777z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Immutable(Object obj, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 & 2) != 0 ? true : z2);
        }
    }

    boolean f();
}
