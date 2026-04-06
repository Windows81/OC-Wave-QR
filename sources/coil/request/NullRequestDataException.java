package coil.request;

import kotlin.Metadata;

@Metadata
public final class NullRequestDataException extends RuntimeException {
    public NullRequestDataException() {
        super("The request's data is null.");
    }
}
