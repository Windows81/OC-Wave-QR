package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public interface PlatformTextInputSessionScope extends PlatformTextInputSession, CoroutineScope {
}
