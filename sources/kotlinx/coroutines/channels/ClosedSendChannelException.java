package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(String str) {
        super(str);
    }
}
