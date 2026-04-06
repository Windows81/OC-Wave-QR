package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface PlatformTextInputInterceptor {
    Object a(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSession platformTextInputSession, Continuation continuation);
}
