package androidx.activity.compose;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 f134z = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    public ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
