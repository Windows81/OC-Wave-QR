package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ReceiveContentConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f3216a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public abstract ReceiveContentListener a();

    public final boolean b(TransferableContent transferableContent) {
        return !Intrinsics.d(a().e(transferableContent), transferableContent);
    }
}
