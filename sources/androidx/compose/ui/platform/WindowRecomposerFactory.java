package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public interface WindowRecomposerFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f17929a = Companion.f17930a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f17930a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final WindowRecomposerFactory f17931b = new M();

        public static final Recomposer b(View view) {
            return WindowRecomposer_androidKt.c(view, (CoroutineContext) null, (Lifecycle) null, 3, (Object) null);
        }

        public final WindowRecomposerFactory c() {
            return f17931b;
        }
    }

    Recomposer a(View view);
}
